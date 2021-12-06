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

#include "CommFileMoverEventStateJSON.hh"


namespace CommBasicObjectsIDL {

void to_json(const CommBasicObjectsIDL::CommFileMoverEventState& obj, nlohmann::json& j)
{
	// newState: FileMoverEventType
	j["newState"] = obj.newState;
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, CommBasicObjectsIDL::CommFileMoverEventState& obj)
{
	// newState: FileMoverEventType
	if(j.contains("newState") && j["newState"].is_number_integer()) {
		obj.newState = j["newState"].get<int>();
	}
}

} // end namespace CommBasicObjectsIDL
