#include "Seq2SeqComCoordinationServiceTaskEventEventHandlerCore.hh"
#include "runTimeInterface.hh"
#include <cstdio>
#include <iostream>

Seq2SeqComCoordinationServiceTaskEventEventHandlerCore::Seq2SeqComCoordinationServiceTaskEventEventHandlerCore(Smart::IEventClientPattern<CommBasicObjects::CommTaskMessage, CommBasicObjects::CommTaskMessage> *client, std::string ciInstanceName)
: Smart::IEventHandler<CommBasicObjects::CommTaskMessage>(client)
{
	this->ciInstanceName = ciInstanceName;
}
		
void Seq2SeqComCoordinationServiceTaskEventEventHandlerCore::handleEvent(const Smart::EventIdPtr &id, const CommBasicObjects::CommTaskMessage &r) {
	std::cout<<"Event CORE Called!"<<std::endl;
	std::string resultString;
	resultString = userHandler.handleEvent(r);
	
	std::ostringstream eventResult;
	eventResult<< "(";
	eventResult<< "( coordination-interfaces-type . \"Seq2SeqComCoordinationService\")";
	eventResult<< "( coordination-interface-instance . \""<<this->ciInstanceName<<"\")";
	eventResult<< "( service-name . \"taskEvent\")";
	eventResult<< "( id . "<<id<<")";
	eventResult<< "( data . \""<<resultString<<"\")";
	eventResult<< ")";
//	eventResult<<"((\"Seq2SeqComCoordinationService\" "<<this->ciInstanceName<<" \"taskEvent\" "<<id<<") "<<resultString<<")";
	int result = appedEvent(eventResult.str());
}

CommBasicObjects::CommTaskMessage Seq2SeqComCoordinationServiceTaskEventEventHandlerCore::activateEventParam(const std::string& parameterString){
	std::cout<<"Activate Event Parameter string: "<<parameterString<<std::endl;
	return userHandler.activateEventParam(parameterString);
}
