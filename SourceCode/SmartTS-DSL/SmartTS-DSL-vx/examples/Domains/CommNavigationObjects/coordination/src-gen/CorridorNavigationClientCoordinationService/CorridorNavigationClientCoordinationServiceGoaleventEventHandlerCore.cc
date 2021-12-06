#include "CorridorNavigationClientCoordinationServiceGoaleventEventHandlerCore.hh"
#include "runTimeInterface.hh"
#include <cstdio>
#include <iostream>

CorridorNavigationClientCoordinationServiceGoaleventEventHandlerCore::CorridorNavigationClientCoordinationServiceGoaleventEventHandlerCore(Smart::IEventClientPattern<CommNavigationObjects::CommCorridorNavigationGoalEventParameter, CommNavigationObjects::CommCorridorNavigationGoalEventResult> *client, std::string ciInstanceName)
: Smart::IEventHandler<CommNavigationObjects::CommCorridorNavigationGoalEventResult>(client)
{
	this->ciInstanceName = ciInstanceName;
}
		
void CorridorNavigationClientCoordinationServiceGoaleventEventHandlerCore::handleEvent(const Smart::EventIdPtr &id, const CommNavigationObjects::CommCorridorNavigationGoalEventResult &r) {
	std::cout<<"Event CORE Called!"<<std::endl;
	std::string resultString;
	resultString = userHandler.handleEvent(r);
	
	std::ostringstream eventResult;
	eventResult<< "(";
	eventResult<< "( coordination-interfaces-type . \"CorridorNavigationClientCoordinationService\")";
	eventResult<< "( coordination-interface-instance . \""<<this->ciInstanceName<<"\")";
	eventResult<< "( service-name . \"goalevent\")";
	eventResult<< "( id . "<<id<<")";
	eventResult<< "( data . \""<<resultString<<"\")";
	eventResult<< ")";
//	eventResult<<"((\"CorridorNavigationClientCoordinationService\" "<<this->ciInstanceName<<" \"goalevent\" "<<id<<") "<<resultString<<")";
	int result = appedEvent(eventResult.str());
}

CommNavigationObjects::CommCorridorNavigationGoalEventParameter CorridorNavigationClientCoordinationServiceGoaleventEventHandlerCore::activateEventParam(const std::string& parameterString){
	std::cout<<"Activate Event Parameter string: "<<parameterString<<std::endl;
	return userHandler.activateEventParam(parameterString);
}
