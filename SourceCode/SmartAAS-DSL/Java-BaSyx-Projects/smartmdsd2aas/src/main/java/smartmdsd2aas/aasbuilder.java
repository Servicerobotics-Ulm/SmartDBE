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
package smartmdsd2aas;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.basyx.aas.factory.xml.MetamodelToXMLConverter;
import org.eclipse.basyx.aas.factory.xml.XMLToMetamodelConverter;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.AssetKind;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.IAsset;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.eclipse.basyx.submodel.metamodel.api.parts.IConceptDescription;
import org.eclipse.basyx.submodel.metamodel.api.qualifier.haskind.ModelingKind;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.submodel.metamodel.map.qualifier.LangString;
import org.eclipse.basyx.submodel.metamodel.map.reference.Reference;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.MultiLanguageProperty;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.Operation;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.OperationVariable;
import org.eclipse.basyx.submodel.types.digitalnameplate.DigitalNameplateSubmodel;
import org.eclipse.basyx.submodel.types.digitalnameplate.submodelelementcollections.address.Address;
import org.eclipse.basyx.submodel.types.technicaldata.TechnicalDataSubmodel;
import org.eclipse.basyx.submodel.types.technicaldata.submodelelementcollections.furtherinformation.FurtherInformation;
import org.eclipse.basyx.submodel.types.technicaldata.submodelelementcollections.generalinformation.GeneralInformation;
import org.eclipse.basyx.submodel.types.technicaldata.submodelelementcollections.productclassifications.ProductClassifications;
import org.eclipse.basyx.submodel.types.technicaldata.submodelelementcollections.technicalproperties.TechnicalProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import tools.smartaasIO;

public class aasbuilder {
	public static final String SMART_ROOT_ACE = System.getenv("SMART_ROOT_ACE");

	// AAS/Submodel/Property Ids
	public static final String AssetIDshort = "SmartMDSD";
	public static final String AssetID = "smartmdsd";

	public static final String SMARTAASIDshort = "SmartMDSD_AAS";
	public static final IIdentifier SMARTAASID = new ModelUrn("smartmdsd.aas");

	public static final String NameplateIDshort = DigitalNameplateSubmodel.SUBMODELID;
	public static final Identifier NameplateSMID = new ModelUrn("smartmdsd.aas.submodel.nameplate");
	public static final Address NameplateAddress = new Address(new LangString("English", "Prittwitzstraße 10"),
			new LangString("English", "89075"), new LangString("English", "Ulm"), new LangString("English", "DE-EU"));
	public static final MultiLanguageProperty NameplateManufacturerName = new MultiLanguageProperty(
			"ServiceRoboticsULM");
	public static final MultiLanguageProperty NameplateManufacturerProductDesignation = new MultiLanguageProperty(
			"SmartMDSD");
	public static final MultiLanguageProperty NameplateManufacturerProductFamily = new MultiLanguageProperty(
			"ModelDrivenSoftware");
	public static final Property NameplateYearsOfConstruction = new Property("AASInitYear", 2021);

	public static final String TechnicalDataIDshort = TechnicalDataSubmodel.SUBMODELID;
	public static final Identifier TechnicalDataSMID = new ModelUrn("smartmdsd.aas.submodel.technicaldata");
	public static final GeneralInformation generalInformation = new GeneralInformation(
			new Property("manufacturerName", "ServiceRoboticsULM"),
			new MultiLanguageProperty("manufacturerProductDesignation"), new Property("manufacturerPartNumber", "NA"),
			new Property("manufacturerOrderCode", "NA"));
	public static final ProductClassifications productClassifications = new ProductClassifications(
			"ModelDrivenSoftware");
	public static final TechnicalProperties properties = new TechnicalProperties();
	public static final FurtherInformation furtherInformation = new FurtherInformation(
			new Property("validDate", "2104"));

	public static final String DOCUSMIDshort = "Documentation";
	public static final IIdentifier DOCUSMID = new ModelUrn("smartmdsd.aas.submodel.documentation");

