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

#include "PackageIdentifierJSON.hh"

#include "CommBasicObjectsJSON/CommTimeStampJSON.hh"

namespace SmartInstitutionsServiceRepositoryIDL {

void to_json(const SmartInstitutionsServiceRepositoryIDL::PackageIdentifier& obj, nlohmann::json& j)
{
	// id: UInt64
	j["id"] = obj.id;
	// timestampe: CommTimeStamp
	to_json(obj.timestampe, j["timestampe"]);
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, SmartInstitutionsServiceRepositoryIDL::PackageIdentifier& obj)
{
	// id: UInt64
	if(j.contains("id") && j["id"].is_number_unsigned()) {
		obj.id = j["id"].get<unsigned long>();
	}
	// timestampe: CommTimeStamp
	if(j.contains("timestampe") && j["timestampe"].is_object()) {
		//from_json(j["timestampe"], obj.timestampe);
		obj.timestampe = j["timestampe"].get<CommBasicObjectsIDL::CommTimeStamp>();
	}
}

} // end namespace SmartInstitutionsServiceRepositoryIDL
