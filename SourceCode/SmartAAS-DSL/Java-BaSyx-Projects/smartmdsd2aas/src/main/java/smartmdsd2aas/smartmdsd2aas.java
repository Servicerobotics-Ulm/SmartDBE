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

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.function.Function;

import org.eclipse.basyx.aas.factory.xml.XMLToMetamodelConverter;
import org.eclipse.basyx.aas.manager.ConnectedAssetAdministrationShellManager;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;
import org.eclipse.basyx.components.aas.AASServerComponent;
import org.eclipse.basyx.components.aas.configuration.AASServerBackend;
import org.eclipse.basyx.components.aas.configuration.BaSyxAASServerConfiguration;
import org.eclipse.basyx.components.configuration.BaSyxContextConfiguration;
import org.eclipse.basyx.components.registry.RegistryComponent;
import org.eclipse.basyx.components.registry.configuration.BaSyxRegistryConfiguration;
import org.eclipse.basyx.components.registry.configuration.RegistryBackend;
import org.eclipse.basyx.components.servlet.submodel.SubmodelServlet;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.operation.Operation;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxHTTPServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tools.SocketHandler;
import tools.socketentry;

public class smartmdsd2aas {

	private static final Logger logger = LoggerFactory.getLogger(smartmdsd2aas.class);

	public static void main(String[] args) throws Exception {
		logger.info("\nSmartMDSD2AAS : IN");
		Boolean invalidinputset = true;
		if ((args.length >= 2) && (args.length <= 6)) {
			String Option = args[0];
			String FilePath = args[1];
			if ((args.length == 2) && (!Option.equals("RUN")) && (!Option.equals("run"))) {
				logger.info("nSmartMDSD2AAS : Processing...\nOption  : " + Option + "\nFilePath: " + FilePath);
				if (FilePath.contains(".xml") || FilePath.contains(".XML")) {
					if (Option.equals("DISPLAY") || Option.equals("display")) {
						invalidinputset = false;
						displayXMLModel(FilePath);
					}
					if (Option.equals("DEFAULT") || Option.equals("default")) {
						invalidinputset = false;
						genXMLModel(FilePath);
					}
				}
				if (FilePath.contains(".aas_sms") || FilePath.contains(".AAS_SMS")) {
					if (Option.equals("SMS2XML") || Option.equals("sms2xml")) {
						invalidinputset = false;
						genXMLModelFromSMS(FilePath);
					}
				}
			}
			if ((Option.equals("RUN")) || (Option.equals("run"))) {
				logger.info("nSmartMDSD2AAS : Processing...\nOption  : " + Option + "\nFilePath: " + FilePath);
				if (FilePath.contains(".xml") || FilePath.contains(".XML")) {
					if (Option.equals("RUN") || Option.equals("run")) {
						invalidinputset = false;
						try {
							if (args.length == 2) {
								runXMLModel(FilePath);
							}
							if (args.length == 3) {
								int aasportnum = Integer.parseInt(args[2]);
								runXMLModel(FilePath, aasportnum);
							}
							if (args.length == 4) {
								int bridgesocket = Integer.parseInt(args[2]);
								long bridgetimer = Long.parseLong(args[3]);
								runXMLModel(FilePath, bridgesocket, bridgetimer);
							}
							if (args.length == 5) {
								int aasportnum = Integer.parseInt(args[2]);
								int bridgesocket = Integer.parseInt(args[3]);
								long bridgetimer = Long.parseLong(args[4]);
								runXMLModel(FilePath, aasportnum, bridgesocket, bridgetimer);
							}
							if (args.length == 6) {
								int aasportnum = Integer.parseInt(args[2]);
								int bridgesocket = Integer.parseInt(args[3]);
								long bridgetimer = Long.parseLong(args[4]);
								Boolean bridgeverbos = Boolean.parseBoolean(args[5]);
								runXMLModel(FilePath, aasportnum, bridgesocket, bridgetimer, bridgeverbos);
							}
						} catch (NumberFormatException e) {
							e.printStackTrace();
							invalidinputset = true;
						}
					}
				}
			}
		}
		if (invalidinputset) {
			logger.error("\nSmartMDSD2AAS : Invalid Input Set");
			String disp = "Valid Input Sets\n";
			disp = disp + "arg1: DISPLAY arg2: AASXML_FullPath\n";
			disp = disp + "arg1: DEFAULT arg2: AASXML_FullPath\n";
			disp = disp + "arg1: SMS2XML arg2: AASSMS_FullPath\n";
			disp = disp + "arg1: RUN     arg2: AASXML_FullPath\n";
			disp = disp + "arg1: RUN     arg2: AASSMS_FullPath arg3: AASportnum\n";
			disp = disp + "arg1: RUN     arg2: AASSMS_FullPath arg3: bridgesocket arg4: bridgetimer\n";
			disp = disp
					+ "arg1: RUN     arg2: AASSMS_FullPath arg3: AASportnum   arg4: bridgesocket arg5: bridgetimer\n";
			disp = disp
					+ "arg1: RUN     arg2: AASSMS_FullPath arg3: AASportnum   arg4: bridgesocket arg5: bridgetimer arg6: bridgeverbos";
			logger.info(disp);
		}
		logger.info("\nSmartMDSD2AAS : OUT");
		return;
	}

