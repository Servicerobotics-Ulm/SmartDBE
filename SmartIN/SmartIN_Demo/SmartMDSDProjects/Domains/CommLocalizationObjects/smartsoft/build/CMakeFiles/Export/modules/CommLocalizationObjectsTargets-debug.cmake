#----------------------------------------------------------------
# Generated CMake target import file for configuration "Debug".
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Import target "CommLocalizationObjects" for configuration "Debug"
set_property(TARGET CommLocalizationObjects APPEND PROPERTY IMPORTED_CONFIGURATIONS DEBUG)
set_target_properties(CommLocalizationObjects PROPERTIES
  IMPORTED_LOCATION_DEBUG "${_IMPORT_PREFIX}/lib/libCommLocalizationObjects.so.1.0.0"
  IMPORTED_SONAME_DEBUG "libCommLocalizationObjects.so.1"
  )

list(APPEND _IMPORT_CHECK_TARGETS CommLocalizationObjects )
list(APPEND _IMPORT_CHECK_FILES_FOR_CommLocalizationObjects "${_IMPORT_PREFIX}/lib/libCommLocalizationObjects.so.1.0.0" )

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
