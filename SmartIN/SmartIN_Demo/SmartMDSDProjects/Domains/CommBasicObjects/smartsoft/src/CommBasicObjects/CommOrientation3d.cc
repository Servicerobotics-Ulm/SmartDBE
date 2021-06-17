//--------------------------------------------------------------------------
// Code generated by the SmartSoft MDSD Toolchain
// The SmartSoft Toolchain has been developed by:
//  
// Christian Schlegel (schlegel@hs-ulm.de)
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

#include "CommBasicObjects/CommOrientation3d.hh"

using namespace CommBasicObjects;

CommOrientation3d::CommOrientation3d()
:	CommOrientation3dCore()
{  }


/**
 * Constructor to set all values.
 * NOTE that you have to keep this constructor consistent with the model!
 * Use  at your own choice.
 *
 * The preferred way to set values for initialization is:
 *      CommRepository::MyCommObject obj;
 *      obj.setX(1).setY(2).setZ(3)...;
CommOrientation3d::CommOrientation3d(const double &azimuth, const double &elevation, const double &roll)
:	CommOrientation3dCore() // base constructor sets default values as defined in the model
{
	setAzimuth(azimuth);
	setElevation(elevation);
	setRoll(roll);
}
 */

CommOrientation3d::CommOrientation3d(const CommOrientation3dCore &commOrientation3d)
:	CommOrientation3dCore(commOrientation3d)
{  }

CommOrientation3d::CommOrientation3d(const DATATYPE &commOrientation3d)
:	CommOrientation3dCore(commOrientation3d)
{  }

CommOrientation3d::~CommOrientation3d()
{  }