CMAKE_MINIMUM_REQUIRED(VERSION 3.5)

FIND_PACKAGE(Open62541Cpp QUIET PATHS $ENV{SMART_ROOT_ACE})
SET(SmartSoft_CD_API_DIR $ENV{SMART_ROOT_ACE})
FIND_PACKAGE(SeRoNetSDK QUIET PATHS $ENV{SMART_ROOT_ACE})

IF(SeRoNetSDK_FOUND)
	FIND_PACKAGE(CommBasicObjectsOpcUa PATHS $ENV{SMART_ROOT_ACE}/modules $ENV{SMART_ROOT_ACE})
	SET(CMAKE_CXX_STANDARD 14)
	INCLUDE_DIRECTORIES(${CMAKE_CURRENT_LIST_DIR})
	SET(OPC_UA_BACKEND_SRCS "${CMAKE_CURRENT_LIST_DIR}/SmartJoystickNavigationOpcUaBackendPortFactory.cc")
ENDIF(SeRoNetSDK_FOUND)
