#----------------------------------------------------------------
# Generated CMake target import file for configuration "Debug".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "CommNavigationObjectsJSON" for configuration "Debug"
set_property(TARGET CommNavigationObjectsJSON APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(CommNavigationObjectsJSON PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libCommNavigationObjectsJSON.so.1.0"
  IMPORTED_SONAME_DEBUG "libCommNavigationObjectsJSON.so.1"
  )

list(APPEND _IMPORT_CHECK_TARGETS CommNavigationObjectsJSON )
list(APPEND _IMPORT_CHECK_FILES_FOR_CommNavigationObjectsJSON "${_IMPORT_PREFIX}/lib/libCommNavigationObjectsJSON.so.1.0" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
