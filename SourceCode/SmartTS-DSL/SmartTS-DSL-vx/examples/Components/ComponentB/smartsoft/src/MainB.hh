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
#ifndef _MAINB_HH
#define _MAINB_HH

#include "MainBCore.hh"

class MainB  : public MainBCore
{
private:
	virtual void on_Send_Coordinate2D_Input_Port(const DomainTSDemo::Coordinate2D &input);
public:
	MainB(SmartACE::SmartComponent *comp);
	virtual ~MainB();
	
	virtual int on_entry();
	virtual int on_execute();
	virtual int on_exit();
};

#endif