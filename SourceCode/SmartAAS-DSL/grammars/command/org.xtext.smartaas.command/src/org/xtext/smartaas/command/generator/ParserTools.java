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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserTools {
	public String removeComments(String strin) {
		String str = strin;
		List<String> comments = new ArrayList<String>();
		comments = extractComments(strin);
		for (int i = 0; i < comments.size(); i++) {
			String comment = comments.get(i);
			int index = str.indexOf(comment);
			String str1 = str.substring(0, index);
			String str2 = str.substring(index + comment.length(), str.length());
			str = " " + str1.trim() + " " + str2.trim() + " ";
		}
		str = " " + str.trim() + " ";
		return str;
	}

	public String removeMultiWhiteSpaces(String strin) {
		String str = strin.trim();
		String regex = "\\s+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll(" ");
	}

	public String smartsubstringlastIndexOf(String str, String from, String to, Boolean cutf, Boolean cutt,
			Boolean trim, Boolean returnEmptyWhenTrueNullWhenFalse) {
		int f = str.indexOf(from);
		int t = str.lastIndexOf(to);
		return smartsubstringMain(str, from, to, cutf, cutt, trim, returnEmptyWhenTrueNullWhenFalse, f, t);
	}

	public String smartsubstring(String str, String from, String to, Boolean cutf, Boolean cutt, Boolean trim,
			Boolean returnEmptyWhenTrueNullWhenFalse) {
		int f = str.indexOf(from);
		int t = str.indexOf(to);
		return smartsubstringMain(str, from, to, cutf, cutt, trim, returnEmptyWhenTrueNullWhenFalse, f, t);
	}

	public String smartsubstringMain(String str, String from, String to, Boolean cutf, Boolean cutt, Boolean trim,
			Boolean returnEmptyWhenTrueNullWhenFalse, int f, int t) {
		if ("" == from)
			f = 0;
		if ("" == to)
			t = str.length();
		if ((-1 == f) || (-1 == t) || (f >= t)) {
			if (returnEmptyWhenTrueNullWhenFalse)
				return "";
			else
				return null; // was return str;
		} else {
			String strout = str.substring(f, t + to.length());
			if (cutf) {
				strout = strout.substring(from.length());
			}
			if (cutt) {
				strout = strout.substring(0, strout.length() - to.length());
			}
			if (trim)
				strout = strout.trim();
			return strout;
		}
	}

	public List<String> extractSubmodels(String model, String HEADER, String FOOTER) {
		return (extractSubmodels(model, HEADER, FOOTER, true));
	}

	public List<String> extractSubmodels(String model, String HEADER, String FOOTER,
			Boolean returnEmptyListWhenTrueNullWhenFalse) {
		return (extractSubmodels(model, HEADER, FOOTER, false, false, true, returnEmptyListWhenTrueNullWhenFalse));
	}

	public List<String> extractSubmodelsCut(String model, String HEADER, String FOOTER) {
		return (extractSubmodels(model, HEADER, FOOTER, true));
	}

	public List<String> extractSubmodelsCut(String model, String HEADER, String FOOTER,
			Boolean returnEmptyListWhenTrueNullWhenFalse) {
		return (extractSubmodels(model, HEADER, FOOTER, true, true, true, returnEmptyListWhenTrueNullWhenFalse));
	}

	public String ERRORTEXT = "XXX ERROR Id:";

	public List<String> extractSubmodels(String model, String HEADER, String FOOTER, Boolean cutf, Boolean cutt,
			Boolean trim, Boolean returnEmptyListWhenTrueNullWhenFalse) {
		List<String> submodels = new ArrayList<String>();
		int numberOfsubmodels = 0;
		Matcher m = Pattern.compile(String.format("(%s)", HEADER)).matcher(model);
		List<Integer> pos = new ArrayList<Integer>();
		while (m.find()) {
			pos.add(m.start());
		}
		numberOfsubmodels = pos.size();
		if (numberOfsubmodels == 0) {
			if (returnEmptyListWhenTrueNullWhenFalse)
				return submodels;
			else
				return null;
		}
		if (numberOfsubmodels == 1) {
			String submodel = smartsubstring(model, HEADER, FOOTER, cutf, cutt, trim,
					returnEmptyListWhenTrueNullWhenFalse);
			if (submodel == null || submodel == "") {
				if (returnEmptyListWhenTrueNullWhenFalse)
					return submodels;
				else
					return null;
			} else {
				submodels.add(submodel);
				return submodels;
			}
		}
		for (int i = 0; i < numberOfsubmodels; i++) {
			int fmi = pos.get(i);
			int toi = 0;
			if (i == numberOfsubmodels - 1)
				toi = model.length();
			else
				toi = pos.get(i + 1) - 1;
			// submodels.add("Found at index: " + fmi +"->" + toi);
			String submodeltmp = model.substring(fmi, toi);
			String submodel = smartsubstringlastIndexOf(submodeltmp, HEADER, FOOTER, cutf, cutt, trim, true);
			if (submodel == null || submodel == "") {
				continue;
			} else {
				submodels.add(submodel);
			}
		}
		if (submodels.size() == 0) {
			if (returnEmptyListWhenTrueNullWhenFalse) {
				return submodels;
			} else {
				return null;
			}
		}
		return submodels;
	}

	public int countNumberOfOccurrencesOfSubstringInString(String string, String substring) {
		if (substring.length() == 0) {
			return 0;
		}
		String tmp = string.replace(substring, "");
		return ((string.length() - tmp.length()) / substring.length());
	}

	public List<String> extractComments(String strin) {
		List<String> comments = new ArrayList<String>();
		// Source:
		// https://stackoverflow.com/questions/6640071/how-to-find-all-comments-in-the-source-code
		String SingleLineComment = "//[^\r\n]*";
		String MultiLineComment = "/\\*[\\s\\S]*?\\*/";
		String StringLiteral = "\"(?:\\\\.|[^\\\\\"\r\n])*\"";
		String CharacterLiteral = "'(?:\\\\.|[^\\\\'\r\n])+'";
		String All = "[\\s\\S]";
		Pattern pattern = Pattern.compile(String.format("(%s)|(%s)|%s|%s|%s", SingleLineComment, MultiLineComment,
				StringLiteral, CharacterLiteral, All));
		Matcher matcher = pattern.matcher(strin);
		while (matcher.find()) {
			String hit = matcher.group();
			if (matcher.group(1) != null) {
				comments.add(hit);
			}
			if (matcher.group(2) != null) {
				comments.add(hit);
			}
		}
		return comments;
	}

}
