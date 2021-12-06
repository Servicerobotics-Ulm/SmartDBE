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
package org.xtext.smartaas.sms.generator

import java.util.ArrayList
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.internal.ComponentDefinitionActivator
import org.eclipse.smartmdsd.xtext.system.componentArchitecture.ui.internal.ComponentArchitectureActivator
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.smartdbe.common.console.SmartCommonConsole
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions
import org.smartdbe.common.smartmdsdwrapper.IO
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString
import org.xtext.smartaas.sms.dsl.SMSINType
import jarLauncher.jarLaunch;

class DslGenerator extends AbstractGenerator {

	public static final String JarPath = "${SMART_ROOT_ACE}/SmartAASbox/smartmdsd2aas.jar";
	public static final String OptionSMS2XML = "SMS2XML";

	var SmartCommonConsole SmartCommonout = new SmartCommonConsole();

	var IO io = new IO();
	var cutString cs = new cutString();
	var public DebugFlag = false;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		// SmartCommonout.clear();
		SmartCommonout.println("Create New SmartAAS SMS Handler | IN");
		var String AASSMS_FullPath = "ERROR_AASSMS_FullPath";

		for (smsdef : resource.allContents.toIterable.filter(typeof(SMSINType))) {
			var ArrayList<String> payload = new ArrayList<String>();
			// var String SMSFile = smsdef.getURI + ".aas_sms"; // Save for possible use in future
			var String ProjectName = "";
			val component = smsdef.componentDefinition;
			var Boolean skipsystem = false;
			if (component !== null) {
				skipsystem = true;
				SmartCommonout.println("Create New SmartAAS SMS Handler | Found Component:" + component.name);
				ProjectName = component.name;
				payload = getComponentPayload(component);
			}
			if (!skipsystem) {
				val system = smsdef.getSystemComponentArchitecture;
				if (system !== null) {
					SmartCommonout.println("Create New SmartAAS SMS Handler | Found System:" + system.name);
					ProjectName = system.name;
					payload = getSystemPayload(system);
				}
			}
			if (DebugFlag) {
				SmartCommonout.println("Create New SmartAAS SMS Handler | PAYLOAD:");
				for (payloadentry : payload) {
					SmartCommonout.println(payloadentry);
				}
			}

			// aas_sms file that has triggered the current call to this generator
			var String SMSFilePath = "";
			var String SMSFileText = "";
			if (resource.URI.isPlatform) {
				val file = ResourcesPlugin.workspace.root.getFile(new Path(resource.URI.toPlatformString(true)))
				SMSFilePath = file.rawLocation.toOSString;
				AASSMS_FullPath = SMSFilePath;
				SMSFileText = io.FilePath2String(SMSFilePath);
			} else {
				SmartCommonout.println("Create New SmartAAS SMS Handler | ERROR: Resource URI is not Platform.");
				SmartCommonout.println("Create New SmartAAS SMS Handler | OUT");
				return;
			}
			var SmartAASSMSDefaultContents smsdc = new SmartAASSMSDefaultContents();
			var newSMSFileText = smsdc.getContents(ProjectName, payload);
			if (!newSMSFileText.getAASEntriesLOG.equals(SMSFileText.getAASEntriesLOG)) {
				var IPath path = new Path(SMSFilePath);
				var IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				var IFile smsfile = root.getFileForLocation(path);
				io.String2File(replaceAASEntries(SMSFileText, newSMSFileText), smsfile, "Replace");
			}
		}
		Thread.sleep(1200);
		LaunchSmartmdsd2aasJar(AASSMS_FullPath);
		SmartCommonout.println("Create New SmartAAS SMS Handler | OUT");
	}

	def void LaunchSmartmdsd2aasJar(String AASSMS_FullPath) {
		jarLaunch.Launch(JarPath + " " + OptionSMS2XML + " " + AASSMS_FullPath, true);
	}

	def String replaceAASEntries(String FileText, String NewFileText) {
		FileText.replace(FileText.getAASEntriesLOG, NewFileText.getAASEntriesLOG);
	}

	def String getAASEntriesLOG(String FileText) {
		cs.cutFromNextTo(FileText, "[[AASEntriesLOG_START[[", "]]AASEntriesLOG_FINISH]]", false)
	}

	def ArrayList<String> getSystemPayload(SystemComponentArchitecture system) {
		var ArrayList<String> payload = new ArrayList<String>();
		var String SystemName = system.name;
		var AASNode AAS = new AASNode(AASNode.AASNODETYPE.AAS, SystemName, "", AASNode.AASIDTYPE.IRI, ID(SystemName),
			true);
		var String runningid = SystemName;
		var AASNode BOM = new AASNode(AASNode.AASNODETYPE.SM, "BillOfMaterials", "", AASNode.AASIDTYPE.IRI,
			ID(runningid + "/BOM"));
		var AASNode BOMComponents = new AASNode(AASNode.AASNODETYPE.SMC, "Components", "", AASNode.AASIDTYPE.IRI,
			ID(runningid + "/BOM/Components"));
		var String runningidCapabilities = runningid + "/Capabilities";
		var AASNode Capabilities = new AASNode(AASNode.AASNODETYPE.SM, "Capabilities", "", AASNode.AASIDTYPE.IRI,
			ID(runningidCapabilities));
		for (comp : system.components) {
			var String componentName = comp.name;
			var String runningidBOMComponents = runningid + "/BOM/Components/" + componentName;
			var AASNode BOMComponent = new AASNode(AASNode.AASNODETYPE.ENT, componentName, "", AASNode.AASIDTYPE.IRI,
				ID(runningidBOMComponents));
			var CoordinationModuleRealization cmr = null;
			var Boolean skillsavailable = false;

			if (comp.component.elements.filter(CoordinationSlavePort).size() > 0) {
				var csp = comp.component.elements.filter(CoordinationSlavePort).get(0);
				if (csp !== null) {
					if (csp.elements.filter(SkillRealizationsRef).size() > 0) {
						var srr = csp.elements.filter(SkillRealizationsRef).get(0);
						if (srr !== null) {
							var cmrcheck = srr.skillRealizationCoordModuleRef;
							if (cmrcheck !== null) {
								skillsavailable = true;
							}
						}
					}
				}
			}
			if (skillsavailable) {
				var String runningidBOMComponentCapabilities = runningidBOMComponents + "/Capabilities";
				var AASNode BOMComponentCapabilities = new AASNode(AASNode.AASNODETYPE.ENT, "Capabilities", "",
					AASNode.AASIDTYPE.IRI, ID(runningidBOMComponentCapabilities));

				cmr = comp.component.elements.filter(CoordinationSlavePort).get(0).elements.filter(
					SkillRealizationsRef).get(0).skillRealizationCoordModuleRef;

				for (compskill : cmr.skills) {
					var String componentSkillName = compskill.skillDef.name;
					var AASNode componentSkill = new AASNode(AASNode.AASNODETYPE.CAP, componentSkillName, "",
						AASNode.AASIDTYPE.IRI, ID(runningidBOMComponentCapabilities + "/" + componentSkillName));
					BOMComponentCapabilities.children.add(componentSkill);
				}
				BOMComponent.children.add(BOMComponentCapabilities);
			}
			BOMComponents.children.add(BOMComponent);
		}
		BOM.children.add(BOMComponents);
		AAS.children.add(BOM);

		var TaskRealizationModel trm = null;
		var Boolean tasksavailable = false;

		if (system.extensions.filter(TaskRealizationModelRef).size() > 0) {
			if (system.extensions.filter(TaskRealizationModelRef).size > 0) {
				var trr = system.extensions.filter(TaskRealizationModelRef).get(0);
				if (trr !== null) {
					var tmrcheck = trr.taskModelRef;
					if (tmrcheck !== null) {
						tasksavailable = true;
					}
				}
			}
		}
		if (tasksavailable) {
			trm = system.extensions.filter(TaskRealizationModelRef).get(0).taskModelRef;
			var BehaviorName = trm.name;
			var String runningidBehavior = runningidCapabilities + "/" + BehaviorName;
			var AASNode Behavior = new AASNode(AASNode.AASNODETYPE.SMC, BehaviorName, "", AASNode.AASIDTYPE.IRI,
				ID(runningidBehavior));

			for (systemtask : trm.tasks) {
				var String systemTaskName = systemtask.taskDef.name;
				var String runningidSystemTask = runningid + "/Capabilities/" + systemTaskName;
				var AASNode Capability = new AASNode(AASNode.AASNODETYPE.CAP, systemTaskName, "", AASNode.AASIDTYPE.IRI,
					ID(runningidSystemTask));
				var AASNode inAtt = new AASNode(AASNode.AASNODETYPE.SMC, "In", "", AASNode.AASIDTYPE.IRI,
					ID(runningidSystemTask + "/In"));
				var AASNode outAtt = new AASNode(AASNode.AASNODETYPE.SMC, "Out", "", AASNode.AASIDTYPE.IRI,
					ID(runningidSystemTask + "/Out"));
				var AASNode res = new AASNode(AASNode.AASNODETYPE.SMC, "Result", "", AASNode.AASIDTYPE.IRI,
					ID(runningidSystemTask + "/Result"));
				var int counter = 0;
				for (j : systemtask.taskDef.inAttribute) {
					var String c = "i" + counter++;
					var String cid = runningidSystemTask + "/" + c;
					var AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, ID(cid));
					var AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", j.name, AASNode.AASIDTYPE.IRI,
						ID(cid + "/Name"));
					var AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", "" + j.type.cppType,
						AASNode.AASIDTYPE.IRI, ID(cid + "/Type"));
					entry.children.add(name);
					entry.children.add(type);
					inAtt.children.add(entry);
				}
				counter = 0;
				for (j : systemtask.taskDef.outAttribute) {
					var String c = "o" + counter++;
					var String cid = runningidSystemTask + "/" + c;
					var AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, ID(cid));
					var AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", j.name, AASNode.AASIDTYPE.IRI,
						ID(cid + "/Name"));
					var AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", "" + j.type.cppType,
						AASNode.AASIDTYPE.IRI, ID(cid + "/Type"));
					entry.children.add(name);
					entry.children.add(type);
					outAtt.children.add(entry);
				}
				counter = 0;
				for (j : systemtask.taskDef.results) {
					var String c = "r" + counter++;
					var String cid = runningidSystemTask + "/" + c;
					var AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, ID(cid));
					var AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Result", "" + j.result,
						AASNode.AASIDTYPE.IRI, ID(cid + "/Result"));
					var AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "ResultValue", "" + j.resultValue,
						AASNode.AASIDTYPE.IRI, ID(cid + "/ResultValue"));
					entry.children.add(name);
					entry.children.add(type);
					res.children.add(entry);
				}
				Capability.children.add(inAtt);
				Capability.children.add(outAtt);
				Capability.children.add(res);
				Behavior.children.add(Capability);
			}
			Capabilities.children.add(Behavior);
		}
		AAS.children.add(Capabilities);
		payload = AAS.getPayload();
		return payload;
	}

	def ArrayList<String> getComponentPayload(ComponentDefinition component) {
		var ArrayList<String> payload = new ArrayList<String>();
		var String ComponentName = component.name;
		var String runningid = ComponentName;
		var AASNode AAS = new AASNode(AASNode.AASNODETYPE.AAS, ComponentName, "", AASNode.AASIDTYPE.IRI,
			ID(ComponentName), true);
		var String runningidCompDef = runningid + "/Def";
		var AASNode ComponentDefinition = new AASNode(AASNode.AASNODETYPE.SM, "ComponentDefinition", "",
			AASNode.AASIDTYPE.IRI, ID(runningidCompDef));
		var String runningidCompDefIport = runningidCompDef + "/In";
		var AASNode InputPorts = new AASNode(AASNode.AASNODETYPE.SMC, "InputPorts", "", AASNode.AASIDTYPE.IRI,
			ID(runningidCompDefIport));
		var int counter = 0;
		for (port : component.elements.filter(InputPort)) {
			var String c = "i" + counter++;
			var String cid = runningidCompDefIport + "/" + c;
			val PortName = port.name;
			var AASNode Port = new AASNode(AASNode.AASNODETYPE.ENT, c, "", AASNode.AASIDTYPE.IRI, ID(cid));

			var AASNode Name = new AASNode(AASNode.AASNODETYPE.PROP, PortName, "", AASNode.AASIDTYPE.IRI,
				ID(cid + "/Name"));
			Port.children.add(Name);

			val String ServiceName = port.getService().getName();
			var AASNode Service = new AASNode(AASNode.AASNODETYPE.SM, ServiceName, "", AASNode.AASIDTYPE.IRI,
				ID(cid + "/Service"));

			val ServiceRepository = port.getService().eContainer as ServiceDefRepository
			val String ServiceRepositoryName = ServiceRepository.name;
			var AASNode ServiceRep = new AASNode(AASNode.AASNODETYPE.PROP, ServiceRepositoryName, "",
				AASNode.AASIDTYPE.IRI, ID(cid + "/ServiceRepository"));
			Service.children.add(ServiceRep);
			Port.children.add(Service);

			InputPorts.children.add(Port);
		}
		ComponentDefinition.children.add(InputPorts);

		var String runningidCompDefOport = runningidCompDef + "/Out";
		var AASNode OutputPorts = new AASNode(AASNode.AASNODETYPE.SMC, "OutputPorts", "", AASNode.AASIDTYPE.IRI,
			ID(runningidCompDefOport));
		counter = 0;

		for (port : component.elements.filter(OutputPort)) {
			var String c = "o" + counter++;
			var String cid = runningidCompDefOport + "/" + c;
			val PortName = port.name;
			var AASNode Port = new AASNode(AASNode.AASNODETYPE.ENT, c, "", AASNode.AASIDTYPE.IRI, ID(cid));

			var AASNode Name = new AASNode(AASNode.AASNODETYPE.PROP, PortName, "", AASNode.AASIDTYPE.IRI,
				ID(cid + "/Name"));
			Port.children.add(Name);

			val String ServiceName = port.getService().getName();
			var AASNode Service = new AASNode(AASNode.AASNODETYPE.SM, ServiceName, "", AASNode.AASIDTYPE.IRI,
				ID(cid + "/Service"));

			val ServiceRepository = port.getService().eContainer as ServiceDefRepository
			val String ServiceRepositoryName = ServiceRepository.name;
			var AASNode ServiceRep = new AASNode(AASNode.AASNODETYPE.PROP, ServiceRepositoryName, "",
				AASNode.AASIDTYPE.IRI, ID(cid + "/ServiceRepository"));
			Service.children.add(ServiceRep);
			Port.children.add(Service);

			OutputPorts.children.add(Port);
		}
		ComponentDefinition.children.add(OutputPorts);
		AAS.children.add(ComponentDefinition);

		var AASNode Capabilities = new AASNode(AASNode.AASNODETYPE.SM, "Capabilities", "", AASNode.AASIDTYPE.IRI,
			ID(runningid + "/Capabilities"));
		var CoordinationModuleRealization cmr = null;
		var Boolean skillsavailable = false;

		if (component.elements.filter(CoordinationSlavePort).size() > 0) {
			var csp = component.elements.filter(CoordinationSlavePort).get(0);
			if (csp !== null) {
				if (csp.elements.filter(SkillRealizationsRef).size > 0) {
					var srr = csp.elements.filter(SkillRealizationsRef).get(0);
					if (srr !== null) {
						var cmrcheck = srr.skillRealizationCoordModuleRef;
						if (cmrcheck !== null) {
							skillsavailable = true;
						}
					}
				}
			}
		}
		if (skillsavailable) {
			cmr = component.elements.filter(CoordinationSlavePort).get(0).elements.filter(SkillRealizationsRef).get(0).
				skillRealizationCoordModuleRef;
			for (compskill : cmr.skills) {
				var String componentSkillName = compskill.skillDef.name;

				var String runningidComponentSkill = runningid + "/Capabilities/" + componentSkillName;
				var AASNode Capability = new AASNode(AASNode.AASNODETYPE.CAP, componentSkillName, "",
					AASNode.AASIDTYPE.IRI, ID(runningidComponentSkill));
				var AASNode inAtt = new AASNode(AASNode.AASNODETYPE.SMC, "In", "", AASNode.AASIDTYPE.IRI,
					ID(runningidComponentSkill + "/In"));
				var AASNode outAtt = new AASNode(AASNode.AASNODETYPE.SMC, "Out", "", AASNode.AASIDTYPE.IRI,
					ID(runningidComponentSkill + "/Out"));
				var AASNode res = new AASNode(AASNode.AASNODETYPE.SMC, "Result", "", AASNode.AASIDTYPE.IRI,
					ID(runningidComponentSkill + "/Result"));
				counter = 0;
				for (j : compskill.skillDef.inAttribute) {
					var String c = "i" + counter++;
					var String cid = runningidComponentSkill + "/" + c;
					var AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, ID(cid));
					var AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", j.name, AASNode.AASIDTYPE.IRI,
						ID(cid + "/Name"));
					var AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", j.type.cppType,
						AASNode.AASIDTYPE.IRI, ID(cid + "/Type"));
					entry.children.add(name);
					entry.children.add(type);
					inAtt.children.add(entry);
				}
				counter = 0;
				for (j : compskill.skillDef.outAttribute) {
					var String c = "o" + counter++;
					var String cid = runningidComponentSkill + "/" + c;
					var AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, ID(cid));
					var AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", j.name, AASNode.AASIDTYPE.IRI,
						ID(cid + "/Name"));
					var AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", "" + j.type.cppType,
						AASNode.AASIDTYPE.IRI, ID(cid + "/Type"));
					entry.children.add(name);
					entry.children.add(type);
					outAtt.children.add(entry);
				}
				counter = 0;
				for (j : compskill.skillDef.results) {
					var String c = "r" + counter++;
					var String cid = runningidComponentSkill + "/" + c;
					var AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, ID(cid));
					var AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Result", "" + j.result,
						AASNode.AASIDTYPE.IRI, ID(cid + "/Result"));
					var AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "ResultValue", "" + j.resultValue,
						AASNode.AASIDTYPE.IRI, ID(cid + "/ResultValue"));
					entry.children.add(name);
					entry.children.add(type);
					res.children.add(entry);
				}
				Capability.children.add(inAtt);
				Capability.children.add(outAtt);
				Capability.children.add(res);
				Capabilities.children.add(Capability);
			}
		}
		AAS.children.add(Capabilities);
		payload = AAS.getPayload();
		return payload;
	}

	def ComponentDefinition getComponentDefinition(SMSINType user) {
		// create resource-set for the ServiceDefinition grammar
		val injector = ComponentDefinitionActivator.getInstance().getInjector(
			ComponentDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_COMPONENT_COMPONENTDEFINITION_COMPONENTDEFINITION);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = user.eResource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if (resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(xtextResourceUri, true);
			if (resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if (root_obj instanceof ComponentDefModel) {
					SmartCommonout.println("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri + " [✔]");
					return root_obj.component
				}
			}
		} else {
			SmartCommonout.println("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri + " [x]");
		}
		return null
	}

	def SystemComponentArchitecture getSystemComponentArchitecture(SMSINType user) {
		// create resource-set for the ServiceDefinition grammar
		val injector = ComponentArchitectureActivator.getInstance().getInjector(ComponentArchitectureActivator.
			ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_COMPONENTARCHITECTURE_COMPONENTARCHITECTURE);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = user.eResource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if (resourceExists == true) {
			// load resource
			val resourceIN = resourceSet.getResource(xtextResourceUri, true);
			if (resourceIN.loaded == true) {
				val root_obj = resourceIN.contents.get(0)
				if (root_obj instanceof SystemComponentArchitecture) {
					SmartCommonout.println("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri + " [✔]");
					return root_obj
				}
			}
		} else {
			SmartCommonout.println("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri + " [x]");
		}
		return null
	}

	def ArrayList<TaskRealization> getTaskRealizationModel(String BehaviorName) {
		val ArrayList<TaskRealization> TR = new ArrayList<TaskRealization>();
		var GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
		var BI = getSmartMDSDDef.extractBehaviorInfo(BehaviorName);
		SmartCommonout.println("Create New SmartAAS SMS Handler | BI Extraction: \n" + BI.toString() + "\n [✔]");
		return TR;
	}

	def ArrayList<TaskRealization> getTaskRealizationModel(TaskRealizationModel BehaviorModel) {
		val ArrayList<TaskRealization> TR = new ArrayList<TaskRealization>();
		var GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
		var BI = getSmartMDSDDef.extractBehaviorInfo(BehaviorModel);
		SmartCommonout.println("Create New SmartAAS SMS Handler | BI Extraction: \n" + BI.toString() + "\n [✔]");
		return TR;
	}

	def String getURI(SMSINType user) {
		val baseUri = user.eResource.URI.trimFileExtension;
		return baseUri.toString;
	}

	def String ID(String in) {
		return "Smartaasid/" + in;
	}

	def String ID(String type, String runningid, String in) {
		if (type.equals(AASNode.AASIDTYPE.IRI.toString())) {
			return "Smartaasid/" + runningid + in;
		} else {
			return in;
		}
	}

	def String encap(String in) {
		return "ENTRY {\"" + in + "\"};"
	}

	def String getProjectName(Resource resource) {
		var String URIFile = resource.getModelFileName;
		var String URIProjectName = URIFile.substring(0, URIFile.indexOf("."));
		return URIProjectName;
	}

	def String getModelFileName(Resource resource) {
		val URIFile = resource.URI.segments.get(resource.URI.segments.size() - 1);
		return URIFile.toString;
	}

	def Boolean wrongAASIDTYPE(String disproot, String can) {
		if (!AASNode.AASIDTYPE.isValid(can)) {
			SmartCommonout.println(
				"Create New SmartAAS " + disproot + " Handler | Compiler Error: " + "SemanticIdType: XX[" + can +
					"]XX");
			SmartCommonout.println("Create New SmartAAS " + disproot + " Handler | Compiler Exiting!");
			return true;
		}
		return false;
	}

	def AASNode getGenericEntryNode(String runningid, AASNode.AASNODETYPE nodetype, String EntityName,
		String EntitySIDType, String EntitySIDVal) {
		var String EntitySemanticIdType = EntitySIDType;
		if (wrongAASIDTYPE("Command", EntitySemanticIdType)) {
			return null;
		}
		var String EntityTextSemanticId = ID(EntitySemanticIdType, runningid, EntitySIDVal);
		return new AASNode(nodetype, EntityName, "", AASNode.AASIDTYPE.valueOf(EntitySemanticIdType),
			EntityTextSemanticId);
	}

	def String cppType(AbstractAttributeType type) {
		if (type instanceof PrimitiveType) {
			switch (type) {
				case type.typeName == PRIMITIVE_TYPE_NAME.INT8: "char"
				case type.typeName == PRIMITIVE_TYPE_NAME.INT16: "short"
				case type.typeName == PRIMITIVE_TYPE_NAME.INT32: "int"
				case type.typeName == PRIMITIVE_TYPE_NAME.INT64: "long int"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT8: "unsigned char"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT16: "unsigned short"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT32: "unsigned int"
				case type.typeName == PRIMITIVE_TYPE_NAME.UINT64: "unsigned long int"
				case type.typeName == PRIMITIVE_TYPE_NAME.FLOAT: "float"
				case type.typeName == PRIMITIVE_TYPE_NAME.DOUBLE: "double"
				case type.typeName == PRIMITIVE_TYPE_NAME.STRING: "std::string"
				case type.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: "bool"
			}
		} else {
			"NotPrimitiveType"
		}
	}
}
