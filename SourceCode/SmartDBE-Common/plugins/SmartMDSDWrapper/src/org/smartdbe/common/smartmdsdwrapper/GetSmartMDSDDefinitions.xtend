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
//  This file is part of the Digital Business Ecosystem (SmartDBE) extension 
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
package org.smartdbe.common.smartmdsdwrapper

import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.ArrayTypeImpl
import org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.PrimitiveTypeImpl
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort
import org.eclipse.smartmdsd.ecore.component.componentDependencyGraphExtension.ComponentDependencyObject
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationMasterPort
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommElementReferenceImpl
import org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommObjectModelImpl
import org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommunicationObjectImpl
import org.eclipse.smartmdsd.ecore.service.communicationObject.impl.EnumerationImpl
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel
import org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.xtext.behavior.taskRealization.ui.internal.TaskRealizationActivator
import org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.internal.ComponentDefinitionActivator
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.internal.ServiceDefinitionActivator
import org.eclipse.smartmdsd.xtext.system.componentArchitecture.ui.internal.ComponentArchitectureActivator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.smartdbe.common.define.DBEDefine
import org.smartdbe.common.define.TSDefine
import org.smartdbe.common.smartmdsdwrapper.console.SmartMDSDWrapperConsole
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString

class GetSmartMDSDDefinitions {

	// NOTE: This class is usable for instances when Models other than In-Memory
	// model are required to be referred
	SmartMDSDWrapperConsole SmartMDSDWrapperout = new SmartMDSDWrapperConsole();
	var DBEDefine DBEDef = new DBEDefine();
	var TSDefine TSDef = new TSDefine();
	var cutString cStr = new cutString();

	def List<String> extractComments(String strin) {
		var List<String> comments = new ArrayList<String>();
		// Source: https://stackoverflow.com/questions/6640071/how-to-find-all-comments-in-the-source-code
		var String SingleLineComment = "//[^\r\n]*";
		var String MultiLineComment = "/\\*[\\s\\S]*?\\*/";
		var String StringLiteral = "\"(?:\\\\.|[^\\\\\"\r\n])*\"";
		var String CharacterLiteral = "'(?:\\\\.|[^\\\\'\r\n])+'";
		var String All = "[\\s\\S]";
		var Pattern pattern = Pattern.compile(
			String.format("(%s)|(%s)|%s|%s|%s", SingleLineComment, MultiLineComment, StringLiteral, CharacterLiteral,
				All)
		);
		var Matcher matcher = pattern.matcher(strin);
		while (matcher.find()) {
			var String hit = matcher.group();
			if (matcher.group(1) !== null) {
				comments.add(hit);
			}
			if (matcher.group(2) !== null) {
				comments.add(hit);
			}
		}
		return comments;
	}

	def String extractCommentsDoc(String strin) {
		var String str = "";
		var List<String> comments = new ArrayList<String>();
		comments = extractComments(strin);
		for (var int i = 0; i < comments.size(); i++) {
			var String comment = comments.get(i);
			str = str + comment.trim() + "\n";
		}
		str = str.trim();
		return str;
	}

	def List<String> extractCommentEmbeddedCommands(String strin) {
		var List<String> commands = new ArrayList<String>();
		var List<String> comments = new ArrayList<String>();
		comments = extractComments(strin);
		for (var int i = 0; i < comments.size(); i++) {
			var String comment = comments.get(i);
			var String command = "";
			command = cStr.cutFromTo(comment, DBEDef.CommentEmbeddedCommandStartString,
				DBEDef.CommentEmbeddedCommandENDString, true);
			if ("" != command) {
				commands.add(command.trim());
			}
		}
		return commands;
	}

	def Boolean CommandIsIGNORE(String Command) {
		return Command.contains(DBEDef.CommentEmbeddedCommandIGNOREString);
	}

	def Boolean CommandIsRUN(String Command) {
		return Command.contains(DBEDef.CommentEmbeddedCommandRUNString);
	}

	def String CommandCheck(String Command) {
		val Boolean isIgnore = CommandIsIGNORE(Command);
		val Boolean isRun = CommandIsRUN(Command);
		if (isIgnore == isRun) {
			return "ERROR";
		}
		if (isIgnore) {
			return "IGNORE";
		}
		if (isRun) {
			return "RUN";
		}
	}

	def String CommandString(String Command) {
		var String commout = Command;
		commout = commout.replace(DBEDef.CommentEmbeddedCommandIGNOREString, "");
		commout = commout.replace(DBEDef.CommentEmbeddedCommandRUNString, "");
		return commout;
	}

	def String CommandInfoString(String Command) {
		return CommandCheck(Command) + " : " + CommandString(Command);
	}

	def void displayCommands(List<String> Commands) {
		for (var int i = 0; i < Commands.size(); i++) {
			SmartMDSDWrapperout.println(CommandInfoString(Commands.get(i)));
		}
		if (Commands.size() >= 1) {
			SmartMDSDWrapperout.println(DBEDef.CommentEmbeddedCommandWarningString);
		}
	}

	def String removeComments(String strin) {
		var str = strin;
		var List<String> comments = new ArrayList<String>();
		comments = extractComments(strin);
		for (var int i = 0; i < comments.size(); i++) {
			var String comment = comments.get(i);
			var int index = str.indexOf(comment);
			var String str1 = str.substring(0, index);
			var String str2 = str.substring(index + comment.length(), str.length());
			str = " " + str1.trim() + " " + str2.trim() + " ";
		}
		str = " " + str.trim() + " ";
		return str;
	}

	def String removeMultiWhiteSpaces(String strin) {
		var String str = strin.trim();
		val String regex = "\\s+";
		var Pattern pattern = Pattern.compile(regex);
		var Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll(" ");
	}

