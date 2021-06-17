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
#ifndef SMARTINSTITUTIONS_SERVICEREPOSITORY_PACKAGEIDENTIFIER_CORE_H_
#define SMARTINSTITUTIONS_SERVICEREPOSITORY_PACKAGEIDENTIFIER_CORE_H_

#include "SmartInstitutions_ServiceRepository/PackageIdentifierData.hh"
#include "CommBasicObjects/CommTimeStamp.hh"

#include <iostream>
#include <string>
#include <list>

namespace SmartInstitutions_ServiceRepository {
	
class PackageIdentifierCore {
protected:
	// data structure
	SmartInstitutions_ServiceRepositoryIDL::PackageIdentifier idl_PackageIdentifier;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef SmartInstitutions_ServiceRepositoryIDL::PackageIdentifier DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	PackageIdentifierCore();
	PackageIdentifierCore(const DATATYPE &data);
	// default destructor
	virtual ~PackageIdentifierCore();
	
	const DATATYPE& get() const { return idl_PackageIdentifier; }
	operator const DATATYPE&() const { return idl_PackageIdentifier; }
	DATATYPE& set() { return idl_PackageIdentifier; }

	static inline std::string identifier(void) { return "SmartInstitutions_ServiceRepository::PackageIdentifier"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Id
	inline unsigned long int getId() const { return idl_PackageIdentifier.id; }
	inline PackageIdentifierCore& setId(const unsigned long int &id) { idl_PackageIdentifier.id = id; return *this; }
	
	// getter and setter for element Timestampe
	inline CommBasicObjects::CommTimeStamp getTimestampe() const { return CommBasicObjects::CommTimeStamp(idl_PackageIdentifier.timestampe); }
	inline PackageIdentifierCore& setTimestampe(const CommBasicObjects::CommTimeStamp &timestampe) { idl_PackageIdentifier.timestampe = timestampe; return *this; }
};

} /* namespace SmartInstitutions_ServiceRepository */
#endif /* SMARTINSTITUTIONS_SERVICEREPOSITORY_PACKAGEIDENTIFIER_CORE_H_ */