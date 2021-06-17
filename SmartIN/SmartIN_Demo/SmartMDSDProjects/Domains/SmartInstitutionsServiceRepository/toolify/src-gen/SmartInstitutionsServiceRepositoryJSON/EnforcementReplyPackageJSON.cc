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

#include "EnforcementReplyPackageJSON.hh"

#include "SmartInstitutionsServiceRepositoryJSON/PackageIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/PackageIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/InstitutionStatusJSON.hh"

namespace SmartInstitutionsServiceRepositoryIDL {

void to_json(const SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage& obj, nlohmann::json& j)
{
	// id: PackageIdentifier
	to_json(obj.id, j["id"]);
	// replyingto: PackageIdentifier
	to_json(obj.replyingto, j["replyingto"]);
	// to: MemberIdentifier
	to_json(obj.to, j["to"]);
	// from: MemberIdentifier
	to_json(obj.from, j["from"]);
	// context: InstitutionStatus
	to_json(obj.context, j["context"]);
	// reply: String
	j["reply"] = obj.reply;
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage& obj)
{
	// id: PackageIdentifier
	if(j.contains("id") && j["id"].is_object()) {
		//from_json(j["id"], obj.id);
		obj.id = j["id"].get<SmartInstitutionsServiceRepositoryIDL::PackageIdentifier>();
	}
	// replyingto: PackageIdentifier
	if(j.contains("replyingto") && j["replyingto"].is_object()) {
		//from_json(j["replyingto"], obj.replyingto);
		obj.replyingto = j["replyingto"].get<SmartInstitutionsServiceRepositoryIDL::PackageIdentifier>();
	}
	// to: MemberIdentifier
	if(j.contains("to") && j["to"].is_object()) {
		//from_json(j["to"], obj.to);
		obj.to = j["to"].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
	}
	// from: MemberIdentifier
	if(j.contains("from") && j["from"].is_object()) {
		//from_json(j["from"], obj.from);
		obj.from = j["from"].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
	}
	// context: InstitutionStatus
	if(j.contains("context") && j["context"].is_object()) {
		//from_json(j["context"], obj.context);
		obj.context = j["context"].get<SmartInstitutionsServiceRepositoryIDL::InstitutionStatus>();
	}
	// reply: String
	if(j.contains("reply") && j["reply"].is_string()) {
		obj.reply = j["reply"].get<std::string>();
	}
}

} // end namespace SmartInstitutionsServiceRepositoryIDL