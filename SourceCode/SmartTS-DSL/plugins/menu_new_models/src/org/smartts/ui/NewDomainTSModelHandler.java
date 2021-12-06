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
package org.smartts.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.AttributeInfo;
import org.smartdbe.common.smartmdsdwrapper.CommObjectInfo;
import org.smartdbe.common.smartmdsdwrapper.CommObjectURIInfo;
import org.smartdbe.common.smartmdsdwrapper.EnumInfo;
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.ServiceInfo;
import org.smartdbe.common.smartmdsdwrapper.ServiceRepoInfo;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.SmartResourceManager;
import org.smartts.dsl.console.SmartTSConsole;

public class NewDomainTSModelHandler {

	public String ReturnString = "NA";
	public String UserExit = "USER_EXIT";
	public String ERRORJAXB = "ERROR_JAXB";
	public String AllOk = "ALL_OK";
	public String NotServiceProject = "NOT_SERVICE_PROJECT";

	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();
	public TSDefine TSDef = new TSDefine();
	public Boolean verbosFoundItems = true;

	public void Run(IWorkbenchWindow window, IProject project) {
		SmartTSConsole SmartTSout = new SmartTSConsole();
		SmartTSout.clear();
		SmartTSout.println("NewDomainModelHandler.Run | IN");
		IProject ServiceRepoProject = project;
		String ServiceRepoName = ServiceRepoProject.getName();
		String servicemodelfilename = DBEDef.modelFolderName + ServiceRepoName + DBEDef.DomainServicesFileExtension;
		IFile servicemodelfile = ServiceRepoProject.getFile(servicemodelfilename);
		if (servicemodelfile.exists()) {
			boolean yescreateservice = MessageDialog.openConfirm(window.getShell(), "SmartTS",
					"Do you want to Create SmartTS Test Data for domain project \n" + ServiceRepoName);
			if (!yescreateservice) {
				SmartTSout.println("NewDomainModelHandler.Run | OUT");
				SmartTSout.line("ll");
				ReturnString = UserExit;
				return;
			}
			SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | IN");
			SmartTSout
					.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model " + ServiceRepoName);
			GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
			ServiceRepoInfo newSRI = getSmartMDSDDef.extractServiceRepoInfo(ServiceRepoName);
			List<String> serviceNewFileNames = new ArrayList<>();
			List<String> serviceNewFileContentss = new ArrayList<>();

			serviceNewFileNames.add(TSDef.tsmodelFolderName + ServiceRepoName + TSDef.ServiceRepoInfoXMLFileExtension);
			IO serviceio = new IO();
			String ServiceRepoInfoXML = serviceio.ServiceRepoInfo2XMLString(newSRI);
			if (null == ServiceRepoInfoXML) {
				SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model "
						+ ServiceRepoName + " JAXB Error !!");
				SmartTSout.println("NewDomainModelHandler.Run | OUT");
				SmartTSout.line("ll");
				ReturnString = ERRORJAXB;
				return;
			} else {
				serviceNewFileContentss.add(ServiceRepoInfoXML);
				serviceNewFileNames
						.add(TSDef.tsmodelFolderName + ServiceRepoName + TSDef.ServiceRepoInfoWikiFileExtension);
				serviceNewFileContentss.add(newSRI.toString());
			}

			try {
				IFolder ServiceRepoProject_modelTSfolder = ServiceRepoProject.getFolder(TSDef.tsmodelFolderName);
				IFolder ServiceRepoProject_modelTestDatafolder = ServiceRepoProject.getFolder(TSDef.testdocFolderName);
				IFolder ServiceRepoProject_modelCommObjectsTestDatafolder = ServiceRepoProject
						.getFolder(TSDef.commobjectstestdocFolderName);
				IFolder ServiceRepoProject_modelServicesTestDatafolder = ServiceRepoProject
						.getFolder(TSDef.servicestestdocFolderName);

				String missingbasictypes = "";

				if (!ServiceRepoProject_modelTSfolder.exists()) {
					ServiceRepoProject_modelTSfolder.create(true, true, null);
					SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model "
							+ ServiceRepoName + TSDef.Created + " FOLDER " + TSDef.tsmodelFolderName);
				}
				if (!ServiceRepoProject_modelTestDatafolder.exists()) {
					ServiceRepoProject_modelTestDatafolder.create(true, true, null);
					SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model "
							+ ServiceRepoName + TSDef.Created + " FOLDER " + TSDef.testdocFolderName);
				}
				if (!ServiceRepoProject_modelCommObjectsTestDatafolder.exists()) {
					ServiceRepoProject_modelCommObjectsTestDatafolder.create(true, true, null);
					SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model "
							+ ServiceRepoName + TSDef.Created + " FOLDER " + TSDef.commobjectstestdocFolderName);
				}
				if (!ServiceRepoProject_modelServicesTestDatafolder.exists()) {
					ServiceRepoProject_modelServicesTestDatafolder.create(true, true, null);
					SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model "
							+ ServiceRepoName + TSDef.Created + " FOLDER " + TSDef.servicestestdocFolderName);
				}

				for (int i = 0; i < newSRI.CommObjects.size(); i++) {
					CommObjectInfo coi = newSRI.CommObjects.get(i);
					IFolder coicommobjfolder = ServiceRepoProject_modelCommObjectsTestDatafolder
							.getFolder(coi.TestEntityName(newSRI.Name));
					if (coicommobjfolder.exists()) {
						if (verbosFoundItems)
							SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
									+ coi.Name + TSDef.Found);
					} else {
						coicommobjfolder.create(true, true, null);
						SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
								+ coi.Name + TSDef.CreatedIndicate);
					}
					IFile commobjectwikifile = coicommobjfolder
							.getFile(coicommobjfolder.getName() + TSDef.CommObjectInfoWikiFileExtension);
					if (commobjectwikifile.exists()) {
						if (verbosFoundItems)
							SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
									+ coi.Name + " | WIKI " + TSDef.Found);
					} else {
						commobjectwikifile.create(new ByteArrayInputStream((coi.toString()).getBytes()), true, null);
						SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
								+ coi.Name + " | WIKI " + TSDef.CreatedIndicate);
					}
					if (coi.isEnum) {
						String TestEntityName = EnumInfo.TestEntityName(newSRI.Name, coi.Name);
						String defaultcontents = TSDef.TestEntityNameIndicator + TestEntityName + "\n";
						for (int j = 0; j < coi.Enums.size(); j++) {
							EnumInfo ei = coi.Enums.get(j);
							defaultcontents = defaultcontents + ei.value + "," + ei.identifier + "\n";
						}
						defaultcontents = defaultcontents + TSDef.TestSetEnumIndicator + "\n";
						defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + "\n";
						for (int j = 0; j < coi.Enums.size(); j++) {
							EnumInfo ei = coi.Enums.get(j);
							defaultcontents = defaultcontents + ei.value + "," + TSDef.TestSetWikiSTART + ","
									+ "Test for identifier " + ei.identifier + "," + TSDef.TestSetWikiEND + "\n";
						}
						defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						IFile commobjectlocalfile1 = coicommobjfolder.getFile(TestEntityName + "_"
								+ TSDef.DataDefaultFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
						if (commobjectlocalfile1.exists()) {
							if (verbosFoundItems)
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
										+ coi.Name + " | " + TSDef.DataDefaultFileInsert + " DATA " + TSDef.Found);
						} else {
							SmartTSout.println(
									"NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: " + coi.Name
											+ " | " + TSDef.DataDefaultFileInsert + " DATA " + TSDef.CreatedIndicate);
							commobjectlocalfile1.create(new ByteArrayInputStream((defaultcontents).getBytes()), true,
									null);
						}
						IFile commobjectlocalfile2 = coicommobjfolder.getFile(TestEntityName + "_"
								+ TSDef.DataCustomFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
						if (commobjectlocalfile2.exists()) {
							if (verbosFoundItems)
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
										+ coi.Name + " | " + TSDef.DataCustomFileInsert + " DATA " + TSDef.Found);
						} else {
							SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
									+ coi.Name + " | " + TSDef.DataCustomFileInsert + " DATA " + TSDef.CreatedIndicate);
							commobjectlocalfile2.create(new ByteArrayInputStream((defaultcontents).getBytes()), true,
									null);
						}
					} else {
						for (int j = 0; j < coi.Attributes.size(); j++) {
							AttributeInfo ai = coi.Attributes.get(j);
							String TestEntityName = ai.TestEntityName(newSRI.Name, coi.Name);
							String defaultcontents = TSDef.TestEntityNameIndicator + TestEntityName + "\n";
							String defaultdatacontents = "";

							if (ai.isPrimitiveType) {
								defaultcontents = defaultcontents + TSDef.TestSetPrimitiveIndicator + "\n";
								defaultdatacontents = TSDef.BasicTypeDefaultContents.getOrDefault(ai.Type,
										TSDef.BasicTypeDefaultContents_MissingValueString);
								if (defaultdatacontents.equals(TSDef.BasicTypeDefaultContents_MissingValueString)) {
									defaultdatacontents = TSDef.DefaultContents_MissingValueString;
								}
							} else {
								defaultcontents = defaultcontents + TSDef.TestSetNonPrimitiveIndicator + "\n";
							}
							if (ai.isArrayType) {
								defaultcontents = defaultcontents + TSDef.TestSetArrayIndicator + "\n";
								if ((!ai.isImported) && (!ai.ArrayLengthString.equals(TSDef.TestSetArrayVarSz))) {
									defaultdatacontents = TSDef.Process(ai.Type, ai.ArrayLength);
									if (defaultdatacontents.equals(TSDef.ErrorStringZeroArraySize)) {
										defaultdatacontents = TSDef.ErrorStringZeroArraySize + ","
												+ TSDef.TestSetWikiSTART + "," + TSDef.ErrorStringZeroArraySize + ","
												+ TSDef.TestSetWikiEND + "\n";
									}
								} else {
									defaultdatacontents = TSDef.Process(ai.Type, -1);
								}
							}
							if (ai.isImported) {
								defaultcontents = defaultcontents + TSDef.TestSetImportIndicator + "\n";
								String importsourceSRIName = TSDef.ImportSourceDefaultString;
								for (int s = 0; s < newSRI.ReferencedServices.size(); s++) {
									String importsourcecandidate = newSRI.ReferencedServices.get(s);
									ServiceRepoInfo importsourcecandidateSRI = getSmartMDSDDef
											.extractServiceRepoInfo(importsourcecandidate);
									for (int can = 0; can < importsourcecandidateSRI.CommObjects.size(); can++) {
										if (importsourcecandidateSRI.CommObjects.get(can).Name.equals(ai.Type)) {
											importsourceSRIName = importsourcecandidate;
											break;
										}
									}
									if (!importsourceSRIName.equals(TSDef.ImportSourceDefaultString)) {
										break;
									}
								}
								TestEntityName = ai.TestEntityName(importsourceSRIName, coi.Name);
								defaultdatacontents = TSDef.TestSetImportIndicator + "," + TSDef.TestSetWikiSTART + ","
										+ TSDef.ImportedPrefix_only + "," + TSDef.TestSetWikiEND + "\n";
								if (ai.isArrayType) {
									defaultcontents = defaultcontents + TSDef.TestSetNonPrimitiveArrayIndicator + ","
											+ TSDef.TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT + ","
											+ TSDef.TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT_COUNT
											+ "\n";
								}
							} else {
								defaultcontents = defaultcontents + TSDef.TestSetLocalIndicator + "\n";
								if (!ai.isPrimitiveType) {
									defaultdatacontents = TSDef.TestSetLocalIndicator + "," + TSDef.TestSetWikiSTART
											+ "," + TSDef.LocalPrefix_only + "," + TSDef.TestSetWikiEND + "\n";
									if (ai.isArrayType) {
										defaultcontents = defaultcontents + TSDef.TestSetNonPrimitiveArrayIndicator
												+ "," + TSDef.TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT
												+ ","
												+ TSDef.TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT_COUNT
												+ "\n";
									}
								}
								TestEntityName = ai.TestEntityName(newSRI.Name, coi.Name);
							}

							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";

							IFolder attributefolder = coicommobjfolder.getFolder(TestEntityName);

							if (attributefolder.exists()) {
								if (verbosFoundItems)
									SmartTSout.println(
											"NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
													+ coi.Name + " | Attribute: " + ai.Name + " | FOLDER "
													+ TSDef.Found);
							} else {
								attributefolder.create(true, true, null);
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
										+ coi.Name + " | Attribute: " + ai.Name + " | FOLDER " + TSDef.CreatedIndicate);
							}
							IFile commobjectlocalfile1 = attributefolder.getFile(TestEntityName + "_"
									+ TSDef.DataDefaultFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
							if (commobjectlocalfile1.exists()) {
								if (verbosFoundItems)
									SmartTSout.println(
											"NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
													+ coi.Name + " | Attribute: " + ai.Name + " | "
													+ TSDef.DataDefaultFileInsert + " DATA " + TSDef.Found);
							} else {
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
										+ coi.Name + " | Attribute: " + ai.Name + " | " + TSDef.DataDefaultFileInsert
										+ " DATA " + TSDef.CreatedIndicate);
								commobjectlocalfile1.create(new ByteArrayInputStream((defaultcontents).getBytes()),
										true, null);
							}
							IFile commobjectlocalfile2 = attributefolder.getFile(TestEntityName + "_"
									+ TSDef.DataCustomFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
							if (commobjectlocalfile2.exists()) {
								if (verbosFoundItems)
									SmartTSout.println(
											"NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
													+ coi.Name + " | Attribute: " + ai.Name + " | "
													+ TSDef.DataCustomFileInsert + " DATA " + TSDef.Found);
							} else {
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | CommObject: "
										+ coi.Name + " | Attribute: " + ai.Name + " | " + TSDef.DataCustomFileInsert
										+ " DATA " + TSDef.CreatedIndicate);
								commobjectlocalfile2.create(new ByteArrayInputStream((defaultcontents).getBytes()),
										true, null);
							}
						}
					}
				}
				if (missingbasictypes.isEmpty()) {
					for (int i = 0; i < newSRI.Services.size(); i++) {
						ServiceInfo si = newSRI.Services.get(i);
						String TestEntityName = si.TestEntityName(newSRI.Name);
						IFolder sicommobjfolder = ServiceRepoProject_modelServicesTestDatafolder
								.getFolder(TestEntityName);
						if (sicommobjfolder.exists()) {
							if (verbosFoundItems)
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Service: "
										+ si.Name + " FOLDER " + TSDef.Found);
						} else {
							sicommobjfolder.create(true, true, null);
							SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Service: "
									+ si.Name + " FOLDER " + TSDef.CreatedIndicate);
						}
						IFile servicewikifile = sicommobjfolder
								.getFile(TestEntityName + TSDef.ServiceInfoWikiFileExtension);

						if (servicewikifile.exists()) {
							if (verbosFoundItems)
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Service: "
										+ si.Name + " WIKI " + TSDef.Found);
						} else {
							servicewikifile.create(new ByteArrayInputStream((si.toString()).getBytes()), true, null);
							SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Service: "
									+ si.Name + " WIKI " + TSDef.CreatedIndicate);
						}

						String defaultcontents = TSDef.TestEntityNameIndicator + TestEntityName + "\n";
						defaultcontents = defaultcontents + TSDef.ServiceNameIndicator + si.Name + "\n";
						defaultcontents = defaultcontents + TSDef.ServiceTypeIndicator + si.ServiceType + "\n";
						defaultcontents = defaultcontents + TSDef.ServicePatternIndicator + si.PatternType + "\n";
						defaultcontents = defaultcontents + TSDef.OneOfTheCurrentlyHandledServicePatternIndicator
								+ si.OneOfTheCurrentlyHandledServicePattern + "\n";

						String defaultdatacontents = TSDef.ErrorNoDataFound;
						Boolean noDataFound = true;
						if (si.DataType.isAssigned()) {
							noDataFound = false;
							defaultdatacontents = CommObjectURIInfo2defaultdatacontents(si.DataType);
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket("DataType") + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}
						if (si.RequestType.isAssigned()) {
							noDataFound = false;
							defaultdatacontents = CommObjectURIInfo2defaultdatacontents(si.RequestType);
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket("RequestType") + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}
						if (si.AnswerType.isAssigned()) {
							noDataFound = false;
							defaultdatacontents = CommObjectURIInfo2defaultdatacontents(si.AnswerType);
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket("AnswerType") + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}
						if (si.EventType.isAssigned()) {
							noDataFound = false;
							defaultdatacontents = CommObjectURIInfo2defaultdatacontents(si.EventType);
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket("EventType") + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}
						if (si.ActivationType.isAssigned()) {
							noDataFound = false;
							defaultdatacontents = CommObjectURIInfo2defaultdatacontents(si.ActivationType);
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket("ActivationType") + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}
						if (si.EventStateType.isAssigned()) {
							noDataFound = false;
							defaultdatacontents = CommObjectURIInfo2defaultdatacontents(si.EventStateType);
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket("EventStateType") + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}
						if (noDataFound) {
							defaultcontents = defaultcontents + "\n" + TSDef.TestSetDataSTART + ","
									+ TSDef.addBracket(TSDef.ErrorNoDataFound) + "\n";
							defaultcontents = defaultcontents + defaultdatacontents;
							defaultcontents = defaultcontents + TSDef.TestSetDataEND + "\n";
						}

						defaultcontents = defaultcontents + "\n\n\n\n" + TSDef.TestSetWikiSTART
								+ TSDef.DataCustomWikiInsert + TSDef.TestSetWikiEND + "\n";

						IFile servicelocalfile = sicommobjfolder
								.getFile(TestEntityName + TSDef.ServiceRepoTestDataFileNamePostfix);

						if (servicelocalfile.exists()) {
							if (verbosFoundItems)
								SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Service: "
										+ si.Name + " DATA " + TSDef.Found);
						} else {
							servicelocalfile.create(new ByteArrayInputStream((defaultcontents).getBytes()), true, null);
							SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | Service: "
									+ si.Name + " DATA " + TSDef.CreatedIndicate);
						}
					}
				} else {
					SmartTSout.println(TSDef.DSLERROR + " | MISSING BASIC TYPE CONTENTS FOR : " + missingbasictypes);
				}

				for (int i = 0; i < serviceNewFileNames.size(); i++) {
					String NewFileName = serviceNewFileNames.get(i);
					String NewFileContents = serviceNewFileContentss.get(i);
					String NewDisplay = ServiceRepoName + TSDef.Created + NewFileName;
					IFile Newfile = ServiceRepoProject.getFile(NewFileName);
					if (Newfile.exists()) {
						Newfile.delete(true, null);
					}
					Newfile.create(new ByteArrayInputStream((NewFileContents).getBytes()), true, null);
					SmartTSout.println(
							"NewDomainModelHandler.Run | Create SmartTS Test Data | Domain Model " + NewDisplay);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			SmartTSout.println("NewDomainModelHandler.Run | Create SmartTS Test Data | OUT");
			SmartTSout.println("NewDomainModelHandler.Run | OUT");
			SmartTSout.line("ll");
			ReturnString = AllOk;
			return;
		} else {
			ReturnString = NotServiceProject;
			return;
		}
	}

	public String CommObjectURIInfo2defaultdatacontents(CommObjectURIInfo coui) {
		String defaultdatacontents = TSDef.ErrorNoDataFound;
		if (coui.isAssigned() && coui.isValid()) {
			defaultdatacontents = coui.CommObjectRepoName + "," + coui.CommObjectName + ","
					+ TSDef.TestSetBuilder_Permute + "," + TSDef.DataDefaultFileInsert + "," + TSDef.DataSelectON
					+ "\n";
			defaultdatacontents = defaultdatacontents + coui.CommObjectRepoName + "," + coui.CommObjectName + ","
					+ TSDef.TestSetBuilder_Once + "," + TSDef.DataCustomFileInsert + "," + TSDef.DataSelectON + "\n";
		}
		return defaultdatacontents;
	}
}
