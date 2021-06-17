#include "SmartIN_EventMessageOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "SmartInstitutionsServiceRepositoryOpcUa/EnforcementInstructionPackageOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/EnforcementReplyPackageOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/EnforcementReportPackageOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for SmartInstitutionsServiceRepositoryIDL::SmartIN_EventMessage
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::SmartIN_EventMessage *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add usetype
	ret->add(
		SelfDescription(&(obj->usetype), "Usetype")
	);
	// add ifEnforcementInstructionPackage
	ret->add(
		SelfDescription(&(obj->ifEnforcementInstructionPackage), "IfEnforcementInstructionPackage")
	);
	// add ifEnforcementReplyPackage
	ret->add(
		SelfDescription(&(obj->ifEnforcementReplyPackage), "IfEnforcementReplyPackage")
	);
	// add ifEnforcementReportPackage
	ret->add(
		SelfDescription(&(obj->ifEnforcementReportPackage), "IfEnforcementReportPackage")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
