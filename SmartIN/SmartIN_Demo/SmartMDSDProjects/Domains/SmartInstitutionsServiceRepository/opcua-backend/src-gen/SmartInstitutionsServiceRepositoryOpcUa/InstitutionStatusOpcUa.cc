#include "InstitutionStatusOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "SmartInstitutionsServiceRepositoryOpcUa/InstitutionIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "CommBasicObjectsOpcUa/CommTimeStampOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for SmartInstitutionsServiceRepositoryIDL::InstitutionStatus
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::InstitutionStatus *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add institute
	ret->add(
		SelfDescription(&(obj->institute), "Institute")
	);
	// add category
	ret->add(
		SelfDescription(&(obj->category), "Category")
	);
	// add type
	ret->add(
		SelfDescription(&(obj->type), "Type")
	);
	// add institutionMembers
	ret->add(
		SelfDescription(&(obj->institutionMembers), "InstitutionMembers")
	);
	// add institutionEnforcers
	ret->add(
		SelfDescription(&(obj->institutionEnforcers), "InstitutionEnforcers")
	);
	// add phase
	ret->add(
		SelfDescription(&(obj->phase), "Phase")
	);
	// add signed_at
	ret->add(
		SelfDescription(&(obj->signed_at), "Signed_at")
	);
	// add signed_by
	ret->add(
		SelfDescription(&(obj->signed_by), "Signed_by")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
