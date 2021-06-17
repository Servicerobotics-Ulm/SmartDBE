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
#ifndef COMMBASICOBJECTS_COMMPOSITION3D_ACE_H_
#define COMMBASICOBJECTS_COMMPOSITION3D_ACE_H_

#include "CommBasicObjects/CommPosition3d.hh"

#include <ace/CDR_Stream.h>

// serialization operator for DataStructure CommPosition3d
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommBasicObjectsIDL::CommPosition3d &data);

// de-serialization operator for DataStructure CommPosition3d
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommBasicObjectsIDL::CommPosition3d &data);

// serialization operator for CommunicationObject CommPosition3d
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommBasicObjects::CommPosition3d &obj);

// de-serialization operator for CommunicationObject CommPosition3d
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommBasicObjects::CommPosition3d &obj);

#endif /* COMMBASICOBJECTS_COMMPOSITION3D_ACE_H_ */