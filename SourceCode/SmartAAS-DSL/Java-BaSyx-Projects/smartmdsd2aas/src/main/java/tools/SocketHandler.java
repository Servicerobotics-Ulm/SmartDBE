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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketHandler extends Thread {
	private static int port = 6868;
	private static ServerSocket serverSocket = null;
	private static Socket socket = null;
	private static List<socketentry> InList = null;
	private static List<socketentry> OutList = null;
	private static final Logger logger = LoggerFactory.getLogger(SocketHandler.class);
	private static final Boolean BossVerbos = true;
	private Boolean verbos = true;
	private long timer = 1000;
	private int tryagainfactor = 100;
	private long tryagain = Math.round(timer / tryagainfactor);
	private int timeoutmultiplier = 4;
	private long timeout = timeoutmultiplier * timer;
	private long counter = 0;
	private Boolean running = false;

	public int getPort() {
		return port;
	}

	public void setverbos(Boolean Verbos) {
		verbos = BossVerbos & Verbos;
	}

	public void settimers(long Timer) {
		if (Timer > 0) {
			timer = Timer;
			tryagain = Math.round(timer / tryagainfactor);
			timeout = timeoutmultiplier * timer;
		}
	}

	public void addOut(socketentry newsocketoutentry) {
		try {
			while (running) {
				Thread.sleep(tryagain);
			}
			OutList.add(newsocketoutentry);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public List<socketentry> readOutList() {
		return OutList;
	}

	public List<socketentry> readInList() {
		return InList;
	}

	public List<socketentry> popInList() {
		List<socketentry> InListSnap = new ArrayList<socketentry>();
		try {
			while (running) {
				Thread.sleep(tryagain);
			}
			InListSnap = InList;
			while (running) {
				Thread.sleep(tryagain);
			}
			InList.clear();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return InListSnap;
	}

	public List<socketentry> popIn(String Match) {
		return FindIn(Match, true);
	}

	public List<socketentry> readIn(String Match) {
		return FindIn(Match, false);
	}

	public List<socketentry> FindIn(String Match, Boolean pop) {
		long startTime = System.currentTimeMillis();
		List<socketentry> InListSnap = new ArrayList<socketentry>();
		List<socketentry> Replys = new ArrayList<socketentry>();
		int c = 0;
		try {
			while (true) {
				c++;
				if (verbos && c >= 20) {
					logger.info("Searching entry with Match: [" + Match + "] in input buffer.");
					c = 0;
				}
				while (running) {
					Thread.sleep(tryagain);
				}
				InListSnap = InList;
				for (socketentry entry : InListSnap) {
					if (entry.msg.contains(Match)) {
						Replys.add(entry);
						if (verbos)
							logger.info("Searching entry with Match: [" + Match + "] Found: " + entry.toString());
					}
				}
				while (running) {
					Thread.sleep(tryagain);
				}
				if (pop) {
					List<String> tobepopped = new ArrayList<String>();
					for (socketentry entry : Replys) {
						tobepopped.add(entry.toString());
					}
					for (Iterator<socketentry> iterator = InListSnap.iterator(); iterator.hasNext();) {
						socketentry can = iterator.next();
						if (tobepopped.contains(can.toString())) {
							iterator.remove();
						}
					}
				}
				while (running) {
					Thread.sleep(tryagain);
				}
				if (Replys.size() > 0) {
					return Replys;
				}
				Thread.sleep(tryagain);
				long estimatedTime = System.currentTimeMillis() - startTime;
				if (estimatedTime >= timeout) {
					socketentry empty = new socketentry("Timeout", false);
					Replys.add(empty);
				}
			}
		} catch (InterruptedException e) {
			socketentry empty = new socketentry("InterruptedException", false);
			Replys.add(empty);
			e.printStackTrace();
			return Replys;
		}
	}

	public SocketHandler() {
		SocketHandlerInit(port, timer, verbos);
	}

	public SocketHandler(int PortNumber) {
		SocketHandlerInit(PortNumber, timer, verbos);
	}

	public SocketHandler(int PortNumber, long timerin) {
		SocketHandlerInit(PortNumber, timerin, verbos);
	}

	public SocketHandler(int PortNumber, Boolean verbosin) {
		SocketHandlerInit(PortNumber, timer, verbosin);
	}

	public SocketHandler(int PortNumber, long timerin, Boolean verbosin) {
		SocketHandlerInit(PortNumber, timerin, verbosin);
	}

	public void SocketHandlerInit(int PortNumber, long timerin, Boolean verbosin) {
		port = PortNumber;
		settimers(timerin);
		verbos = verbosin;
		InList = new ArrayList<socketentry>();
		OutList = new ArrayList<socketentry>();
		try {
			serverSocket = new ServerSocket(port);
			if (verbos)
				logger.info("Server is listening on port: " + port);
			socket = serverSocket.accept();
			if (verbos)
				logger.info("New Client Connected !!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			counter = 0;
			while (true) {
				Thread.sleep(timer);
				running = true;
				String s = "Run#" + counter++ + "\n";
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
				s = s + "OutList:\n";
				List<socketentry> DoneOutList = new ArrayList<socketentry>();
				for (socketentry entry : OutList) {
					writer.println(entry.msg);
					s = s + entry.toString() + "\n";
					DoneOutList.add(entry);
				}
				OutList.removeAll(DoneOutList);
				InputStream input = socket.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				while (reader.ready()) {
					String inmsg = reader.readLine();
					if (inmsg != null) {
						if (inmsg.isEmpty()) {
							if (verbos)
								logger.info("Got: Empty Message ! Exiting !");
							break;
						}
						socketentry newinputentry = new socketentry(inmsg, false);
						InList.add(newinputentry);
					}
				}
				s = s + "InList:\n";
				for (socketentry entry : InList)
					s = s + entry.toString() + "\n";
				if (verbos)
					logger.info(s);
				running = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void finalize() {
		try {
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
