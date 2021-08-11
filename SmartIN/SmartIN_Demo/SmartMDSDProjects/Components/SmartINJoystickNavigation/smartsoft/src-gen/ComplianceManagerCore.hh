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
#ifndef _COMPLIANCEMANAGER_CORE_HH
#define _COMPLIANCEMANAGER_CORE_HH
	
#include "aceSmartSoft.hh"

// include upcall interface
#include "EnforcementInstruction_PushUpcallInterface.hh"

// include communication-objects for output ports
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh>

// include all interaction-observer interfaces
#include <ComplianceManagerObserverInterface.hh>


class ComplianceManagerCore
:	public SmartACE::ManagedTask
,	public Smart::TaskTriggerSubject
,	public EnforcementInstruction_PushUpcallInterface
{
private:
	bool useDefaultState; 
	bool useLogging;
	int taskLoggingId;
	unsigned int currentUpdateCount;
	
	Smart::StatusCode enforcementInstruction_PushStatus;
	SmartInstitutionsServiceRepository::EnforcementInstructionPackage enforcementInstruction_PushObject;
	
	
protected:
	virtual int execute_protected_region();
	
	virtual void updateAllCommObjects();
	
	virtual int getPreviousCommObjId();
	
	void triggerLogEntry(const int& idOffset);
	
	
	// overload and implement this method in derived classes to immediately get all incoming updates from EnforcementInstruction_Push (as soon as they arrive)
	virtual void on_EnforcementInstruction_Push(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode enforcementInstruction_PushGetUpdate(SmartInstitutionsServiceRepository::EnforcementInstructionPackage &enforcementInstruction_PushObject) const
	{
		// copy local object buffer and return the last status code
		enforcementInstruction_PushObject = this->enforcementInstruction_PushObject;
		return enforcementInstruction_PushStatus;
	}
	
	// this method is meant to be used in derived classes
	Smart::StatusCode enforcementReply_SendPut(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_SendDataObject);
	
	
/**
 * Implementation of the Subject part of an InteractionObserver
 */
private:
	std::mutex interaction_observers_mutex;
	std::list<ComplianceManagerObserverInterface*> interaction_observers;
protected:
	void notify_all_interaction_observers();
public:
	void attach_interaction_observer(ComplianceManagerObserverInterface *observer);
	void detach_interaction_observer(ComplianceManagerObserverInterface *observer);

public:
	ComplianceManagerCore(Smart::IComponent *comp, const bool &useDefaultState=true);
	virtual ~ComplianceManagerCore();
	
	inline void setUpLogging(const int &taskNbr, const bool &useLogging=true) {
		this->taskLoggingId = taskNbr;
		this->useLogging = useLogging;
	}
	
	inline bool isLoggingActive() const {
		return useLogging;
	}
	
	inline int getLoggingID() const {
		return taskLoggingId;
	}
	
	inline int getCurrentUpdateCount() const {
		return currentUpdateCount;
	}
	
};
#endif