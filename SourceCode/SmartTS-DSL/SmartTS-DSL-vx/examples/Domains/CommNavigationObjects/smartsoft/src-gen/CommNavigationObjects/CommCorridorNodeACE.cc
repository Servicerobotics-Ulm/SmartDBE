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
#include "CommNavigationObjects/CommCorridorNodeACE.hh"
#include <ace/SString.h>
#include "CommNavigationObjects/enumNODE_TYPEData.hh"
#include "CommNavigationObjects/enumNODE_STATUSData.hh"

// serialization operator for element CommCorridorNode
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjectsIDL::CommCorridorNode &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element id
	good_bit = good_bit && cdr.write_ulong(data.id);
	// serialize list-element x
	good_bit = good_bit && cdr.write_double(data.x);
	// serialize list-element y
	good_bit = good_bit && cdr.write_double(data.y);
	// serialize list-element pose
	good_bit = good_bit && cdr.write_ulong(data.pose);
	// serialize list-element path
	good_bit = good_bit && cdr.write_ulong(data.path);
	// serialize list-element width
	good_bit = good_bit && cdr.write_double(data.width);
	// serialize list-element type
	good_bit = good_bit && cdr.write_long(data.type);
	// serialize list-element sts
	good_bit = good_bit && cdr.write_long(data.sts);
	// serialize list-element robotID
	good_bit = good_bit && cdr << ACE_CString(data.robotID.c_str());
	
	return good_bit;
}

// de-serialization operator for element CommCorridorNode
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjectsIDL::CommCorridorNode &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element id
	good_bit = good_bit && cdr.read_ulong(data.id);
	// deserialize type element x
	good_bit = good_bit && cdr.read_double(data.x);
	// deserialize type element y
	good_bit = good_bit && cdr.read_double(data.y);
	// deserialize type element pose
	good_bit = good_bit && cdr.read_ulong(data.pose);
	// deserialize type element path
	good_bit = good_bit && cdr.read_ulong(data.path);
	// deserialize type element width
	good_bit = good_bit && cdr.read_double(data.width);
	// deserialize type element type
	good_bit = good_bit && cdr.read_long(data.type);
	// deserialize type element sts
	good_bit = good_bit && cdr.read_long(data.sts);
	// deserialize string-type element robotID
	ACE_CString data_robotID_str;
	good_bit = good_bit && cdr >> data_robotID_str;
	data.robotID = data_robotID_str.c_str();
	
	return good_bit;
}

// serialization operator for CommunicationObject CommCorridorNode
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommNavigationObjects::CommCorridorNode &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommCorridorNode
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommNavigationObjects::CommCorridorNode &obj)
{
	return cdr >> obj.set();
}