	def String smartsubstring(String str, String from, String to, Boolean cutf, Boolean cutt, Boolean trim,
		Boolean returnempty) {
		var int f = str.indexOf(from);
		var int t = str.indexOf(to);
		if ("" == from)
			f = 0;
		if ("" == to)
			t = str.length;
		if ((-1 == f) || (-1 == t) || (f >= t)) {
			if (returnempty)
				return ""
			else
				return str
		} else {
			var String strout = str.substring(f, t + to.length);
			if (cutf) {
				strout = strout.substring(from.length);
			}
			if (cutt) {
				strout = strout.substring(0, strout.length - to.length);
			}
			if (trim)
				strout = strout.trim();
			return strout;
		}
	}

	def String extractService(String FileText, String PortName) {
		var String servicename = "";
		return servicename;
	}

	def String getProjectNameToAbsPathToRoot(String servicemodelname) {
		var String servicemodelfileAbsPath = "";
		return servicemodelfileAbsPath;
	}

	def Boolean checkPattern(String ModelText, String PatternName) {
		return ModelText.contains(PatternName + " <") || ModelText.contains(PatternName + "<")
	}

	def CommObjectURIInfo sub2CommObjectURIInfo(String sub, String HeaderText) {
		var CommObjectURIInfo CUI = new CommObjectURIInfo();
		var CommObjectURIInfo nullCUI = new CommObjectURIInfo();
		nullCUI.Name = "INVALID";
		nullCUI.CommObjectRepoName = "INVALID";
		nullCUI.CommObjectName = "INVALID";
		var String CommObjectURI = "";
		var String tmp = "";
		CommObjectURI = smartsubstring(sub, HeaderText, "", true, true, true, true);
		CommObjectURI = smartsubstring(CommObjectURI, "=", "", true, true, true, true);
		tmp = smartsubstring(CommObjectURI, "", " ", true, true, true, true);
		if (tmp.equals("")) {
			CommObjectURI = smartsubstring(CommObjectURI, "", ">", true, true, true, true);
		} else {
			CommObjectURI = tmp;
		}
		if (CommObjectURI.equals("")) {
			return nullCUI;
		} else {
			CUI.Name = CommObjectURI;
			CUI.CommObjectRepoName = CommObjectURI.substring(0, CommObjectURI.indexOf("."));
			CUI.CommObjectName = CommObjectURI.substring(CommObjectURI.indexOf(".") + 1);
			if (!CUI.isValid()) {
				return nullCUI;
			}
		}
		return CUI;
	}

	def String CommObjModelTextFromCommObjRepoModelText(String CommObjRepoModelText, String CommObjName) {
		var String CommObjModelText = "";
		CommObjModelText = cStr.cutFrom(CommObjRepoModelText, "CommObject " + CommObjName, false);
		CommObjModelText = cStr.cutTo(CommObjModelText, "}", false);
		return CommObjModelText;
	}

	def String AttributeTypeFromCommObjModelText(String CommObjModelText, String AttributeName) {
		var String AttributeType = "";
		AttributeType = cStr.cutFromTo(CommObjModelText, "{", "}", true);
		AttributeType = cStr.cutFrom(AttributeType, AttributeName, true);
		AttributeType = cStr.cutFrom(AttributeType, ":", true);
		AttributeType = AttributeType.trim();
		if (AttributeType.indexOf(" ") < 1) {
			return AttributeType;
		}
		AttributeType = cStr.cutTo(AttributeType, " ", true);
		return AttributeType;
	}

	def BehaviorInfo getBehaviorInfo(String TaskRealizationModelfileAbsPath) {
		var BehaviorInfo BI = new BehaviorInfo();
		val injector = TaskRealizationActivator.getInstance().getInjector(
			TaskRealizationActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_BEHAVIOR_TASKREALIZATION_TASKREALIZATION);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val modeluri = URI.createFileURI(TaskRealizationModelfileAbsPath);
		val resourceExists = resourceSet.URIConverter.exists(modeluri, null)
		if (resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(modeluri, true);
			if (resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if (root_obj instanceof TaskRealizationModel) {
					BI.TR = root_obj;
					BI.Name = BI.TR.getName();
					for (entry : BI.TR.getAbstCoordInst()) {
						// Skills in entry are not loaded!!
						// It is because we are accessing it using file Absolute Path.
						var AbstractCoordinationModuleInstanceInfo ACMII = new AbstractCoordinationModuleInstanceInfo();
						ACMII.ACMIns = entry;
						ACMII.Name = ACMII.ACMIns.getName();
						var CoordinationModuleDefinition CMDef = ACMII.ACMIns.getCoordModuleDef();
						ACMII.CMDef = CMDef;
						ACMII.Skills = ACMII.CMDef.getSkills();
						BI.ACMII.add(ACMII);
					}
				}
			}
		}
		return BI;
	}

	def BehaviorInfo getBehaviorInfo(TaskRealizationModel BehaviorModel) {
		var BehaviorInfo BI = new BehaviorInfo();
		BI.TR = BehaviorModel;
		BI.Name = BI.TR.getName();
		for (entry : BI.TR.getAbstCoordInst()) {
			var AbstractCoordinationModuleInstanceInfo ACMII = new AbstractCoordinationModuleInstanceInfo();
			ACMII.ACMIns = entry;
			ACMII.Name = ACMII.ACMIns.getName();
			var CoordinationModuleDefinition CMDef = ACMII.ACMIns.getCoordModuleDef();
			ACMII.CMDef = CMDef;
			ACMII.Skills = ACMII.CMDef.getSkills();
			BI.ACMII.add(ACMII);
		}
		return BI;
	}

