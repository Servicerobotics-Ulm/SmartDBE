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
//  This file is part of the Asset Administration Shell (SmartAAS) extension 
//  for SmartMDSD Toolchain.
//
//  Author:
//		Vineet Nagrath
//  Contributors:
//		Vineet Nagrath
//		Shaik Nayabrasul
//		Timo Blender
//		Jannik Rhode
//		Christian Schlegel
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
package org.smartaas.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.smartdbe.common.console.SmartCommonConsole;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.SmartResourceManager;
import org.xtext.smartaas.command.generator.SmartAASCommandDefaultContents;
import org.xtext.smartaas.nameplate.generator.SmartAASNameplateDefaultContents;
import org.xtext.smartaas.sms.generator.SmartAASSMSDefaultContents;
import org.xtext.smartaas.technicaldata.generator.SmartAASTechnicalDataDefaultContents;

public class CreateNewAASModelHandler extends AbstractHandler {

	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		SmartCommonConsole SmartCommonout = new SmartCommonConsole();
		SmartCommonout.clear();
		SmartCommonout.println("Create New SmartAAS Model Handler | IN");

		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = SRMan.getSelectedResource(window);
		IProject project = null;
		try {
			project = resource.getProject();
		} catch (Exception e1) {
			SmartCommonout.println("Create New SmartAAS Model Handler | XXXX Error Accessing Project Resources !!");
			SmartCommonout.println(
					"Create New SmartAAS Model Handler | XXXX Pop and use this menu on Project root folder or on one of the model files.");
			SmartCommonout.println("Create New SmartAAS Model Handler | OUT");
			return null;
		}
		if (project.getRawLocation() != null) {

			String KindOfProject = "NA";

			String componentmodelfilename = DBEDef.modelFolderName + project.getName() + DBEDef.ComponentFileExtension;
			IFile componentmodelfile = project.getFile(componentmodelfilename);
			Boolean isComponentProject = false;
			if (componentmodelfile.exists()) {
				isComponentProject = true;
				KindOfProject = "Component";
			}

			String componentArchmodelfilename = DBEDef.modelFolderName + project.getName()
					+ DBEDef.componentArchFileExtension;
			IFile componentArchmodelfile = project.getFile(componentArchmodelfilename);
			Boolean isSystemProject = false;
			if (componentArchmodelfile.exists()) {
				isSystemProject = true;
				KindOfProject = "System";
			}

			boolean yescreate = MessageDialog.openConfirm(window.getShell(), "SmartAAS",
					"Do you want to create SmartAAS model files with default contents for SmartMDSD " + KindOfProject
							+ " project \n" + project.getName());
			if (!yescreate) {
				SmartCommonout.println("Create New SmartAAS Model Handler | OUT");
				SmartCommonout.line("ll");
				return null;
			}

			if ((!isComponentProject) && (!isSystemProject)) {
				SmartCommonout.println(
						"Create New SmartAAS Model Handler | XXXX Error !! SmartMDSD Component / System Model Missing !");
				SmartCommonout.println("Create New SmartAAS Model Handler | OUT");
				return null;
			} else {
				// Model Generation Starts Here
				List<String> NewFileNames = new ArrayList<>();
				List<String> NewFileContentss = new ArrayList<>();

				String ProjectName = project.getName();

				Boolean allmodelexists = true;

				String aas_nameplate_model_filename = DBEDef.modelFolderName + ProjectName + ".aas_nameplate";
				IFile aas_nameplate_model_file = project.getFile(aas_nameplate_model_filename);
				Boolean aas_nameplate_model_exists = aas_nameplate_model_file.exists();
				if (aas_nameplate_model_exists) {
					SmartCommonout
							.println("Create New SmartAAS Model Handler | XXXX Existing AAS_Nameplate Model Found: "
									+ aas_nameplate_model_file);
				} else {
					allmodelexists = false;
					SmartAASNameplateDefaultContents NameplateDefaultContents = new SmartAASNameplateDefaultContents();
					NameplateDefaultContents.ProjectName = ProjectName;
					// #TODO Obsolete//NewFileNames.add(aas_nameplate_model_filename);
					// #TODO Obsolete//NewFileContentss.add(NameplateDefaultContents.getContents());
				}

				String aas_technicaldata_model_filename = DBEDef.modelFolderName + ProjectName + ".aas_technicaldata";
				IFile aas_technicaldata_model_file = project.getFile(aas_technicaldata_model_filename);
				Boolean aas_technicaldata_model_exists = aas_technicaldata_model_file.exists();
				if (aas_technicaldata_model_exists) {
					SmartCommonout
							.println("Create New SmartAAS Model Handler | XXXX Existing AAS_TechnicalData Model Found: "
									+ aas_technicaldata_model_file);
				} else {
					allmodelexists = false;
					SmartAASTechnicalDataDefaultContents TechnicalDataDefaultContents = new SmartAASTechnicalDataDefaultContents();
					TechnicalDataDefaultContents.ProjectName = ProjectName;
					// #TODO Obsolete//NewFileNames.add(aas_technicaldata_model_filename);
					// #TODO
					// Obsolete//NewFileContentss.add(TechnicalDataDefaultContents.getContents());
				}

				String aas_command_model_filename = DBEDef.modelFolderName + ProjectName + ".aas_command";
				IFile aas_command_model_file = project.getFile(aas_command_model_filename);
				Boolean aas_command_model_exists = aas_command_model_file.exists();
				if (aas_command_model_exists) {
					SmartCommonout.println("Create New SmartAAS Model Handler | XXXX Existing AAS_Command Model Found: "
							+ aas_command_model_file);
				} else {
					allmodelexists = false;
					SmartAASCommandDefaultContents CommandDefaultContents = new SmartAASCommandDefaultContents();
					CommandDefaultContents.ProjectName = ProjectName;
					NewFileNames.add(aas_command_model_filename);
					NewFileContentss.add(CommandDefaultContents.getContents());
				}

				String aas_aasx_model_filename = DBEDef.modelFolderName + ProjectName + "AAS.xml";
				IFile aas_aasx_model_file = project.getFile(aas_aasx_model_filename);
				Boolean aas_aasx_model_exists = aas_aasx_model_file.exists();
				if (aas_aasx_model_exists) {
					SmartCommonout
							.println("Create New SmartAAS Model Handler | XXXX Existing AAS_AASX Model (XML) Found: "
									+ aas_aasx_model_file);
				} else {
					allmodelexists = false;
					SmartAASAASXDefaultContents AASXDefaultContents = new SmartAASAASXDefaultContents();
					NewFileNames.add(aas_aasx_model_filename);
					NewFileContentss.add(AASXDefaultContents.getContents());
				}

				String aas_sms_filename = DBEDef.modelFolderName + ProjectName + ".aas_sms";
				IFile aas_sms_file = project.getFile(aas_sms_filename);
				if (aas_sms_file.exists()) {
					try {
						aas_sms_file.delete(true, null);
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				allmodelexists = false;
				SmartAASSMSDefaultContents SMSDefaultContents = new SmartAASSMSDefaultContents();
				NewFileNames.add(aas_sms_filename);
				SMSDefaultContents.ProjectName = ProjectName;
				NewFileContentss.add(SMSDefaultContents.getContents());

				if (allmodelexists) {
					SmartCommonout.println(
							"Create New SmartAAS Model Handler | XXXX Error !! All AAS Models Already Exists !");
					SmartCommonout.println("Create New SmartAAS Model Handler | OUT");
					return null;
				}

				try {
					for (int i = 0; i < NewFileNames.size(); i++) {
						String NewFileName = NewFileNames.get(i);
						String NewFileContents = NewFileContentss.get(i);
						String NewDisplay = ProjectName + " | Created: " + NewFileName;
						IFile Newfile = project.getFile(NewFileName);
						if (Newfile.exists()) {
							Newfile.delete(true, null);
							Thread.sleep(100);
						}
						Newfile.create(new ByteArrayInputStream((NewFileContents).getBytes()), true, null);
						Thread.sleep(100);
						SmartCommonout.println("NewComponentModelHandler.Run | Component " + NewDisplay);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Model Generation Ends Here
			}

		} else {
			SmartCommonout.println(
					"Create New SmartAAS Model Handler | WORKSPACE ERROR !! project.getRawLocation() is found to be null.");
		}
		SmartCommonout.println("Create New SmartAAS Model Handler | OUT");
		return null;
	}
}
