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
package org.smartdbe.common.console;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class SmartConsole implements IConsoleFactory {
	@Override
	public void openConsole() {
		IConsoleManager consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		MessageConsole console = new MessageConsole(name, null);
		consoleManager.addConsoles(new IConsole[] { console });
		consoleManager.showConsoleView(console);
	}

	private MessageConsole init() {
		ConsolePlugin consolePlugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = consolePlugin.getConsoleManager();
		IConsole[] all_consoles = consoleManager.getConsoles();
		for (int i = 0; i < all_consoles.length; i++) {
			if (name.equals(all_consoles[i].getName())) {
				return (MessageConsole) all_consoles[i];
			}
		}
		MessageConsole myConsole = new MessageConsole(name, null);
		consoleManager.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	private String name;
	private MessageConsole console = null;
	private MessageConsoleStream out = null;

	public boolean PRINT_ON_SYSTEM_CONSOLE = true;
	public boolean PRINT_ON_SMART_CONSOLE = true;
	public boolean SuperUserSaveLogPause = false;

	private boolean LOG = true;
	private List<String> Logs = new ArrayList<String>();
	private String Log = new String();

	public void PauseLogging() {
		LOG = false;
	}

	public void UnPauseLogging() {
		LOG = true;
	}

	public String getLog() {
		return Log;
	}

	public List<String> getLogs() {
		return Logs;
	}

	public boolean SaveLog(IFile logfile) {
		if (SuperUserSaveLogPause) {
			lineTag("2d", name + " | Log-X->" + logfile.getName() + " Logging paused by SuperUserSaveLogPause flag");
			return true;
		} else {
			Log = "";
			for (String l : Logs)
				Log = Log + l;
			try {
				if (logfile.exists()) {
					logfile.delete(true, null);
					Thread.sleep(500);
					logfile.create(new ByteArrayInputStream((Log).getBytes()), true, null);
					lineTag("2d", name + " | Log-->" + logfile.getName());
				}
				logfile.create(new ByteArrayInputStream((Log).getBytes()), true, null);
				lineTag("2d", name + " | Log-->" + logfile.getName());
			} catch (Exception e) {
				return false;
			}
			return true;
		}
	}

	private boolean RECORD = false;
	private List<String> Records = new ArrayList<String>();
	private String Record = new String();

	public void StartRecording() {
		RECORD = true;
		Records = new ArrayList<String>();
		Record = new String();
	}

	public void PauseRecording() {
		RECORD = false;
	}

	public void UnPauseRecording() {
		RECORD = true;
	}

	public void StopRecording() {
		RECORD = false;
		for (String re : Records)
			Record = Record + re;
	}

	public String getRecord() {
		return Record;
	}

	public List<String> getRecords() {
		return Records;
	}

	public boolean SaveRecord(IFile recordfile) {
		if (Record.isBlank() || Record.isEmpty() || Record == null) {
			lineTag("2d", name + " | Record-X->" + recordfile.getName() + " Record Empty !");
			return true;
		}
		if (SuperUserSaveLogPause) {
			lineTag("2d",
					name + " | Record-->" + recordfile.getName() + " Logging paused by SuperUserSaveLogPause flag");
			return true;
		} else {
			try {
				if (recordfile.exists()) {
					recordfile.delete(true, null);
					Thread.sleep(500);
					recordfile.create(new ByteArrayInputStream((Record).getBytes()), true, null);
					lineTag("2d", name + " | Record-->" + recordfile.getName());
				}
				recordfile.create(new ByteArrayInputStream((Record).getBytes()), true, null);
				lineTag("2d", name + " | Record-->" + recordfile.getName());
			} catch (Exception e) {
				return false;
			}
			return true;
		}
	}

	public String line = "————————————————————————————————————————————————————————————————————————————————";
	public String underscoresine = "________________________________________________________________________________";
	public String doubleline = underscoresine + "\n" + line;
	public String dashline = "--------------------------------------------------------------------------------";
	public String doubledashline = "================================================================================";
	public String UseLine = line;

	private boolean active = true;

	public void DEBUG_pause() {
		active = false;
	}

	public void DEBUG_resume() {
		active = true;
	}

	public SmartConsole(String consolename) {
		name = consolename;
		console = init();
		out = console.newMessageStream();
		firstclear = true;
	}

	public String getName() {
		return name;
	}

	public void println(String text) {
		if (active) {
			if (PRINT_ON_SYSTEM_CONSOLE)
				System.out.println(text);
			if (PRINT_ON_SMART_CONSOLE)
				out.println(text);
			if (RECORD)
				Records.add(text + "\n");
			if (LOG)
				Logs.add(text + "\n");
		}
	}

	public void print(String text) {
		if (active) {
			if (PRINT_ON_SYSTEM_CONSOLE)
				System.out.print(text);
			if (PRINT_ON_SMART_CONSOLE)
				out.print(text);
			if (RECORD)
				Records.add(text);
			if (LOG)
				Logs.add(text);
		}
	}

	/***
	 * @param linetype
	 * 
	 *                 "l" : line | "u" or "_" : underScoreLine| "2l" or "ll" :
	 *                 doubleline | "d" or "-" : dashline | "2d" or "dd" or "--" :
	 *                 doubledashline|
	 */
	public void setUseLine(String linetype) {
		if (("line" == linetype) || ("l" == linetype))
			UseLine = line;
		if (("underScoreLine" == linetype) || ("u" == linetype) || ("_" == linetype))
			UseLine = underscoresine;
		if (("doubleline" == linetype) || ("2l" == linetype) || ("ll" == linetype))
			UseLine = doubleline;
		if (("dashline" == linetype) || ("d" == linetype) || ("-" == linetype))
			UseLine = dashline;
		if (("doubledashline" == linetype) || ("2d" == linetype) || ("dd" == linetype) || ("--" == linetype))
			UseLine = doubledashline;
	}

	/***
	 * @param linetype
	 * 
	 *                 "l" : line | "u" or "_" : underScoreLine| "2l" or "ll" :
	 *                 doubleline | "d" or "-" : dashline | "2d" or "dd" or "--" :
	 *                 doubledashline|
	 */
	public void line(String linetype) {
		UseLine = line;
		setUseLine(linetype);
		line();
		UseLine = line;
	}

	/***
	 * @param linetype
	 * 
	 *                 "l" : line | "u" or "_" : underScoreLine| "2l" or "ll" :
	 *                 doubleline | "d" or "-" : dashline | "2d" or "dd" or "--" :
	 *                 doubledashline|
	 */
	public void lineTag(String linetype, String Tag) {
		UseLine = line;
		setUseLine(linetype);
		lineTag(Tag);
		UseLine = line;
	}

	public void line() {
		if (active) {
			if (PRINT_ON_SYSTEM_CONSOLE)
				System.out.println(UseLine);
			if (PRINT_ON_SMART_CONSOLE)
				out.println(UseLine);
			if (RECORD)
				Records.add(UseLine + "\n");
			if (LOG)
				Logs.add(UseLine + "\n");
		}
	}

	public void lineTag(String Tag) {
		if (active) {
			if (PRINT_ON_SYSTEM_CONSOLE)
				System.out.println(UseLine + Tag);
			if (PRINT_ON_SMART_CONSOLE)
				out.println(UseLine + Tag);
			if (RECORD)
				Records.add(UseLine + Tag + "\n");
			if (LOG)
				Logs.add(UseLine + Tag + "\n");
		}
	}

	boolean firstclear;

	public void clear() {
		if (active) {
			if (PRINT_ON_SYSTEM_CONSOLE) {
				System.out.println(line);
				Records.add("clear...\n");
				System.out.println(line);
			}
			if (PRINT_ON_SMART_CONSOLE) {
				// Not using console.clearConsole(); since its functionally the same as printing
				// newlines But it breaks the console (console no longer prints after clearing)
				out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			if (RECORD) {
				Records.add(line + "\n");
				Records.add("clear...\n");
				Records.add(line + "\n");
			}
			if (LOG) {
				Logs.add(line + "\n");
				Logs.add("clear...\n");
				Logs.add(line + "\n");
			}
		}
	}
}
