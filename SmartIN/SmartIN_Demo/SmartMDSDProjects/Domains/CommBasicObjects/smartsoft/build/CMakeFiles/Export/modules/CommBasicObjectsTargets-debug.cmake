#----------------------------------------------------------------
# Generated CMake target import file for configuration "Debug".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "CommBasicObjects" for configuration "Debug"
set_property(TARGET CommBasicObjects APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(CommBasicObjects PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libCommBasicObjects.so.1.0.0"
  IMPORTED_SONAME_DEBUG "libCommBasicObjects.so.1"
  )

list(APPEND _IMPORT_CHECK_TARGETS CommBasicObjects )
list(APPEND _IMPORT_CHECK_FILES_FOR_CommBasicObjects "${_IMPORT_PREFIX}/lib/libCommBasicObjects.so.1.0.0" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
