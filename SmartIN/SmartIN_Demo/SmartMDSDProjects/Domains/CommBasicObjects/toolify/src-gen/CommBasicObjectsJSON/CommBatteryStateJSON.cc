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

#include "CommBatteryStateJSON.hh"


namespace CommBasicObjectsIDL {

void to_json(const CommBasicObjectsIDL::CommBatteryState& obj, nlohmann::json& j)
{
	// chargeValue: Double
	j["chargeValue"] = obj.chargeValue;
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, CommBasicObjectsIDL::CommBatteryState& obj)
{
	// chargeValue: Double
	if(j.contains("chargeValue") && j["chargeValue"].is_number_float()) {
		obj.chargeValue = j["chargeValue"].get<double>();
	}
}

} // end namespace CommBasicObjectsIDL