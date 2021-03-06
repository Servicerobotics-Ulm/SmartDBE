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

#include "InstitutionStatusJSON.hh"

#include "SmartInstitutionsServiceRepositoryJSON/InstitutionIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "CommBasicObjectsJSON/CommTimeStampJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"

namespace SmartInstitutionsServiceRepositoryIDL {

void to_json(const SmartInstitutionsServiceRepositoryIDL::InstitutionStatus& obj, nlohmann::json& j)
{
	// institute: InstitutionIdentifier
	to_json(obj.institute, j["institute"]);
	// category: InstitutionCategory
	j["category"] = obj.category;
	// type: InstitutionType
	j["type"] = obj.type;
	// institutionMembers: MemberIdentifier[]
	for(size_t idx=0; idx < obj.institutionMembers.size(); idx++) {
		nlohmann::json array_element;
		to_json(obj.institutionMembers.at(idx), array_element);
		j["institutionMembers"].emplace_back(array_element);
	}
	// institutionEnforcers: MemberIdentifier[]
	for(size_t idx=0; idx < obj.institutionEnforcers.size(); idx++) {
		nlohmann::json array_element;
		to_json(obj.institutionEnforcers.at(idx), array_element);
		j["institutionEnforcers"].emplace_back(array_element);
	}
	// phase: InstitutionPhase
	j["phase"] = obj.phase;
	// signed_at: CommTimeStamp
	to_json(obj.signed_at, j["signed_at"]);
	// signed_by: MemberIdentifier
	to_json(obj.signed_by, j["signed_by"]);
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, SmartInstitutionsServiceRepositoryIDL::InstitutionStatus& obj)
{
	// institute: InstitutionIdentifier
	if(j.contains("institute") && j["institute"].is_object()) {
		//from_json(j["institute"], obj.institute);
		obj.institute = j["institute"].get<SmartInstitutionsServiceRepositoryIDL::InstitutionIdentifier>();
	}
	// category: InstitutionCategory
	if(j.contains("category") && j["category"].is_number_integer()) {
		obj.category = j["category"].get<int>();
	}
	// type: InstitutionType
	if(j.contains("type") && j["type"].is_number_integer()) {
		obj.type = j["type"].get<int>();
	}
	// institutionMembers: MemberIdentifier[]
	if(j.contains("institutionMembers") && j["institutionMembers"].is_array()) {
		auto jinstitutionMembers = j["institutionMembers"];
		obj.institutionMembers.resize(jinstitutionMembers.size());
		for(size_t idx=0; idx < jinstitutionMembers.size(); idx++) {
			// convert the json array values individually
			if(jinstitutionMembers.at(idx).is_object()) {
				// from_json(jinstitutionMembers.at(idx), obj.institutionMembers.at(idx));
				obj.institutionMembers[idx] = jinstitutionMembers[idx].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
			}
		}
	}
	// institutionEnforcers: MemberIdentifier[]
	if(j.contains("institutionEnforcers") && j["institutionEnforcers"].is_array()) {
		auto jinstitutionEnforcers = j["institutionEnforcers"];
		obj.institutionEnforcers.resize(jinstitutionEnforcers.size());
		for(size_t idx=0; idx < jinstitutionEnforcers.size(); idx++) {
			// convert the json array values individually
			if(jinstitutionEnforcers.at(idx).is_object()) {
				// from_json(jinstitutionEnforcers.at(idx), obj.institutionEnforcers.at(idx));
				obj.institutionEnforcers[idx] = jinstitutionEnforcers[idx].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
			}
		}
	}
	// phase: InstitutionPhase
	if(j.contains("phase") && j["phase"].is_number_integer()) {
		obj.phase = j["phase"].get<int>();
	}
	// signed_at: CommTimeStamp
	if(j.contains("signed_at") && j["signed_at"].is_object()) {
		//from_json(j["signed_at"], obj.signed_at);
		obj.signed_at = j["signed_at"].get<CommBasicObjectsIDL::CommTimeStamp>();
	}
	// signed_by: MemberIdentifier
	if(j.contains("signed_by") && j["signed_by"].is_object()) {
		//from_json(j["signed_by"], obj.signed_by);
		obj.signed_by = j["signed_by"].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
	}
}

} // end namespace SmartInstitutionsServiceRepositoryIDL
