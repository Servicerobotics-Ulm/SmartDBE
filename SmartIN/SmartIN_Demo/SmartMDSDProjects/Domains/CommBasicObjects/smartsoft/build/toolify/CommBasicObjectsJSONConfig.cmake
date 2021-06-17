CMAKE_MINIMUM_REQUIRED(VERSION 3.5)

FIND_FILE(SMART_MACROS SmartMacros2.cmake PATHS $ENV{SMART_ROOT_ACE} /opt/smartSoftAce /opt/smartsoft PATH_SUFFIXES CMakeMacros)
INCLUDE(${SMART_MACROS})
INTERNAL_IMPORT_PACKAGE(CommBasicObjects)

IF(NOT TARGET nlohmann_json::nlohmann_json)
	FIND_PACKAGE(nlohmann_json PATHS $ENV{SMART_ROOT_ACE} PATH_SUFFIXES modules)
ENDIF(NOT TARGET nlohmann_json::nlohmann_json)


# include generated target configurations
INCLUDE(${CMAKE_CURRENT_LIST_DIR}/CommBasicObjectsJSONTargets.cmake)

# the following variables are depricated and should not be used anymore:
# CommBasicObjectsJSON_LIBRARIES
# CommBasicObjectsJSON_INCLUDES

# instead, just directly link the library CommBasicObjectsJSON to your executable target like this:
#
# TARGET_LINK_LIBRARIES(YourExecutableTarget CommBasicObjectsJSON)
#
# (all the includes and additional libraries are automatically determined from the target CommBasicObjectsJSON)
