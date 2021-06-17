# Install script for directory: /home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft

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
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/CommLocalizationObjectsConfigVersion.cmake")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/CommLocalizationObjectsConfig.cmake")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  foreach(file
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so.1.0.0"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so.1"
      )
    if(EXISTS "${file}" AND
       NOT IS_SYMLINK "${file}")
      file(RPATH_CHECK
           FILE "${file}"
           RPATH "")
    endif()
  endforeach()
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/libCommLocalizationObjects.so.1.0.0"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/libCommLocalizationObjects.so.1"
    )
  foreach(file
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so.1.0.0"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so.1"
      )
    if(EXISTS "${file}" AND
       NOT IS_SYMLINK "${file}")
      file(RPATH_CHANGE
           FILE "${file}"
           OLD_RPATH "/home/smartsoft/SOFTWARE/smartsoft/lib:"
           NEW_RPATH "")
      if(CMAKE_INSTALL_DO_STRIP)
        execute_process(COMMAND "/usr/bin/strip" "${file}")
      endif()
    endif()
  endforeach()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so" AND
     NOT IS_SYMLINK "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so")
    file(RPATH_CHECK
         FILE "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so"
         RPATH "")
  endif()
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/libCommLocalizationObjects.so")
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so" AND
     NOT IS_SYMLINK "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so")
    file(RPATH_CHANGE
         FILE "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so"
         OLD_RPATH "/home/smartsoft/SOFTWARE/smartsoft/lib:"
         NEW_RPATH "")
    if(CMAKE_INSTALL_DO_STRIP)
      execute_process(COMMAND "/usr/bin/strip" "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libCommLocalizationObjects.so")
    endif()
  endif()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsTargets.cmake")
    file(DIFFERENT EXPORT_FILE_CHANGED FILES
         "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsTargets.cmake"
         "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/CMakeFiles/Export/modules/CommLocalizationObjectsTargets.cmake")
    if(EXPORT_FILE_CHANGED)
      file(GLOB OLD_CONFIG_FILES "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsTargets-*.cmake")
      if(OLD_CONFIG_FILES)
        message(STATUS "Old export file \"$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/modules/CommLocalizationObjectsTargets.cmake\" will be replaced.  Removing files [${OLD_CONFIG_FILES}].")
        file(REMOVE ${OLD_CONFIG_FILES})
      endif()
    endif()
  endif()
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/CMakeFiles/Export/modules/CommLocalizationObjectsTargets.cmake")
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/modules" TYPE FILE FILES "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/CMakeFiles/Export/modules/CommLocalizationObjectsTargets-debug.cmake")
  endif()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/CommLocalizationObjects" TYPE FILE FILES
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CMatrixDouble22.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CPose2D.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommAmclHypothesis.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommAmclParticle.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommAmclVisualizationInfo.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommBeaconLocalizationRawData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommBeaconMeasurement.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommGpsFix.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommLocalizationEventParameter.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommLocalizationEventResult.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommLocalizationZoneChange.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommLocalizationZoneResult.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommViewpointLocations.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommVisualLocalizationFeature.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/CommVisualLocalizationFeatureMap.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/LocalizationEventState.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src/CommLocalizationObjects/ViewpointLocation.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CMatrixDouble22ACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CMatrixDouble22Core.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CMatrixDouble22Data.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CPose2DACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CPose2DCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CPose2DData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclHypothesisACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclHypothesisCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclHypothesisData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclParticleACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclParticleCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclParticleData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclVisualizationInfoACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclVisualizationInfoCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommAmclVisualizationInfoData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommBeaconLocalizationRawDataACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommBeaconLocalizationRawDataCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommBeaconLocalizationRawDataData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommBeaconMeasurementACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommBeaconMeasurementCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommBeaconMeasurementData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommGpsFixACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommGpsFixCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommGpsFixData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationEventParameterACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationEventParameterCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationEventParameterData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationEventResultACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationEventResultCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationEventResultData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationZoneChangeACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationZoneChangeCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationZoneChangeData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationZoneResultACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationZoneResultCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommLocalizationZoneResultData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommViewpointLocationsACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommViewpointLocationsCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommViewpointLocationsData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommVisualLocalizationFeatureACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommVisualLocalizationFeatureCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommVisualLocalizationFeatureData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommVisualLocalizationFeatureMapACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommVisualLocalizationFeatureMapCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/CommVisualLocalizationFeatureMapData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/LocalizationEventStateACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/LocalizationEventStateCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/LocalizationEventStateData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/ViewpointLocationACE.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/ViewpointLocationCore.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/ViewpointLocationData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/enumBearingOnlySLAMTag.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/enumBearingOnlySLAMTagData.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/enumLocalizationEventType.hh"
    "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/src-gen/CommLocalizationObjects/enumLocalizationEventTypeData.hh"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/CommLocalizationObjects" TYPE FILE FILES "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/hash.hh")
endif()

if(NOT CMAKE_INSTALL_LOCAL_ONLY)
  # Include the install script for each subdirectory.
  include("/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/toolify/cmake_install.cmake")
  include("/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/opcua-backend/cmake_install.cmake")
  include("/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/LocalizationCoordinationService/cmake_install.cmake")
  include("/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/SLAMCoordinationService/cmake_install.cmake")
  include("/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/SLAMAndLocalizationCoordinationService/cmake_install.cmake")

endif()

if(CMAKE_INSTALL_COMPONENT)
  set(CMAKE_INSTALL_MANIFEST "install_manifest_${CMAKE_INSTALL_COMPONENT}.txt")
else()
  set(CMAKE_INSTALL_MANIFEST "install_manifest.txt")
endif()

string(REPLACE ";" "\n" CMAKE_INSTALL_MANIFEST_CONTENT
       "${CMAKE_INSTALL_MANIFEST_FILES}")
file(WRITE "/home/smartsoft/SOFTWARE/smartsoft/repos/DomainModelsRepositories/CommLocalizationObjects/smartsoft/build/${CMAKE_INSTALL_MANIFEST}"
     "${CMAKE_INSTALL_MANIFEST_CONTENT}")
