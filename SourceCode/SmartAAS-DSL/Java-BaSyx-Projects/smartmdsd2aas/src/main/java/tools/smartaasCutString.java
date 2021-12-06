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

import java.util.ArrayList;
import java.util.List;

public class smartaasCutString {
	public String DefaultOut = "";

	public String cutSubString(String Text, int f, int t) {
		int l = Text.length();
		if ((f < 0) || (t < 0) || (t <= f) || (Text.equals("") || (Text == null)) || (f > l) || (t > l)) {
			return DefaultOut;
		}
		return Text.substring(f, t);
	}

	public String cutFromNextTo(String Text, String from, String to, Boolean removeft) {
		String Post = cutFrom(Text, from, removeft);
		return cutTo(Post, to, removeft);
	}

	public String cutFromTo(String Text, String from, String to, Boolean removeft) {
		if ((Text.indexOf(from) >= 0) && (Text.indexOf(to) >= 0)) {
			if (removeft) {
				return cutSubString(Text, Text.indexOf(from) + from.length(), Text.indexOf(to));
			} else {
				return cutSubString(Text, Text.indexOf(from), Text.indexOf(to) + to.length());
			}
		} else {
			return DefaultOut;
		}
	}

	public String cutFrom(String Text, String from, Boolean removef) {
		if (Text.indexOf(from) >= 0) {
			if (removef) {
				return cutSubString(Text, Text.indexOf(from) + from.length(), Text.length());

			} else {
				return cutSubString(Text, Text.indexOf(from), Text.length());
			}
		} else {
			return DefaultOut;
		}
	}

	public String cutTo(String Text, String to, Boolean removet) {
		if (Text.indexOf(to) >= 0) {
			if (removet) {
				return cutSubString(Text, 0, Text.indexOf(to));

			} else {
				return cutSubString(Text, 0, Text.indexOf(to) + to.length());
			}
		} else {
			return DefaultOut;
		}
	}

	public List<String> String2Parts(String CSV) {
		return SV2List(CSV, "\n");
	}

	public List<String> SV2List(String SV, String Spacer) {
		List<String> List = new ArrayList<String>();
		if (SV.isBlank() || SV.isEmpty() || (SV == null)) {
			return null;
		}
		do {
			if (SV.contains(Spacer)) {
				String part = cutTo(SV, Spacer, true);
				SV = cutFrom(SV, Spacer, true);
				if (part.equals("") || part.isBlank() || part.isEmpty() || (part == null)) {
					break;
				}
				List.add(part);
			} else {
				List.add(SV);
				break;
			}
		} while (true);
		return List;
	}
}
