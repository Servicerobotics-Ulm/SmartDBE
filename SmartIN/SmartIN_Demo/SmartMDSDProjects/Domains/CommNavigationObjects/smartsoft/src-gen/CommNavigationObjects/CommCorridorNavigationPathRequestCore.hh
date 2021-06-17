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
#ifndef COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONPATHREQUEST_CORE_H_
#define COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONPATHREQUEST_CORE_H_

#include "CommNavigationObjects/CommCorridorNavigationPathRequestData.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommNavigationObjects {
	
class CommCorridorNavigationPathRequestCore {
protected:
	// data structure
	CommNavigationObjectsIDL::CommCorridorNavigationPathRequest idl_CommCorridorNavigationPathRequest;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommNavigationObjectsIDL::CommCorridorNavigationPathRequest DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	CommCorridorNavigationPathRequestCore();
	CommCorridorNavigationPathRequestCore(const DATATYPE &data);
	// default destructor
	virtual ~CommCorridorNavigationPathRequestCore();
	
	const DATATYPE& get() const { return idl_CommCorridorNavigationPathRequest; }
	operator const DATATYPE&() const { return idl_CommCorridorNavigationPathRequest; }
	DATATYPE& set() { return idl_CommCorridorNavigationPathRequest; }

	static inline std::string identifier(void) { return "CommNavigationObjects::CommCorridorNavigationPathRequest"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element StartPose
	inline unsigned int getStartPose() const { return idl_CommCorridorNavigationPathRequest.startPose; }
	inline CommCorridorNavigationPathRequestCore& setStartPose(const unsigned int &startPose) { idl_CommCorridorNavigationPathRequest.startPose = startPose; return *this; }
	
	// getter and setter for element GoalPose
	inline unsigned int getGoalPose() const { return idl_CommCorridorNavigationPathRequest.goalPose; }
	inline CommCorridorNavigationPathRequestCore& setGoalPose(const unsigned int &goalPose) { idl_CommCorridorNavigationPathRequest.goalPose = goalPose; return *this; }
};

} /* namespace CommNavigationObjects */
#endif /* COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONPATHREQUEST_CORE_H_ */
