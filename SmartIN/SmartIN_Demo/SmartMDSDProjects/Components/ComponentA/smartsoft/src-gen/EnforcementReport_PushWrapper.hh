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
#ifndef _ENFORCEMENTREPORT_PUSHWRAPPER_HH
#define _ENFORCEMENTREPORT_PUSHWRAPPER_HH

#include <mutex>
#include "aceSmartSoft.hh"

// include communication objects
#include <SmartInstitutionsServiceRepository/EnforcementReportPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReportPackageACE.hh>


class EnforcementReport_PushWrapper
{
private:
	std::mutex update_mutex;
	Smart::StatusCode update_status;
	
	SmartInstitutionsServiceRepository::EnforcementReportPackage updateData;
	
	Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> *enforcementReport_Push;
	
public:
	EnforcementReport_PushWrapper(Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> *enforcementReport_Push);
	virtual ~EnforcementReport_PushWrapper();
	
	Smart::StatusCode put(SmartInstitutionsServiceRepository::EnforcementReportPackage &enforcementReport_PushDataObject);
	
	Smart::StatusCode getLatestUpdate(SmartInstitutionsServiceRepository::EnforcementReportPackage &enforcementReport_PushDataObject);
	
};

#endif // _ENFORCEMENTREPORT_PUSHWRAPPER_HH