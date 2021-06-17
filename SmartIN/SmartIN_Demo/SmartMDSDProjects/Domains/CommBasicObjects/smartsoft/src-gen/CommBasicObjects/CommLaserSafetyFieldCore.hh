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
#ifndef COMMBASICOBJECTS_COMMLASERSAFETYFIELD_CORE_H_
#define COMMBASICOBJECTS_COMMLASERSAFETYFIELD_CORE_H_

#include "CommBasicObjects/CommLaserSafetyFieldData.hh"
#include "CommBasicObjects/enumSafetyFieldState.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommBasicObjects {
	
class CommLaserSafetyFieldCore {
protected:
	// data structure
	CommBasicObjectsIDL::CommLaserSafetyField idl_CommLaserSafetyField;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommBasicObjectsIDL::CommLaserSafetyField DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	CommLaserSafetyFieldCore();
	CommLaserSafetyFieldCore(const DATATYPE &data);
	// default destructor
	virtual ~CommLaserSafetyFieldCore();
	
	const DATATYPE& get() const { return idl_CommLaserSafetyField; }
	operator const DATATYPE&() const { return idl_CommLaserSafetyField; }
	DATATYPE& set() { return idl_CommLaserSafetyField; }

	static inline std::string identifier(void) { return "CommBasicObjects::CommLaserSafetyField"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element ProtectiveState
	inline CommBasicObjects::SafetyFieldState getProtectiveState() const { return CommBasicObjects::SafetyFieldState(idl_CommLaserSafetyField.protectiveState); }
	inline CommLaserSafetyFieldCore& setProtectiveState(const CommBasicObjects::SafetyFieldState &protectiveState) { idl_CommLaserSafetyField.protectiveState = protectiveState; return *this; }
	
	// getter and setter for element WarningState
	inline CommBasicObjects::SafetyFieldState getWarningState() const { return CommBasicObjects::SafetyFieldState(idl_CommLaserSafetyField.warningState); }
	inline CommLaserSafetyFieldCore& setWarningState(const CommBasicObjects::SafetyFieldState &warningState) { idl_CommLaserSafetyField.warningState = warningState; return *this; }
};

} /* namespace CommBasicObjects */
#endif /* COMMBASICOBJECTS_COMMLASERSAFETYFIELD_CORE_H_ */
