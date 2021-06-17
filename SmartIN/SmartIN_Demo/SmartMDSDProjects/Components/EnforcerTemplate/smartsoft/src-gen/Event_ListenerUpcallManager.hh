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
#ifndef _EVENT_LISTENER_UPCALL_MANAGER_HH
#define _EVENT_LISTENER_UPCALL_MANAGER_HH

#include <list>
#include "aceSmartSoft.hh"
#include "Event_ListenerUpcallInterface.hh"

/** Event_ListenerUpcallManager connects input-handling with Upcall propagation
 *
 * This class implements an InputHandler for the InputPort Event_Listener and propagates the handling 
 * of incoming data to all associated (i.e. attached) Upcalls.
 */
class Event_ListenerUpcallManager
:	public Smart::IInputHandler<Smart::EventInputType<SmartInstitutionsServiceRepository::SmartIN_EventType>>
{
private:
	// list of associated updalls
	std::list<Event_ListenerUpcallInterface*> upcalls;

	// call the on_Event_Listener of all the attached Event_ListenerUpcallInterfaces
	void notify_upcalls(const Smart::EventInputType<SmartInstitutionsServiceRepository::SmartIN_EventType> &input);
	
protected:
	virtual void handle_input(const Smart::EventInputType<SmartInstitutionsServiceRepository::SmartIN_EventType> &input) {
		// relay input-handling to all attached Event_ListenerUpcallInterfaces
		this->notify_upcalls(input);
	}
public:
	Event_ListenerUpcallManager(
		Smart::InputSubject<Smart::EventInputType<SmartInstitutionsServiceRepository::SmartIN_EventType>> *subject,
		const int &prescaleFactor=1
	);
	virtual ~Event_ListenerUpcallManager();
	
	void attach(Event_ListenerUpcallInterface *upcall);
	void detach(Event_ListenerUpcallInterface *upcall);
};

#endif