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
#include "DomainTSDemo/TimeObjectACE.hh"
#include <ace/SString.h>
#include "DomainTSDemo/BasicTimeACE.hh"
#include "CommBasicObjects/CommTimeStampACE.hh"

// serialization operator for element TimeObject
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemoIDL::TimeObject &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element basic
	good_bit = good_bit && cdr << data.basic;
	// serialize list-element compound
	good_bit = good_bit && cdr << data.compound;
	
	return good_bit;
}

// de-serialization operator for element TimeObject
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemoIDL::TimeObject &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element basic
	good_bit = good_bit && cdr >> data.basic;
	// deserialize type element compound
	good_bit = good_bit && cdr >> data.compound;
	
	return good_bit;
}

// serialization operator for CommunicationObject TimeObject
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemo::TimeObject &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject TimeObject
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemo::TimeObject &obj)
{
	return cdr >> obj.set();
}
