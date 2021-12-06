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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TSDefine {

	public DBEDefine DBEDef = new DBEDefine();

	public String SmartTSGenReadmeText;
	public String SmartTSGenReadmeName;

	public String tsmodelFolderName;
	public String tsmodelFolderName_only;
	public String tsmodelLogFolderName;
	public String tsmodelLogFolderName_only;
	public String testdocFolderName;
	public String testdocFolderName_only;
	public String commobjectstestdocFolderName;
	public String commobjectstestdocFolderName_only;
	public String servicestestdocFolderName;
	public String servicestestdocFolderName_only;
	public String datasetsFolderName;
	public String datasetsFolderName_only;
	public String commobjectsdatasetsFolderName;
	public String commobjectsdatasetsFolderName_only;
	public String servicesdatasetsFolderName;
	public String servicesdatasetsFolderName_only;

	public String ComponentInfoXMLFileExtension;
	public String ComponentInfoXMLFileExtension_only;
	public String ServiceRepoInfoXMLFileExtension;
	public String ServiceRepoInfoXMLFileExtension_only;
	public String ServiceRepoInfoWikiFileExtension;
	public String ServiceRepoInfoWikiFileExtension_only;
	public String CommObjectInfoWikiFileExtension;
	public String CommObjectInfoWikiFileExtension_only;
	public String ServiceInfoWikiFileExtension;
	public String ServiceInfoWikiFileExtension_only;
	public String LogFileExtension;
	public String LogFileExtension_only;
	public String ErrLogFileExtension;
	public String ErrLogFileExtension_only;

	public String LatestFileIndicater;

	public String ServiceRepoTestDataFileNamePostfix;
	public String ServiceRepoTestDataFileNamePostfix_only;
	public String ServiceRepoTestSetsXMLFileNamePostfix;
	public String ServiceRepoTestSetsXMLFileNamePostfix_only;
	public String ServiceRepoTestSetsFileNamePostfix;
	public String ServiceRepoTestSetsFileNamePostfix_only;

	public String ComponentTSActivityName;

	public String ComponentTSFileExtension;
	public String ComponentTSFileExtension_only;
	public String ComponentSIMFileExtension;
	public String ComponentSIMFileExtension_only;

	public String ComponentProjectTSPostfix;
	public String ComponentProjectTSPostfix_only;
	public String ComponentProjectTSRUNPostfix;
	public String ComponentProjectTSRUNPostfix_only;

	public String ComponentPortTSPostfix;
	public String ComponentPortTSPostfix_only;
	public String ComponentPortSIMPostfix;
	public String ComponentPortSIMPostfix_only;

	public String ENUMPrefix;
	public String ENUMPrefix_only;
	public String ImportedPrefix;
	public String ImportedPrefix_only;
	public String LocalPrefix;
	public String LocalPrefix_only;
	public String ImportSourceDefaultString;

	public String TestSetNameSpacer;
	public String TestSetArraySpacer;
	public String TestSetArrayVarSz;
	public String TestSetArrayVarSzSys;
	public String TestSetArrayVarSzSys_Int;
	public String TestSetDataSTART;
	public String TestSetDataEND;
	public String TestSetWikiSTART;
	public String TestSetWikiEND;
	public String TestSetPrimitiveIndicator;
	public String TestSetNonPrimitiveIndicator;
	public String TestEntityNameIndicator;
	public String ServiceNameIndicator;
	public String ServiceTypeIndicator;
	public String ServicePatternIndicator;
	public String OneOfTheCurrentlyHandledServicePatternIndicator;

	public String ServiceType_ForkingServiceDefinition;
	public String PatternType_EventPattern;
	public String PatternType_EventPattern_ActivationType;
	public String PatternType_EventPattern_EventType;
	public String PatternType_EventPattern_EventStateType;
	public String PatternType_PushPattern;
	public String PatternType_DataType;
	public String PatternType_PushPattern_DataType;
	public String ServiceType_RequestAnswerServiceDefinition;
	public String PatternType_QueryPattern;
	public String PatternType_QueryPattern_RequestType;
	public String PatternType_QueryPattern_AnswerType;
	public String ServiceType_JoiningServiceDefinition;
	public String PatternType_SendPattern;
	public String PatternType_SendPattern_DataType;
	public List<String> ServiceValidList = new ArrayList<>();
	public List<String> PatternValidList = new ArrayList<>();
	public List<String> CommObjectValidList = new ArrayList<>();
	public List<String> ServicePatternValidList = new ArrayList<>();
	public List<String> PatternCommObjectValidList = new ArrayList<>();
	public List<String> ServicePatternCommObjectValidList = new ArrayList<>();

	public boolean isValidServicePatternPair(String service, String pattern) {
		return (ServicePatternValidList.contains(service + pattern));
	}

	public boolean isValidPatternCommObjPair(String pattern, String commobj) {
		return (PatternCommObjectValidList.contains(pattern + commobj));
	}

	public boolean isValidServicePatternCommObjectSet(String service, String pattern, String commobj) {
		return (ServicePatternCommObjectValidList.contains(service + pattern + commobj));
	}

	public String TestSetEnumIndicator;
	public String TestSetArrayIndicator;
	public String TestSetImportIndicator;
	public String TestSetLocalIndicator;
	public String TestSetNonPrimitiveArrayIndicator;

	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_SAME;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_SAME_COUNT;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_NEXT;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_NEXT_COUNT;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_RAND;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_RAND_COUNT;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_LOOP;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_LOOP_COUNT;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT;
	public String TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT_COUNT;

	public String TestSetBuilder_KeyNameSpacer;
	public String TestSetBuilder_SetNameSpacer;
	public String TestSetBuilder_HeaderNameSpacer;
	public String TestSetBuilder_ArrayMaxSpacer;
	public String TestSetBuilder_ImportSpacer;
	public String TestSetBuilder_ImportScoper;
	public String TestSetBuilder_ChildHeaderNameSpacer;
	public String TestSetBuilder_ChildScoper;
	public String TestSetBuilder_ChildTypeScoper;
	public String TestSetBuilder_RecursionHeaderNameSpacer;
	public String TestSetBuilder_RecursionHeaderSourceRepo;
	public String TestSetBuilder_ImportTreeSpacer;

	public String TestSetBuilder_VarCase_EmptyIndicator;

	public int TestSetBuilder_VarCase_Enum_NumPerArraySize;
	public int TestSetBuilder_VarCase_CommObj_NumPerArraySize;

	public String TestSetBuilder_HeaderFlagStart;
	public String TestSetBuilder_HeaderFlagTransport_isImport;
	public String TestSetBuilder_HeaderFlagTransport_isPrimitiveType;

	public String ErrorStringZeroArraySize;
	public String ErrorNoDataFound;
	public String ErrorNoDataFoundIndicator;
	public String DSLERROR;
	public String FileIOError;
	public String SyntaxError;

	public String Created;
	public String Deleted;
	public String Found;
	public String NotFound;
	public String Valid;
	public String Invalid;
	public String Import;
	public String ImportIndicate;
	public String Added;
	public String NotAdded;
	public String Touched;
	public String NotTouched;
	public String Built;
	public String NotBuilt;
	public String Indicate;
	public String CreatedIndicate;
	public String DeletedIndicate;
	public String FoundIndicate;
	public String NotFoundIndicate;
	public String ValidIndicate;
	public String InvalidIndicate;
	public String AddedIndicate;
	public String NotAddedIndicate;
	public String TouchedIndicate;
	public String NotTouchedIndicate;
	public String BuiltIndicate;
	public String NotBuiltIndicate;

	public String DataDefaultFileInsert;
	public String DataCustomFileInsert;
	public String DataCustomWikiInsert;
	public String TestSetBuilder_Permute;
	public String TestSetBuilder_Once;
	public String DataSelectON;
	public String DataSelectOFF;

	public List<String> PremitiveType = new ArrayList<>();

	public List<String> BooleanList = new ArrayList<>();
	public List<String> StringList = new ArrayList<>();
	public List<String> IntList = new ArrayList<>();
	public List<String> UIntList = new ArrayList<>();
	public List<String> FloatList = new ArrayList<>();

	public String ProcessList(List<String> InputList) {
		String pro = "";
		for (String element : InputList) {
			pro = pro + element + "\n";
		}
		return pro;
	}

	public boolean isPremitiveType(String in) {
		return PremitiveType.contains(in);
	}

	// Negative Array size represents variable array size.
	public String Process(String Type, int ArraySize) {
		if (ArraySize == 0) {
			return ErrorStringZeroArraySize;
		}
		List<String> InputList = new ArrayList<>();
		if (Type.equals("Boolean")) {
			InputList = BooleanList;
		}
		if (Type.equals("String")) {
			InputList = StringList;
		}
		if (Type.equals("Int8") || Type.equals("Int16") || Type.equals("Int32") || Type.equals("Int64")) {
			InputList = IntList;
		}
		if (Type.equals("UInt8") || Type.equals("UInt16") || Type.equals("UInt32") || Type.equals("UInt64")) {
			InputList = UIntList;
		}
		if (Type.equals("Float") || Type.equals("Double")) {
			InputList = FloatList;
		}
		if (ArraySize == 1) {
			return ProcessList(InputList);
		}
		String pro = "";
		int illen = InputList.size();
		for (int i = 0; i < illen; i++) {
			int ArraySizeUse = ArraySize;
			if (ArraySize < 0) {
				ArraySizeUse = i + 1;
			}
			for (int j = 0; j < ArraySizeUse; j++) {
				pro = pro + InputList.get((i + j) % illen);
				if (j < ArraySizeUse - 1) {
					pro = pro + ",";
				}
			}
			pro = pro + "\n";
		}
		return pro;
	}

	public String DefaultContents_MissingValueString;
	public String BasicTypeDefaultContents_MissingValueString;
	public Map<String, String> BasicTypeDefaultContents = new HashMap<String, String>();

	public TSDefine() {
		SmartTSGenReadmeText = "File generated by SmartTS. www.servicerobotik-ulm.de ";
		SmartTSGenReadmeName = "SmartTS.readme";

		tsmodelFolderName = DBEDef.modelFolderName + "ts/";
		tsmodelFolderName_only = tsmodelFolderName.substring(tsmodelFolderName.length() - 1);
		tsmodelLogFolderName = tsmodelFolderName + "log/";
		tsmodelLogFolderName_only = tsmodelLogFolderName.substring(tsmodelLogFolderName.length() - 1);
		testdocFolderName = tsmodelFolderName + "TestDocs/";
		testdocFolderName_only = testdocFolderName.substring(testdocFolderName.length() - 1);
		commobjectstestdocFolderName = testdocFolderName + "CommObjectTestDocs/";
		commobjectstestdocFolderName_only = commobjectstestdocFolderName
				.substring(commobjectstestdocFolderName.length() - 1);
		servicestestdocFolderName = testdocFolderName + "ServiceTestDocs/";
		servicestestdocFolderName_only = servicestestdocFolderName.substring(servicestestdocFolderName.length() - 1);
		datasetsFolderName = tsmodelFolderName + "DataSets/";
		datasetsFolderName_only = datasetsFolderName.substring(datasetsFolderName.length() - 1);
		commobjectsdatasetsFolderName = datasetsFolderName + "CommObjectDataSets/";
		commobjectsdatasetsFolderName_only = commobjectsdatasetsFolderName
				.substring(commobjectsdatasetsFolderName.length() - 1);
		servicesdatasetsFolderName = datasetsFolderName + "ServiceDataSets/";
		servicesdatasetsFolderName_only = servicesdatasetsFolderName.substring(servicesdatasetsFolderName.length() - 1);

		ComponentInfoXMLFileExtension = "_component_info.xml";
		ComponentInfoXMLFileExtension_only = ComponentInfoXMLFileExtension.substring(1);
		ServiceRepoInfoXMLFileExtension = "_service_repo_info.xml";
		ServiceRepoInfoXMLFileExtension_only = ServiceRepoInfoXMLFileExtension.substring(1);
		ServiceRepoInfoWikiFileExtension = "_service_repo_wiki.txt";
		ServiceRepoInfoWikiFileExtension_only = ServiceRepoInfoWikiFileExtension.substring(1);
		CommObjectInfoWikiFileExtension = "_CommObject_wiki.txt";
		CommObjectInfoWikiFileExtension_only = CommObjectInfoWikiFileExtension.substring(1);
		ServiceInfoWikiFileExtension = "_Service_wiki.txt";
		ServiceInfoWikiFileExtension_only = ServiceInfoWikiFileExtension.substring(1);
		LogFileExtension = ".log";
		LogFileExtension_only = LogFileExtension.substring(1);
		ErrLogFileExtension = ".err";
		ErrLogFileExtension_only = ErrLogFileExtension.substring(1);

		LatestFileIndicater = "Latest";

		ServiceRepoTestDataFileNamePostfix = "_tdat.csv";
		ServiceRepoTestDataFileNamePostfix_only = ServiceRepoTestDataFileNamePostfix.substring(1);
		ServiceRepoTestSetsXMLFileNamePostfix = "_tset.xml";
		ServiceRepoTestSetsXMLFileNamePostfix_only = ServiceRepoTestSetsXMLFileNamePostfix.substring(1);
		ServiceRepoTestSetsFileNamePostfix = "_tset.csv";
		ServiceRepoTestSetsFileNamePostfix_only = ServiceRepoTestSetsFileNamePostfix.substring(1);

		ComponentTSActivityName = "Act";

		ComponentTSFileExtension = ".component_ts";
		ComponentTSFileExtension_only = ComponentTSFileExtension.substring(1);
		ComponentSIMFileExtension = ".component_sim";
		ComponentSIMFileExtension_only = ComponentSIMFileExtension.substring(1);

		ComponentProjectTSPostfix = "_TS";
		ComponentProjectTSPostfix_only = ComponentProjectTSPostfix.substring(1);
		ComponentProjectTSRUNPostfix = "_TS_RUN";
		ComponentProjectTSRUNPostfix_only = ComponentProjectTSRUNPostfix.substring(1);

		ComponentPortTSPostfix = "_ts";
		ComponentPortTSPostfix_only = ComponentProjectTSPostfix.substring(1);
		ComponentPortSIMPostfix = "_sim";
		ComponentPortSIMPostfix_only = ComponentProjectTSRUNPostfix.substring(1);

		ENUMPrefix = "Enum_";
		ENUMPrefix_only = ENUMPrefix.substring(0, ENUMPrefix.length() - 1);
		ImportedPrefix = "Imported_";
		ImportedPrefix_only = ImportedPrefix.substring(0, ImportedPrefix.length() - 1);
		LocalPrefix = "Local_";
		LocalPrefix_only = LocalPrefix.substring(0, LocalPrefix.length() - 1);
		ImportSourceDefaultString = "ImportSource";

		TestSetNameSpacer = "-ts-";
		TestSetArraySpacer = TestSetNameSpacer + "Vec";
		TestSetArrayVarSz = "*";
		TestSetArrayVarSzSys = "Var";
		TestSetArrayVarSzSys_Int = "-1";
		TestSetDataSTART = "<<TS_DATA>";
		TestSetDataEND = "<TS_DATA>>";
		TestSetWikiSTART = "<<WIKI>";
		TestSetWikiEND = "<WIKI>>";
		TestEntityNameIndicator = "TestEntityName,";
		ServiceNameIndicator = "Service Name,";
		ServiceTypeIndicator = "Service Type,";
		ServicePatternIndicator = "Service Pattern,";
		OneOfTheCurrentlyHandledServicePatternIndicator = "IS-OneOfTheCurrentlyHandledServicePattern,";

		ServiceType_ForkingServiceDefinition = "ForkingServiceDefinition";
		PatternType_EventPattern = "EventPattern";
		PatternType_EventPattern_ActivationType = "ActivationType";
		PatternType_EventPattern_EventType = "EventType";
		PatternType_EventPattern_EventStateType = "EventStateType";
		PatternType_PushPattern = "PushPattern";
		PatternType_DataType = "DataType";
		PatternType_PushPattern_DataType = PatternType_DataType;

		ServiceType_RequestAnswerServiceDefinition = "RequestAnswerServiceDefinition";
		PatternType_QueryPattern = "QueryPattern";
		PatternType_QueryPattern_RequestType = "RequestType";
		PatternType_QueryPattern_AnswerType = "AnswerType";

		ServiceType_JoiningServiceDefinition = "JoiningServiceDefinition";
		PatternType_SendPattern = "SendPattern";
		PatternType_SendPattern_DataType = PatternType_DataType;

		ServiceValidList.add(ServiceType_ForkingServiceDefinition);
		ServiceValidList.add(ServiceType_RequestAnswerServiceDefinition);
		ServiceValidList.add(ServiceType_JoiningServiceDefinition);

		PatternValidList.add(PatternType_EventPattern);
		PatternValidList.add(PatternType_PushPattern);
		PatternValidList.add(PatternType_QueryPattern);
		PatternValidList.add(PatternType_SendPattern);

		CommObjectValidList.add(PatternType_EventPattern_ActivationType);
		CommObjectValidList.add(PatternType_EventPattern_EventType);
		CommObjectValidList.add(PatternType_EventPattern_EventStateType);
		CommObjectValidList.add(PatternType_DataType);
		CommObjectValidList.add(PatternType_QueryPattern_RequestType);
		CommObjectValidList.add(PatternType_QueryPattern_AnswerType);

		ServicePatternValidList.add(ServiceType_ForkingServiceDefinition + PatternType_EventPattern);
		ServicePatternValidList.add(ServiceType_ForkingServiceDefinition + PatternType_PushPattern);
		ServicePatternValidList.add(ServiceType_RequestAnswerServiceDefinition + PatternType_QueryPattern);
		ServicePatternValidList.add(ServiceType_JoiningServiceDefinition + PatternType_SendPattern);

		PatternCommObjectValidList.add(PatternType_EventPattern + PatternType_EventPattern_ActivationType);
		PatternCommObjectValidList.add(PatternType_EventPattern + PatternType_EventPattern_EventType);
		PatternCommObjectValidList.add(PatternType_EventPattern + PatternType_EventPattern_EventStateType);
		PatternCommObjectValidList.add(PatternType_PushPattern + PatternType_PushPattern_DataType);
		PatternCommObjectValidList.add(PatternType_QueryPattern + PatternType_QueryPattern_RequestType);
		PatternCommObjectValidList.add(PatternType_QueryPattern + PatternType_QueryPattern_AnswerType);
		PatternCommObjectValidList.add(PatternType_SendPattern + PatternType_SendPattern_DataType);

		ServicePatternCommObjectValidList.add(ServiceType_ForkingServiceDefinition + PatternType_EventPattern
				+ PatternType_EventPattern_ActivationType);
		ServicePatternCommObjectValidList.add(
				ServiceType_ForkingServiceDefinition + PatternType_EventPattern + PatternType_EventPattern_EventType);
		ServicePatternCommObjectValidList.add(ServiceType_ForkingServiceDefinition + PatternType_EventPattern
				+ PatternType_EventPattern_EventStateType);
		ServicePatternCommObjectValidList
				.add(ServiceType_ForkingServiceDefinition + PatternType_PushPattern + PatternType_PushPattern_DataType);
		ServicePatternCommObjectValidList.add(ServiceType_RequestAnswerServiceDefinition + PatternType_QueryPattern
				+ PatternType_QueryPattern_RequestType);
		ServicePatternCommObjectValidList.add(ServiceType_RequestAnswerServiceDefinition + PatternType_QueryPattern
				+ PatternType_QueryPattern_AnswerType);
		ServicePatternCommObjectValidList
				.add(ServiceType_JoiningServiceDefinition + PatternType_SendPattern + PatternType_SendPattern_DataType);

		TestSetEnumIndicator = "<<IS ENUM>>";
		TestSetPrimitiveIndicator = "<<IS PRIMITIVE>>";
		TestSetNonPrimitiveIndicator = "<<IS NON PRIMITIVE>>";
		TestSetArrayIndicator = "<<IS ARRAY>>";
		TestSetImportIndicator = "<<IS IMPORT>>";
		TestSetLocalIndicator = "<<IS LOCAL>>";
		TestSetNonPrimitiveArrayIndicator = "<<IS NON PRIMITIVE ARRAY>>";

		PremitiveType.add("Boolean");
		PremitiveType.add("String");
		PremitiveType.add("Int8");
		PremitiveType.add("Int16");
		PremitiveType.add("Int32");
		PremitiveType.add("Int64");
		PremitiveType.add("UInt8");
		PremitiveType.add("UInt16");
		PremitiveType.add("UInt32");
		PremitiveType.add("UInt64");
		PremitiveType.add("Float");
		PremitiveType.add("Double");

		BooleanList.add("true");
		BooleanList.add("false");
		BooleanList.add("false");
		BooleanList.add("true");

		StringList.add("North");
		StringList.add("East");
		StringList.add("West");
		StringList.add("South");

		IntList.add("9");
		IntList.add("-9");
		IntList.add("8");
		IntList.add("-8");
		IntList.add("7");
		IntList.add("-7");
		IntList.add("6");
		IntList.add("-6");
		IntList.add("5");
		IntList.add("0");
		IntList.add("-1");
		IntList.add("1");
		IntList.add("-2");
		IntList.add("2");
		IntList.add("-3");
		IntList.add("3");
		IntList.add("-4");
		IntList.add("4");
		IntList.add("-5");

		UIntList.add("0");
		UIntList.add("1");
		UIntList.add("2");
		UIntList.add("3");
		UIntList.add("4");
		UIntList.add("5");
		UIntList.add("6");
		UIntList.add("7");
		UIntList.add("8");
		UIntList.add("9");

		FloatList.add("9.1");
		FloatList.add("-9.2");
		FloatList.add("8.3");
		FloatList.add("-8.4");
		FloatList.add("7.5");
		FloatList.add("-7.6");
		FloatList.add("6.7");
		FloatList.add("-6.8");
		FloatList.add("5.9");
		FloatList.add("0");
		FloatList.add("-1.0");
		FloatList.add("1.1");
		FloatList.add("-2.2");
		FloatList.add("2.3");
		FloatList.add("-3.4");
		FloatList.add("3.5");
		FloatList.add("-4.6");
		FloatList.add("4.7");
		FloatList.add("-5.8");

		String defaultBooleanValue = ProcessList(BooleanList);
		String defaultStringValue = ProcessList(StringList);
		String defaultIntValue = ProcessList(IntList);
		String defaultUIntValue = ProcessList(UIntList);
		String defaultFloatValue = ProcessList(FloatList);

		DefaultContents_MissingValueString = "DefaultContents_Missing__Add_Here";
		BasicTypeDefaultContents_MissingValueString = "BasicTypeDefaultContents_Value_Missing";
		BasicTypeDefaultContents.put(null, "BasicTypeDefaultContents_Key_Missing");
		BasicTypeDefaultContents.put("Boolean", defaultBooleanValue);
		BasicTypeDefaultContents.put("String", defaultStringValue);
		BasicTypeDefaultContents.put("Int8", defaultIntValue);
		BasicTypeDefaultContents.put("Int16", defaultIntValue);
		BasicTypeDefaultContents.put("Int32", defaultIntValue);
		BasicTypeDefaultContents.put("Int64", defaultIntValue);
		BasicTypeDefaultContents.put("UInt8", defaultUIntValue);
		BasicTypeDefaultContents.put("UInt16", defaultUIntValue);
		BasicTypeDefaultContents.put("UInt32", defaultUIntValue);
		BasicTypeDefaultContents.put("UInt64", defaultUIntValue);
		BasicTypeDefaultContents.put("Float", defaultFloatValue);
		BasicTypeDefaultContents.put("Double", defaultFloatValue);

		Created = " [ Created ] ";
		Deleted = " [ Deleted ] ";
		Found = " [  Found  ] ";
		NotFound = " [Not Found] ";
		Valid = " [  Valid  ] ";
		Invalid = " [ Invalid ] ";
		Import = " [ Import! ] ";
		Added = " [  Added  ] ";
		NotAdded = " [Not Added] ";
		Touched = " [ Touched ] ";
		NotTouched = " [ NoTouch ] ";
		Built = " [  Built  ] ";
		NotBuilt = " [Not Built] ";
		Indicate = " <---!! ";
		CreatedIndicate = Created + Indicate;
		DeletedIndicate = Deleted + Indicate;
		FoundIndicate = Found + Indicate;
		NotFoundIndicate = NotFound + Indicate;
		ValidIndicate = Valid + Indicate;
		InvalidIndicate = Invalid + Indicate;
		ImportIndicate = Import + Indicate;
		AddedIndicate = Added + Indicate;
		NotAddedIndicate = NotAdded + Indicate;
		TouchedIndicate = Touched + Indicate;
		NotTouchedIndicate = NotTouched + Indicate;
		BuiltIndicate = Built + Indicate;
		NotBuiltIndicate = NotBuilt + Indicate;

		DataDefaultFileInsert = "DEFAULT";
		DataCustomFileInsert = "CUSTOM";
		DataCustomWikiInsert = "User can add a new seed (e.g. CUSTOMX) in any of the test data sets.";
		TestSetBuilder_Permute = "TS_BUILDER_PERMUTE";
		TestSetBuilder_Once = "TS_BUILDER_ONCE";
		DataSelectON = "DS_ON";
		DataSelectOFF = "DS_OFF";

		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_SAME = "DS_USE_SAME";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_SAME_COUNT = "DS_USE_MAX";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_NEXT = "DS_USE_NEXT";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_NEXT_COUNT = "10";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_RAND = "DS_USE_RAND";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_RAND_COUNT = "10";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_LOOP = "DS_USE_LOOP";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_LOOP_COUNT = "DS_USE_LOOP_DEF";
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT = TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_LOOP;
		TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_DEFAULT_COUNT = TestSetBuilder_DataSelectNonPrimitiveArrayPolicy_LOOP_COUNT;

		TestSetBuilder_KeyNameSpacer = "--TSet--";
		TestSetBuilder_SetNameSpacer = "-Set-";
		TestSetBuilder_HeaderNameSpacer = "-Dot-";
		TestSetBuilder_ArrayMaxSpacer = "-Of-";
		TestSetBuilder_ImportSpacer = "-Im-";
		TestSetBuilder_ImportScoper = "-Fm-";
		TestSetBuilder_ChildHeaderNameSpacer = "-CDot-";
		TestSetBuilder_ChildScoper = "-Ch-";
		TestSetBuilder_ChildTypeScoper = "-Ty-";
		TestSetBuilder_RecursionHeaderNameSpacer = "-Re-";
		TestSetBuilder_RecursionHeaderSourceRepo = "-Repo-";
		TestSetBuilder_ImportTreeSpacer = "-Tree-";

		TestSetBuilder_VarCase_EmptyIndicator = "VARCASE_SKIP_NO_ADD";

		TestSetBuilder_VarCase_Enum_NumPerArraySize = 2;
		TestSetBuilder_VarCase_CommObj_NumPerArraySize = 2;

		/*
		 * TestSetBuilder_KeyNameSpacer_nice = "$"; TestSetBuilder_HeaderNameSpacer_nice
		 * = "."; TestSetBuilder_ImportSpacer_nice = ">>";
		 * TestSetBuilder_ImportScoper_nice = "::";
		 * TestSetBuilder_ChildHeaderNameSpacer_nice = "{";
		 * TestSetBuilder_ChildScoper_nice = "."; TestSetBuilder_ChildTypeScoper_nice =
		 * "(";
		 */

		TestSetBuilder_HeaderFlagStart = "TestSetBuilder_HeaderFlagStart";
		TestSetBuilder_HeaderFlagTransport_isImport = "TestSetBuilder_HeaderFlagTransport_isImport";
		TestSetBuilder_HeaderFlagTransport_isPrimitiveType = "TestSetBuilder_HeaderFlagTransport_isPrimitiveType";

		ErrorStringZeroArraySize = "ERROR_ZERO_SIZE_ARRAY_DECLARATION";
		ErrorNoDataFound = "ERROR_NO_DATA_FOUND";
		ErrorNoDataFoundIndicator = "ERROR[[" + ErrorNoDataFound + "]]ERROR" + Indicate;
		DSLERROR = "DSL ERROR (Report To Developers)";
		FileIOError = "FILE IO ERROR";
		SyntaxError = "Syntax Error !!";
	}

	public List<String> TestSetBuilder_Enum_Filler(List<String> TS) {
		return TestSetBuilder_Enum_Filler(TS, false);
	}

	public List<String> TestSetBuilder_Enum_Filler(List<String> TS, boolean shuffle) {
		List<String> TSout = new ArrayList<String>();
		// Deep Copy
		for (String s : TS) {
			TSout.add(s);
		}
		if (shuffle) {
			Collections.shuffle(TSout);
		}
		return TSout;
	}

	public int TestSetBuilder_VarCase_Enum_SizeGetter(int NumEnum) {
		// For an Enum of size n
		// These are Arrays of sizes 1,2,3...r,...S possible
		// For any r (between 1 and S), here are S^r possible Arrays
		// Total: S^1 + S^2 + S^3 + ... + S^r + ... + S^S
		// This is a huge number... Thus to simplify we will randomize
		// and take TestSetBuilder_VarCase_Enum_NumPerArraySize arrays of
		// every size, and fill possible values using the function
		// TestSetBuilder_VarCase_Enum_Filler()
		return TestSetBuilder_VarCase_Enum_NumPerArraySize * NumEnum;
	}

	public int TestSetBuilder_VarCase_Enum_ArrayIndexToSubSizeGetter(String ArrayIndex, String ArraySize) {
		return TestSetBuilder_VarCase_Enum_ArrayIndexToSubSizeGetter(Integer.parseInt(ArrayIndex),
				Integer.parseInt(ArraySize));
	}

	public int TestSetBuilder_VarCase_Enum_ArrayIndexToSubSizeGetter(int ArrayIndex, int ArraySize) {
		// In Enum VarCase TestSetBuilder_VarCase_Enum_NumPerArraySize * NumEnum is
		// ArraySize thus
		int numenum = ArraySize / TestSetBuilder_VarCase_Enum_NumPerArraySize;
		int normalizedarraysize = (ArrayIndex + 1) % numenum;
		if (normalizedarraysize == 0)
			normalizedarraysize = numenum;
		int arrayindex = normalizedarraysize - 1;
		return arrayindex;
	}

	public static final String CSV2Column_Default_EmptyIndicator = "SKIP_NO_ADD";
	public static final String CSV2Column_Default_EmptyIndicator_Display = "#";

	public List<String> TestSetBuilder_VarCase_Enum_Filler(List<String> TS, int r) {
		return TestSetBuilder_VarCase_Enum_Filler(TS, r, true);
	}

	public List<String> TestSetBuilder_VarCase_Enum_Filler(List<String> TS, int useindex, boolean shuffle) {
		if ((useindex < 0) || (useindex > (TS.size() - 1))) {
			return null;
		}
		List<String> TStmp = new ArrayList<String>();
		List<String> TSout = new ArrayList<String>();
		TStmp = TestSetBuilder_Enum_Filler(TS, shuffle);
		for (int i = 0; i <= useindex; i++) {
			String tmp = TStmp.get(i);
			TSout.add(tmp);
		}
		for (int i = useindex + 1; i < TS.size(); i++) {
			TSout.add(CSV2Column_Default_EmptyIndicator);
		}
		return TSout;
	}

	public String addBracket(String in) {
		return "<<" + in + ">>";
	}
}
