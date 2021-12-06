#include "CommCorridorNetworkStatusOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "CommNavigationObjectsOpcUa/CommCorridorNodeOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for CommNavigationObjectsIDL::CommCorridorNetworkStatus
template <>
IDescription::shp_t SelfDescription(CommNavigationObjectsIDL::CommCorridorNetworkStatus *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add nodes
	ret->add(
		SelfDescription(&(obj->nodes), "Nodes")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
