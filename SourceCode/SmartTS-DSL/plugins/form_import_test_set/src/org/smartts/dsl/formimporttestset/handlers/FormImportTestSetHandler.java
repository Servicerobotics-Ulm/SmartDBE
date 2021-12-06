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
package org.smartts.dsl.formimporttestset.handlers;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.AttributeInfo;
import org.smartdbe.common.smartmdsdwrapper.CommObjectInfo;
import org.smartdbe.common.smartmdsdwrapper.EnumInfo;
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.ServiceInfo;
import org.smartdbe.common.smartmdsdwrapper.ServiceRepoInfo;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.SmartResourceManager;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString;
import org.smartts.common.testsetcontainers.CommObjectTestSetContainer;
import org.smartts.common.testsetcontainers.ServiceRepositoryTestSetContainer;
import org.smartts.common.testsetcontainers.ServiceTestSetContainer;
import org.smartts.dsl.console.SmartTSConsole;

public class FormImportTestSetHandler extends AbstractHandler {

	final public String Spacer = " | ";
	final public String Identifier = "Import Test Set";
	final public String Header = Identifier + Spacer;
	public String runID = "";
	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();
	public TSDefine TSDef = new TSDefine();
	private SmartTSConsole SmartTSout = new SmartTSConsole();
	private GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
	private IO io = new IO();

	public Boolean verbosSaveLogs = true;
	public Boolean verbosFoundItems_CommObjects = false;
	public Boolean verbosFoundItems_Services = false;
	public Boolean verbosCompile_CommObjectTestSetContainer = false;
	public Boolean verbosCompile_ServiceTestSetContainer = false;
	public Boolean verbosTestSetBuilder = false;
	public Boolean verbosServiceRepositoryTestSet = false;
	public Boolean verbosServiceRepositoryTestSet_CommObjects_Only = false;
	public Boolean verbosServiceRepositoryTestSet_Services_Only = false;

	public ServiceRepositoryTestSetContainer ServiceRepositoryTestSet;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		runID = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

		CommObjectTestSetContainer.verbosCompile = verbosCompile_CommObjectTestSetContainer;
		ServiceTestSetContainer.verbosCompile = verbosCompile_ServiceTestSetContainer;
		ServiceRepositoryTestSetContainer.verbosTestSetBuilder = verbosTestSetBuilder;
		SmartTSout.SuperUserSaveLogPause = !verbosSaveLogs;

		ServiceRepositoryTestSet = new ServiceRepositoryTestSetContainer();

		SmartTSout.clear();
		SmartTSout.println(Header + "IN");

		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = SRMan.getSelectedResource(window);
		IProject project = null;
		try {
			project = resource.getProject();
		} catch (Exception e1) {
			SmartTSout.println(Header + "XXXX Error Accessing Project Resources !!");
			SmartTSout.println(
					Header + "XXXX Pop and use this menu on Project root folder or on one of the model files.");
			SmartTSout.println(Header + "OUT");
			return null;
		}
		if (project.getRawLocation() != null) {
			if (SRMan.isDomainProject(project)) {
				SmartTSout.println(Header + "Domain Project Found");
				handleDomainProject(window, project);
			} else {
				if (SRMan.isComponentProject(project)) {
					SmartTSout.println(Header + "Component Project Found");
					handleComponentProject(window, project);
				} else {
					if (SRMan.isSystemProject(project)) {
						SmartTSout.println(Header + "System Project Found");
						handleSystemProject(window, project);
					} else {
						SmartTSout.println(Header + "No Relevant Project Found");
					}
				}
			}
		} else {
			SmartTSout.println(Header + "WORKSPACE ERROR !! project.getRawLocation() is found to be null.");
		}
		SmartTSout.println(Header + "OUT");

		try {
			IFolder TSfolder = project.getFolder(TSDef.tsmodelFolderName);
			if (!TSfolder.exists())
				TSfolder.create(true, true, null);
			IFolder TSLogfolder = project.getFolder(TSDef.tsmodelLogFolderName);
			if (!TSLogfolder.exists())
				TSLogfolder.create(true, true, null);
			IFile Log = TSLogfolder.getFile(Identifier + runID + TSDef.LogFileExtension);
			IFile LogLatest = TSLogfolder.getFile(Identifier + TSDef.LatestFileIndicater + TSDef.LogFileExtension);
			SmartTSout.SaveLog(Log);
			SmartTSout.SaveLog(LogLatest);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		CommObjectTestSetContainer.reset_verbosCompile();
		ServiceTestSetContainer.reset_verbosCompile();
		ServiceRepositoryTestSetContainer.reset_verbosTestSetBuilder();

		return null;
	}

