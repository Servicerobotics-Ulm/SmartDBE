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
#include <DomainTSDemo/BasicBoolean.hh>
#include <DomainTSDemo/BasicBooleanACE.hh>
#include <DomainTSDemo/Coordinate2D.hh>
#include <DomainTSDemo/Coordinate2DACE.hh>
#include <DomainTSDemo/Coordinate3D.hh>
#include <DomainTSDemo/Coordinate3DACE.hh>

// include tasks
#include "MainA.hh"
// include UpcallManagers

// include input-handler(s)
// include request-handler(s)
#include "QueryValidCoordinate2DAnswHandler.hh"

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
	Smart::TaskTriggerSubject* mainATrigger;
	MainA *mainA;
	
	// define input-ports
	
	// define request-ports
	
	// define input-handler
	
	// define output-ports
	Smart::IPushServerPattern<DomainTSDemo::Coordinate3D> *push_Coordinate3D_Output_Port;
	
	// define answer-ports
	Smart::IQueryServerPattern<DomainTSDemo::Coordinate2D, DomainTSDemo::BasicBoolean> *query_ValidCoordinate2D_Answer_Port;
	Smart::QueryServerTaskTrigger<DomainTSDemo::Coordinate2D, DomainTSDemo::BasicBoolean> *query_ValidCoordinate2D_Answer_PortInputTaskTrigger;
	
	// define request-handlers
	QueryValidCoordinate2DAnswHandler *queryValidCoordinate2DAnswHandler;
	
	// definitions of PlainOpcUaComponentAExtension
	
	
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
		struct MainA_struct {
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
		} mainA;
		
		//--- upcall parameter ---
		
		//--- server port parameter ---
		struct Push_Coordinate3D_Output_Port_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} push_Coordinate3D_Output_Port;
		struct Query_ValidCoordinate2D_Answer_Port_struct {
				std::string serviceName;
				std::string roboticMiddleware;
		} query_ValidCoordinate2D_Answer_Port;
	
		//--- client port parameter ---
		
		// -- parameters for PlainOpcUaComponentAExtension
		
	} connections;
};
#endif
