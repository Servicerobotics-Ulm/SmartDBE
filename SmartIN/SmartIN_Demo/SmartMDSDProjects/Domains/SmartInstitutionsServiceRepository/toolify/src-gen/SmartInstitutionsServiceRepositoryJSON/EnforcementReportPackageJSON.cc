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

#include "EnforcementReportPackageJSON.hh"

#include "SmartInstitutionsServiceRepositoryJSON/PackageIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/InstitutionStatusJSON.hh"

namespace SmartInstitutionsServiceRepositoryIDL {

void to_json(const SmartInstitutionsServiceRepositoryIDL::EnforcementReportPackage& obj, nlohmann::json& j)
{
	// id: PackageIdentifier
	to_json(obj.id, j["id"]);
	// to: MemberIdentifier[]
	for(size_t idx=0; idx < obj.to.size(); idx++) {
		nlohmann::json array_element;
		to_json(obj.to.at(idx), array_element);
		j["to"].emplace_back(array_element);
	}
	// from: MemberIdentifier
	to_json(obj.from, j["from"]);
	// report: InstitutionStatus
	to_json(obj.report, j["report"]);
	// text: String
	j["text"] = obj.text;
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, SmartInstitutionsServiceRepositoryIDL::EnforcementReportPackage& obj)
{
	// id: PackageIdentifier
	if(j.contains("id") && j["id"].is_object()) {
		//from_json(j["id"], obj.id);
		obj.id = j["id"].get<SmartInstitutionsServiceRepositoryIDL::PackageIdentifier>();
	}
	// to: MemberIdentifier[]
	if(j.contains("to") && j["to"].is_array()) {
		auto jto = j["to"];
		obj.to.resize(jto.size());
		for(size_t idx=0; idx < jto.size(); idx++) {
			// convert the json array values individually
			if(jto.at(idx).is_object()) {
				// from_json(jto.at(idx), obj.to.at(idx));
				obj.to[idx] = jto[idx].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
			}
		}
	}
	// from: MemberIdentifier
	if(j.contains("from") && j["from"].is_object()) {
		//from_json(j["from"], obj.from);
		obj.from = j["from"].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
	}
	// report: InstitutionStatus
	if(j.contains("report") && j["report"].is_object()) {
		//from_json(j["report"], obj.report);
		obj.report = j["report"].get<SmartInstitutionsServiceRepositoryIDL::InstitutionStatus>();
	}
	// text: String
	if(j.contains("text") && j["text"].is_string()) {
		obj.text = j["text"].get<std::string>();
	}
}

} // end namespace SmartInstitutionsServiceRepositoryIDL
