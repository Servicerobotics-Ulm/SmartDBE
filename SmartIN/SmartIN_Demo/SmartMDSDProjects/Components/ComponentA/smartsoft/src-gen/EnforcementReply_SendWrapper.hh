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
#ifndef _ENFORCEMENTREPLY_SENDWRAPPER_HH
#define _ENFORCEMENTREPLY_SENDWRAPPER_HH

#include <mutex>
#include "aceSmartSoft.hh"

// include communication objects
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh>
#include <SmartInstitutionsServiceRepository/EnforcementReplyPackageACE.hh>


class EnforcementReply_SendWrapper
{
private:
	std::mutex update_mutex;
	Smart::StatusCode update_status;
	
	SmartInstitutionsServiceRepository::EnforcementReplyPackage updateData;
	
	Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Send;
	
public:
	EnforcementReply_SendWrapper(Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> *enforcementReply_Send);
	virtual ~EnforcementReply_SendWrapper();
	
	Smart::StatusCode send(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_SendDataObject);
	
	Smart::StatusCode getLatestUpdate(SmartInstitutionsServiceRepository::EnforcementReplyPackage &enforcementReply_SendDataObject);
	
};

#endif // _ENFORCEMENTREPLY_SENDWRAPPER_HH
