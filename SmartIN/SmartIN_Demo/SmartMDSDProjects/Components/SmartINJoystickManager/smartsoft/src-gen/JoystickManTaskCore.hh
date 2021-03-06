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
#ifndef _JOYSTICKMANTASK_CORE_HH
#define _JOYSTICKMANTASK_CORE_HH
	
#include "aceSmartSoft.hh"

// include upcall interface
#include "JoystickServiceIn_1UpcallInterface.hh"
#include "JoystickServiceIn_2UpcallInterface.hh"
#include "JoystickServiceIn_3UpcallInterface.hh"
#include "JoystickServiceIn_4UpcallInterface.hh"
#include "JoystickServiceIn_5UpcallInterface.hh"

// include communication-objects for output ports
#include <CommBasicObjects/CommJoystick.hh>

// include all interaction-observer interfaces
#include <JoystickManTaskObserverInterface.hh>


class JoystickManTaskCore
:	public SmartACE::ManagedTask
,	public Smart::TaskTriggerSubject
,	public JoystickServiceIn_1UpcallInterface
,	public JoystickServiceIn_2UpcallInterface
,	public JoystickServiceIn_3UpcallInterface
,	public JoystickServiceIn_4UpcallInterface
,	public JoystickServiceIn_5UpcallInterface
{
private:
	bool useDefaultState; 
	bool useLogging;
	int taskLoggingId;
	unsigned int currentUpdateCount;
	
	Smart::StatusCode joystickServiceIn_1Status;
	CommBasicObjects::CommJoystick joystickServiceIn_1Object;
	Smart::StatusCode joystickServiceIn_2Status;
	CommBasicObjects::CommJoystick joystickServiceIn_2Object;
	Smart::StatusCode joystickServiceIn_3Status;
	CommBasicObjects::CommJoystick joystickServiceIn_3Object;
	Smart::StatusCode joystickServiceIn_4Status;
	CommBasicObjects::CommJoystick joystickServiceIn_4Object;
	Smart::StatusCode joystickServiceIn_5Status;
	CommBasicObjects::CommJoystick joystickServiceIn_5Object;
	
	
protected:
	virtual int execute_protected_region();
	
	virtual void updateAllCommObjects();
	
	virtual int getPreviousCommObjId();
	
	void triggerLogEntry(const int& idOffset);
	
	
	// overload and implement this method in derived classes to immediately get all incoming updates from JoystickServiceIn_1 (as soon as they arrive)
	virtual void on_JoystickServiceIn_1(const CommBasicObjects::CommJoystick &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode joystickServiceIn_1GetUpdate(CommBasicObjects::CommJoystick &joystickServiceIn_1Object) const
	{
		// copy local object buffer and return the last status code
		joystickServiceIn_1Object = this->joystickServiceIn_1Object;
		return joystickServiceIn_1Status;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from JoystickServiceIn_2 (as soon as they arrive)
	virtual void on_JoystickServiceIn_2(const CommBasicObjects::CommJoystick &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode joystickServiceIn_2GetUpdate(CommBasicObjects::CommJoystick &joystickServiceIn_2Object) const
	{
		// copy local object buffer and return the last status code
		joystickServiceIn_2Object = this->joystickServiceIn_2Object;
		return joystickServiceIn_2Status;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from JoystickServiceIn_3 (as soon as they arrive)
	virtual void on_JoystickServiceIn_3(const CommBasicObjects::CommJoystick &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode joystickServiceIn_3GetUpdate(CommBasicObjects::CommJoystick &joystickServiceIn_3Object) const
	{
		// copy local object buffer and return the last status code
		joystickServiceIn_3Object = this->joystickServiceIn_3Object;
		return joystickServiceIn_3Status;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from JoystickServiceIn_4 (as soon as they arrive)
	virtual void on_JoystickServiceIn_4(const CommBasicObjects::CommJoystick &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode joystickServiceIn_4GetUpdate(CommBasicObjects::CommJoystick &joystickServiceIn_4Object) const
	{
		// copy local object buffer and return the last status code
		joystickServiceIn_4Object = this->joystickServiceIn_4Object;
		return joystickServiceIn_4Status;
	}
	// overload and implement this method in derived classes to immediately get all incoming updates from JoystickServiceIn_5 (as soon as they arrive)
	virtual void on_JoystickServiceIn_5(const CommBasicObjects::CommJoystick &input) {
		// no-op
	}
	
	// this method can be safely used from the thread in derived classes
	inline Smart::StatusCode joystickServiceIn_5GetUpdate(CommBasicObjects::CommJoystick &joystickServiceIn_5Object) const
	{
		// copy local object buffer and return the last status code
		joystickServiceIn_5Object = this->joystickServiceIn_5Object;
		return joystickServiceIn_5Status;
	}
	
	// this method is meant to be used in derived classes
	Smart::StatusCode joystickServiceOutPut(CommBasicObjects::CommJoystick &joystickServiceOutDataObject);
	
	
/**
 * Implementation of the Subject part of an InteractionObserver
 */
private:
	std::mutex interaction_observers_mutex;
	std::list<JoystickManTaskObserverInterface*> interaction_observers;
protected:
	void notify_all_interaction_observers();
public:
	void attach_interaction_observer(JoystickManTaskObserverInterface *observer);
	void detach_interaction_observer(JoystickManTaskObserverInterface *observer);

public:
	JoystickManTaskCore(Smart::IComponent *comp, const bool &useDefaultState=true);
	virtual ~JoystickManTaskCore();
	
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
