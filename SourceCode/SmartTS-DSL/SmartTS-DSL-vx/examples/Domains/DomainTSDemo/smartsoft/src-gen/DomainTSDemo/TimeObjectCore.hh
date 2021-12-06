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
#ifndef DOMAINTSDEMO_TIMEOBJECT_CORE_H_
#define DOMAINTSDEMO_TIMEOBJECT_CORE_H_

#include "DomainTSDemo/TimeObjectData.hh"
#include "CommBasicObjects/CommTimeStamp.hh"
#include "DomainTSDemo/BasicTime.hh"

#include <iostream>
#include <string>
#include <list>

namespace DomainTSDemo {
	
class TimeObjectCore {
protected:
	// data structure
	DomainTSDemoIDL::TimeObject idl_TimeObject;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef DomainTSDemoIDL::TimeObject DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	TimeObjectCore();
	TimeObjectCore(const DATATYPE &data);
	// default destructor
	virtual ~TimeObjectCore();
	
	const DATATYPE& get() const { return idl_TimeObject; }
	operator const DATATYPE&() const { return idl_TimeObject; }
	DATATYPE& set() { return idl_TimeObject; }

	static inline std::string identifier(void) { return "DomainTSDemo::TimeObject"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Basic
	inline DomainTSDemo::BasicTime getBasic() const { return DomainTSDemo::BasicTime(idl_TimeObject.basic); }
	inline TimeObjectCore& setBasic(const DomainTSDemo::BasicTime &basic) { idl_TimeObject.basic = basic; return *this; }
	
	// getter and setter for element Compound
	inline CommBasicObjects::CommTimeStamp getCompound() const { return CommBasicObjects::CommTimeStamp(idl_TimeObject.compound); }
	inline TimeObjectCore& setCompound(const CommBasicObjects::CommTimeStamp &compound) { idl_TimeObject.compound = compound; return *this; }
};

} /* namespace DomainTSDemo */
#endif /* DOMAINTSDEMO_TIMEOBJECT_CORE_H_ */