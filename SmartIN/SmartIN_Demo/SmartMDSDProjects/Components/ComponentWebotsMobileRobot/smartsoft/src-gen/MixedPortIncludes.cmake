# includes for ComponentWebotsMobileRobotROSExtension
GET_FILENAME_COMPONENT(ROS_DIR "${PROJECT_SOURCE_DIR}/../ROS" REALPATH)
IF(EXISTS ${ROS_DIR})
ADD_SUBDIRECTORY(${ROS_DIR}/src-gen/ ${PROJECT_BINARY_DIR}/ROS)
LIST(APPEND FURTHER_SRCS ${ROS_SRCS})
INCLUDE_DIRECTORIES(${ROS_INCLUDES})
ENDIF(EXISTS ${ROS_DIR})

# includes for OpcUaBackendComponentGeneratorExtension
GET_FILENAME_COMPONENT(OPC_UA_BACKEND_DIR "${PROJECT_SOURCE_DIR}/../opcua-backend" REALPATH)
IF(EXISTS ${OPC_UA_BACKEND_DIR})
	INCLUDE("${OPC_UA_BACKEND_DIR}/src-gen/OpcUaBackend.cmake")
	LIST(APPEND FURTHER_SRCS ${OPC_UA_BACKEND_SRCS})
ENDIF(EXISTS ${OPC_UA_BACKEND_DIR})

# includes for PlainOpcUaComponentWebotsMobileRobotExtension
GET_FILENAME_COMPONENT(PlainOPCUA_DIR "${PROJECT_SOURCE_DIR}/../plainOpcUa" REALPATH)
IF(EXISTS ${PlainOPCUA_DIR})
INCLUDE("${PlainOPCUA_DIR}/src-gen/ComponentWebotsMobileRobotPlainOpcUa.cmake")
LIST(APPEND FURTHER_SRCS ${PLAIN_OPCUA_SRCS})
ENDIF(EXISTS ${PlainOPCUA_DIR})


