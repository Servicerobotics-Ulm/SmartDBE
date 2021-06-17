#----------------------------------------------------------------
# Generated CMake target import file for configuration "Debug".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "CommBasicObjectsJSON" for configuration "Debug"
set_property(TARGET CommBasicObjectsJSON APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(CommBasicObjectsJSON PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libCommBasicObjectsJSON.so.1.0"
  IMPORTED_SONAME_DEBUG "libCommBasicObjectsJSON.so.1"
  )

list(APPEND _IMPORT_CHECK_TARGETS CommBasicObjectsJSON )
list(APPEND _IMPORT_CHECK_FILES_FOR_CommBasicObjectsJSON "${_IMPORT_PREFIX}/lib/libCommBasicObjectsJSON.so.1.0" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
