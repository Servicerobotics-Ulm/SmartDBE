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

// --------------------------------------------------------------------------
//
//  Copyright (C) 2009 Christian Schlegel, Andreas Steck, Matthias Lutz
//
//        schlegel@hs-ulm.de
//        steck@hs-ulm.de
//
//        ZAFH Servicerobotik Ulm
//        University of Applied Sciences
//        Prittwitzstr. 10
//        D-89075 Ulm
//        Germany
//
//  This file is part of the "SmartSoft Communication Classes".
//  It provides basic standardized data types for communication between
//  different components in the mobile robotics context. These classes
//  are designed to be used in conjunction with the SmartSoft Communication
//  Library.
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
// --------------------------------------------------------------------------

#include "CommNavigationObjects/CommPlannerGoal.hh"

#if defined (__GNUC__) && defined(__unix__)

#elif defined (WIN32)
#define _USE_MATH_DEFINES
#include <math.h>
#endif

using namespace CommNavigationObjects;

CommPlannerGoal::CommPlannerGoal()
:	CommPlannerGoalCore()
{  }


/**
 * Constructor to set all values.
 * NOTE that you have to keep this constructor consistent with the model!
 * Use  at your own choice.
 *
 * The preferred way to set values for initialization is:
 *      CommRepository::MyCommObject obj;
 *      obj.setX(1).setY(2).setZ(3)...;
CommPlannerGoal::CommPlannerGoal(const int &id, const int &flag, const double &xWayPoint, const double &yWayPoint, const double &hWayPoint, const double &xGoalPoint, const double &yGoalPoint, const double &hGoalPoint)
:	CommPlannerGoalCore() // base constructor sets default values as defined in the model
{
	setId(id);
	setFlag(flag);
	setXWayPoint(xWayPoint);
	setYWayPoint(yWayPoint);
	setHWayPoint(hWayPoint);
	setXGoalPoint(xGoalPoint);
	setYGoalPoint(yGoalPoint);
	setHGoalPoint(hGoalPoint);
}
 */

CommPlannerGoal::CommPlannerGoal(const CommPlannerGoalCore &commPlannerGoal)
:	CommPlannerGoalCore(commPlannerGoal)
{  }

CommPlannerGoal::CommPlannerGoal(const DATATYPE &commPlannerGoal)
:	CommPlannerGoalCore(commPlannerGoal)
{  }

CommPlannerGoal::~CommPlannerGoal()
{  }

void CommPlannerGoal::get_goal(double &xW,double &yW,double &hW,double &xG,double &yG,double &hG,long &id,long &flag)
{
  xW   = idl_CommPlannerGoal.xWayPoint;
  yW   = idl_CommPlannerGoal.yWayPoint;
  hW   = idl_CommPlannerGoal.hWayPoint;
  xG   = idl_CommPlannerGoal.xGoalPoint;
  yG   = idl_CommPlannerGoal.yGoalPoint;
  hG   = idl_CommPlannerGoal.hGoalPoint;
  id   = idl_CommPlannerGoal.id;
  flag = idl_CommPlannerGoal.flag;
  //std::cout << "GET Planner Goal from Comm object: "<<std::endl;
  //print();
}

void CommPlannerGoal::set_goal(double xW,double yW,double hW,double xG,double yG,double hG,long id,long flag)
{
	idl_CommPlannerGoal.xWayPoint  = xW;
	idl_CommPlannerGoal.yWayPoint  = yW;
	idl_CommPlannerGoal.hWayPoint  = hW;
	idl_CommPlannerGoal.xGoalPoint = xG;
	idl_CommPlannerGoal.yGoalPoint = yG;
	idl_CommPlannerGoal.hGoalPoint = hG;
	idl_CommPlannerGoal.id         = id;
	idl_CommPlannerGoal.flag       = flag;
}

void CommPlannerGoal::print(void) {
    std::cout << "Planner Way Point  x y h [mm,mm,deg] " << idl_CommPlannerGoal.xWayPoint << " " << idl_CommPlannerGoal.yWayPoint << " " << idl_CommPlannerGoal.hWayPoint*180.0/M_PI << "\n";
    std::cout << "Planner Goal Point x y h [mm,mm,deg] "<< idl_CommPlannerGoal.xGoalPoint << " " << idl_CommPlannerGoal.yGoalPoint << " " << idl_CommPlannerGoal.hGoalPoint*180.0/M_PI << "\n";
    std::cout << "Planner id flag " << idl_CommPlannerGoal.id << " " << idl_CommPlannerGoal.flag << "\n";
}
