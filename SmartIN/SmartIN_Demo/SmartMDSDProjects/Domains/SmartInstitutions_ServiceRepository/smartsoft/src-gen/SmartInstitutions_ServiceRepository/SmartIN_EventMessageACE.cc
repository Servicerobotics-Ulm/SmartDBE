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
#include "SmartInstitutions_ServiceRepository/SmartIN_EventMessageACE.hh"
#include <ace/SString.h>
#include "SmartInstitutions_ServiceRepository/EnforcementReportPackageACE.hh"
#include "SmartInstitutions_ServiceRepository/EnforcementInstructionPackageACE.hh"
#include "SmartInstitutions_ServiceRepository/EnforcementReplyPackageACE.hh"
#include "SmartInstitutions_ServiceRepository/enumSmartINPackageTypeEnumsData.hh"

// serialization operator for element SmartIN_EventMessage
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutions_ServiceRepositoryIDL::SmartIN_EventMessage &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element usetype
	good_bit = good_bit && cdr.write_long(data.usetype);
	// serialize list-element ifEnforcementInstructionPackage
	good_bit = good_bit && cdr << data.ifEnforcementInstructionPackage;
	// serialize list-element ifEnforcementReplyPackage
	good_bit = good_bit && cdr << data.ifEnforcementReplyPackage;
	// serialize list-element ifEnforcementReportPackage
	good_bit = good_bit && cdr << data.ifEnforcementReportPackage;
	
	return good_bit;
}

// de-serialization operator for element SmartIN_EventMessage
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutions_ServiceRepositoryIDL::SmartIN_EventMessage &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element usetype
	good_bit = good_bit && cdr.read_long(data.usetype);
	// deserialize type element ifEnforcementInstructionPackage
	good_bit = good_bit && cdr >> data.ifEnforcementInstructionPackage;
	// deserialize type element ifEnforcementReplyPackage
	good_bit = good_bit && cdr >> data.ifEnforcementReplyPackage;
	// deserialize type element ifEnforcementReportPackage
	good_bit = good_bit && cdr >> data.ifEnforcementReportPackage;
	
	return good_bit;
}

// serialization operator for CommunicationObject SmartIN_EventMessage
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutions_ServiceRepository::SmartIN_EventMessage &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject SmartIN_EventMessage
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutions_ServiceRepository::SmartIN_EventMessage &obj)
{
	return cdr >> obj.set();
}