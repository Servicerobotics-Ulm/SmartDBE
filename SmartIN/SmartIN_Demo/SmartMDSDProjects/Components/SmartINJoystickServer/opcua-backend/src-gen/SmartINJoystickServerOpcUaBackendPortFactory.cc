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

#include "SmartINJoystickServerOpcUaBackendPortFactory.hh"

// include all potentially required pattern implementations
#include <SeRoNetSDK/SeRoNet/OPCUA/Client/PushClient.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Client/EventClient.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Client/QClientOPCUA.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Client/SendClient.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Client/QueryClient.hpp>

#include <SeRoNetSDK/SeRoNet/OPCUA/Server/PushServer.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Server/EventServer.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Server/SendServer.hpp>
#include <SeRoNetSDK/SeRoNet/OPCUA/Server/QueryServer.hpp>

// include referenced CommunicationObject SeRoNetSDK self description implementations
#include "CommBasicObjectsOpcUa/CommJoystickOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/EnforcementReportPackageOpcUa.hh"

// create a static instance of the OpcUaBackendPortFactory
static SmartINJoystickServerOpcUaBackendPortFactory OpcUaBackendPortFactory;

SmartINJoystickServerOpcUaBackendPortFactory::SmartINJoystickServerOpcUaBackendPortFactory()
{  
	componentImpl = 0;
	SmartINJoystickServer::instance()->addPortFactory("OpcUa_SeRoNet", this);
}

SmartINJoystickServerOpcUaBackendPortFactory::~SmartINJoystickServerOpcUaBackendPortFactory()
{  }

void SmartINJoystickServerOpcUaBackendPortFactory::initialize(SmartINJoystickServer *component, int argc, char* argv[])
{
	componentImpl = new SeRoNet::Utils::Component(component->connections.component.name);
}

int SmartINJoystickServerOpcUaBackendPortFactory::onStartup()
{
	if (!component_thread.joinable()) {
    	component_thread = std::thread(&SmartINJoystickServerOpcUaBackendPortFactory::task_execution, this);
    	return 0;
    }
	return -1;
}

Smart::ISendClientPattern<SmartInstitutionsServiceRepository::EnforcementReportPackage> * SmartINJoystickServerOpcUaBackendPortFactory::createEnforcementReport_Send()
{
	return new SeRoNet::OPCUA::Client::SendClient<SmartInstitutionsServiceRepository::EnforcementReportPackage>(componentImpl);
}


Smart::IPushServerPattern<CommBasicObjects::CommJoystick> * SmartINJoystickServerOpcUaBackendPortFactory::createJoystickServcieOut(const std::string &serviceName)
{
	return new SeRoNet::OPCUA::Server::PushServer<CommBasicObjects::CommJoystick>(componentImpl, serviceName);
}


int SmartINJoystickServerOpcUaBackendPortFactory::task_execution()
{
	componentImpl->run();
	return 0;
}

int SmartINJoystickServerOpcUaBackendPortFactory::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
{
	// stop component-internal infrastructure
	componentImpl->stopRunning();
	// wait on component thread to exit
	if (component_thread.joinable()) {
		// FIXME: don't wait infinetly (use timeoutTime here)
    	component_thread.join();
    }
	return 0;
}

void SmartINJoystickServerOpcUaBackendPortFactory::destroy()
{
	// clean-up component's internally used resources
	delete componentImpl;
}