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
#ifndef _JOYSTICKSERVCIEOUTWRAPPER_HH
#define _JOYSTICKSERVCIEOUTWRAPPER_HH

#include <mutex>
#include "aceSmartSoft.hh"

// include communication objects
#include <CommBasicObjects/CommJoystick.hh>
#include <CommBasicObjects/CommJoystickACE.hh>


class JoystickServcieOutWrapper
{
private:
	std::mutex update_mutex;
	Smart::StatusCode update_status;
	
	CommBasicObjects::CommJoystick updateData;
	
	Smart::IPushServerPattern<CommBasicObjects::CommJoystick> *joystickServcieOut;
	
public:
	JoystickServcieOutWrapper(Smart::IPushServerPattern<CommBasicObjects::CommJoystick> *joystickServcieOut);
	virtual ~JoystickServcieOutWrapper();
	
	Smart::StatusCode put(CommBasicObjects::CommJoystick &joystickServcieOutDataObject);
	
	Smart::StatusCode getLatestUpdate(CommBasicObjects::CommJoystick &joystickServcieOutDataObject);
	
};

#endif // _JOYSTICKSERVCIEOUTWRAPPER_HH
