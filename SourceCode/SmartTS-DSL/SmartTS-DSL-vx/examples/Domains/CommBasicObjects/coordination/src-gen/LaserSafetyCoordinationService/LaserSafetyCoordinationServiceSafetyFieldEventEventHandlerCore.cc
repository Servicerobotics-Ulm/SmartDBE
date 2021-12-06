#include "LaserSafetyCoordinationServiceSafetyFieldEventEventHandlerCore.hh"
#include "runTimeInterface.hh"
#include <cstdio>
#include <iostream>

LaserSafetyCoordinationServiceSafetyFieldEventEventHandlerCore::LaserSafetyCoordinationServiceSafetyFieldEventEventHandlerCore(Smart::IEventClientPattern<CommBasicObjects::CommLaserSafetyEventParam, CommBasicObjects::CommLaserSafetyField> *client, std::string ciInstanceName)
: Smart::IEventHandler<CommBasicObjects::CommLaserSafetyField>(client)
{
	this->ciInstanceName = ciInstanceName;
}
		
void LaserSafetyCoordinationServiceSafetyFieldEventEventHandlerCore::handleEvent(const Smart::EventIdPtr &id, const CommBasicObjects::CommLaserSafetyField &r) {
	std::cout<<"Event CORE Called!"<<std::endl;
	std::string resultString;
	resultString = userHandler.handleEvent(r);
	
	std::ostringstream eventResult;
	eventResult<< "(";
	eventResult<< "( coordination-interfaces-type . \"LaserSafetyCoordinationService\")";
	eventResult<< "( coordination-interface-instance . \""<<this->ciInstanceName<<"\")";
	eventResult<< "( service-name . \"safetyFieldEvent\")";
	eventResult<< "( id . "<<id<<")";
	eventResult<< "( data . \""<<resultString<<"\")";
	eventResult<< ")";
//	eventResult<<"((\"LaserSafetyCoordinationService\" "<<this->ciInstanceName<<" \"safetyFieldEvent\" "<<id<<") "<<resultString<<")";
	int result = appedEvent(eventResult.str());
}

CommBasicObjects::CommLaserSafetyEventParam LaserSafetyCoordinationServiceSafetyFieldEventEventHandlerCore::activateEventParam(const std::string& parameterString){
	std::cout<<"Activate Event Parameter string: "<<parameterString<<std::endl;
	return userHandler.activateEventParam(parameterString);
}
