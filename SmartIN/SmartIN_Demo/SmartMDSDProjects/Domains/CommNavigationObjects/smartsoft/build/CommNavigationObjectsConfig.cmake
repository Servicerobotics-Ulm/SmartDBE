#--------------------------------------------------------------------------
# Code generated by the SmartSoft MDSD Toolchain
# The SmartSoft Toolchain has been developed by:
#  
# Service Robotics Research Center
# University of Applied Sciences Ulm
# Prittwitzstr. 10
# 89075 Ulm (Germany)
#
# Information about the SmartSoft MDSD Toolchain is available at:
# www.servicerobotik-ulm.de
#
# Please do not modify this file. It will be re-generated
# running the code generator.
#--------------------------------------------------------------------------

# each comm-obj depend on the ACE middleware library
FIND_PACKAGE(ACE 6.0.2 PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)

IF(EXISTS ${CMAKE_CURRENT_LIST_DIR}/CMakeCache.txt)
	# find the SmartSoft CMake Macros (version 2 that uses CMake v3)
	FIND_FILE(SMART_MACROS SmartMacros2.cmake PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)
	INCLUDE(${SMART_MACROS})
	
	# find and include all external package definitions (if there are any needed)
	FOREACH(DEPENDENCY IN ITEMS SmartXml;CommBasicObjects)
		INTERNAL_IMPORT_PACKAGE(${DEPENDENCY})
	ENDFOREACH(DEPENDENCY)
ELSE()
	# find and include all external package definitions (if there are any needed)
	FOREACH(DEPENDENCY IN ITEMS SmartXml;CommBasicObjects)
		FIND_PACKAGE(${DEPENDENCY} PATHS $ENV{SMART_ROOT_ACE} $ENV{SMART_ROOT_ACE}/modules /opt/smartSoftAce/modules)
	ENDFOREACH(DEPENDENCY)
ENDIF()

# include generated target configurations
INCLUDE(${CMAKE_CURRENT_LIST_DIR}/CommNavigationObjectsTargets.cmake)

# the following variables are depricated and should not be used anymore:
# CommNavigationObjects_LIBRARIES
# CommNavigationObjects_INCLUDES

# instead, just directly link the library CommNavigationObjects to your executable target like this:
#
# TARGET_LINK_LIBRARIES(YourExecutableTarget CommNavigationObjects)
#
# (all the includes and additional libraries are automatically determined from the target CommNavigationObjects)
