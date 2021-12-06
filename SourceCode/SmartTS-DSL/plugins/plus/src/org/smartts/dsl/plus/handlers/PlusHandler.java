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
package org.smartts.dsl.plus.handlers;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.ComponentInfo;
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartts.dsl.console.SmartTSConsole;

public class PlusHandler extends AbstractHandler {

	public IResource getSelectedResource(IWorkbenchWindow window) {
		ISelection selection = window.getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IResource) {
				return (IResource) firstElement;
			} else if (firstElement instanceof IProjectNature) {
				IProjectNature projNature = (IProjectNature) firstElement;
				return projNature.getProject();
			}
		}
		return null;
	}

	public DBEDefine DBEDef = new DBEDefine();
	public TSDefine TSDef = new TSDefine();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		SmartTSConsole SmartTSout = new SmartTSConsole();
		SmartTSout.clear();
		SmartTSout.println("Add SmartTS Run Model | IN");
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = getSelectedResource(window);
		IProject project = null;
		try {
			project = resource.getProject();
		} catch (Exception e1) {
			SmartTSout.println("Add SmartTS Run Model | XXXX Error Accessing Project Resources !!");
			SmartTSout.println(
					"Add SmartTS Run Model | XXXX Pop and use this menu on Project root folder or on one of the model files.");
			SmartTSout.println("Add SmartTS Run Model | OUT");
			SmartTSout.line("ll");
			return null;
		}
		if (project.getRawLocation() != null) {
			String RunProjectName = project.getName();
			String componentArchFileName = DBEDef.modelFolderName + RunProjectName + DBEDef.componentArchFileExtension;
			IFile componentArchFile = project.getFile(componentArchFileName);
			IO io = new IO();
			String StartingModel = io.FilePath2String(componentArchFile);
			if (componentArchFile.exists()) {
				String BackupFileName = componentArchFileName + DBEDef.BackupFilePostfix;
				IFile BackupFile = project.getFile(BackupFileName);
				// Created Only If Non-Existing
				if (!BackupFile.exists()) {
					try {
						componentArchFile.copy(BackupFile.getFullPath(), true, null);
						SmartTSout.println("Add SmartTS Run Model | Created [Backup] For ComponentArch File ");
					} catch (CoreException e) {
						e.printStackTrace();
					}
				} else {
					SmartTSout.println("Add SmartTS Run Model | [Backup] file already exists. No new backup created.");
				}
			}

			IProject ReferencedProjects[];
			String ComponentName = "";
			String TSComponentName = "";
			try {
				ReferencedProjects = project.getReferencedProjects();
				List<String> comprefs = new ArrayList<>();
				List<String> comptsrefs = new ArrayList<>();
				for (int i = 0; i < ReferencedProjects.length; i++) {
					IProject Project = ReferencedProjects[i];
					String ProjectName = Project.getName();
					IFile componentfile = Project
							.getFile(DBEDef.modelFolderName + ProjectName + DBEDef.ComponentFileExtension);
					IFile tsfile = Project
							.getFile(DBEDef.modelFolderName + ProjectName + TSDef.ComponentTSFileExtension);
					IFile simfile = Project
							.getFile(DBEDef.modelFolderName + ProjectName + TSDef.ComponentSIMFileExtension);
					String ProjectNamePostfix = ProjectName.substring(ProjectName.length() - 3);

					boolean componentmodelok = componentfile.exists();
					boolean tsmodelok = tsfile.exists();
					boolean simmodelok = simfile.exists();
					tsmodelok = true;
					simmodelok = true;
					boolean nameok = TSDef.ComponentProjectTSPostfix.equals(ProjectNamePostfix);

					SmartTSout.print("Add SmartTS Run Model | Found Referenced Project : " + ProjectName);
					if (componentmodelok) {
						if (nameok) {
							if (tsmodelok && simmodelok) {
								comptsrefs.add(ProjectName);
								SmartTSout.plusln(" [SmartTS Component]");
							} else {
								SmartTSout.plusln(" [SmartTS Component] [ERROR]");
								if (!tsmodelok)
									SmartTSout.println("ERROR: Missing " + TSDef.ComponentTSFileExtension_only);
								if (!simmodelok)
									SmartTSout.println("ERROR: Missing " + TSDef.ComponentSIMFileExtension_only);
							}
						} else {
							comprefs.add(ProjectName);
							SmartTSout.plusln(" [Component]");
						}
					} else {
						SmartTSout.plusln(" [Component model not found]");
					}
				}
				int count = 0;
				for (int i = 0; i < comptsrefs.size(); i++) {
					TSComponentName = comptsrefs.get(i);
					ComponentName = TSComponentName.substring(0, TSComponentName.length() - 3);
					SmartTSout.print("Add SmartTS Run Model | Found " + TSComponentName);
					if (comprefs.contains(ComponentName)) {
						SmartTSout.plusln(" and " + ComponentName + " [SmartTS pair]");
						count++;
					} else {
						SmartTSout.plusln(" without " + ComponentName + " [SmartTS pair] [ERROR]");
						SmartTSout.println("Add SmartTS Run Model | OUT");
						SmartTSout.line("ll");
						return null;
					}
				}
				if (count == 1) {
					SmartTSout.println(
							"Add SmartTS Run Model | [SELECTED SmartTS pair] " + ComponentName + " " + TSComponentName);
				} else {
					if (count == 0) {
						SmartTSout.println("Add SmartTS Run Model | [No] SmartTS pair found [ERROR]");
					}
					if (count > 1) {
						SmartTSout.println("Add SmartTS Run Model | [Multiple] SmartTS pairs found [ERROR]");
					}
					SmartTSout.println("Add SmartTS Run Model | OUT");
					SmartTSout.line("ll");
					return null;
				}

			} catch (CoreException e) {
				e.printStackTrace();
			}

			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject CProject = workspaceRoot.getProject(ComponentName);
			IProject TSProject = workspaceRoot.getProject(TSComponentName);
			IPath CProjectRawLocation = CProject.getRawLocation();
			IPath TSProjectRawLocation = TSProject.getRawLocation();

			if ((CProjectRawLocation != null) && (TSProjectRawLocation != null)) {
				GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
				String CProjectRoot = CProjectRawLocation + "/";
				String TSProjectRoot = TSProjectRawLocation + "/";
				String Cmodelfilename = DBEDef.modelFolderName + ComponentName + DBEDef.ComponentFileExtension;
				String TSmodelfilename = DBEDef.modelFolderName + TSComponentName + DBEDef.ComponentFileExtension;
				IFile Cmodelfile = CProject.getFile(Cmodelfilename);
				IFile TSmodelfile = TSProject.getFile(TSmodelfilename);
				String CmodelfileAbsPath = Cmodelfile.getRawLocation().toOSString();
				String TSmodelfileAbsPath = TSmodelfile.getRawLocation().toOSString();
				ComponentInfo CInfo = null;
				ComponentInfo TSInfo = null;
				CInfo = getSmartMDSDDef.getComponentDefinition(CmodelfileAbsPath);
				TSInfo = getSmartMDSDDef.getComponentDefinition(TSmodelfileAbsPath);
				SmartTSout.println("Add SmartTS Run Model | Found Component: " + CInfo.CDef.getName());
				SmartTSout.println(CInfo.toString());
				SmartTSout.println("Add SmartTS Run Model | Found Component: " + TSInfo.CDef.getName());
				SmartTSout.println(TSInfo.toString());

				String RunModelContents = StartingModel;
				if (!RunModelContents.contains(TSDef.SmartTSGenReadmeText)) {
					RunModelContents = "// " + TSDef.SmartTSGenReadmeText + "\n" + RunModelContents;
				}
				String ComponentInstanceModel = RunModelContents
						.substring(RunModelContents.indexOf("instantiates " + ComponentName));
				ComponentInstanceModel = ComponentInstanceModel.substring(0, ComponentInstanceModel.indexOf("}") + 1);
				ComponentInstanceModel = ComponentInstanceModel.substring(ComponentInstanceModel.indexOf("{"));
				List<String> fulllist = new ArrayList<>();
				List<String> requiredlist = new ArrayList<>();
				List<String> providedlist = new ArrayList<>();

				for (int i = 0; i < CInfo.InputPorts.size(); i++) {
					fulllist.add(CInfo.InputPorts.get(i).Name);
				}
				for (int i = 0; i < CInfo.RequestPorts.size(); i++) {
					fulllist.add(CInfo.RequestPorts.get(i).Name);
				}
				for (int i = 0; i < CInfo.OutputPorts.size(); i++) {
					fulllist.add(CInfo.OutputPorts.get(i).Name);
				}
				for (int i = 0; i < CInfo.AnswerPorts.size(); i++) {
					fulllist.add(CInfo.AnswerPorts.get(i).Name);
				}
				for (String listitem : fulllist) {
					if (ComponentInstanceModel.contains("RequiredService " + listitem)) {
						requiredlist.add(listitem);
					}
					if (ComponentInstanceModel.contains("ProvidedService " + listitem)) {
						providedlist.add(listitem);
					}
				}
				String Connections = "// CONNECTIONS\n";
				for (String listitem : requiredlist) {
					Connections = Connections + "	Connection " + ComponentName + "." + listitem + " -> "
							+ TSComponentName + "." + listitem + TSDef.ComponentPortTSPostfix + "\n";
				}
				for (String listitem : providedlist) {
					Connections = Connections + "	Connection " + TSComponentName + "." + listitem
							+ TSDef.ComponentPortTSPostfix + " -> " + ComponentName + "." + listitem + "\n";
				}
				RunModelContents = RunModelContents.substring(0, RunModelContents.lastIndexOf("}")) + Connections + "}";
				/*
				 * String RunModelContents = ""; RunModelContents = RunModelContents + "// " +
				 * TSDef.SmartTSGenReadmeText + "\n"; RunModelContents = RunModelContents +
				 * "SystemComponentArchitecture " + RunProjectName +
				 * " usingActivityArchitecture " + RunProjectName + " {\n"; RunModelContents =
				 * RunModelContents + "	ComponentInstance " + ComponentName + " instantiates " +
				 * ComponentName + " {\n"; for (int i = 0; i < CInfo.InputPorts.size(); i++) {
				 * RunModelContents = RunModelContents + "//" +
				 * CInfo.InputPorts.get(i).Service.ServiceType + "\n"; RunModelContents =
				 * RunModelContents + "		RequiredService " + CInfo.InputPorts.get(i).Name +
				 * "\n"; } for (int i = 0; i < CInfo.RequestPorts.size(); i++) {
				 * RunModelContents = RunModelContents + "		RequiredService " +
				 * CInfo.RequestPorts.get(i).Name + "\n"; } for (int i = 0; i <
				 * CInfo.OutputPorts.size(); i++) { RunModelContents = RunModelContents +
				 * "		ProvidedService " + CInfo.OutputPorts.get(i).Name + "\n"; } for (int
				 * i = 0; i < CInfo.AnswerPorts.size(); i++) { RunModelContents =
				 * RunModelContents + "		ProvidedService " + CInfo.AnswerPorts.get(i).Name +
				 * "\n"; } RunModelContents = RunModelContents + "	}\n"; RunModelContents =
				 * RunModelContents + "	ComponentInstance " + TSComponentName + " instantiates "
				 * + TSComponentName + " {\n"; for (int i = 0; i < TSInfo.InputPorts.size();
				 * i++) { RunModelContents = RunModelContents + "		RequiredService " +
				 * TSInfo.InputPorts.get(i).Name + "\n"; } for (int i = 0; i <
				 * TSInfo.RequestPorts.size(); i++) { RunModelContents = RunModelContents +
				 * "		RequiredService " + TSInfo.RequestPorts.get(i).Name + "\n"; } for
				 * (int i = 0; i < TSInfo.OutputPorts.size(); i++) { RunModelContents =
				 * RunModelContents + "		ProvidedService " + TSInfo.OutputPorts.get(i).Name +
				 * "\n"; } for (int i = 0; i < TSInfo.AnswerPorts.size(); i++) {
				 * RunModelContents = RunModelContents + "		ProvidedService " +
				 * TSInfo.AnswerPorts.get(i).Name + "\n"; } RunModelContents = RunModelContents
				 * + "	}\n"; for (int i = 0; i < CInfo.InputPorts.size(); i++) { String port =
				 * CInfo.InputPorts.get(i).Name; RunModelContents = RunModelContents +
				 * "	Connection " + ComponentName + "." + port + " -> " + TSComponentName +
				 * "." + port + TSDef.ComponentPortTSPostfix + "\n"; } for (int i = 0; i <
				 * CInfo.RequestPorts.size(); i++) { String port =
				 * CInfo.RequestPorts.get(i).Name; RunModelContents = RunModelContents +
				 * "	Connection " + ComponentName + "." + port + " -> " + TSComponentName +
				 * "." + port + TSDef.ComponentPortTSPostfix + "\n"; } for (int i = 0; i <
				 * CInfo.OutputPorts.size(); i++) { String port = CInfo.OutputPorts.get(i).Name;
				 * RunModelContents = RunModelContents + "	Connection " + TSComponentName + "."
				 * + port + TSDef.ComponentPortTSPostfix + " -> " + ComponentName + "." + port +
				 * "\n"; } for (int i = 0; i < CInfo.AnswerPorts.size(); i++) { String port =
				 * CInfo.AnswerPorts.get(i).Name; RunModelContents = RunModelContents +
				 * "	Connection " + TSComponentName + "." + port +
				 * TSDef.ComponentPortTSPostfix + " -> " + ComponentName + "." + port + "\n"; }
				 * RunModelContents = RunModelContents + "}";
				 */
				try {
					componentArchFile.setContents(new ByteArrayInputStream((RunModelContents).getBytes()), true, false,
							null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
				SmartTSout.println("Add SmartTS Run Model | SmartTS Component Run Model [Created]");

			} else {
				SmartTSout.println("Add SmartTS Run Model | WORKSPACE ERROR !! ");
				if (CProjectRawLocation == null)
					SmartTSout.println("WORKSPACE ERROR : " + ComponentName + ".getRawLocation() is found to be null.");
				if (TSProjectRawLocation == null)
					SmartTSout
							.println("WORKSPACE ERROR : " + TSComponentName + ".getRawLocation() is found to be null.");

			}
		} else {
			SmartTSout.println(
					"Add SmartTS Run Model | WORKSPACE ERROR !! project.getRawLocation() is found to be null.");
		}
		SmartTSout.println("Add SmartTS Run Model | OUT");
		SmartTSout.line("ll");
		return null;
	}
}
