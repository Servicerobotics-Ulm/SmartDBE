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
#ifndef _ENFORCEMENTREPLY_SEND_UPCALL_INTERFACE_HH
#define _ENFORCEMENTREPLY_SEND_UPCALL_INTERFACE_HH

#include "SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh"

class EnforcementReply_SendUpcallInterface {
public:
	virtual ~EnforcementReply_SendUpcallInterface() {  }

	virtual void on_EnforcementReply_Send(const SmartInstitutionsServiceRepository::EnforcementReplyPackage &input) = 0;
};

#endif
