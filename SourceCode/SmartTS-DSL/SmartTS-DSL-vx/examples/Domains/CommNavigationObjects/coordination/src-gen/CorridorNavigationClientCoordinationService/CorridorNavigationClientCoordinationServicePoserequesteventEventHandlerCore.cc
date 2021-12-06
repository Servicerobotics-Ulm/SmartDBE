#include "CorridorNavigationClientCoordinationServicePoserequesteventEventHandlerCore.hh"
#include "runTimeInterface.hh"
#include <cstdio>
#include <iostream>

CorridorNavigationClientCoordinationServicePoserequesteventEventHandlerCore::CorridorNavigationClientCoordinationServicePoserequesteventEventHandlerCore(Smart::IEventClientPattern<CommNavigationObjects::CommCorridorNavigationPoseRequestEventParameter, CommNavigationObjects::CommCorridorNavigationPoseRequestEventResult> *client, std::string ciInstanceName)
: Smart::IEventHandler<CommNavigationObjects::CommCorridorNavigationPoseRequestEventResult>(client)
{
	this->ciInstanceName = ciInstanceName;
}
		
void CorridorNavigationClientCoordinationServicePoserequesteventEventHandlerCore::handleEvent(const Smart::EventIdPtr &id, const CommNavigationObjects::CommCorridorNavigationPoseRequestEventResult &r) {
	std::cout<<"Event CORE Called!"<<std::endl;
	std::string resultString;
	resultString = userHandler.handleEvent(r);
	
	std::ostringstream eventResult;
	eventResult<< "(";
	eventResult<< "( coordination-interfaces-type . \"CorridorNavigationClientCoordinationService\")";
	eventResult<< "( coordination-interface-instance . \""<<this->ciInstanceName<<"\")";
	eventResult<< "( service-name . \"poserequestevent\")";
	eventResult<< "( id . "<<id<<")";
	eventResult<< "( data . \""<<resultString<<"\")";
	eventResult<< ")";
//	eventResult<<"((\"CorridorNavigationClientCoordinationService\" "<<this->ciInstanceName<<" \"poserequestevent\" "<<id<<") "<<resultString<<")";
	int result = appedEvent(eventResult.str());
}

CommNavigationObjects::CommCorridorNavigationPoseRequestEventParameter CorridorNavigationClientCoordinationServicePoserequesteventEventHandlerCore::activateEventParam(const std::string& parameterString){
	std::cout<<"Activate Event Parameter string: "<<parameterString<<std::endl;
	return userHandler.activateEventParam(parameterString);
}
