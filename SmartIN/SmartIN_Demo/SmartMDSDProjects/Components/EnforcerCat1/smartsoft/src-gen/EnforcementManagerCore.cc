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
#include "EnforcementManagerCore.hh"
#include "EnforcementManager.hh"
#include "EnforcerCat1.hh"

//FIXME: use logging
//#include "smartGlobalLogger.hh"

// include observers


EnforcementManagerCore::EnforcementManagerCore(Smart::IComponent *comp, const bool &useDefaultState) 
:	SmartACE::ManagedTask(comp)
,	useDefaultState(useDefaultState)
,	useLogging(false)
,	taskLoggingId(0)
,	currentUpdateCount(0)
,	enforcementReply_SendStatus(Smart::SMART_DISCONNECTED)
,	enforcementReply_SendObject()
,	enforcementReport_SendStatus(Smart::SMART_DISCONNECTED)
,	enforcementReport_SendObject()
{
}

EnforcementManagerCore::~EnforcementManagerCore()
{
}


void EnforcementManagerCore::notify_all_interaction_observers() {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	// try dynamically down-casting this class to the derived class 
	// (we can do it safely here as we exactly know the derived class)
	if(const EnforcementManager* enforcementManager = dynamic_cast<const EnforcementManager*>(this)) {
		for(auto it=interaction_observers.begin(); it!=interaction_observers.end(); it++) {
			(*it)->on_update_from(enforcementManager);
		}
	}
}

void EnforcementManagerCore::attach_interaction_observer(EnforcementManagerObserverInterface *observer) {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	interaction_observers.push_back(observer);
}

void EnforcementManagerCore::detach_interaction_observer(EnforcementManagerObserverInterface *observer) {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	interaction_observers.remove(observer);
}

int EnforcementManagerCore::execute_protected_region()
{
	
	// update of comm-objects must be within the protected region to prevent aged comm-object values
	this->updateAllCommObjects();
	
	if(useLogging == true) {
		//FIXME: use logging
		//Smart::LOGGER->log(taskLoggingId, getCurrentUpdateCount(), getPreviousCommObjId());
	}
	
	// this is the user code (should not internally use the state-pattern any more)
	int retval = this->on_execute();
	
	// notify all attached interaction observers
	this->notify_all_interaction_observers();
	
	// inform all associated tasks about a new update
	this->trigger_all_tasks();
	
	// increment current currentUpdateCount for the next iteration
	currentUpdateCount++;
	
	return retval;
}


void EnforcementManagerCore::updateAllCommObjects()
{
	enforcementReply_SendStatus = COMP->enforcementReply_SendInputTaskTrigger->getUpdate(enforcementReply_SendObject);
	enforcementReport_SendStatus = COMP->enforcementReport_SendInputTaskTrigger->getUpdate(enforcementReport_SendObject);
	
}


// this method is meant to be used in derived classes
Smart::StatusCode EnforcementManagerCore::enforcementInstruction_PushPut(SmartInstitutionsServiceRepository::EnforcementInstructionPackage &enforcementInstruction_PushDataObject)
{
	Smart::StatusCode result = COMP->enforcementInstruction_PushWrapper->put(enforcementInstruction_PushDataObject);
	if(useLogging == true) {
		//FIXME: use logging
		//Smart::LOGGER->log(pushLoggingId+1, getCurrentUpdateCount(), getPreviousCommObjId());
	}
	return result;
}
// this method is meant to be used in derived classes
Smart::StatusCode EnforcementManagerCore::enforcementInstruction_SendPut(SmartInstitutionsServiceRepository::EnforcementInstructionPackage &enforcementInstruction_SendDataObject)
{
	Smart::StatusCode result = COMP->enforcementInstruction_SendWrapper->send(enforcementInstruction_SendDataObject);
	if(useLogging == true) {
		//FIXME: use logging
		//Smart::LOGGER->log(pushLoggingId+1, getCurrentUpdateCount(), getPreviousCommObjId());
	}
	return result;
}

void EnforcementManagerCore::triggerLogEntry(const int& idOffset)
{
	if(useLogging == true) {
		int logId = taskLoggingId + 2*2 + idOffset;
		//FIXME: use logging
		//Smart::LOGGER->log(logId, getCurrentUpdateCount(), getPreviousCommObjId());
	}
}

int EnforcementManagerCore::getPreviousCommObjId()
{
	// this method needs to be overloaded and implemented in derived classes
	return 0;
}
