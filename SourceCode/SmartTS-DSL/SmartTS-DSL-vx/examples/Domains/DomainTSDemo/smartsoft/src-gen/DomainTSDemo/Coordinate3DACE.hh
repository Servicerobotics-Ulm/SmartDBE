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
#ifndef DOMAINTSDEMO_COORDINATE3D_ACE_H_
#define DOMAINTSDEMO_COORDINATE3D_ACE_H_

#include "DomainTSDemo/Coordinate3D.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure Coordinate3D
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemoIDL::Coordinate3D &data);

// de-serialization operator for DataStructure Coordinate3D
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemoIDL::Coordinate3D &data);

// serialization operator for CommunicationObject Coordinate3D
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemo::Coordinate3D &obj);

// de-serialization operator for CommunicationObject Coordinate3D
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemo::Coordinate3D &obj);

#endif /* DOMAINTSDEMO_COORDINATE3D_ACE_H_ */