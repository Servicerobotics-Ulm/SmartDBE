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
package tools;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class smartaasIO {
	private static final Logger logger = LoggerFactory.getLogger(smartaasIO.class);
	public static final String CREATE = "Create";
	public static final String REPLACE = "Replace";

	public boolean String2File(String Text, File file, String op) {
		logger.info("String2File | IN " + file.getName());
		if (!(op.equals(CREATE)) && !(op.equals(REPLACE))) {
			logger.info("String2File | XXXX ERROR Wrong Option : " + op);
			logger.info("String2File | OUT " + file.getName());
			return false;
		}
		if (op.equals(CREATE)) {
			if (file.exists()) {
				logger.info("String2File | XXXX ERROR File already exists : " + file.getName());
				logger.info("String2File | OUT " + file.getName());
				return false;
			}
		}
		if (op.equals(REPLACE)) {
			if (file.exists()) {
				try {
					logger.info("String2File | Deleting existing file : " + file.getName());
					file.delete();
					logger.info("String2File | Deleted existing file : " + file.getName());
				} catch (Exception e) {
					e.printStackTrace();
					logger.info("String2File | XXXX ERROR deleting existing file : " + file.getName());
					logger.info("String2File | OUT " + file.getName());
					return false;
				}
			}
		}
		try {
			logger.info("String2File | " + op + "ing file : " + file.getName());
			FileWriter Filewriter = new FileWriter(file.getName());
			Filewriter.write(Text);
			Filewriter.close();
			logger.info("String2File | " + op + "d file : " + file.getName());

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("String2File | XXXX ERROR deleting existing file : " + file.getName());
			logger.info("String2File | OUT " + file.getName());
			return false;
		}
		logger.info("String2File | OUT " + file.getName());
		return true;
	}

	public String FilePath2String(File file) {
		return FilePath2String(file.getAbsolutePath().toString());
	}

	public String FilePath2String(String FileAbsolutePath) {
		logger.info("FilePath2String | IN");
		String FileString = "";
		try {
			FileString = Files.readString(Paths.get(FileAbsolutePath));
		} catch (Exception e) {
			logger.info("FilePath2String | OUT ERROR reading from " + FileAbsolutePath);
			e.printStackTrace();
			return null;
		}
		logger.info("FilePath2String | OUT");
		return FileString;
	}
}
