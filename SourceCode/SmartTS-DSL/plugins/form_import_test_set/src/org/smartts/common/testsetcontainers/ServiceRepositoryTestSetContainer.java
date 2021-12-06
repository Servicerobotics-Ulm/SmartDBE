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

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.CommObjectInfo;
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.ServiceRepoInfo;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString;
import org.smartts.dsl.console.SmartTSConsole;

@XmlRootElement(name = "ServiceRepositoryTestSetContainer")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRepositoryTestSetContainer {
	@XmlElement(name = "ServiceRepositoryName")
	public String ServiceRepositoryName;
	@XmlElement(name = "CommObjectTestSets")
	private List<CommObjectTestSetContainer> CommObjectTestSets = new ArrayList<>();
	@XmlElement(name = "ServiceTestSets")
	private List<ServiceTestSetContainer> ServiceTestSets = new ArrayList<>();
	@XmlElement(name = "LogString")
	public String LogString = "";
	@XmlElement(name = "LogString")
	public String LogERROR_NO_DATA_FOUND = "";
	@XmlElement(name = "errorVarcase")
	public boolean errorVarcase;
	@XmlElement(name = "LogVarcase")
	public String LogVarcase = "";
	@XmlElement(name = "ErrorLogVarcase")
	public String ErrorLogVarcase = "";

	@XmlElement(name = "verbosTestSetBuilderDefault")
	private static boolean verbosTestSetBuilderDefault = false;
	@XmlElement(name = "verbosTestSetBuilder")
	public static boolean verbosTestSetBuilder = verbosTestSetBuilderDefault;

	public static void reset_verbosTestSetBuilder() {
		verbosTestSetBuilder = verbosTestSetBuilderDefault;
	}

	public ServiceRepositoryTestSetContainer() {
		errorVarcase = false;
	}

	public boolean addNewCommObjectTestSet(CommObjectTestSetContainer candidate) {
		for (CommObjectTestSetContainer item : CommObjectTestSets) {
			if (candidate.TestSetFileName.equals(item.TestSetFileName))
				return false;
		}
		CommObjectTestSets.add(candidate);
		return true;
	}

	public boolean addNewServiceTestSet(ServiceTestSetContainer candidate) {
		for (ServiceTestSetContainer item : ServiceTestSets) {
			if (candidate.TestSetFileName.equals(item.TestSetFileName))
				return false;
		}
		ServiceTestSets.add(candidate);
		return true;
	}

	public boolean RunTestSetBuilder() {
		String Spacer = " | ";
		String Header = "Test Set Builder" + Spacer + ServiceRepositoryName + Spacer;
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		String Log2Print = "";
		if (verbosTestSetBuilder)
			SmartTSout.println(Header + "IN");

		for (ServiceTestSetContainer serviceTS : ServiceTestSets) {
			for (String testsetkey : serviceTS.TestSet.keySet()) {
				List<List<String>> testset = serviceTS.TestSet.get(testsetkey);
				List<String> testsetheader = serviceTS.TestSetHeader.get(testsetkey);
				if ((testset != null) && TestSetSeedContainer.isDefaultTestSet(testset) && (testsetheader != null)
						&& TestSetSeedContainer.isDefaultTestSetHeader(testsetheader)) {
					String commobj = cStr.cutTo(testsetkey, TSDef.TestSetBuilder_KeyNameSpacer, true);
					String TestSetName = cStr.cutFrom(testsetkey, TSDef.TestSetBuilder_KeyNameSpacer, true);
					for (TestSetSeedContainer seed : serviceTS.TestSetSeed) {
						if (seed.isSwitchedOn && seed.LinkedTo.equals(commobj) && seed.SetName.equals(TestSetName)) {
							if (verbosTestSetBuilder)
								SmartTSout.lineTag("dd", seed.keyString());
							List<String> ProcessedTSHeader = RunTestSetBuilder_Header_ProcessSeed(seed);
							Map<String, Map<String, String>> HeaderMetaMap = RunTestSetBuilder_ProcessHeaders(
									ProcessedTSHeader);
							if ((HeaderMetaMap == null) || (HeaderMetaMap.isEmpty())) {
								Log2Print = Log2Print + Header
										+ "XXXX Error... RunTestSetBuilder_ProcessHeaders Output Null or Empty !!\n";
								return false;
							}
							Map<String, Map<String, String>> HeaderMetaMapVarCaseExpanded = RunTestSetBuilder_VarCaseExpand(
									HeaderMetaMap, TestSetName);
							if ((HeaderMetaMapVarCaseExpanded == null) || (HeaderMetaMapVarCaseExpanded.isEmpty())) {
								Log2Print = Log2Print + Header
										+ "XXXX Error... RunTestSetBuilder_VarCaseExpand Output Null or Empty !!\n";
								return false;
							}
							List<List<String>> newtestsetentry = RunTestSetBuilder_HeaderMetaMap(
									HeaderMetaMapVarCaseExpanded, TestSetName);
							if ((newtestsetentry == null) || (newtestsetentry.isEmpty())) {
								Log2Print = Log2Print + Header
										+ "XXXX Error... RunTestSetBuilder_HeaderMetaMap Output Null or Empty !!\n";
								return false;
							}
							List<List<String>> sortednewtestsetentry = sortbyTestSetHeader(newtestsetentry);
							if ((sortednewtestsetentry == null) || (sortednewtestsetentry.isEmpty())) {
								Log2Print = Log2Print + Header
										+ "XXXX Error... sortbyTestSetHeader Output Null or Empty !!\n";
								return false;
							}
							serviceTS.TestSet.replace(testsetkey, sortednewtestsetentry);
							serviceTS.TestSetHeader.replace(testsetkey,
									getTestSetHeader(serviceTS.TestSet.get(testsetkey)));
						}
					}
				} else {
					Log2Print = Log2Print + Header + "XXXX Error... TestSet wrong initialization !!\n";
					if (testset == null)
						Log2Print = Log2Print + Header + "XXXX Error... TESTSET Found: NULL\n";
					if (TestSetSeedContainer.isDefaultTestSet(testset))
						Log2Print = Log2Print + Header + "XXXX Error... TESTSET Found: " + testset.toString() + "\n";
					if (testsetheader == null)
						Log2Print = Log2Print + Header + "XXXX Error... TESTSETHEADER Found: NULL\n";
					if (TestSetSeedContainer.isDefaultTestSetHeader(testsetheader))
						Log2Print = Log2Print + Header + "XXXX Error... TESTSETHEADER Found: "
								+ testsetheader.toString() + "\n";
					return false;
				}
			}
		}
		LogString = Log2Print;
		if (verbosTestSetBuilder)
			SmartTSout.println(Log2Print);

		if (verbosTestSetBuilder)
			SmartTSout.println(Header + "OUT");
		return true;
	}

	static public int TestSetHeaderIndex = 0;

	private List<List<String>> sortbyTestSetHeader(List<List<String>> List) {
		List<List<String>> sorted = new ArrayList<List<String>>();
		List<String> headers = getTestSetHeader(List);
		headers.sort(Comparator.naturalOrder());
		for (String sortedheader : headers) {
			for (List<String> row : List) {
				String header = row.get(TestSetHeaderIndex);
				if (header.equals(sortedheader)) {
					sorted.add(row);
					break;
				}
			}
		}
		return sorted;
	}

	private List<String> getTestSetHeader(List<List<String>> TestSet) {
		return getTestSetColumn(TestSet, TestSetHeaderIndex);
	}

	public List<String> getTestSetColumn(List<List<String>> TestSet, int columnindex) {
		List<String> column = new ArrayList<String>();
		for (List<String> entry : TestSet) {
			column.add(entry.get(columnindex));
		}
		return column;
	}

	private List<String> RunTestSetBuilder_Header_ProcessSeed(TestSetSeedContainer seed) {
		return RunTestSetBuilder_Header_ProcessSeed(seed, true);
	}

	private List<String> RunTestSetBuilder_Header_ProcessSeed(TestSetSeedContainer seed, boolean display) {
		String Spacer = " | ";
		String Header = "Test Set Builder" + Spacer + ServiceRepositoryName + Spacer + "Processing Seed Header | "
				+ seed.keyString() + Spacer;
		TSDefine TSDef = new TSDefine();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		if (verbosTestSetBuilder && display)
			SmartTSout.println(Header + "IN");
		List<String> testsetheader = new ArrayList<String>();
		List<String> truetestsetheader = new ArrayList<String>();
		if (seed.ServiceRepo.equals(ServiceRepositoryName)) {
			for (CommObjectTestSetContainer cots : CommObjectTestSets) {
				testsetheader.addAll(RunTestSetBuilder_Header_ProcessSeedSUB(seed, cots, display));
			}
		} else {
			List<CommObjectTestSetContainer> cotsSET = ImportCommObjectTestSetContainerSET(seed);
			if (cotsSET.isEmpty()) {
				if (display) {
					SmartTSout.println("XXXX ERROR opening TestSetSeedContainer: " + seed.toString());
				}
			} else {
				if (display) {
					SmartTSout.println("Opening TestSetSeedContainer: " + seed.toString());
				}
				for (CommObjectTestSetContainer cots : cotsSET) {
					testsetheader.addAll(RunTestSetBuilder_Header_ProcessSeedSUB(seed, cots, display));
				}
			}
		}

		for (String h : testsetheader) {
			if (display) {
				SmartTSout.println("Header Entry: " + h);
			}
		}

		Map<String, Map<String, String>> HeaderMetaMap = RunTestSetBuilder_ProcessHeaders(testsetheader, true);

		for (String every : testsetheader) {
			boolean isPremitive = HeaderMetaMap.get(every).get("isPremitive").equals(true + "");
			boolean isImport = HeaderMetaMap.get(every).get("isImport").equals(true + "");
			String HEADER = HeaderMetaMap.get(every).get("HEADER");
			String ImportTree = HeaderMetaMap.get(every).get("ImportTree");
			String ImportRepo = HeaderMetaMap.get(every).get("ImportRepo");
			String AttributeType = HeaderMetaMap.get(every).get("AttributeType");
			String LocalRepo = HeaderMetaMap.get(every).get("LocalRepo");

			if (!isPremitive || isImport) {
				if (verbosTestSetBuilder) {
					SmartTSout.line();
					SmartTSout.println("HEADER :" + HEADER);
					SmartTSout.println("HEADERMETAMAP :" + headermeta2String(HeaderMetaMap.get(every)));
					SmartTSout.println("ImportTree :" + ImportTree);
				}
				List<String> subitems = new ArrayList<String>();
				if (ImportRepo.isBlank() || ImportRepo.isEmpty()) {
					if (verbosTestSetBuilder && display) {
						SmartTSout.println("AttributeType:" + AttributeType + " From: " + LocalRepo);
					}
					subitems = GenerateSubitemList(LocalRepo, AttributeType);
				} else {
					if (verbosTestSetBuilder && display) {
						SmartTSout.println("AttributeType:" + AttributeType + " From: " + ImportRepo);
					}
					subitems = GenerateSubitemList(ImportRepo, AttributeType);
				}
				if (verbosTestSetBuilder && display) {
					SmartTSout.lineTag("d", " COLLECTED ITEMS");
				}
				for (String item : subitems) {
					String entry = every + TSDef.TestSetBuilder_ImportTreeSpacer + item;
					truetestsetheader.add(entry);
					if (verbosTestSetBuilder && display) {
						SmartTSout.println(entry);
					}
				}
			} else {
				truetestsetheader.add(every);
			}
		}

		if (verbosTestSetBuilder && display)
			SmartTSout.println(truetestsetheader.toString());

		if (verbosTestSetBuilder && display)
			SmartTSout.println(Header + "OUT");
		return truetestsetheader;
	}

	private List<String> RunTestSetBuilder_Header_ProcessSeedSUB(TestSetSeedContainer seed,
			CommObjectTestSetContainer cots, boolean display) {
		List<String> testsetheader = new ArrayList<String>();
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		if (cots.TestDataFileName.contains(seed.SetName + TSDef.ServiceRepoTestDataFileNamePostfix)) {
			String ten = cots.TestEntityName;
			if (cots.isImport)
				ten = cStr.cutFrom(ten, TSDef.ImportedPrefix, true);
			String repo = cStr.cutTo(ten, TSDef.TestSetNameSpacer, true);
			ten = cStr.cutFrom(ten, TSDef.TestSetNameSpacer, true);
			String cobj = cStr.cutTo(ten, TSDef.TestSetNameSpacer, true);
			ten = cStr.cutFrom(ten, TSDef.TestSetNameSpacer, true);
			if (repo.equals(seed.ServiceRepo) && cobj.equals(seed.CommObject)) {
				String header = seed.LinkedTo + TSDef.TestSetBuilder_HeaderNameSpacer + seed.ServiceRepo
						+ TSDef.TestSetBuilder_HeaderNameSpacer + seed.CommObject;
				String type = "";
				String name = "";
				String aszs = "";
				if (cots.isEnum) {
					type = TSDef.ENUMPrefix_only;
					header = header + TSDef.TestSetBuilder_HeaderNameSpacer + type;
					ten = "|";
					testsetheader.add(header);
				} else {
					type = cStr.cutTo(ten, TSDef.TestSetNameSpacer, true);
					ten = cStr.cutFrom(ten, TSDef.TestSetNameSpacer, true);
					if (cots.isImport) {
						type = TSDef.TestSetBuilder_ImportSpacer + type + TSDef.TestSetBuilder_ImportScoper
								+ cots.ImportSourceRepository;
					}
					header = header + TSDef.TestSetBuilder_HeaderNameSpacer + type;
					if (cots.isArray) {
						name = cStr.cutTo(ten, TSDef.TestSetArraySpacer, true);
						header = header + TSDef.TestSetBuilder_HeaderNameSpacer + name;
						ten = cStr.cutFrom(ten, TSDef.TestSetArraySpacer, true);
						aszs = ten;
					} else {
						name = ten;
						header = header + TSDef.TestSetBuilder_HeaderNameSpacer + name;
					}
					ten = "|";
					if (cots.isArray) {
						if (aszs.equals(TSDef.TestSetArrayVarSzSys)) {
							testsetheader
									.add(header + TSDef.TestSetBuilder_HeaderNameSpacer + TSDef.TestSetArrayVarSzSys
											+ TSDef.TestSetBuilder_ArrayMaxSpacer + TSDef.TestSetArrayVarSzSys);
						} else {
							int asz = Integer.parseInt(aszs);
							for (int i = 0; i < asz; i++) {
								testsetheader.add(header + TSDef.TestSetBuilder_HeaderNameSpacer + i
										+ TSDef.TestSetBuilder_ArrayMaxSpacer + asz);
							}
						}
					} else {
						testsetheader.add(header);
					}
				}
				if (display)
					SmartTSout.println(repo + " " + cobj + " " + type + " " + name + " " + aszs + " " + ten);
			}
		}
		return testsetheader;
	}

	private Map<String, Map<String, String>> RunTestSetBuilder_ProcessHeaders(List<String> testsetheader) {
		return RunTestSetBuilder_ProcessHeaders(testsetheader, true);
	}

	private Map<String, Map<String, String>> RunTestSetBuilder_ProcessHeaders(List<String> testsetheader,
			boolean display) {
		String Spacer = " | ";
		String Header = "Test Set Builder" + Spacer + ServiceRepositoryName + Spacer + "Processing Headers" + Spacer;
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		if (verbosTestSetBuilder && display) {
			SmartTSout.println(Header + "IN");
		}
		Map<String, Map<String, String>> headermetamap = new HashMap<String, Map<String, String>>();
		for (String tsheader : testsetheader) {
			Map<String, String> entry = new HashMap<String, String>();
			String Remainder = tsheader;
			String ImportTree = "";
			if (tsheader.contains(TSDef.TestSetBuilder_ImportTreeSpacer)) {
				Remainder = cStr.cutTo(tsheader, TSDef.TestSetBuilder_ImportTreeSpacer, true);
				ImportTree = cStr.cutFrom(tsheader, TSDef.TestSetBuilder_ImportTreeSpacer, true);
			}
			String ImportTreeRemainder = ImportTree;
			while (ImportTreeRemainder.contains(TSDef.TestSetBuilder_RecursionHeaderNameSpacer)) {
				ImportTreeRemainder = cStr.cutFrom(ImportTreeRemainder, TSDef.TestSetBuilder_RecursionHeaderNameSpacer,
						true);
			}
			String dot = TSDef.TestSetBuilder_HeaderNameSpacer;
			String LinkedTo = cStr.cutTo(Remainder, dot, true);
			Remainder = cStr.cutFrom(Remainder, dot, true);
			String LocalRepo = cStr.cutTo(Remainder, dot, true);
			Remainder = cStr.cutFrom(Remainder, dot, true);
			String CommObject = cStr.cutTo(Remainder, dot, true);
			Remainder = cStr.cutFrom(Remainder, dot, true);
			String AttributeType = cStr.cutTo(Remainder, dot, true);
			String Attribute = "";
			boolean isArray = false;
			boolean isEnum = false;
			String ArrIndexStr = "";
			String ArrSizeStr = "";
			int ArrIndex = Integer.parseInt(TSDef.TestSetArrayVarSzSys_Int);
			boolean iswasVarSz = false;
			if (Remainder.equals(TSDef.ENUMPrefix_only)) {
				isEnum = true;
				Attribute = TSDef.ENUMPrefix_only;
				AttributeType = CommObject;
				Remainder = "";
			} else {
				Remainder = cStr.cutFrom(Remainder, dot, true);
				if (Remainder.contains(dot) && Remainder.contains(TSDef.TestSetBuilder_ArrayMaxSpacer)) {
					Attribute = cStr.cutTo(Remainder, dot, true);
					Remainder = cStr.cutFrom(Remainder, dot, true);
					isArray = true;
					ArrIndexStr = cStr.cutTo(Remainder, TSDef.TestSetBuilder_ArrayMaxSpacer, true);
					Remainder = cStr.cutFrom(Remainder, TSDef.TestSetBuilder_ArrayMaxSpacer, true);
					ArrSizeStr = Remainder;
					if (ArrIndexStr.equals(TSDef.TestSetArrayVarSzSys)) {
						ArrIndex = Integer.parseInt(TSDef.TestSetArrayVarSzSys_Int);
						iswasVarSz = true;
					} else {
						ArrIndex = Integer.parseInt(ArrIndexStr);
					}
					Remainder = "";
				} else {
					Attribute = Remainder;
					Remainder = "";
				}
			}
			boolean isImport = AttributeType.contains(TSDef.TestSetBuilder_ImportSpacer)
					&& AttributeType.contains(TSDef.TestSetBuilder_ImportScoper);
			String ImportRepo = "";
			if (isImport) {
				ImportRepo = cStr.cutFrom(AttributeType, TSDef.TestSetBuilder_ImportScoper, true);
				AttributeType = cStr.cutFromNextTo(AttributeType, TSDef.TestSetBuilder_ImportSpacer,
						TSDef.TestSetBuilder_ImportScoper, true);
			}
			boolean isPremitive = TSDef.isPremitiveType(AttributeType);
			String ScopeResolutionOperator = "::";
			if (isPremitive || isEnum) {
				ScopeResolutionOperator = "";
			}
			entry.put("HEADER", tsheader);
			entry.put("ImportTree", ImportTree);
			entry.put("LinkedTo", LinkedTo);
			entry.put("LocalRepo", LocalRepo);
			entry.put("CommObject", CommObject);
			entry.put("AttributeType", AttributeType);
			entry.put("Attribute", Attribute);
			entry.put("isArray", isArray + "");
			entry.put("isEnum", isEnum + "");
			entry.put("ArrSizeStr", ArrSizeStr);
			entry.put("ArrIndexStr", ArrIndexStr);
			entry.put("ArrIndex", ArrIndex + "");
			entry.put("iswasVarSz", iswasVarSz + "");
			entry.put("isImport", isImport + "");
			entry.put("ImportRepo", ImportRepo);
			entry.put("isPremitive", isPremitive + "");
			entry.put("ScopeResolutionOperator", ScopeResolutionOperator);
			entry.put("Remainder", Remainder);
			entry.put("ImportTreeRemainder", ImportTreeRemainder);

			headermetamap.put(tsheader, entry);
			if (verbosTestSetBuilder && display) {
				SmartTSout.println(headermeta2String(entry, false));
			}
		}
		if (verbosTestSetBuilder && display) {
			SmartTSout.println(Header + "OUT");
		}
		return headermetamap;
	}

	private String headermeta2String(Map<String, String> map) {
		return headermeta2String(map, true, " | ");
	}

	private String headermeta2String(Map<String, String> map, boolean HideEmpty) {
		return headermeta2String(map, HideEmpty, " | ");
	}

	private String headermeta2String(Map<String, String> map, String Space) {
		return headermeta2String(map, true, Space);
	}

	private String headermeta2String(Map<String, String> map, boolean HideEmpty, String Space) {
		String out = "";
		for (String key : map.keySet()) {
			String entry = map.get(key);
			boolean displayentry = true;
			if (HideEmpty) {
				if (entry.isBlank() || entry.isEmpty() || entry == null) {
					displayentry = false;
				}
			}
			if (displayentry) {
				out = out + key + ":" + entry + Space;
			}
		}
		return out;
	}

	private Map<String, Map<String, String>> RunTestSetBuilder_VarCaseExpand(
			Map<String, Map<String, String>> HeaderMetaMap, String TestSetName) {
		String Spacer = " | ";
		String Header = "Test Set Builder" + Spacer + ServiceRepositoryName + Spacer + "VarCaseExpand HeaderMetaMap"
				+ Spacer;
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		if (verbosTestSetBuilder) {
			SmartTSout.println(Header + "IN");
		}
		Map<String, Map<String, String>> HeaderMetaMapVarCaseExpanded = new HashMap<String, Map<String, String>>();

		for (String key : HeaderMetaMap.keySet()) {
			if (verbosTestSetBuilder) {
				SmartTSout.lineTag(key);
			}
			final Map<String, String> entry = HeaderMetaMap.get(key);
			boolean isPremitive = entry.get("isPremitive").equals(true + "");
			boolean isEnum = entry.get("isEnum").equals(true + "");
			boolean isImport = entry.get("isImport").equals(true + "");
			boolean isArray = entry.get("isArray").equals(true + "");
			String ArrIndex = entry.get("ArrIndex");
			String ArrIndexStr = entry.get("ArrIndexStr");
			String ArrSizeStr = entry.get("ArrSizeStr");
			boolean iswasVarSz = entry.get("iswasVarSz").equals(true + "");
			String CommObject = entry.get("CommObject");
			String ImportTree = entry.get("ImportTree");
			String ImportRepo = entry.get("ImportRepo");
			String Attribute = entry.get("Attribute");
			String AttributeType = entry.get("AttributeType");
			String LocalRepo = entry.get("LocalRepo");

			boolean isSimple = isPremitive || isEnum;
			boolean key_processed = false;
			if (isSimple) {
				if (isPremitive) {
					String LRepo = LocalRepo;
					String CObj = CommObject;
					String Attr = Attribute;
					String AtTy = AttributeType;
					String TestEntityName = "";
					if (!isArray) {
						TestEntityName = LRepo + TSDef.TestSetNameSpacer + CObj + TSDef.TestSetNameSpacer + AtTy
								+ TSDef.TestSetNameSpacer + Attr;
					} else {
						TestEntityName = LRepo + TSDef.TestSetNameSpacer + CObj + TSDef.TestSetNameSpacer + AtTy
								+ TSDef.TestSetNameSpacer + Attr + TSDef.TestSetArraySpacer + ArrSizeStr;
					}

					if (verbosTestSetBuilder) {
						SmartTSout.println(headermeta2String(entry, "\n"));
						SmartTSout.println("IS : " + AtTy + " " + LRepo + "::" + CObj + "." + Attr
								+ "   TestEntityName:" + TestEntityName);
					}
					boolean entityfound = false;
					for (CommObjectTestSetContainer cts : CommObjectTestSets) {
						if (TestSetName.equals(cts.getSetName())) {
							if (cts.TestEntityName.equals(TestEntityName)) {
								boolean not_touched = true;
								entityfound = true;
								if (isArray) {
									if (ArrIndexStr.equals(TSDef.TestSetArrayVarSzSys)
											&& (ArrIndex.equals(TSDef.TestSetArrayVarSzSys_Int))) {
										int maxIndexSize = 0;
										for (List<String> n : cts.TestSet) {
											if (n.size() > maxIndexSize)
												maxIndexSize = n.size();
										}
										for (int i = 0; i < maxIndexSize; i++) {
											Map<String, String> newentry = new HashMap<String, String>();
											newentry = deepcopy(entry);
											newentry.put("ArrIndex", i + "");
											newentry.put("ArrIndexStr", i + "");
											newentry.put("ArrSizeStr", maxIndexSize + "");
											String VarOfVar = TSDef.TestSetArrayVarSzSys
													+ TSDef.TestSetBuilder_ArrayMaxSpacer + TSDef.TestSetArrayVarSzSys;
											String replacement = i + TSDef.TestSetBuilder_ArrayMaxSpacer + maxIndexSize;
											String newKey = cts.getSetName() + TSDef.TestSetBuilder_SetNameSpacer
													+ key.replace(VarOfVar, replacement);
											if (newKey.isBlank() || newKey.isEmpty() || newKey == null
													|| newKey.equals(key)) {
												errorVarcase = true;
												String logentry = "XXXX Error replacing VarOfVar: " + VarOfVar
														+ " with " + replacement;
												LogVarcase = LogVarcase + logentry;
												ErrorLogVarcase = ErrorLogVarcase + logentry;
												if (verbosTestSetBuilder) {
													SmartTSout.println(Header + "XXXX Error replacing VarOfVar: "
															+ VarOfVar + " with " + replacement);
													SmartTSout.println(Header + "OUT");
												}
												return null;
											}
											HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
											key_processed = true;
											not_touched = false;
											LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.Touched + "\n";
										}
									}
								}
								if (not_touched) {
									Map<String, String> newentry = new HashMap<String, String>();
									newentry = deepcopy(entry);
									String newKey = cts.getSetName() + TSDef.TestSetBuilder_SetNameSpacer + key;
									HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
									key_processed = true;
									LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.NotTouched + "\n";
								}
							}
						}
					}
					if (!entityfound) {
						if (verbosTestSetBuilder) {
							SmartTSout.println("IS : " + AtTy + " " + LRepo + "::" + CObj + "." + Attr
									+ "   TestEntityName:" + TestEntityName + TSDef.NotFoundIndicate);
						}
					}
				} else {
					if (isEnum) {
						String LRepo = LocalRepo;
						String CObj = CommObject;
						String Attr = Attribute;
						String AtTy = AttributeType;
						String TestEntityName = LRepo + TSDef.TestSetNameSpacer + CObj + TSDef.TestSetNameSpacer
								+ TSDef.ENUMPrefix + CObj;
						if (verbosTestSetBuilder) {
							SmartTSout.println(headermeta2String(entry, "\n"));
							SmartTSout.println("IS : " + AtTy + " " + LRepo + "::" + CObj + "." + Attr
									+ "   TestEntityName:" + TestEntityName);
						}

						boolean entityfound = false;
						for (CommObjectTestSetContainer cts : CommObjectTestSets) {
							if (TestSetName.equals(cts.getSetName())) {
								if (cts.TestEntityName.equals(TestEntityName)) {
									entityfound = true;
									Map<String, String> newentry = new HashMap<String, String>();
									newentry = deepcopy(entry);
									String newKey = cts.getSetName() + TSDef.TestSetBuilder_SetNameSpacer + key;
									HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
									key_processed = true;
									LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.NotTouched + "\n";
								}
							}
						}
						if (!entityfound) {
							if (verbosTestSetBuilder) {
								SmartTSout.println("IS : " + AtTy + " " + LRepo + "::" + CObj + "." + Attr
										+ "   TestEntityName:" + TestEntityName + TSDef.NotFoundIndicate);
							}
						}
					}
				}
			}

			boolean isLocalImport = (!isImport) && (!isPremitive);
			boolean key_as_is = false;
			boolean isCommObjectType = false;
			String ImportedTestEntityName = "";
			if (isLocalImport) {
				String Logic = "isLocalImport";
				String LRepo = LocalRepo;
				String CObj = CommObject;
				String Attr = Attribute;
				String AtTy = AttributeType;
				String ImportTreeRest = cStr.cutFrom(ImportTree, TSDef.TestSetBuilder_ChildScoper, true);
				if (ImportTreeRest.equals(TSDef.ENUMPrefix_only)) {
					Logic = Logic + "&&EnumType";
					key_as_is = true;
					ImportedTestEntityName = LRepo + TSDef.TestSetNameSpacer + AtTy + TSDef.TestSetNameSpacer
							+ TSDef.ENUMPrefix + AtTy;
					if (isArray) {
						Logic = Logic + "&&isArray";
						key_as_is = true;
						if (iswasVarSz) {
							Logic = Logic + "&&iswasVarSz";
							if (ArrIndexStr.equals(TSDef.TestSetArrayVarSzSys)
									&& (ArrIndex.equals(TSDef.TestSetArrayVarSzSys_Int))) {
								key_as_is = false;
								boolean entityfound = false;
								for (CommObjectTestSetContainer cts : CommObjectTestSets) {
									if (TestSetName.equals(cts.getSetName())) {
										if (cts.TestEntityName.equals(ImportedTestEntityName)) {
											entityfound = true;
											int maxIndexSize = TSDef
													.TestSetBuilder_VarCase_Enum_SizeGetter(cts.TestSet.size());
											for (List<String> n : cts.TestSet) {
												if (n.size() > maxIndexSize)
													maxIndexSize = n.size();
											}
											for (int i = 0; i < maxIndexSize; i++) {
												Map<String, String> newentry = new HashMap<String, String>();
												newentry = deepcopy(entry);
												newentry.put("ArrIndex", i + "");
												newentry.put("ArrIndexStr", i + "");
												newentry.put("ArrSizeStr", maxIndexSize + "");
												String VarOfVar = TSDef.TestSetArrayVarSzSys
														+ TSDef.TestSetBuilder_ArrayMaxSpacer
														+ TSDef.TestSetArrayVarSzSys;
												String replacement = i + TSDef.TestSetBuilder_ArrayMaxSpacer
														+ maxIndexSize;
												String newKey = cts.getSetName() + TSDef.TestSetBuilder_SetNameSpacer
														+ key.replace(VarOfVar, replacement);
												if (newKey.isBlank() || newKey.isEmpty() || newKey == null
														|| newKey.equals(key)) {
													errorVarcase = true;
													String logentry = "XXXX Error replacing VarOfVar: " + VarOfVar
															+ " with " + replacement;
													LogVarcase = LogVarcase + logentry;
													ErrorLogVarcase = ErrorLogVarcase + logentry;
													if (verbosTestSetBuilder) {
														SmartTSout.println(Header + "XXXX Error replacing VarOfVar: "
																+ VarOfVar + " with " + replacement);
														SmartTSout.println(Header + "OUT");
													}
													return null;
												}
												HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
												LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.Touched + "\n";
											}
											key_processed = true;
										}
									}
								}
								if (!entityfound) {
									if (verbosTestSetBuilder) {
										SmartTSout.println("IS : " + AtTy + " " + LRepo + "::" + CObj + "." + Attr
												+ "   ImportedTestEntityName:" + ImportedTestEntityName
												+ TSDef.NotFoundIndicate);
									}
								}
							}
						}
					}
				} else {
					isCommObjectType = true;
				}
			} else {
				String Logic = "isOutsideImport";
				String IRepo = ImportRepo;
				String CObj = CommObject;
				String Attr = Attribute;
				String AtTy = AttributeType;
				String ImportTreeRest = cStr.cutFrom(ImportTree, TSDef.TestSetBuilder_ChildScoper, true);
				if (ImportTreeRest.equals(TSDef.ENUMPrefix_only)) {
					Logic = Logic + "&&EnumType";
					key_as_is = true;
					ImportedTestEntityName = IRepo + TSDef.TestSetNameSpacer + AtTy + TSDef.TestSetNameSpacer
							+ TSDef.ENUMPrefix + AtTy;
					Logic = Logic + "&&isArray";
					key_as_is = true;
					if (iswasVarSz) {
						Logic = Logic + "&&iswasVarSz";
						if (ArrIndexStr.equals(TSDef.TestSetArrayVarSzSys)
								&& (ArrIndex.equals(TSDef.TestSetArrayVarSzSys_Int))) {
							key_as_is = false;
							boolean entityfound = false;
							CommObjectTestSetContainer cts = ImportCommObjectTestSetContainer(IRepo,
									ImportedTestEntityName, TestSetName);
							if (cts != null) {
								entityfound = true;
								int maxIndexSize = TSDef.TestSetBuilder_VarCase_Enum_SizeGetter(cts.TestSet.size());
								for (List<String> n : cts.TestSet) {
									if (n.size() > maxIndexSize)
										maxIndexSize = n.size();
								}
								for (int i = 0; i < maxIndexSize; i++) {
									Map<String, String> newentry = new HashMap<String, String>();
									newentry = deepcopy(entry);
									newentry.put("ArrIndex", i + "");
									newentry.put("ArrIndexStr", i + "");
									newentry.put("ArrSizeStr", maxIndexSize + "");
									String VarOfVar = TSDef.TestSetArrayVarSzSys + TSDef.TestSetBuilder_ArrayMaxSpacer
											+ TSDef.TestSetArrayVarSzSys;
									String replacement = i + TSDef.TestSetBuilder_ArrayMaxSpacer + maxIndexSize;
									String newKey = cts.getSetName() + TSDef.TestSetBuilder_SetNameSpacer
											+ key.replace(VarOfVar, replacement);
									if (newKey.isBlank() || newKey.isEmpty() || newKey == null || newKey.equals(key)) {
										errorVarcase = true;
										String logentry = "XXXX Error replacing VarOfVar: " + VarOfVar + " with "
												+ replacement;
										LogVarcase = LogVarcase + logentry;
										ErrorLogVarcase = ErrorLogVarcase + logentry;
										if (verbosTestSetBuilder) {
											SmartTSout.println(Header + "XXXX Error replacing VarOfVar: " + VarOfVar
													+ " with " + replacement);
											SmartTSout.println(Header + "OUT");
										}
										return null;
									}
									HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
									LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.Touched + "\n";
								}
								key_processed = true;
							}
							if (!entityfound) {
								if (verbosTestSetBuilder) {
									SmartTSout.println("IS : " + AtTy + " " + IRepo + "::" + CObj + "." + Attr
											+ "   ImportedTestEntityName:" + ImportedTestEntityName
											+ TSDef.NotFoundIndicate);
								}
							}
						}
					}
				} else {
					isCommObjectType = true;
				}
			}

			if (isCommObjectType) {
				String VarOfVar = TSDef.TestSetArrayVarSzSys + TSDef.TestSetBuilder_ArrayMaxSpacer
						+ TSDef.TestSetArrayVarSzSys;
				if (key.contains(VarOfVar) && (ArrIndexStr.equals(TSDef.TestSetArrayVarSzSys))
						&& (ArrIndex.equals(TSDef.TestSetArrayVarSzSys_Int))) {
					String CopyKey1 = cStr.cutFrom(key, VarOfVar, true);
					String CopyKey2 = cStr.cutTo(key, VarOfVar, true);
					if (CopyKey1.contains(VarOfVar) || CopyKey2.contains(VarOfVar)) {
						errorVarcase = true;
						String logentry = "XXXX TWICE_ERROR !!: " + TSDef.DSLERROR;
						LogVarcase = LogVarcase + logentry;
						ErrorLogVarcase = ErrorLogVarcase + logentry;
						if (verbosTestSetBuilder) {
							SmartTSout.println(Header + logentry);
							SmartTSout.println(Header + "OUT");
						}
						return null;
					} else {
						int maxIndexSize = TSDef.TestSetBuilder_VarCase_CommObj_NumPerArraySize;
						for (int i = 0; i < maxIndexSize; i++) {
							Map<String, String> newentry = new HashMap<String, String>();
							newentry = deepcopy(entry);
							newentry.put("ArrIndex", i + "");
							newentry.put("ArrIndexStr", i + "");
							newentry.put("ArrSizeStr", maxIndexSize + "");
							String replacement = i + TSDef.TestSetBuilder_ArrayMaxSpacer + maxIndexSize;
							String newKey = TestSetName + TSDef.TestSetBuilder_SetNameSpacer
									+ key.replace(VarOfVar, replacement);
							if (newKey.isBlank() || newKey.isEmpty() || newKey == null || newKey.equals(key)) {
								errorVarcase = true;
								String logentry = "XXXX Error replacing VarOfVar: " + VarOfVar + " with " + replacement;
								LogVarcase = LogVarcase + logentry;
								ErrorLogVarcase = ErrorLogVarcase + logentry;
								if (verbosTestSetBuilder) {
									SmartTSout.println(Header + logentry);
									SmartTSout.println(Header + "OUT");
								}
								return null;
							}
							HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
							LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.Touched + "\n";
						}
						key_processed = true;
					}
				} else {
					key_as_is = true;
				}
			}

			if (key_as_is) {
				Map<String, String> newentry = new HashMap<String, String>();
				newentry = deepcopy(entry);
				String newKey = TestSetName + TSDef.TestSetBuilder_SetNameSpacer + key;
				HeaderMetaMapVarCaseExpanded.put(newKey, newentry);
				key_processed = true;
				LogVarcase = LogVarcase + key + "-->" + newKey + TSDef.NotTouched + "\n";
			}
			String disp = " [VarCaseExpanded] ";
			if (key_processed) {
				disp = disp + TSDef.Touched;
				if (key_as_is) {
					disp = disp + " AsIS ";
				}
			} else {
				disp = disp + TSDef.NotTouched + entry.toString() + TSDef.Indicate;
			}
			String key_processed_logentry = key + cStr.SetWFiller(cutString.LongSpace.length(), key) + disp + "\n";
			if (verbosTestSetBuilder)
				SmartTSout.println(key_processed_logentry);
		}
		if (verbosTestSetBuilder) {
			SmartTSout.println(Header + "OUT");
		}

		return HeaderMetaMapVarCaseExpanded;
	}

	private List<CommObjectTestSetContainer> ImportCommObjectTestSetContainerSET(TestSetSeedContainer seed) {
		return ImportCommObjectTestSetContainerSET(seed.ServiceRepo, seed.CommObject, seed.SetName);
	}

	private List<CommObjectTestSetContainer> ImportCommObjectTestSetContainerSET(String iRepo, String iCommObjName,
			String TestSetName) {
		List<CommObjectTestSetContainer> cts = new ArrayList<CommObjectTestSetContainer>();
		IO io = new IO();
		IProject IP = io.getProjectFromWorkspace(iRepo);
		if ((IP == null) || (!IP.exists())) {
			return null;
		}
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		IFolder TestSetsfolder = IP.getFolder(TSDef.datasetsFolderName);
		if ((TestSetsfolder == null) || (!TestSetsfolder.exists())) {
			return null;
		}
		String tsetxmlfilename = iRepo + TSDef.ServiceRepoTestSetsXMLFileNamePostfix;
		IFile tsetxml = TestSetsfolder.getFile(tsetxmlfilename);
		String tsetxmlstring = io.FilePath2String(tsetxml);
		ServiceRepositoryTestSetContainer imp = XMLString2ServiceRepositoryTestSetContainer(tsetxmlstring);
		for (CommObjectTestSetContainer ctscandidate : imp.CommObjectTestSets) {
			if (TestSetName.equals(ctscandidate.getSetName())) {
				String candidaterest = cStr.cutFrom(ctscandidate.TestEntityName, TSDef.TestSetNameSpacer, true);
				String candidatecommobj = cStr.cutTo(candidaterest, TSDef.TestSetNameSpacer, true);
				if (candidatecommobj.equals(iCommObjName)) {
					cts.add(ctscandidate);
				}
			}
		}
		return cts;
	}

	private CommObjectTestSetContainer ImportCommObjectTestSetContainer(String iRepo, String importedTestEntityName,
			String TestSetName) {
		CommObjectTestSetContainer cts = null;
		IO io = new IO();
		IProject IP = io.getProjectFromWorkspace(iRepo);
		if ((IP == null) || (!IP.exists())) {
			return null;
		}
		TSDefine TSDef = new TSDefine();
		IFolder TestSetsfolder = IP.getFolder(TSDef.datasetsFolderName);
		if ((TestSetsfolder == null) || (!TestSetsfolder.exists())) {
			return null;
		}
		String tsetxmlfilename = iRepo + TSDef.ServiceRepoTestSetsXMLFileNamePostfix;
		IFile tsetxml = TestSetsfolder.getFile(tsetxmlfilename);
		String tsetxmlstring = io.FilePath2String(tsetxml);
		ServiceRepositoryTestSetContainer imp = XMLString2ServiceRepositoryTestSetContainer(tsetxmlstring);
		for (CommObjectTestSetContainer ctscandidate : imp.CommObjectTestSets) {
			if (TestSetName.equals(ctscandidate.getSetName())) {
				if (ctscandidate.TestEntityName.equals(importedTestEntityName)) {
					return ctscandidate;
				}
			}
		}
		return cts;
	}

	private Map<String, String> deepcopy(Map<String, String> original) {
		Map<String, String> deepcopy = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : original.entrySet()) {
			deepcopy.put(entry.getKey(), new String(entry.getValue()));
		}
		return deepcopy;
	}

	private List<List<String>> RunTestSetBuilder_HeaderMetaMap(Map<String, Map<String, String>> HeaderMetaMap,
			String TestSetName) {
		String Spacer = " | ";
		String Header = "Test Set Builder" + Spacer + ServiceRepositoryName + Spacer + "Processing HeaderMetaMap"
				+ Spacer;
		TSDefine TSDef = new TSDefine();
		cutString cStr = new cutString();
		SmartTSConsole SmartTSout = new SmartTSConsole();

		if (verbosTestSetBuilder) {
			SmartTSout.println(Header + "IN");
		}

		List<List<String>> testset = new ArrayList<List<String>>();

		for (String key : HeaderMetaMap.keySet()) {
			if (verbosTestSetBuilder) {
				SmartTSout.lineTag(key);
			}
			Map<String, String> entry = HeaderMetaMap.get(key);
			boolean isPremitive = entry.get("isPremitive").equals(true + "");
			boolean isImport = entry.get("isImport").equals(true + "");
			boolean isLocal = !isImport;
			boolean isArray = entry.get("isArray").equals(true + "");
			boolean isEnum = entry.get("isEnum").equals(true + "");
			String ArrIndex = entry.get("ArrIndex");
			String ArrIndexStr = entry.get("ArrIndexStr");
			String ArrSizeStr = entry.get("ArrSizeStr");
			boolean iswasVarSz = entry.get("iswasVarSz").equals(true + "");
			String CommObject = entry.get("CommObject");
			String ImportTree = entry.get("ImportTree");
			String ImportTreeRemainder = entry.get("ImportTreeRemainder");
			String ImportRepo = entry.get("ImportRepo");
			String Attribute = entry.get("Attribute");
			String AttributeType = entry.get("AttributeType");
			String LocalRepo = entry.get("LocalRepo");

			boolean key_processed = false;
			String key_processed_logentry = "";

			// ==================== Building Test Set For Primitive and Enum Keys
			if (isPremitive) {
				String R = LocalRepo;
				String C = CommObject;
				String A = Attribute;
				String T = AttributeType;
				List<String> TS = new ArrayList<String>();
				String TestEntityName = "";
				if (!isArray) {
					TestEntityName = R + TSDef.TestSetNameSpacer + C + TSDef.TestSetNameSpacer + T
							+ TSDef.TestSetNameSpacer + A;
				} else {
					TestEntityName = R + TSDef.TestSetNameSpacer + C + TSDef.TestSetNameSpacer + T
							+ TSDef.TestSetNameSpacer + A + TSDef.TestSetArraySpacer + ArrSizeStr;
					if (iswasVarSz) {
						TestEntityName = R + TSDef.TestSetNameSpacer + C + TSDef.TestSetNameSpacer + T
								+ TSDef.TestSetNameSpacer + A + TSDef.TestSetArraySpacer + TSDef.TestSetArrayVarSzSys;
					}
				}

				if (verbosTestSetBuilder) {
					SmartTSout.println(headermeta2String(entry, "\n"));
					SmartTSout.println(
							"IS : " + T + " " + R + "::" + C + "." + A + "   TestEntityName:" + TestEntityName);
				}
				boolean entityfound = false;
				for (CommObjectTestSetContainer cts : CommObjectTestSets) {
					if (TestSetName.equals(cts.getSetName())) {
						if (cts.TestEntityName.equals(TestEntityName)) {
							entityfound = true;
							if (!isArray) {
								TS = cStr.CSV2Column(cts.TestSet, 0);
							} else {
								if (ArrIndexStr.equals(TSDef.TestSetArrayVarSzSys)
										&& (ArrIndex.equals(TSDef.TestSetArrayVarSzSys_Int))) {
									errorVarcase = true;
									String logentry = "XXXX Error Missed VarCase for Key: " + key + "\n";
									LogVarcase = LogVarcase + logentry;
									ErrorLogVarcase = ErrorLogVarcase + logentry;
								} else {
									TS = cStr.CSV2Column(cts.TestSet, +Integer.parseInt(ArrIndex));
									key_processed_logentry = key_processed_logentry + ArrIndex + "->"
											+ +Integer.parseInt(ArrIndex) + "\n";
								}
							}
							if ((TS == null) || TS.isEmpty()) {
								TS = new ArrayList<String>();
								TS.add(TSDef.ErrorNoDataFoundIndicator);
								if (verbosTestSetBuilder) {
									String errorlog = "";
									errorlog = errorlog + TestEntityName + ": XXXX ERROR "
											+ TSDef.ErrorNoDataFoundIndicator;
									errorlog = errorlog + headermeta2String(entry, "\n") + "\n";
									LogERROR_NO_DATA_FOUND = LogERROR_NO_DATA_FOUND + errorlog;
									SmartTSout.println(errorlog);
								}
							}
							TS.add(0, key);
							testset.add(TS);
							key_processed = true;
							if (verbosTestSetBuilder) {
								SmartTSout.println("IS : " + T + " " + R + "::" + C + "." + A + "   TestEntityName:"
										+ TestEntityName + TSDef.Found + cts.TestDataFileName);
								SmartTSout.println(TS.toString());
							}
						}
					}
				}
				if (!entityfound) {
					if (verbosTestSetBuilder) {
						SmartTSout.println("IS : " + T + " " + R + "::" + C + "." + A + "   TestEntityName:"
								+ TestEntityName + TSDef.NotFoundIndicate);
					}
				}
			} else {
				if (isEnum) {
					String R = LocalRepo;
					String C = CommObject;
					String A = Attribute;
					String T = AttributeType;
					List<String> TS = new ArrayList<String>();
					String TestEntityName = R + TSDef.TestSetNameSpacer + C + TSDef.TestSetNameSpacer + TSDef.ENUMPrefix
							+ C;
					if (verbosTestSetBuilder) {
						SmartTSout.println(headermeta2String(entry, "\n"));
						SmartTSout.println(
								"IS : " + T + " " + R + "::" + C + "." + A + "   TestEntityName:" + TestEntityName);
					}
					boolean entityfound = false;
					for (CommObjectTestSetContainer cts : CommObjectTestSets) {
						if (TestSetName.equals(cts.getSetName())) {
							if (cts.TestEntityName.equals(TestEntityName)) {
								entityfound = true;
								TS = cStr.CSV2Column(cts.TestSet, 0);
								if ((TS == null) || TS.isEmpty()) {
									TS = new ArrayList<String>();
									TS.add(TSDef.ErrorNoDataFoundIndicator);
									if (verbosTestSetBuilder) {
										String errorlog = "";
										errorlog = errorlog + TestEntityName + ": XXXX ERROR "
												+ TSDef.ErrorNoDataFoundIndicator;
										errorlog = errorlog + headermeta2String(entry, "\n") + "\n";
										LogERROR_NO_DATA_FOUND = LogERROR_NO_DATA_FOUND + errorlog;
										SmartTSout.println(errorlog);
									}
								}
								TS.add(0, key);
								testset.add(TS);
								key_processed = true;
								if (verbosTestSetBuilder) {
									SmartTSout.println("IS : " + T + " " + R + "::" + C + "." + A + "   TestEntityName:"
											+ TestEntityName + TSDef.Found + cts.TestDataFileName);
									SmartTSout.println(TS.toString());
								}
							}
						}
					}
					if (!entityfound) {
						if (verbosTestSetBuilder) {
							SmartTSout.println("IS : " + T + " " + R + "::" + C + "." + A + "   TestEntityName:"
									+ TestEntityName + TSDef.NotFoundIndicate);
						}
					}
				}
			}
			// ==================== Building Test Set For Non Primitive Keys
			boolean isLocalImport = isLocal && (!isPremitive);
			boolean isEnumType = false;
			boolean isCommObjectType = false;
			if (TSDef.ENUMPrefix_only.equals(cStr.cutFrom(ImportTree, TSDef.TestSetBuilder_ChildScoper, true))) {
				isEnumType = true;
				isCommObjectType = false;
			} else {
				isEnumType = false;
				isCommObjectType = true;
			}
			// ========== Building Test Set For Non Primitive Keys of Type Enums
			// ========== (From local or external repository)
			if (isEnumType) {
				CommObjectTestSetContainer icts = null;
				String UseRepo = "";
				if (isLocalImport) {
					UseRepo = LocalRepo;
				} else {
					UseRepo = ImportRepo;
				}
				String EnumTypeEntityName = UseRepo + TSDef.TestSetNameSpacer + AttributeType + TSDef.TestSetNameSpacer
						+ TSDef.ENUMPrefix + AttributeType;
				boolean entityfound = false;
				icts = ImportCommObjectTestSetContainer(UseRepo, EnumTypeEntityName, TestSetName);
				if (icts != null) {
					entityfound = true;
					List<String> TS = new ArrayList<String>();
					List<String> TSuse = new ArrayList<String>();
					TS = cStr.CSV2Column(icts.TestSet, 0);
					if ((TS == null) || TS.isEmpty()) {
						TS = new ArrayList<String>();
						TS.add(TSDef.ErrorNoDataFoundIndicator);
						if (verbosTestSetBuilder) {
							String errorlog = "";
							errorlog = errorlog + EnumTypeEntityName + ": XXXX ERROR "
									+ TSDef.ErrorNoDataFoundIndicator;
							errorlog = errorlog + headermeta2String(entry, "\n") + "\n";
							LogERROR_NO_DATA_FOUND = LogERROR_NO_DATA_FOUND + errorlog;
							SmartTSout.println(errorlog);
						}
					}
					if (isArray) {
						if (iswasVarSz) {
							int useindex = TSDef.TestSetBuilder_VarCase_Enum_ArrayIndexToSubSizeGetter(ArrIndex,
									ArrSizeStr);
							TSuse = TSDef.TestSetBuilder_VarCase_Enum_Filler(TS, useindex);
						} else {
							TSuse = TSDef.TestSetBuilder_Enum_Filler(TS, true);
						}
					} else {
						TSuse = TSDef.TestSetBuilder_Enum_Filler(TS);
					}

					TSuse.add(0, key);

					testset.add(TSuse);
					key_processed = true;
					if (verbosTestSetBuilder) {
						SmartTSout.println("IS : " + AttributeType + " " + UseRepo + "::" + CommObject + "."
								+ AttributeType + "   ImportedTestEntityName:" + EnumTypeEntityName + TSDef.Found
								+ icts.TestDataFileName);
						SmartTSout.println(TS.toString());
					}
				}
				if (!entityfound) {
					if (verbosTestSetBuilder) {
						SmartTSout.println(
								"IS : " + AttributeType + " " + UseRepo + "::" + CommObject + "." + AttributeType
										+ "   ImportedTestEntityName:" + EnumTypeEntityName + TSDef.NotFoundIndicate);
					}
				}
			}

			// Building Test Set For Non Primitive Keys of Type CommObjects (From local or
			// external repository)
			// THIS NEEDS MORE WORK TO CHECK FOR ALL USE CASES #TODO Good enough for now !!
			if (isCommObjectType) {
				String UseRepo = cStr.cutTo(ImportTreeRemainder, TSDef.TestSetBuilder_RecursionHeaderSourceRepo, true);
				String Rest = cStr.cutFrom(ImportTreeRemainder, TSDef.TestSetBuilder_RecursionHeaderSourceRepo, true);
				String UseCommObj = cStr.cutTo(Rest, TSDef.TestSetBuilder_ChildScoper, true);
				Rest = cStr.cutFrom(Rest, TSDef.TestSetBuilder_ChildScoper, true);
				String Child = cStr.cutTo(Rest, TSDef.TestSetBuilder_ChildTypeScoper, true);
				String Type = cStr.cutFrom(Rest, TSDef.TestSetBuilder_ChildTypeScoper, true);
				String Var = "";
				if (Type.contains(TSDef.TestSetBuilder_ChildHeaderNameSpacer)) {
					String Save = Type;
					Type = cStr.cutTo(Save, TSDef.TestSetBuilder_ChildHeaderNameSpacer, true);
					Save = cStr.cutFrom(Save, TSDef.TestSetBuilder_ChildHeaderNameSpacer, true);
					Var = TSDef.TestSetArraySpacer + Save;
				}
				String UseEntityName = UseRepo + TSDef.TestSetNameSpacer + UseCommObj + TSDef.TestSetNameSpacer + Type
						+ TSDef.TestSetNameSpacer + Child + Var;
				boolean entityfound = true;
				CommObjectTestSetContainer cts = ImportCommObjectTestSetContainer(UseRepo, UseEntityName, TestSetName);
				if (cts == null) {
					entityfound = false;
				} else {
					List<String> TS = new ArrayList<String>();
					TS = cStr.CSV2Column(cts.TestSet, 0);
					// THIS NEEDS MORE WORK TO CHECK FOR ALL USE CASES #TODO Good enough for now !!
					// Using Index 0 for now !
					if ((TS == null) || TS.isEmpty()) {
						TS = new ArrayList<String>();
						TS.add(TSDef.ErrorNoDataFoundIndicator);
						if (verbosTestSetBuilder) {
							String errorlog = "";
							errorlog = errorlog + UseEntityName + ": XXXX ERROR " + TSDef.ErrorNoDataFoundIndicator;
							errorlog = errorlog + headermeta2String(entry, "\n") + "\n";
							LogERROR_NO_DATA_FOUND = LogERROR_NO_DATA_FOUND + errorlog;
							SmartTSout.println(errorlog);
						}
					}
					TS.add(0, key);
					testset.add(TS);
					key_processed = true;
					if (verbosTestSetBuilder) {
						SmartTSout.println("isCommObjectType : " + UseRepo + "::" + UseCommObj + "." + Type
								+ "   UseEntityName:" + UseEntityName + TSDef.Found + cts.TestDataFileName);
						SmartTSout.println(TS.toString());
					}
				}
				if (!entityfound) {
					if (verbosTestSetBuilder) {
						SmartTSout.println("isCommObjectType : " + UseRepo + "::" + UseCommObj + "." + Type
								+ "   UseEntityName:" + UseEntityName + TSDef.NotFoundIndicate);
					}
				}
			}
			String disp = " [TS] ";
			if (key_processed) {
				disp = disp + TSDef.Built;
			} else {
				disp = disp + TSDef.NotBuilt + entry.toString() + TSDef.Indicate;
			}
			key_processed_logentry = key_processed_logentry + key + cStr.SetWFiller(cutString.LongSpace.length(), key)
					+ disp + "\n";
			if (verbosTestSetBuilder)
				SmartTSout.println(key_processed_logentry);
		}
		if (verbosTestSetBuilder)
			SmartTSout.println(testset.toString());

		if (verbosTestSetBuilder)
			SmartTSout.println(Header + "OUT");
		return testset;
	}

	private List<String> GenerateSubitemList(String ServiceRepoName, String Type) {
		String Spacer = " | ";
		String Header = "Test Set Builder" + Spacer + ServiceRepositoryName + Spacer + "GenerateSubitemList" + Spacer;
		cutString cStr = new cutString();
		TSDefine TSDef = new TSDefine();
		SmartTSConsole SmartTSout = new SmartTSConsole();
		GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
		ServiceRepoInfo SRI = getSmartMDSDDef.extractServiceRepoInfo(ServiceRepoName);
		List<String> subitems = new ArrayList<String>();
		boolean notfound = true;
		boolean nullname = false;

		for (CommObjectInfo t : SRI.CommObjects) {
			if (Type.equals(t.Name)) {
				notfound = false;
				List<String> returned = t.toHeaders();
				if (verbosTestSetBuilder)
					SmartTSout.println(Type + " ---> " + ServiceRepoName + "::" + t.Name + " Found !! "
							+ returned.size() + " item(s).");
				if (returned.size() == 0) {
					nullname = true;
				}
				if ((returned.size() == 1)
						&& (returned.get(0).endsWith(TSDef.TestSetBuilder_ChildScoper + TSDef.ENUMPrefix_only))) {
					subitems.add(returned.get(0));
					if (verbosTestSetBuilder) {
						SmartTSout.println(Type + " ---> " + ServiceRepoName + "::" + t.Name + " Enumeration !! ");
					}
				} else {
					for (String r : returned) {
						String headerpackage = cStr.cutTo(r, TSDef.TestSetBuilder_HeaderFlagStart, true);
						String headerflag = cStr.cutFrom(r, TSDef.TestSetBuilder_HeaderFlagStart, true);
						boolean isPrimitive = headerflag
								.contains(TSDef.TestSetBuilder_HeaderFlagTransport_isPrimitiveType + true);
						boolean isImport = headerflag
								.contains(TSDef.TestSetBuilder_HeaderFlagTransport_isImport + true);
						if (isPrimitive) {
							subitems.add(headerpackage);
						} else {
							if (isImport) {
								String LocalTypeFull = cStr.cutFrom(headerpackage, TSDef.TestSetBuilder_ChildTypeScoper,
										true);
								String LocalType = LocalTypeFull;
								if (LocalTypeFull.contains(TSDef.TestSetBuilder_ChildHeaderNameSpacer)) {
									LocalType = cStr.cutTo(LocalTypeFull, TSDef.TestSetBuilder_ChildHeaderNameSpacer,
											true);
								}
								String ImportRepoName = "";
								boolean breakflag = false;
								for (String candidate : SRI.ReferencedServices) {
									ServiceRepoInfo candidateSRI = getSmartMDSDDef.extractServiceRepoInfo(candidate);
									for (CommObjectInfo tt : candidateSRI.CommObjects) {
										if (LocalType.equals(tt.Name)) {
											ImportRepoName = candidate;
											breakflag = true;
											break;
										}
									}
									if (breakflag) {
										break;
									}
								}
								if (ImportRepoName.isBlank() || ImportRepoName.isEmpty()) {
									if (verbosTestSetBuilder)
										SmartTSout.println(Header + " XXXX ERROR " + headerpackage
												+ TSDef.TestSetBuilder_RecursionHeaderNameSpacer
												+ TSDef.NotFoundIndicate);
									return null;
								} else {
									if (verbosTestSetBuilder)
										SmartTSout.println(headerpackage + TSDef.Import + " from " + ImportRepoName);
								}
								List<String> subsubitems = GenerateSubitemList(ImportRepoName, LocalType);
								if (subsubitems != null) {
									for (String ssi : subsubitems) {
										subitems.add(
												headerpackage + TSDef.TestSetBuilder_RecursionHeaderNameSpacer + ssi);
									}
								} else {
									if (verbosTestSetBuilder)
										SmartTSout.println(Header + " XXXX ERROR " + headerpackage
												+ TSDef.TestSetBuilder_RecursionHeaderNameSpacer
												+ TSDef.NotFoundIndicate);
									return null;
								}
							} else {
								String LocalTypeFull = cStr.cutFrom(headerpackage, TSDef.TestSetBuilder_ChildTypeScoper,
										true);
								String LocalType = LocalTypeFull;
								if (LocalTypeFull.contains(TSDef.TestSetBuilder_ChildHeaderNameSpacer)) {
									LocalType = cStr.cutTo(LocalTypeFull, TSDef.TestSetBuilder_ChildHeaderNameSpacer,
											true);
								}
								List<String> subsubitems = GenerateSubitemList(ServiceRepoName, LocalType);
								if (subsubitems != null) {
									for (String ssi : subsubitems) {
										subitems.add(
												headerpackage + TSDef.TestSetBuilder_RecursionHeaderNameSpacer + ssi);
									}
								} else {
									if (verbosTestSetBuilder)
										SmartTSout.println(Header + " XXXX ERROR " + headerpackage
												+ TSDef.TestSetBuilder_RecursionHeaderNameSpacer
												+ TSDef.NotFoundIndicate);
									return null;
								}
							}
						}
					}
				}
				break;
			}
		}
		if (notfound) {
			if (verbosTestSetBuilder)
				SmartTSout.println(
						Header + " XXXX ERROR " + Type + TSDef.NotFound + " in " + ServiceRepoName + TSDef.Indicate);
			return null;
		}
		if (nullname) {
			if (verbosTestSetBuilder)
				SmartTSout.println(Header + " XXXX ERROR " + Type + TSDef.ErrorNoDataFound + " in " + ServiceRepoName
						+ TSDef.Indicate);
			return null;
		}
		for (int i = 0; i < subitems.size(); i++) {
			String tmp = ServiceRepoName + TSDef.TestSetBuilder_RecursionHeaderSourceRepo + subitems.get(i);
			subitems.set(i, tmp);
		}
		return subitems;
	}

	public String toString() {
		return toString(true, true);
	}

	public String toStringCommObjects() {
		return toString(true, false);
	}

	public String toStringServices() {
		return toString(false, true);
	}

	public String toString(boolean displayCommObjects, boolean displayServices) {
		cutString cStr = new cutString();
		String outString = "ServiceRepositoryTestSetContainer: " + ServiceRepositoryName + "\n";
		outString = outString + "";

		if (displayCommObjects) {
			outString = outString + "==========================================CommObjects\n";
			for (CommObjectTestSetContainer commobjTS : CommObjectTestSets) {
				outString = outString + "------------------------------------------" + commobjTS.TestEntityName + "\n";
				outString = outString + "---------------------CommObjectInfo\n";
				outString = outString + commobjTS.CommObjectInfo + "\n";
				outString = outString + "---------------------AttributeInfo\n";
				outString = outString + commobjTS.AttributeInfo + "\n";
				outString = outString + "---------------------TestData\n";
				outString = outString + commobjTS.TestData + "\n";
				outString = outString + "---------------------FlagString\n";
				outString = outString + commobjTS.FlagString() + "\n";
				outString = outString + "---------------------TestSet\n";
				if (commobjTS.TestSet.isEmpty())
					outString = outString + "LinkedOut\n";
				else
					outString = outString + cStr.List2DString(commobjTS.TestSet, " ", "|") + "\n";
			}
		}
		if (displayServices) {
			outString = outString + "==========================================Services\n";
			for (ServiceTestSetContainer serviceTS : ServiceTestSets) {
				outString = outString + "---------------------------------------------------------------------------\n";
				outString = outString + "------------------------------------------" + serviceTS.TestEntityName + "\n";
				outString = outString + "---------------------------------------------------------------------------\n";
				outString = outString + "---------------------ServiceName: " + serviceTS.ServiceName + "\n";
				outString = outString + "---------------------ServiceType: " + serviceTS.ServiceType + "\n";
				outString = outString + "---------------------PatternType: " + serviceTS.PatternType + "\n";
				outString = outString + "---------------------CommObjectList: ";
				for (String commobj : serviceTS.CommObjectList)
					outString = outString + commobj + " ";
				outString = outString + "\n";
				outString = outString + "---------------------OneOfTheCurrentlyHandledServicePattern: "
						+ serviceTS.OneOfTheCurrentlyHandledServicePattern + "\n";
				outString = outString + "---------------------ServiceInfo\n";
				outString = outString + serviceTS.ServiceInfo + "\n";
				outString = outString + "---------------------TestData\n";
				outString = outString + serviceTS.TestData + "\n";
				outString = outString + "---------------------FlagString\n";
				outString = outString + serviceTS.FlagString() + "\n";
				outString = outString + "---------------------TestSetSeed(s)\n";
				if (serviceTS.TestSetSeed.isEmpty())
					outString = outString + "isEmpty\n";
				else {
					for (String commobj : serviceTS.CommObjectList) {
						outString = outString + "-----------" + commobj + "\n";
						boolean found = false;
						for (TestSetSeedContainer seedcontainer : serviceTS.TestSetSeed) {
							if (seedcontainer.LinkedTo.equals(commobj)) {
								outString = outString + seedcontainer.toString() + "\n";
								found = true;
							}
						}
						if (!found) {
							outString = outString + "isEmpty\n";
						}
					}
				}
				outString = outString + "---------------------TestSet(s)\n";
				for (String testsetkey : serviceTS.TestSet.keySet()) {
					List<String> dataheadercsv = serviceTS.TestSetHeader.get(testsetkey);
					List<List<String>> datacsv = serviceTS.TestSet.get(testsetkey);
					outString = outString + "-----------" + testsetkey + "\n";

					if ((dataheadercsv != null) && (datacsv != null)) {
						int maxheaderlength = 0;
						for (String header : dataheadercsv) {
							int hl = header.length();
							if (hl > maxheaderlength) {
								maxheaderlength = hl;
							}
						}
						int maxentrylength = 0;
						int maxrowlength = 0;
						for (List<String> row : datacsv) {
							int rsz = row.size();
							if (rsz > maxrowlength)
								maxrowlength = rsz;
							for (String entry : row.subList(TestSetHeaderIndex + 1, row.size())) {
								int el = entry.length();
								if (entry.equals(cutString.CSV2Column_Default_EmptyIndicator))
									el = cutString.CSV2Column_Default_EmptyIndicator_Display.length();
								if (el > maxentrylength) {
									maxentrylength = el;
								}
							}
						}

						String ItemIndicator = "Item ▼";
						String TestNumberIndicator = "Test Number ▶";
						String Indicator = ItemIndicator + cStr.SW(maxheaderlength, ItemIndicator + TestNumberIndicator)
								+ TestNumberIndicator;
						if (dataheadercsv.size() == datacsv.size()) {
							outString = outString + Indicator + cStr.SW(maxheaderlength, Indicator) + ":";
							for (int i = 0; i < maxrowlength - 1; i++) {
								outString = outString + i + cStr.SW(maxentrylength, i + "") + "|";
							}
							outString = outString + "\n";
							for (int i = 0; i < dataheadercsv.size(); i++) {
								String h = dataheadercsv.get(i);
								outString = outString + h + cStr.SW(maxheaderlength, h) + ":";
								List<String> d = datacsv.get(i);
								outString = outString + cStr.ListStringSW(d.subList(TestSetHeaderIndex + 1, d.size()),
										maxentrylength, "|");
								outString = outString + "|\n";
							}
						} else {
							outString = outString + "XXXX ERROR Header, Data count mismatch | Headercount:"
									+ dataheadercsv.size() + " | Datacount:" + datacsv.size() + " START\n";
							outString = outString + "HEADER:\n";
							outString = outString + ItemIndicator + "\n";
							for (int i = 0; i < dataheadercsv.size(); i++) {
								String h = dataheadercsv.get(i);
								outString = outString + h + cStr.SW(maxheaderlength, h) + "\n";
							}
							String neoIndicator = cStr.SW(maxrowlength, TestNumberIndicator) + TestNumberIndicator;
							outString = outString + "DATA: " + neoIndicator;
							for (int i = 0; i < maxrowlength - 1; i++) {
								outString = outString + i + cStr.SW(maxentrylength, i + "") + "|";
							}
							outString = outString + "\n";
							for (int i = 0; i < datacsv.size(); i++) {
								List<String> d = datacsv.get(i);
								outString = outString + cStr.ListStringSW(d.subList(TestSetHeaderIndex + 1, d.size()),
										maxentrylength, "|");
								outString = outString + "|\n";
							}
							outString = outString + "XXXX ERROR Header, Data count mismatch | Headercount:"
									+ dataheadercsv.size() + " | Datacount:" + datacsv.size() + " END\n";
						}
					} else {
						outString = outString + "NULL \n";
					}
				}
			}
		}
		return outString;
	}

	public Boolean genCommObjectTestSetCSVFiles(IFolder LocationFolder) {
		Boolean savedOK = true;
		cutString cStr = new cutString();
		for (CommObjectTestSetContainer commobjTS : CommObjectTestSets) {
			IFile CommObjectTestSetCSVFile = LocationFolder.getFile(commobjTS.TestSetFileName);
			if (commobjTS.isEnum || commobjTS.isPrimitive)
				try {
					if (CommObjectTestSetCSVFile.exists()) {
						SmartTSConsole SmartTSout = new SmartTSConsole();
						SmartTSout.println("ERROR @ DOUBLE CREATE: " + CommObjectTestSetCSVFile.getName());
					}
					CommObjectTestSetCSVFile.create(
							new ByteArrayInputStream((cStr.List2DString(commobjTS.TestSet, ",", "\n")).getBytes()),
							true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
		}
		return savedOK;
	}

	public Boolean genServiceTestSetCSVFiles(IFolder LocationFolder) {
		Boolean savedOK = true;
		cutString cStr = new cutString();
		for (ServiceTestSetContainer serviceTS : ServiceTestSets) {
			for (String DataType : serviceTS.TestSet.keySet()) {
				IFile ServiceTestSetCSVFile = LocationFolder.getFile(serviceTS.getDataTypeTestSetFileName(DataType));
				try {
					if (ServiceTestSetCSVFile.exists()) {
						SmartTSConsole SmartTSout = new SmartTSConsole();
						SmartTSout.println("ERROR @ DOUBLE CREATE: " + ServiceTestSetCSVFile.getName());
					}
					ServiceTestSetCSVFile.create(
							new ByteArrayInputStream(
									(cStr.List2DString(serviceTS.TestSet.get(DataType), ",", "\n")).getBytes()),
							true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return savedOK;
	}

	static public ServiceRepositoryTestSetContainer XMLString2ServiceRepositoryTestSetContainer(String XML) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ServiceRepositoryTestSetContainer.class.getPackageName(),
					ServiceRepositoryTestSetContainer.class.getClassLoader());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader stringReader = new StringReader(XML);
			ServiceRepositoryTestSetContainer SRTS = new ServiceRepositoryTestSetContainer();
			SRTS = (ServiceRepositoryTestSetContainer) jaxbUnmarshaller.unmarshal(stringReader);
			return SRTS;
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout
					.println("ERROR @ ServiceRepositoryTestSetContainer::XMLString2ServiceRepositoryTestSetContainer");
		}
		return null;
	}

	static public String ServiceRepositoryTestSetContainer2XMLString(ServiceRepositoryTestSetContainer SRTS) {
		java.io.StringWriter stringWriter = new StringWriter();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ServiceRepositoryTestSetContainer.class.getPackageName(),
					ServiceRepositoryTestSetContainer.class.getClassLoader());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(SRTS, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout
					.println("ERROR @ ServiceRepositoryTestSetContainer::XMLString2ServiceRepositoryTestSetContainer :"
							+ SRTS.ServiceRepositoryName);
			e.printStackTrace();
			return null;
		}
	}

}
