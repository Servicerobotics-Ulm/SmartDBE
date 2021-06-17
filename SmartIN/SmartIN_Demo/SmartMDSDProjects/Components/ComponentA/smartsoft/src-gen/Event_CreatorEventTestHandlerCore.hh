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
#ifndef _EVENT_CREATOR_EVENT_TEST_HANDLER_CORE_HH
#define _EVENT_CREATOR_EVENT_TEST_HANDLER_CORE_HH
		
#include "aceSmartSoft.hh"

#include <CommBasicObjects/CommTaskEventState.hh>
#include <SmartInstitutionsServiceRepository/SmartIN_Command.hh>
#include <SmartInstitutionsServiceRepository/SmartIN_EventType.hh>

class Event_CreatorEventTestHandlerCore : public SmartACE::EventTestHandler<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState>
{
};
#endif
