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
#ifndef _SEND_COORDINATE2D_OUTPUT_PORT_TS_UPCALL_MANAGER_HH
#define _SEND_COORDINATE2D_OUTPUT_PORT_TS_UPCALL_MANAGER_HH

#include <list>
#include "aceSmartSoft.hh"
#include "Send_Coordinate2D_Output_Port_tsUpcallInterface.hh"

/** Send_Coordinate2D_Output_Port_tsUpcallManager connects input-handling with Upcall propagation
 *
 * This class implements an InputHandler for the InputPort Send_Coordinate2D_Output_Port_ts and propagates the handling 
 * of incoming data to all associated (i.e. attached) Upcalls.
 */
class Send_Coordinate2D_Output_Port_tsUpcallManager
:	public Smart::IInputHandler<DomainTSDemo::Coordinate2D>
{
private:
	// list of associated updalls
	std::list<Send_Coordinate2D_Output_Port_tsUpcallInterface*> upcalls;

	// call the on_Send_Coordinate2D_Output_Port_ts of all the attached Send_Coordinate2D_Output_Port_tsUpcallInterfaces
	void notify_upcalls(const DomainTSDemo::Coordinate2D &input);
	
protected:
	virtual void handle_input(const DomainTSDemo::Coordinate2D &input) {
		// relay input-handling to all attached Send_Coordinate2D_Output_Port_tsUpcallInterfaces
		this->notify_upcalls(input);
	}
public:
	Send_Coordinate2D_Output_Port_tsUpcallManager(
		Smart::InputSubject<DomainTSDemo::Coordinate2D> *subject,
		const int &prescaleFactor=1
	);
	virtual ~Send_Coordinate2D_Output_Port_tsUpcallManager();
	
	void attach(Send_Coordinate2D_Output_Port_tsUpcallInterface *upcall);
	void detach(Send_Coordinate2D_Output_Port_tsUpcallInterface *upcall);
};

#endif
