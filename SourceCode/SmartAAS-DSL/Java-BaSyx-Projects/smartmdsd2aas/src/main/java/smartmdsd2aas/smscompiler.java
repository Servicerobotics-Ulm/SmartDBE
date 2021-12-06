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
package smartmdsd2aas;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.api.IElementContainer;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.entity.EntityType;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElement;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.entity.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tools.smartaasCutString;
import tools.smartaasIO;

public class smscompiler {

	private static final Logger logger = LoggerFactory.getLogger(smscompiler.class);

	public static List<ISubmodel> compileSmartMDSDSubModels(String SmartAASSMSFileFullPath) {
		List<ISubmodel> SMs = new ArrayList<ISubmodel>();
		List<String> SMSEntries = getSMSEntries(SmartAASSMSFileFullPath);
		if (SMSEntries.size() == 0) {
			return SMs;
		}
		String ProjectName = getProjectName(SMSEntries);
		Identifier ProjectID = getSmartAASId(getProjectID(SMSEntries));
		logger.info("ProjectName: " + ProjectName);
		logger.info("ProjectID  : " + ProjectID.getIdType() + " :: " + ProjectID.getId());
		SMSEntries = removeProjectNode(SMSEntries, ProjectName);
		List<String> SMNames = getSMNames(SMSEntries);
		for (String SMName : SMNames) {
			SMs.add(processSM(SMSEntries, SMName));
		}
		Submodel documentationSubmodel = new Submodel(aasbuilder.DOCUSMIDshort, aasbuilder.DOCUSMID);
		Property website = new Property(aasbuilder.WEBSITEIDshort, aasbuilder.WEBSITEID);
		documentationSubmodel.addSubmodelElement(website);
		Property project = new Property(aasbuilder.ProjectIDshort, ProjectID.getId());
		project.setValue(ProjectName);
		documentationSubmodel.addSubmodelElement(project);
		SMs.add(documentationSubmodel);
		return SMs;
	}

	public static Submodel processSM(List<String> SMSEntries, String SMName) {
		boolean verbos = false;
		smartaasCutString cs = new smartaasCutString();
		Identifier SMID = getSmartAASId(getSMID(SMSEntries, SMName));
		if (verbos)
			logger.info("SMName: " + SMName + "  ID: " + SMID.getIdType() + " :: " + SMID.getId());
		Submodel SM = new Submodel(SMName, SMID);
		List<String> SMEntries = getSMEntries(SMSEntries, SMName);
		for (String SMEntry : SMEntries) {
			Identifier itemID = getSmartAASId(extractID(SMEntry));
			String itemNodePath = extractNodePath(SMEntry);
			String NodeNum = cs.cutFromNextTo(SMEntry, "[", "]", true);
			int NodeRank = SMEntry.length() - SMEntry.replace("§", "").length();
			if (verbos)
				logger.info(NodeNum + " || " + NodeRank + " || " + itemNodePath + "  ||  " + itemID.getIdType()
						+ "  ::  " + itemID.getId());
			List<String> itemBranch = new ArrayList<String>();
			if (NodeRank == 0) {
				itemNodePath = itemNodePath.replaceAll("\"", "");
				SM = addNode(SM, itemBranch, itemNodePath, itemID);
			} else {
				for (int i = 0; i < NodeRank; i++) {
					String BranchNode = cs.cutTo(itemNodePath, "§", true);
					itemNodePath = cs.cutFrom(itemNodePath, "§", true);
					BranchNode = BranchNode.replaceAll("\"", "");
					itemBranch.add(BranchNode);
				}
				itemNodePath = itemNodePath.replaceAll("\"", "");
				SM = addNode(SM, itemBranch, itemNodePath, itemID);
			}
		}
		return SM;
	}

