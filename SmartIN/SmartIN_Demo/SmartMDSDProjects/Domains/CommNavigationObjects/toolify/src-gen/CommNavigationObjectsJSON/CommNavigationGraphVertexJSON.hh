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

#ifndef COMMNAVIGATIONGRAPHVERTEX_JSON_TRANSFORMATION_H_
#define COMMNAVIGATIONGRAPHVERTEX_JSON_TRANSFORMATION_H_

#include <nlohmann/json.hpp>

#include <CommNavigationObjects/CommNavigationGraphVertexData.hh>

namespace CommNavigationObjectsIDL {

	void to_json(const CommNavigationObjectsIDL::CommNavigationGraphVertex& obj, nlohmann::json& j);
	void from_json(const nlohmann::json& j, CommNavigationObjectsIDL::CommNavigationGraphVertex& obj);
	
} // end namespace CommNavigationObjectsIDL

#endif // COMMNAVIGATIONGRAPHVERTEX_JSON_TRANSFORMATION_H_
