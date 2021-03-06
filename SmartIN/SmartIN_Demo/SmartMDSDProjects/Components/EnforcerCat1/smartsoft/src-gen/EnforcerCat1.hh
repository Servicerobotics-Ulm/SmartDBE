//--------------------------------------------------------------------------
// Code generated by the SmartSoft MDSD Toolchain
// The SmartSoft Toolchain has been developed by:
//  
// Service Robotics Research Center
// University of Applied Sciences Ulm
// Prittwitzstr. 10
// 89075 Ulm (Germany)
//
// Information about the SmartSoft MDSD Toolchain is available at:
// www.servicerobotik-ulm.de
//
// Please do not modify this file. It will be re-generated
// running the code generator.
//--------------------------------------------------------------------------
#ifndef _ENFORCERCAT1_HH
#define _ENFORCERCAT1_HH

#include <map>
#include <iostream>
#include "aceSmartSoft.hh"
#include "smartQueryServerTaskTrigger_T.h"
#include "EnforcerCat1Core.hh"

#include "EnforcerCat1PortFactoryInterface.hh"
#include "EnforcerCat1Extension.hh"

// forward declarations
class EnforcerCat1PortFactoryInterface;
class EnforcerCat1Extension;

// includes for PlainOpcUaEnforcerCat1Extension
// include plain OPC UA device clients
// include plain OPC UA status servers


// include communication objects
#include <SmartInstitutionsServiceRepository/EnforcementInstructionPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementInstructionPackageACE.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackageACE.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReportPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReportPackageACE.hh>
#include <SmartInstitutionsServiceRepository/MemberIdentifier.hh>
#include <SmartInstitutionsServiceRepository/MemberIdentifierACE.hh>

// include tasks
#include "EnforcementManager.hh"
// include UpcallManagers and InputCollectors
#include "EnforcementReply_SendUpcallManager.hh"
#include "EnforcementReply_SendInputCollector.hh"
#include "EnforcementReport_SendUpcallManager.hh"
#include "EnforcementReport_SendInputCollector.hh"

// include input-handler(s)
// include request-handler(s)
// output port wrappers
#include "EnforcementInstruction_PushWrapper.hh"
#include "EnforcementInstruction_SendWrapper.hh"

// include handler
#include "CompHandler.hh"


#include "SmartStateChangeHandler.hh"

#define COMP EnforcerCat1::instance()

class EnforcerCat1 : public EnforcerCat1Core {
private:
	static EnforcerCat1 *_enforcerCat1;
	
	// constructor
	EnforcerCat1();
	
	// copy-constructor
	EnforcerCat1(const EnforcerCat1& cc);
	
	// destructor
	~EnforcerCat1() { };
	
	// load parameter from ini file
	void loadParameter(int argc, char* argv[]);
	
	// instantiate comp-handler
	CompHandler compHandler;
	
	// helper method that maps a string-name to an according TaskTriggerSubject
	Smart::TaskTriggerSubject* getInputTaskTriggerFromString(const std::string &client);
	
	// internal map storing the different port-creation factories (that internally map to specific middleware implementations)
	std::map<std::string, EnforcerCat1PortFactoryInterface*> portFactoryRegistry;
	
	// internal map storing various extensions of this component class
	std::map<std::string, EnforcerCat1Extension*> componentExtensionRegistry;
	
public:
	
	// define tasks
	Smart::TaskTriggerSubject* enforcementManagerTrigger;
	EnforcementManager *enforcementManager;
	
	// define input-ports
	// InputPort EnforcementReply_Send
	Smart::ISendServerPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Send;
	Smart::InputTaskTrigger<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_SendInputTaskTrigger;
	EnforcementReply_SendUpcallManager *enforcementReply_SendUpcallManager;
	EnforcementReply_SendInputCollector *enforcementReply_SendInputCollector;
	// InputPort EnforcementReport_Send
	Smart::ISendServerPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> *enforcementReport_Send;
	Smart::InputTaskTrigger<SmartInstitutionsServiceRepository::EnforcementReportPackage> *enforcementReport_SendInputTaskTrigger;
	EnforcementReport_SendUpcallManager *enforcementReport_SendUpcallManager;
	EnforcementReport_SendInputCollector *enforcementReport_SendInputCollector;
	