	public static Submodel addNode(Submodel SM, List<String> itemBranch, String item, Identifier itemID) {
		boolean verbos = false;
		smartaasCutString cs = new smartaasCutString();
		item = item.replaceAll("\"", "");
		String NodeType = cs.cutTo(item, "¤", true);
		String NodeName = cs.cutFrom(item, "¤", true);
		SubmodelElement element = SubmodelElementFromNodeType(NodeType, NodeName);
		if (itemBranch.size() == 0) {
			SM.addSubmodelElement(element);
			if (verbos)
				logger.info("Adding: " + NodeType + " " + NodeName);
			return SM;
		}
		if (itemBranch.size() == 1) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);
			String Cat = node.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node;
				sec.addSubmodelElement(element);
				node = sec;
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 2) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String Cat = node1.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node1;
				sec.addSubmodelElement(element);
				node1 = sec;
				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 3) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String BranchNode2 = itemBranch.get(2);
			// String BranchNodeType2 = cs.cutTo(BranchNode2, "¤", true);
			String BranchNodeName2 = cs.cutFrom(BranchNode2, "¤", true);
			SubmodelElement node2 = (SubmodelElement) ((IElementContainer) node1).getSubmodelElement(BranchNodeName2);

			String Cat = node2.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node2;
				sec.addSubmodelElement(element);
				node2 = sec;
				((IElementContainer) node1).deleteSubmodelElement(BranchNodeName2);
				((IElementContainer) node1).addSubmodelElement(node2);

				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 4) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String BranchNode2 = itemBranch.get(2);
			// String BranchNodeType2 = cs.cutTo(BranchNode2, "¤", true);
			String BranchNodeName2 = cs.cutFrom(BranchNode2, "¤", true);
			SubmodelElement node2 = (SubmodelElement) ((IElementContainer) node1).getSubmodelElement(BranchNodeName2);
			String BranchNode3 = itemBranch.get(3);
			// String BranchNodeType3 = cs.cutTo(BranchNode3, "¤", true);
			String BranchNodeName3 = cs.cutFrom(BranchNode3, "¤", true);
			SubmodelElement node3 = (SubmodelElement) ((IElementContainer) node2).getSubmodelElement(BranchNodeName3);

			String Cat = node3.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node3;
				sec.addSubmodelElement(element);
				node3 = sec;
				((IElementContainer) node2).deleteSubmodelElement(BranchNodeName3);
				((IElementContainer) node2).addSubmodelElement(node3);

				((IElementContainer) node1).deleteSubmodelElement(BranchNodeName2);
				((IElementContainer) node1).addSubmodelElement(node2);

				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 5) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String BranchNode2 = itemBranch.get(2);
			// String BranchNodeType2 = cs.cutTo(BranchNode2, "¤", true);
			String BranchNodeName2 = cs.cutFrom(BranchNode2, "¤", true);
			SubmodelElement node2 = (SubmodelElement) ((IElementContainer) node1).getSubmodelElement(BranchNodeName2);
			String BranchNode3 = itemBranch.get(3);
			// String BranchNodeType3 = cs.cutTo(BranchNode3, "¤", true);
			String BranchNodeName3 = cs.cutFrom(BranchNode3, "¤", true);
			SubmodelElement node3 = (SubmodelElement) ((IElementContainer) node2).getSubmodelElement(BranchNodeName3);
			String BranchNode4 = itemBranch.get(4);
			// String BranchNodeType4 = cs.cutTo(BranchNode4, "¤", true);
			String BranchNodeName4 = cs.cutFrom(BranchNode4, "¤", true);
			SubmodelElement node4 = (SubmodelElement) ((IElementContainer) node3).getSubmodelElement(BranchNodeName4);

			String Cat = node4.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node4;
				sec.addSubmodelElement(element);
				node4 = sec;
				((IElementContainer) node3).deleteSubmodelElement(BranchNodeName4);
				((IElementContainer) node3).addSubmodelElement(node4);

				((IElementContainer) node2).deleteSubmodelElement(BranchNodeName3);
				((IElementContainer) node2).addSubmodelElement(node3);

				((IElementContainer) node1).deleteSubmodelElement(BranchNodeName2);
				((IElementContainer) node1).addSubmodelElement(node2);

				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 6) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String BranchNode2 = itemBranch.get(2);
			// String BranchNodeType2 = cs.cutTo(BranchNode2, "¤", true);
			String BranchNodeName2 = cs.cutFrom(BranchNode2, "¤", true);
			SubmodelElement node2 = (SubmodelElement) ((IElementContainer) node1).getSubmodelElement(BranchNodeName2);
			String BranchNode3 = itemBranch.get(3);
			// String BranchNodeType3 = cs.cutTo(BranchNode3, "¤", true);
			String BranchNodeName3 = cs.cutFrom(BranchNode3, "¤", true);
			SubmodelElement node3 = (SubmodelElement) ((IElementContainer) node2).getSubmodelElement(BranchNodeName3);
			String BranchNode4 = itemBranch.get(4);
			// String BranchNodeType4 = cs.cutTo(BranchNode4, "¤", true);
			String BranchNodeName4 = cs.cutFrom(BranchNode4, "¤", true);
			SubmodelElement node4 = (SubmodelElement) ((IElementContainer) node3).getSubmodelElement(BranchNodeName4);
			String BranchNode5 = itemBranch.get(5);
			// String BranchNodeType5 = cs.cutTo(BranchNode5, "¤", true);
			String BranchNodeName5 = cs.cutFrom(BranchNode5, "¤", true);
			SubmodelElement node5 = (SubmodelElement) ((IElementContainer) node4).getSubmodelElement(BranchNodeName5);

			String Cat = node5.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node5;
				sec.addSubmodelElement(element);
				node5 = sec;
				((IElementContainer) node4).deleteSubmodelElement(BranchNodeName5);
				((IElementContainer) node4).addSubmodelElement(node5);

				((IElementContainer) node3).deleteSubmodelElement(BranchNodeName4);
				((IElementContainer) node3).addSubmodelElement(node4);

				((IElementContainer) node2).deleteSubmodelElement(BranchNodeName3);
				((IElementContainer) node2).addSubmodelElement(node3);

				((IElementContainer) node1).deleteSubmodelElement(BranchNodeName2);
				((IElementContainer) node1).addSubmodelElement(node2);

				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 7) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String BranchNode2 = itemBranch.get(2);
			// String BranchNodeType2 = cs.cutTo(BranchNode2, "¤", true);
			String BranchNodeName2 = cs.cutFrom(BranchNode2, "¤", true);
			SubmodelElement node2 = (SubmodelElement) ((IElementContainer) node1).getSubmodelElement(BranchNodeName2);
			String BranchNode3 = itemBranch.get(3);
			// String BranchNodeType3 = cs.cutTo(BranchNode3, "¤", true);
			String BranchNodeName3 = cs.cutFrom(BranchNode3, "¤", true);
			SubmodelElement node3 = (SubmodelElement) ((IElementContainer) node2).getSubmodelElement(BranchNodeName3);
			String BranchNode4 = itemBranch.get(4);
			// String BranchNodeType4 = cs.cutTo(BranchNode4, "¤", true);
			String BranchNodeName4 = cs.cutFrom(BranchNode4, "¤", true);
			SubmodelElement node4 = (SubmodelElement) ((IElementContainer) node3).getSubmodelElement(BranchNodeName4);
			String BranchNode5 = itemBranch.get(5);
			// String BranchNodeType5 = cs.cutTo(BranchNode5, "¤", true);
			String BranchNodeName5 = cs.cutFrom(BranchNode5, "¤", true);
			SubmodelElement node5 = (SubmodelElement) ((IElementContainer) node4).getSubmodelElement(BranchNodeName5);
			String BranchNode6 = itemBranch.get(6);
			// String BranchNodeType6 = cs.cutTo(BranchNode6, "¤", true);
			String BranchNodeName6 = cs.cutFrom(BranchNode6, "¤", true);
			SubmodelElement node6 = (SubmodelElement) ((IElementContainer) node5).getSubmodelElement(BranchNodeName6);

			String Cat = node6.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node6;
				sec.addSubmodelElement(element);
				node6 = sec;
				((IElementContainer) node5).deleteSubmodelElement(BranchNodeName6);
				((IElementContainer) node5).addSubmodelElement(node6);

				((IElementContainer) node4).deleteSubmodelElement(BranchNodeName5);
				((IElementContainer) node4).addSubmodelElement(node5);

				((IElementContainer) node3).deleteSubmodelElement(BranchNodeName4);
				((IElementContainer) node3).addSubmodelElement(node4);

				((IElementContainer) node2).deleteSubmodelElement(BranchNodeName3);
				((IElementContainer) node2).addSubmodelElement(node3);

				((IElementContainer) node1).deleteSubmodelElement(BranchNodeName2);
				((IElementContainer) node1).addSubmodelElement(node2);

				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() == 8) {
			String BranchNode = itemBranch.get(0);
			String BranchNodeType = cs.cutTo(BranchNode, "¤", true);
			String BranchNodeName = cs.cutFrom(BranchNode, "¤", true);
			if (verbos)
				logger.info("BranchNode: " + BranchNodeType + " " + BranchNodeName);
			SubmodelElement node = (SubmodelElement) SM.getSubmodelElement(BranchNodeName);
			SM.deleteSubmodelElement(BranchNodeName);

			String BranchNode1 = itemBranch.get(1);
			// String BranchNodeType1 = cs.cutTo(BranchNode1, "¤", true);
			String BranchNodeName1 = cs.cutFrom(BranchNode1, "¤", true);

			SubmodelElement node1 = (SubmodelElement) ((IElementContainer) node).getSubmodelElement(BranchNodeName1);
			String BranchNode2 = itemBranch.get(2);
			// String BranchNodeType2 = cs.cutTo(BranchNode2, "¤", true);
			String BranchNodeName2 = cs.cutFrom(BranchNode2, "¤", true);
			SubmodelElement node2 = (SubmodelElement) ((IElementContainer) node1).getSubmodelElement(BranchNodeName2);
			String BranchNode3 = itemBranch.get(3);
			// String BranchNodeType3 = cs.cutTo(BranchNode3, "¤", true);
			String BranchNodeName3 = cs.cutFrom(BranchNode3, "¤", true);
			SubmodelElement node3 = (SubmodelElement) ((IElementContainer) node2).getSubmodelElement(BranchNodeName3);
			String BranchNode4 = itemBranch.get(4);
			// String BranchNodeType4 = cs.cutTo(BranchNode4, "¤", true);
			String BranchNodeName4 = cs.cutFrom(BranchNode4, "¤", true);
			SubmodelElement node4 = (SubmodelElement) ((IElementContainer) node3).getSubmodelElement(BranchNodeName4);
			String BranchNode5 = itemBranch.get(5);
			// String BranchNodeType5 = cs.cutTo(BranchNode5, "¤", true);
			String BranchNodeName5 = cs.cutFrom(BranchNode5, "¤", true);
			SubmodelElement node5 = (SubmodelElement) ((IElementContainer) node4).getSubmodelElement(BranchNodeName5);
			String BranchNode6 = itemBranch.get(6);
			// String BranchNodeType6 = cs.cutTo(BranchNode6, "¤", true);
			String BranchNodeName6 = cs.cutFrom(BranchNode6, "¤", true);
			SubmodelElement node6 = (SubmodelElement) ((IElementContainer) node5).getSubmodelElement(BranchNodeName6);
			String BranchNode7 = itemBranch.get(7);
			// String BranchNodeType7 = cs.cutTo(BranchNode7, "¤", true);
			String BranchNodeName7 = cs.cutFrom(BranchNode7, "¤", true);
			SubmodelElement node7 = (SubmodelElement) ((IElementContainer) node6).getSubmodelElement(BranchNodeName7);

			String Cat = node7.getModelType();
			if (Cat.equals("SubmodelElementCollection")) {
				if (verbos)
					logger.info("Adding: " + NodeType + " " + NodeName);
				SubmodelElementCollection sec = (SubmodelElementCollection) node7;
				sec.addSubmodelElement(element);
				node7 = sec;
				((IElementContainer) node6).deleteSubmodelElement(BranchNodeName7);
				((IElementContainer) node6).addSubmodelElement(node7);

				((IElementContainer) node5).deleteSubmodelElement(BranchNodeName6);
				((IElementContainer) node5).addSubmodelElement(node6);

				((IElementContainer) node4).deleteSubmodelElement(BranchNodeName5);
				((IElementContainer) node4).addSubmodelElement(node5);

				((IElementContainer) node3).deleteSubmodelElement(BranchNodeName4);
				((IElementContainer) node3).addSubmodelElement(node4);

				((IElementContainer) node2).deleteSubmodelElement(BranchNodeName3);
				((IElementContainer) node2).addSubmodelElement(node3);

				((IElementContainer) node1).deleteSubmodelElement(BranchNodeName2);
				((IElementContainer) node1).addSubmodelElement(node2);

				((IElementContainer) node).deleteSubmodelElement(BranchNodeName1);
				((IElementContainer) node).addSubmodelElement(node1);
			}
			SM.addSubmodelElement(node);
		}
		if (itemBranch.size() > 8) {
			logger.error("ERROR_addNode itemBranchSize >8");
		}
		return SM;
	}

	public static SubmodelElement SubmodelElementFromNodeType(String NodeType, String NodeName) {
		if (NodeType.equals("SMC")) {
			return new SubmodelElementCollection(NodeName);
		}
		if (NodeType.equals("ENT")) {
			// return new Entity(NodeName, EntityType.SELFMANAGEDENTITY); #FIXME
			return new SubmodelElementCollection(NodeName);
		}
		if (NodeType.equals("CAP")) {
			// return new Capability(NodeName); #FIXME
			return new SubmodelElementCollection(NodeName);
		}
		if (NodeType.equals("PROP")) {
			// return new Property(NodeName); #FIXME
			return new SubmodelElementCollection(NodeName);
		}
		if (NodeType.equals("SM")) {
			// #TODO #FIXME
			// return (SubmodelElement) new Submodel(NodeName);
			return new SubmodelElementCollection(NodeName);
		}
		return new Entity("ERROR_SubmodelElementFromNodeType", EntityType.SELFMANAGEDENTITY);
	}

	public static List<String> getSMEntries(List<String> SMSEntries, String SMName) {
		List<String> SMEntries = new ArrayList<String>();
		for (String SMSEntry : SMSEntries) {
			if (SMSEntry.contains(rooterSM(SMName) + "§")) {
				SMEntries.add(SMSEntry.replace(rooterSM(SMName) + "§", "]"));
			}
		}
		return SMEntries;
	}

	public static List<String> getSMNames(List<String> SMSEntries) {
		List<String> SMNames = new ArrayList<String>();
		smartaasCutString cs = new smartaasCutString();
		for (String SMSEntry : SMSEntries) {
			String can = cs.cutFromNextTo(SMSEntry, "]\"SM\"¤\"", "\"", true);
			if (SMNames.contains(can)) {
				continue;
			}
			SMNames.add(can);
		}
		return SMNames;
	}

	public static List<String> removeProjectNode(List<String> SMSEntries) {
		return removeProjectNode(SMSEntries, getProjectName(SMSEntries));
	}

	public static List<String> removeProjectNode(List<String> SMSEntries, String ProjectName) {
		SMSEntries.remove(0);
		for (int i = 0; i < SMSEntries.size(); i++) {
			SMSEntries.set(i, SMSEntries.get(i).replace("\"AAS\"¤\"" + ProjectName + "\"§", ""));
		}
		return SMSEntries;
	}

	public static Identifier getSmartAASId(String ID) {
		smartaasCutString cs = new smartaasCutString();
		ID = ID.replaceAll("\"", "");
		if (ID.contains("Customº")) {
			// return new CustomId(cs.cutFrom(ID, "Customº", true)); #FIXME
			return new ModelUrn(cs.cutFrom(ID, "Customº", true));
		}
		if (ID.contains("IRIº")) {
			return new ModelUrn(cs.cutFrom(ID, "IRIº", true));
		}
		return new ModelUrn("Error_getSmartAASId");
	}

	public static String getSMID(List<String> SMSEntries, String SMName) {
		if (SMSEntries.size() == 0) {
			return "ERROR_getSMID";
		}
		for (String SMSEntry : SMSEntries) {
			if (SMSEntry.contains(rooterSM(SMName) + "†")) {
				return extractID(SMSEntry);
			}
		}
		return getProjectID(SMSEntries.get(0));
	}

	public static String extractID(String Entry) {
		smartaasCutString cs = new smartaasCutString();
		return cs.cutFromNextTo(Entry, "†", "†", true).replaceAll("\"", "");
	}

	public static String extractNodePath(String Entry) {
		smartaasCutString cs = new smartaasCutString();
		return cs.cutFromNextTo(Entry, "]", "†", true);
	}

	public static String rooterSM(String SMName) {
		return "]\"SM\"¤\"" + SMName + "\"";
	}

	public static String getProjectID(List<String> SMSEntries) {
		if (SMSEntries.size() == 0) {
			return "ERROR_getProjectID";
		}
		return getProjectID(SMSEntries.get(0));
	}

	public static String getProjectID(String SMSEntry) {
		String ProjectName = getProjectName(SMSEntry);
		smartaasCutString cs = new smartaasCutString();
		SMSEntry = cs.cutFrom(SMSEntry, "\"AAS\"¤\"", true);
		SMSEntry = cs.cutFrom(SMSEntry, ProjectName + "\"†\"", true);
		SMSEntry = cs.cutTo(SMSEntry, "\"†\"", true);
		SMSEntry = SMSEntry.replaceAll("\"", "");
		return SMSEntry;
	}

	public static String getProjectName(List<String> SMSEntries) {
		if (SMSEntries.size() == 0) {
			return "ERROR_getProjectName";
		}
		return getProjectName(SMSEntries.get(0));
	}

	public static String getProjectName(String SMSEntry) {
		smartaasCutString cs = new smartaasCutString();
		SMSEntry = cs.cutFrom(SMSEntry, "\"AAS\"¤\"", true);
		SMSEntry = cs.cutTo(SMSEntry, "\"", true);
		return SMSEntry;
	}

	public static List<String> getSMSEntries(String SmartAASSMSFileFullPath) {
		smartaasIO IO = new smartaasIO();
		smartaasCutString cs = new smartaasCutString();
		List<String> SMSEntries = new ArrayList<String>();
		String SmartAASSMS, SMS, SMSC;
		SmartAASSMS = IO.FilePath2String(SmartAASSMSFileFullPath);
		SMS = cs.cutFromNextTo(SmartAASSMS, "[[AASEntriesLOG_START[[", "]]AASEntriesLOG_FINISH]]", false);
		SMSC = cs.cutFromNextTo(SmartAASSMS, "[[AASEntriesLOG_Command_START[[", "]]AASEntriesLOG_Command_FINISH]]",
				false);
		SmartAASSMS = SMS + SMSC;
		int count1 = SmartAASSMS.length() - SmartAASSMS.replace("Ͱ", "").length();
		int count2 = SmartAASSMS.length() - SmartAASSMS.replace(";", "").length();
		if (count1 != count2) {
			logger.error("ERROR_getSMSEntries: #Ͱ != #;");
			return SMSEntries;
		}
		if (count1 == 0) {
			logger.info("getSMSEntries: No Entries Found !");
			return SMSEntries;
		}
		for (int i = 0; i < count1; i++) {
			String Entry = "[" + i + "]" + cs.cutFromNextTo(SmartAASSMS, "Ͱ", ";", true).trim();
			SMSEntries.add(Entry);
			SmartAASSMS = SmartAASSMS.substring(SmartAASSMS.indexOf(";") + 1);
		}
		return SMSEntries;
	}
}