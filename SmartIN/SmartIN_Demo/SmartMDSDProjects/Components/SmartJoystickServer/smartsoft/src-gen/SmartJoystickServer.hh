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
#ifndef _SMARTJOYSTICKSERVER_HH
#define _SMARTJOYSTICKSERVER_HH

#include <map>
#include <iostream>
#include "aceSmartSoft.hh"
#include "smartQueryServerTaskTrigger_T.h"
#include "SmartJoystickServerCore.hh"

#include "SmartJoystickServerPortFactoryInterface.hh"
#include "SmartJoystickServerExtension.hh"

// forward declarations
class SmartJoystickServerPortFactoryInterface;
class SmartJoystickServerExtension;

// includes for PlainOpcUaSmartJoystickServerExtension
// include plain OPC UA device clients
// include plain OPC UA status servers


// include communication objects
#include <CommBasicObjects/CommJoystick.hh>
#include <CommBasicObjects/CommJoystickACE.hh>

// include tasks
#include "JoystickTask.hh"
// include UpcallManagers and InputCollectors

// include input-handler(s)
// include request-handler(s)
// output port wrappers
#include "JoystickServcieOutWrapper.hh"

// include handler
#include "CompHandler.hh"

#include "ParameterStateStruct.hh"
#include "ParameterUpdateHandler.hh"

#include "SmartStateChangeHandler.hh"

#define COMP SmartJoystickServer::instance()

class SmartJoystickServer : public SmartJoystickServerCore {
private:
	static SmartJoystickServer *_smartJoystickServer;
	
	// constructor
	SmartJoystickServer();
	
	// copy-constructor
	SmartJoystickServer(const SmartJoystickServer& cc);
	
	// destructor
	~SmartJoystickServer() { };
	
	// load parameter from ini file
	void loadParameter(int argc, char* argv[]);
	
	// instantiate comp-handler
	CompHandler compHandler;
	
	// helper method that maps a string-name to an according TaskTriggerSubject
	Smart::TaskTriggerSubject* getInputTaskTriggerFromString(const std::string &client);
	
	// internal map storing the different port-creation factories (that internally map to specific middleware implementations)
	std::map<std::string, SmartJoystickServerPortFactoryInterface*> portFactoryRegistry;
	
	// internal map storing various extensions of this component class
	std::map<std::string, SmartJoystickServerExtension*> componentExtensionRegistry;
	
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
	Smart::TaskTriggerSubject* joystickTaskTrigger;
	JoystickTask *joystickTask;
	
	// define input-ports
	
	// define request-ports
	
	// define input-handler
	
	// define output-ports
	Smart::IPushServerPattern<CommBasicObjects::CommJoystick> *joystickServcieOut;
	JoystickServcieOutWrapper *joystickServcieOutWrapper;
	
	// define answer-ports
	
	// define request-handlers
	
	
	// define default slave ports
	SmartACE::StateSlave *stateSlave;
	SmartStateChangeHandler *stateChangeHandler;
	SmartACE::WiringSlave *wiringSlave;
	ParamUpdateHandler paramHandler;
	SmartACE::ParameterSlave *param;
	
	
	/// this method is used to register different PortFactory classes (one for each supported middleware framework)
	void addPortFactory(const std::string &name, SmartJoystickServerPortFactoryInterface *portFactory);
	
	SmartACE::SmartComponent* getComponentImpl();
	
	/// this method is used to register different component-extension classes
	void addExtension(SmartJoystickServerExtension *extension);
	
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
	

	// return singleton instance
	static SmartJoystickServer* instance()
	{
		if(_smartJoystickServer == 0) {
			_smartJoystickServer = new SmartJoystickServer();
		}
		return _smartJoystickServer;
	}
	
	static void deleteInstance() {
		if(_smartJoystickServer != 0) {
			delete _smartJoystickServer;
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
		struct JoystickTask_struct {
			// scheduling parameters
			std::string scheduler;
			int priority;
			int cpuAffinity;
		} joystickTask;
		
		//--- upcall parameter ---
		
		//--- server port parameter ---
		struct JoystickServcieOut_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} joystickServcieOut;
	
		//--- client port parameter ---
		
	} connections;
};
#endif
