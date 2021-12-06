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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.smartdbe.common.smartmdsdwrapper.console.SmartMDSDWrapperConsole;

public class IO {

	public static final String CREATE = "Create";
	public static final String REPLACE = "Replace";

	SmartMDSDWrapperConsole SmartMDSDWrapperout = new SmartMDSDWrapperConsole();

	public boolean String2File(String Text, IFile file, String op) {
		SmartMDSDWrapperout.println("String2File | IN " + file.getName());
		if (!(op.equals(CREATE)) && !(op.equals(REPLACE))) {
			SmartMDSDWrapperout.println("String2File | XXXX ERROR Wrong Option : " + op);
			SmartMDSDWrapperout.println("String2File | OUT " + file.getName());
			return false;
		}
		if (op.equals(CREATE)) {
			if (file.exists()) {
				SmartMDSDWrapperout.println("String2File | XXXX ERROR File already exists : " + file.getName());
				SmartMDSDWrapperout.println("String2File | OUT " + file.getName());
				return false;
			}
		}
		if (op.equals(REPLACE)) {
			if (file.exists()) {
				try {
					SmartMDSDWrapperout.println("String2File | Deleting existing file : " + file.getName());
					file.delete(true, null);
					SmartMDSDWrapperout.println("String2File | Deleted existing file : " + file.getName());
				} catch (CoreException e) {
					e.printStackTrace();
					SmartMDSDWrapperout.println("String2File | XXXX ERROR deleting existing file : " + file.getName());
					SmartMDSDWrapperout.println("String2File | OUT " + file.getName());
					return false;
				}
			}
		}
		try {
			SmartMDSDWrapperout.println("String2File | " + op + "ing file : " + file.getName());
			file.create(new ByteArrayInputStream((Text).getBytes()), true, null);
			SmartMDSDWrapperout.println("String2File | " + op + "d file : " + file.getName());

		} catch (CoreException e) {
			e.printStackTrace();
			SmartMDSDWrapperout.println("String2File | XXXX ERROR deleting existing file : " + file.getName());
			SmartMDSDWrapperout.println("String2File | OUT " + file.getName());
			return false;
		}
		SmartMDSDWrapperout.println("String2File | OUT " + file.getName());
		return true;
	}

	public String FilePath2String(IFile file) {
		return FilePath2String(file.getRawLocation().toOSString());
	}

	public String FilePath2String(String FileAbsolutePath) {
		SmartMDSDWrapperout.println("FilePath2String | IN");
		String FileString;
		try {
			FileString = Files.readString(Paths.get(FileAbsolutePath));
		} catch (IOException e) {
			SmartMDSDWrapperout.println("FilePath2String | OUT ERROR reading from " + FileAbsolutePath);
			e.printStackTrace();
			return null;
		}
		SmartMDSDWrapperout.println("FilePath2String | OUT");
		return FileString;
	}

	public ServiceRepoInfo XMLString2ServiceRepoInfo(String XML) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ServiceRepoInfo.class.getPackageName(),
					ServiceRepoInfo.class.getClassLoader());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader stringReader = new StringReader(XML);
			ServiceRepoInfo CI = new ServiceRepoInfo();
			CI = (ServiceRepoInfo) jaxbUnmarshaller.unmarshal(stringReader);
			return CI;
		} catch (JAXBException e) {
			SmartMDSDWrapperout.println("ERROR @ XMLString2ServiceRepoInfo");
		}
		return null;
	}

	public String ServiceRepoInfo2XMLString(ServiceRepoInfo CI) {
		java.io.StringWriter stringWriter = new StringWriter();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ServiceRepoInfo.class.getPackageName(),
					ServiceRepoInfo.class.getClassLoader());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(CI, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			SmartMDSDWrapperout.println("ERROR @ ServiceRepoDefinition2String:" + CI.Name);
			e.printStackTrace();
			return null;
		}
	}

	public ComponentInfo XMLString2ComponentInfo(String XML) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ComponentInfo.class.getPackageName(),
					ComponentInfo.class.getClassLoader());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader stringReader = new StringReader(XML);
			ComponentInfo CI = new ComponentInfo();
			CI = (ComponentInfo) jaxbUnmarshaller.unmarshal(stringReader);
			return CI;
		} catch (JAXBException e) {
			SmartMDSDWrapperout.println("ERROR @ XMLString2ComponentInfo");
		}
		return null;
	}

	public String ComponentInfo2XMLString(ComponentInfo CI) {
		java.io.StringWriter stringWriter = new StringWriter();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ComponentInfo.class.getPackageName(),
					ComponentInfo.class.getClassLoader());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(CI, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			SmartMDSDWrapperout.println("ERROR @ ComponentDefinition2String:" + CI.Name);
			e.printStackTrace();
			return null;
		}
	}

	public IProject getProjectFromWorkspace(String ProjectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject[] projects = root.getProjects();
		for (IProject project : projects) {
			try {
				if (project.getName().equals(ProjectName)) {
					return project;
				}
			} catch (Exception e) {
				SmartMDSDWrapperout.println("ERROR @ getProjectFromWorkspace:" + ProjectName);
				e.printStackTrace();
			}
		}
		return null;
	}
}
