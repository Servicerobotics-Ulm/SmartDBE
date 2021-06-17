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
#ifndef _COMPONENTA_HH
#define _COMPONENTA_HH

#include <map>
#include <iostream>
#include "aceSmartSoft.hh"
#include "smartQueryServerTaskTrigger_T.h"
#include "ComponentACore.hh"

#include "ComponentAPortFactoryInterface.hh"
#include "ComponentAExtension.hh"

// forward declarations
class ComponentAPortFactoryInterface;
class ComponentAExtension;

// includes for PlainOpcUaComponentAExtension
// include plain OPC UA device clients
// include plain OPC UA status servers


// include communication objects
#include <CommBasicObjects/CommBaseState.hh>
#include <CommBasicObjects/CommBaseStateACE.hh>
#include <CommBasicObjects/CommTaskEventState.hh>
#include <CommBasicObjects/CommTaskEventStateACE.hh>
#include <SmartInstitutionsServiceRepository/EnforcementInstructionPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementInstructionPackageACE.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackageACE.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReportPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReportPackageACE.hh>
#include <SmartInstitutionsServiceRepository/MemberIdentifier.hh>
#include <SmartInstitutionsServiceRepository/MemberIdentifierACE.hh>
#include <SmartInstitutionsServiceRepository/SmartIN_Command.hh>
#include <SmartInstitutionsServiceRepository/SmartIN_CommandACE.hh>
#include <SmartInstitutionsServiceRepository/SmartIN_EventType.hh>
#include <SmartInstitutionsServiceRepository/SmartIN_EventTypeACE.hh>

// include tasks
#include "ComplianceManager.hh"
#include "ComponentActivity.hh"
#include "EventManager.hh"
// include UpcallManagers and InputCollectors
#include "EnforcementInstruction_PushUpcallManager.hh"
#include "EnforcementInstruction_PushInputCollector.hh"
#include "EnforcementInstruction_SendUpcallManager.hh"
#include "EnforcementInstruction_SendInputCollector.hh"
#include "Event_ListenerUpcallManager.hh"
#include "Event_ListenerInputCollector.hh"

// include input-handler(s)
// include request-handler(s)
#include "Enforcement_Query_Handler.hh"
#include "Report_Query_Handler.hh"
// output port wrappers
#include "Event_CreatorWrapper.hh"
#include "EnforcementReport_PushWrapper.hh"
#include "EnforcementReply_PushWrapper.hh"
#include "EnforcementReport_SendWrapper.hh"
#include "EnforcementReply_SendWrapper.hh"
#include "BaseStateServiceOutWrapper.hh"

// include handler
#include "CompHandler.hh"


#include "SmartStateChangeHandler.hh"

#define COMP ComponentA::instance()

class ComponentA : public ComponentACore {
private:
	static ComponentA *_componentA;
	
	// constructor
	ComponentA();
	
	// copy-constructor
	ComponentA(const ComponentA& cc);
	
	// destructor
	~ComponentA() { };
	
	// load parameter from ini file
	void loadParameter(int argc, char* argv[]);
	
	// instantiate comp-handler
	CompHandler compHandler;
	
	// helper method that maps a string-name to an according TaskTriggerSubject
	Smart::TaskTriggerSubject* getInputTaskTriggerFromString(const std::string &client);
	
	// internal map storing the different port-creation factories (that internally map to specific middleware implementations)
	std::map<std::string, ComponentAPortFactoryInterface*> portFactoryRegistry;
	
	// internal map storing various extensions of this component class
	std::map<std::string, ComponentAExtension*> componentExtensionRegistry;
	
public:
	
	// define tasks
	Smart::TaskTriggerSubject* complianceManagerTrigger;
	ComplianceManager *complianceManager;
	Smart::TaskTriggerSubject* componentActivityTrigger;
	ComponentActivity *componentActivity;
	Smart::TaskTriggerSubject* eventManagerTrigger;
	EventManager *eventManager;
	
