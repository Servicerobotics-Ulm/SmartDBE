#include "EnforcementReplyPackageOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "SmartInstitutionsServiceRepositoryOpcUa/PackageIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/PackageIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/InstitutionStatusOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add id
	ret->add(
		SelfDescription(&(obj->id), "Id")
	);
	// add replyingto
	ret->add(
		SelfDescription(&(obj->replyingto), "Replyingto")
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
	// add reply
	ret->add(
		SelfDescription(&(obj->reply), "Reply")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
