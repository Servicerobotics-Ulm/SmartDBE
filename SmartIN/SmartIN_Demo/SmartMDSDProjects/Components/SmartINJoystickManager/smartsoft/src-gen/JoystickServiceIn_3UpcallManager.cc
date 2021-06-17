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
#include "JoystickServiceIn_3UpcallManager.hh"

JoystickServiceIn_3UpcallManager::JoystickServiceIn_3UpcallManager(
	Smart::InputSubject<CommBasicObjects::CommJoystick> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<CommBasicObjects::CommJoystick>(subject, prescaleFactor)
{  }
JoystickServiceIn_3UpcallManager::~JoystickServiceIn_3UpcallManager()
{  }

void JoystickServiceIn_3UpcallManager::notify_upcalls(const CommBasicObjects::CommJoystick &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_JoystickServiceIn_3(input);
	}
}

void JoystickServiceIn_3UpcallManager::attach(JoystickServiceIn_3UpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void JoystickServiceIn_3UpcallManager::detach(JoystickServiceIn_3UpcallInterface *upcall)
{
	upcalls.remove(upcall);
}
