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

#include "CommIRScanJSON.hh"

#include "CommBasicObjectsJSON/CommPose3dJSON.hh"
#include "CommBasicObjectsJSON/CommTimeStampJSON.hh"

namespace CommBasicObjectsIDL {

void to_json(const CommBasicObjectsIDL::CommIRScan& obj, nlohmann::json& j)
{
	// distance_min: Double
	j["distance_min"] = obj.distance_min;
	// distance_max: Double
	j["distance_max"] = obj.distance_max;
	// poses3D: CommPose3d[]
	for(size_t idx=0; idx < obj.poses3D.size(); idx++) {
		nlohmann::json array_element;
		to_json(obj.poses3D.at(idx), array_element);
		j["poses3D"].emplace_back(array_element);
	}
	// distances: Double[]
	j["distances"] = obj.distances;
	// timeStamp: CommTimeStamp
	to_json(obj.timeStamp, j["timeStamp"]);
	// raw_readings: Double[]
	j["raw_readings"] = obj.raw_readings;
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, CommBasicObjectsIDL::CommIRScan& obj)
{
	// distance_min: Double
	if(j.contains("distance_min") && j["distance_min"].is_number_float()) {
		obj.distance_min = j["distance_min"].get<double>();
	}
	// distance_max: Double
	if(j.contains("distance_max") && j["distance_max"].is_number_float()) {
		obj.distance_max = j["distance_max"].get<double>();
	}
	// poses3D: CommPose3d[]
	if(j.contains("poses3D") && j["poses3D"].is_array()) {
		auto jposes3D = j["poses3D"];
		obj.poses3D.resize(jposes3D.size());
		for(size_t idx=0; idx < jposes3D.size(); idx++) {
			// convert the json array values individually
			if(jposes3D.at(idx).is_object()) {
				// from_json(jposes3D.at(idx), obj.poses3D.at(idx));
				obj.poses3D[idx] = jposes3D[idx].get<CommBasicObjectsIDL::CommPose3d>();
			}
		}
	}
	// distances: Double[]
	if(j.contains("distances") && j["distances"].is_array()) {
		obj.distances = j["distances"].get<std::vector<double>>();
	}
	// timeStamp: CommTimeStamp
	if(j.contains("timeStamp") && j["timeStamp"].is_object()) {
		//from_json(j["timeStamp"], obj.timeStamp);
		obj.timeStamp = j["timeStamp"].get<CommBasicObjectsIDL::CommTimeStamp>();
	}
	// raw_readings: Double[]
	if(j.contains("raw_readings") && j["raw_readings"].is_array()) {
		obj.raw_readings = j["raw_readings"].get<std::vector<double>>();
	}
}

} // end namespace CommBasicObjectsIDL