	def ServiceRepoInfo getServiceDefRepository(String servicemodelfileAbsPath) {
		var ServiceRepoInfo SRI = new ServiceRepoInfo();
		val injector = ServiceDefinitionActivator.getInstance().getInjector(
			ServiceDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SERVICE_SERVICEDEFINITION_SERVICEDEFINITION);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val modeluri = URI.createFileURI(servicemodelfileAbsPath);
		val resourceExists = resourceSet.URIConverter.exists(modeluri, null)
		if (resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(modeluri, true);
			if (resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if (root_obj instanceof ServiceDefModel) {
					SRI.SDef = root_obj;
					SRI.SDefRepo = SRI.SDef.getRepository();
					SRI.Name = SRI.SDefRepo.getName();
					for (var int i = 0; i < SRI.SDefRepo.services.size; i++) {
						var serv = SRI.SDefRepo.services.get(i);
						var ServiceInfo newSI = new ServiceInfo();
						newSI.Name = serv.name;
						SRI.Services.add(newSI);
					}
				}
			}
			// Filling ServiceInfo
			var String ServiceModelRepositoryText = Files.readString(Paths.get(servicemodelfileAbsPath));
			var List<String> ServiceModelRepositoryCommands = extractCommentEmbeddedCommands(
				ServiceModelRepositoryText);
			displayCommands(ServiceModelRepositoryCommands);
			ServiceModelRepositoryText = removeComments(ServiceModelRepositoryText);
			ServiceModelRepositoryText = removeMultiWhiteSpaces(ServiceModelRepositoryText);
			ServiceModelRepositoryText = ServiceModelRepositoryText.substring(
				ServiceModelRepositoryText.indexOf("ServiceDefRepository " + SRI.Name));
			SmartMDSDWrapperout.println("GetSmartMDSDDefinitions | " + SRI.Name);
			for (var int i = 0; i < SRI.Services.size(); i++) {
				var String ServiceName = SRI.Services.get(i).Name;
				var String ServiceModelText = "";
				var String ServiceType = "";
				var String PatternType = "";
				var String CommObjTrace = "";
				var int rootindex = ServiceModelRepositoryText.indexOf("Definition " + ServiceName);
				var Boolean nobreakinxtend = true;
				for (var int t = 1; ((t < 50) && (nobreakinxtend)); t++) {
					var String s = ServiceModelRepositoryText.substring(rootindex - t, rootindex - t + 1);
					if (s.equals(" ")) {
						ServiceType = ServiceModelRepositoryText.substring(rootindex - t + 1, rootindex) + "Definition";
						rootindex = ServiceModelRepositoryText.indexOf(ServiceType + " " + ServiceName);
						ServiceModelText = ServiceModelRepositoryText.substring(rootindex);
						ServiceModelText = ServiceModelText.substring(0, ServiceModelText.indexOf("}") + 1);
						nobreakinxtend = false;
					}
				}
				SRI.Services.get(i).ServiceType = ServiceType;
				var Boolean CommObjectURIInfoisNull = false;
				var Boolean OneOfTheCurrentlyHandledServicePattern = false;
				if (ServiceType.equals("ForkingServiceDefinition")) {
					var Boolean isEventPattern = checkPattern(ServiceModelText, "EventPattern");
					var Boolean isPushPattern = checkPattern(ServiceModelText, "PushPattern");
					var String sub = ServiceModelText.substring(ServiceModelText.indexOf("<"),
						ServiceModelText.indexOf(">") + 1);
					if (isEventPattern) {
						PatternType = "EventPattern";
						OneOfTheCurrentlyHandledServicePattern = true;
						SRI.Services.get(i).PatternType = PatternType;
						SRI.Services.get(i).ActivationType = sub2CommObjectURIInfo(sub, "ActivationType");
						if (! SRI.Services.get(i).ActivationType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "ActivationType";
						}
						SRI.Services.get(i).EventType = sub2CommObjectURIInfo(sub, "EventType");
						if (! SRI.Services.get(i).EventType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "EventType";
						}
						SRI.Services.get(i).EventStateType = sub2CommObjectURIInfo(sub, "EventStateType");
						if (! SRI.Services.get(i).EventStateType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "EventStateType";
						}
					}
					if (isPushPattern) {
						PatternType = "PushPattern";
						OneOfTheCurrentlyHandledServicePattern = true;
						SRI.Services.get(i).PatternType = PatternType;
						SRI.Services.get(i).DataType = sub2CommObjectURIInfo(sub, "DataType");
						if (! SRI.Services.get(i).DataType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "DataType";
						}
					}
				}
				if (ServiceType.equals("RequestAnswerServiceDefinition")) {
					var Boolean isQueryPattern = checkPattern(ServiceModelText, "QueryPattern");
					var String sub = ServiceModelText.substring(ServiceModelText.indexOf("<"),
						ServiceModelText.indexOf(">") + 1);
					if (isQueryPattern) {
						PatternType = "QueryPattern";
						OneOfTheCurrentlyHandledServicePattern = true;
						SRI.Services.get(i).PatternType = PatternType;
						SRI.Services.get(i).RequestType = sub2CommObjectURIInfo(sub, "RequestType");
						if (! SRI.Services.get(i).RequestType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "RequestType";
						}
						SRI.Services.get(i).AnswerType = sub2CommObjectURIInfo(sub, "AnswerType");
						if (! SRI.Services.get(i).AnswerType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "AnswerType";
						}
					}
				}
				if (ServiceType.equals("JoiningServiceDefinition")) {
					var Boolean isSendPattern = checkPattern(ServiceModelText, "SendPattern");
					var String sub = ServiceModelText.substring(ServiceModelText.indexOf("<"),
						ServiceModelText.indexOf(">") + 1);
					if (isSendPattern) {
						PatternType = "SendPattern";
						OneOfTheCurrentlyHandledServicePattern = true;
						SRI.Services.get(i).PatternType = PatternType;
						SRI.Services.get(i).DataType = sub2CommObjectURIInfo(sub, "DataType");
						if (! SRI.Services.get(i).DataType.isValid()) {
							CommObjectURIInfoisNull = true;
							CommObjTrace = "DataType";
						}
					}
				}
				SRI.Services.get(i).OneOfTheCurrentlyHandledServicePattern = OneOfTheCurrentlyHandledServicePattern;
				if (OneOfTheCurrentlyHandledServicePattern) {
					if (ServiceType.equals("") || ServiceName.equals("") || PatternType.equals("") ||
						CommObjectURIInfoisNull) {
						SmartMDSDWrapperout.println(
							"ERROR !! GetSmartMDSDDefinitions | MODEL Error " + ServiceName + " @ " +
								servicemodelfileAbsPath);
						SmartMDSDWrapperout.println(
							"Trace : " + ServiceType + " | " + ServiceName + " | " + PatternType + " | " +
								CommObjTrace);
						SRI = null;
						return SRI;
					}
				}
			}
		} else {
			SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |non-existing resource: " +
				servicemodelfileAbsPath);
			SRI = null;
		}

