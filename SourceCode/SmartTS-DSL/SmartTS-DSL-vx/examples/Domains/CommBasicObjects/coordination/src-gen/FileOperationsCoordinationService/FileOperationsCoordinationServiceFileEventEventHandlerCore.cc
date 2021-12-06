#include "FileOperationsCoordinationServiceFileEventEventHandlerCore.hh"
#include "runTimeInterface.hh"
#include <cstdio>
#include <iostream>

FileOperationsCoordinationServiceFileEventEventHandlerCore::FileOperationsCoordinationServiceFileEventEventHandlerCore(Smart::IEventClientPattern<CommBasicObjects::CommFileMoverEventParameter, CommBasicObjects::CommFileMoverEventResult> *client, std::string ciInstanceName)
: Smart::IEventHandler<CommBasicObjects::CommFileMoverEventResult>(client)
{
	this->ciInstanceName = ciInstanceName;
}
		
void FileOperationsCoordinationServiceFileEventEventHandlerCore::handleEvent(const Smart::EventIdPtr &id, const CommBasicObjects::CommFileMoverEventResult &r) {
	std::cout<<"Event CORE Called!"<<std::endl;
	std::string resultString;
	resultString = userHandler.handleEvent(r);
	
	std::ostringstream eventResult;
	eventResult<< "(";
	eventResult<< "( coordination-interfaces-type . \"FileOperationsCoordinationService\")";
	eventResult<< "( coordination-interface-instance . \""<<this->ciInstanceName<<"\")";
	eventResult<< "( service-name . \"fileEvent\")";
	eventResult<< "( id . "<<id<<")";
	eventResult<< "( data . \""<<resultString<<"\")";
	eventResult<< ")";
//	eventResult<<"((\"FileOperationsCoordinationService\" "<<this->ciInstanceName<<" \"fileEvent\" "<<id<<") "<<resultString<<")";
	int result = appedEvent(eventResult.str());
}

CommBasicObjects::CommFileMoverEventParameter FileOperationsCoordinationServiceFileEventEventHandlerCore::activateEventParam(const std::string& parameterString){
	std::cout<<"Activate Event Parameter string: "<<parameterString<<std::endl;
	return userHandler.activateEventParam(parameterString);
}
