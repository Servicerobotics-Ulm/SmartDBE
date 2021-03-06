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

#include "DomainTSDemo/BasicTime.hh"

using namespace DomainTSDemo;

BasicTime::BasicTime()
:	BasicTimeCore()
{  }


/**
 * Constructor to set all values.
 * NOTE that you have to keep this constructor consistent with the model!
 * Use  at your own choice.
 *
 * The preferred way to set values for initialization is:
 *      CommRepository::MyCommObject obj;
 *      obj.setX(1).setY(2).setZ(3)...;
BasicTime::BasicTime(const unsigned char &hour, const unsigned char &minute, const unsigned char &second)
:	BasicTimeCore() // base constructor sets default values as defined in the model
{
	setHour(hour);
	setMinute(minute);
	setSecond(second);
}
 */

BasicTime::BasicTime(const BasicTimeCore &basicTime)
:	BasicTimeCore(basicTime)
{  }

BasicTime::BasicTime(const DATATYPE &basicTime)
:	BasicTimeCore(basicTime)
{  }

BasicTime::~BasicTime()
{  }
