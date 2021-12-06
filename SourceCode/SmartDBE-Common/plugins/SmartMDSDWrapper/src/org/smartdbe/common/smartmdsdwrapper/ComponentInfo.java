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
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;

@XmlRootElement(name = "ComponentInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ComponentInfo {
	@XmlElement(name = "Name")
	public String Name = "";
	@XmlTransient
	@XmlElement(name = "CDef")
	public ComponentDefinition CDef;
	@XmlElement(name = "InputPorts")
	public List<PortInfo> InputPorts = new ArrayList<>();
	@XmlElement(name = "OutputPorts")
	public List<PortInfo> OutputPorts = new ArrayList<>();
	@XmlElement(name = "RequestPorts")
	public List<PortInfo> RequestPorts = new ArrayList<>();
	@XmlElement(name = "AnswerPorts")
	public List<PortInfo> AnswerPorts = new ArrayList<>();
	@XmlElement(name = "CoordinationSlavePort")
	public List<PortInfo> CoordinationSlavePort = new ArrayList<>();
	@XmlElement(name = "CoordinationMasterPort")
	public List<PortInfo> CoordinationMasterPort = new ArrayList<>();
	@XmlElement(name = "ReferencedServices")
	public List<ServiceURIInfo> ReferencedServices = new ArrayList<>();
	@XmlElement(name = "ReferencedServiceRepositories")
	public List<String> ReferencedServiceRepositories = new ArrayList<>();
	@XmlTransient
	@XmlElement(name = "ReferencedServiceRepositoriesInfo")
	public List<ServiceRepoInfo> ReferencedServiceRepositoriesInfo = new ArrayList<>();

	public String toString() {
		String s = " Component " + Name + "\n";
		for (int i = 0; i < InputPorts.size(); i++)
			s = s + "Input" + InputPorts.get(i).toString() + "\n";
		for (int i = 0; i < OutputPorts.size(); i++)
			s = s + "Output" + OutputPorts.get(i).toString() + "\n";
		for (int i = 0; i < RequestPorts.size(); i++)
			s = s + "Request" + RequestPorts.get(i).toString() + "\n";
		for (int i = 0; i < AnswerPorts.size(); i++)
			s = s + "Answer" + AnswerPorts.get(i).toString() + "\n";
		for (int i = 0; i < CoordinationSlavePort.size(); i++)
			s = s + "CoordinationSlave" + CoordinationSlavePort.get(i).toString() + "\n";
		for (int i = 0; i < CoordinationMasterPort.size(); i++)
			s = s + "CoordinationMaster" + CoordinationMasterPort.get(i).toString() + "\n";
		for (int i = 0; i < ReferencedServices.size(); i++)
			s = s + "ReferencedServices: " + ReferencedServices.get(i).toString() + "\n";
		for (int i = 0; i < ReferencedServiceRepositories.size(); i++)
			s = s + "ReferencedServiceRepositories: " + ReferencedServiceRepositories.get(i) + "\n";
		return s;
	}

	public void addReferencedService(ServiceURIInfo serin) {
		for (int i = 0; i < ReferencedServices.size(); i++) {
			if (ReferencedServices.get(i).Name.equals(serin.Name)) {
				return;
			}
		}
		ReferencedServices.add(serin);
		for (int i = 0; i < ReferencedServiceRepositories.size(); i++) {
			if (ReferencedServiceRepositories.get(i).equals(serin.ServiceRepoName)) {
				return;
			}
		}
		ReferencedServiceRepositories.add(serin.ServiceRepoName);
	}
}
