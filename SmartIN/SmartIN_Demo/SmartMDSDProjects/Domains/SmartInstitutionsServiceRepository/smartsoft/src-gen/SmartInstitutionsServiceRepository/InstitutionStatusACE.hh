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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_ACE_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_ACE_H_

#include "SmartInstitutionsServiceRepository/InstitutionStatus.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure InstitutionStatus
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepositoryIDL::InstitutionStatus &data);

// de-serialization operator for DataStructure InstitutionStatus
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepositoryIDL::InstitutionStatus &data);

// serialization operator for CommunicationObject InstitutionStatus
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepository::InstitutionStatus &obj);

// de-serialization operator for CommunicationObject InstitutionStatus
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepository::InstitutionStatus &obj);

#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_ACE_H_ */