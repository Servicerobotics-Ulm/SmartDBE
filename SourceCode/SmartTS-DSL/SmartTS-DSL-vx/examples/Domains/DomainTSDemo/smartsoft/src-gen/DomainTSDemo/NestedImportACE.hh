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
#ifndef DOMAINTSDEMO_NESTEDIMPORT_ACE_H_
#define DOMAINTSDEMO_NESTEDIMPORT_ACE_H_

#include "DomainTSDemo/NestedImport.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure NestedImport
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemoIDL::NestedImport &data);

// de-serialization operator for DataStructure NestedImport
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemoIDL::NestedImport &data);

// serialization operator for CommunicationObject NestedImport
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemo::NestedImport &obj);

// de-serialization operator for CommunicationObject NestedImport
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemo::NestedImport &obj);

#endif /* DOMAINTSDEMO_NESTEDIMPORT_ACE_H_ */
