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
#include "CommNavigationObjects/CommNavigationGraphVertexCore.hh"

// serialization/deserialization operators
//#include "CommNavigationObjects/CommNavigationGraphVertexACE.hh"

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
	const char* CommNavigationGraphVertexCore::getCompiledHash()
	{
		return CommNavigationObjectsIDL::REPO_HASH;
	}
	
	void CommNavigationGraphVertexCore::getAllHashValues(std::list<std::string> &hashes)
	{
		// get own hash value
		hashes.push_back(getCompiledHash());
	}
	
	void CommNavigationGraphVertexCore::checkAllHashValues(std::list<std::string> &hashes)
	{
		// check own hash value
		if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
		{
			std::cerr << "###################################################" << std::endl;
			std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
			std::cerr << "CommNavigationGraphVertexCore hash" << std::endl;
			std::cerr << "Expected: " << getCompiledHash() << std::endl;
			std::cerr << "Received: " << hashes.front() << std::endl;
			std::cerr << "###################################################" << std::endl;
		}
		assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
		hashes.pop_front();
		
	}
	
	#ifdef ENABLE_HASH
	size_t CommNavigationGraphVertexCore::generateDataHash(const DATATYPE &data)
	{
		size_t seed = 0;
		
		boost::hash_combine(seed, data.x);
		boost::hash_combine(seed, data.y);
		boost::hash_combine(seed, data.pose);
		boost::hash_combine(seed, data.path);
		boost::hash_combine(seed, data.width);
		boost::hash_combine(seed, data.type);
		std::vector<ACE_CDR::Long>::const_iterator data_intersec_pathIt;
		for(data_intersec_pathIt=data.intersec_path.begin(); data_intersec_pathIt!=data.intersec_path.end(); data_intersec_pathIt++) {
			boost::hash_combine(seed, *data_intersec_pathIt);
		}
		
		return seed;
	}
	#endif
	
	// default constructor
	CommNavigationGraphVertexCore::CommNavigationGraphVertexCore()
	:	idl_CommNavigationGraphVertex()
	{  
		setX(0.0);
		setY(0.0);
		setPose(0);
		setPath(0);
		setWidth(0.0);
		setType(CommNavigationObjects::NODE_TYPE());
		setIntersec_path(std::vector<int>());
	}
	
	CommNavigationGraphVertexCore::CommNavigationGraphVertexCore(const DATATYPE &data)
	:	idl_CommNavigationGraphVertex(data)
	{  }

	CommNavigationGraphVertexCore::~CommNavigationGraphVertexCore()
	{  }
	
	void CommNavigationGraphVertexCore::to_ostream(std::ostream &os) const
	{
	  os << "CommNavigationGraphVertex(";
	  os << getX() << " ";
	  os << getY() << " ";
	  os << getPose() << " ";
	  os << getPath() << " ";
	  os << getWidth() << " ";
	  getType().to_ostream(os);
	  std::vector<int>::const_iterator intersec_pathIt;
	  std::vector<int> intersec_pathList = getIntersec_pathCopy();
	  for(intersec_pathIt=intersec_pathList.begin(); intersec_pathIt!=intersec_pathList.end(); intersec_pathIt++) {
	  	os << *intersec_pathIt << " ";
	  }
	  os << ") ";
	}
	
	// convert to xml stream
	void CommNavigationGraphVertexCore::to_xml(std::ostream &os, const std::string &indent) const {
		size_t counter = 0;
		
		os << indent << "<x>" << getX() << "</x>";
		os << indent << "<y>" << getY() << "</y>";
		os << indent << "<pose>" << getPose() << "</pose>";
		os << indent << "<path>" << getPath() << "</path>";
		os << indent << "<width>" << getWidth() << "</width>";
		os << indent << "<type>";
		getType().to_xml(os, indent);
		os << indent << "</type>";
		std::vector<int>::const_iterator intersec_pathIt;
		std::vector<int> intersec_pathList = getIntersec_pathCopy();
		counter = 0;
		os << indent << "<intersec_pathList n=\"" << intersec_pathList.size() << "\">";
		for(intersec_pathIt=intersec_pathList.begin(); intersec_pathIt!=intersec_pathList.end(); intersec_pathIt++) {
			os << indent << "<intersec_path i=\"" << counter++ << "\">" << *intersec_pathIt << "</intersec_path>";
		}
		os << indent << "</intersec_pathList>";
	}
	
	// restore from xml stream
	void CommNavigationGraphVertexCore::from_xml(std::istream &is) {
		size_t counter = 0;
		
		static const Smart::KnuthMorrisPratt kmp_x("<x>");
		static const Smart::KnuthMorrisPratt kmp_y("<y>");
		static const Smart::KnuthMorrisPratt kmp_pose("<pose>");
		static const Smart::KnuthMorrisPratt kmp_path("<path>");
		static const Smart::KnuthMorrisPratt kmp_width("<width>");
		static const Smart::KnuthMorrisPratt kmp_type("<type>");
		static const Smart::KnuthMorrisPratt kmp_intersec_pathList("<intersec_pathList n=\"");
		static const Smart::KnuthMorrisPratt kmp_intersec_path("\">");
		
		if(kmp_x.search(is)) {
			double xItem;
			is >> xItem;
			setX(xItem);
		}
		if(kmp_y.search(is)) {
			double yItem;
			is >> yItem;
			setY(yItem);
		}
		if(kmp_pose.search(is)) {
			int poseItem;
			is >> poseItem;
			setPose(poseItem);
		}
		if(kmp_path.search(is)) {
			int pathItem;
			is >> pathItem;
			setPath(pathItem);
		}
		if(kmp_width.search(is)) {
			double widthItem;
			is >> widthItem;
			setWidth(widthItem);
		}
		if(kmp_type.search(is)) {
			CommNavigationObjects::NODE_TYPE typeItem;
			typeItem.from_xml(is);
			setType(typeItem);
		}
		if(kmp_intersec_pathList.search(is)) {
			size_t numberElements;
			is >> numberElements;
			int intersec_pathItem;
			std::vector<int> intersec_pathList;
			kmp_intersec_path.search(is);
			for(counter=0; counter<numberElements; counter++) {
				if(kmp_intersec_path.search(is)) {
					is >> intersec_pathItem;
					intersec_pathList.push_back(intersec_pathItem);
				}
			}
			setIntersec_path(intersec_pathList);
		}
	}
	
	/*
	void CommNavigationGraphVertexCore::get(ACE_Message_Block *&msg) const
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
		// (see CommNavigationGraphVertexACE.hh)
		cdr << idl_CommNavigationGraphVertex;
		
	#ifdef ENABLE_HASH
		ACE_CDR::ULong data_hash = generateDataHash(idl_CommNavigationGraphVertex);
		cdr << data_hash;
		// std::cout << "CommNavigationGraphVertexCore: current data hash: " << data_hash << std::endl;
	#endif
		
		// return a shallow copy of the serialized message 
		// (no data is actually copied, only the internal reference counter is incremented)
		// in order to prevent memory leaks the caller of this get(msg) method must
		// manually free the memory by calling the release() method of the message block msg
		msg = cdr.begin()->duplicate();
	}
	
	void CommNavigationGraphVertexCore::set(const ACE_Message_Block *msg)
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
		// (see CommNavigationGraphVertexACE.hh)
		cdr >> idl_CommNavigationGraphVertex;
		
	#ifdef ENABLE_HASH
		ACE_CDR::Long data_hash;
		cdr >> data_hash;
		ACE_CDR::Long own_hash = generateDataHash(idl_CommNavigationGraphVertex);
		assert(data_hash == own_hash);
		// std::cout << "CommNavigationGraphVertexCore: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
	#endif
	}
	*/
} /* namespace CommNavigationObjects */
