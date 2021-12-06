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
#include "CommNavigationObjects/CommNavigationGraphVertexACE.hh"
#include <ace/SString.h>
#include "CommNavigationObjects/enumNODE_TYPEData.hh"

// serialization operator for element CommNavigationGraphVertex
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommNavigationGraphVertex &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element x
	good_bit = good_bit && cdr.write_double(data.x);
	// serialize list-element y
	good_bit = good_bit && cdr.write_double(data.y);
	// serialize list-element pose
	good_bit = good_bit && cdr.write_long(data.pose);
	// serialize list-element path
	good_bit = good_bit && cdr.write_long(data.path);
	// serialize list-element width
	good_bit = good_bit && cdr.write_double(data.width);
	// serialize list-element type
	good_bit = good_bit && cdr.write_long(data.type);
	// serialize list-element intersec_path
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.intersec_path.size());
	good_bit = good_bit && cdr.write_long_array(data.intersec_path.data(), data.intersec_path.size());
	
	return good_bit;
}

// de-serialization operator for element CommNavigationGraphVertex
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommNavigationGraphVertex &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element x
	good_bit = good_bit && cdr.read_double(data.x);
	// deserialize type element y
	good_bit = good_bit && cdr.read_double(data.y);
	// deserialize type element pose
	good_bit = good_bit && cdr.read_long(data.pose);
	// deserialize type element path
	good_bit = good_bit && cdr.read_long(data.path);
	// deserialize type element width
	good_bit = good_bit && cdr.read_double(data.width);
	// deserialize type element type
	good_bit = good_bit && cdr.read_long(data.type);
	// deserialize list-type element intersec_path
	ACE_CDR::ULong data_intersec_pathNbr;
	good_bit = good_bit && cdr >> data_intersec_pathNbr;
	data.intersec_path.resize(data_intersec_pathNbr);
	good_bit = good_bit && cdr.read_long_array(data.intersec_path.data(), data_intersec_pathNbr);
	
	return good_bit;
}

// serialization operator for CommunicationObject CommNavigationGraphVertex
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommNavigationGraphVertex &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommNavigationGraphVertex
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommNavigationGraphVertex &obj)
{
	return cdr >> obj.set();
}
