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
#ifndef COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONPOSEREQUESTEVENTSTATE_ACE_H_
#define COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONPOSEREQUESTEVENTSTATE_ACE_H_

#include "CommNavigationObjects/CommCorridorNavigationPoseRequestEventState.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure CommCorridorNavigationPoseRequestEventState
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommCorridorNavigationPoseRequestEventState &data);

// de-serialization operator for DataStructure CommCorridorNavigationPoseRequestEventState
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommCorridorNavigationPoseRequestEventState &data);

// serialization operator for CommunicationObject CommCorridorNavigationPoseRequestEventState
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommCorridorNavigationPoseRequestEventState &obj);

// de-serialization operator for CommunicationObject CommCorridorNavigationPoseRequestEventState
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommCorridorNavigationPoseRequestEventState &obj);

#endif /* COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONPOSEREQUESTEVENTSTATE_ACE_H_ */