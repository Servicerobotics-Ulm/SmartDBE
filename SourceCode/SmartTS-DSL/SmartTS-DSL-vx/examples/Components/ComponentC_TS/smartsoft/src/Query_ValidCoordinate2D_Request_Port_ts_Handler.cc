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
// This file is generated once. Modify this file to your needs. 
// If you want the toolchain to re-generate this file, please 
// delete it before running the code generator.
//--------------------------------------------------------------------------
#include "Query_ValidCoordinate2D_Request_Port_ts_Handler.hh"
#include "ComponentC_TS.hh"

Query_ValidCoordinate2D_Request_Port_ts_Handler::Query_ValidCoordinate2D_Request_Port_ts_Handler(IQueryServer *server)
:	Query_ValidCoordinate2D_Request_Port_ts_HandlerCore(server)
{
	
}


void Query_ValidCoordinate2D_Request_Port_ts_Handler::handleQuery(const Smart::QueryIdPtr &id, const DomainTSDemo::Coordinate2D& request) 
{
	DomainTSDemo::BasicBoolean answer;
	
	// implement your query handling logic here and fill in the answer object
	
	this->server->answer(id, answer);
}
