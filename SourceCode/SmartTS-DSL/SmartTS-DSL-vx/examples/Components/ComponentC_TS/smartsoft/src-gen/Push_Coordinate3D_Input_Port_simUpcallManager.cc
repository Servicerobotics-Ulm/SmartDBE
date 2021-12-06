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
#include "Push_Coordinate3D_Input_Port_simUpcallManager.hh"

Push_Coordinate3D_Input_Port_simUpcallManager::Push_Coordinate3D_Input_Port_simUpcallManager(
	Smart::InputSubject<DomainTSDemo::Coordinate3D> *subject,
	const int &prescaleFactor)
	:	Smart::IInputHandler<DomainTSDemo::Coordinate3D>(subject, prescaleFactor)
{  }
Push_Coordinate3D_Input_Port_simUpcallManager::~Push_Coordinate3D_Input_Port_simUpcallManager()
{  }

void Push_Coordinate3D_Input_Port_simUpcallManager::notify_upcalls(const DomainTSDemo::Coordinate3D &input)
{
	for(auto it=upcalls.begin(); it!=upcalls.end(); it++) {
		(*it)->on_Push_Coordinate3D_Input_Port_sim(input);
	}
}

void Push_Coordinate3D_Input_Port_simUpcallManager::attach(Push_Coordinate3D_Input_Port_simUpcallInterface *upcall)
{
	upcalls.push_back(upcall);
}
void Push_Coordinate3D_Input_Port_simUpcallManager::detach(Push_Coordinate3D_Input_Port_simUpcallInterface *upcall)
{
	upcalls.remove(upcall);
}