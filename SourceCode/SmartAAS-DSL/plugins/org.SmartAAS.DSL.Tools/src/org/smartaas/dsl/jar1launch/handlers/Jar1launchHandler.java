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
package org.smartaas.dsl.jar1launch.handlers;

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

import jarLauncher.jarLaunch;

public class Jar1launchHandler extends AbstractHandler {

	public static final String JarPath = "${SMART_ROOT_ACE}/SmartAASbox/smartmdsd2aas.jar";
	public static final String Option = "RUN";

	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		SmartCommonConsole SmartCommonout = new SmartCommonConsole();
		SmartCommonout.clear();
		SmartCommonout.println("Launch SmartAAS Server | IN");
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = SRMan.getSelectedResource(window);
		IProject project = null;
		try {
			project = resource.getProject();
		} catch (Exception e1) {
			SmartCommonout.println("Launch SmartAAS Server | XXXX Error Accessing Project Resources !!");
			SmartCommonout.println(
					"Launch SmartAAS Server | XXXX Pop and use this menu on Project root folder or on one of the model files.");
			SmartCommonout.println("Launch SmartAAS Server | OUT");
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
					"Do you want to Launch SmartAAS Server for SmartMDSD " + KindOfProject + " project \n"
							+ project.getName());
			if (!yescreate) {
				SmartCommonout.println("Launch SmartAAS Server | OUT");
				SmartCommonout.line("ll");
				return null;
			}

			if ((!isComponentProject) && (!isSystemProject)) {
				SmartCommonout
						.println("Launch SmartAAS Server | XXXX Error !! SmartMDSD Component / System Model Missing !");
				SmartCommonout.println("Launch SmartAAS Server | OUT");
				return null;
			}

			String ProjectName = project.getName();
			String aas_aasx_model_filename = DBEDef.modelFolderName + ProjectName + "AAS.xml";
			IFile aas_aasx_model_file = project.getFile(aas_aasx_model_filename);
			Boolean aas_aasx_model_exists = aas_aasx_model_file.exists();
			if (aas_aasx_model_exists) {
				SmartCommonout.println("Launch SmartAAS Server | XXXX Existing AAS_AASX Model (XML) [[Found]]: "
						+ aas_aasx_model_file);
				String AAS_XML_FULLPATH = aas_aasx_model_file.getRawLocation().makeAbsolute().toOSString();
				try {
					long pid = jarLaunch.Launch(JarPath + " " + Option + " " + AAS_XML_FULLPATH, false);
					if (pid < 0) {
						SmartCommonout.println("Launch SmartAAS Server | XXXX Error launching Jar !");
					} else {
						SmartCommonout.println("Launch SmartAAS Server | Server started [pid:" + pid + "]");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				SmartCommonout.println("Launch SmartAAS Server | XXXX Existing AAS_AASX Model (XML) [[Not Found]]: "
						+ aas_aasx_model_file);
			}
		} else {
			SmartCommonout.println(
					"Launch SmartAAS Server | WORKSPACE ERROR !! project.getRawLocation() is found to be null.");
		}
		SmartCommonout.println("Launch SmartAAS Server | OUT");
		return null;
	}
}