	public static void displayXMLModel(String XMLFileFullPath) throws Exception {
		XMLToMetamodelConverter AAS_MM = aasbuilder.Xml2MM(XMLFileFullPath);
		aasbuilder.displayMetaModel(AAS_MM);
	}

	public static void genXMLModel(String XMLFileFullPath) throws Exception {
		aasbuilder.genEmptyTemplateAt(XMLFileFullPath);
	}

	public static void genXMLModelFromSMS(String SMSFileFullPath) throws Exception {
		String XMLFileFullPath = SMSFileFullPath.replace(".aas_sms", "AAS.xml");
		aasbuilder.genEmptyTemplateAt(XMLFileFullPath);
		XMLToMetamodelConverter AAS_MM = aasbuilder.Xml2MM(XMLFileFullPath);
		List<ISubmodel> ModelSMs = smscompiler.compileSmartMDSDSubModels(SMSFileFullPath);
		AAS_MM = aasbuilder.refreshMetaModel(AAS_MM, ModelSMs);
		aasbuilder.MM2Xml(AAS_MM, XMLFileFullPath);
	}

	//// --------------------------------------------------------------------- ////

	public static String LOCALROOT = "http://localhost:";
	public static String REGISTRY = "/registry";
	public static String AASOPSERVER = "/aasOPServer";
	public static String AASSERVER = "/aasServer";
	// Server URLs
	public static String REGISTRYPATH = "http://localhost:4000/registry";
	public static String AASOPSERVERPATH = "http://localhost:4001/aasOPServer";
	public static String AASSERVERPATH = "http://localhost:4002/aasServer";
	public static final int DEFAULT_PORTNAMEROOT = 4000;
	public static int REGISTRY_PORTNUM = DEFAULT_PORTNAMEROOT;
	public static int OPERATIONS_PORTNUM = DEFAULT_PORTNAMEROOT + 1;
	public static int AASSERVER_PORTNUM = DEFAULT_PORTNAMEROOT + 2;
	public static final int DEFAULT_BRIDGESOCKET = 6868;
	public static int BRIDGESOCKET = DEFAULT_BRIDGESOCKET;
	public static final long DEFAULT_BRIDGETIMER = 4500;
	public static long BRIDGETIMER = DEFAULT_BRIDGETIMER;
	public static final Boolean DEFAULT_BRIDGEVERBOS = false;
	public static Boolean BRIDGEVERBOS = DEFAULT_BRIDGEVERBOS;

	public static final SimpleDateFormat OPformatter = socketentry.formatter;
	public static final String OPSpacer = socketentry.spacer;
	private static SocketHandler LinkToBridge;

	public static void runXMLModel(String XMLFileFullPath) {
		runXMLModel(XMLFileFullPath, DEFAULT_PORTNAMEROOT, DEFAULT_BRIDGESOCKET, DEFAULT_BRIDGETIMER,
				DEFAULT_BRIDGEVERBOS);
	}

	public static void runXMLModel(String XMLFileFullPath, Boolean bridgeverbos) {
		runXMLModel(XMLFileFullPath, DEFAULT_PORTNAMEROOT, DEFAULT_BRIDGESOCKET, DEFAULT_BRIDGETIMER, bridgeverbos);
	}

