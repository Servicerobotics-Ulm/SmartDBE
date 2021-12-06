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

#include "ComponentAAcePortFactory.hh"

// create a static instance of the default AcePortFactory
static ComponentAAcePortFactory acePortFactory;

ComponentAAcePortFactory::ComponentAAcePortFactory()
{  
	componentImpl = 0;
	ComponentA::instance()->addPortFactory("ACE_SmartSoft", this);
}

ComponentAAcePortFactory::~ComponentAAcePortFactory()
{  }

void ComponentAAcePortFactory::initialize(ComponentA *component, int argc, char* argv[])
{
	if(component->connections.component.defaultScheduler != "DEFAULT") {
		ACE_Sched_Params sched_params(ACE_SCHED_OTHER, ACE_THR_PRI_OTHER_DEF);
		if(component->connections.component.defaultScheduler == "FIFO") {
			sched_params.policy(ACE_SCHED_FIFO);
			sched_params.priority(ACE_THR_PRI_FIFO_MIN);
		} else if(component->connections.component.defaultScheduler == "RR") {
			sched_params.policy(ACE_SCHED_RR);
			sched_params.priority(ACE_THR_PRI_RR_MIN);
		}
		// create new instance of the SmartSoft component with customized scheuling parameters 
		componentImpl = new ComponentAImpl(component->connections.component.name, argc, argv, sched_params);
	} else {
		// create new instance of the SmartSoft component
		componentImpl = new ComponentAImpl(component->connections.component.name, argc, argv);
	}
}

int ComponentAAcePortFactory::onStartup()
{
	return componentImpl->startComponentInfrastructure();
}


Smart::IPushServerPattern<DomainTSDemo::Coordinate3D> * ComponentAAcePortFactory::createPush_Coordinate3D_Output_Port(const std::string &serviceName)
{
	return new SmartACE::PushServer<DomainTSDemo::Coordinate3D>(componentImpl, serviceName);
}

Smart::IQueryServerPattern<DomainTSDemo::Coordinate2D, DomainTSDemo::BasicBoolean> * ComponentAAcePortFactory::createQuery_ValidCoordinate2D_Answer_Port(const std::string &serviceName)
{
	return new SmartACE::QueryServer<DomainTSDemo::Coordinate2D, DomainTSDemo::BasicBoolean>(componentImpl, serviceName);
}


SmartACE::SmartComponent* ComponentAAcePortFactory::getComponentImpl()
{
	return componentImpl;
}

int ComponentAAcePortFactory::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
{
	componentImpl->stopComponentInfrastructure(timeoutTime);
	return 0;
}

void ComponentAAcePortFactory::destroy()
{
	// clean-up component's internally used resources (internally used communication middleware) 
	componentImpl->cleanUpComponentResources();
	delete componentImpl;
}
