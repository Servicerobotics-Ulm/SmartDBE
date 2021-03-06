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
#include "EnforcementReply_PushUpcallManager.hh"

EnforcementReply_PushUpcallManager::EnforcementReply_PushUpcallManager(
	Smart::InputSubject<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<SmartInstitutionsServiceRepository::EnforcementReplyPackage>(subject, prescaleFactor)
{  }
EnforcementReply_PushUpcallManager::~EnforcementReply_PushUpcallManager()
{  }

void EnforcementReply_PushUpcallManager::notify_upcalls(const SmartInstitutionsServiceRepository::EnforcementReplyPackage &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_EnforcementReply_Push(input);
	}
}

void EnforcementReply_PushUpcallManager::attach(EnforcementReply_PushUpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void EnforcementReply_PushUpcallManager::detach(EnforcementReply_PushUpcallInterface *upcall)
{
	upcalls.remove(upcall);
}
