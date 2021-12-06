//================================================================
//
//  Copyright (c) 2021 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
//
//        Servicerobotik Ulm 
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//	  http://www.servicerobotik-ulm.de/
//
//  This file is part of the Smart Test Suite (SmartTS) extension 
//  for SmartMDSD Toolchain.
//
//  Author:
//		Vineet Nagrath
//
//  Licence:
//
//  BSD 3-Clause License
//  
//  Copyright (c) 2021, Servicerobotics Ulm
//  All rights reserved.
//  
//  Redistribution and use in source and binary forms, with or without
//  modification, are permitted provided that the following conditions are met:
//  
//  * Redistributions of source code must retain the above copyright notice, this
//    list of conditions and the following disclaimer.
//  
//  * Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
//  
//  * Neither the name of the copyright holder nor the names of its
//    contributors may be used to endorse or promote products derived from
//    this software without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
//  FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
//  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
//  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
//  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
//  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
//  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//  https://opensource.org/licenses/BSD-3-Clause
//
//================================================================
package org.smartts.common.testsetcontainers;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.core.resources.IFile;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.ServiceInfo;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString;
import org.smartts.dsl.console.SmartTSConsole;

@XmlRootElement(name = "ServiceTestSetContainer")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceTestSetContainer {
	@XmlElement(name = "TestEntityName")
	public String TestEntityName;
	@XmlElement(name = "TestSetFileName")
	public String TestSetFileName;
	@XmlElement(name = "TestDataFileName")
	public String TestDataFileName;
	@XmlElement(name = "ServiceName")
	public String ServiceName;
	@XmlElement(name = "ServiceType")
	public String ServiceType;
	@XmlElement(name = "PatternType")
	public String PatternType;
	@XmlElement(name = "CommObjectList")
	public List<String> CommObjectList = new ArrayList<>();
	@XmlElement(name = "OneOfTheCurrentlyHandledServicePattern")
	public Boolean OneOfTheCurrentlyHandledServicePattern;
	@XmlElement(name = "isInvalid")
	public boolean isInvalid = false;
	@XmlElement(name = "LogString")
	public String LogString = "";
	@XmlElement(name = "NotAvailableIdentifier")
	public String NotAvailableIdentifier = "Not Available";
	@XmlElement(name = "ServiceInfo")
	public String ServiceInfo;
	@XmlElement(name = "TestData")
	public String TestData;
	@XmlElement(name = "TestSetSeed")
	public List<TestSetSeedContainer> TestSetSeed;
	@XmlElement(name = "TestSet")
	public Map<String, List<List<String>>> TestSet;
	@XmlElement(name = "TestSetHeader")
	public Map<String, List<String>> TestSetHeader;

	@XmlElement(name = "verbosCompileDefault")
	private static boolean verbosCompileDefault = false;
	@XmlElement(name = "verbosCompile")
	public static boolean verbosCompile = verbosCompileDefault;

	public static void reset_verbosCompile() {
		verbosCompile = verbosCompileDefault;
	}

	public ServiceTestSetContainer() {
	}

	public ServiceTestSetContainer(IFile TestDataFile, ServiceInfo si) {
		ServiceInfo = si.toString();
		Init(TestDataFile);
	}

	public ServiceTestSetContainer(IFile TestDataFile) {
		ServiceInfo = NotAvailableIdentifier;
		Init(TestDataFile);
	}

	private void Init(IFile TestDataFile) {
		IO io = new IO();
		TestSetSeed = new ArrayList<TestSetSeedContainer>();
		TestSet = new HashMap<String, List<List<String>>>();
		TestSetHeader = new HashMap<String, List<String>>();
		TestData = io.FilePath2String(TestDataFile);
		TestDataFileName = TestDataFile.getName();
		Compile();
	}

	private void Compile() {
		String Spacer = " | ";
		String Header = "Test Data -Compile-> Test Set" + Spacer + TestDataFileName + Spacer;
		TSDefine TSDef = new TSDefine();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		cutString cStr = new cutString();
		if (verbosCompile)
			SmartTSout.println(Header + "IN");

		TestEntityName = cStr.cutFromNextTo(TestData, TSDef.TestEntityNameIndicator, "\n", true);
		TestSetFileName = TestEntityName + TSDef.ServiceRepoTestSetsFileNamePostfix;
		ServiceName = cStr.cutFromNextTo(TestData, TSDef.ServiceNameIndicator, "\n", true);
		ServiceType = cStr.cutFromNextTo(TestData, TSDef.ServiceTypeIndicator, "\n", true);
		PatternType = cStr.cutFromNextTo(TestData, TSDef.ServicePatternIndicator, "\n", true);

		String Log2Print = "";

		for (String CommObjectCandidate : TSDef.CommObjectValidList) {
			String TestSetLocator = TSDef.TestSetDataSTART + "," + TSDef.addBracket(CommObjectCandidate);
			if (TestData.contains(TestSetLocator)) {
				CommObjectList.add(CommObjectCandidate);
				String newSeedStringCSV = cStr.cutFromNextTo(TestData, TestSetLocator, TSDef.TestSetDataEND, true);
				newSeedStringCSV = WikiRemoved(newSeedStringCSV);
				newSeedStringCSV = newSeedStringCSV.trim();
				List<List<String>> newSeedStringV = cStr.CSV2V(newSeedStringCSV);
				for (List<String> row : newSeedStringV) {
					TestSetSeedContainer newSeed = new TestSetSeedContainer();
					newSeed.ServiceRepo = row.get(0);
					newSeed.CommObject = row.get(1);
					newSeed.TestSetBuilder = row.get(2);
					newSeed.SetName = row.get(3);
					newSeed.Switch = row.get(4);
					if (newSeed.Switch.equals(TSDef.DataSelectON)) {
						newSeed.isSwitchedOn = true;
					} else {
						if (newSeed.Switch.equals(TSDef.DataSelectOFF)) {
							newSeed.isSwitchedOn = false;
						} else {
							newSeed.isSwitchedOn = false;
							isInvalid = true;
							Log2Print = Log2Print + Header + "XXXX  ERROR isSwitchedOn " + TSDef.SyntaxError + "Found:"
									+ newSeed.Switch + "\n";
						}
					}
					newSeed.LinkedTo = CommObjectCandidate;
					TestSetSeed.add(newSeed);
					List<List<String>> testset = TestSetSeedContainer.setDefaultTestSet();
					List<String> testsetheader = TestSetSeedContainer.setDefaultTestSetHeader();
					TestSet.put(newSeed.keyString(), testset);
					TestSetHeader.put(newSeed.keyString(), testsetheader);

					if (!(newSeed.SetName.equals(TSDef.DataDefaultFileInsert)
							|| (newSeed.SetName.equals(TSDef.DataCustomFileInsert)))) {
						Log2Print = Log2Print + Header + "WWWW  SetName " + "Found:" + newSeed.SetName + "\n";
					}
				}
			}
		}

		String tmp = cStr.cutFromNextTo(TestData, TSDef.OneOfTheCurrentlyHandledServicePatternIndicator, "\n", true);
		if (tmp.equals("true")) {
			OneOfTheCurrentlyHandledServicePattern = true;
		} else {
			if (tmp.equals("false")) {
				OneOfTheCurrentlyHandledServicePattern = false;
				Log2Print = Log2Print + Header
						+ "XXXX  WARNING Service is NOT-OneOfTheCurrentlyHandledServicePattern\n";
			} else {
				OneOfTheCurrentlyHandledServicePattern = false;
				Log2Print = Log2Print + Header + "XXXX  WARNING IS-OneOfTheCurrentlyHandledServicePattern "
						+ TSDef.SyntaxError + "Found:" + tmp + "\n";
			}
		}

		if (OneOfTheCurrentlyHandledServicePattern) {
			if (!TSDef.isValidServicePatternPair(ServiceType, PatternType)) {
				isInvalid = true;
				Log2Print = Log2Print + Header + "XXXX  ERROR isValidServicePatternPair " + TSDef.SyntaxError + "Found:"
						+ ServiceName + "::" + PatternType + "\n";
			}

			if (CommObjectList.isEmpty()) {
				isInvalid = true;
				Log2Print = Log2Print + Header + "XXXX  ERROR CommObjectList.isEmpty() " + TSDef.SyntaxError + "\n";
			} else {
				for (String CommObject : CommObjectList) {
					if (!TSDef.isValidPatternCommObjPair(PatternType, CommObject)) {
						isInvalid = true;
						Log2Print = Log2Print + Header + "XXXX  ERROR isValidPatternCommObjPair " + TSDef.SyntaxError
								+ "Found:" + PatternType + "::" + CommObject + "\n";
					}
					if (!TSDef.isValidServicePatternCommObjectSet(ServiceType, PatternType, CommObject)) {
						isInvalid = true;
						Log2Print = Log2Print + Header + "XXXX  ERROR isValidServicePatternCommObjectSet "
								+ TSDef.SyntaxError + "Found:" + ServiceType + "::" + PatternType + "::" + CommObject
								+ "\n";
					}
				}
			}
		}

		Log2Print = Log2Print + Header + FlagString();

		LogString = Log2Print;
		if (verbosCompile)
			SmartTSout.println(Log2Print);

		if (verbosCompile)
			SmartTSout.println(Header + "OUT");
	}

	public String WikiRemoved(String S) {
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		while (true) {
			String Pre = cStr.cutTo(S, TSDef.TestSetWikiSTART, true);
			String Post = cStr.cutFrom(S, TSDef.TestSetWikiEND, true);
			if (Pre.equals(cStr.DefaultOut) || Post.equals(cStr.DefaultOut)) {
				break;
			}
			S = Pre + Post;
		}
		return S;
	}

	public String FlagString() {
		String out = "";
		if (OneOfTheCurrentlyHandledServicePattern)
			out = out + "| IS-OneOfTheCurrentlyHandledServicePattern ";
		else
			out = out + "| XXXX NOT-OneOfTheCurrentlyHandledServicePattern ";
		if (isInvalid)
			out = out + "| XXXX isInvalid ";
		else
			out = out + "| isValid ";
		return out;
	}

	public String getDataTypeTestSetFileName(String DataType) {
		TSDefine TSDef = new TSDefine();
		return TestEntityName + "_" + DataType + TSDef.ServiceRepoTestSetsFileNamePostfix;
	}

	static public ServiceTestSetContainer XMLString2ServiceTestSetContainer(String XML) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ServiceTestSetContainer.class.getPackageName(),
					ServiceTestSetContainer.class.getClassLoader());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader stringReader = new StringReader(XML);
			ServiceTestSetContainer STS = new ServiceTestSetContainer();
			STS = (ServiceTestSetContainer) jaxbUnmarshaller.unmarshal(stringReader);
			return STS;
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout.println("ERROR @ ServiceTestSetContainer::XMLString2ServiceTestSetContainer");
		}
		return null;
	}

	static public String ServiceTestSetContainer2XMLString(ServiceTestSetContainer STS) {
		java.io.StringWriter stringWriter = new StringWriter();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ServiceTestSetContainer.class.getPackageName(),
					ServiceTestSetContainer.class.getClassLoader());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(STS, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout.println(
					"ERROR @ ServiceTestSetContainer::ServiceTestSetContainer2XMLString:" + STS.TestEntityName);
			e.printStackTrace();
			return null;
		}
	}
}
