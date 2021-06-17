# Install script for directory: /home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen

# Set the install prefix
if(NOT DEFINED CMAKE_INSTALL_PREFIX)
  set(CMAKE_INSTALL_PREFIX "/home/smartsoft/SOFTWARE/smartsoft")
endif()
string(REGEX REPLACE "/$" "" CMAKE_INSTALL_PREFIX "${CMAKE_INSTALL_PREFIX}")

# Set the install configuration name.
if(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)
  if(BUILD_TYPE)
    string(REGEX REPLACE "^[^A-Za-z0-9_]+" ""
           CMAKE_INSTALL_CONFIG_NAME "${BUILD_TYPE}")
  else()
    set(CMAKE_INSTALL_CONFIG_NAME "Debug")
  endif()
  message(STATUS "Install configuration: \"${CMAKE_INSTALL_CONFIG_NAME}\"")
endif()

# Set the component getting installed.
if(NOT CMAKE_INSTALL_COMPONENT)
  if(COMPONENT)
    message(STATUS "Install component: \"${COMPONENT}\"")
    set(CMAKE_INSTALL_COMPONENT "${COMPONENT}")
  else()
    set(CMAKE_INSTALL_COMPONENT)
  endif()
endif()

# Install shared libraries without execute permission?
if(NOT DEFINED CMAKE_INSTALL_SO_NO_EXE)
  set(CMAKE_INSTALL_SO_NO_EXE "1")
endif()

# Is this installation the result of a crosscompile?
if(NOT DEFINED CMAKE_CROSSCOMPILING)
  set(CMAKE_CROSSCOMPILING "FALSE")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/CommLocalizationObjectsJSONConfig.cmake")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/CommLocalizationObjectsJSONConfigVersion.cmake")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  foreach(file
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so.1.0"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so.1"
      )
    if(EXISTS "${file}" AND
       NOT IS_SYMLINK "${file}")
      file(RPATH_CHECK
           FILE "${file}"
           RPATH "")
    endif()
  endforeach()
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/libCommLocalizationObjectsJSON.so.1.0"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/libCommLocalizationObjectsJSON.so.1"
    )
  foreach(file
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so.1.0"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so.1"
      )
    if(EXISTS "${file}" AND
       NOT IS_SYMLINK "${file}")
      file(RPATH_CHANGE
           FILE "${file}"
           OLD_RPATH "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build:/home/smartsoft/SOFTWARE/smartsoft/lib:"
           NEW_RPATH "")
      if(CMAKE_INSTALL_DO_STRIP)
        execute_process(COMMAND "/usr/bin/strip" "${file}")
      endif()
    endif()
  endforeach()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so" AND
     NOT IS_SYMLINK "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so")
    file(RPATH_CHECK
         FILE "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so"
         RPATH "")
  endif()
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/libCommLocalizationObjectsJSON.so")
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so" AND
     NOT IS_SYMLINK "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so")
    file(RPATH_CHANGE
         FILE "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so"
         OLD_RPATH "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build:/home/smartsoft/SOFTWARE/smartsoft/lib:"
         NEW_RPATH "")
    if(CMAKE_INSTALL_DO_STRIP)
      execute_process(COMMAND "/usr/bin/strip" "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjectsJSON.so")
    endif()
  endif()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsJSONTargets.cmake")
    file(DIFFERENT EXPORT_FILE_CHANGED FILES
         "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsJSONTargets.cmake"
         "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/CMakeFiles/Export/modules/CommLocalizationObjectsJSONTargets.cmake")
    if(EXPORT_FILE_CHANGED)
      file(GLOB OLD_CONFIG_FILES "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsJSONTargets-*.cmake")
      if(OLD_CONFIG_FILES)
        message(STATUS "Old export file \"$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsJSONTargets.cmake\" will be replaced.  Removing files [${OLD_CONFIG_FILES}].")
        file(REMOVE ${OLD_CONFIG_FILES})
      endif()
    endif()
  endif()
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/CMakeFiles/Export/modules/CommLocalizationObjectsJSONTargets.cmake")
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/smartsoft/build/toolify/CMakeFiles/Export/modules/CommLocalizationObjectsJSONTargets-debug.cmake")
  endif()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/CommLocalizationObjectsJSON" TYPE FILE FILES
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CMatrixDouble22JSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CPose2DJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommAmclHypothesisJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommAmclParticleJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommAmclVisualizationInfoJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommBeaconLocalizationRawDataJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommBeaconMeasurementJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommGpsFixJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommLocalizationEventParameterJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommLocalizationEventResultJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommLocalizationZoneChangeJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommLocalizationZoneResultJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommViewpointLocationsJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommVisualLocalizationFeatureJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/CommVisualLocalizationFeatureMapJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/LocalizationEventStateJSON.hh"
    "/home/smartsoft/SOFTWARE/SmartDBE/SmartIN/SmartIN_Demo/SmartMDSDProjects/Domains/CommLocalizationObjects/toolify/src-gen/CommLocalizationObjectsJSON/ViewpointLocationJSON.hh"
    )
endif()

