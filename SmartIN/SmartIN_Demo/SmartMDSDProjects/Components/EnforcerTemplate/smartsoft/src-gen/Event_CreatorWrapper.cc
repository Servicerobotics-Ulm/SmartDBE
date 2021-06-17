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

// include wrapper header
#include "Event_CreatorWrapper.hh"

// include component's main class
#include "EnforcerTemplate.hh"

// other extensin includes

Event_CreatorWrapper::Event_CreatorWrapper(Smart::IEventServerPattern<SmartInstitutionsServiceRepository::SmartIN_Command, SmartInstitutionsServiceRepository::SmartIN_EventType, CommBasicObjects::CommTaskEventState> *event_Creator) {
	this->event_Creator = event_Creator;
	update_status = Smart::SMART_NODATA;
}

Event_CreatorWrapper::~Event_CreatorWrapper() {
}


Smart::StatusCode Event_CreatorWrapper::put(CommBasicObjects::CommTaskEventState &eventState) {
	std::unique_lock<std::mutex> lock(update_mutex);
	updateEventState = eventState;
	update_status = event_Creator->put(eventState);
	return update_status;
}

Smart::StatusCode Event_CreatorWrapper::getLatestUpdate(CommBasicObjects::CommTaskEventState &eventState) {
	std::unique_lock<std::mutex> lock(update_mutex);
	eventState = updateEventState;
	return update_status;
}
