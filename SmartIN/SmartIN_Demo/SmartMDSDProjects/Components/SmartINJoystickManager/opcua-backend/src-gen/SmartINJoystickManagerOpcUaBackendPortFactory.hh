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

#ifndef SMARTINJOYSTICKMANAGER_OPC_UA_BACKEND_PORTFACTORY_HH_
#define SMARTINJOYSTICKMANAGER_OPC_UA_BACKEND_PORTFACTORY_HH_

// include the main component-definition class
#include "SmartINJoystickManagerPortFactoryInterface.hh"

#include <thread>
#include <chrono>

// include SeRoNetSDK library
#include <SeRoNetSDK/SeRoNet/Utils/Task.hpp>
#include <SeRoNetSDK/SeRoNet/Utils/Component.hpp>

class SmartINJoystickManagerOpcUaBackendPortFactory: public SmartINJoystickManagerPortFactoryInterface
{
private:
	// internal component instance
	SeRoNet::Utils::Component *componentImpl;
	
	// component thread
	std::thread component_thread;
	
	// internal component thread method
	int task_execution();
public:
	SmartINJoystickManagerOpcUaBackendPortFactory();
	virtual ~SmartINJoystickManagerOpcUaBackendPortFactory();

	virtual void initialize(SmartINJoystickManager *component, int argc, char* argv[]) override;
	virtual int onStartup() override;

	virtual Smart::IPushClientPattern<CommBasicObjects::CommJoystick> * createJoystickServiceIn_1() override;
	virtual Smart::IPushClientPattern<CommBasicObjects::CommJoystick> * createJoystickServiceIn_2() override;
	virtual Smart::IPushClientPattern<CommBasicObjects::CommJoystick> * createJoystickServiceIn_3() override;
	virtual Smart::IPushClientPattern<CommBasicObjects::CommJoystick> * createJoystickServiceIn_4() override;
	virtual Smart::IPushClientPattern<CommBasicObjects::CommJoystick> * createJoystickServiceIn_5() override;
	
	virtual Smart::IPushServerPattern<CommBasicObjects::CommJoystick> * createJoystickServiceOut(const std::string &serviceName) override;
	virtual Smart::IQueryServerPattern<SmartInstitutionsServiceRepository::MemberIdentifier, SmartInstitutionsServiceRepository::EnforcementReportPackage> * createReport_QueryResponder(const std::string &serviceName) override;
	
	virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) override;
	virtual void destroy() override;
};

#endif /* SMARTINJOYSTICKMANAGER_SERONET_SDK_PORTFACTORY_HH_ */
