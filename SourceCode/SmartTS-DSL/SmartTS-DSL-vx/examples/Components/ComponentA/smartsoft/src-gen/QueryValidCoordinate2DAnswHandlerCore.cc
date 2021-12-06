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
#include "QueryValidCoordinate2DAnswHandlerCore.hh"
#include "QueryValidCoordinate2DAnswHandler.hh"

// include observers

QueryValidCoordinate2DAnswHandlerCore::QueryValidCoordinate2DAnswHandlerCore(IQueryServer* server)
:	Smart::IInputHandler<std::pair<Smart::QueryIdPtr,DomainTSDemo::Coordinate2D>>(server)
,	server(server)
{
	
}

void QueryValidCoordinate2DAnswHandlerCore::updateAllCommObjects()
{
}

void QueryValidCoordinate2DAnswHandlerCore::notify_all_interaction_observers() {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	// try dynamically down-casting this class to the derived class 
	// (we can do it safely here as we exactly know the derived class)
	if(const QueryValidCoordinate2DAnswHandler* queryValidCoordinate2DAnswHandler = dynamic_cast<const QueryValidCoordinate2DAnswHandler*>(this)) {
		for(auto it=interaction_observers.begin(); it!=interaction_observers.end(); it++) {
			(*it)->on_update_from(queryValidCoordinate2DAnswHandler);
		}
	}
}

void QueryValidCoordinate2DAnswHandlerCore::attach_interaction_observer(QueryValidCoordinate2DAnswHandlerObserverInterface *observer) {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	interaction_observers.push_back(observer);
}

void QueryValidCoordinate2DAnswHandlerCore::detach_interaction_observer(QueryValidCoordinate2DAnswHandlerObserverInterface *observer) {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	interaction_observers.remove(observer);
}