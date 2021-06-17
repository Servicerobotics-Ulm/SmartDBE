CMAKE_MINIMUM_REQUIRED(VERSION 3.5)

FIND_FILE(SMART_MACROS SmartMacros2.cmake PATHS $ENV{SMART_ROOT_ACE} /opt/smartSoftAce /opt/smartsoft PATH_SUFFIXES CMakeMacros)
INCLUDE(${SMART_MACROS})
INTERNAL_IMPORT_PACKAGE(CommNavigationObjects)

IF(NOT TARGET nlohmann_json::nlohmann_json)
	FIND_PACKAGE(nlohmann_json PATHS $ENV{SMART_ROOT_ACE} PATH_SUFFIXES modules)
ENDIF(NOT TARGET nlohmann_json::nlohmann_json)

# find depndency CommBasicObjectsJSON
FIND_PACKAGE(CommBasicObjectsJSON PATHS $ENV{SMART_ROOT_ACE}/modules)

# include generated target configurations
INCLUDE(${CMAKE_CURRENT_LIST_DIR}/CommNavigationObjectsJSONTargets.cmake)

# the following variables are depricated and should not be used anymore:
# CommNavigationObjectsJSON_LIBRARIES
# CommNavigationObjectsJSON_INCLUDES

# instead, just directly link the library CommNavigationObjectsJSON to your executable target like this:
#
# TARGET_LINK_LIBRARIES(YourExecutableTarget CommNavigationObjectsJSON)
#
# (all the includes and additional libraries are automatically determined from the target CommNavigationObjectsJSON)
