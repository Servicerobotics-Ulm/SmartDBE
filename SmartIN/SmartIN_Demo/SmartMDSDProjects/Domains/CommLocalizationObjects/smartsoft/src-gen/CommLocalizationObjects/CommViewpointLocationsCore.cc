//--------------------------------------------------------------------------
// Code generated by the SmartSoft MDSD Toolchain
// The SmartSoft Toolchain has been developed by:
//  
// Service Robotics Research Center
// University of Applied Sciences Ulm
// Prittwitzstr. 10
// 89075 Ulm (Germany)
//
// Information about the SmartSoft MDSD Toolchain is available at:
// www.servicerobotik-ulm.de
//
// Please do not modify this file. It will be re-generated
// running the code generator.
//--------------------------------------------------------------------------
#include "CommLocalizationObjects/CommViewpointLocationsCore.hh"

// serialization/deserialization operators
//#include "CommLocalizationObjects/CommViewpointLocationsACE.hh"

// include the hash.idl containing the hash constant
#include "hash.hh"
#include <assert.h>
#include <cstring>
#include <iostream>

// SmartUtils used in from_xml method
#include "smartKnuthMorrisPratt.hh"

#ifdef ENABLE_HASH
	#include <boost/functional/hash.hpp>
#endif

namespace CommLocalizationObjects 
{
	const char* CommViewpointLocationsCore::getCompiledHash()
	{
		return CommLocalizationObjectsIDL::REPO_HASH;
	}
	
	void CommViewpointLocationsCore::getAllHashValues(std::list<std::string> &hashes)
	{
		// get own hash value
		hashes.push_back(getCompiledHash());
		// get hash value(s) for CommLocalizationObjects::ViewpointLocation(idl_CommViewpointLocations.database)
		CommLocalizationObjects::ViewpointLocation::getAllHashValues(hashes);
	}
	
	void CommViewpointLocationsCore::checkAllHashValues(std::list<std::string> &hashes)
	{
		// check own hash value
		if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
		{
			std::cerr << "###################################################" << std::endl;
			std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
			std::cerr << "CommViewpointLocationsCore hash" << std::endl;
			std::cerr << "Expected: " << getCompiledHash() << std::endl;
			std::cerr << "Received: " << hashes.front() << std::endl;
			std::cerr << "###################################################" << std::endl;
		}
		assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
		hashes.pop_front();
		
		// check hash value(s) for CommLocalizationObjects::ViewpointLocation(idl_CommViewpointLocations.database)
		CommLocalizationObjects::ViewpointLocation::checkAllHashValues(hashes);
	}
	
	#ifdef ENABLE_HASH
	size_t CommViewpointLocationsCore::generateDataHash(const DATATYPE &data)
	{
		size_t seed = 0;
		
		std::vector<CommLocalizationObjectsIDL::ViewpointLocation>::const_iterator data_databaseIt;
		for(data_databaseIt=data.database.begin(); data_databaseIt!=data.database.end(); data_databaseIt++) {
			seed += CommLocalizationObjects::ViewpointLocation::generateDataHash(*data_databaseIt);
		}
		
		return seed;
	}
	#endif
	
	// default constructor
	CommViewpointLocationsCore::CommViewpointLocationsCore()
	:	idl_CommViewpointLocations()
	{  
		setDatabase(std::vector<CommLocalizationObjects::ViewpointLocation>());
	}
	
	CommViewpointLocationsCore::CommViewpointLocationsCore(const DATATYPE &data)
	:	idl_CommViewpointLocations(data)
	{  }

	CommViewpointLocationsCore::~CommViewpointLocationsCore()
	{  }
	
	void CommViewpointLocationsCore::to_ostream(std::ostream &os) const
	{
	  os << "CommViewpointLocations(";
	  std::vector<CommLocalizationObjects::ViewpointLocation>::const_iterator databaseIt;
	  std::vector<CommLocalizationObjects::ViewpointLocation> databaseList = getDatabaseCopy();
	  for(databaseIt=databaseList.begin(); databaseIt!=databaseList.end(); databaseIt++) {
	  	databaseIt->to_ostream(os);
	  }
	  os << ") ";
	}
	
