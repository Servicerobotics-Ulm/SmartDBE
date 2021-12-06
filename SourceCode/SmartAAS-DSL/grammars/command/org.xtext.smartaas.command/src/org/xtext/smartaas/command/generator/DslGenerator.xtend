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
package org.xtext.smartaas.command.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.smartdbe.common.console.SmartCommonConsole
import org.smartdbe.common.smartmdsdwrapper.IO
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString
import org.xtext.smartaas.command.dsl.CommandSubmodel
import java.util.ArrayList
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.IFile

import org.xtext.smartaas.sms.generator.SmartAASSMSDefaultContents
import org.xtext.smartaas.sms.generator.AASNode
import org.xtext.smartaas.command.dsl.SID

class DslGenerator extends AbstractGenerator {

	var org.xtext.smartaas.sms.generator.DslGenerator sms = new org.xtext.smartaas.sms.generator.DslGenerator();

	var SmartCommonConsole SmartCommonout = new SmartCommonConsole();
	var IO io = new IO();
	var cutString cs = new cutString();
	var public DebugFlag = false;

	var String ModelFilePath = "";
	var String ModelFile = "";
	var String ProjectName = "";

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		// SmartCommonout.clear();
		SmartCommonout.println("Create New SmartAAS Command Handler | IN");
		ModelFilePath = resource.getURI.toString;
		ModelFile = sms.getModelFileName(resource);
		ProjectName = sms.getProjectName(resource);
		SmartCommonout.println("Create New SmartAAS Command Handler | ProjectName: " + ProjectName);
		SmartCommonout.println("Create New SmartAAS Command Handler | ModelFile  : " + ModelFile);
		SmartCommonout.println("   Path : " + ModelFilePath);
		var ArrayList<String> payload = resource.getCommandPayload;
		if (payload === null) {
			return;
		}
		if (DebugFlag) {
			SmartCommonout.println("Create New SmartAAS Command Handler | PAYLOAD:");
			for (payloadentry : payload) {
				SmartCommonout.println(payloadentry);
			}
		}

		// aas_command file that has triggered the current call to this generator
		var String commandFilePath = "";
		if (resource.URI.isPlatform) {
			val file = ResourcesPlugin.workspace.root.getFile(new Path(resource.URI.toPlatformString(true)))
			commandFilePath = file.rawLocation.toOSString;
		} else {
			SmartCommonout.println("Create New SmartAAS command Handler | ERROR: Resource URI is not Platform.");
			SmartCommonout.println("Create New SmartAAS command Handler | OUT");
			return;
		}
		var String SMSFilePath = commandFilePath.replace(".aas_command", ".aas_sms");
		var String SMSFileText = io.FilePath2String(SMSFilePath);
		if (DebugFlag) {
			SmartCommonout.println("Create New SmartAAS Command Handler | GOT:");
			SmartCommonout.println(SMSFileText.getAASCommandEntriesLOG);
		}
		var SmartAASSMSDefaultContents smsdc = new SmartAASSMSDefaultContents();
		var String newAASCommandSubModel = smsdc.getAASCommandSubModel(ProjectName, payload);
		if (!newAASCommandSubModel.getAASCommandEntriesLOG.equals(SMSFileText.getAASCommandEntriesLOG)) {
			var IPath path = new Path(SMSFilePath);
			var IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			var IFile smsfile = root.getFileForLocation(path);
			io.String2File(replaceAASCommandEntries(SMSFileText, newAASCommandSubModel), smsfile, "Replace");
		}
		SmartCommonout.println("Create New SmartAAS Command Handler | OUT");
	}

	def String replaceAASCommandEntries(String FileText, String NewFileText) {
		FileText.replace(FileText.getAASCommandEntriesLOG, NewFileText.getAASCommandEntriesLOG);
	}

	def String getAASCommandEntriesLOG(String FileText) {
		cs.cutFromNextTo(FileText, "[[AASEntriesLOG_Command_START[[", "]]AASEntriesLOG_Command_FINISH]]", false)
	}

	def ArrayList<String> getCommandPayload(Resource resource) {
		var ArrayList<String> payload = new ArrayList<String>();
		var AASNode AAS = new AASNode(AASNode.AASNODETYPE.AAS, ProjectName, "", AASNode.AASIDTYPE.IRI,
			sms.ID(ProjectName), true);
		var String runningid = ProjectName + "/SmartMDSDCommands";
		var AASNode SmartMDSDCommands = new AASNode(AASNode.AASNODETYPE.SM, "SmartMDSDCommands", "",
			AASNode.AASIDTYPE.IRI, sms.ID(runningid));
		runningid = runningid + "/";
		for (modeldef : resource.allContents.toIterable.filter(typeof(CommandSubmodel))) {
			var AASNode SmartMDSDCommand = getGenericEntryNode(runningid, AASNode.AASNODETYPE.SM, modeldef.name,
				modeldef.semanticId);
			if (SmartMDSDCommand === null) {
				return null;
			}
			if (modeldef.commandtext !== null) {
				var String runningidin = runningid + modeldef.semanticId.II + "/";
				var AASNode SmartMDSDCommandCommandText = getGenericEntryNode(runningidin, AASNode.AASNODETYPE.PROP,
					modeldef.commandtext.name, modeldef.commandtext.semanticId);
				if (SmartMDSDCommandCommandText === null) {
					return null;
				}
				SmartMDSDCommand.children.add(SmartMDSDCommandCommandText);
			}

			SmartMDSDCommands.children.add(SmartMDSDCommand);
		}
		AAS.children.add(SmartMDSDCommands);
		payload = AAS.getPayload();
		payload.remove(0);
		return payload;
	}

	def AASNode getGenericEntryNode(String runningid, AASNode.AASNODETYPE nodetype, String EntityName, SID EntitySID) {
		return sms.getGenericEntryNode(runningid, nodetype, EntityName, EntitySID.name, EntitySID.II);
	}
}
