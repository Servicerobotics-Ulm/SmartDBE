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
#include "JoystickManTaskCore.hh"
#include "JoystickManTask.hh"
#include "SmartINJoystickManager.hh"

//FIXME: use logging
//#include "smartGlobalLogger.hh"

// include observers


JoystickManTaskCore::JoystickManTaskCore(Smart::IComponent *comp, const bool &useDefaultState) 
:	SmartACE::ManagedTask(comp)
,	useDefaultState(useDefaultState)
,	useLogging(false)
,	taskLoggingId(0)
,	currentUpdateCount(0)
,	joystickServiceIn_1Status(Smart::SMART_DISCONNECTED)
,	joystickServiceIn_1Object()
,	joystickServiceIn_2Status(Smart::SMART_DISCONNECTED)
,	joystickServiceIn_2Object()
,	joystickServiceIn_3Status(Smart::SMART_DISCONNECTED)
,	joystickServiceIn_3Object()
,	joystickServiceIn_4Status(Smart::SMART_DISCONNECTED)
,	joystickServiceIn_4Object()
,	joystickServiceIn_5Status(Smart::SMART_DISCONNECTED)
,	joystickServiceIn_5Object()
{
}

JoystickManTaskCore::~JoystickManTaskCore()
{
}


void JoystickManTaskCore::notify_all_interaction_observers() {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	// try dynamically down-casting this class to the derived class 
	// (we can do it safely here as we exactly know the derived class)
	if(const JoystickManTask* joystickManTask = dynamic_cast<const JoystickManTask*>(this)) {
		for(auto it=interaction_observers.begin(); it!=interaction_observers.end(); it++) {
			(*it)->on_update_from(joystickManTask);
		}
	}
}

void JoystickManTaskCore::attach_interaction_observer(JoystickManTaskObserverInterface *observer) {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	interaction_observers.push_back(observer);
}

void JoystickManTaskCore::detach_interaction_observer(JoystickManTaskObserverInterface *observer) {
	std::unique_lock<std::mutex> lock(interaction_observers_mutex);
	interaction_observers.remove(observer);
}

int JoystickManTaskCore::execute_protected_region()
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


void JoystickManTaskCore::updateAllCommObjects()
{
	joystickServiceIn_1Status = COMP->joystickServiceIn_1InputTaskTrigger->getUpdate(joystickServiceIn_1Object);
	joystickServiceIn_2Status = COMP->joystickServiceIn_2InputTaskTrigger->getUpdate(joystickServiceIn_2Object);
	joystickServiceIn_3Status = COMP->joystickServiceIn_3InputTaskTrigger->getUpdate(joystickServiceIn_3Object);
	joystickServiceIn_4Status = COMP->joystickServiceIn_4InputTaskTrigger->getUpdate(joystickServiceIn_4Object);
	joystickServiceIn_5Status = COMP->joystickServiceIn_5InputTaskTrigger->getUpdate(joystickServiceIn_5Object);
	
}


// this method is meant to be used in derived classes
Smart::StatusCode JoystickManTaskCore::joystickServiceOutPut(CommBasicObjects::CommJoystick &joystickServiceOutDataObject)
{
	Smart::StatusCode result = COMP->joystickServiceOutWrapper->put(joystickServiceOutDataObject);
	if(useLogging == true) {
		//FIXME: use logging
		//Smart::LOGGER->log(pushLoggingId+1, getCurrentUpdateCount(), getPreviousCommObjId());
	}
	return result;
}

void JoystickManTaskCore::triggerLogEntry(const int& idOffset)
{
	if(useLogging == true) {
		int logId = taskLoggingId + 2*1 + idOffset;
		//FIXME: use logging
		//Smart::LOGGER->log(logId, getCurrentUpdateCount(), getPreviousCommObjId());
	}
}

int JoystickManTaskCore::getPreviousCommObjId()
{
	// this method needs to be overloaded and implemented in derived classes
	return 0;
}