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
#ifndef _JOYSTICKSERVICEIN_4_UPCALL_INTERFACE_HH
#define _JOYSTICKSERVICEIN_4_UPCALL_INTERFACE_HH

#include "CommBasicObjects/CommJoystick.hh"

class JoystickServiceIn_4UpcallInterface {
public:
	virtual ~JoystickServiceIn_4UpcallInterface() {  }

	virtual void on_JoystickServiceIn_4(const CommBasicObjects::CommJoystick &input) = 0;
};

#endif
