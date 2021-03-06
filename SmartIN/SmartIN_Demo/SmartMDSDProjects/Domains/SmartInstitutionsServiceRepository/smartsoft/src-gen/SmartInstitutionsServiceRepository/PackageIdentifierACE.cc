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
#include "SmartInstitutionsServiceRepository/PackageIdentifierACE.hh"
#include <ace/SString.h>
#include "CommBasicObjects/CommTimeStampACE.hh"

// serialization operator for element PackageIdentifier
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepositoryIDL::PackageIdentifier &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element id
	good_bit = good_bit && cdr.write_ulonglong(data.id);
	// serialize list-element timestampe
	good_bit = good_bit && cdr << data.timestampe;
	
	return good_bit;
}

// de-serialization operator for element PackageIdentifier
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepositoryIDL::PackageIdentifier &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize string-type element id
	ACE_CDR::ULongLong data_id_ll;
	good_bit = good_bit && cdr.read_ulonglong(data_id_ll);
	data.id = data_id_ll;
	// deserialize type element timestampe
	good_bit = good_bit && cdr >> data.timestampe;
	
	return good_bit;
}

// serialization operator for CommunicationObject PackageIdentifier
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepository::PackageIdentifier &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject PackageIdentifier
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepository::PackageIdentifier &obj)
{
	return cdr >> obj.set();
}