	public static void runXMLModel(String XMLFileFullPath, int portnum) {
		runXMLModel(XMLFileFullPath, portnum, DEFAULT_BRIDGESOCKET, DEFAULT_BRIDGETIMER, DEFAULT_BRIDGEVERBOS);
	}

	public static void runXMLModel(String XMLFileFullPath, int bridgesocket, long bridgetimer) {
		runXMLModel(XMLFileFullPath, DEFAULT_PORTNAMEROOT, bridgesocket, bridgetimer, DEFAULT_BRIDGEVERBOS);
	}

	public static void runXMLModel(String XMLFileFullPath, int portnum, int bridgesocket, long bridgetimer) {
		runXMLModel(XMLFileFullPath, portnum, bridgesocket, bridgetimer, DEFAULT_BRIDGEVERBOS);
	}

	public static void runXMLModel(String XMLFileFullPath, int bridgesocket, long bridgetimer, Boolean bridgeverbos) {
		runXMLModel(XMLFileFullPath, DEFAULT_PORTNAMEROOT, bridgesocket, bridgetimer, bridgeverbos);
	}

	public static void runXMLModel(String XMLFileFullPath, int portnum, int bridgesocket, long bridgetimer,
			Boolean bridgeverbos) {
		REGISTRY_PORTNUM = portnum;
		OPERATIONS_PORTNUM = portnum + 1;
		AASSERVER_PORTNUM = portnum + 2;
		REGISTRYPATH = LOCALROOT + REGISTRY_PORTNUM + REGISTRY;
		AASOPSERVERPATH = LOCALROOT + OPERATIONS_PORTNUM + AASOPSERVER;
		AASSERVERPATH = LOCALROOT + AASSERVER_PORTNUM + AASSERVER;

		BRIDGESOCKET = bridgesocket;
		BRIDGETIMER = bridgetimer;
		BRIDGEVERBOS = bridgeverbos;

		String Settings = "REGISTRYPATH    : " + REGISTRYPATH + "\n";
		Settings = Settings + "AASOPSERVERPATH : " + AASOPSERVERPATH + "\n";
		Settings = Settings + "AASSERVERPATH   : " + AASSERVERPATH + "\n";
		Settings = Settings + "-------------------" + "\n";
		Settings = Settings + "BRIDGESOCKET    : " + BRIDGESOCKET + "\n";
		Settings = Settings + "BRIDGETIMER     : " + BRIDGETIMER + "\n";
		Settings = Settings + "BRIDGEVERBOS    : " + BRIDGEVERBOS + "\n";
		Settings = Settings + "---------------------------------------------------------------";
		logger.info("\runXMLModel : Settings----------------------------------------\n" + Settings);

		LinkToBridge = new SocketHandler(BRIDGESOCKET, BRIDGETIMER, true);
		LinkToBridge.setverbos(BRIDGEVERBOS);
		LinkToBridge.start();

		try {
			XMLToMetamodelConverter MMin = aasbuilder.Xml2MM(XMLFileFullPath);
			List<IAssetAdministrationShell> AASs = MMin.parseAAS();
			List<ISubmodel> SMs = MMin.parseSubmodels();
			startRegistry();
			for (ISubmodel submodel : SMs) {
				if (submodel.getIdShort().equals("Operations")) {
					startAASServelet(submodel);
				}
			}
			startAASServer();
			ConnectedAssetAdministrationShellManager manager = new ConnectedAssetAdministrationShellManager(
					new AASRegistryProxy(REGISTRYPATH));
			IIdentifier aasId = null;
			for (IAssetAdministrationShell AASEntry : AASs) {
				AssetAdministrationShell shell = (AssetAdministrationShell) AASEntry;
				if (shell.getIdShort().equals("SmartMDSD_AAS")) {
					aasId = shell.getIdentification();
				}
				manager.createAAS(shell, AASSERVERPATH);
			}
			for (ISubmodel submodel : SMs) {
				if (!submodel.getIdShort().equals("Operations")) {
					manager.createSubmodel(aasId, (Submodel) submodel);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void startRegistry() {
		logger.info("------------------------------------------startRegistry [" + REGISTRYPATH + "] ");
		BaSyxContextConfiguration contextConfig = new BaSyxContextConfiguration(REGISTRY_PORTNUM, REGISTRY);
		BaSyxRegistryConfiguration registryConfig = new BaSyxRegistryConfiguration(RegistryBackend.INMEMORY);
		RegistryComponent registry = new RegistryComponent(contextConfig, registryConfig);
		registry.startComponent();
		// To View: http://localhost:4000/registry/api/v1/registry
		logger.info(
				"------------------------------------------startRegistry " + REGISTRYPATH + "/api/v1/registry (View)");
		logger.info("------------------------------------------startRegistry [" + REGISTRYPATH + "] OK");
	}

	private static void startAASServelet(ISubmodel OperationsSubmodel) {
		String OperationsSubmodelPath = AASOPSERVER + "/" + OperationsSubmodel.getIdentification().getId().toString();
		logger.info("------------------------------------------startAASServelet ["
				+ OperationsSubmodelPath.replace(AASOPSERVER, AASOPSERVERPATH) + "] ");
		BaSyxContextConfiguration contextConfig = new BaSyxContextConfiguration(OPERATIONS_PORTNUM, "");
		BaSyxContext context = contextConfig.createBaSyxContext();

		Operation OP1 = (Operation) OperationsSubmodel.getSubmodelElement(aasbuilder.PushCapabilityOPRIDshort);
		OP1.setInvokable((Function<Object[], Object>) v -> {
			return OPOUT(aasbuilder.PushCapabilityOPRIDshort, v[0].toString());
		});
		OperationsSubmodel.deleteSubmodelElement(aasbuilder.PushCapabilityOPRIDshort);
		OperationsSubmodel.addSubmodelElement(OP1);

		Operation OP2 = (Operation) OperationsSubmodel.getSubmodelElement(aasbuilder.DeleteCapabilityOPRIDshort);
		OP2.setInvokable((Function<Object[], Object>) v -> {
			return OPOUT(aasbuilder.DeleteCapabilityOPRIDshort, v[0].toString());
		});
		OperationsSubmodel.deleteSubmodelElement(aasbuilder.DeleteCapabilityOPRIDshort);
		OperationsSubmodel.addSubmodelElement(OP2);

		Operation OP3 = (Operation) OperationsSubmodel.getSubmodelElement(aasbuilder.GetStatusCapabilityOPRIDshort);
		OP3.setInvokable((Function<Object[], Object>) v -> {
			return OPIN(aasbuilder.GetStatusCapabilityOPRIDshort, v[0].toString());
		});
		OperationsSubmodel.deleteSubmodelElement(aasbuilder.GetStatusCapabilityOPRIDshort);
		OperationsSubmodel.addSubmodelElement(OP3);

		Operation OP4 = (Operation) OperationsSubmodel.getSubmodelElement(aasbuilder.GetOutputCapabilityOPRIDshort);
		OP4.setInvokable((Function<Object[], Object>) v -> {
			return OPIN(aasbuilder.GetOutputCapabilityOPRIDshort, v[0].toString());
		});
		OperationsSubmodel.deleteSubmodelElement(aasbuilder.GetOutputCapabilityOPRIDshort);
		OperationsSubmodel.addSubmodelElement(OP4);

		Operation OP5 = (Operation) OperationsSubmodel.getSubmodelElement(aasbuilder.ManageServerOPRIDshort);
		OP5.setInvokable((Function<Object[], Object>) v -> {
			return OPMAN(aasbuilder.ManageServerOPRIDshort, v[0].toString());
		});
		OperationsSubmodel.deleteSubmodelElement(aasbuilder.ManageServerOPRIDshort);
		OperationsSubmodel.addSubmodelElement(OP5);

		SubmodelServlet smServlet = new SubmodelServlet((Submodel) OperationsSubmodel);
		context.addServletMapping(OperationsSubmodelPath + "/*", smServlet);
		BaSyxHTTPServer operationsServer = new BaSyxHTTPServer(context);
		operationsServer.start();
		// To
		// View:http://localhost:4001/aasOPServer/smartmdsd.aas.submodel.operations/submodel
		logger.info("------------------------------------------startAASServelet "
				+ OperationsSubmodelPath.replace(AASOPSERVER, AASOPSERVERPATH) + "/submodel (View)");
		// To Invoke (Example: ManageServer Operation)
		// http://localhost:4001/aasOPServer/smartmdsd.aas.submodel.operations/submodel/submodelElements/ManageServer/invoke
		// Body:
		// {
		// "requestId" : "1",
		// "inputArguments": [
		// {
		// "value": {
		// "idShort": "CommandId",
		// "valueType": "string",
		// "value": "STOP_SERVER",
		// "modelType": {
		// "name": "Property"
		// }
		// }
		// }
		// ],
		// "timeout" : 5000
		// }
		logger.info("------------------------------------------startAASServelet ["
				+ OperationsSubmodelPath.replace(AASOPSERVER, AASOPSERVERPATH) + "] ");
	}

	private static String OPMAN(String OPName, String Arg) {
		socketentry soe = new socketentry(OPName + OPSpacer + Arg);
		String Reply = "";
		if (Arg.equals("CLEAR_INPUT_BUFFER")) {
			List<socketentry> tmp = LinkToBridge.popInList();
			Reply = "CLEAR_INPUT_BUFFER_DONE_" + tmp.size();
			logger.info(soe.toString() + " -> " + Reply);
			return Reply;
		}
		if (Arg.equals("VERBOS_ON")) {
			LinkToBridge.setverbos(true);
			Reply = "VERBOS_ON_DONE";
			logger.info(soe.toString() + " -> " + Reply);
			return Reply;
		}
		if (Arg.equals("VERBOS_OFF")) {
			LinkToBridge.setverbos(false);
			Reply = "VERBOS_OFF_DONE";
			logger.info(soe.toString() + " -> " + Reply);
			return Reply;
		}
		if (Arg.equals("STOP_SERVER")) {
			logger.info(soe.toString() + " -> STOP_SERVER_DONE");
			System.exit(0);
		}
		// e.printStackTrace();
		Reply = "NumberFormatException";
		logger.info(soe.toString() + " -> " + Reply);
		return Reply;
	}

	private static String OPOUT(String OPName, String Arg) {
		socketentry soe = new socketentry(OPName + OPSpacer + Arg);
		LinkToBridge.addOut(soe);
		logger.info(soe.toString());
		return new String(soe.msg);
	}

	private static String OPIN(String OPName, String Arg) {
		socketentry soe = new socketentry(OPName + OPSpacer + Arg);
		long QueryDatetimestamp = 0;
		try {
			QueryDatetimestamp = Long.parseLong(Arg);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			String r = "NumberFormatException";
			logger.info(soe.toString() + " -> " + r);
			return r;
		}
		LinkToBridge.addOut(soe);
		logger.info(soe.toString() + "  [Waiting for reply from bridge component]");
		List<socketentry> Replys = LinkToBridge.popIn(OPSpacer + QueryDatetimestamp + OPSpacer);
		String Reply = soe.msg + OPSpacer + "[ReplyOf::" + soe.toString() + "::Is]";
		for (socketentry entry : Replys) {
			Reply = Reply + "\n" + entry.msg;
		}
		logger.info(soe.toString() + "  [Got reply from bridge component]\n" + Reply);
		return new String(Reply);
	}

	private static void startAASServer() {
		logger.info("------------------------------------------startAASServer [" + AASSERVERPATH + "] ");
		BaSyxContextConfiguration contextConfig = new BaSyxContextConfiguration(AASSERVER_PORTNUM, AASSERVER);
		BaSyxAASServerConfiguration aasServerConfig = new BaSyxAASServerConfiguration(AASServerBackend.INMEMORY, "",
				REGISTRYPATH);
		AASServerComponent aasServer = new AASServerComponent(contextConfig, aasServerConfig);
		aasServer.startComponent();
		// To View: http://localhost:4002/aasServer/shells/smartmdsd.aas/aas
		logger.info("------------------------------------------startAASServer " + AASSERVERPATH
				+ "/shells/smartmdsd.aas/aas (View)");
		logger.info("------------------------------------------startAASServer [" + AASSERVERPATH + "] OK");
	}
}