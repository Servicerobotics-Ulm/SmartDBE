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
#include "SmartInstitutionsServiceRepository/SmartIN_EventStateTypeACE.hh"
#include <ace/SString.h>
#include "SmartInstitutionsServiceRepository/MemberIdentifierACE.hh"
#include "SmartInstitutionsServiceRepository/SmartIN_EventMessageACE.hh"

// serialization operator for element SmartIN_EventStateType
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element targets
	good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.targets.size());
	std::vector<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>::const_iterator data_targetsIt;
	for(data_targetsIt=data.targets.begin(); data_targetsIt!=data.targets.end(); data_targetsIt++) {
		good_bit = good_bit && cdr << *data_targetsIt;
	}
	// serialize list-element message
	good_bit = good_bit && cdr << data.message;
	
	return good_bit;
}

// de-serialization operator for element SmartIN_EventStateType
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize list-type element targets
	ACE_CDR::ULong data_targetsNbr;
	good_bit = good_bit && cdr >> data_targetsNbr;
	data.targets.clear();
	SmartInstitutionsServiceRepositoryIDL::MemberIdentifier data_targetsItem;
	for(ACE_CDR::ULong i=0; i<data_targetsNbr; ++i) {
		good_bit = good_bit && cdr >> data_targetsItem;
		data.targets.push_back(data_targetsItem);
	}
	// deserialize type element message
	good_bit = good_bit && cdr >> data.message;
	
	return good_bit;
}

// serialization operator for CommunicationObject SmartIN_EventStateType
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutionsServiceRepository::SmartIN_EventStateType &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject SmartIN_EventStateType
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutionsServiceRepository::SmartIN_EventStateType &obj)
{
	return cdr >> obj.set();
}