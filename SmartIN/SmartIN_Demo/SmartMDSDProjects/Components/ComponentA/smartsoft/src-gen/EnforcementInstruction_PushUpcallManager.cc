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
#include "EnforcementInstruction_PushUpcallManager.hh"

EnforcementInstruction_PushUpcallManager::EnforcementInstruction_PushUpcallManager(
	Smart::InputSubject<SmartInstitutions_ServiceRepository::EnforcementInstructionPackage> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<SmartInstitutions_ServiceRepository::EnforcementInstructionPackage>(subject, prescaleFactor)
{  }
EnforcementInstruction_PushUpcallManager::~EnforcementInstruction_PushUpcallManager()
{  }

void EnforcementInstruction_PushUpcallManager::notify_upcalls(const SmartInstitutions_ServiceRepository::EnforcementInstructionPackage &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_EnforcementInstruction_Push(input);
	}
}

void EnforcementInstruction_PushUpcallManager::attach(EnforcementInstruction_PushUpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void EnforcementInstruction_PushUpcallManager::detach(EnforcementInstruction_PushUpcallInterface *upcall)
{
	upcalls.remove(upcall);
}
