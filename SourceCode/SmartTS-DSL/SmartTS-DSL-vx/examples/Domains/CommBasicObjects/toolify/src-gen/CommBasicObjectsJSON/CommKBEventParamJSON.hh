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

#ifndef COMMKBEVENTPARAM_JSON_TRANSFORMATION_H_
#define COMMKBEVENTPARAM_JSON_TRANSFORMATION_H_

#include <nlohmann/json.hpp>

#include <CommBasicObjects/CommKBEventParamData.hh>

namespace CommBasicObjectsIDL {

	void to_json(const CommBasicObjectsIDL::CommKBEventParam& obj, nlohmann::json& j);
	void from_json(const nlohmann::json& j, CommBasicObjectsIDL::CommKBEventParam& obj);
	
} // end namespace CommBasicObjectsIDL

#endif // COMMKBEVENTPARAM_JSON_TRANSFORMATION_H_