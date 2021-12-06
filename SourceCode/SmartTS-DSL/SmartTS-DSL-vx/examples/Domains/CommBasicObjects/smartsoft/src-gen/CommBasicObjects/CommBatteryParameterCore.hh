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
#ifndef COMMBASICOBJECTS_COMMBATTERYPARAMETER_CORE_H_
#define COMMBASICOBJECTS_COMMBATTERYPARAMETER_CORE_H_

#include "CommBasicObjects/CommBatteryParameterData.hh"
#include "CommBasicObjects/enumComparisonState.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommBasicObjects {
	
class CommBatteryParameterCore {
protected:
	// data structure
	CommBasicObjectsIDL::CommBatteryParameter idl_CommBatteryParameter;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommBasicObjectsIDL::CommBatteryParameter DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	CommBatteryParameterCore();
	CommBatteryParameterCore(const DATATYPE &data);
	// default destructor
	virtual ~CommBatteryParameterCore();
	
	const DATATYPE& get() const { return idl_CommBatteryParameter; }
	operator const DATATYPE&() const { return idl_CommBatteryParameter; }
	DATATYPE& set() { return idl_CommBatteryParameter; }

	static inline std::string identifier(void) { return "CommBasicObjects::CommBatteryParameter"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element UpperThreshold
	inline double getUpperThreshold() const { return idl_CommBatteryParameter.upperThreshold; }
	inline CommBatteryParameterCore& setUpperThreshold(const double &upperThreshold) { idl_CommBatteryParameter.upperThreshold = upperThreshold; return *this; }
	
	// getter and setter for element LowerThreshold
	inline double getLowerThreshold() const { return idl_CommBatteryParameter.lowerThreshold; }
	inline CommBatteryParameterCore& setLowerThreshold(const double &lowerThreshold) { idl_CommBatteryParameter.lowerThreshold = lowerThreshold; return *this; }
	
	// getter and setter for element DesiredState
	inline CommBasicObjects::ComparisonState getDesiredState() const { return CommBasicObjects::ComparisonState(idl_CommBatteryParameter.desiredState); }
	inline CommBatteryParameterCore& setDesiredState(const CommBasicObjects::ComparisonState &desiredState) { idl_CommBatteryParameter.desiredState = desiredState; return *this; }
	
	// getter and setter for element CurrentState
	inline CommBasicObjects::ComparisonState getCurrentState() const { return CommBasicObjects::ComparisonState(idl_CommBatteryParameter.currentState); }
	inline CommBatteryParameterCore& setCurrentState(const CommBasicObjects::ComparisonState &currentState) { idl_CommBatteryParameter.currentState = currentState; return *this; }
};

} /* namespace CommBasicObjects */
#endif /* COMMBASICOBJECTS_COMMBATTERYPARAMETER_CORE_H_ */
