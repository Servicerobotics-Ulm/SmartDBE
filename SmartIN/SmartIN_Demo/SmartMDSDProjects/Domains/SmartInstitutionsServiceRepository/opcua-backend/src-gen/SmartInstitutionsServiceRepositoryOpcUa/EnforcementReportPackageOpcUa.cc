#include "EnforcementReportPackageOpcUa.hh"

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
	
// serialization for SmartInstitutionsServiceRepositoryIDL::EnforcementReportPackage
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::EnforcementReportPackage *obj, std::string name)
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
	// add report
	ret->add(
		SelfDescription(&(obj->report), "Report")
	);
	// add text
	ret->add(
		SelfDescription(&(obj->text), "Text")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
