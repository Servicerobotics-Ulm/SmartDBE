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
#ifndef COMMBASICOBJECTS_COMMTASKEVENTSTATE_ACE_H_
#define COMMBASICOBJECTS_COMMTASKEVENTSTATE_ACE_H_

#include "CommBasicObjects/CommTaskEventState.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure CommTaskEventState
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommBasicObjectsIDL::CommTaskEventState &data);

// de-serialization operator for DataStructure CommTaskEventState
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommBasicObjectsIDL::CommTaskEventState &data);

// serialization operator for CommunicationObject CommTaskEventState
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommBasicObjects::CommTaskEventState &obj);

// de-serialization operator for CommunicationObject CommTaskEventState
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommBasicObjects::CommTaskEventState &obj);

#endif /* COMMBASICOBJECTS_COMMTASKEVENTSTATE_ACE_H_ */
