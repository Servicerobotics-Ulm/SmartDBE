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
#ifndef _COMPONENTWEBOTSMOBILEROBOT_HH
#define _COMPONENTWEBOTSMOBILEROBOT_HH

#include <map>
#include <iostream>
#include "aceSmartSoft.hh"
#include "smartQueryServerTaskTrigger_T.h"
#include "ComponentWebotsMobileRobotCore.hh"

#include "ComponentWebotsMobileRobotPortFactoryInterface.hh"
#include "ComponentWebotsMobileRobotExtension.hh"

// forward declarations
class ComponentWebotsMobileRobotPortFactoryInterface;
class ComponentWebotsMobileRobotExtension;

// includes for PlainOpcUaComponentWebotsMobileRobotExtension
// include plain OPC UA device clients
// include plain OPC UA status servers


// include communication objects
#include <CommBasicObjects/CommBasePositionUpdate.hh>
#include <CommBasicObjects/CommBasePositionUpdateACE.hh>
#include <CommBasicObjects/CommBaseState.hh>
#include <CommBasicObjects/CommBaseStateACE.hh>
#include <CommLocalizationObjects/CommLocalizationEventParameter.hh>
#include <CommLocalizationObjects/CommLocalizationEventParameterACE.hh>
#include <CommLocalizationObjects/CommLocalizationEventResult.hh>
#include <CommLocalizationObjects/CommLocalizationEventResultACE.hh>
#include <CommBasicObjects/CommNavigationVelocity.hh>
#include <CommBasicObjects/CommNavigationVelocityACE.hh>
#include <CommBasicObjects/CommVoid.hh>
#include <CommBasicObjects/CommVoidACE.hh>
#include <CommLocalizationObjects/LocalizationEventState.hh>
#include <CommLocalizationObjects/LocalizationEventStateACE.hh>

// include tasks
#include "WebotsAPITask.hh"
// include UpcallManagers and InputCollectors
#include "LocalizationEventServiceInUpcallManager.hh"
#include "LocalizationEventServiceInInputCollector.hh"
#include "LocalizationUpdateServiceInUpcallManager.hh"
#include "LocalizationUpdateServiceInInputCollector.hh"
#include "NavigationVelocityServiceInUpcallManager.hh"
#include "NavigationVelocityServiceInInputCollector.hh"

// include input-handler(s)
#include "LocalizationEventServiceInHandler.hh"
#include "LocalizationUpdateServiceInHandler.hh"
#include "NavigationVelocityServiceInHandler.hh"
// include request-handler(s)
#include "BaseStateQueryServiceAnswHandler.hh"
// output port wrappers
#include "BaseStateServiceOutWrapper.hh"

// include handler
#include "CompHandler.hh"

#include "ParameterStateStruct.hh"
#include "ParameterUpdateHandler.hh"

#include "SmartStateChangeHandler.hh"

#define COMP ComponentWebotsMobileRobot::instance()

class ComponentWebotsMobileRobot : public ComponentWebotsMobileRobotCore {
private:
	static ComponentWebotsMobileRobot *_componentWebotsMobileRobot;
	
	// constructor
	ComponentWebotsMobileRobot();
	
	// copy-constructor
	ComponentWebotsMobileRobot(const ComponentWebotsMobileRobot& cc);
	
	// destructor
	~ComponentWebotsMobileRobot() { };
	
	// load parameter from ini file
	void loadParameter(int argc, char* argv[]);
	
	// instantiate comp-handler
	CompHandler compHandler;
	
	// helper method that maps a string-name to an according TaskTriggerSubject
	Smart::TaskTriggerSubject* getInputTaskTriggerFromString(const std::string &client);
	
	// internal map storing the different port-creation factories (that internally map to specific middleware implementations)
	std::map<std::string, ComponentWebotsMobileRobotPortFactoryInterface*> portFactoryRegistry;
	
	// internal map storing various extensions of this component class
	std::map<std::string, ComponentWebotsMobileRobotExtension*> componentExtensionRegistry;
	
public:
	ParameterStateStruct getGlobalState() const
	{
		return paramHandler.getGlobalState();
	}
	
	ParameterStateStruct getParameters() const
	{
		return paramHandler.getGlobalState();
	}
	
	// define tasks
	Smart::TaskTriggerSubject* webotsAPITaskTrigger;
	WebotsAPITask *webotsAPITask;
	
