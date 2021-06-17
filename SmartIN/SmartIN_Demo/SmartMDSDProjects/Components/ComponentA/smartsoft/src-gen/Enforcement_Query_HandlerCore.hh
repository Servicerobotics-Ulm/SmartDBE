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
#ifndef _ENFORCEMENT_QUERY_HANDLER_CORE_HH
#define _ENFORCEMENT_QUERY_HANDLER_CORE_HH
		
#include "aceSmartSoft.hh"

#include <SmartInstitutions_ServiceRepository/EnforcementInstructionPackage.hh>
#include <SmartInstitutions_ServiceRepository/EnforcementReplyPackage.hh>

// include the input interfaces (if any)

// include all interaction-observer interfaces
#include <Enforcement_Query_HandlerObserverInterface.hh>

class Enforcement_Query_HandlerCore 
:	public Smart::IInputHandler<std::pair<Smart::QueryIdPtr,SmartInstitutions_ServiceRepository::EnforcementInstructionPackage>>
,	public Smart::TaskTriggerSubject
{
private:
virtual void handle_input(const std::pair<Smart::QueryIdPtr,SmartInstitutions_ServiceRepository::EnforcementInstructionPackage> &input) override {
	this->handleQuery(input.first, input.second);
}


	virtual void updateAllCommObjects();

/**
 * Implementation of the Subject part of an InteractionObserver
 */
private:
	std::mutex interaction_observers_mutex;
	std::list<Enforcement_Query_HandlerObserverInterface*> interaction_observers;
protected:
	void notify_all_interaction_observers();
public:
	void attach_interaction_observer(Enforcement_Query_HandlerObserverInterface *observer);
	void detach_interaction_observer(Enforcement_Query_HandlerObserverInterface *observer);

protected:
	
public:
	using IQueryServer = Smart::IQueryServerPattern<SmartInstitutions_ServiceRepository::EnforcementInstructionPackage, SmartInstitutions_ServiceRepository::EnforcementReplyPackage>;
	using QueryId = Smart::QueryIdPtr;
	Enforcement_Query_HandlerCore(IQueryServer *server);
	virtual ~Enforcement_Query_HandlerCore() = default;
	
protected:
	IQueryServer *server;
	//this user-method has to be implemented in derived classes
	virtual void handleQuery(const QueryId &id, const SmartInstitutions_ServiceRepository::EnforcementInstructionPackage& request) = 0;
};
#endif
