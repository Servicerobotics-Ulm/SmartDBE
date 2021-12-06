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
#include "CommNavigationObjects/CommCorridorNavigationNodeAnswerACE.hh"
#include <ace/SString.h>
#include "CommNavigationObjects/CommCorridorNodeACE.hh"

// serialization operator for element CommCorridorNavigationNodeAnswer
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommCorridorNavigationNodeAnswer &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element nodesList
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.nodesList.size());
	std::vector<CommNavigationObjectsIDL::CommCorridorNode>::const_iterator data_nodesListIt;
	for(data_nodesListIt=data.nodesList.begin(); data_nodesListIt!=data.nodesList.end(); data_nodesListIt++) {
		good_bit = good_bit && cdr << *data_nodesListIt;
	}
	// serialize list-element success
	good_bit = good_bit && cdr.write_boolean(data.success);
	
	return good_bit;
}

// de-serialization operator for element CommCorridorNavigationNodeAnswer
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommCorridorNavigationNodeAnswer &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize list-type element nodesList
	ACE_CDR::ULong data_nodesListNbr;
	good_bit = good_bit && cdr >> data_nodesListNbr;
	data.nodesList.clear();
	CommNavigationObjectsIDL::CommCorridorNode data_nodesListItem;
	for(ACE_CDR::ULong i=0; i<data_nodesListNbr; ++i) {
		good_bit = good_bit && cdr >> data_nodesListItem;
		data.nodesList.push_back(data_nodesListItem);
	}
	// deserialize type element success
	good_bit = good_bit && cdr.read_boolean(data.success);
	
	return good_bit;
}

// serialization operator for CommunicationObject CommCorridorNavigationNodeAnswer
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommCorridorNavigationNodeAnswer &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommCorridorNavigationNodeAnswer
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommCorridorNavigationNodeAnswer &obj)
{
	return cdr >> obj.set();
}