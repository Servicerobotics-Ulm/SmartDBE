# target configurations for EnforcerCat1ROSExtension
IF(EXISTS ${ROS_DIR})
TARGET_LINK_LIBRARIES(${PROJECT_NAME} ${ROS_LIBS})
ENDIF(EXISTS ${ROS_DIR})

# target configurations for OpcUaBackendComponentGeneratorExtension
IF(SeRoNetSDK_FOUND)
# SeRoNetSDK has to be linked at the minimum (in case the component does not have any ports specified for any reason)
TARGET_LINK_LIBRARIES(${PROJECT_NAME} SeRoNetSDK::SeRoNetSDK)
TARGET_LINK_LIBRARIES(${PROJECT_NAME} SmartInstitutionsServiceRepositoryOpcUa)
ENDIF(SeRoNetSDK_FOUND)

# target configurations for PlainOpcUaEnforcerCat1Extension
IF(Open62541CppWrapper_FOUND)
TARGET_LINK_LIBRARIES(${PROJECT_NAME} Open62541CppWrapper)
TARGET_COMPILE_DEFINITIONS(${PROJECT_NAME} PUBLIC HAS_OPCUA)
ENDIF(Open62541CppWrapper_FOUND)

