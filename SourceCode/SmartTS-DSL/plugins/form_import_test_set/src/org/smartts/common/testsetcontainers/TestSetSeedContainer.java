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
package org.smartts.common.testsetcontainers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.smartdbe.common.define.TSDefine;

@XmlRootElement(name = "TestSetSeedContainer")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestSetSeedContainer {
	@XmlElement(name = "LinkedTo")
	public String LinkedTo;
	@XmlElement(name = "ServiceRepo")
	public String ServiceRepo;
	@XmlElement(name = "CommObject")
	public String CommObject;
	@XmlElement(name = "TestSetBuilder")
	public String TestSetBuilder;
	@XmlElement(name = "SetName")
	public String SetName;
	@XmlElement(name = "Switch")
	public String Switch;
	@XmlElement(name = "isSwitchedOn")
	public boolean isSwitchedOn;

	public String keyString() {
		TSDefine TSDef = new TSDefine();
		return LinkedTo + TSDef.TestSetBuilder_KeyNameSpacer + SetName;
	}

	public String toString() {
		String outString = "";
		outString = outString + "From: " + ServiceRepo + " Select " + SetName + " Set for " + CommObject;
		outString = outString + " -> Use: " + TestSetBuilder + " Builder ";
		if (isSwitchedOn) {
			outString = outString + " [ON] ";
		} else {
			outString = outString + " [OFF] ";
		}
		return outString;
	}

	static public List<List<String>> setDefaultTestSet() {
		List<List<String>> testset = new ArrayList<List<String>>();
		List<String> tmp1 = new ArrayList<String>();
		tmp1.add("A");
		tmp1.add("B");
		tmp1.add("C");
		tmp1.add("D");
		tmp1.add("E");
		List<String> tmp2 = new ArrayList<String>();
		tmp2.add("F");
		tmp2.add("G");
		tmp2.add("H");
		tmp2.add("I");
		tmp2.add("J");
		testset.add(tmp1);
		testset.add(tmp2);
		return testset;
	}

	static public boolean isDefaultTestSet(List<List<String>> in) {
		if (in.toString().equals(setDefaultTestSet().toString()))
			return true;
		return false;
	}

	static public List<String> setDefaultTestSetHeader() {
		List<String> testsetheader = new ArrayList<String>();
		testsetheader.add("H1");
		testsetheader.add("H2");
		testsetheader.add("H3");
		testsetheader.add("H4");
		testsetheader.add("H5");
		return testsetheader;
	}

	static public boolean isDefaultTestSetHeader(List<String> in) {
		if (in.toString().equals(setDefaultTestSetHeader().toString()))
			return true;
		return false;
	}
}
