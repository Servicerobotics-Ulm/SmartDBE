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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_ACE_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_ACE_H_

#include "SmartInstitutionsServiceRepository/EnforcementReplyPackage.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure EnforcementReplyPackage
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage &data);

// de-serialization operator for DataStructure EnforcementReplyPackage
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage &data);

// serialization operator for CommunicationObject EnforcementReplyPackage
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepository::EnforcementReplyPackage &obj);

// de-serialization operator for CommunicationObject EnforcementReplyPackage
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepository::EnforcementReplyPackage &obj);

#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_ACE_H_ */
