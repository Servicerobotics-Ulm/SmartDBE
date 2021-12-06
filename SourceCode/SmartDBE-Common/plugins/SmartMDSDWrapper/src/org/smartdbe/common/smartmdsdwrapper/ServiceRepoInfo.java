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

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository;
import org.eclipse.smartmdsd.ecore.service.communicationObject.impl.CommObjectModelImpl;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository;

@XmlRootElement(name = "ServiceRepoInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceRepoInfo {

	// NOTE: This class is usable for instances when Models other than In-Memory
	// model are required to be referred

	@XmlElement(name = "Name")
	public String Name;
	@XmlTransient
	@XmlElement(name = "SDef")
	public ServiceDefModel SDef;
	@XmlTransient
	@XmlElement(name = "SDefRepo")
	public ServiceDefRepository SDefRepo;
	@XmlTransient
	@XmlElement(name = "CObj")
	public CommObjectModelImpl CObj;
	@XmlTransient
	@XmlElement(name = "CObjRepo")
	public CommObjectsRepository CObjRepo;
	@XmlElement(name = "Services")
	public List<ServiceInfo> Services = new ArrayList<>();
	@XmlElement(name = "CommObjects")
	public List<CommObjectInfo> CommObjects = new ArrayList<>();
	@XmlElement(name = "ReferencedServices")
	public List<String> ReferencedServices = new ArrayList<>();

	public ServiceRepoInfo() {
		Name = "";
	}

	public String toString() {
		String s = "ServiceDefRepository " + Name + "[\n";
		for (int i = 0; i < Services.size(); i++)
			s = s + Services.get(i).toString();
		for (int i = 0; i < CommObjects.size(); i++)
			s = s + CommObjects.get(i).toString();
		for (int i = 0; i < ReferencedServices.size(); i++)
			s = s + "Referenced Service Models: <" + ReferencedServices.get(i) + ">\n";
		s = s + "]\n";
		return s;
	}
}