	public void handleDomainProject(IWorkbenchWindow window, IProject project) {
		String LocalHeader = Header + "handleDomainProject" + Spacer;
		String UseHeader = LocalHeader;
		SmartTSout.println(LocalHeader + "IN");
		String ServiceRepoName = project.getName();
		ServiceRepositoryTestSet.ServiceRepositoryName = ServiceRepoName;
		boolean yescreateservice = MessageDialog.openConfirm(window.getShell(), "SmartTS",
				"Do you want to Import SmartTS Test Set for Domain project:" + ServiceRepoName
						+ "\n\nNote: This can take a long time to process !!");
		if (!yescreateservice) {
			SmartTSout.println(LocalHeader + "OUT");
			SmartTSout.line("ll");
			return;
		}
		ServiceRepoInfo newSRI = getSmartMDSDDef.extractServiceRepoInfo(ServiceRepoName);
		try {
			boolean errorcase_missing = false;
			List<String> errorcase_missing_log = new ArrayList<>();
			boolean errorcase_syntaxerror = false;
			List<String> errorcase_syntaxerror_log = new ArrayList<>();
			boolean errorcase_testsetbuilder = false;
			List<String> errorcase_testsetbuilder_log = new ArrayList<>();
			boolean warningcase = false;
			List<String> warningcase_log = new ArrayList<>();

			// Checking TestData Folder Structure
			printband();
			UseHeader = LocalHeader + "Checking TestData Folder Structure" + Spacer;
			IFolder TSfolder = project.getFolder(TSDef.tsmodelFolderName);
			IFolder TSLogfolder = project.getFolder(TSDef.tsmodelLogFolderName);
			IFolder TestDatafolder = project.getFolder(TSDef.testdocFolderName);
			IFolder CommObjectsTestDatafolder = project.getFolder(TSDef.commobjectstestdocFolderName);
			IFolder ServicesTestDatafolder = project.getFolder(TSDef.servicestestdocFolderName);
			if (!TSfolder.exists() || !TestDatafolder.exists() || !CommObjectsTestDatafolder.exists()
					|| !ServicesTestDatafolder.exists()) {
				if (!TSfolder.exists())
					SmartTSout.println(UseHeader + "XXXX Error Missing Folder : " + TSDef.tsmodelFolderName);
				else if (!TestDatafolder.exists())
					SmartTSout.println(UseHeader + "XXXX Error Missing Folder : " + TSDef.testdocFolderName);
				else {
					if (!CommObjectsTestDatafolder.exists())
						SmartTSout.println(
								UseHeader + "XXXX Error Missing Folder : " + TSDef.commobjectstestdocFolderName);
					if (!ServicesTestDatafolder.exists())
						SmartTSout
								.println(UseHeader + "XXXX Error Missing Folder : " + TSDef.servicestestdocFolderName);
				}
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			}
			if (!TSLogfolder.exists())
				TSLogfolder.create(true, true, null);
			SmartTSout.println(UseHeader + "ALL OK");
			// Checking Domain Repository Info XML File
			printband();
			UseHeader = LocalHeader + "Checking Domain Repository Info File" + Spacer;
			String ServiceRepoXMLFile_Name = ServiceRepoName + TSDef.ServiceRepoInfoXMLFileExtension;
			String ServiceRepoXMLFile_Path = TSDef.tsmodelFolderName + ServiceRepoXMLFile_Name;
			IFile ServiceRepoXMLFile = project.getFile(ServiceRepoXMLFile_Path);
			if (!ServiceRepoXMLFile.exists()) {
				SmartTSout.println(UseHeader + "XXXX Error Missing File : " + ServiceRepoXMLFile_Path);
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			}
			String ServiceRepoInfoXML = io.ServiceRepoInfo2XMLString(newSRI);
			if (null == ServiceRepoInfoXML) {
				SmartTSout.println(UseHeader + ServiceRepoName + " JAXB Error !!");
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			} else {
				String ServiceRepoInfoXML_fromFile = io.FilePath2String(ServiceRepoXMLFile);
				if (!ServiceRepoInfoXML_fromFile.equals(ServiceRepoInfoXML)) {
					SmartTSout.println(UseHeader + "XXXX Error Matching File : " + ServiceRepoXMLFile_Path);
					SmartTSout.println(UseHeader + "XML File doesn't match Domain Model. Re-Generate !!");
					SmartTSout.println(LocalHeader + "OUT");
					SmartTSout.line("ll");
					return;
				}
			}
			SmartTSout.println(UseHeader + "ALL OK");
			// Checking Domain Repository Info Wiki File
			printband();
			UseHeader = LocalHeader + "Checking Domain Repository Wiki File" + Spacer;
			String ServiceRepoWikiFile_Name = ServiceRepoName + TSDef.ServiceRepoInfoWikiFileExtension;
			String ServiceRepoWikiFile_Path = TSDef.tsmodelFolderName + ServiceRepoWikiFile_Name;
			IFile ServiceRepoWikiFile = project.getFile(ServiceRepoWikiFile_Path);
			if (!ServiceRepoWikiFile.exists()) {
				String Log2Print = UseHeader + "XXXX Warning Missing File : " + ServiceRepoWikiFile_Path;
				warningcase_log.add(Log2Print);
				SmartTSout.println(Log2Print);
				warningcase = true;
			} else {
				SmartTSout.println(UseHeader + "ALL OK");
			}
			// Checking CommObject Test Data
			printband();
			UseHeader = LocalHeader + "Checking CommObject Test Data" + Spacer;
			for (int i = 0; i < newSRI.CommObjects.size(); i++) {
				CommObjectInfo coi = newSRI.CommObjects.get(i);
				String TestEntityName_coi = coi.TestEntityName(newSRI.Name);
				SmartTSout.lineTag(TestEntityName_coi);
				IFolder coicommobjfolder = CommObjectsTestDatafolder.getFolder(TestEntityName_coi);
				if (coicommobjfolder.exists()) {
					if (verbosFoundItems_CommObjects)
						SmartTSout.println(UseHeader + TestEntityName_coi + Spacer + "FOLDER " + TSDef.Found);

					if (coi.isEnum) {
						String TestEntityName_Enum = EnumInfo.TestEntityName(newSRI.Name, coi.Name);

						IFile EnumWikiFile = coicommobjfolder
								.getFile(coicommobjfolder.getName() + TSDef.CommObjectInfoWikiFileExtension);
						if (EnumWikiFile.exists()) {
							if (verbosFoundItems_CommObjects)
								SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "Wiki " + TSDef.Found);
						} else {
							String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "Wiki "
									+ TSDef.NotFoundIndicate;
							warningcase_log.add(Log2Print);
							SmartTSout.println(Log2Print);
							warningcase = true;
						}

						IFile DefaultEnumTestDataFile = coicommobjfolder.getFile(TestEntityName_Enum + "_"
								+ TSDef.DataDefaultFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
						if (DefaultEnumTestDataFile.exists()) {
							if (verbosFoundItems_CommObjects)
								SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "TestData "
										+ TSDef.DataDefaultFileInsert + " " + TSDef.Found);
							CommObjectTestSetContainer newCommObjectTestSet = new CommObjectTestSetContainer(
									DefaultEnumTestDataFile, coi);
							if (newCommObjectTestSet.isInvalid) {
								String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "TestData "
										+ TSDef.DataDefaultFileInsert + " " + TSDef.InvalidIndicate;
								errorcase_syntaxerror_log.add(Log2Print);
								errorcase_syntaxerror_log.add(newCommObjectTestSet.LogString);
								SmartTSout.println(Log2Print);
								errorcase_syntaxerror = true;
							} else {
								SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "TestData "
										+ TSDef.DataDefaultFileInsert + " " + TSDef.Valid);
							}
							ServiceRepositoryTestSet.addNewCommObjectTestSet(newCommObjectTestSet);
						} else {
							String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "TestData "
									+ TSDef.DataDefaultFileInsert + " " + TSDef.NotFoundIndicate;
							errorcase_missing_log.add(Log2Print);
							SmartTSout.println(Log2Print);
							errorcase_missing = true;
						}
						IFile CustomEnumTestDataFile = coicommobjfolder.getFile(TestEntityName_Enum + "_"
								+ TSDef.DataCustomFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
						if (CustomEnumTestDataFile.exists()) {
							if (verbosFoundItems_CommObjects)
								SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "TestData "
										+ TSDef.DataCustomFileInsert + " " + TSDef.Found);
							CommObjectTestSetContainer newCommObjectTestSet = new CommObjectTestSetContainer(
									CustomEnumTestDataFile, coi);
							if (newCommObjectTestSet.isInvalid) {
								String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "TestData "
										+ TSDef.DataCustomFileInsert + " " + TSDef.InvalidIndicate;
								errorcase_syntaxerror_log.add(Log2Print);
								errorcase_syntaxerror_log.add(newCommObjectTestSet.LogString);
								SmartTSout.println(Log2Print);
								errorcase_syntaxerror = true;
							} else {
								SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "TestData "
										+ TSDef.DataCustomFileInsert + " " + TSDef.Valid);
							}
							ServiceRepositoryTestSet.addNewCommObjectTestSet(newCommObjectTestSet);
						} else {
							String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "TestData "
									+ TSDef.DataCustomFileInsert + " " + TSDef.NotFoundIndicate;
							errorcase_missing_log.add(Log2Print);
							SmartTSout.println(Log2Print);
							errorcase_missing = true;
						}
						for (IResource member : coicommobjfolder.members()) {
							cutString cStr = new cutString();
							String membername = member.getName();
							if (membername.contains(TestEntityName_Enum)
									&& membername.endsWith(TSDef.ServiceRepoTestDataFileNamePostfix)) {
								String CustomXSetname = cStr.cutFromNextTo(membername, TSDef.DataCustomFileInsert,
										TSDef.ServiceRepoTestDataFileNamePostfix, true);
								if (!(CustomXSetname.isBlank() || CustomXSetname.isEmpty())) {
									CustomXSetname = TSDef.DataCustomFileInsert + CustomXSetname;
									if (verbosFoundItems_CommObjects)
										SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "TestData "
												+ CustomXSetname + " " + TSDef.Found);

									IFile CustomXEnumTestDataFile = coicommobjfolder.getFile(membername);
									if (CustomXEnumTestDataFile.exists()) { // Double Check
										CommObjectTestSetContainer newCommObjectTestSet = new CommObjectTestSetContainer(
												CustomXEnumTestDataFile, coi);
										if (newCommObjectTestSet.isInvalid) {
											String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "TestData "
													+ CustomXSetname + " " + TSDef.InvalidIndicate;
											errorcase_syntaxerror_log.add(Log2Print);
											errorcase_syntaxerror_log.add(newCommObjectTestSet.LogString);
											SmartTSout.println(Log2Print);
											errorcase_syntaxerror = true;
										} else {
											SmartTSout.println(UseHeader + TestEntityName_Enum + Spacer + "TestData "
													+ CustomXSetname + " " + TSDef.Valid);
										}
										ServiceRepositoryTestSet.addNewCommObjectTestSet(newCommObjectTestSet);
									} else {
										String Log2Print = UseHeader + TestEntityName_Enum + Spacer + "TestData "
												+ CustomXSetname + " " + TSDef.FileIOError;
										errorcase_missing_log.add(Log2Print);
										SmartTSout.println(Log2Print);
										errorcase_missing = true;
									}
								}
							}
						}

					} else {
						IFile CommObjectWikiFile = coicommobjfolder
								.getFile(coicommobjfolder.getName() + TSDef.CommObjectInfoWikiFileExtension);
						if (CommObjectWikiFile.exists()) {
							if (verbosFoundItems_CommObjects)
								SmartTSout.println(UseHeader + TestEntityName_coi + Spacer + "Wiki " + TSDef.Found);
						} else {
							String Log2Print = UseHeader + TestEntityName_coi + Spacer + "Wiki "
									+ TSDef.NotFoundIndicate;
							warningcase_log.add(Log2Print);
							SmartTSout.println(Log2Print);
							warningcase = true;
						}

						for (int j = 0; j < coi.Attributes.size(); j++) {
							AttributeInfo ai = coi.Attributes.get(j);
							String TestEntityName_Attribute = ai.TestEntityName(newSRI.Name, coi.Name);
							SmartTSout.lineTag("-", TestEntityName_Attribute);
							if (ai.isImported) {
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
								TestEntityName_Attribute = ai.TestEntityName(importsourceSRIName, coi.Name);
							}

							IFolder attributefolder = coicommobjfolder.getFolder(TestEntityName_Attribute);
							if (attributefolder.exists()) {
								if (verbosFoundItems_CommObjects)
									SmartTSout.println(
											UseHeader + TestEntityName_Attribute + Spacer + "FOLDER " + TSDef.Found);

								IFile DefaultTestDataFile = attributefolder.getFile(TestEntityName_Attribute + "_"
										+ TSDef.DataDefaultFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
								if (DefaultTestDataFile.exists()) {
									if (verbosFoundItems_CommObjects)
										SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer + "TestData "
												+ TSDef.DataDefaultFileInsert + " " + TSDef.Found);
									CommObjectTestSetContainer newCommObjectTestSet = new CommObjectTestSetContainer(
											DefaultTestDataFile, coi, ai);
									if (newCommObjectTestSet.isInvalid) {
										String Log2Print = UseHeader + TestEntityName_Attribute + Spacer + "TestData "
												+ TSDef.DataDefaultFileInsert + " " + TSDef.InvalidIndicate;
										errorcase_syntaxerror_log.add(Log2Print);
										errorcase_syntaxerror_log.add(newCommObjectTestSet.LogString);
										SmartTSout.println(Log2Print);
										errorcase_syntaxerror = true;
									} else {
										SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer + "TestData "
												+ TSDef.DataDefaultFileInsert + " " + TSDef.Valid);
										if (newCommObjectTestSet.isImport) {
											SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer
													+ "TestData " + TSDef.DataDefaultFileInsert + " " + TSDef.Import
													+ " From " + newCommObjectTestSet.ImportSourceRepository
													+ TSDef.Indicate);
										}
									}
									ServiceRepositoryTestSet.addNewCommObjectTestSet(newCommObjectTestSet);
								} else {
									String Log2Print = UseHeader + TestEntityName_Attribute + Spacer + "TestData "
											+ TSDef.DataDefaultFileInsert + " " + TSDef.NotFoundIndicate;
									errorcase_missing_log.add(Log2Print);
									SmartTSout.println(Log2Print);
									errorcase_missing = true;
								}

								IFile CustomTestDataFile = attributefolder.getFile(TestEntityName_Attribute + "_"
										+ TSDef.DataCustomFileInsert + TSDef.ServiceRepoTestDataFileNamePostfix);
								if (CustomTestDataFile.exists()) {
									if (verbosFoundItems_CommObjects)
										SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer + "TestData "
												+ TSDef.DataCustomFileInsert + " " + TSDef.Found);
									CommObjectTestSetContainer newCommObjectTestSet = new CommObjectTestSetContainer(
											CustomTestDataFile, coi, ai);
									if (newCommObjectTestSet.isInvalid) {
										String Log2Print = UseHeader + TestEntityName_Attribute + Spacer + "TestData "
												+ TSDef.DataCustomFileInsert + " " + TSDef.InvalidIndicate;
										errorcase_syntaxerror_log.add(Log2Print);
										errorcase_syntaxerror_log.add(newCommObjectTestSet.LogString);
										SmartTSout.println(Log2Print);
										errorcase_syntaxerror = true;
									} else {
										SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer + "TestData "
												+ TSDef.DataCustomFileInsert + " " + TSDef.Valid);
										if (newCommObjectTestSet.isImport) {
											SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer
													+ "TestData " + TSDef.DataDefaultFileInsert + " " + TSDef.Import
													+ " From " + newCommObjectTestSet.ImportSourceRepository
													+ TSDef.Indicate);
										}
									}
									ServiceRepositoryTestSet.addNewCommObjectTestSet(newCommObjectTestSet);
								} else {
									String Log2Print = UseHeader + TestEntityName_Attribute + Spacer + "TestData "
											+ TSDef.DataCustomFileInsert + " " + TSDef.NotFoundIndicate;
									errorcase_missing_log.add(Log2Print);
									SmartTSout.println(Log2Print);
									errorcase_missing = true;
								}

								for (IResource member : attributefolder.members()) {
									cutString cStr = new cutString();
									String membername = member.getName();
									if (membername.contains(TestEntityName_Attribute)
											&& membername.endsWith(TSDef.ServiceRepoTestDataFileNamePostfix)) {
										String CustomXSetname = cStr.cutFromNextTo(membername,
												TSDef.DataCustomFileInsert, TSDef.ServiceRepoTestDataFileNamePostfix,
												true);
										if (!(CustomXSetname.isBlank() || CustomXSetname.isEmpty())) {
											CustomXSetname = TSDef.DataCustomFileInsert + CustomXSetname;
											if (verbosFoundItems_CommObjects)
												SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer
														+ "TestData " + CustomXSetname + " " + TSDef.Found);

											IFile CustomXEnumTestDataFile = attributefolder.getFile(membername);
											if (CustomXEnumTestDataFile.exists()) { // Double Check
												CommObjectTestSetContainer newCommObjectTestSet = new CommObjectTestSetContainer(
														CustomXEnumTestDataFile, coi);
												if (newCommObjectTestSet.isInvalid) {
													String Log2Print = UseHeader + TestEntityName_Attribute + Spacer
															+ "TestData " + CustomXSetname + " "
															+ TSDef.InvalidIndicate;
													errorcase_syntaxerror_log.add(Log2Print);
													errorcase_syntaxerror_log.add(newCommObjectTestSet.LogString);
													SmartTSout.println(Log2Print);
													errorcase_syntaxerror = true;
												} else {
													SmartTSout.println(UseHeader + TestEntityName_Attribute + Spacer
															+ "TestData " + CustomXSetname + " " + TSDef.Valid);
												}
												ServiceRepositoryTestSet.addNewCommObjectTestSet(newCommObjectTestSet);
											} else {
												String Log2Print = UseHeader + TestEntityName_Attribute + Spacer
														+ "TestData " + CustomXSetname + " " + TSDef.FileIOError;
												errorcase_missing_log.add(Log2Print);
												SmartTSout.println(Log2Print);
												errorcase_missing = true;
											}
										}
									}
								}

							} else {
								String Log2Print = UseHeader + TestEntityName_Attribute + Spacer + "FOLDER "
										+ TSDef.NotFoundIndicate;
								errorcase_missing_log.add(Log2Print);
								SmartTSout.println(Log2Print);
								errorcase_missing = true;
							}
						}
					}

				} else {
					String Log2Print = UseHeader + TestEntityName_coi + Spacer + "FOLDER " + TSDef.NotFoundIndicate;
					errorcase_missing_log.add(Log2Print);
					SmartTSout.println(Log2Print);
					errorcase_missing = true;
				}
			}
			// Checking Services Test Data
			printband();
			UseHeader = LocalHeader + "Checking Services Test Data" + Spacer;
			for (int i = 0; i < newSRI.Services.size(); i++) {
				ServiceInfo si = newSRI.Services.get(i);
				String TestEntityName_si = si.TestEntityName(newSRI.Name);
				SmartTSout.lineTag(TestEntityName_si);
				IFolder siServiceTestDataFolder = ServicesTestDatafolder.getFolder(TestEntityName_si);
				if (siServiceTestDataFolder.exists()) {
					if (verbosFoundItems_Services)
						SmartTSout.println(UseHeader + siServiceTestDataFolder + Spacer + "FOLDER " + TSDef.Found);
				} else {
					String Log2Print = UseHeader + TestEntityName_si + Spacer + "FOLDER " + TSDef.NotFoundIndicate;
					errorcase_missing_log.add(Log2Print);
					SmartTSout.println(Log2Print);
					errorcase_missing = true;
				}
				IFile siWikiFile = siServiceTestDataFolder
						.getFile(siServiceTestDataFolder.getName() + TSDef.ServiceInfoWikiFileExtension);
				if (siWikiFile.exists()) {
					if (verbosFoundItems_Services)
						SmartTSout.println(UseHeader + TestEntityName_si + Spacer + "Wiki " + TSDef.Found);
				} else {
					String Log2Print = UseHeader + TestEntityName_si + Spacer + "Wiki " + TSDef.NotFoundIndicate;
					warningcase_log.add(Log2Print);
					SmartTSout.println(Log2Print);
					warningcase = true;
				}
				IFile siTestDataFile = siServiceTestDataFolder
						.getFile(siServiceTestDataFolder.getName() + TSDef.ServiceRepoTestDataFileNamePostfix);
				if (siTestDataFile.exists()) {
					if (verbosFoundItems_Services)
						SmartTSout.println(UseHeader + TestEntityName_si + Spacer + "TestData " + TSDef.Found);
					ServiceTestSetContainer newServiceTestSet = new ServiceTestSetContainer(siTestDataFile, si);
					boolean added = false;
					if (newServiceTestSet.isInvalid) {
						String Log2Print = UseHeader + TestEntityName_si + Spacer + "TestData " + TSDef.InvalidIndicate;
						errorcase_syntaxerror_log.add(Log2Print);
						errorcase_syntaxerror_log.add(newServiceTestSet.LogString);
						SmartTSout.println(Log2Print);
						errorcase_syntaxerror = true;
					} else {
						if (newServiceTestSet.OneOfTheCurrentlyHandledServicePattern) {
							SmartTSout.println(UseHeader + TestEntityName_si + Spacer + "TestData " + TSDef.Valid);
							added = ServiceRepositoryTestSet.addNewServiceTestSet(newServiceTestSet);
						} else {
							SmartTSout.println(UseHeader + TestEntityName_si + Spacer + "TestData "
									+ "NOT OneOfTheCurrentlyHandledServicePattern");
						}
					}
					if (!added) {
						String Log2Print = UseHeader + TestEntityName_si + Spacer + "TestData "
								+ TSDef.NotAddedIndicate;
						if (newServiceTestSet.OneOfTheCurrentlyHandledServicePattern) {
							errorcase_syntaxerror_log.add(Log2Print);
							errorcase_syntaxerror_log.add(newServiceTestSet.LogString);
							SmartTSout.println(Log2Print);
							errorcase_syntaxerror = true;
						} else {
							warningcase_log.add(Log2Print);
							warningcase_log.add(newServiceTestSet.LogString);
							SmartTSout.println(Log2Print);
							warningcase = true;
						}
					} else {
						if (verbosFoundItems_Services)
							SmartTSout.println(UseHeader + TestEntityName_si + Spacer + "TestData " + TSDef.Added);
					}
				} else {
					String Log2Print = UseHeader + TestEntityName_si + Spacer + "TestData " + TSDef.NotFoundIndicate;
					errorcase_missing_log.add(Log2Print);
					SmartTSout.println(Log2Print);
					errorcase_missing = true;
				}
			}

			// Test Set Builder
			printband();
			UseHeader = LocalHeader + "Test Set Builder" + Spacer;
			SmartTSout.println(UseHeader + " IN");
			boolean build = ServiceRepositoryTestSet.RunTestSetBuilder();
			if (verbosTestSetBuilder) {
				if ((ServiceRepositoryTestSet.LogVarcase.isBlank())
						|| (ServiceRepositoryTestSet.LogVarcase.isEmpty())) {
					SmartTSout.lineTag("dd", "LogVarcase EMPTY");
				} else {
					SmartTSout.lineTag("dd", "LogVarcase START");
					SmartTSout.println("\n" + ServiceRepositoryTestSet.LogVarcase);
					SmartTSout.lineTag("dd", "LogVarcase END");
				}
			}
			if (build) {
				SmartTSout.println(UseHeader + "ALL OK");
			} else {
				errorcase_testsetbuilder = true;
				SmartTSout.println(UseHeader + " XXXX ERROR !!");
				errorcase_testsetbuilder_log.add(ServiceRepositoryTestSet.LogString);
			}
			if (!(ServiceRepositoryTestSet.LogERROR_NO_DATA_FOUND.isBlank()
					|| ServiceRepositoryTestSet.LogERROR_NO_DATA_FOUND.isEmpty())) {
				errorcase_testsetbuilder = true;
				SmartTSout.println(UseHeader + " XXXX ERROR_NO_DATA_FOUND !!");
				errorcase_testsetbuilder_log.add(ServiceRepositoryTestSet.LogERROR_NO_DATA_FOUND);
			}
			if (ServiceRepositoryTestSet.errorVarcase) {
				errorcase_testsetbuilder = true;
				SmartTSout.println(UseHeader + " XXXX ERROR VARCASE !!");
				errorcase_testsetbuilder_log.add(ServiceRepositoryTestSet.ErrorLogVarcase);
			}

			SmartTSout.println(UseHeader + " OUT");
			// Report
			printband();
			IFile ErrorLog = TSLogfolder.getFile(Identifier + runID + TSDef.ErrLogFileExtension);
			IFile ErrorLogLatest = TSLogfolder
					.getFile(Identifier + TSDef.LatestFileIndicater + TSDef.ErrLogFileExtension);
			SmartTSout.StartRecording();
			UseHeader = LocalHeader + "Report" + Spacer;
			if (errorcase_missing) {
				SmartTSout.println(UseHeader + "XXXX Error : One or more items missing. Re-Generate !!");
				SmartTSout.lineTag("Missing Item Log");
				for (String logitem : errorcase_missing_log)
					SmartTSout.println(logitem);
				SmartTSout.lineTag("Missing Item Log END");
			}
			if (errorcase_syntaxerror) {
				SmartTSout.println(UseHeader + "XXXX Error : One or more syntax errors.");
				SmartTSout.lineTag("Syntax Error Log");
				for (String logitem : errorcase_syntaxerror_log)
					SmartTSout.println(logitem);
				SmartTSout.lineTag("Syntax Error Log END");
			}
			if (errorcase_testsetbuilder) {
				SmartTSout.println(UseHeader + "XXXX Error : One or more builder errors.");
				SmartTSout.lineTag("Builder Error Log");
				for (String logitem : errorcase_testsetbuilder_log)
					SmartTSout.println(logitem);
				SmartTSout.lineTag("Builder Error Log END");
			}
			if (warningcase) {
				SmartTSout.println(UseHeader + "XXXX Warning : One or more warnings.");
				SmartTSout.lineTag("Warning Log");
				for (String logitem : warningcase_log)
					SmartTSout.println(logitem);
				SmartTSout.lineTag("Warning Log END");
			}
			if (errorcase_missing || errorcase_syntaxerror) {
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			}
			SmartTSout.StopRecording();
			SmartTSout.SaveRecord(ErrorLog);
			SmartTSout.SaveRecord(ErrorLogLatest);
			SmartTSout.println(UseHeader + "ALL OK");
			// Creating TestSet Folder Structure
			printband();
			UseHeader = LocalHeader + "Creating TestSet Folder Structure" + Spacer;
			IFolder TestSetFolder = project.getFolder(TSDef.datasetsFolderName);
			IFolder CommObjectTestSetsFolder = project.getFolder(TSDef.commobjectsdatasetsFolderName);
			IFolder ServiceTestSetsFolder = project.getFolder(TSDef.servicesdatasetsFolderName);
			if (TestSetFolder.exists()) {
				TestSetFolder.delete(true, null);
				SmartTSout.println(UseHeader + ServiceRepoName + TSDef.Deleted + " FOLDER " + TSDef.datasetsFolderName
						+ TSDef.Indicate);
			}
			TestSetFolder.create(true, true, null);
			SmartTSout.println(UseHeader + ServiceRepoName + TSDef.Created + " FOLDER " + TSDef.datasetsFolderName
					+ TSDef.Indicate);
			CommObjectTestSetsFolder.create(true, true, null);
			SmartTSout.println(UseHeader + ServiceRepoName + TSDef.Created + " FOLDER "
					+ TSDef.commobjectsdatasetsFolderName + TSDef.Indicate);
			ServiceTestSetsFolder.create(true, true, null);
			SmartTSout.println(UseHeader + ServiceRepoName + TSDef.Created + " FOLDER "
					+ TSDef.servicesdatasetsFolderName + TSDef.Indicate);
			// Creating TestSet
			printband();
			UseHeader = LocalHeader + "Creating TestSet" + Spacer;
			String TestSetFile_Name = ServiceRepoName + TSDef.ServiceRepoTestSetsXMLFileNamePostfix;
			IFile TestSetFile = TestSetFolder.getFile(TestSetFile_Name);
			TestSetFile.create(
					new ByteArrayInputStream((ServiceRepositoryTestSetContainer
							.ServiceRepositoryTestSetContainer2XMLString(ServiceRepositoryTestSet)).getBytes()),
					true, null);
			SmartTSout.println(
					UseHeader + ServiceRepoName + TSDef.Created + " TestSet " + TestSetFile_Name + TSDef.Indicate);
			String trueString = ServiceRepositoryTestSetContainer
					.ServiceRepositoryTestSetContainer2XMLString(ServiceRepositoryTestSet);
			String bounceString = io.FilePath2String(TestSetFile);
			if (trueString.equals(bounceString)) {
				SmartTSout.println(UseHeader + ServiceRepoName + Spacer + "Bounce Test: Bounce OK !!");
				trueString = "";
				ServiceRepositoryTestSet = ServiceRepositoryTestSetContainer
						.XMLString2ServiceRepositoryTestSetContainer(bounceString);
				bounceString = "";
			} else {
				SmartTSout.println(UseHeader + ServiceRepoName + Spacer + "Bounce Test: XXXX Error Bounce Failed !!");
				SmartTSout.println(UseHeader + ServiceRepoName + Spacer + TSDef.DSLERROR + Spacer
						+ "ServiceRepositoryTestSetContainer");
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			}
			if (verbosServiceRepositoryTestSet) {
				SmartTSout.println(LocalHeader + "ServiceRepositoryTestSetContainer:");
				SmartTSout.println(LocalHeader + ServiceRepositoryTestSet.toString());
			} else {
				if (verbosServiceRepositoryTestSet_CommObjects_Only) {
					SmartTSout.println(LocalHeader + "ServiceRepositoryTestSetContainer:CommObjects");
					SmartTSout.println(LocalHeader + ServiceRepositoryTestSet.toStringCommObjects());
				}
				if (verbosServiceRepositoryTestSet_Services_Only) {
					SmartTSout.println(LocalHeader + "ServiceRepositoryTestSetContainer:Services");
					SmartTSout.println(LocalHeader + ServiceRepositoryTestSet.toStringServices());
				}
			}
			SmartTSout.println(LocalHeader + "Saving CommObject TestSet CSV Files (Human Readable)");
			if (ServiceRepositoryTestSet.genCommObjectTestSetCSVFiles(CommObjectTestSetsFolder)) {
				SmartTSout.println(
						LocalHeader + "Saving CommObject TestSet CSV Files (Human Readable)" + Spacer + "Done !!");
			} else {
				SmartTSout.println(LocalHeader + "Saving CommObject TestSet CSV Files (Human Readable)" + Spacer
						+ TSDef.FileIOError);
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			}
			SmartTSout.println(LocalHeader + "Saving Service TestSet CSV Files (Human Readable)");
			if (ServiceRepositoryTestSet.genServiceTestSetCSVFiles(ServiceTestSetsFolder)) {
				SmartTSout.println(
						LocalHeader + "Saving Service TestSet CSV Files (Human Readable)" + Spacer + "Done !!");
			} else {
				SmartTSout.println(
						LocalHeader + "Saving Service TestSet CSV Files (Human Readable)" + Spacer + TSDef.FileIOError);
				SmartTSout.println(LocalHeader + "OUT");
				SmartTSout.line("ll");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		SmartTSout.println(LocalHeader + "OUT");
	}

	public void handleComponentProject(IWorkbenchWindow window, IProject project) {
		String LocalHeader = Header + "handleComponentProject" + Spacer;
		SmartTSout.println(LocalHeader + "IN");
		String ProjectName = project.getName();
		boolean yescreateservice = MessageDialog.openConfirm(window.getShell(), "SmartTS",
				"Do you want to Import SmartTS Test Set for Component project \n" + ProjectName);
		if (!yescreateservice) {
			SmartTSout.println(LocalHeader + "OUT");
			SmartTSout.line("ll");
			return;
		}
		// Start Here

		SmartTSout.println(LocalHeader + "OUT");
	}

	public void handleSystemProject(IWorkbenchWindow window, IProject project) {
		String LocalHeader = Header + "handleSystemProject" + Spacer;
		SmartTSout.println(LocalHeader + "IN");
		String ProjectName = project.getName();
		boolean yescreateservice = MessageDialog.openConfirm(window.getShell(), "SmartTS",
				"Do you want to Import SmartTS Test Set for System project \n" + ProjectName);
		if (!yescreateservice) {
			SmartTSout.println(LocalHeader + "OUT");
			SmartTSout.line("ll");
			return;
		}
		// Start Here

		SmartTSout.println(LocalHeader + "OUT");
	}

	public void printband() {
		SmartTSout.line("2d");
		SmartTSout.line();
		SmartTSout.line();
		SmartTSout.line("2d");
	}

}
