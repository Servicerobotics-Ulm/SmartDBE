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
//--------------------------------------------------------------------------
//
//  Copyright (C) 2021 Thomas Feldmeier
//
//        schlegel@hs-ulm.de
//
//        Servicerobotic Ulm
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
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
//--------------------------------------------------------------------------


#ifndef _WEBOTSAPITASK_HH
#define _WEBOTSAPITASK_HH

#include "WebotsAPITaskCore.hh"

#include <iostream>

#include <webots/Supervisor.hpp>
#include <webots/Motor.hpp>
#include <webots/Keyboard.hpp>
#include <vector>

#include "ParameterStateStruct.hh"

#define SECOND_TO_MILLISECONDS 1000.0  // conversion factor

struct Pose2D{
    double x, y, heading;
};
struct Coord {
    double x, y, z;
};

class WebotsAPITask  : public WebotsAPITaskCore
{
private:

    SmartACE::SmartMutex mRobotMutex;

    Pose2D oldRealPose, oldOdomPose;

    long long sequence=0;

    struct webotsMotor {
        webots::Motor *motor;
        double radius;
        double distanceToRobotCentre;
        double heading;
    };

    double maxAcceleration[3];

    std::vector<webotsMotor> webotsMotors;

    webots::Supervisor *webotsRobot;
    webots::Keyboard *webotsKeyboard;
    webots::Motor* webotsWheels[3];
    std::string webotsRobotName;

    std::mutex mutex_targetSpeed;
    double targetSpeed[3];
    bool isNUE;

    Coord webots2smart(const double* coords);

public:
    WebotsAPITask(SmartACE::SmartComponent *comp);
    virtual ~WebotsAPITask();
    void resetOdomPose();

    void setVxVyOmega( double vX, double vY, double omega );

    virtual int on_entry();
    virtual int on_execute();
    virtual int on_exit();
};

#endif