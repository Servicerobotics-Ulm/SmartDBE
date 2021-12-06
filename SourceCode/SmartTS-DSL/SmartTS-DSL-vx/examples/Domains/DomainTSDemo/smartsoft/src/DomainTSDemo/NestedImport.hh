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
// This file is generated once. Modify this file to your needs. 
// If you want the toolchain to re-generate this file, please 
// delete it before running the code generator.
//--------------------------------------------------------------------------
#ifndef DOMAINTSDEMO_NESTEDIMPORT_H_
#define DOMAINTSDEMO_NESTEDIMPORT_H_

#include "DomainTSDemo/NestedImportCore.hh"

namespace DomainTSDemo {
		
class NestedImport : public NestedImportCore {
	public:
		// default constructors
		NestedImport();
		
		/**
		 * Constructor to set all values.
		 * NOTE that you have to keep this constructor consistent with the model!
		 * Use  at your own choice.
		 *
		 * The preferred way to set values for initialization is:
		 *      CommRepository::MyCommObject obj;
		 *      obj.setX(1).setY(2).setZ(3)...;
		 */
		// NestedImport(const DomainTSDemo::Coordinate3D &a, const DomainTSDemo::Coordinate3DPlus &aa, const CommNavigationObjects::CommClosestNodeRequest &aaa);
		
		NestedImport(const NestedImportCore &nestedImport);
		NestedImport(const DATATYPE &nestedImport);
		virtual ~NestedImport();
		
		// use framework specific getter and setter methods from core (base) class
		using NestedImportCore::get;
		using NestedImportCore::set;
		
		//
		// feel free to add customized methods here
		//
};

inline std::ostream &operator<<(std::ostream &os, const NestedImport &co)
{
	co.to_ostream(os);
	return os;
}
	
} /* namespace DomainTSDemo */
#endif /* DOMAINTSDEMO_NESTEDIMPORT_H_ */
