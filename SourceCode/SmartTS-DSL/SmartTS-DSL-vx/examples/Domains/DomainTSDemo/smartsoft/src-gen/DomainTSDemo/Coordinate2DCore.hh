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
#ifndef DOMAINTSDEMO_COORDINATE2D_CORE_H_
#define DOMAINTSDEMO_COORDINATE2D_CORE_H_

#include "DomainTSDemo/Coordinate2DData.hh"

#include <iostream>
#include <string>
#include <list>

namespace DomainTSDemo {
	
class Coordinate2DCore {
protected:
	// data structure
	DomainTSDemoIDL::Coordinate2D idl_Coordinate2D;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef DomainTSDemoIDL::Coordinate2D DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	Coordinate2DCore();
	Coordinate2DCore(const DATATYPE &data);
	// default destructor
	virtual ~Coordinate2DCore();
	
	const DATATYPE& get() const { return idl_Coordinate2D; }
	operator const DATATYPE&() const { return idl_Coordinate2D; }
	DATATYPE& set() { return idl_Coordinate2D; }

	static inline std::string identifier(void) { return "DomainTSDemo::Coordinate2D"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element X
	inline double getX() const { return idl_Coordinate2D.x; }
	inline Coordinate2DCore& setX(const double &x) { idl_Coordinate2D.x = x; return *this; }
	
	// getter and setter for element Y
	inline double getY() const { return idl_Coordinate2D.y; }
	inline Coordinate2DCore& setY(const double &y) { idl_Coordinate2D.y = y; return *this; }
};

} /* namespace DomainTSDemo */
#endif /* DOMAINTSDEMO_COORDINATE2D_CORE_H_ */