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
#ifndef COMMBASICOBJECTS_COMMDIGITALOUTPUTREQUEST_ACE_H_
#define COMMBASICOBJECTS_COMMDIGITALOUTPUTREQUEST_ACE_H_

#include "CommBasicObjects/CommDigitalOutputRequest.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure CommDigitalOutputRequest
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommBasicObjectsIDL::CommDigitalOutputRequest &data);

// de-serialization operator for DataStructure CommDigitalOutputRequest
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommBasicObjectsIDL::CommDigitalOutputRequest &data);

// serialization operator for CommunicationObject CommDigitalOutputRequest
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommBasicObjects::CommDigitalOutputRequest &obj);

// de-serialization operator for CommunicationObject CommDigitalOutputRequest
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommBasicObjects::CommDigitalOutputRequest &obj);

#endif /* COMMBASICOBJECTS_COMMDIGITALOUTPUTREQUEST_ACE_H_ */