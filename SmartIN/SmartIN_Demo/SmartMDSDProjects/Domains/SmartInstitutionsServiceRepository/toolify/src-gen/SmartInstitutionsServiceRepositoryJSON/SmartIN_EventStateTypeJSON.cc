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

#include "SmartIN_EventStateTypeJSON.hh"

#include "SmartInstitutionsServiceRepositoryJSON/MemberIdentifierJSON.hh"
#include "SmartInstitutionsServiceRepositoryJSON/SmartIN_EventMessageJSON.hh"

namespace SmartInstitutionsServiceRepositoryIDL {

void to_json(const SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType& obj, nlohmann::json& j)
{
	// targets: MemberIdentifier[]
	for(size_t idx=0; idx < obj.targets.size(); idx++) {
		nlohmann::json array_element;
		to_json(obj.targets.at(idx), array_element);
		j["targets"].emplace_back(array_element);
	}
	// message: SmartIN_EventMessage
	to_json(obj.message, j["message"]);
}

/**
 * this transformation handles missing values and checks for correct types:
 * - missing primitive type values (including simple arrays) are set to zero values
 * - missing object type values are skipped entirely
 * - types are checked before performing the type-cast operation
 */
void from_json(const nlohmann::json& j, SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType& obj)
{
	// targets: MemberIdentifier[]
	if(j.contains("targets") && j["targets"].is_array()) {
		auto jtargets = j["targets"];
		obj.targets.resize(jtargets.size());
		for(size_t idx=0; idx < jtargets.size(); idx++) {
			// convert the json array values individually
			if(jtargets.at(idx).is_object()) {
				// from_json(jtargets.at(idx), obj.targets.at(idx));
				obj.targets[idx] = jtargets[idx].get<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier>();
			}
		}
	}
	// message: SmartIN_EventMessage
	if(j.contains("message") && j["message"].is_object()) {
		//from_json(j["message"], obj.message);
		obj.message = j["message"].get<SmartInstitutionsServiceRepositoryIDL::SmartIN_EventMessage>();
	}
}

} // end namespace SmartInstitutionsServiceRepositoryIDL
