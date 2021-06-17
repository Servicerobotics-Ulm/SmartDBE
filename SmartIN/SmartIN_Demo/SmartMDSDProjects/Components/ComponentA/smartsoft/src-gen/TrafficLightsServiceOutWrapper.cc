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
#include "TrafficLightsServiceOutWrapper.hh"

// include component's main class
#include "ComponentA.hh"

// other extensin includes

TrafficLightsServiceOutWrapper::TrafficLightsServiceOutWrapper(Smart::IPushServerPattern<CommBasicObjects::CommTrafficLights> *trafficLightsServiceOut) {
	this->trafficLightsServiceOut = trafficLightsServiceOut;
	update_status = Smart::SMART_NODATA;
}

TrafficLightsServiceOutWrapper::~TrafficLightsServiceOutWrapper() {
}


Smart::StatusCode TrafficLightsServiceOutWrapper::put(CommBasicObjects::CommTrafficLights &trafficLightsServiceOutDataObject) {
	std::unique_lock<std::mutex> lock(update_mutex);
	updateData = trafficLightsServiceOutDataObject;
	update_status = trafficLightsServiceOut->put(trafficLightsServiceOutDataObject);
	return update_status;
}

Smart::StatusCode TrafficLightsServiceOutWrapper::getLatestUpdate(CommBasicObjects::CommTrafficLights &trafficLightsServiceOutDataObject) {
	std::unique_lock<std::mutex> lock(update_mutex);
	trafficLightsServiceOutDataObject = updateData;
	return update_status;
}