		var String commobjectmodelfileAbsPath = servicemodelfileAbsPath.substring(0,
			servicemodelfileAbsPath.lastIndexOf(".")) + DBEDef.DomainTypesFileExtension;
		val datamodeluri = URI.createFileURI(commobjectmodelfileAbsPath);
		val dataresourceExists = resourceSet.URIConverter.exists(datamodeluri, null)
		if (dataresourceExists == true) {
			// load resource
			val dataresource = resourceSet.getResource(datamodeluri, true);
			if (dataresource.loaded == true) {

				var String CommObjRepoModelText = Files.readString(Paths.get(commobjectmodelfileAbsPath));
				var List<String> CommObjRepoModelCommands = extractCommentEmbeddedCommands(CommObjRepoModelText);
				displayCommands(CommObjRepoModelCommands);
				CommObjRepoModelText = removeComments(CommObjRepoModelText);
				CommObjRepoModelText = removeMultiWhiteSpaces(CommObjRepoModelText);
				var String CommModelRepoImportText = cStr.cutFromTo(CommObjRepoModelText, "#import ",
					"CommObjectsRepository " + SRI.Name, false);
				CommObjRepoModelText = cStr.cutFrom(CommObjRepoModelText, "CommObjectsRepository " + SRI.Name, false);

				val root_obj = dataresource.contents.get(0)
				if (root_obj instanceof CommObjectModelImpl) {
					SRI.CObj = root_obj;
					SRI.CObjRepo = SRI.CObj.getRepository();
					for (var int i = 0; i < SRI.CObjRepo.elements.size; i++) {
						var commobj = SRI.CObjRepo.elements.get(i);
						var CommObjectInfo newCOI = new CommObjectInfo();
						newCOI.Name = commobj.name;
						newCOI.setLevel(1);
						var String CommObjModelText = CommObjModelTextFromCommObjRepoModelText(CommObjRepoModelText,
							newCOI.Name);
						if (commobj instanceof EnumerationImpl) {
							newCOI.isEnum = true;
							newCOI.Type = "Enumeration";
							var Enumlist = commobj.enums;
							for (var int e = 0; e < Enumlist.size(); e++) {
								var EnumInfo newEnum = new EnumInfo();
								newEnum.value = e;
								newEnum.identifier = Enumlist.get(e).name;
								newCOI.addEnum(newEnum);
							}
						} else if (commobj instanceof CommunicationObjectImpl) {
							newCOI.isEnum = false;
							newCOI.Type = "CommObject";
							var CommunicationObject CO = commobj as CommunicationObject;
							for (var int j = 0; j < CO.attributes.size(); j++) {
								var att = CO.attributes.get(j);
								var AttributeInfo AI = new AttributeInfo();
								AI.Name = att.name;
								if (att.type.array instanceof ArrayTypeImpl) {
									AI.isArrayType = true;
									AI.ArrayLengthString = att.type.array.length;
									if (AI.ArrayLengthString.equals(TSDef.TestSetArrayVarSz)) {
										AI.ArrayLength = Integer.MAX_VALUE;
									} else {
										AI.ArrayLength = Integer.parseInt(AI.ArrayLengthString);
									}
								}
								if (att.type instanceof PrimitiveTypeImpl) {
									AI.isPrimitiveType = true;
									var ty = att.type as PrimitiveType;
									AI.Type = ty.typeName.getName();
								} else if (att.type instanceof CommElementReferenceImpl) {
									AI.isPrimitiveType = false;
									var childCommObj = att.type as CommElementReferenceImpl;

									if (childCommObj.typeName instanceof EnumerationImpl) {
										AI.Type = AttributeTypeFromCommObjModelText(CommObjModelText, AI.Name);
										AI.isImported = true;
									} else {
										AI.Type = childCommObj.typeName.name;
										AI.isImported = false;
									}
									if (AI.Type.equals("")) {
										SmartMDSDWrapperout.println(
											"ERROR !! GetSmartMDSDDefinitions | MODEL Error " + AI.Name + " @ " +
												commobjectmodelfileAbsPath);
										SmartMDSDWrapperout.println(
											"ERROR !! GetSmartMDSDDefinitions | Trace:  " + AI.toString());
									}
								} else {
									SmartMDSDWrapperout.println(
										"ERROR !! GetSmartMDSDDefinitions | MODEL Error " + AI.Name + " @ " +
											commobjectmodelfileAbsPath);
									SmartMDSDWrapperout.println(
										"ERROR !! GetSmartMDSDDefinitions | Trace:  " + AI.toString());
								}
								newCOI.addAttribute(AI);
							}
						} else {
							SmartMDSDWrapperout.println(
								"ERROR !! GetSmartMDSDDefinitions | MODEL Error " + newCOI.Name + " @ " +
									commobjectmodelfileAbsPath);
							SmartMDSDWrapperout.println(
								"ERROR !! GetSmartMDSDDefinitions | Trace:  " + newCOI.toString());
						}
						SRI.CommObjects.add(newCOI);
					}
				}
				// Handling Local Enum Attributes incorrectly labeled as imported
				for (var int i = 0; i < SRI.CommObjects.size(); i++) {
					for (var int j = 0; j < SRI.CommObjects.get(i).Attributes.size(); j++) {
						if (SRI.CommObjects.get(i).Attributes.get(j).isImported) {
							var String CheckEnum = SRI.CommObjects.get(i).Attributes.get(j).Type;
							for (var int k = 0; k < SRI.CommObjects.size(); k++) {
								if (SRI.CommObjects.get(k).isEnum) {
									if (SRI.CommObjects.get(k).Name.equals(CheckEnum)) {
										SRI.CommObjects.get(i).Attributes.get(j).isImported = false;
									}
								}
							}
						}
					}
				}
				// Adding Referenced Service models
				var lastIndex = 0;
				var count = 0;
				while (lastIndex != -1) {
					var String importstr = "#import ";
					lastIndex = CommModelRepoImportText.indexOf(importstr, lastIndex);
					if (lastIndex != -1) {
						count++;
						var String tmp = CommModelRepoImportText.substring(lastIndex);
						tmp = cStr.cutFromTo(tmp, importstr, ".", true);
						SRI.ReferencedServices.add(tmp);
						lastIndex += importstr.length();
					}
				}
			}
		}
		return SRI;
	}

	def ServiceRepoInfo extractServiceRepoInfo(String ServiceRepoName) {
		var ServiceRepoInfo SRI = new ServiceRepoInfo();
		SmartMDSDWrapperout.println("Extracting Service Repository Information for: " + ServiceRepoName + " | IN");
		var IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		var IProject ServiceRepoProject = workspaceRoot.getProject(ServiceRepoName);
		if (ServiceRepoProject.exists()) {
			SmartMDSDWrapperout.println("Extracting Service Repository Information for: " + ServiceRepoName +
				" | [Found] in workspace.");
			var String servicemodelfilename = DBEDef.modelFolderName + ServiceRepoProject.getName() +
				DBEDef.DomainServicesFileExtension;
			var IFile servicemodelfile = ServiceRepoProject.getFile(servicemodelfilename);
			var String servicemodelfileAbsPath = servicemodelfile.getRawLocation().toOSString();
			SRI = getServiceDefRepository(servicemodelfileAbsPath);
		} else {
			SmartMDSDWrapperout.println("Extracting Service Repository Information for: " + ServiceRepoName +
				" | [Missing] in workspace. [ERROR]");
			SRI = null;
		}
		SmartMDSDWrapperout.println("Extracting Service Repository Information for: " + ServiceRepoName + " | OUT");
		return SRI;
	}

	def BehaviorInfo extractBehaviorInfo(String BehaviorName) {
		var BehaviorInfo BI = new BehaviorInfo();
		SmartMDSDWrapperout.println("Extracting Behavior Information for: " + BehaviorName + " | IN");
		var IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		var IProject BehaviorProject = workspaceRoot.getProject(BehaviorName);
		if (BehaviorProject.exists()) {
			SmartMDSDWrapperout.println("Extracting Behavior Information for: " + BehaviorName +
				" | [Found] in workspace.");
			var String TaskRealizationModelfilename = DBEDef.modelFolderName + BehaviorProject.getName() +
				DBEDef.TaskRealizationModelfilenameFileExtension;
			var IFile TaskRealizationModelfile = BehaviorProject.getFile(TaskRealizationModelfilename);
			var String TaskRealizationModelfileAbsPath = TaskRealizationModelfile.getRawLocation().toOSString();
			SmartMDSDWrapperout.println(
				"Extracting Behavior Information for: " + BehaviorName + " | TaskRealizationModel file AbsPath: " +
					TaskRealizationModelfileAbsPath);
			BI = getBehaviorInfo(TaskRealizationModelfileAbsPath);
		} else {
			SmartMDSDWrapperout.println("Extracting Behavior Information for: " + BehaviorName +
				" | [Missing] in workspace. [ERROR]");
			BI = null;
		}
		SmartMDSDWrapperout.println("Extracting Behavior Information for: " + BehaviorName + " | OUT");
		return BI;
	}

	def BehaviorInfo extractBehaviorInfo(TaskRealizationModel BehaviorModel) {
		var BehaviorInfo BI = new BehaviorInfo();
		SmartMDSDWrapperout.println("Extracting Behavior Information for: " + BehaviorModel.name + " | IN");
		BI = getBehaviorInfo(BehaviorModel);
		SmartMDSDWrapperout.println("Extracting Behavior Information for: " + BehaviorModel.name + " | OUT");
		return BI;
	}

	def ServiceRepoInfo findImportSource(ServiceRepoInfo SRIin, AttributeInfo AI) {
		for (var int i = 0; i < SRIin.ReferencedServices.size(); i++) {
			val ServiceRepoInfo SRI = extractServiceRepoInfo(SRIin.ReferencedServices.get(i));
			if (null === SRI) {
				SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |non-existing resource: " +
					SRIin.ReferencedServices.get(i));
			} else {
				for (var int j = 0; j < SRI.CommObjects.size(); j++) {
					if (SRI.CommObjects.get(j).Name.equals(AI.Type)) {
						return SRI;
					}
				}
			}
		}
		return null;
	}

	def AttributeInfo CommObjectInfo2AttributeInfo(ServiceRepoInfo SRI, CommObjectInfo CO, AttributeInfo AI) {
		var AttributeInfo AIout = AI;
		AIout.addChildrenCommObject(CO);
		for (var int i = 0; i < AIout.ChildrenCommObject.Attributes.size(); i++) {
			var AttributeInfo AIchild = AIout.ChildrenCommObject.Attributes.get(i);
			if (AIchild.isImported) {
				var ServiceRepoInfo SRIimport = findImportSource(SRI, AIchild);
				if (SRIimport === null) {
					return null;
				} else {
					for (var int j = 0; j < SRIimport.CommObjects.size(); j++) {
						if (SRIimport.CommObjects.get(j).Name.equals(AIchild.Type)) {
							var AttributeInfo AIimportout = CommObjectInfo2AttributeInfo(SRIimport,
								SRIimport.CommObjects.get(j), AIchild);
							if (AIimportout === null) {
								return null;
							} else {
								AIout.ChildrenCommObject.Attributes.set(i, AIimportout);
							}
						}
					}
				}
			}
			for (var int j = 0; j < SRI.CommObjects.size(); j++) {
				if (SRI.CommObjects.get(j).Name.equals(AIchild.Type)) {
					var AttributeInfo AIchildout = CommObjectInfo2AttributeInfo(SRI, SRI.CommObjects.get(j), AIchild);
					if (AIchildout === null) {
						return null;
					} else {
						AIout.ChildrenCommObject.Attributes.set(i, AIchildout);
					}
				}
			}
		}
		return AIout;
	}

	def CommObjectInfo filltreeCommObjectInfo(ServiceRepoInfo SRI, CommObjectInfo COIin) {
		var CommObjectInfo COI = COIin;
		for (var int i = 0; i < COI.Attributes.size(); i++) {
			var AttributeInfo AI = COI.Attributes.get(i);
			if (AI.isImported) {
				var ServiceRepoInfo SRIimport = findImportSource(SRI, AI);
				if (SRIimport === null) {
					return null;
				} else {
					for (var int j = 0; j < SRIimport.CommObjects.size(); j++) {
						if (SRIimport.CommObjects.get(j).Name.equals(AI.Type)) {
							var AttributeInfo AIimportout = CommObjectInfo2AttributeInfo(SRIimport,
								SRIimport.CommObjects.get(j), AI);
							if (AIimportout === null) {
								return null;
							} else {
								COI.Attributes.set(i, AIimportout);
							}
						}
					}
				}
			} else {
				for (var int j = 0; j < SRI.CommObjects.size(); j++) {
					if (SRI.CommObjects.get(j).Name.equals(AI.Type)) {
						var AttributeInfo AIout = CommObjectInfo2AttributeInfo(SRI, SRI.CommObjects.get(j), AI);
						if (AIout === null) {
							return null;
						} else {
							COI.Attributes.set(i, AIout);
						}
					}
				}
			}
		}
		return COI;
	}

	def CommObjectURIInfo filltreeCommObjectURIInfo(ComponentInfo CIin, CommObjectURIInfo COUIin) {
		var CommObjectURIInfo COUI = COUIin;
		var ServiceRepoInfo SRI = new ServiceRepoInfo;
		var Boolean returnNull = true;
		for (var int i = 0; i < CIin.ReferencedServiceRepositoriesInfo.size(); i++) {
			if (CIin.ReferencedServiceRepositoriesInfo.get(i).Name.equals(COUI.CommObjectRepoName)) {
				SRI = CIin.ReferencedServiceRepositoriesInfo.get(i);
				for (var int j = 0; j < SRI.CommObjects.size(); j++) {
					if (SRI.CommObjects.get(j).Name.equals(COUI.CommObjectName)) {
						COUI.CommObject = filltreeCommObjectInfo(SRI, SRI.CommObjects.get(j));
						if (COUI.CommObject === null) {
							returnNull = true;
						} else {
							returnNull = false;
						}
					}
				}
			}
		}
		if (returnNull) {
			SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |Model Error: CommObject " +
				COUIin.CommObjectName);
			return null;
		}
		return COUI;
	}

	def ServiceInfo filltreeServiceInfo(ComponentInfo CIin, ServiceInfo SIin, int LevelInit) {
		var ServiceInfo SI = SIin;
		var Boolean returnNull = true;
		// For PushPattern or SendPattern
		if (SI.DataType.isAssigned) {
			SI.DataType = filltreeCommObjectURIInfo(CIin, SI.DataType);
			if (SI.DataType === null) {
				SmartMDSDWrapperout.println(
					"ERROR !! GetSmartMDSDDefinitions |Model Error: DataType (Push/Send Pattern)" + SIin.Name);
				returnNull = true;
			} else {
				returnNull = false;
				SI.DataType.CommObject.setLevel(LevelInit);
			}
		}
		// For QueryPattern
		if ((SI.RequestType.isAssigned) && (SI.AnswerType.isAssigned)) {
			SI.RequestType = filltreeCommObjectURIInfo(CIin, SI.RequestType);
			SI.AnswerType = filltreeCommObjectURIInfo(CIin, SI.AnswerType);
			if ((SI.RequestType === null) || (SI.AnswerType === null)) {
				SmartMDSDWrapperout.println(
					"ERROR !! GetSmartMDSDDefinitions |Model Error: RequestType/AnswerType (Query Pattern)" +
						SIin.Name);
				returnNull = true;
			} else {
				returnNull = false;
				SI.RequestType.CommObject.setLevel(LevelInit);
				SI.AnswerType.CommObject.setLevel(LevelInit);
			}
		}
		// For EventPattern
		if ((SI.EventType.isAssigned) && (SI.ActivationType.isAssigned) && (SI.EventStateType.isAssigned)) {
			SI.EventType = filltreeCommObjectURIInfo(CIin, SI.EventType);
			SI.ActivationType = filltreeCommObjectURIInfo(CIin, SI.ActivationType);
			SI.EventStateType = filltreeCommObjectURIInfo(CIin, SI.EventStateType);
			if ((SI.EventType === null) || (SI.ActivationType === null) || (SI.EventStateType === null)) {
				SmartMDSDWrapperout.println(
					"ERROR !! GetSmartMDSDDefinitions |Model Error: EventType/ActivationType/EventStateType (Event Pattern)" +
						SIin.Name);
				returnNull = true;
			} else {
				returnNull = false;
				SI.EventType.CommObject.setLevel(LevelInit);
				SI.ActivationType.CommObject.setLevel(LevelInit);
				SI.EventStateType.CommObject.setLevel(LevelInit);
			}
		}
		if (returnNull) {
			return null;
		}
		return SI;
	}

	def PortInfo filltreePortServiceInfo(ComponentInfo CIin, PortInfo PIin) {
		var PortInfo PI = PIin;
		var ServiceRepoInfo SRI = new ServiceRepoInfo;
		var Boolean returnNull = true;
		for (var int i = 0; i < CIin.ReferencedServiceRepositoriesInfo.size(); i++) {
			if (CIin.ReferencedServiceRepositoriesInfo.get(i).Name.equals(PI.ServiceRepoName)) {
				SRI = CIin.ReferencedServiceRepositoriesInfo.get(i);
				for (var int j = 0; j < SRI.Services.size(); j++) {
					if (SRI.Services.get(j).Name.equals(PI.ServiceName)) {
						PI.Service = filltreeServiceInfo(CIin, SRI.Services.get(j), 0);
						if (PI.Service === null) {
							SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |Model Error: Service " +
								PIin.Name);
							returnNull = true;
						} else {
							returnNull = false;
						}
					}
				}
			}
		}
		if (returnNull) {
			return null;
		}
		return PI;
	}

	def ComponentInfo filltreeComponentInfo(ComponentInfo CIin) {
		var ComponentInfo CI = CIin;
		for (var int i = 0; i < CI.InputPorts.size(); i++) {
			var PortInfo PI = new PortInfo();
			PI = filltreePortServiceInfo(CI, CI.InputPorts.get(i));
			if (PI === null) {
				SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |Model Error: InputPort " +
					CIin.InputPorts.get(i).Name);
				return null;
			} else {
				CI.InputPorts.set(i, PI);
			}
		}
		for (var int i = 0; i < CI.OutputPorts.size(); i++) {
			var PortInfo PI = new PortInfo();
			PI = filltreePortServiceInfo(CI, CI.OutputPorts.get(i));
			if (PI === null) {
				SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |Model Error: OutputPort " +
					CIin.OutputPorts.get(i).Name);
				return null;
			} else {
				CI.OutputPorts.set(i, PI);
			}
		}
		return CI;
	}

	def ComponentInfo getComponentDefinition(String componentmodelfileAbsPath) {
		val injector = ComponentDefinitionActivator.getInstance().getInjector(
			ComponentDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_COMPONENT_COMPONENTDEFINITION_COMPONENTDEFINITION);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val modeluri = URI.createFileURI(componentmodelfileAbsPath);
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(modeluri, null)
		if (resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(modeluri, true);
			if (resource.loaded == true) {

				var String ComponentModelText = Files.readString(Paths.get(componentmodelfileAbsPath));
				var List<String> ComponentModelCommands = extractCommentEmbeddedCommands(ComponentModelText);
				displayCommands(ComponentModelCommands);
				ComponentModelText = removeComments(ComponentModelText);
				ComponentModelText = removeMultiWhiteSpaces(ComponentModelText);
				val root_obj = resource.contents.get(0)
				if (root_obj instanceof ComponentDefModel) {
					var ComponentInfo CI = new ComponentInfo();
					CI.CDef = root_obj.component;
					CI.Name = CI.CDef.name;
					ComponentModelText = ComponentModelText.substring(
						ComponentModelText.indexOf("ComponentDefinition " + CI.Name));

					for (port : CI.CDef.elements.filter(CoordinationSlavePort)) {
						var PortInfo PI = new PortInfo();
						PI = ExtractPortInfo(port.name, ComponentModelText, "CoordinationSlavePort");
						// CI.addReferencedService(PI.ServiceURI);
						CI.CoordinationSlavePort.add(PI);
					}
					for (port : CI.CDef.elements.filter(CoordinationMasterPort)) {
						var PortInfo PI = new PortInfo();
						PI = ExtractPortInfoNoBrackets(port.name, ComponentModelText, "CoordinationMasterPort");
						// CI.addReferencedService(PI.ServiceURI);
						CI.CoordinationMasterPort.add(PI);
					}
					for (port : CI.CDef.elements.filter(RequestPort)) {
						var PortInfo PI = new PortInfo();
						PI = ExtractPortInfo(port.name, ComponentModelText, "RequestPort");
						// CI.addReferencedService(PI.ServiceURI);
						CI.RequestPorts.add(PI);
					}
					for (port : CI.CDef.elements.filter(AnswerPort)) {
						var PortInfo PI = new PortInfo();
						PI = ExtractPortInfo(port.name, ComponentModelText, "AnswerPort");
						// CI.addReferencedService(PI.ServiceURI);
						CI.AnswerPorts.add(PI);
					}

					for (port : CI.CDef.elements.filter(InputPort)) {
						var PortInfo PI = new PortInfo();
						PI = ExtractPortInfo(port.name, ComponentModelText, "InputPort");
						// CI.addReferencedService(PI.ServiceURI);						
						for (obj : port.extensions.filter(ComponentDependencyObject))
							PI.DependencyObjects.add(obj.name);
						CI.InputPorts.add(PI);
					}
					for (port : CI.CDef.elements.filter(OutputPort)) {
						var PortInfo PI = new PortInfo();
						PI.Name = port.name;
						var String PortModel = ComponentModelText.substring(
							ComponentModelText.indexOf("OutputPort " + PI.Name));
						PortModel = PortModel.substring(0, PortModel.indexOf("}"));
						PI.ServiceURI.Name = smartsubstring(PortModel, "implements", "realizedBy", true, true, true,
							true);
						PI.ServiceURI.ServiceName = smartsubstring(PI.ServiceURI.Name, ".", "", true, true, true, true);
						PI.ServiceName = PI.ServiceURI.ServiceName;
						PI.ServiceURI.ServiceRepoName = smartsubstring(PI.ServiceURI.Name, "", ".", true, true, true,
							true);
						PI.ServiceRepoName = PI.ServiceURI.ServiceRepoName;
						// CI.addReferencedService(PI.ServiceURI);
						for (obj : port.extensions.filter(ComponentDependencyObject))
							PI.DependencyObjects.add(obj.name);
						CI.OutputPorts.add(PI);
					}
					for (var int i = 0; i < CI.ReferencedServiceRepositories.size; i++) {
						var Boolean exitcase = false;
						val ServiceRepoInfo SRI = extractServiceRepoInfo(CI.ReferencedServiceRepositories.get(i));
						if (null === SRI) {
							SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |non-existing resource: " +
								CI.ReferencedServiceRepositories.get(i));
							exitcase = true;
						} else {
							CI.ReferencedServiceRepositoriesInfo.add(SRI);
						}
						if (exitcase) {
							return null;
						}
					}

					// var ComponentInfo CIout = new ComponentInfo();
					/*CIout = filltreeComponentInfo(CI);
					 * if (CIout === null) {
					 * 	SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |Model Error: " + CI.Name);
					 * 	return null;
					 * } else {
					 * 	CI = CIout;
					 }*/
					return CI;
				}
			}
		} else {
			SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |non-existing resource: " +
				componentmodelfileAbsPath);
		}
		return null
	}

	def SystemComponentArchitecture getSystemComponentArchitecture(String systemmodelfileAbsPath) {
		val injector = ComponentArchitectureActivator.getInstance().getInjector(ComponentArchitectureActivator.
			ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_COMPONENTARCHITECTURE_COMPONENTARCHITECTURE);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		val modeluri = URI.createFileURI(systemmodelfileAbsPath);
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(modeluri, null)
		if (resourceExists == true) {
			// load resource
			val resourceIN = resourceSet.getResource(modeluri, true);
			if (resourceIN.loaded == true) {
				val root_obj = resourceIN.contents.get(0)
				if (root_obj instanceof SystemComponentArchitecture) {
					return root_obj
				}
			}
		} else {
			SmartMDSDWrapperout.println("ERROR !! GetSmartMDSDDefinitions |non-existing resource: " +
				systemmodelfileAbsPath);
		}
		return null
	}

	def ExtractPortInfo(String PortName, String ComponentModelText, String PortType) {
		var PortInfo PI = new PortInfo();
		PI.Name = PortName;
		var String PortModel = ComponentModelText.substring(ComponentModelText.indexOf(PortType + " " + PI.Name));
		PortModel = PortModel.substring(0, PortModel.indexOf("}"));
		PI.ServiceURI.Name = smartsubstring(PortModel, "implements", "{", true, true, true, true);
		PI.ServiceURI.ServiceName = smartsubstring(PI.ServiceURI.Name, ".", "", true, true, true, true);
		PI.ServiceName = PI.ServiceURI.ServiceName;
		PI.ServiceURI.ServiceRepoName = smartsubstring(PI.ServiceURI.Name, "", ".", true, true, true, true);
		PI.ServiceRepoName = PI.ServiceURI.ServiceRepoName;
		return PI;
	}

	def ExtractPortInfoNoBrackets(String PortName, String ComponentModelText, String PortType) {
		var PortInfo PI = new PortInfo();
		PI.Name = PortName;
		// Needs work
		/*var String PortModel = ComponentModelText.substring(
		 * 	ComponentModelText.indexOf(PortType + " " + PI.Name));
		 * PortModel = PortModel.substring(0, PortModel.indexOf("\n"));
		 * PI.ServiceURI.Name = smartsubstring(PortModel, "implements", "\n", true, true, true, true);
		 * PI.ServiceURI.ServiceName = smartsubstring(PI.ServiceURI.Name, ".", "", true, true, true, true);
		 * PI.ServiceName = PI.ServiceURI.ServiceName;
		 * PI.ServiceURI.ServiceRepoName = smartsubstring(PI.ServiceURI.Name, "", ".", true, true, true,
		 * 	true);
		 PI.ServiceRepoName = PI.ServiceURI.ServiceRepoName;*/
		return PI;
	}
}
