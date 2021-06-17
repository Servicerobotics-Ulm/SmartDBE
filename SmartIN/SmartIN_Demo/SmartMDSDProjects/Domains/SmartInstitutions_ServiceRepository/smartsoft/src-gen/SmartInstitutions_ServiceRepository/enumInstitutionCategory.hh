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
#ifndef SMARTINSTITUTIONS_SERVICEREPOSITORY_INSTITUTIONCATEGORY_ENUM_H_
#define SMARTINSTITUTIONS_SERVICEREPOSITORY_INSTITUTIONCATEGORY_ENUM_H_

#include <SmartInstitutions_ServiceRepository/enumInstitutionCategoryData.hh>

#include <string>
#include <iostream>

// SmartUtils used in from_xml method
#include "smartKnuthMorrisPratt.hh"

namespace SmartInstitutions_ServiceRepository {
	
	class InstitutionCategory {
	private:
		SmartInstitutions_ServiceRepositoryIDL::InstitutionCategory value;
		
	public:
		enum ENUM_InstitutionCategory {
			ENUM_VALUE_UNDEFINED = 0,
			SINGLE_MEMBER_INSTITUTE = 1,
			PAIR_INSTITUTE = 2,
			STATIC_MULTI_INSTITUTE = 3,
			DYNAMIC_MULTI_INSTITUTE = 4
		};
		
		// default constructor
		InstitutionCategory() { 
			value = ENUM_VALUE_UNDEFINED;
		}
		
		// copy constructor for enum type
		InstitutionCategory(ENUM_InstitutionCategory e) {
			value = static_cast<int>(e);
		}
		
		// copy constructor for IDL type
		InstitutionCategory(SmartInstitutions_ServiceRepositoryIDL::InstitutionCategory e) {
			value = e;
		}
		
		//const SmartInstitutions_ServiceRepositoryIDL::InstitutionCategory& get() const { return value; }
		
		// ENUM operator
		operator ENUM_InstitutionCategory() const {
			return static_cast<ENUM_InstitutionCategory>(value);
		}
		
		// compare operator
		bool operator == (const ENUM_InstitutionCategory t) const {
			return this->value == t;
		}
		
		std::string to_string() const {
			std::string result = "";
			switch (value) {
				case SINGLE_MEMBER_INSTITUTE:
					result = "InstitutionCategory::SINGLE_MEMBER_INSTITUTE";
					break;
				case PAIR_INSTITUTE:
					result = "InstitutionCategory::PAIR_INSTITUTE";
					break;
				case STATIC_MULTI_INSTITUTE:
					result = "InstitutionCategory::STATIC_MULTI_INSTITUTE";
					break;
				case DYNAMIC_MULTI_INSTITUTE:
					result = "InstitutionCategory::DYNAMIC_MULTI_INSTITUTE";
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
	
	inline std::ostream &operator<<(std::ostream &os, const InstitutionCategory &e)
	{
		e.to_ostream(os);
		return os;
	}
};

#endif
