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
#include "CommNavigationObjects/CommCorridorNetworkStatusACE.hh"
#include <ace/SString.h>
#include "CommNavigationObjects/CommCorridorNodeACE.hh"

// serialization operator for element CommCorridorNetworkStatus
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommCorridorNetworkStatus &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element nodes
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.nodes.size());
	std::vector<CommNavigationObjectsIDL::CommCorridorNode>::const_iterator data_nodesIt;
	for(data_nodesIt=data.nodes.begin(); data_nodesIt!=data.nodes.end(); data_nodesIt++) {
		good_bit = good_bit && cdr << *data_nodesIt;
	}
	
	return good_bit;
}

// de-serialization operator for element CommCorridorNetworkStatus
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommCorridorNetworkStatus &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize list-type element nodes
	ACE_CDR::ULong data_nodesNbr;
	good_bit = good_bit && cdr >> data_nodesNbr;
	data.nodes.clear();
	CommNavigationObjectsIDL::CommCorridorNode data_nodesItem;
	for(ACE_CDR::ULong i=0; i<data_nodesNbr; ++i) {
		good_bit = good_bit && cdr >> data_nodesItem;
		data.nodes.push_back(data_nodesItem);
	}
	
	return good_bit;
}

// serialization operator for CommunicationObject CommCorridorNetworkStatus
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommCorridorNetworkStatus &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommCorridorNetworkStatus
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommCorridorNetworkStatus &obj)
{
	return cdr >> obj.set();
}
