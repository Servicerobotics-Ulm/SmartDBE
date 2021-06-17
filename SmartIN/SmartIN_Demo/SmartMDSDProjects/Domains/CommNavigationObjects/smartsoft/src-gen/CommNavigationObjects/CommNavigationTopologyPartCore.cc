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
#include "CommNavigationObjects/CommNavigationTopologyPartCore.hh"

// serialization/deserialization operators
//#include "CommNavigationObjects/CommNavigationTopologyPartACE.hh"

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

namespace CommNavigationObjects 
{
	const char* CommNavigationTopologyPartCore::getCompiledHash()
	{
		return CommNavigationObjectsIDL::REPO_HASH;
	}
	
	void CommNavigationTopologyPartCore::getAllHashValues(std::list<std::string> &hashes)
	{
		// get own hash value
		hashes.push_back(getCompiledHash());
	}
	
	void CommNavigationTopologyPartCore::checkAllHashValues(std::list<std::string> &hashes)
	{
		// check own hash value
		if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
		{
			std::cerr << "###################################################" << std::endl;
			std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
			std::cerr << "CommNavigationTopologyPartCore hash" << std::endl;
			std::cerr << "Expected: " << getCompiledHash() << std::endl;
			std::cerr << "Received: " << hashes.front() << std::endl;
			std::cerr << "###################################################" << std::endl;
		}
		assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
		hashes.pop_front();
		
	}
	
	#ifdef ENABLE_HASH
	size_t CommNavigationTopologyPartCore::generateDataHash(const DATATYPE &data)
	{
		size_t seed = 0;
		
		boost::hash_combine(seed, data.type);
		boost::hash_combine(seed, data.id);
		boost::hash_combine(seed, std::string(data.name.c_str()));
		std::vector<ACE_CDR::ULong>::const_iterator data_contained_location_idsIt;
		for(data_contained_location_idsIt=data.contained_location_ids.begin(); data_contained_location_idsIt!=data.contained_location_ids.end(); data_contained_location_idsIt++) {
			boost::hash_combine(seed, *data_contained_location_idsIt);
		}
		
		return seed;
	}
	#endif
	
	// default constructor
	CommNavigationTopologyPartCore::CommNavigationTopologyPartCore()
	:	idl_CommNavigationTopologyPart()
	{  
		setType(CommNavigationObjects::NavigationPartType());
		setId(0);
		setName("");
		setContained_location_ids(std::vector<unsigned int>());
	}
	
	CommNavigationTopologyPartCore::CommNavigationTopologyPartCore(const DATATYPE &data)
	:	idl_CommNavigationTopologyPart(data)
	{  }

	CommNavigationTopologyPartCore::~CommNavigationTopologyPartCore()
	{  }
	
	void CommNavigationTopologyPartCore::to_ostream(std::ostream &os) const
	{
	  os << "CommNavigationTopologyPart(";
	  getType().to_ostream(os);
	  os << getId() << " ";
	  os << getName() << " ";
	  std::vector<unsigned int>::const_iterator contained_location_idsIt;
	  std::vector<unsigned int> contained_location_idsList = getContained_location_idsCopy();
	  for(contained_location_idsIt=contained_location_idsList.begin(); contained_location_idsIt!=contained_location_idsList.end(); contained_location_idsIt++) {
	  	os << *contained_location_idsIt << " ";
	  }
	  os << ") ";
	}
	
	// convert to xml stream
	void CommNavigationTopologyPartCore::to_xml(std::ostream &os, const std::string &indent) const {
		size_t counter = 0;
		
		os << indent << "<type>";
		getType().to_xml(os, indent);
		os << indent << "</type>";
		os << indent << "<id>" << getId() << "</id>";
		os << indent << "<name>" << getName() << "</name>";
		std::vector<unsigned int>::const_iterator contained_location_idsIt;
		std::vector<unsigned int> contained_location_idsList = getContained_location_idsCopy();
		counter = 0;
		os << indent << "<contained_location_idsList n=\"" << contained_location_idsList.size() << "\">";
		for(contained_location_idsIt=contained_location_idsList.begin(); contained_location_idsIt!=contained_location_idsList.end(); contained_location_idsIt++) {
			os << indent << "<contained_location_ids i=\"" << counter++ << "\">" << *contained_location_idsIt << "</contained_location_ids>";
		}
		os << indent << "</contained_location_idsList>";
	}
	
