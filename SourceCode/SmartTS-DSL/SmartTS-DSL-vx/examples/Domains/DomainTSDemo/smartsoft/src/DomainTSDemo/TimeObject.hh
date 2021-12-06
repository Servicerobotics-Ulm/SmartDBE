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
#ifndef DOMAINTSDEMO_TIMEOBJECT_H_
#define DOMAINTSDEMO_TIMEOBJECT_H_

#include "DomainTSDemo/TimeObjectCore.hh"

namespace DomainTSDemo {
		
class TimeObject : public TimeObjectCore {
	public:
		// default constructors
		TimeObject();
		
		/**
		 * Constructor to set all values.
		 * NOTE that you have to keep this constructor consistent with the model!
		 * Use  at your own choice.
		 *
		 * The preferred way to set values for initialization is:
		 *      CommRepository::MyCommObject obj;
		 *      obj.setX(1).setY(2).setZ(3)...;
		 */
		// TimeObject(const DomainTSDemo::BasicTime &basic, const CommBasicObjects::CommTimeStamp &compound);
		
		TimeObject(const TimeObjectCore &timeObject);
		TimeObject(const DATATYPE &timeObject);
		virtual ~TimeObject();
		
		// use framework specific getter and setter methods from core (base) class
		using TimeObjectCore::get;
		using TimeObjectCore::set;
		
		//
		// feel free to add customized methods here
		//
};

inline std::ostream &operator<<(std::ostream &os, const TimeObject &co)
{
	co.to_ostream(os);
	return os;
}
	
} /* namespace DomainTSDemo */
#endif /* DOMAINTSDEMO_TIMEOBJECT_H_ */
