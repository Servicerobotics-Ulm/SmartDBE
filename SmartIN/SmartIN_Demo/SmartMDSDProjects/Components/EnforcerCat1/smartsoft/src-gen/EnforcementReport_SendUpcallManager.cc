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
#include "EnforcementReport_SendUpcallManager.hh"

EnforcementReport_SendUpcallManager::EnforcementReport_SendUpcallManager(
	Smart::InputSubject<SmartInstitutionsServiceRepository::EnforcementReportPackage> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<SmartInstitutionsServiceRepository::EnforcementReportPackage>(subject, prescaleFactor)
{  }
EnforcementReport_SendUpcallManager::~EnforcementReport_SendUpcallManager()
{  }

void EnforcementReport_SendUpcallManager::notify_upcalls(const SmartInstitutionsServiceRepository::EnforcementReportPackage &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_EnforcementReport_Send(input);
	}
}

void EnforcementReport_SendUpcallManager::attach(EnforcementReport_SendUpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void EnforcementReport_SendUpcallManager::detach(EnforcementReport_SendUpcallInterface *upcall)
{
	upcalls.remove(upcall);
}
