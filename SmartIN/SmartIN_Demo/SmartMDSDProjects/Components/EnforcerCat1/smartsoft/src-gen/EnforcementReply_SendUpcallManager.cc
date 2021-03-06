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
#include "EnforcementReply_SendUpcallManager.hh"

EnforcementReply_SendUpcallManager::EnforcementReply_SendUpcallManager(
	Smart::InputSubject<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<SmartInstitutionsServiceRepository::EnforcementReplyPackage>(subject, prescaleFactor)
{  }
EnforcementReply_SendUpcallManager::~EnforcementReply_SendUpcallManager()
{  }

void EnforcementReply_SendUpcallManager::notify_upcalls(const SmartInstitutionsServiceRepository::EnforcementReplyPackage &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_EnforcementReply_Send(input);
	}
}

void EnforcementReply_SendUpcallManager::attach(EnforcementReply_SendUpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void EnforcementReply_SendUpcallManager::detach(EnforcementReply_SendUpcallInterface *upcall)
{
	upcalls.remove(upcall);
}
