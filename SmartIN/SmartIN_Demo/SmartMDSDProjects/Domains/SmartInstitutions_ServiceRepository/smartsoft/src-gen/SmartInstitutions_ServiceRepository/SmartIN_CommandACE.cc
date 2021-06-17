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
#include "SmartInstitutions_ServiceRepository/SmartIN_CommandACE.hh"
#include <ace/SString.h>
#include "CommBasicObjects/CommTaskMessageACE.hh"

// serialization operator for element SmartIN_Command
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutions_ServiceRepositoryIDL::SmartIN_Command &data)
{
	ACE_CDR::Boolean good_bit = true;
	// serialize list-element msg
	good_bit = good_bit && cdr << data.msg;
	// serialize list-element commandID
	good_bit = good_bit && cdr.write_ulonglong(data.commandID);
	// serialize list-element command
	good_bit = good_bit && cdr << ACE_CString(data.command.c_str());
	
	return good_bit;
}

// de-serialization operator for element SmartIN_Command
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutions_ServiceRepositoryIDL::SmartIN_Command &data)
{
	ACE_CDR::Boolean good_bit = true;
	// deserialize type element msg
	good_bit = good_bit && cdr >> data.msg;
	// deserialize string-type element commandID
	ACE_CDR::ULongLong data_commandID_ll;
	good_bit = good_bit && cdr.read_ulonglong(data_commandID_ll);
	data.commandID = data_commandID_ll;
	// deserialize string-type element command
	ACE_CString data_command_str;
	good_bit = good_bit && cdr >> data_command_str;
	data.command = data_command_str.c_str();
	
	return good_bit;
}

// serialization operator for CommunicationObject SmartIN_Command
ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const SmartInstitutions_ServiceRepository::SmartIN_Command &obj)
{
	return cdr << obj.get();
}

// de-serialization operator for CommunicationObject SmartIN_Command
ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, SmartInstitutions_ServiceRepository::SmartIN_Command &obj)
{
	return cdr >> obj.set();
}