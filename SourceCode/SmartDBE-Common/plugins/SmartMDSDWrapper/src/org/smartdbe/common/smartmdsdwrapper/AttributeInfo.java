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
package org.smartdbe.common.smartmdsdwrapper;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.smartdbe.common.define.TSDefine;

@XmlRootElement(name = "AttributeInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class AttributeInfo {
	@XmlElement(name = "Name")
	public String Name;
	@XmlElement(name = "Type")
	public String Type;
	@XmlElement(name = "Level")
	private int Level;
	@XmlElement(name = "isPrimitiveType")
	public Boolean isPrimitiveType;
	@XmlElement(name = "isArrayType")
	public Boolean isArrayType;
	@XmlElement(name = "isImported")
	public Boolean isImported;
	@XmlElement(name = "ArrayLengthString")
	public String ArrayLengthString;
	@XmlElement(name = "ArrayLength")
	public int ArrayLength;
	@XmlElement(name = "ChildrenCommObject")
	public CommObjectInfo ChildrenCommObject = new CommObjectInfo();

	public AttributeInfo() {
		Name = "";
		Type = "";
		Level = 0;
		isPrimitiveType = false;
		isArrayType = false;
		isImported = false;
		ArrayLengthString = "";
		ArrayLength = -1;
	}

	public void addChildrenCommObject(CommObjectInfo CCO) {
		CCO.setLevel(Level + 1);
		ChildrenCommObject = CCO;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
		ChildrenCommObject.setLevel(Level + 1);
	}

	public String A() {
		String s = "";
		if (isArrayType) {
			s = s + "[" + ArrayLength + "]";
		}
		return s;
	}

	public String L() {
		String s = "|——";
		for (int i = 0; i < Level; i++) {
			s = "|  " + s;
		}
		return s;
	}

	public String S() {
		String s = "   ";
		for (int i = 0; i < Level; i++) {
			s = "|  " + s;
		}
		return s;
	}

	public String SS() {
		String s = "| ";
		for (int i = 0; i < Level; i++) {
			s = "|  " + s;
		}
		return s;
	}

	public String I() {
		if (isImported) {
			return "[Imported]";
		} else {
			return "[Local]";
		}
	}

	public String toString() {
		String s = "";
		if (isPrimitiveType) {
			s = s + L() + Type + "     : <" + Name + ">" + A();
			s = s + "\n";
		} else {
			s = s + L() + I() + Type + "    : <" + Name + ">" + A() + " {\n";
			s = s + ChildrenCommObject.toString();
			s = s + SS() + "}";
			s = s + "\n";
		}
		return s;
	}

	public List<String> toHeader() {
		TSDefine TSDef = new TSDefine();
		List<String> subitems = new ArrayList<String>();
		String HeaderFlag = TSDef.TestSetBuilder_HeaderFlagStart + TSDef.TestSetBuilder_HeaderFlagTransport_isImport
				+ isImported + TSDef.TestSetBuilder_HeaderFlagTransport_isPrimitiveType + isPrimitiveType;
		if (isArrayType) {
			if (ArrayLengthString.equals(TSDef.TestSetArrayVarSz)) {
				subitems.add(Name + TSDef.TestSetBuilder_ChildTypeScoper + Type
						+ TSDef.TestSetBuilder_ChildHeaderNameSpacer + TSDef.TestSetArrayVarSzSys + HeaderFlag);
			} else {
				int asz = Integer.parseInt(ArrayLengthString);
				for (int i = 0; i < asz; i++) {
					subitems.add(Name + TSDef.TestSetBuilder_ChildTypeScoper + Type
							+ TSDef.TestSetBuilder_ChildHeaderNameSpacer + i + HeaderFlag);
				}
			}
		} else {
			subitems.add(Name + TSDef.TestSetBuilder_ChildTypeScoper + Type + HeaderFlag);
		}
		return subitems;
	}

	public String TestEntityName(String ServiceRepoName, String CommObjectName) {
		TSDefine TSDef = new TSDefine();
		String TestEntityName = Type + TSDef.TestSetNameSpacer + Name;
		if (isArrayType) {
			if (ArrayLengthString.equals(TSDef.TestSetArrayVarSz)) {
				TestEntityName = TestEntityName + TSDef.TestSetArraySpacer + TSDef.TestSetArrayVarSzSys;
			} else {
				TestEntityName = TestEntityName + TSDef.TestSetArraySpacer + ArrayLengthString;
			}
		}
		TestEntityName = ServiceRepoName + TSDef.TestSetNameSpacer + CommObjectName + TSDef.TestSetNameSpacer
				+ TestEntityName;
		if (isImported) {
			TestEntityName = TSDef.ImportedPrefix + TestEntityName;
		}
		return TestEntityName;
	}
}
