//-----------------------------------------------------------------------------------
// Code generated by the Toolify Robotics GmbH extension for the SmartMDSD Toolchain 
// 
// Toolify Robotics GmbH
// Weinbergweg 216
// 89075 Ulm 
//
// Information about the SmartSoft MDSD Toolchain is available at:
// www.servicerobotik-ulm.de
//
// Please do not modify this file. It will be re-generated
// running the code generator.
//-----------------------------------------------------------------------------------

#ifndef COMMCORRIDORNETWORKSTATUS_JSON_TRANSFORMATION_H_
#define COMMCORRIDORNETWORKSTATUS_JSON_TRANSFORMATION_H_

#include <nlohmann/json.hpp>

#include <CommNavigationObjects/CommCorridorNetworkStatusData.hh>

namespace CommNavigationObjectsIDL {

	void to_json(const CommNavigationObjectsIDL::CommCorridorNetworkStatus& obj, nlohmann::json& j);
	void from_json(const nlohmann::json& j, CommNavigationObjectsIDL::CommCorridorNetworkStatus& obj);
	
} // end namespace CommNavigationObjectsIDL

#endif // COMMCORRIDORNETWORKSTATUS_JSON_TRANSFORMATION_H_
