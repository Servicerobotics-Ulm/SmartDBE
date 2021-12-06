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
#ifndef COMMNAVIGATIONOBJECTS_COMMNAVIGATIONGRAPH_ACE_H_
#define COMMNAVIGATIONOBJECTS_COMMNAVIGATIONGRAPH_ACE_H_

#include "CommNavigationObjects/CommNavigationGraph.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure CommNavigationGraph
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommNavigationGraph &data);

// de-serialization operator for DataStructure CommNavigationGraph
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommNavigationGraph &data);

// serialization operator for CommunicationObject CommNavigationGraph
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommNavigationGraph &obj);

// de-serialization operator for CommunicationObject CommNavigationGraph
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommNavigationGraph &obj);

#endif /* COMMNAVIGATIONOBJECTS_COMMNAVIGATIONGRAPH_ACE_H_ */
