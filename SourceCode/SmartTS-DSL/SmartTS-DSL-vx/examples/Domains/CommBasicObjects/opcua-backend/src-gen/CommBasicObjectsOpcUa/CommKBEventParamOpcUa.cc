#include "CommKBEventParamOpcUa.hh"

#define SERONET_NO_DEPRECATED
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ComplexType.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementPrimitives.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/SelfDescriptionArray.hpp>
#include <SeRoNetSDK/SeRoNet/CommunicationObjects/Description/ElementArray.hpp>


namespace SeRoNet {
namespace CommunicationObjects {
namespace Description {
	
// serialization for CommBasicObjectsIDL::CommKBEventParam
template <>
IDescription::shp_t SelfDescription(CommBasicObjectsIDL::CommKBEventParam *obj, std::string name)
{
	auto ret = std::make_shared<SeRoNet::CommunicationObjects::Description::ComplexType>(name);
	// add query
	ret->add(
		SelfDescription(&(obj->query), "Query")
	);
	// add latestState
	ret->add(
		SelfDescription(&(obj->latestState), "LatestState")
	);
	// add formatingClause
	ret->add(
		SelfDescription(&(obj->formatingClause), "FormatingClause")
	);
	return ret;
} // end SelfDescription

} // end namespace Description
} // end namespace CommunicationObjects
} // end namespace SeRoNet