	public static final String OPRIDshort = "Operations";
	public static final IIdentifier OPRID = new ModelUrn("smartmdsd.aas.submodel.operations");

	public static final String PushCapabilityOPRIDshort = "PushCapability";
	public static final String DeleteCapabilityOPRIDshort = "DeleteCapability";
	public static final String GetStatusCapabilityOPRIDshort = "GetStatusCapability";
	public static final String GetOutputCapabilityOPRIDshort = "GetOutputCapability";
	public static final String ManageServerOPRIDshort = "ManageServer";

	public static final String WEBSITEIDshort = "smartmdsd_website";
	public static final String WEBSITEID = "www.servicerobotik-ulm.de";

	public static final String ProjectIDshort = "smartmdsd_project";

	private static final Logger logger = LoggerFactory.getLogger(aasbuilder.class);

	public static void displayMetaModel(XMLToMetamodelConverter MM) {
		String disp = "Meta Model Contents:";
		try {
			for (IAsset A : MM.parseAssets()) {
				disp = disp + "\nFound Asset                       : " + A.getIdShort();
			}
			for (IAssetAdministrationShell AASEntry : MM.parseAAS()) {
				disp = disp + "\nFound Asset Administration Shell  : " + AASEntry.getIdShort();
			}
			for (ISubmodel SM : MM.parseSubmodels()) {
				disp = disp + "\nFound SubModel                    : " + SM.getIdShort();
				disp = disp + displaySubModelElements(SM, "                                  |----");
			}
			for (IConceptDescription CD : MM.parseConceptDescriptions()) {
				disp = disp + "\nFound ConceptDescription          : " + CD.getIdShort();
			}
		} catch (Exception e) {
			disp = disp + "\nERROR_displayMetaModel";
			e.printStackTrace();
		}
		logger.info(disp);
	}

	public static String displaySubModelElements(ISubmodel SM, String root) {
		Map<String, ISubmodelElement> SME = SM.getSubmodelElements();
		if (SME.size() > 0) {
			String disp = "\n" + root + "SMEs Found:" + SME.size();
			for (Entry<String, ISubmodelElement> pair : SME.entrySet()) {
				disp = disp + "\n" + root + pair.getKey() + "  [  " + pair.getValue().getClass().getSimpleName()
						+ "  ]";
				disp = disp + displaySubModelElements(pair.getValue(), root);
			}
			return disp;
		}
		return "";
	}

	public static String displaySubModelElements(ISubmodelElement SM, String root) {
		root = "    " + root;
		if (SM.getModelType().equals("SubmodelElementCollection")) {
			SubmodelElementCollection SMC = (SubmodelElementCollection) SM;
			Map<String, ISubmodelElement> Entries = SMC.getSubmodelElements();
			String disp = "\n" + root + "||SubmodelElementCollection " + SM.getIdShort();
			for (String entryid : Entries.keySet()) {
				disp = disp + displaySubModelElements((ISubmodelElement) Entries.get(entryid), root);
			}
			return disp;
		}
		// return "\n" + root + SM.toString();
		return "\n" + root + SM.getIdShort();
	}

	public static Asset getAsset() {
		// Asset
		return new Asset(AssetIDshort, new ModelUrn(AssetID), AssetKind.INSTANCE);
	}

	public static DigitalNameplateSubmodel getDigitalNameplateSubmodel() {
		// Nameplate Submodel
		DigitalNameplateSubmodel NameplateSubmodel = new DigitalNameplateSubmodel(NameplateIDshort, NameplateSMID,
				NameplateManufacturerName, NameplateManufacturerProductDesignation, NameplateAddress,
				NameplateManufacturerProductFamily, NameplateYearsOfConstruction);
		return NameplateSubmodel;
	}

