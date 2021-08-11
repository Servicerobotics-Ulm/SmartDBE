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

#ifndef SMARTINJOYSTICKNAVIGATION_OPC_UA_BACKEND_PORTFACTORY_HH_
#define SMARTINJOYSTICKNAVIGATION_OPC_UA_BACKEND_PORTFACTORY_HH_

// include the main component-definition class
#include "SmartINJoystickNavigationPortFactoryInterface.hh"

#include <thread>
#include <chrono>

// include SeRoNetSDK library
#include <SeRoNetSDK/SeRoNet/Utils/Task.hpp>
#include <SeRoNetSDK/SeRoNet/Utils/Component.hpp>

class SmartINJoystickNavigationOpcUaBackendPortFactory: public SmartINJoystickNavigationPortFactoryInterface
{
private:
	// internal component instance
	SeRoNet::Utils::Component *componentImpl;
	
	// component thread
	std::thread component_thread;
	
	// internal component thread method
	int task_execution();
public:
	SmartINJoystickNavigationOpcUaBackendPortFactory();
	virtual ~SmartINJoystickNavigationOpcUaBackendPortFactory();

	virtual void initialize(SmartINJoystickNavigation *component, int argc, char* argv[]) override;
	virtual int onStartup() override;

	virtual Smart::IPushClientPattern<SmartInstitutionsServiceRepository::EnforcementInstructionPackage> * createEnforcementInstruction_Push() override;
	virtual Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReplyPackage> * createEnforcementReply_Send() override;
	virtual Smart::IPushClientPattern<CommBasicObjects::CommJoystick> * createJoystickServiceIn() override;
	virtual Smart::ISendClientPattern<CommBasicObjects::CommNavigationVelocity> * createNavVelServiceOut() override;
	
	
	virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) override;
	virtual void destroy() override;
};

#endif /* SMARTINJOYSTICKNAVIGATION_SERONET_SDK_PORTFACTORY_HH_ */