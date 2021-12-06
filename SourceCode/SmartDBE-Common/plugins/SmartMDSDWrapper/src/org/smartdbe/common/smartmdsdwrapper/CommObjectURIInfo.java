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

@XmlRootElement(name = "CommObjectURIInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommObjectURIInfo {
	@XmlElement(name = "Name")
	public String Name;
	@XmlElement(name = "CommObjectName")
	public String CommObjectName;
	@XmlElement(name = "CommObjectRepoName")
	public String CommObjectRepoName;
	@XmlElement(name = "CommObject")
	public CommObjectInfo CommObject = new CommObjectInfo();
	@XmlTransient
	@XmlElement(name = "NA")
	public String NA;
	@XmlTransient
	@XmlElement(name = "INVALID")
	public String INVALID;

	public CommObjectURIInfo() {
		NA = "NotAssigned";
		INVALID = "INVALID";
		Name = NA;
		CommObjectName = NA;
		CommObjectRepoName = NA;
	}

	public String toString() {
		if (isAssigned()) {
			if (isValid()) {
				String s = "";
				s = s + Name + "\n";
				s = s + CommObject.toString();
				return s;
			} else {
				return INVALID;
			}
		} else {
			return NA;
		}
	}

	public Boolean isAssigned() {
		if ((CommObjectRepoName.equals(NA)) || (CommObjectName.equals(NA)) || (Name.equals(NA))) {
			return false;
		}
		return true;
	}

	public Boolean isValid() {
		if ((CommObjectRepoName.equals("")) || (null == CommObjectRepoName)) {
			return false;
		}
		if ((CommObjectName.equals("")) || (null == CommObjectName)) {
			return false;
		}
		if ((Name.equals("")) || (null == Name)) {
			return false;
		}
		if (!Name.equals(CommObjectRepoName + "." + CommObjectName)) {
			return false;
		}
		return true;
	}
}
