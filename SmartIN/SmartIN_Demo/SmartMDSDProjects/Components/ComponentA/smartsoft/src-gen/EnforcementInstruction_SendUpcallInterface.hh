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
#ifndef _ENFORCEMENTINSTRUCTION_SEND_UPCALL_INTERFACE_HH
#define _ENFORCEMENTINSTRUCTION_SEND_UPCALL_INTERFACE_HH

#include "SmartInstitutions_ServiceRepository/EnforcementInstructionPackage.hh"

class EnforcementInstruction_SendUpcallInterface {
public:
	virtual ~EnforcementInstruction_SendUpcallInterface() {  }

	virtual void on_EnforcementInstruction_Send(const SmartInstitutions_ServiceRepository::EnforcementInstructionPackage &input) = 0;
};

#endif
