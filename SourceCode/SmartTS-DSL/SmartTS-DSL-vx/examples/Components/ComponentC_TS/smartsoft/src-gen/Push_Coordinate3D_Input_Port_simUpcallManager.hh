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
#ifndef _PUSH_COORDINATE3D_INPUT_PORT_SIM_UPCALL_MANAGER_HH
#define _PUSH_COORDINATE3D_INPUT_PORT_SIM_UPCALL_MANAGER_HH

#include <list>
#include "aceSmartSoft.hh"
#include "Push_Coordinate3D_Input_Port_simUpcallInterface.hh"

/** Push_Coordinate3D_Input_Port_simUpcallManager connects input-handling with Upcall propagation
 *
 * This class implements an InputHandler for the InputPort Push_Coordinate3D_Input_Port_sim and propagates the handling 
 * of incoming data to all associated (i.e. attached) Upcalls.
 */
class Push_Coordinate3D_Input_Port_simUpcallManager
:	public Smart::IInputHandler<DomainTSDemo::Coordinate3D>
{
private:
	// list of associated updalls
	std::list<Push_Coordinate3D_Input_Port_simUpcallInterface*> upcalls;

	// call the on_Push_Coordinate3D_Input_Port_sim of all the attached Push_Coordinate3D_Input_Port_simUpcallInterfaces
	void notify_upcalls(const DomainTSDemo::Coordinate3D &input);
	
protected:
	virtual void handle_input(const DomainTSDemo::Coordinate3D &input) {
		// relay input-handling to all attached Push_Coordinate3D_Input_Port_simUpcallInterfaces
		this->notify_upcalls(input);
	}
public:
	Push_Coordinate3D_Input_Port_simUpcallManager(
		Smart::InputSubject<DomainTSDemo::Coordinate3D> *subject,
		const int &prescaleFactor=1
	);
	virtual ~Push_Coordinate3D_Input_Port_simUpcallManager();
	
	void attach(Push_Coordinate3D_Input_Port_simUpcallInterface *upcall);
	void detach(Push_Coordinate3D_Input_Port_simUpcallInterface *upcall);
};

#endif