	// define input-ports
	// InputPort LocalizationEventServiceIn
	Smart::IEventClientPattern<CommLocalizationObjects::CommLocalizationEventParameter, CommLocalizationObjects::CommLocalizationEventResult> *localizationEventServiceIn;
	Smart::InputTaskTrigger<Smart::EventInputType<CommLocalizationObjects::CommLocalizationEventResult>> *localizationEventServiceInInputTaskTrigger;
	LocalizationEventServiceInUpcallManager *localizationEventServiceInUpcallManager;
	LocalizationEventServiceInInputCollector *localizationEventServiceInInputCollector;
	// InputPort LocalizationUpdateServiceIn
	Smart::ISendServerPattern<CommBasicObjects::CommBasePositionUpdate> *localizationUpdateServiceIn;
	Smart::InputTaskTrigger<CommBasicObjects::CommBasePositionUpdate> *localizationUpdateServiceInInputTaskTrigger;
	LocalizationUpdateServiceInUpcallManager *localizationUpdateServiceInUpcallManager;
	LocalizationUpdateServiceInInputCollector *localizationUpdateServiceInInputCollector;
	// InputPort NavigationVelocityServiceIn
	Smart::ISendServerPattern<CommBasicObjects::CommNavigationVelocity> *navigationVelocityServiceIn;
	Smart::InputTaskTrigger<CommBasicObjects::CommNavigationVelocity> *navigationVelocityServiceInInputTaskTrigger;
	NavigationVelocityServiceInUpcallManager *navigationVelocityServiceInUpcallManager;
	NavigationVelocityServiceInInputCollector *navigationVelocityServiceInInputCollector;
	
	// define request-ports
	
	// define input-handler
	LocalizationEventServiceInHandler *localizationEventServiceInHandler;
	LocalizationUpdateServiceInHandler *localizationUpdateServiceInHandler;
	NavigationVelocityServiceInHandler *navigationVelocityServiceInHandler;
	
	// define output-ports
	Smart::IPushServerPattern<CommBasicObjects::CommBaseState> *baseStateServiceOut;
	BaseStateServiceOutWrapper *baseStateServiceOutWrapper;
	
	// define answer-ports
	Smart::IQueryServerPattern<CommBasicObjects::CommVoid, CommBasicObjects::CommBaseState> *baseStateQueryServiceAnsw;
	Smart::QueryServerTaskTrigger<CommBasicObjects::CommVoid, CommBasicObjects::CommBaseState> *baseStateQueryServiceAnswInputTaskTrigger;
	
	// define request-handlers
	BaseStateQueryServiceAnswHandler *baseStateQueryServiceAnswHandler;
	
	
	// define default slave ports
	SmartACE::StateSlave *stateSlave;
	SmartStateChangeHandler *stateChangeHandler;
	SmartACE::WiringSlave *wiringSlave;
	ParamUpdateHandler paramHandler;
	SmartACE::ParameterSlave *param;
	
	
	/// this method is used to register different PortFactory classes (one for each supported middleware framework)
	void addPortFactory(const std::string &name, ComponentWebotsMobileRobotPortFactoryInterface *portFactory);
	
	SmartACE::SmartComponent* getComponentImpl();
	
	/// this method is used to register different component-extension classes
	void addExtension(ComponentWebotsMobileRobotExtension *extension);
	
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
	
	Smart::StatusCode connectLocalizationEventServiceIn(const std::string &serverName, const std::string &serviceName);

	// return singleton instance
	static ComponentWebotsMobileRobot* instance()
	{
		if(_componentWebotsMobileRobot == 0) {
			_componentWebotsMobileRobot = new ComponentWebotsMobileRobot();
		}
		return _componentWebotsMobileRobot;
	}
	
	static void deleteInstance() {
		if(_componentWebotsMobileRobot != 0) {
			delete _componentWebotsMobileRobot;
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
		struct WebotsAPITask_struct {
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
		} webotsAPITask;
		
		//--- upcall parameter ---
		struct LocalizationEventServiceInHandler_struct {
			int prescale;
		} localizationEventServiceInHandler;
		struct LocalizationUpdateServiceInHandler_struct {
			int prescale;
		} localizationUpdateServiceInHandler;
		struct NavigationVelocityServiceInHandler_struct {
			int prescale;
		} navigationVelocityServiceInHandler;
		
		//--- server port parameter ---
		struct BaseStateQueryServiceAnsw_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} baseStateQueryServiceAnsw;
		struct BaseStateServiceOut_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} baseStateServiceOut;
		struct LocalizationUpdateServiceIn_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} localizationUpdateServiceIn;
		struct NavigationVelocityServiceIn_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} navigationVelocityServiceIn;
	
		//--- client port parameter ---
		struct LocalizationEventServiceIn_struct {
			bool initialConnect;
			std::string serverName;
			std::string serviceName;
			std::string wiringName;
			long interval;
			std::string roboticMiddleware;
		} localizationEventServiceIn;
		
	} connections;
};
#endif