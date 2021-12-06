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
package org.xtext.smartaas.sms.generator;

import java.util.ArrayList;

public class AASNode {
	public AASNODETYPE type = AASNODETYPE.ENT;
	public String name = "";
	public String value = "";
	public AASIDTYPE aasidtype = AASIDTYPE.IRI;
	public String aasidvalue = "";
	public Boolean isroot = false;

	public AASNode() {
		Init(AASNODETYPE.ENT, "", "", AASIDTYPE.IRI, "", false);
	}

	public AASNode(AASNODETYPE TYPE) {
		Init(TYPE, "", "", AASIDTYPE.IRI, "", false);
	}

	public AASNode(AASNODETYPE TYPE, String NAME) {
		Init(TYPE, NAME, "", AASIDTYPE.IRI, "", false);
	}

	public AASNode(AASNODETYPE TYPE, String NAME, String VALUE) {
		Init(TYPE, NAME, VALUE, AASIDTYPE.IRI, "", false);
	}

	public AASNode(AASNODETYPE TYPE, String NAME, String VALUE, AASIDTYPE AASIDTYPE, String AASIDVALUE) {
		Init(TYPE, NAME, VALUE, AASIDTYPE, AASIDVALUE, false);
	}

	public AASNode(AASNODETYPE TYPE, String NAME, String VALUE, AASIDTYPE AASIDTYPE, String AASIDVALUE,
			Boolean ISROOT) {
		Init(TYPE, NAME, VALUE, AASIDTYPE, AASIDVALUE, ISROOT);
	}

	public static enum AASNODETYPE {
		PACK, // Package
		ENV, // Environment, AdministrationShells
		AAS, // AdministrationShell
		SM, // SubModel
		PROP, // Property
		MLP, // MultiLanguageProperty
		SMC, // SubModelCollection
		RANGE, // Range
		FILE, // File
		CAP, // Capability
		OPR, // Operation
		IN, // Input OperationVariable
		OUT, // Output OperationVariable
		INOUT, // Input Output OperationVariable
		EVT, // Basic Event
		ENT; // Entity

		public String toString() {
			switch (this) {
			case PACK:
				return "PACK";
			case ENV:
				return "ENV";
			case AAS:
				return "AAS";
			case SM:
				return "SM";
			case PROP:
				return "PROP";
			case MLP:
				return "MLP";
			case SMC:
				return "SMC";
			case RANGE:
				return "RANGE";
			case FILE:
				return "FILE";
			case CAP:
				return "CAP";
			case OPR:
				return "OPR";
			case IN:
				return "IN";
			case OUT:
				return "OUT";
			case INOUT:
				return "INOUT";
			case EVT:
				return "EVT";
			case ENT:
				return "ENT";
			default:
				return "AASNODETYPEERROR";
			}
		}

		public static Boolean isValid(String s) {
			ArrayList<String> valids = new ArrayList<String>();
			valids.add("PACK");
			valids.add("ENV");
			valids.add("AAS");
			valids.add("SM");
			valids.add("PROP");
			valids.add("MLP");
			valids.add("SMC");
			valids.add("RANGE");
			valids.add("FILE");
			valids.add("CAP");
			valids.add("OPR");
			valids.add("IN");
			valids.add("OUT");
			valids.add("INOUT");
			valids.add("EVT");
			valids.add("ENT");
			if (valids.contains(s)) {
				return true;
			}
			return false;
		}
	}

	public static enum AASIDTYPE {
		IdShort, // IdShort
		FragmentedId, // FragmentedId
		Custom, // Custom
		IRDI, // International Registration Data Identifier
		IRI; // Internationalized Resource Identifier

		public String toString() {
			switch (this) {
			case IdShort:
				return "IdShort";
			case FragmentedId:
				return "FragmentedId";
			case Custom:
				return "Custom";
			case IRDI:
				return "IRDI";
			case IRI:
				return "IRI";
			default:
				return "AASIDTYPEERROR";
			}
		}

		public static Boolean isValid(String s) {
			ArrayList<String> valids = new ArrayList<String>();
			valids.add("IdShort");
			valids.add("FragmentedId");
			valids.add("Custom");
			valids.add("IRDI");
			valids.add("IRI");
			if (valids.contains(s)) {
				return true;
			}
			return false;
		}
	}

	public String aasid = "";
	public String nodeid = "";

	// Set A
	public static String propsep = "†";
	public static String nodeidsep = "¤";
	public static String aasidsep = "º";
	public static String branchsep = "§";
	public static String propend = ";";
	public static String propstart = "Ͱ";

	// Set B
	/*
	 * public static String propsep = "|!|"; public static String nodeidsep = "|.|";
	 * public static String aasidsep = "|*|"; public static String branchsep =
	 * "|_|"; public static String propend = ";"; public static String propstart =
	 * "|+ENTRY|";
	 */

	public ArrayList<AASNode> children;

	public void Init(AASNODETYPE TYPE, String NAME, String VALUE, AASIDTYPE AASIDTYPE, String AASIDVALUE,
			Boolean ISROOT) {
		type = TYPE;
		name = NAME;
		value = VALUE;
		aasidtype = AASIDTYPE;
		aasidvalue = AASIDVALUE;
		isroot = ISROOT;
		ChildrenListInit();
		gennodeid();
		genaasid();
	}

	public void ChildrenListInit() {
		children = new ArrayList<AASNode>();
	}

	public void gennodeid() {
		nodeid = Q(type) + nodeidsep + Q(name);
	}

	public void genaasid() {
		aasid = Q(aasidtype) + aasidsep + Q(aasidvalue);
	}

	public ArrayList<String> getSubTreePayload() {
		ArrayList<String> payload = new ArrayList<String>();
		if (isroot) {
			payload.add(propstart + nodeid + propsep + aasid + propsep + Q(value) + propend);
		} else {
			payload.add(nodeid + propsep + aasid + propsep + Q(value) + propend);
		}
		for (AASNode nodeentry : children) {
			ArrayList<String> childpayload = nodeentry.getSubTreePayload();
			for (String entry : childpayload) {
				if (isroot) {
					payload.add(propstart + nodeid + branchsep + entry);
				} else {
					payload.add(nodeid + branchsep + entry);
				}
			}
		}
		return payload;
	}

	public ArrayList<String> getPayload() {
		gennodeid();
		genaasid();
		ArrayList<String> payload = new ArrayList<String>();
		ArrayList<String> subtreepayload = getSubTreePayload();
		payload.addAll(subtreepayload);
		return payload;
	}

	public AASNode extract(String inpayload) {
		AASNode returnaasnode = new AASNode();
		// #TODO
		return returnaasnode;
	}

	public String Q(AASNODETYPE in) {
		return "\"" + in.toString() + "\"";
	}

	public String Q(AASIDTYPE in) {
		return "\"" + in.toString() + "\"";
	}

	public String Q(String in) {
		return "\"" + in + "\"";
	}

	public String nQ(String in) {
		if (in.charAt(0) == '"') {
			in = in.substring(1);
		}
		if (in.charAt(in.length() - 1) == '"') {
			in = in.substring(0, in.length() - 2);
		}
		return in;
	}

}