	// convert to xml stream
	void CommViewpointLocationsCore::to_xml(std::ostream &os, const std::string &indent) const {
		size_t counter = 0;
		
		std::vector<CommLocalizationObjects::ViewpointLocation>::const_iterator databaseIt;
		std::vector<CommLocalizationObjects::ViewpointLocation> databaseList = getDatabaseCopy();
		counter = 0;
		os << indent << "<databaseList n=\"" << databaseList.size() << "\">";
		for(databaseIt=databaseList.begin(); databaseIt!=databaseList.end(); databaseIt++) {
			os << indent << "<database i=\"" << counter++ << "\">";
			databaseIt->to_xml(os, indent);
			os << indent << "</database>";
		}
		os << indent << "</databaseList>";
	}
	
	// restore from xml stream
	void CommViewpointLocationsCore::from_xml(std::istream &is) {
		size_t counter = 0;
		
		static const Smart::KnuthMorrisPratt kmp_databaseList("<databaseList n=\"");
		static const Smart::KnuthMorrisPratt kmp_database("\">");
		
		if(kmp_databaseList.search(is)) {
			size_t numberElements;
			is >> numberElements;
			CommLocalizationObjects::ViewpointLocation databaseItem;
			std::vector<CommLocalizationObjects::ViewpointLocation> databaseList;
			kmp_database.search(is);
			for(counter=0; counter<numberElements; counter++) {
				if(kmp_database.search(is)) {
					databaseItem.from_xml(is);
					databaseList.push_back(databaseItem);
				}
			}
			setDatabase(databaseList);
		}
	}
	
	/*
	void CommViewpointLocationsCore::get(ACE_Message_Block *&msg) const
	{
		// start with a default internal buffer size(will automatically grow if needed)
		ACE_OutputCDR cdr(ACE_DEFAULT_CDR_BUFSIZE);
		
		CommLocalizationObjectsIDL::HashList hashes;
		getAllHashValues(hashes);
		cdr << static_cast<ACE_CDR::Long>(hashes.size());
		for(CommLocalizationObjectsIDL::HashList::const_iterator it=hashes.begin(); it!=hashes.end(); it++)
		{
			cdr << ACE_CString(it->c_str());
		}
		
		// Here the actual serialization takes place using the OutputCDR serialization operator<<
		// (see CommViewpointLocationsACE.hh)
		cdr << idl_CommViewpointLocations;
		
	#ifdef ENABLE_HASH
		ACE_CDR::ULong data_hash = generateDataHash(idl_CommViewpointLocations);
		cdr << data_hash;
		// std::cout << "CommViewpointLocationsCore: current data hash: " << data_hash << std::endl;
	#endif
		
		// return a shallow copy of the serialized message 
		// (no data is actually copied, only the internal reference counter is incremented)
		// in order to prevent memory leaks the caller of this get(msg) method must
		// manually free the memory by calling the release() method of the message block msg
		msg = cdr.begin()->duplicate();
	}
	
	void CommViewpointLocationsCore::set(const ACE_Message_Block *msg)
	{
		ACE_InputCDR cdr(msg);
	
		CommLocalizationObjectsIDL::HashList hashes;
		ACE_CDR::Long hashes_size;
		cdr >> hashes_size;
		for(int i=0; i<hashes_size; ++i) 
		{
			ACE_CString hash;
			cdr >> hash;
			hashes.push_back(hash.c_str());
		}
		checkAllHashValues(hashes);
		
		// Here the actual de-serialization takes place using the InputCDR serialization operator>>
		// (see CommViewpointLocationsACE.hh)
		cdr >> idl_CommViewpointLocations;
		
	#ifdef ENABLE_HASH
		ACE_CDR::Long data_hash;
		cdr >> data_hash;
		ACE_CDR::Long own_hash = generateDataHash(idl_CommViewpointLocations);
		assert(data_hash == own_hash);
		// std::cout << "CommViewpointLocationsCore: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
	#endif
	}
	*/
} /* namespace CommLocalizationObjects */