#include "CommBumperEventResultOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>


namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for CommBasicObjectsIDL::CommBumperEventResult
template <>
IDescription::shp_t SelfDescription(CommBasicObjectsIDL::CommBumperEventResult *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add state
	ret->add(
		SelfDescription(&(obj->state), "State")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
