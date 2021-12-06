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
import java.util.List;

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
import org.smartdbe.common.smartmdsdwrapper.AttributeInfo;
import org.smartdbe.common.smartmdsdwrapper.CommObjectInfo;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString;
import org.smartts.dsl.console.SmartTSConsole;

@XmlRootElement(name = "CommObjectTestSetContainer")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommObjectTestSetContainer {
	@XmlElement(name = "TestEntityName")
	public String TestEntityName;
	@XmlElement(name = "TestSetFileName")
	public String TestSetFileName;
	@XmlElement(name = "TestDataFileName")
	public String TestDataFileName;
	@XmlElement(name = "isDefault")
	public boolean isDefault = false;
	@XmlElement(name = "isCustom")
	public boolean isCustom = false;
	@XmlElement(name = "isCustomX")
	public boolean isCustomX = false;
	@XmlElement(name = "isImport")
	public boolean isImport = false;
	@XmlElement(name = "ImportSourceRepository")
	public String ImportSourceRepository;
	@XmlElement(name = "isLocal")
	public boolean isLocal = false;
	@XmlElement(name = "isEnum")
	public boolean isEnum = false;
	@XmlElement(name = "isPrimitive")
	public boolean isPrimitive = false;
	@XmlElement(name = "isNonPrimitive")
	public boolean isNonPrimitive = false;
	@XmlElement(name = "isArray")
	public boolean isArray = false;
	@XmlElement(name = "isNonPrimitiveArray")
	public boolean isNonPrimitiveArray = false;
	@XmlElement(name = "TestSetBuilder_Tags_NonPrimitiveArray")
	public List<String> TestSetBuilder_Tags_NonPrimitiveArray = new ArrayList<String>();
	@XmlElement(name = "ZeroSizeArrayError")
	public boolean ZeroSizeArrayError = false;
	@XmlElement(name = "isInvalid")
	public boolean isInvalid = false;
	@XmlElement(name = "LogString")
	public String LogString = "";
	@XmlElement(name = "NotAvailableIdentifier")
	public String NotAvailableIdentifier = "Not Available";
	@XmlElement(name = "CommObjectInfo")
	public String CommObjectInfo;
	@XmlElement(name = "AttributeInfo")
	public String AttributeInfo;
	@XmlElement(name = "TestData")
	public String TestData;
	@XmlElement(name = "TestSet")
	List<List<String>> TestSet = new ArrayList<List<String>>();

	@XmlElement(name = "verbosCompileDefault")
	private static boolean verbosCompileDefault = false;
	@XmlElement(name = "verbosCompile")
	public static boolean verbosCompile = verbosCompileDefault;

	public static void reset_verbosCompile() {
		verbosCompile = verbosCompileDefault;
	}

	public CommObjectTestSetContainer() {
	}

	public CommObjectTestSetContainer(IFile TestDataFile, CommObjectInfo coi, AttributeInfo ai) {
		CommObjectInfo = coi.toString();
		AttributeInfo = ai.toString();
		Init(TestDataFile);
	}

	public CommObjectTestSetContainer(IFile TestDataFile, CommObjectInfo coi) {
		CommObjectInfo = coi.toString();
		AttributeInfo = NotAvailableIdentifier;
		Init(TestDataFile);
	}

	public CommObjectTestSetContainer(IFile TestDataFile) {
		CommObjectInfo = NotAvailableIdentifier;
		AttributeInfo = NotAvailableIdentifier;
		Init(TestDataFile);
	}

	private void Init(IFile TestDataFile) {
		IO io = new IO();
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
		isDefault = TestDataFileName.contains(TSDef.DataDefaultFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
		isCustom = TestDataFileName.contains(TSDef.DataCustomFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
		isCustomX = TestDataFileName.contains(TSDef.DataCustomFileInsert)
				&& TestDataFileName.contains(TSDef.ServiceRepoTestDataFileNamePostfix);
		if (isCustom)
			isCustomX = false;
		isImport = TestData.contains(TSDef.TestSetImportIndicator);
		ImportSourceRepository = NotAvailableIdentifier;
		isLocal = TestData.contains(TSDef.TestSetLocalIndicator);
		isEnum = TestData.contains(TSDef.TestSetEnumIndicator);
		isPrimitive = TestData.contains(TSDef.TestSetPrimitiveIndicator);
		isNonPrimitive = TestData.contains(TSDef.TestSetNonPrimitiveIndicator);
		isArray = TestData.contains(TSDef.TestSetArrayIndicator);
		isNonPrimitiveArray = TestData.contains(TSDef.TestSetNonPrimitiveArrayIndicator);
		String TestSetBuilder_Tags_NonPrimitiveArray_String = cStr.cutFromNextTo(TestData,
				TSDef.TestSetNonPrimitiveArrayIndicator + ",", "\n", true);
		TestSetBuilder_Tags_NonPrimitiveArray = cStr.Row2V(TestSetBuilder_Tags_NonPrimitiveArray_String);
		ZeroSizeArrayError = TestData.contains(TSDef.ErrorStringZeroArraySize);

		if (isImport) {
			String tmp = cStr.cutFromNextTo(TestDataFileName, TSDef.ImportedPrefix, TSDef.TestSetNameSpacer, true);
			if (tmp.isBlank() || tmp.isEmpty() || tmp == null) {
				isInvalid = true;
				ImportSourceRepository = "ERROR_ImportSourceRepository";
			} else {
				ImportSourceRepository = tmp;
			}
		}

		TestEntityName = cStr.cutFromNextTo(TestData, TSDef.TestEntityNameIndicator, "\n", true);
		TestSetFileName = TestEntityName + TSDef.ErrorNoDataFound + TSDef.ServiceRepoTestSetsFileNamePostfix;
		if (isDefault) {
			TestSetFileName = TestEntityName + "_" + TSDef.DataDefaultFileInsert
					+ TSDef.ServiceRepoTestSetsFileNamePostfix;
		}
		if (isCustom) {
			TestSetFileName = TestEntityName + "_" + TSDef.DataCustomFileInsert
					+ TSDef.ServiceRepoTestSetsFileNamePostfix;
		}
		if (isCustomX) {
			String SetName = cStr.cutFromNextTo(TestDataFileName, TSDef.DataCustomFileInsert,
					TSDef.ServiceRepoTestDataFileNamePostfix, true);
			TestSetFileName = TestEntityName + "_" + TSDef.DataCustomFileInsert + SetName
					+ TSDef.ServiceRepoTestSetsFileNamePostfix;
		}
		if (isDefault && isCustom)
			isInvalid = true;
		if (isImport && isLocal)
			isInvalid = true;
		if (isEnum && (isPrimitive || isNonPrimitive))
			isInvalid = true;
		if (isPrimitive && isNonPrimitive)
			isInvalid = true;
		if (isNonPrimitiveArray && (!isArray))
			isInvalid = true;
		if (isNonPrimitiveArray && (TestSetBuilder_Tags_NonPrimitiveArray.size() < 2))
			isInvalid = true;
		if (ZeroSizeArrayError)
			isInvalid = true;
		String Log2Print = Header + FlagString();
		LogString = Log2Print;
		if (verbosCompile)
			SmartTSout.println(Log2Print);

		if (!isInvalid) {
			if (isPrimitive) {
				String datasection = cStr.cutFromTo(TestData, TSDef.TestSetDataSTART, TSDef.TestSetDataEND, true);
				datasection = WikiRemoved(datasection);
				TestSet = cStr.CSV2V(datasection.trim());
			}
			if (isEnum) {
				String datasection = cStr.cutFromTo(TestData, TSDef.TestSetDataSTART, TSDef.TestSetDataEND, true);
				datasection = WikiRemoved(datasection);
				TestSet = cStr.CSV2V(datasection.trim());
			}
		}
		if (verbosCompile)
			SmartTSout.println(Header + "OUT");
	}

	public String WikiRemoved(String S) {
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		while (true) {
			String Pre = cStr.cutTo(S, "," + TSDef.TestSetWikiSTART, true);
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
		if (isDefault)
			out = out + "isDefault ";
		if (isCustom)
			out = out + "isCustom ";
		if (isCustomX)
			out = out + "isCustomX ";
		if (isImport)
			out = out + "isImport [" + ImportSourceRepository + "] ";
		if (isLocal)
			out = out + "isLocal ";
		if (isEnum)
			out = out + "isEnum ";
		if (isPrimitive)
			out = out + "isPrimitive ";
		if (isNonPrimitive)
			out = out + "isNonPrimitive ";
		if (isArray)
			out = out + "isArray ";
		if (isNonPrimitiveArray) {
			if (TestSetBuilder_Tags_NonPrimitiveArray.size() < 2) {
				out = out + "isNonPrimitiveArray [Error: TestSetBuilder_Tags less than 2]";
			} else {
				out = out + "isNonPrimitiveArray" + TestSetBuilder_Tags_NonPrimitiveArray;
			}
		}
		if (ZeroSizeArrayError)
			out = out + "ZeroSizeArrayError ";
		if (isInvalid)
			out = out + "| XXXX isInvalid ";
		else
			out = out + "| isValid ";
		return out;
	}

	public String getSetName() {
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		if (isDefault) {
			return TSDef.DataDefaultFileInsert;
		}
		if (isCustom) {
			return TSDef.DataCustomFileInsert;
		}
		if (isCustomX) {
			String SetName = cStr.cutFromNextTo(TestDataFileName, TSDef.DataCustomFileInsert,
					TSDef.ServiceRepoTestDataFileNamePostfix, true);
			return TSDef.DataCustomFileInsert + SetName;
		}
		return TSDef.DSLERROR;
	}

	static public CommObjectTestSetContainer XMLString2CommObjectTestSetContainer(String XML) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CommObjectTestSetContainer.class.getPackageName(),
					CommObjectTestSetContainer.class.getClassLoader());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader stringReader = new StringReader(XML);
			CommObjectTestSetContainer CTS = new CommObjectTestSetContainer();
			CTS = (CommObjectTestSetContainer) jaxbUnmarshaller.unmarshal(stringReader);
			return CTS;
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout.println("ERROR @ CommObjectTestSetContainer::XMLString2CommObjectTestSetContainer");
		}
		return null;
	}

	static public String CommObjectTestSetContainer2XMLString(CommObjectTestSetContainer CTS) {
		java.io.StringWriter stringWriter = new StringWriter();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CommObjectTestSetContainer.class.getPackageName(),
					CommObjectTestSetContainer.class.getClassLoader());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(CTS, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout.println(
					"ERROR @ CommObjectTestSetContainer::CommObjectTestSetContainer2XMLString:" + CTS.TestEntityName);
			e.printStackTrace();
			return null;
		}
	}
}
