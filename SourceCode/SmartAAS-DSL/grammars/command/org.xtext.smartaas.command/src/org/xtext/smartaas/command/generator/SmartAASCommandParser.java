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
package org.xtext.smartaas.command.generator;

import java.util.List;

public class SmartAASCommandParser {
	public static SmartAASCommandClass Parse(String filetext) {
		SmartAASCommandClass obj = new SmartAASCommandClass();
		obj.rawmodel = filetext;
		ParserTools pt = new ParserTools();
		filetext = pt.removeComments(filetext);
		filetext = pt.removeMultiWhiteSpaces(filetext);
		obj.model = filetext;
		String FR = "AAS :: CommandINPUTSocket";
		String TO = "}";
		List<String> submodels = pt.extractSubmodels(filetext, FR, TO);
		for (String entry : submodels) {
			String Name = pt.smartsubstring(entry, "AAS :: CommandINPUTSocket \"", "\" [[", true, true, true, true);
			String SemanticId = pt.smartsubstring(entry, "[[SemanticId : \"", "\"]]", true, true, true, true);
			String sub = pt.smartsubstring(entry, "{", "}", true, true, true, true);
			String CommandText = pt.smartsubstring(sub, "CommandText : \"", "\" [[", true, true, true, true);
			String CommandText_SemanticId = pt.smartsubstring(sub, "[[SemanticId : \"", "\"]]", true, true, true, true);
			obj.AddNewCommandINPUTSocketWithModel(Name, SemanticId, CommandText, CommandText_SemanticId, entry, entry);
		}
		return obj;
	}
}