	public static TechnicalDataSubmodel getTechnicalDataSubmodel() {
		// TechnicalData Submodel
		TechnicalDataSubmodel TechDataSubmodel = new TechnicalDataSubmodel(TechnicalDataIDshort, TechnicalDataSMID,
				generalInformation, productClassifications, properties, furtherInformation);
		return TechDataSubmodel;
	}

	public static Submodel getOperationsSubmodel() {
		Submodel operationsSubmodel = new Submodel(OPRIDshort, OPRID);

		// PushCapability Operation Submodel
		Operation PushCapability = new Operation();
		PushCapability.setIdShort(PushCapabilityOPRIDshort);
		Property PushCapabilityInProp = new Property("Command", "EmptyCommand");
		PushCapabilityInProp.setModelingKind(ModelingKind.TEMPLATE);
		Property PushCapabilityOutProp = new Property("OutId", "NA");
		PushCapabilityOutProp.setModelingKind(ModelingKind.TEMPLATE);
		OperationVariable PushCapabilityIn = new OperationVariable(PushCapabilityInProp);
		OperationVariable PushCapabilityOut = new OperationVariable(PushCapabilityOutProp);
		PushCapability.setInputVariables(Arrays.asList(PushCapabilityIn));
		PushCapability.setOutputVariables(Arrays.asList(PushCapabilityOut));
		operationsSubmodel.addSubmodelElement(PushCapability);

		// DeleteCapability Operation Submodel
		Operation DeleteCapability = new Operation();
		DeleteCapability.setIdShort(DeleteCapabilityOPRIDshort);
		Property DeleteCapabilityInProp = new Property("Command", "EmptyCommand");
		DeleteCapabilityInProp.setModelingKind(ModelingKind.TEMPLATE);
		Property DeleteCapabilityOutProp = new Property("OutId", "NA");
		DeleteCapabilityOutProp.setModelingKind(ModelingKind.TEMPLATE);
		OperationVariable DeleteCapabilityIn = new OperationVariable(DeleteCapabilityInProp);
		OperationVariable DeleteCapabilityOut = new OperationVariable(DeleteCapabilityOutProp);
		DeleteCapability.setInputVariables(Arrays.asList(DeleteCapabilityIn));
		DeleteCapability.setOutputVariables(Arrays.asList(DeleteCapabilityOut));
		operationsSubmodel.addSubmodelElement(DeleteCapability);

		// GetStatusCapability Operation Submodel
		Operation GetStatusCapability = new Operation();
		GetStatusCapability.setIdShort(GetStatusCapabilityOPRIDshort);
		Property GetStatusCapabilityInProp = new Property("CommandId", "EmptyCommand");
		GetStatusCapabilityInProp.setModelingKind(ModelingKind.TEMPLATE);
		Property GetStatusCapabilityOutProp = new Property("Result", "NA");
		GetStatusCapabilityOutProp.setModelingKind(ModelingKind.TEMPLATE);
		OperationVariable GetStatusCapabilityIn = new OperationVariable(GetStatusCapabilityInProp);
		OperationVariable GetStatusCapabilityOut = new OperationVariable(GetStatusCapabilityOutProp);
		GetStatusCapability.setInputVariables(Arrays.asList(GetStatusCapabilityIn));
		GetStatusCapability.setOutputVariables(Arrays.asList(GetStatusCapabilityOut));
		operationsSubmodel.addSubmodelElement(GetStatusCapability);

		// GetOutputCapability Operation Submodel
		Operation GetOutputCapability = new Operation();
		GetOutputCapability.setIdShort(GetOutputCapabilityOPRIDshort);
		Property GetOutputCapabilityInProp = new Property("CommandId", "EmptyCommand");
		GetOutputCapabilityInProp.setModelingKind(ModelingKind.TEMPLATE);
		Property GetOutputCapabilityOutProp = new Property("Result", "NA");
		GetOutputCapabilityOutProp.setModelingKind(ModelingKind.TEMPLATE);
		OperationVariable GetOutputCapabilityIn = new OperationVariable(GetOutputCapabilityInProp);
		OperationVariable GetOutputCapabilityOut = new OperationVariable(GetOutputCapabilityOutProp);
		GetOutputCapability.setInputVariables(Arrays.asList(GetOutputCapabilityIn));
		GetOutputCapability.setOutputVariables(Arrays.asList(GetOutputCapabilityOut));
		operationsSubmodel.addSubmodelElement(GetOutputCapability);

		// ManageServer Operation Submodel
		Operation ManageServer = new Operation();
		ManageServer.setIdShort(ManageServerOPRIDshort);
		Property ManageServerInProp = new Property("ServerCommand", "EmptyServerCommand");
		ManageServerInProp.setModelingKind(ModelingKind.TEMPLATE);
		Property ManageServerOutProp = new Property("Result", "NA");
		ManageServerOutProp.setModelingKind(ModelingKind.TEMPLATE);
		OperationVariable ManageServerIn = new OperationVariable(ManageServerInProp);
		OperationVariable ManageServerOut = new OperationVariable(ManageServerOutProp);
		ManageServer.setInputVariables(Arrays.asList(ManageServerIn));
		ManageServer.setOutputVariables(Arrays.asList(ManageServerOut));
		operationsSubmodel.addSubmodelElement(ManageServer);

		return operationsSubmodel;
	}

