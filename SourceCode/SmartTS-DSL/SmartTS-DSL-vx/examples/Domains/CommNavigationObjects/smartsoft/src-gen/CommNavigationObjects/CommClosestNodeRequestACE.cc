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
#include "CommNavigationObjects/CommClosestNodeRequestACE.hh"
#include <ace/SString.h>
#include "CommBasicObjects/CommPosition3dACE.hh"

// serialization operator for element CommClosestNodeRequest
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommClosestNodeRequest &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element position
	good_bit = good_bit && cdr << data.position;
	
	return good_bit;
}

// de-serialization operator for element CommClosestNodeRequest
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommClosestNodeRequest &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element position
	good_bit = good_bit && cdr >> data.position;
	
	return good_bit;
}

// serialization operator for CommunicationObject CommClosestNodeRequest
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommClosestNodeRequest &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommClosestNodeRequest
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommClosestNodeRequest &obj)
{
	return cdr >> obj.set();
}
