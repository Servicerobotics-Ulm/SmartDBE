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
#ifndef _ENFORCEMENTREPLY_PUSHWRAPPER_HH
#define _ENFORCEMENTREPLY_PUSHWRAPPER_HH

#include <mutex>
#include "aceSmartSoft.hh"

// include communication objects
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackageACE.hh>


class EnforcementReply_PushWrapper
{
private:
	std::mutex update_mutex;
	Smart::StatusCode update_status;
	
	SmartInstitutionsServiceRepository::EnforcementReplyPackage updateData;
	
	Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Push;
	
public:
	EnforcementReply_PushWrapper(Smart::IPushServerPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Push);
	virtual ~EnforcementReply_PushWrapper();
	
	Smart::StatusCode put(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_PushDataObject);
	
	Smart::StatusCode getLatestUpdate(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_PushDataObject);
	
};

#endif // _ENFORCEMENTREPLY_PUSHWRAPPER_HH
