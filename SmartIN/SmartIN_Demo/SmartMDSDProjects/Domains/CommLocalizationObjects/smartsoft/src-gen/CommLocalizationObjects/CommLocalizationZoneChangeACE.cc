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
#include "CommLocalizationObjects/CommLocalizationZoneChangeACE.hh"
#include <ace/SString.h>
#include "CommBasicObjects/CommTimeStampACE.hh"

// serialization operator for element CommLocalizationZoneChange
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommLocalizationObjectsIDL::CommLocalizationZoneChange &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element newZone
	good_bit = good_bit && cdr.write_long(data.newZone);
	// serialize list-element oldZone
	good_bit = good_bit && cdr.write_long(data.oldZone);
	// serialize list-element timestamp
	good_bit = good_bit && cdr << data.timestamp;
	
	return good_bit;
}

// de-serialization operator for element CommLocalizationZoneChange
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommLocalizationObjectsIDL::CommLocalizationZoneChange &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element newZone
	good_bit = good_bit && cdr.read_long(data.newZone);
	// deserialize type element oldZone
	good_bit = good_bit && cdr.read_long(data.oldZone);
	// deserialize type element timestamp
	good_bit = good_bit && cdr >> data.timestamp;
	
	return good_bit;
}

// serialization operator for CommunicationObject CommLocalizationZoneChange
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const CommLocalizationObjects::CommLocalizationZoneChange &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject CommLocalizationZoneChange
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, CommLocalizationObjects::CommLocalizationZoneChange &obj)
{
	return cdr >> obj.set();
}
