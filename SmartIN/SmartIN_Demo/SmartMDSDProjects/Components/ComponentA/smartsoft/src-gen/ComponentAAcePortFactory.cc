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

Smart::IPushClientPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> * ComponentAAcePortFactory::createEnforcementInstruction_Push()
{
	return new SmartACE::PushClient<SmartInstitutionsServiceRepository::EnforcementInstructionPackage>(componentImpl);
}

Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> * ComponentAAcePortFactory::createEnforcementReply_Send()
{
	return new SmartACE::SendClient<SmartInstitutionsServiceRepository::EnforcementReplyPackage>(componentImpl);
}

Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> * ComponentAAcePortFactory::createEnforcementReport_Send()
{
	return new SmartACE::SendClient<SmartInstitutionsServiceRepository::EnforcementReportPackage>(componentImpl);
}

Smart::IEventClientPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType> * ComponentAAcePortFactory::createEvent_Listener()
{
	return new SmartACE::EventClient<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType>(componentImpl);
}


Smart::ISendServerPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> * ComponentAAcePortFactory::createEnforcementInstruction_Send(const std::string &serviceName)
{
	return new SmartACE::SendServer<SmartInstitutionsServiceRepository::EnforcementInstructionPackage>(componentImpl, serviceName);
}

Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> * ComponentAAcePortFactory::createEnforcementReply_Push(const std::string &serviceName)
{
	return new SmartACE::PushServer<SmartInstitutionsServiceRepository::EnforcementReplyPackage>(componentImpl, serviceName);
}

Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> * ComponentAAcePortFactory::createEnforcementReport_Push(const std::string &serviceName)
{
	return new SmartACE::PushServer<SmartInstitutionsServiceRepository::EnforcementReportPackage>(componentImpl, serviceName);
}

Smart::IQueryServerPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage, SmartInstitutionsServiceRepository::EnforcementReplyPackage> * ComponentAAcePortFactory::createEnforcement_QueryResponder(const std::string &serviceName)
{
	return new SmartACE::QueryServer<SmartInstitutionsServiceRepository::EnforcementInstructionPackage, SmartInstitutionsServiceRepository::EnforcementReplyPackage>(componentImpl, serviceName);
}

Smart::IEventServerPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState> * ComponentAAcePortFactory::createEvent_Creator(const std::string &serviceName, std::shared_ptr<Smart::IEventTestHandler<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState>> event_CreatorEventTestHandler)
{
	return new SmartACE::EventServer<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState>(componentImpl, serviceName, event_CreatorEventTestHandler);
}

Smart::IQueryServerPattern<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> * ComponentAAcePortFactory::createReport_QueryResponder(const std::string &serviceName)
{
	return new SmartACE::QueryServer<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage>(componentImpl, serviceName);
}

Smart::IPushServerPattern<CommBasicObjects::CommTrafficLights> * ComponentAAcePortFactory::createTrafficLightsServiceOut(const std::string &serviceName)
{
	return new SmartACE::PushServer<CommBasicObjects::CommTrafficLights>(componentImpl, serviceName);
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
