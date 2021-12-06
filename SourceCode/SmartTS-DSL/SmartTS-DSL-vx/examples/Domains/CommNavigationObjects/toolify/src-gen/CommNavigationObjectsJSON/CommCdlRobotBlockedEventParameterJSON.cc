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

#include "CommCdlRobotBlockedEventParameterJSON.hh"


namespace CommNavigationObjectsIDL {

void to_json(const CommNavigationObjectsIDL::CommCdlRobotBlockedEventParameter& obj, nlohmann::json& j)
{
	// oldState: CdlRobotBlockEventType
	j["oldState"] = obj.oldState;
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, CommNavigationObjectsIDL::CommCdlRobotBlockedEventParameter& obj)
{
	// oldState: CdlRobotBlockEventType
	if(j.contains("oldState") && j["oldState"].is_number_integer()) {
		obj.oldState = j["oldState"].get<int>();
	}
}

} // end namespace CommNavigationObjectsIDL