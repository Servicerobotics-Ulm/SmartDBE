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
#include "EnforcementInstruction_SendUpcallManager.hh"

EnforcementInstruction_SendUpcallManager::EnforcementInstruction_SendUpcallManager(
	Smart::InputSubject<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<SmartInstitutionsServiceRepository::EnforcementInstructionPackage>(subject, prescaleFactor)
{  }
EnforcementInstruction_SendUpcallManager::~EnforcementInstruction_SendUpcallManager()
{  }

void EnforcementInstruction_SendUpcallManager::notify_upcalls(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_EnforcementInstruction_Send(input);
	}
}

void EnforcementInstruction_SendUpcallManager::attach(EnforcementInstruction_SendUpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void EnforcementInstruction_SendUpcallManager::detach(EnforcementInstruction_SendUpcallInterface *upcall)
{
	upcalls.remove(upcall);
}
