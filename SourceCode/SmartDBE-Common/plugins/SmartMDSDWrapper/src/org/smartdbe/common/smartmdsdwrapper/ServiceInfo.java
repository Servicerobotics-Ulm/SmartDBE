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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.smartdbe.common.define.TSDefine;

@XmlRootElement(name = "ServiceInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceInfo {
	@XmlElement(name = "Name")
	public String Name;
	@XmlElement(name = "ServiceType")
	public String ServiceType;
	@XmlElement(name = "PatternType")
	public String PatternType;
	@XmlElement(name = "OneOfTheCurrentlyHandledServicePattern")
	public Boolean OneOfTheCurrentlyHandledServicePattern = true;

	// For PushPattern or SendPattern
	@XmlElement(name = "DataType")
	public CommObjectURIInfo DataType = new CommObjectURIInfo();

	// For QueryPattern
	@XmlElement(name = "RequestType")
	public CommObjectURIInfo RequestType = new CommObjectURIInfo();
	@XmlElement(name = "AnswerType")
	public CommObjectURIInfo AnswerType = new CommObjectURIInfo();

	// For EventPattern
	@XmlElement(name = "EventType")
	public CommObjectURIInfo EventType = new CommObjectURIInfo();
	@XmlElement(name = "ActivationType")
	public CommObjectURIInfo ActivationType = new CommObjectURIInfo();
	@XmlElement(name = "EventStateType")
	public CommObjectURIInfo EventStateType = new CommObjectURIInfo();

	@XmlTransient
	@XmlElement(name = "NA")
	public String NA = "NotAssigned";

	public ServiceInfo() {
		Name = NA;
		ServiceType = NA;
		PatternType = NA;
	}

	public String toString() {
		String s = ServiceType + " Service: [" + Name + "] Pattern: " + PatternType + " {";
		if (OneOfTheCurrentlyHandledServicePattern) {
			s = s + "\n";
			if (DataType.isAssigned())
				s = s + "DataType       :" + DataType.toString();

			if (RequestType.isAssigned())
				s = s + "RequestType    :" + RequestType.toString() + "\n";
			if (AnswerType.isAssigned())
				s = s + "AnswerType     :" + AnswerType.toString();

			if (EventType.isAssigned())
				s = s + "EventType      :" + EventType.toString() + "\n";
			if (ActivationType.isAssigned())
				s = s + "ActivationType :" + ActivationType.toString() + "\n";
			if (EventStateType.isAssigned())
				s = s + "EventStateType :" + EventStateType.toString();

			s = s + "}\n";
		} else {
			s = s + " Not One Of The Currently Handled Service Patterns }\n";
		}
		return s;
	}

	public String TestEntityName(String ServiceRepoName) {
		TSDefine TSDef = new TSDefine();
		String TestEntityName = ServiceRepoName + TSDef.TestSetNameSpacer + Name;
		return TestEntityName;
	}
}
