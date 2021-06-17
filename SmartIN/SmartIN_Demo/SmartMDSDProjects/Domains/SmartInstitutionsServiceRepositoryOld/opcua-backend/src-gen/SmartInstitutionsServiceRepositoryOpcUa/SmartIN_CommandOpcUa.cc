#include "SmartIN_CommandOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>

#include "CommBasicObjectsOpcUa/CommTaskMessageOpcUa.hh"

namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for SmartInstitutionsServiceRepositoryIDL::SmartIN_Command
template <>
IDescription::shp_t SelfDescription(SmartInstitutionsServiceRepositoryIDL::SmartIN_Command *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add msg
	ret->add(
		SelfDescription(&(obj->msg), "Msg")
	);
	// add commandID
	ret->add(
		SelfDescription(&(obj->commandID), "CommandID")
	);
	// add command
	ret->add(
		SelfDescription(&(obj->command), "Command")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
