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
#ifndef COMMLOCALIZATIONOBJECTS_VIEWPOINTLOCATION_CORE_H_
#define COMMLOCALIZATIONOBJECTS_VIEWPOINTLOCATION_CORE_H_

#include "CommLocalizationObjects/ViewpointLocationData.hh"
#include "CommLocalizationObjects/CPose2D.hh"
#include "CommLocalizationObjects/CMatrixDouble22.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommLocalizationObjects {
	
class ViewpointLocationCore {
protected:
	// data structure
	CommLocalizationObjectsIDL::ViewpointLocation idl_ViewpointLocation;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommLocalizationObjectsIDL::ViewpointLocation DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	ViewpointLocationCore();
	ViewpointLocationCore(const DATATYPE &data);
	// default destructor
	virtual ~ViewpointLocationCore();
	
	const DATATYPE& get() const { return idl_ViewpointLocation; }
	operator const DATATYPE&() const { return idl_ViewpointLocation; }
	DATATYPE& set() { return idl_ViewpointLocation; }

	static inline std::string identifier(void) { return "CommLocalizationObjects::ViewpointLocation"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Id
	inline int getId() const { return idl_ViewpointLocation.id; }
	inline ViewpointLocationCore& setId(const int &id) { idl_ViewpointLocation.id = id; return *this; }
	
	// getter and setter for element Mean
	inline CommLocalizationObjects::CPose2D getMean() const { return CommLocalizationObjects::CPose2D(idl_ViewpointLocation.mean); }
	inline ViewpointLocationCore& setMean(const CommLocalizationObjects::CPose2D &mean) { idl_ViewpointLocation.mean = mean; return *this; }
	
	// getter and setter for element Cov
	inline CommLocalizationObjects::CMatrixDouble22 getCov() const { return CommLocalizationObjects::CMatrixDouble22(idl_ViewpointLocation.cov); }
	inline ViewpointLocationCore& setCov(const CommLocalizationObjects::CMatrixDouble22 &cov) { idl_ViewpointLocation.cov = cov; return *this; }
	
	// getter and setter for element InvCov
	inline CommLocalizationObjects::CMatrixDouble22 getInvCov() const { return CommLocalizationObjects::CMatrixDouble22(idl_ViewpointLocation.invCov); }
	inline ViewpointLocationCore& setInvCov(const CommLocalizationObjects::CMatrixDouble22 &invCov) { idl_ViewpointLocation.invCov = invCov; return *this; }
	
	// getter and setter for element ObservationCount
	inline int getObservationCount() const { return idl_ViewpointLocation.observationCount; }
	inline ViewpointLocationCore& setObservationCount(const int &observationCount) { idl_ViewpointLocation.observationCount = observationCount; return *this; }
	
	// getter and setter for element PossibleObservations
	inline int getPossibleObservations() const { return idl_ViewpointLocation.possibleObservations; }
	inline ViewpointLocationCore& setPossibleObservations(const int &possibleObservations) { idl_ViewpointLocation.possibleObservations = possibleObservations; return *this; }
};

} /* namespace CommLocalizationObjects */
#endif /* COMMLOCALIZATIONOBJECTS_VIEWPOINTLOCATION_CORE_H_ */
