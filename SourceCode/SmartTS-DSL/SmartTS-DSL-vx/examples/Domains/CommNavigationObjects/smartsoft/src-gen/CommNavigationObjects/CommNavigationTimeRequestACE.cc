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
#include "CommNavigationObjects/CommNavigationTimeRequestACE.hh"
#include <ace/SString.h>

// serialization operator for element CommNavigationTimeRequest
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommNavigationTimeRequest &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element startPose
	good_bit = good_bit && cdr.write_ulong(data.startPose);
	// serialize list-element goalPose
	good_bit = good_bit && cdr.write_ulong(data.goalPose);
	
	return good_bit;
}

// de-serialization operator for element CommNavigationTimeRequest
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommNavigationTimeRequest &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element startPose
	good_bit = good_bit && cdr.read_ulong(data.startPose);
	// deserialize type element goalPose
	good_bit = good_bit && cdr.read_ulong(data.goalPose);
	
	return good_bit;
}

// serialization operator for CommunicationObject CommNavigationTimeRequest
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommNavigationTimeRequest &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommNavigationTimeRequest
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommNavigationTimeRequest &obj)
{
	return cdr >> obj.set();
}
