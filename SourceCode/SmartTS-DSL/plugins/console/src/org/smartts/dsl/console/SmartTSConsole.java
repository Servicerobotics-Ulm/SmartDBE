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
package org.smartts.dsl.console;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.smartdbe.common.console.SmartCommonConsole;
import org.smartdbe.common.console.SmartConsole;

public class SmartTSConsole extends SmartConsole {

	SmartCommonConsole SmartCommonout = new SmartCommonConsole();
	public boolean PRINT_ON_COMMON_CONSOLE = true;

	public SmartTSConsole() {
		super("SmartTS");
		PRINT_ON_SYSTEM_CONSOLE = true;
		PRINT_ON_SMART_CONSOLE = true;
	}

	public void println(String string) {
		plusln(super.getName() + " | " + string);
	}

	public void print(String string) {
		plus(super.getName() + " | " + string);
	}

	public void plusln(String string) {
		super.println(string);
		if (PRINT_ON_COMMON_CONSOLE) {
			SmartCommonout.println(string);
		}
	}

	public void plus(String string) {
		super.print(string);
		if (PRINT_ON_COMMON_CONSOLE) {
			SmartCommonout.print(string);
		}
	}

	public void line(String linetype) {
		super.line(linetype);
		if (PRINT_ON_COMMON_CONSOLE) {
			SmartCommonout.line(linetype);
		}
	}

	public void line() {
		super.line();
		if (PRINT_ON_COMMON_CONSOLE) {
			SmartCommonout.line();
		}
	}

	public void lineTag(String linetype, String Tag) {
		super.lineTag(linetype, Tag);
		if (PRINT_ON_COMMON_CONSOLE) {
			SmartCommonout.lineTag(linetype, Tag);
		}
	}

	public void lineTag(String Tag) {
		super.lineTag(Tag);
		if (PRINT_ON_COMMON_CONSOLE) {
			SmartCommonout.lineTag(Tag);
		}
	}

	public void clear() {
		super.clear();
		if (PRINT_ON_COMMON_CONSOLE) {
			System.out.println(super.line);
			System.out.println("");
			System.out.println("");
		}
	}

	public void DEBUG_pause() {
		super.DEBUG_pause();
	}

	public void DEBUG_resume() {
		super.DEBUG_resume();
	}

	public void PauseLogging() {
		super.PauseLogging();
	}

	public void UnPauseLogging() {
		super.UnPauseLogging();
	}

	public String getLog() {
		return super.getLog();
	}

	public List<String> getLogs() {
		return super.getLogs();
	}

	public boolean SaveLog(IFile logfile) {
		return super.SaveLog(logfile);
	}

	public void StartRecording() {
		super.StartRecording();
	}

	public void PauseRecording() {
		super.PauseRecording();
	}

	public void UnPauseRecording() {
		super.UnPauseRecording();
	}

	public void StopRecording() {
		super.StopRecording();
	}

	public String getRecord() {
		return super.getRecord();
	}

	public List<String> getRecords() {
		return super.getRecords();
	}

	public boolean SaveRecord(IFile recordfile) {
		return super.SaveRecord(recordfile);
	}
}