	// define input-ports
	// InputPort EnforcementInstruction_Push
	Smart::IPushClientPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *enforcementInstruction_Push;
	Smart::InputTaskTrigger<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *enforcementInstruction_PushInputTaskTrigger;
	EnforcementInstruction_PushUpcallManager *enforcementInstruction_PushUpcallManager;
	EnforcementInstruction_PushInputCollector *enforcementInstruction_PushInputCollector;
	// InputPort EnforcementInstruction_Send
	Smart::ISendServerPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *enforcementInstruction_Send;
	Smart::InputTaskTrigger<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *enforcementInstruction_SendInputTaskTrigger;
	EnforcementInstruction_SendUpcallManager *enforcementInstruction_SendUpcallManager;
	EnforcementInstruction_SendInputCollector *enforcementInstruction_SendInputCollector;
	// InputPort Event_Listener
	Smart::IEventClientPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType> *event_Listener;
	Smart::InputTaskTrigger<Smart::EventInputType<SmartInstitutionsServiceRepository::SmartIN_EventType>> *event_ListenerInputTaskTrigger;
	Event_ListenerUpcallManager *event_ListenerUpcallManager;
	Event_ListenerInputCollector *event_ListenerInputCollector;
	
	// define request-ports
	
	// define input-handler
	
	// define output-ports
	Smart::IPushServerPattern<CommBasicObjects::CommBaseState> *baseStateServiceOut;
	BaseStateServiceOutWrapper *baseStateServiceOutWrapper;
	Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Push;
	EnforcementReply_PushWrapper *enforcementReply_PushWrapper;
	Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Send;
	EnforcementReply_SendWrapper *enforcementReply_SendWrapper;
	Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> *enforcementReport_Push;
	EnforcementReport_PushWrapper *enforcementReport_PushWrapper;
	Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> *enforcementReport_Send;
	EnforcementReport_SendWrapper *enforcementReport_SendWrapper;
	Smart::IEventServerPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState> *event_Creator;
	Event_CreatorWrapper *event_CreatorWrapper;
	std::shared_ptr<Smart::IEventTestHandler<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState>> event_CreatorEventTestHandler;
	
	// define answer-ports
	Smart::IQueryServerPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage, SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcement_QueryResponder;
	Smart::QueryServerTaskTrigger<SmartInstitutionsServiceRepository::EnforcementInstructionPackage, SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcement_QueryResponderInputTaskTrigger;
	Smart::IQueryServerPattern<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> *report_QueryResponder;
	Smart::QueryServerTaskTrigger<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> *report_QueryResponderInputTaskTrigger;
	
	// define request-handlers
	Enforcement_Query_Handler *enforcement_Query_Handler;
	Report_Query_Handler *report_Query_Handler;
	
	
	// define default slave ports
	SmartACE::StateSlave *stateSlave;
	SmartStateChangeHandler *stateChangeHandler;
	SmartACE::WiringSlave *wiringSlave;
	
	
	/// this method is used to register different PortFactory classes (one for each supported middleware framework)
	void addPortFactory(const std::string &name, ComponentAPortFactoryInterface *portFactory);
	
	SmartACE::SmartComponent* getComponentImpl();
	
	/// this method is used to register different component-extension classes
	void addExtension(ComponentAExtension *extension);
	
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
	
	Smart::StatusCode connectEnforcementInstruction_Push(const std::string &serverName, const std::string &serviceName);
	Smart::StatusCode connectEnforcementReply_Send(const std::string &serverName, const std::string &serviceName);
	Smart::StatusCode connectEnforcementReport_Send(const std::string &serverName, const std::string &serviceName);
	Smart::StatusCode connectEvent_Listener(const std::string &serverName, const std::string &serviceName);

	// return singleton instance
	static ComponentA* instance()
	{
		if(_componentA == 0) {
			_componentA = new ComponentA();
		}
		return _componentA;
	}
	
	static void deleteInstance() {
		if(_componentA != 0) {
			delete _componentA;
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
		struct ComplianceManager_struct {
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
		} complianceManager;
		struct ComponentActivity_struct {
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
		} componentActivity;
		struct EventManager_struct {
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
		} eventManager;
		
		//--- upcall parameter ---
		
		//--- server port parameter ---
		struct BaseStateServiceOut_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} baseStateServiceOut;
		struct EnforcementInstruction_Send_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcementInstruction_Send;
		struct EnforcementReply_Push_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcementReply_Push;
		struct EnforcementReport_Push_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcementReport_Push;
		struct Enforcement_QueryResponder_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} enforcement_QueryResponder;
		struct Event_Creator_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} event_Creator;
		struct Report_QueryResponder_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} report_QueryResponder;
	
		//--- client port parameter ---
		struct EnforcementInstruction_Push_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} enforcementInstruction_Push;
		struct EnforcementReply_Send_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} enforcementReply_Send;
		struct EnforcementReport_Send_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} enforcementReport_Send;
		struct Event_Listener_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} event_Listener;
		
	} connections;
};
#endif
