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
#ifndef DOMAINTSDEMO_NESTEDIMPORT_CORE_H_
#define DOMAINTSDEMO_NESTEDIMPORT_CORE_H_

#include "DomainTSDemo/NestedImportData.hh"
#include "CommNavigationObjects/CommClosestNodeRequest.hh"
#include "DomainTSDemo/Coordinate3D.hh"
#include "DomainTSDemo/Coordinate3DPlus.hh"

#include <iostream>
#include <string>
#include <list>

namespace DomainTSDemo {
	
class NestedImportCore {
protected:
	// data structure
	DomainTSDemoIDL::NestedImport idl_NestedImport;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef DomainTSDemoIDL::NestedImport DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	NestedImportCore();
	NestedImportCore(const DATATYPE &data);
	// default destructor
	virtual ~NestedImportCore();
	
	const DATATYPE& get() const { return idl_NestedImport; }
	operator const DATATYPE&() const { return idl_NestedImport; }
	DATATYPE& set() { return idl_NestedImport; }

	static inline std::string identifier(void) { return "DomainTSDemo::NestedImport"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element A
	inline DomainTSDemo::Coordinate3D getA() const { return DomainTSDemo::Coordinate3D(idl_NestedImport.a); }
	inline NestedImportCore& setA(const DomainTSDemo::Coordinate3D &a) { idl_NestedImport.a = a; return *this; }
	
	// getter and setter for element Aa
	inline DomainTSDemo::Coordinate3DPlus getAa() const { return DomainTSDemo::Coordinate3DPlus(idl_NestedImport.aa); }
	inline NestedImportCore& setAa(const DomainTSDemo::Coordinate3DPlus &aa) { idl_NestedImport.aa = aa; return *this; }
	
	// getter and setter for element Aaa
	inline CommNavigationObjects::CommClosestNodeRequest getAaa() const { return CommNavigationObjects::CommClosestNodeRequest(idl_NestedImport.aaa); }
	inline NestedImportCore& setAaa(const CommNavigationObjects::CommClosestNodeRequest &aaa) { idl_NestedImport.aaa = aaa; return *this; }
};

} /* namespace DomainTSDemo */
#endif /* DOMAINTSDEMO_NESTEDIMPORT_CORE_H_ */
