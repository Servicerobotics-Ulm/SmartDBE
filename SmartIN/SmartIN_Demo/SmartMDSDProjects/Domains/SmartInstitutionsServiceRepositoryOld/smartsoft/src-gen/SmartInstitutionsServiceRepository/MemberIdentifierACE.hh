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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_MEMBERIDENTIFIER_ACE_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_MEMBERIDENTIFIER_ACE_H_

#include "SmartInstitutionsServiceRepository/MemberIdentifier.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure MemberIdentifier
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepositoryIDL::MemberIdentifier &data);

// de-serialization operator for DataStructure MemberIdentifier
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepositoryIDL::MemberIdentifier &data);

// serialization operator for CommunicationObject MemberIdentifier
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepository::MemberIdentifier &obj);

// de-serialization operator for CommunicationObject MemberIdentifier
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepository::MemberIdentifier &obj);

#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_MEMBERIDENTIFIER_ACE_H_ */