	// define request-ports
	Smart::IQueryClientPattern<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> *report_QueryRequester;
	
	// define input-handler
	
	// define output-ports
	Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *enforcementInstruction_Push;
	EnforcementInstruction_PushWrapper *enforcementInstruction_PushWrapper;
	Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *enforcementInstruction_Send;
	EnforcementInstruction_SendWrapper *enforcementInstruction_SendWrapper;
	
	// define answer-ports
	
	// define request-handlers
	
	
	// define default slave ports
	SmartACE::StateSlave *stateSlave;
	SmartStateChangeHandler *stateChangeHandler;
	SmartACE::WiringSlave *wiringSlave;
	
	
	/// this method is used to register different PortFactory classes (one for each supported middleware framework)
	void addPortFactory(const std::string &name, EnforcerCat1PortFactoryInterface *portFactory);
	
	SmartACE::SmartComponent* getComponentImpl();
	
	/// this method is used to register different component-extension classes
	void addExtension(EnforcerCat1Extension *extension);
	
	/// this method allows to access the registered component-extensions (automatically converting to the actuall implementation type)
	template <typename T>
	T* getExtension(const std::string &name) {
		auto it = componentExtensionRegistry.find(name);
		if(it != componentExtensionRegistry.end()) {
			return dynamic_cast<T*>(it->second);
		}
		return 0;
	}
	
	/// initialize component's internal members
	void init(int argc, char *argv[]);
	
	/// execute the component's infrastructure
	void run();
	
	/// clean-up component's resources
	void fini();
	
	/// call this method to set the overall component into the Alive state (i.e. component is then ready to operate)
	void setStartupFinished();
	
	/// connect all component's client ports
	Smart::StatusCode connectAndStartAllServices();
	
	/// start all assocuated Activities
	void startAllTasks();
	
	/// start all associated timers
	void startAllTimers();
	
	Smart::StatusCode connectEnforcementInstruction_Send(const std::string &serverName, const std::string &serviceName);
	Smart::StatusCode connectReport_QueryRequester(const std::string &serverName, const std::string &serviceName);

	// return singleton instance
	static EnforcerCat1* instance()
	{
		if(_enforcerCat1 == 0) {
			_enforcerCat1 = new EnforcerCat1();
		}
		return _enforcerCat1;
	}
	
	static void deleteInstance() {
		if(_enforcerCat1 != 0) {
			delete _enforcerCat1;
		}
	}
	
	// connections parameter
	struct connections_struct
	{
		// component struct
		struct component_struct
		{
			// the name of the component
			std::string name;
			std::string initialComponentMode;
			std::string defaultScheduler;
			bool useLogger;
		} component;
		
		//--- task parameter ---
		struct EnforcementManager_struct {
			double minActFreq;
			double maxActFreq;
			std::string trigger;
			// only one of the following two params is 
			// actually used at run-time according 
			// to the system config model
			double periodicActFreq;
			// or
			std::string inPortRef;
			int prescale;
			// scheduling parameters
			std::string scheduler;
			int priority;
			int cpuAffinity;
		} enforcementManager;
		
		//--- upcall parameter ---
		
		//--- server port parameter ---
		struct EnforcementInstruction_Push_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcementInstruction_Push;
		struct EnforcementReply_Send_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcementReply_Send;
		struct EnforcementReport_Send_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcementReport_Send;
	
		//--- client port parameter ---
		struct EnforcementInstruction_Send_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} enforcementInstruction_Send;
		struct Report_QueryRequester_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} report_QueryRequester;
		
	} connections;
};
#endif
