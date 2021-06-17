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
#ifndef _ENFORCEMENTMANAGER_CORE_HH
#define _ENFORCEMENTMANAGER_CORE_HH
	
#include "aceSmartSoft.hh"

// include upcall interface
#include "EnforcementReply_PushUpcallInterface.hh"
#include "EnforcementReply_SendUpcallInterface.hh"
#include "EnforcementReport_PushUpcallInterface.hh"
#include "EnforcementReport_SendUpcallInterface.hh"

// include communication-objects for output ports
#include <SmartInstitutionsServiceRepository/EnforcementInstructionPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementInstructionPackage.hh>

// include all interaction-observer interfaces
#include <EnforcementManagerObserverInterface.hh>


class EnforcementManagerCore
:	public SmartACE::ManagedTask
,	public Smart::TaskTriggerSubject
,	public EnforcementReply_PushUpcallInterface
,	public EnforcementReply_SendUpcallInterface
,	public EnforcementReport_PushUpcallInterface
,	public EnforcementReport_SendUpcallInterface
{
private:
	bool useDefaultState; 
	bool useLogging;
	int taskLoggingId;
	unsigned int currentUpdateCount;
	
	Smart::StatusCode enforcementReply_PushStatus;
	SmartInstitutionsServiceRepository::EnforcementReplyPackage enforcementReply_PushObject;
	Smart::StatusCode enforcementReply_SendStatus;
	SmartInstitutionsServiceRepository::EnforcementReplyPackage enforcementReply_SendObject;
	Smart::StatusCode enforcementReport_PushStatus;
	SmartInstitutionsServiceRepository::EnforcementReportPackage enforcementReport_PushObject;
	Smart::StatusCode enforcementReport_SendStatus;
	SmartInstitutionsServiceRepository::EnforcementReportPackage enforcementReport_SendObject;
	
	
protected:
	virtual int execute_protected_region();
	
	virtual void updateAllCommObjects();
	
	virtual int getPreviousCommObjId();
	
	void triggerLogEntry(const int& idOffset);
	
	
	// overload and implement this method in derived classes to immediately get all incoming updates from EnforcementReply_Push (as soon as they arrive)
	virtual void on_EnforcementReply_Push(const SmartInstitutionsServiceRepository::EnforcementReplyPackage &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode enforcementReply_PushGetUpdate(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_PushObject) const
	{
		// copy local object buffer and return the last status code
		enforcementReply_PushObject = this->enforcementReply_PushObject;
		return enforcementReply_PushStatus;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from EnforcementReply_Send (as soon as they arrive)
	virtual void on_EnforcementReply_Send(const SmartInstitutionsServiceRepository::EnforcementReplyPackage &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode enforcementReply_SendGetUpdate(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_SendObject) const
	{
		// copy local object buffer and return the last status code
		enforcementReply_SendObject = this->enforcementReply_SendObject;
		return enforcementReply_SendStatus;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from EnforcementReport_Push (as soon as they arrive)
	virtual void on_EnforcementReport_Push(const SmartInstitutionsServiceRepository::EnforcementReportPackage &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode enforcementReport_PushGetUpdate(SmartInstitutionsServiceRepository::EnforcementReportPackage &enforcementReport_PushObject) const
	{
		// copy local object buffer and return the last status code
		enforcementReport_PushObject = this->enforcementReport_PushObject;
		return enforcementReport_PushStatus;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from EnforcementReport_Send (as soon as they arrive)
	virtual void on_EnforcementReport_Send(const SmartInstitutionsServiceRepository::EnforcementReportPackage &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode enforcementReport_SendGetUpdate(SmartInstitutionsServiceRepository::EnforcementReportPackage &enforcementReport_SendObject) const
	{
		// copy local object buffer and return the last status code
		enforcementReport_SendObject = this->enforcementReport_SendObject;
		return enforcementReport_SendStatus;
	}
	
	// this method is meant to be used in derived classes
	Smart::StatusCode enforcementInstruction_PushPut(SmartInstitutionsServiceRepository::EnforcementInstructionPackage &enforcementInstruction_PushDataObject);
	// this method is meant to be used in derived classes
	Smart::StatusCode enforcementInstruction_SendPut(SmartInstitutionsServiceRepository::EnforcementInstructionPackage &enforcementInstruction_SendDataObject);
	
	
/**
 * Implementation of the Subject part of an InteractionObserver
 */
private:
	std::mutex interaction_observers_mutex;
	std::list<EnforcementManagerObserverInterface*> interaction_observers;
protected:
	void notify_all_interaction_observers();
public:
	void attach_interaction_observer(EnforcementManagerObserverInterface *observer);
	void detach_interaction_observer(EnforcementManagerObserverInterface *observer);

public:
	EnforcementManagerCore(Smart::IComponent *comp, const bool &useDefaultState=true);
	virtual ~EnforcementManagerCore();
	
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
