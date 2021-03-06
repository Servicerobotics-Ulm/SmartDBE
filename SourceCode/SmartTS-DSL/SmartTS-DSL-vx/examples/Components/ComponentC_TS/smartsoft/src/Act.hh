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
#ifndef _ACT_HH
#define _ACT_HH

#include "ActCore.hh"

class Act  : public ActCore
{
private:
	virtual void on_Push_Coordinate3D_Input_Port_sim(const DomainTSDemo::Coordinate3D &input);
	virtual void on_Send_Coordinate2D_Output_Port_ts(const DomainTSDemo::Coordinate2D &input);
public:
	Act(SmartACE::SmartComponent *comp);
	virtual ~Act();
	
	virtual int on_entry();
	virtual int on_execute();
	virtual int on_exit();
};

#endif
