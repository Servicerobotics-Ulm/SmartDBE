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
#ifndef DOMAINTSDEMO_COORDINATE3D_H_
#define DOMAINTSDEMO_COORDINATE3D_H_

#include "DomainTSDemo/Coordinate3DCore.hh"

namespace DomainTSDemo {
		
class Coordinate3D : public Coordinate3DCore {
	public:
		// default constructors
		Coordinate3D();
		
		/**
		 * Constructor to set all values.
		 * NOTE that you have to keep this constructor consistent with the model!
		 * Use  at your own choice.
		 *
		 * The preferred way to set values for initialization is:
		 *      CommRepository::MyCommObject obj;
		 *      obj.setX(1).setY(2).setZ(3)...;
		 */
		// Coordinate3D(const double &x = 0.0, const double &y = 0.0, const double &z = 0.0);
		
		Coordinate3D(const Coordinate3DCore &coordinate3D);
		Coordinate3D(const DATATYPE &coordinate3D);
		virtual ~Coordinate3D();
		
		// use framework specific getter and setter methods from core (base) class
		using Coordinate3DCore::get;
		using Coordinate3DCore::set;
		
		//
		// feel free to add customized methods here
		//
};

inline std::ostream &operator<<(std::ostream &os, const Coordinate3D &co)
{
	co.to_ostream(os);
	return os;
}
	
} /* namespace DomainTSDemo */
#endif /* DOMAINTSDEMO_COORDINATE3D_H_ */
