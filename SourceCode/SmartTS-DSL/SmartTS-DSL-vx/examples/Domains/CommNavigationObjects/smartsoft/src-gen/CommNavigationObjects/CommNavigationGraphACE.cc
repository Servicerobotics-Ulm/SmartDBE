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
#include "CommNavigationObjects/CommNavigationGraphACE.hh"
#include <ace/SString.h>
#include "CommNavigationObjects/CommNavigationGraphEdgeACE.hh"
#include "CommNavigationObjects/CommNavigationGraphVertexACE.hh"

// serialization operator for element CommNavigationGraph
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommNavigationGraph &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element vertices
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.vertices.size());
	std::vector<CommNavigationObjectsIDL::CommNavigationGraphVertex>::const_iterator data_verticesIt;
	for(data_verticesIt=data.vertices.begin(); data_verticesIt!=data.vertices.end(); data_verticesIt++) {
		good_bit = good_bit && cdr << *data_verticesIt;
	}
	// serialize list-element edges
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.edges.size());
	std::vector<CommNavigationObjectsIDL::CommNavigationGraphEdge>::const_iterator data_edgesIt;
	for(data_edgesIt=data.edges.begin(); data_edgesIt!=data.edges.end(); data_edgesIt++) {
		good_bit = good_bit && cdr << *data_edgesIt;
	}
	// serialize list-element pathWidth
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.pathWidth.size());
	good_bit = good_bit && cdr.write_double_array(data.pathWidth.data(), data.pathWidth.size());
	// serialize list-element valid
	good_bit = good_bit && cdr.write_boolean(data.valid);
	
	return good_bit;
}

// de-serialization operator for element CommNavigationGraph
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommNavigationGraph &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize list-type element vertices
	ACE_CDR::ULong data_verticesNbr;
	good_bit = good_bit && cdr >> data_verticesNbr;
	data.vertices.clear();
	CommNavigationObjectsIDL::CommNavigationGraphVertex data_verticesItem;
	for(ACE_CDR::ULong i=0; i<data_verticesNbr; ++i) {
		good_bit = good_bit && cdr >> data_verticesItem;
		data.vertices.push_back(data_verticesItem);
	}
	// deserialize list-type element edges
	ACE_CDR::ULong data_edgesNbr;
	good_bit = good_bit && cdr >> data_edgesNbr;
	data.edges.clear();
	CommNavigationObjectsIDL::CommNavigationGraphEdge data_edgesItem;
	for(ACE_CDR::ULong i=0; i<data_edgesNbr; ++i) {
		good_bit = good_bit && cdr >> data_edgesItem;
		data.edges.push_back(data_edgesItem);
	}
	// deserialize list-type element pathWidth
	ACE_CDR::ULong data_pathWidthNbr;
	good_bit = good_bit && cdr >> data_pathWidthNbr;
	data.pathWidth.resize(data_pathWidthNbr);
	good_bit = good_bit && cdr.read_double_array(data.pathWidth.data(), data_pathWidthNbr);
	// deserialize type element valid
	good_bit = good_bit && cdr.read_boolean(data.valid);
	
	return good_bit;
}

// serialization operator for CommunicationObject CommNavigationGraph
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommNavigationGraph &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommNavigationGraph
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommNavigationGraph &obj)
{
	return cdr >> obj.set();
}