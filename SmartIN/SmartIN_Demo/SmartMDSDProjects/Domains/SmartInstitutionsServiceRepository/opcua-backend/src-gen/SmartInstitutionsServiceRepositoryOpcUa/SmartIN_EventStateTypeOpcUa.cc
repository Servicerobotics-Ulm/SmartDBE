#include "SmartIN_EventStateTypeOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "SmartInstitutionsServiceRepositoryOpcUa/MemberIdentifierOpcUa.hh"
#include "SmartInstitutionsServiceRepositoryOpcUa/SmartIN_EventMessageOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add targets
	ret->add(
		SelfDescription(&(obj->targets), "Targets")
	);
	// add message
	ret->add(
		SelfDescription(&(obj->message), "Message")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