	public static void genEmptyTemplateAt(String TargetFullPath) {
		List<IAssetAdministrationShell> AASs = new ArrayList<IAssetAdministrationShell>();
		List<IAsset> Asss = new ArrayList<IAsset>();
		List<IConceptDescription> CDs = new ArrayList<IConceptDescription>();
		List<ISubmodel> SMs = new ArrayList<ISubmodel>();

		// Asset
		Asset asset = getAsset();
		// Nameplate Submodel
		DigitalNameplateSubmodel NameplateSubmodel = getDigitalNameplateSubmodel();
		// TechnicalData Submodel
		TechnicalDataSubmodel TechDataSubmodel = getTechnicalDataSubmodel();
		// Operations Submodel
		Submodel operationsSubmodel = getOperationsSubmodel();

		AssetAdministrationShell SmartAAS = new AssetAdministrationShell(SMARTAASIDshort, SMARTAASID, asset);

		// Filling Lists
		Asss.add(asset);
		SmartAAS.setAssetReference((Reference) asset.getReference());
		SMs.add(NameplateSubmodel);
		SMs.add(TechDataSubmodel);
		SMs.add(operationsSubmodel);
		for (ISubmodel entry : SMs) {
			SmartAAS.addSubmodelReference(entry.getReference());
		}
		AASs.add(SmartAAS);
		MM2Xml(AASs, Asss, CDs, SMs, TargetFullPath);
	}

