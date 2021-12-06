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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.ComponentInfo;
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.PortInfo;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.SmartResourceManager;
import org.smartts.dsl.console.SmartTSConsole;

public class NewComponentTSModelHandler {

	public String ReturnString = "NA";
	public String UserExit = "USER_EXIT";
	public String NotComponentProject = "NOT_COMPONENT_PROJECT";
	public String TestComponentAlreadyExists = "TEST_COMPONENT_ALREADY_EXISTS";
	public String ERRORJAXB = "ERROR_JAXB";
	public String AllOk = "ALL_OK";

	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();
	public TSDefine TSDef = new TSDefine();

	public void Run(IWorkbenchWindow window, IProject project) {
		SmartTSConsole SmartTSout = new SmartTSConsole();
		SmartTSout.clear();
		SmartTSout.println("NewComponentModelHandler.Run | IN");
		boolean yescreate = MessageDialog.openConfirm(window.getShell(), "SmartTS",
				"Do you want to create SmartTS model files with default contents for project \n" + project.getName());
		if (!yescreate) {
			SmartTSout.println("NewComponentModelHandler.Run | OUT");
			SmartTSout.line("ll");
			ReturnString = UserExit;
			return;
		}
		GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
		String componentmodelfilename = DBEDef.modelFolderName + project.getName() + DBEDef.ComponentFileExtension;
		IFile componentmodelfile = project.getFile(componentmodelfilename);
		String componentmodelfileAbsPath = componentmodelfile.getRawLocation().toOSString();
		ComponentInfo componentInfo = new ComponentInfo();
		componentInfo = getSmartMDSDDef.getComponentDefinition(componentmodelfileAbsPath);
		if (null == componentInfo) {
			SmartTSout.println("NewComponentModelHandler.Run | Component Not Found: " + componentmodelfileAbsPath);
			ReturnString = NotComponentProject;
			return;
		} else {
			String ComponentName = componentInfo.CDef.getName();
			SmartTSout.println("NewComponentModelHandler.Run | Found Component: " + ComponentName);
			SmartTSout.println(componentInfo.toString());

			String ProjectPostfix = ComponentName.substring(ComponentName.length() - 3);
			String componenttsmodelfilename = DBEDef.modelFolderName + project.getName()
					+ TSDef.ComponentTSFileExtension;
			IFile componenttsmodelfile = project.getFile(componenttsmodelfilename);
			String componentsimmodelfilename = DBEDef.modelFolderName + project.getName()
					+ TSDef.ComponentSIMFileExtension;
			IFile componentsimmodelfile = project.getFile(componentsimmodelfilename);
			Boolean projecttspostfixexists = ProjectPostfix.equals(TSDef.ComponentProjectTSPostfix);
			Boolean tsmodelexists = componenttsmodelfile.exists();
			Boolean simmodelexists = componentsimmodelfile.exists();
			if (projecttspostfixexists || tsmodelexists || simmodelexists) {
				if (projecttspostfixexists && tsmodelexists && simmodelexists)
					SmartTSout.println("NewComponentModelHandler.Run | Found Component: " + ComponentName
							+ " is already a TS model. [ERROR]");
				else
					SmartTSout.println("NewComponentModelHandler.Run | Found Component: " + ComponentName
							+ " already has some TS model elements. [ERROR]");
				if (projecttspostfixexists)
					SmartTSout.println(
							"NewComponentModelHandler.Run | Found Component Project Postfix : " + ProjectPostfix);
				else
					SmartTSout.println(
							"NewComponentModelHandler.Run | [Missing] Component Project Postfix : " + ProjectPostfix);
				if (tsmodelexists)
					SmartTSout.println(
							"NewComponentModelHandler.Run | Found ComponentTS model: " + componenttsmodelfilename);
				else
					SmartTSout.println(
							"NewComponentModelHandler.Run | [Missing] ComponentTS model: " + componenttsmodelfilename);
				if (simmodelexists)
					SmartTSout.println(
							"NewComponentModelHandler.Run | Found ComponentSIM model: " + componentsimmodelfilename);
				else
					SmartTSout.println(
							"NewComponentModelHandler.Run | [Missing] ComponentSIM model: " + componenttsmodelfilename);
				SmartTSout.println("NewComponentModelHandler.Run | OUT");
				SmartTSout.line("ll");
				ReturnString = TestComponentAlreadyExists;
				return;
			}

			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			String TestComponentName = ComponentName + "_TS";
			IProject TestComponentProject = workspaceRoot.getProject(TestComponentName);
			//////////////////////////////////// Only For Debugging
			/*
			 * if (TestComponentProject.exists()) { SmartTSout.println("DEBUGGING INSERT | "
			 * + componentmodelfileAbsPath); IProgressMonitor tmpprogressMonitor = new
			 * NullProgressMonitor(); try { TestComponentProject.delete(true,
			 * tmpprogressMonitor); SmartTSout.
			 * println("DEBUGGING INSERT | Deleated previously created _TS project");
			 * Thread.sleep(4000); } catch (Exception e) { e.printStackTrace(); } }
			 */
			////////////////////////////////////
			if (!TestComponentProject.exists()) {
				try {
					IProgressMonitor progressMonitor = new NullProgressMonitor();
					SmartTSout.line("d");
					//// project folder
					TestComponentProject.create(progressMonitor);
					TestComponentProject.open(progressMonitor);
					SmartTSout.println(
							"NewComponentModelHandler.Run | Component " + TestComponentName + " | Created: Project");
					//// model folder
					IFolder TestComponentProject_modelfolder = TestComponentProject.getFolder(DBEDef.modelFolderName);
					TestComponentProject_modelfolder.create(true, true, null);
					SmartTSout.println("NewComponentModelHandler.Run | Component " + TestComponentName
							+ " | Created: folder " + DBEDef.modelFolderName);
					IFolder TestComponentProject_modelTSfolder = TestComponentProject
							.getFolder(TSDef.tsmodelFolderName);
					TestComponentProject_modelTSfolder.create(true, true, null);
					SmartTSout.println("NewComponentModelHandler.Run | Component " + TestComponentName
							+ " | Created: folder " + TSDef.tsmodelFolderName);
					//// files
					String filename;
					String text;

					List<String> NewFileNames = new ArrayList<>();
					List<String> NewFileContentss = new ArrayList<>();

					String ActName = TSDef.ComponentTSActivityName;

					// component_model
					String destinationfile = "model/" + TestComponentName + ".component";
					text = "// " + TSDef.SmartTSGenReadmeText + "\n";
					text = text + "ComponentDefinition " + TestComponentName + " logo \"/" + TestComponentName
							+ "/model/logo.png\"";
					text = text + "\n{	Activity " + ActName + "	{\n";

					String ts_str = TSDef.ComponentPortTSPostfix;
					String sim_str = TSDef.ComponentPortSIMPostfix;

					// InputPorts--> sim-InputPorts
					for (int i = 0; i < componentInfo.InputPorts.size(); i++) {
						text = text + "		InputPortLink " + componentInfo.InputPorts.get(i).Name + sim_str
								+ " { oversamplingOk undersamplingOk }\n";
					}
					// OutputPorts--> ts-InputPorts
					for (int i = 0; i < componentInfo.OutputPorts.size(); i++) {
						text = text + "		InputPortLink " + componentInfo.OutputPorts.get(i).Name + ts_str
								+ " { oversamplingOk undersamplingOk }\n";
					}
					text = text + "	}\n";
					// InputPorts--> ts-OutputPorts, sim-InputPorts
					for (int i = 0; i < componentInfo.InputPorts.size(); i++) {
						PortInfo PI = componentInfo.InputPorts.get(i);
						text = text + "OutputPort " + PI.Name + ts_str + " implements " + PI.ServiceURI + " realizedBy "
								+ ActName + " {\n";
						for (int j = 0; j < PI.DependencyObjects.size(); j++) {
							text = text + "		ComponentDependencyObject \"" + PI.DependencyObjects.get(j) + "\" \n";
						}
						text = text + "	}\n";
						text = text + "InputPort " + PI.Name + sim_str + " implements " + PI.ServiceURI + "{\n";
						for (int j = 0; j < PI.DependencyObjects.size(); j++) {
							text = text + "		ComponentDependencyObject \"" + PI.DependencyObjects.get(j) + "\" \n";
						}
						text = text + "	}\n";
					}
					// OutputPorts--> ts-InputPorts, sim-OutputPorts
					for (int i = 0; i < componentInfo.OutputPorts.size(); i++) {
						PortInfo PI = componentInfo.OutputPorts.get(i);
						text = text + "InputPort " + PI.Name + ts_str + " implements " + PI.ServiceURI + "{\n";
						for (int j = 0; j < PI.DependencyObjects.size(); j++) {
							text = text + "		ComponentDependencyObject \"" + PI.DependencyObjects.get(j) + "\" \n";
						}
						text = text + "	}\n";
						text = text + "OutputPort " + PI.Name + sim_str + " implements " + PI.ServiceURI
								+ " realizedBy " + ActName + " {\n";
						for (int j = 0; j < PI.DependencyObjects.size(); j++) {
							text = text + "		ComponentDependencyObject \"" + PI.DependencyObjects.get(j) + "\" \n";
						}
						text = text + "	}\n";
					}
					// AnswerPort--> ts-RequestPort, sim-AnswerPort
					for (int i = 0; i < componentInfo.AnswerPorts.size(); i++) {
						PortInfo PI = componentInfo.AnswerPorts.get(i);
						text = text + "RequestPort " + PI.Name + ts_str + " implements " + PI.ServiceURI + " {\n";
						text = text + "	}\n";
						text = text + "AnswerPort " + PI.Name + sim_str + " implements " + PI.ServiceURI + "{\n";
						text = text + "	}\n";
						text = text + "RequestHandler " + PI.Name + sim_str + "_Handler triggeredFrom " + PI.Name
								+ sim_str + "{\n";
						text = text + "	}\n";
					}

					// RequestPort--> ts-AnswerPort, sim-RequestPort
					for (int i = 0; i < componentInfo.RequestPorts.size(); i++) {
						PortInfo PI = componentInfo.RequestPorts.get(i);
						text = text + "AnswerPort " + PI.Name + ts_str + " implements " + PI.ServiceURI + " {\n";
						text = text + "	}\n";
						text = text + "RequestHandler " + PI.Name + ts_str + "_Handler triggeredFrom " + PI.Name
								+ ts_str + "{\n";
						text = text + "	}\n";
						text = text + "RequestPort " + PI.Name + sim_str + " implements " + PI.ServiceURI + "{\n";
						text = text + "	}\n";
					}

					// CoordinationSlavePort--> ts-CoordinationMasterPort, sim-CoordinationSlavePort
					for (int i = 0; i < componentInfo.CoordinationSlavePort.size(); i++) {
						PortInfo PI = componentInfo.CoordinationSlavePort.get(i);
						text = text + "CoordinationMasterPort " + PI.Name + ts_str + " implements " + PI.ServiceURI
								+ "\n";
						text = text + "CoordinationSlavePort " + PI.Name + sim_str + " implements " + PI.ServiceURI
								+ "{\n";
						text = text + "	}\n";
					}

					text = text + "}\n";
					NewFileNames.add(destinationfile);
					NewFileContentss.add(text);

					// component_ts model
					// text = "// " + TSDef.SmartTSGenReadmeText + "\n";
					// NewFileNames.add(destinationfile + ts_str);
					// NewFileContentss.add(text);

					// component_sim model
					// text = "// " + TSDef.SmartTSGenReadmeText + "\n";
					// NewFileNames.add(destinationfile + sim_str);
					// NewFileContentss.add(text);

					String sourcefolder = project.getRawLocation() + "/";
					// project
					filename = ".project";
					text = Files.readString(Paths.get(sourcefolder + filename));
					text = text.replaceAll(ComponentName, TestComponentName);
					NewFileNames.add(filename);
					NewFileContentss.add(text);
					// cproject
					filename = ".cproject";
					text = Files.readString(Paths.get(sourcefolder + filename));
					text = text.replaceAll(ComponentName, TestComponentName);
					NewFileNames.add(filename);
					NewFileContentss.add(text);
					// classpath
					filename = ".classpath";
					text = Files.readString(Paths.get(sourcefolder + filename));
					text = text.replaceAll(ComponentName, TestComponentName);
					NewFileNames.add(filename);
					NewFileContentss.add(text);
					// representations

					filename = "representations.aird";
					text = Files.readString(Paths.get(sourcefolder + filename));
					text = text.replaceAll(ComponentName, TestComponentName);
					List<String> UnusedModels = new ArrayList<>();
					UnusedModels.add("componentDatasheet");
					UnusedModels.add("componentParameters");
					UnusedModels.add("skillRealization");
					UnusedModels.add("de");
					UnusedModels.add("do");
					UnusedModels.add("dg");
					for (int i = 0; i < UnusedModels.size(); i++) {
						String UnusedModel = UnusedModels.get(i);
						String UnusedModelstr = "<semanticResources>model/" + TestComponentName + "." + UnusedModel
								+ "</semanticResources>";
						String Replacement = "<!-- SmartTS Removed these " + UnusedModelstr + "-->";
						// When source component is a SmartTS component
						if (!text.contains(Replacement)) {
							text = text.replaceAll(UnusedModelstr, Replacement);
						}
					}
					NewFileNames.add(filename);
					NewFileContentss.add(text);

					// SmartTS-Gen Readme
					NewFileNames.add(TSDef.SmartTSGenReadmeName);
					NewFileContentss.add(TestComponentName + ": " + TSDef.SmartTSGenReadmeText);

					// logo
					String logofilePath = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/SmartTS.png";
					File f = new File(logofilePath);
					if (f.exists()) {
						IFile logofile = TestComponentProject.getFile("model/logo.png");
						if (logofile.exists()) {
							logofile.delete(true, null);
						}
						logofile.create(new ByteArrayInputStream(readFileToBytes(logofilePath)), true, null);
						SmartTSout.println("NewComponentModelHandler.Run | Component " + TestComponentName
								+ " | Created: logo.png");
					} else {
						SmartTSout.println("NewComponentModelHandler.Run | " + logofilePath + "Not found !");
					}

					// XML Info Models
					IO io = new IO();
					NewFileNames.add(TSDef.tsmodelFolderName + ComponentName + TSDef.ComponentInfoXMLFileExtension);
					String ComponentInfoXML = io.ComponentInfo2XMLString(componentInfo);
					if (null == ComponentInfoXML) {
						SmartTSout.println(
								"NewComponentModelHandler.Run | Component " + TestComponentName + " JAXB Error !!");
						SmartTSout.println("NewComponentModelHandler.Run | OUT");
						SmartTSout.line("ll");
						ReturnString = ERRORJAXB;
						return;
					} else {
						NewFileContentss.add(ComponentInfoXML);

						//////////////////////////////////// Only For Debugging IN
						/*
						 * ComponentInfo CIBounce = io.XMLString2ComponentInfo(ComponentInfoXML); //
						 * NewFileNames.add(TSDef.tsmodelFolderName + ComponentName + "Bounce" + //
						 * TSDef.ComponentInfoXMLFileExtension); String ComponentInfoXMLBounce =
						 * io.ComponentInfo2XMLString(CIBounce); //
						 * NewFileContentss.add(ComponentInfoXMLBounce); if
						 * (ComponentInfoXMLBounce.equals(ComponentInfoXML)) { //
						 * SmartTSout.println("TEST-------------------------GOOD BOUNCE !!"); //
						 * SmartTSout.println(CIBounce.toString());
						 * SmartTSout.println("DEBUGGING INSERT | GOOD BOUNCE !!"); }
						 */
						//////////////////////////////////// Only For Debugging OUT
					}

					for (int i = 0; i < NewFileNames.size(); i++) {
						String NewFileName = NewFileNames.get(i);
						String NewFileContents = NewFileContentss.get(i);
						String NewDisplay = TestComponentName + " | Created: " + NewFileName;
						IFile Newfile = TestComponentProject.getFile(NewFileName);
						if (Newfile.exists()) {
							Newfile.delete(true, null);
						}
						Newfile.create(new ByteArrayInputStream((NewFileContents).getBytes()), true, null);
						SmartTSout.println("NewComponentModelHandler.Run | Component " + NewDisplay);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				SmartTSout
						.println("NewComponentModelHandler.Run | Component " + TestComponentName + " Already exists.");
				ReturnString = TestComponentAlreadyExists;
				return;
			}
		}
		ReturnString = AllOk;
		return;
	}

	private static byte[] readFileToBytes(String filePath) throws IOException {

		File file = new File(filePath);
		byte[] bytes = new byte[(int) file.length()];

		FileInputStream fis = null;
		try {

			fis = new FileInputStream(file);

			// read file into bytes[]
			fis.read(bytes);
			return bytes;

		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
}
