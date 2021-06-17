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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTINSTRUCTION_ENUM_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTINSTRUCTION_ENUM_H_

#include <SmartInstitutionsServiceRepository/enumEnforcementInstructionData.hh>

#include <string>
#include <iostream>

// SmartUtils used in from_xml method
#include "smartKnuthMorrisPratt.hh"

namespace SmartInstitutionsServiceRepository {
	
	class EnforcementInstruction {
	private:
		SmartInstitutionsServiceRepositoryIDL::EnforcementInstruction value;
		
	public:
		enum ENUM_EnforcementInstruction {
			ENUM_VALUE_UNDEFINED = 0,
			START = 1,
			PAUSE = 2,
			STOP = 3,
			FORMED = 4,
			FOUNDED = 5,
			FULFILLED = 6,
			INFORM = 7,
			WARNING = 8,
			NOTICE = 9,
			EJECTED = 10,
			CUSTOM = 11
		};
		
		// default constructor
		EnforcementInstruction() { 
			value = ENUM_VALUE_UNDEFINED;
		}
		
		// copy constructor for enum type
		EnforcementInstruction(ENUM_EnforcementInstruction e) {
			value = static_cast<int>(e);
		}
		
		// copy constructor for IDL type
		EnforcementInstruction(SmartInstitutionsServiceRepositoryIDL::EnforcementInstruction e) {
			value = e;
		}
		
		//const SmartInstitutionsServiceRepositoryIDL::EnforcementInstruction& get() const { return value; }
		
		// ENUM operator
		operator ENUM_EnforcementInstruction() const {
			return static_cast<ENUM_EnforcementInstruction>(value);
		}
		
		// compare operator
		bool operator == (const ENUM_EnforcementInstruction t) const {
			return this->value == t;
		}
		
		std::string to_string() const {
			std::string result = "";
			switch (value) {
				case START:
					result = "EnforcementInstruction::START";
					break;
				case PAUSE:
					result = "EnforcementInstruction::PAUSE";
					break;
				case STOP:
					result = "EnforcementInstruction::STOP";
					break;
				case FORMED:
					result = "EnforcementInstruction::FORMED";
					break;
				case FOUNDED:
					result = "EnforcementInstruction::FOUNDED";
					break;
				case FULFILLED:
					result = "EnforcementInstruction::FULFILLED";
					break;
				case INFORM:
					result = "EnforcementInstruction::INFORM";
					break;
				case WARNING:
					result = "EnforcementInstruction::WARNING";
					break;
				case NOTICE:
					result = "EnforcementInstruction::NOTICE";
					break;
				case EJECTED:
					result = "EnforcementInstruction::EJECTED";
					break;
				case CUSTOM:
					result = "EnforcementInstruction::CUSTOM";
					break;
				default:
					result = "ENUM_VALUE_UNDEFINED";
					break;
			};
			return result;
		}
		
		// helper method to easily implement output stream
		void to_ostream(std::ostream &os = std::cout) const {
			os << to_string();
		}
		
		// convert to xml stream
		void to_xml(std::ostream &os, const std::string &indent = "") const {
			os << indent << "<value>" << value << "</value>";
		}
		
		// restore from xml stream
		void from_xml(std::istream &is) {
			static const Smart::KnuthMorrisPratt kmp_value("<value>");
			if(kmp_value.search(is)) {
				is >> value;
			}
		}
	
	};
	
	inline std::ostream &operator<<(std::ostream &os, const EnforcementInstruction &e)
	{
		e.to_ostream(os);
		return os;
	}
};

#endif
