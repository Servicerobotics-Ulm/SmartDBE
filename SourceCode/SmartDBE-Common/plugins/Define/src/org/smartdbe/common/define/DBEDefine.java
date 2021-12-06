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
package org.smartdbe.common.define;

public class DBEDefine {
	public String ComponentFileExtension;
	public String ComponentFileExtension_only;
	public String componentArchFileExtension;
	public String componentArchFileExtension_only;
	public String DomainServicesFileExtension;
	public String DomainServicesFileExtension_only;
	public String DomainTypesFileExtension;
	public String DomainTypesFileExtension_only;
	public String TaskRealizationModelfilenameFileExtension;
	public String TaskRealizationModelfilenameFileExtension_only;

	public String modelFolderName;
	public String modelFolderName_only;

	public String BackupFilePostfix;
	public String BackupFilePostfix_only;

	public String CommentEmbeddedCommandStartString;
	public String CommentEmbeddedCommandENDString;
	public String CommentEmbeddedCommandIGNOREString;
	public String CommentEmbeddedCommandRUNString;
	public String CommentEmbeddedCommandWarningString;

	public DBEDefine() {
		ComponentFileExtension = ".component";
		ComponentFileExtension_only = ComponentFileExtension.substring(1);
		componentArchFileExtension = ".componentArch";
		componentArchFileExtension_only = componentArchFileExtension.substring(1);
		DomainServicesFileExtension = ".services";
		DomainServicesFileExtension_only = DomainServicesFileExtension.substring(1);
		TaskRealizationModelfilenameFileExtension = ".taskRealization";
		TaskRealizationModelfilenameFileExtension_only = TaskRealizationModelfilenameFileExtension.substring(1);
		DomainTypesFileExtension = ".types";
		DomainTypesFileExtension_only = DomainTypesFileExtension.substring(1);

		modelFolderName = "model/";
		modelFolderName_only = modelFolderName.substring(modelFolderName.length() - 1);

		BackupFilePostfix = "_backup";
		BackupFilePostfix_only = BackupFilePostfix.substring(1);

		CommentEmbeddedCommandStartString = "[[DBECommand[[";
		CommentEmbeddedCommandENDString = "]]DBECommand]]";
		CommentEmbeddedCommandIGNOREString = "!IGNORE!";
		CommentEmbeddedCommandRUNString = "!RUN!";
		CommentEmbeddedCommandWarningString = "Add " + CommentEmbeddedCommandIGNOREString
				+ " in any command to ignore its execution. A command without " + CommentEmbeddedCommandRUNString
				+ " is not executed.";
	}
}
