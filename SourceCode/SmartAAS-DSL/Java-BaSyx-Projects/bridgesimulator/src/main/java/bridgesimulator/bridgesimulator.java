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
package bridgesimulator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class bridgesimulator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String hostname = "localhost";
		int inport = 6868;
		try {
			Socket insocket = new Socket(hostname, inport);
			InputStream input = insocket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			OutputStream output = insocket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			long counter = 0;
			long ii = 0;
			long r = 0;
			while (true) {
				Thread.sleep(10);
				counter++;
				String inmsg = reader.readLine();
				if (!inmsg.isEmpty()) {
					System.out.println("Got: " + inmsg);
					String Spacer = "-|-";
					String commandid = "ERROR";
					if (inmsg.contains(Spacer)) {
						commandid = inmsg.substring(0, inmsg.indexOf(Spacer));
					} else {
						System.out.println("ERROR: " + inmsg + ": Spacer[" + Spacer + "] Not Found");
					}

					String replyindicator = Spacer + commandid + Spacer;
					String outmsg = replyindicator + "MsgA" + r++;
					writer.println(outmsg);
					System.out.println("Sent: " + outmsg);
					writer.flush();

					// Optional
					Thread.sleep(100);
					String outmsgb = replyindicator + "MsgB" + r++;
					writer.println(outmsgb);
					System.out.println("Sent: " + outmsgb);
					writer.flush();
				}
				// Optional
				if (counter > 4) {
					counter = 0;
					String outmsg = "Client Says Hi ! " + ii++;
					writer.println(outmsg);
					writer.flush();
					System.out.println("Sent: " + outmsg);
				}
			}
		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}
}