	// restore from xml stream
	void CommNavigationTopologyPartCore::from_xml(std::istream &is) {
		size_t counter = 0;
		
		static const Smart::KnuthMorrisPratt kmp_type("<type>");
		static const Smart::KnuthMorrisPratt kmp_id("<id>");
		static const Smart::KnuthMorrisPratt kmp_name("<name>");
		static const Smart::KnuthMorrisPratt kmp_contained_location_idsList("<contained_location_idsList n=\"");
		static const Smart::KnuthMorrisPratt kmp_contained_location_ids("\">");
		
		if(kmp_type.search(is)) {
			CommNavigationObjects::NavigationPartType typeItem;
			typeItem.from_xml(is);
			setType(typeItem);
		}
		if(kmp_id.search(is)) {
			unsigned int idItem;
			is >> idItem;
			setId(idItem);
		}
		if(kmp_name.search(is)) {
			std::string nameItem;
			is >> nameItem;
			setName(nameItem);
		}
		if(kmp_contained_location_idsList.search(is)) {
			size_t numberElements;
			is >> numberElements;
			unsigned int contained_location_idsItem;
			std::vector<unsigned int> contained_location_idsList;
			kmp_contained_location_ids.search(is);
			for(counter=0; counter<numberElements; counter++) {
				if(kmp_contained_location_ids.search(is)) {
					is >> contained_location_idsItem;
					contained_location_idsList.push_back(contained_location_idsItem);
				}
			}
			setContained_location_ids(contained_location_idsList);
		}
	}
	
	/*
	void CommNavigationTopologyPartCore::get(ACE_Message_Block *&msg) const
	{
		// start with a default internal buffer size(will automatically grow if needed)
		ACE_OutputCDR cdr(ACE_DEFAULT_CDR_BUFSIZE);
		
		CommNavigationObjectsIDL::HashList hashes;
		getAllHashValues(hashes);
		cdr << static_cast<ACE_CDR::Long>(hashes.size());
		for(CommNavigationObjectsIDL::HashList::const_iterator it=hashes.begin(); it!=hashes.end(); it++)
		{
			cdr << ACE_CString(it->c_str());
		}
		
		// Here the actual serialization takes place using the OutputCDR serialization operator<<
		// (see CommNavigationTopologyPartACE.hh)
		cdr << idl_CommNavigationTopologyPart;
		
	#ifdef ENABLE_HASH
		ACE_CDR::ULong data_hash = generateDataHash(idl_CommNavigationTopologyPart);
		cdr << data_hash;
		// std::cout << "CommNavigationTopologyPartCore: current data hash: " << data_hash << std::endl;
	#endif
		
		// return a shallow copy of the serialized message 
		// (no data is actually copied, only the internal reference counter is incremented)
		// in order to prevent memory leaks the caller of this get(msg) method must
		// manually free the memory by calling the release() method of the message block msg
		msg = cdr.begin()->duplicate();
	}
	
	void CommNavigationTopologyPartCore::set(const ACE_Message_Block *msg)
	{
		ACE_InputCDR cdr(msg);
	
		CommNavigationObjectsIDL::HashList hashes;
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
		// (see CommNavigationTopologyPartACE.hh)
		cdr >> idl_CommNavigationTopologyPart;
		
	#ifdef ENABLE_HASH
		ACE_CDR::Long data_hash;
		cdr >> data_hash;
		ACE_CDR::Long own_hash = generateDataHash(idl_CommNavigationTopologyPart);
		assert(data_hash == own_hash);
		// std::cout << "CommNavigationTopologyPartCore: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
	#endif
	}
	*/
} /* namespace CommNavigationObjects */
