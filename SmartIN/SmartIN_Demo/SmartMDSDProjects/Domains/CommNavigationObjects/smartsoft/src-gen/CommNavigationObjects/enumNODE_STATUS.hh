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
#ifndef COMMNAVIGATIONOBJECTS_NODE_STATUS_ENUM_H_
#define COMMNAVIGATIONOBJECTS_NODE_STATUS_ENUM_H_

#include <CommNavigationObjects/enumNODE_STATUSData.hh>

#include <string>
#include <iostream>

// SmartUtils used in from_xml method
#include "smartKnuthMorrisPratt.hh"

namespace CommNavigationObjects {
	
	class NODE_STATUS {
	private:
		CommNavigationObjectsIDL::NODE_STATUS value;
		
	public:
		enum ENUM_NODE_STATUS {
			ENUM_VALUE_UNDEFINED = 0,
			OCCUPIED = 1,
			AVAILABLE = 2,
			OK = 3
		};
		
		// default constructor
		NODE_STATUS() { 
			value = ENUM_VALUE_UNDEFINED;
		}
		
		// copy constructor for enum type
		NODE_STATUS(ENUM_NODE_STATUS e) {
			value = static_cast<int>(e);
		}
		
		// copy constructor for IDL type
		NODE_STATUS(CommNavigationObjectsIDL::NODE_STATUS e) {
			value = e;
		}
		
		//const CommNavigationObjectsIDL::NODE_STATUS& get() const { return value; }
		
		// ENUM operator
		operator ENUM_NODE_STATUS() const {
			return static_cast<ENUM_NODE_STATUS>(value);
		}
		
		// compare operator
		bool operator == (const ENUM_NODE_STATUS t) const {
			return this->value == t;
		}
		
		std::string to_string() const {
			std::string result = "";
			switch (value) {
				case OCCUPIED:
					result = "NODE_STATUS::OCCUPIED";
					break;
				case AVAILABLE:
					result = "NODE_STATUS::AVAILABLE";
					break;
				case OK:
					result = "NODE_STATUS::OK";
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
	
	inline std::ostream &operator<<(std::ostream &os, const NODE_STATUS &e)
	{
		e.to_ostream(os);
		return os;
	}
};

#endif