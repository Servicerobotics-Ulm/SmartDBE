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
#ifndef _ENFORCEMENTINSTRUCTION_SEND_UPCALL_MANAGER_HH
#define _ENFORCEMENTINSTRUCTION_SEND_UPCALL_MANAGER_HH

#include <list>
#include "aceSmartSoft.hh"
#include "EnforcementInstruction_SendUpcallInterface.hh"

/** EnforcementInstruction_SendUpcallManager connects input-handling with Upcall propagation
 *
 * This class implements an InputHandler for the InputPort EnforcementInstruction_Send and propagates the handling 
 * of incoming data to all associated (i.e. attached) Upcalls.
 */
class EnforcementInstruction_SendUpcallManager
:	public Smart::IInputHandler<SmartInstitutionsServiceRepository::EnforcementInstructionPackage>
{
private:
	// list of associated updalls
	std::list<EnforcementInstruction_SendUpcallInterface*> upcalls;

	// call the on_EnforcementInstruction_Send of all the attached EnforcementInstruction_SendUpcallInterfaces
	void notify_upcalls(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input);
	
protected:
	virtual void handle_input(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input) {
		// relay input-handling to all attached EnforcementInstruction_SendUpcallInterfaces
		this->notify_upcalls(input);
	}
public:
	EnforcementInstruction_SendUpcallManager(
		Smart::InputSubject<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *subject,
		const int &prescaleFactor=1
	);
	virtual ~EnforcementInstruction_SendUpcallManager();
	
	void attach(EnforcementInstruction_SendUpcallInterface *upcall);
	void detach(EnforcementInstruction_SendUpcallInterface *upcall);
};

#endif
