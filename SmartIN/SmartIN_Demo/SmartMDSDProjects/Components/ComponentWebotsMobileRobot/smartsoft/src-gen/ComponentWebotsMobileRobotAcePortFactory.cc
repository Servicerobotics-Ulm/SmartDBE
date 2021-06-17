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

#include "ComponentWebotsMobileRobotAcePortFactory.hh"

// create a static instance of the default AcePortFactory
static ComponentWebotsMobileRobotAcePortFactory acePortFactory;

ComponentWebotsMobileRobotAcePortFactory::ComponentWebotsMobileRobotAcePortFactory()
{  
	componentImpl = 0;
	ComponentWebotsMobileRobot::instance()->addPortFactory("ACE_SmartSoft", this);
}

ComponentWebotsMobileRobotAcePortFactory::~ComponentWebotsMobileRobotAcePortFactory()
{  }

void ComponentWebotsMobileRobotAcePortFactory::initialize(ComponentWebotsMobileRobot *component, int argc, char* argv[])
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
		componentImpl = new ComponentWebotsMobileRobotImpl(component->connections.component.name, argc, argv, sched_params);
	} else {
		// create new instance of the SmartSoft component
		componentImpl = new ComponentWebotsMobileRobotImpl(component->connections.component.name, argc, argv);
	}
}

int ComponentWebotsMobileRobotAcePortFactory::onStartup()
{
	return componentImpl->startComponentInfrastructure();
}

Smart::IEventClientPattern<CommLocalizationObjects::CommLocalizationEventParameter, CommLocalizationObjects::CommLocalizationEventResult> * ComponentWebotsMobileRobotAcePortFactory::createLocalizationEventServiceIn()
{
	return new SmartACE::EventClient<CommLocalizationObjects::CommLocalizationEventParameter, CommLocalizationObjects::CommLocalizationEventResult>(componentImpl);
}


Smart::IQueryServerPattern<CommBasicObjects::CommVoid, CommBasicObjects::CommBaseState> * ComponentWebotsMobileRobotAcePortFactory::createBaseStateQueryServiceAnsw(const std::string &serviceName)
{
	return new SmartACE::QueryServer<CommBasicObjects::CommVoid, CommBasicObjects::CommBaseState>(componentImpl, serviceName);
}

Smart::IPushServerPattern<CommBasicObjects::CommBaseState> * ComponentWebotsMobileRobotAcePortFactory::createBaseStateServiceOut(const std::string &serviceName)
{
	return new SmartACE::PushServer<CommBasicObjects::CommBaseState>(componentImpl, serviceName);
}

Smart::ISendServerPattern<CommBasicObjects::CommBasePositionUpdate> * ComponentWebotsMobileRobotAcePortFactory::createLocalizationUpdateServiceIn(const std::string &serviceName)
{
	return new SmartACE::SendServer<CommBasicObjects::CommBasePositionUpdate>(componentImpl, serviceName);
}

Smart::ISendServerPattern<CommBasicObjects::CommNavigationVelocity> * ComponentWebotsMobileRobotAcePortFactory::createNavigationVelocityServiceIn(const std::string &serviceName)
{
	return new SmartACE::SendServer<CommBasicObjects::CommNavigationVelocity>(componentImpl, serviceName);
}


SmartACE::SmartComponent* ComponentWebotsMobileRobotAcePortFactory::getComponentImpl()
{
	return componentImpl;
}

int ComponentWebotsMobileRobotAcePortFactory::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
{
	componentImpl->stopComponentInfrastructure(timeoutTime);
	return 0;
}

void ComponentWebotsMobileRobotAcePortFactory::destroy()
{
	// clean-up component's internally used resources (internally used communication middleware) 
	componentImpl->cleanUpComponentResources();
	delete componentImpl;
}