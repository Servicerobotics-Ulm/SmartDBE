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
#ifndef _ENFORCEMENTINSTRUCTION_PUSH_UPCALL_INTERFACE_HH
#define _ENFORCEMENTINSTRUCTION_PUSH_UPCALL_INTERFACE_HH

#include "SmartInstitutionsServiceRepository/EnforcementInstructionPackage.hh"

class EnforcementInstruction_PushUpcallInterface {
public:
	virtual ~EnforcementInstruction_PushUpcallInterface() {  }

	virtual void on_EnforcementInstruction_Push(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input) = 0;
};

#endif