#include "EnforcementInstructionPackageOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "SmartInstitutionsServiceRepositoryOpcUa/PackageIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/InstitutionStatusOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for SmartInstitutionsServiceRepositoryIDL::EnforcementInstructionPackage
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::EnforcementInstructionPackage *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add id
	ret->add(
		SelfDescription(&(obj->id), "Id")
	);
	// add to
	ret->add(
		SelfDescription(&(obj->to), "To")
	);
	// add from
	ret->add(
		SelfDescription(&(obj->from), "From")
	);
	// add context
	ret->add(
		SelfDescription(&(obj->context), "Context")
	);
	// add instruction
	ret->add(
		SelfDescription(&(obj->instruction), "Instruction")
	);
	// add ifCustom
	ret->add(
		SelfDescription(&(obj->ifCustom), "IfCustom")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