	public static XMLToMetamodelConverter refreshMetaModel(XMLToMetamodelConverter MMin, List<ISubmodel> genSMs) {
		try {
			List<IAsset> Asss = new ArrayList<IAsset>();
			List<IAssetAdministrationShell> AASs = new ArrayList<IAssetAdministrationShell>();
			List<ISubmodel> SMs = new ArrayList<ISubmodel>();
			List<IConceptDescription> CDs = new ArrayList<IConceptDescription>();

			/*
			 * SMs = MMin.parseSubmodels(); CDs = MMin.parseConceptDescriptions();
			 * 
			 * List<String> toberefreshed = new ArrayList<String>(); for (ISubmodel genSM :
			 * genSMs) { toberefreshed.add(genSM.getIdShort()); } List<String> toberemoved =
			 * new ArrayList<String>(); for (ISubmodel SM : SMs) { if
			 * (toberefreshed.contains(SM.getIdShort())) { toberemoved.add(SM.getIdShort());
			 * } } for (String entry : toberemoved) { int remove = -1; for (int i = 0; i <
			 * SMs.size(); i++) { if (SMs.get(i).getIdShort().equals(entry)) { remove = i;
			 * break; } } if (remove != -1) { SMs.remove(remove); } } #TODO
			 */

			// Asset
			Asset asset = getAsset();
			// Nameplate Submodel
			DigitalNameplateSubmodel NameplateSubmodel = getDigitalNameplateSubmodel();
			// TechnicalData Submodel
			TechnicalDataSubmodel TechDataSubmodel = getTechnicalDataSubmodel();
			// Operations Submodel
			Submodel operationsSubmodel = getOperationsSubmodel();

			Asss.add(asset);
			AssetAdministrationShell SmartAAS = new AssetAdministrationShell(SMARTAASIDshort, SMARTAASID, asset);
			SmartAAS.setAssetReference((Reference) asset.getReference());

			SMs.add(NameplateSubmodel);
			SMs.add(TechDataSubmodel);
			SMs.add(operationsSubmodel);
			SMs.addAll(genSMs);
			for (ISubmodel entry : SMs) {
				SmartAAS.addSubmodelReference(entry.getReference());
			}
			AASs.add(SmartAAS);
			String newXMLContent = MM2XmlString(AASs, Asss, CDs, SMs);
			XMLToMetamodelConverter MMout = new XMLToMetamodelConverter(newXMLContent);
			return MMout;
		} catch (Exception e) {
			logger.info("\nERROR_refreshMetaModel");
			e.printStackTrace();
		}
		return MMin;
	}

	public static String MM2XmlString(List<IAssetAdministrationShell> aASs, List<IAsset> asss,
			List<IConceptDescription> cDs, List<ISubmodel> sMs) {
		try {
			ByteArrayOutputStream outString = new ByteArrayOutputStream();
			Result resultOutString = new StreamResult(outString);
			MetamodelToXMLConverter.convertToXML(aASs, asss, cDs, sMs, resultOutString);
			return outString.toString();
		} catch (Exception e) {
			logger.info("\nERROR_MM2XmlString");
			e.printStackTrace();
		}
		return "ERROR_MM2XmlString";
	}

	public static String MM2XmlString(XMLToMetamodelConverter MMin) {
		try {
			ByteArrayOutputStream outString = new ByteArrayOutputStream();
			Result resultOutString = new StreamResult(outString);
			MetamodelToXMLConverter.convertToXML(MMin.parseAAS(), MMin.parseAssets(), MMin.parseConceptDescriptions(),
					MMin.parseSubmodels(), resultOutString);
			return outString.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ERROR_MM2XmlString";
	}

	public static void MM2Xml(List<IAssetAdministrationShell> aASs, List<IAsset> asss, List<IConceptDescription> cDs,
			List<ISubmodel> sMs, String FileWithFullPath) {
		try {
			FileOutputStream outFile = new FileOutputStream(FileWithFullPath);
			Result resultOut = new StreamResult(outFile);
			MetamodelToXMLConverter.convertToXML(aASs, asss, cDs, sMs, resultOut);
			return;
		} catch (Exception e) {
			logger.info("ERROR_MM2Xml");
			e.printStackTrace();
		}
		return;
	}

	public static void MM2Xml(XMLToMetamodelConverter MMin, String FileWithFullPath) {
		try {
			FileOutputStream outFile = new FileOutputStream(FileWithFullPath);
			Result resultOut = new StreamResult(outFile);
			MetamodelToXMLConverter.convertToXML(MMin.parseAAS(), MMin.parseAssets(), MMin.parseConceptDescriptions(),
					MMin.parseSubmodels(), resultOut);
			return;
		} catch (Exception e) {
			logger.info("ERROR_MM2Xml");
			e.printStackTrace();
		}
		return;
	}

	public static XMLToMetamodelConverter Xml2MM(String EmptyTemplateSourceXMLFile) {
		smartaasIO IO;
		IO = new smartaasIO();
		String EmptyTemplateXML = IO.FilePath2String(EmptyTemplateSourceXMLFile);
		try {
			XMLToMetamodelConverter XML2MM = new XMLToMetamodelConverter(EmptyTemplateXML);
			return XML2MM;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}