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
#include "ComplianceManager.hh"
#include "ComponentA.hh"

#include <iostream>

ComplianceManager::ComplianceManager(SmartACE::SmartComponent *comp) 
:	ComplianceManagerCore(comp)
{
	std::cout << "constructor ComplianceManager\n";
}
ComplianceManager::~ComplianceManager() 
{
	std::cout << "destructor ComplianceManager\n";
}


void ComplianceManager::on_EnforcementInstruction_Push(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input)
{
	// upcall triggered from InputPort EnforcementInstruction_Push
	// - use a local mutex here, because this upcal is called asynchroneously from outside of this task
	// - do not use longer blocking calls here since this upcall blocks the InputPort EnforcementInstruction_Push
	// - if you need to implement a long-running procedure, do so within the on_execute() method and in
	//   there, use the method enforcementInstruction_PushGetUpdate(input) to get a copy of the input object
}
void ComplianceManager::on_EnforcementInstruction_Send(const SmartInstitutionsServiceRepository::EnforcementInstructionPackage &input)
{
	// upcall triggered from InputPort EnforcementInstruction_Send
	// - use a local mutex here, because this upcal is called asynchroneously from outside of this task
	// - do not use longer blocking calls here since this upcall blocks the InputPort EnforcementInstruction_Send
	// - if you need to implement a long-running procedure, do so within the on_execute() method and in
	//   there, use the method enforcementInstruction_SendGetUpdate(input) to get a copy of the input object
}

int ComplianceManager::on_entry()
{
	// do initialization procedures here, which are called once, each time the task is started
	// it is possible to return != 0 (e.g. when initialization fails) then the task is not executed further
	return 0;
}
int ComplianceManager::on_execute()
{
	// this method is called from an outside loop,
	// hence, NEVER use an infinite loop (like "while(1)") here inside!!!
	// also do not use blocking calls which do not result from smartsoft kernel
	
	// to get the incoming data, use this methods:
	Smart::StatusCode status;
	SmartInstitutionsServiceRepository::EnforcementInstructionPackage enforcementInstruction_PushObject;
	status = this->enforcementInstruction_PushGetUpdate(enforcementInstruction_PushObject);
	if(status != Smart::SMART_OK) {
		std::cerr << status << std::endl;
		// return 0;
	} else {
		std::cout << "received: " << enforcementInstruction_PushObject << std::endl;
	}
	SmartInstitutionsServiceRepository::EnforcementInstructionPackage enforcementInstruction_SendObject;
	status = this->enforcementInstruction_SendGetUpdate(enforcementInstruction_SendObject);
	if(status != Smart::SMART_OK) {
		std::cerr << status << std::endl;
		// return 0;
	} else {
		std::cout << "received: " << enforcementInstruction_SendObject << std::endl;
	}

	std::cout << "Hello from ComplianceManager " << std::endl;

	// it is possible to return != 0 (e.g. when the task detects errors), then the outer loop breaks and the task stops
	return 0;
}
int ComplianceManager::on_exit()
{
	// use this method to clean-up resources which are initialized in on_entry() and needs to be freed before the on_execute() can be called again
	return 0;
}
