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
#include "DomainTSDemo/NestedImportACE.hh"
#include <ace/SString.h>
#include "CommNavigationObjects/CommClosestNodeRequestACE.hh"
#include "DomainTSDemo/Coordinate3DACE.hh"
#include "DomainTSDemo/Coordinate3DPlusACE.hh"

// serialization operator for element NestedImport
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemoIDL::NestedImport &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element a
	good_bit = good_bit && cdr << data.a;
	// serialize list-element aa
	good_bit = good_bit && cdr << data.aa;
	// serialize list-element aaa
	good_bit = good_bit && cdr << data.aaa;
	
	return good_bit;
}

// de-serialization operator for element NestedImport
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemoIDL::NestedImport &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element a
	good_bit = good_bit && cdr >> data.a;
	// deserialize type element aa
	good_bit = good_bit && cdr >> data.aa;
	// deserialize type element aaa
	good_bit = good_bit && cdr >> data.aaa;
	
	return good_bit;
}

// serialization operator for CommunicationObject NestedImport
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const DomainTSDemo::NestedImport &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject NestedImport
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, DomainTSDemo::NestedImport &obj)
{
	return cdr >> obj.set();
}
