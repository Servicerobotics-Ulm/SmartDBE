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

#ifndef ENFORCERTEMPLATE_PORTFACTORYINTERFACE_HH_
#define ENFORCERTEMPLATE_PORTFACTORYINTERFACE_HH_

// include communication objects
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

#include <chrono>

// include component's main class
#include "EnforcerTemplate.hh"

// forward declaration
class EnforcerTemplate;

class EnforcerTemplatePortFactoryInterface {
public:
	EnforcerTemplatePortFactoryInterface() { };
	virtual ~EnforcerTemplatePortFactoryInterface() { };

	virtual void initialize(EnforcerTemplate *component, int argc, char* argv[]) = 0;
	virtual int onStartup() = 0;

	virtual Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> * createEnforcementInstruction_Send() = 0;
	virtual Smart::IPushClientPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> * createEnforcementReply_Push() = 0;
	virtual Smart::IPushClientPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> * createEnforcementReport_Push() = 0;
	virtual Smart::IQueryClientPattern<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> * createEnforcement_QueryRequester() = 0;
	virtual Smart::IEventClientPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType> * createEvent_Listener() = 0;
	virtual Smart::IQueryClientPattern<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> * createReport_QueryRequester() = 0;
	
	virtual Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> * createEnforcementInstruction_Push(const std::string &serviceName) = 0;
	virtual Smart::ISendServerPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> * createEnforcementReply_Send(const std::string &serviceName) = 0;
	virtual Smart::ISendServerPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> * createEnforcementReport_Send(const std::string &serviceName) = 0;
	virtual Smart::IEventServerPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState> * createEvent_Creator(const std::string &serviceName, std::shared_ptr<Smart::IEventTestHandler<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState>> event_CreatorEventTestHandler) = 0;

	virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) = 0;
	virtual void destroy() = 0;
};

#endif /* ENFORCERTEMPLATE_PORTFACTORYINTERFACE_HH_ */
