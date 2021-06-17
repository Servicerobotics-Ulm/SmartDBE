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
#include "CommBasicObjects/CommLaserScanCore.hh"

// serialization/deserialization operators
//#include "CommBasicObjects/CommLaserScanACE.hh"

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

namespace CommBasicObjects 
{
	const char* CommLaserScanCore::getCompiledHash()
	{
		return CommBasicObjectsIDL::REPO_HASH;
	}
	
	void CommLaserScanCore::getAllHashValues(std::list<std::string> &hashes)
	{
		// get own hash value
		hashes.push_back(getCompiledHash());
		// get hash value(s) for CommBasicObjects::CommTimeStamp(idl_CommLaserScan.time)
		CommBasicObjects::CommTimeStamp::getAllHashValues(hashes);
		// get hash value(s) for CommBasicObjects::LaserScanPoint(idl_CommLaserScan.scan_points)
		CommBasicObjects::LaserScanPoint::getAllHashValues(hashes);
	}
	
	void CommLaserScanCore::checkAllHashValues(std::list<std::string> &hashes)
	{
		// check own hash value
		if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
		{
			std::cerr << "###################################################" << std::endl;
			std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
			std::cerr << "CommLaserScanCore hash" << std::endl;
			std::cerr << "Expected: " << getCompiledHash() << std::endl;
			std::cerr << "Received: " << hashes.front() << std::endl;
			std::cerr << "###################################################" << std::endl;
		}
		assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
		hashes.pop_front();
		
		// check hash value(s) for CommBasicObjects::CommTimeStamp(idl_CommLaserScan.time)
		CommBasicObjects::CommTimeStamp::checkAllHashValues(hashes);
		// check hash value(s) for CommBasicObjects::LaserScanPoint(idl_CommLaserScan.scan_points)
		CommBasicObjects::LaserScanPoint::checkAllHashValues(hashes);
	}
	
	#ifdef ENABLE_HASH
	size_t CommLaserScanCore::generateDataHash(const DATATYPE &data)
	{
		size_t seed = 0;
		
		boost::hash_combine(seed, data.is_valid);
		seed += CommBasicObjects::CommTimeStamp::generateDataHash(data.time);
		boost::hash_combine(seed, data.update_count);
		boost::hash_combine(seed, data.start_angle);
		boost::hash_combine(seed, data.resolution);
		boost::hash_combine(seed, data.distance_min);
		boost::hash_combine(seed, data.distance_max);
		boost::hash_combine(seed, data.length_unit);
		std::vector<CommBasicObjectsIDL::LaserScanPoint>::const_iterator data_scan_pointsIt;
		for(data_scan_pointsIt=data.scan_points.begin(); data_scan_pointsIt!=data.scan_points.end(); data_scan_pointsIt++) {
			seed += CommBasicObjects::LaserScanPoint::generateDataHash(*data_scan_pointsIt);
		}
		boost::hash_combine(seed, data.max_scan_points);
		
		return seed;
	}
	#endif
	
	// default constructor
	CommLaserScanCore::CommLaserScanCore()
	:	idl_CommLaserScan()
	{  
		setIs_valid(false);
		setTime(CommBasicObjects::CommTimeStamp());
		setUpdate_count(0);
		setStart_angle(27000.0);
		setResolution(50.0);
		setDistance_min(65535);
		setDistance_max(0);
		setLength_unit(1);
		setScan_points(std::vector<CommBasicObjects::LaserScanPoint>());
		setMax_scan_points(0);
	}
	
	CommLaserScanCore::CommLaserScanCore(const DATATYPE &data)
	:	idl_CommLaserScan(data)
	{  }

	CommLaserScanCore::~CommLaserScanCore()
	{  }
	
	void CommLaserScanCore::to_ostream(std::ostream &os) const
	{
	  os << "CommLaserScan(";
	  os << getIs_valid() << " ";
	  getTime().to_ostream(os);
	  os << getUpdate_count() << " ";
	  os << getStart_angle() << " ";
	  os << getResolution() << " ";
	  os << getDistance_min() << " ";
	  os << getDistance_max() << " ";
	  os << getLength_unit() << " ";
	  std::vector<CommBasicObjects::LaserScanPoint>::const_iterator scan_pointsIt;
	  std::vector<CommBasicObjects::LaserScanPoint> scan_pointsList = getScan_pointsCopy();
	  for(scan_pointsIt=scan_pointsList.begin(); scan_pointsIt!=scan_pointsList.end(); scan_pointsIt++) {
	  	scan_pointsIt->to_ostream(os);
	  }
	  os << getMax_scan_points() << " ";
	  os << ") ";
	}
	
	// convert to xml stream
	void CommLaserScanCore::to_xml(std::ostream &os, const std::string &indent) const {
		size_t counter = 0;
		
		os << indent << "<is_valid>" << getIs_valid() << "</is_valid>";
		os << indent << "<time>";
		getTime().to_xml(os, indent);
		os << indent << "</time>";
		os << indent << "<update_count>" << getUpdate_count() << "</update_count>";
		os << indent << "<start_angle>" << getStart_angle() << "</start_angle>";
		os << indent << "<resolution>" << getResolution() << "</resolution>";
		os << indent << "<distance_min>" << getDistance_min() << "</distance_min>";
		os << indent << "<distance_max>" << getDistance_max() << "</distance_max>";
		os << indent << "<length_unit>" << getLength_unit() << "</length_unit>";
		std::vector<CommBasicObjects::LaserScanPoint>::const_iterator scan_pointsIt;
		std::vector<CommBasicObjects::LaserScanPoint> scan_pointsList = getScan_pointsCopy();
		counter = 0;
		os << indent << "<scan_pointsList n=\"" << scan_pointsList.size() << "\">";
		for(scan_pointsIt=scan_pointsList.begin(); scan_pointsIt!=scan_pointsList.end(); scan_pointsIt++) {
			os << indent << "<scan_points i=\"" << counter++ << "\">";
			scan_pointsIt->to_xml(os, indent);
			os << indent << "</scan_points>";
		}
		os << indent << "</scan_pointsList>";
		os << indent << "<max_scan_points>" << getMax_scan_points() << "</max_scan_points>";
	}
	
	// restore from xml stream
	void CommLaserScanCore::from_xml(std::istream &is) {
		size_t counter = 0;
		
		static const Smart::KnuthMorrisPratt kmp_is_valid("<is_valid>");
		static const Smart::KnuthMorrisPratt kmp_time("<time>");
		static const Smart::KnuthMorrisPratt kmp_update_count("<update_count>");
		static const Smart::KnuthMorrisPratt kmp_start_angle("<start_angle>");
		static const Smart::KnuthMorrisPratt kmp_resolution("<resolution>");
		static const Smart::KnuthMorrisPratt kmp_distance_min("<distance_min>");
		static const Smart::KnuthMorrisPratt kmp_distance_max("<distance_max>");
		static const Smart::KnuthMorrisPratt kmp_length_unit("<length_unit>");
		static const Smart::KnuthMorrisPratt kmp_scan_pointsList("<scan_pointsList n=\"");
		static const Smart::KnuthMorrisPratt kmp_scan_points("\">");
		static const Smart::KnuthMorrisPratt kmp_max_scan_points("<max_scan_points>");
		
		if(kmp_is_valid.search(is)) {
			bool is_validItem;
			is >> is_validItem;
			setIs_valid(is_validItem);
		}
		if(kmp_time.search(is)) {
			CommBasicObjects::CommTimeStamp timeItem;
			timeItem.from_xml(is);
			setTime(timeItem);
		}
		if(kmp_update_count.search(is)) {
			unsigned long int update_countItem;
			is >> update_countItem;
			setUpdate_count(update_countItem);
		}
		if(kmp_start_angle.search(is)) {
			double start_angleItem;
			is >> start_angleItem;
			setStart_angle(start_angleItem);
		}
		if(kmp_resolution.search(is)) {
			double resolutionItem;
			is >> resolutionItem;
			setResolution(resolutionItem);
		}
		if(kmp_distance_min.search(is)) {
			unsigned short distance_minItem;
			is >> distance_minItem;
			setDistance_min(distance_minItem);
		}
		if(kmp_distance_max.search(is)) {
			unsigned short distance_maxItem;
			is >> distance_maxItem;
			setDistance_max(distance_maxItem);
		}
		if(kmp_length_unit.search(is)) {
			unsigned short length_unitItem;
			is >> length_unitItem;
			setLength_unit(length_unitItem);
		}
		if(kmp_scan_pointsList.search(is)) {
			size_t numberElements;
			is >> numberElements;
			CommBasicObjects::LaserScanPoint scan_pointsItem;
			std::vector<CommBasicObjects::LaserScanPoint> scan_pointsList;
			kmp_scan_points.search(is);
			for(counter=0; counter<numberElements; counter++) {
				if(kmp_scan_points.search(is)) {
					scan_pointsItem.from_xml(is);
					scan_pointsList.push_back(scan_pointsItem);
				}
			}
			setScan_points(scan_pointsList);
		}
		if(kmp_max_scan_points.search(is)) {
			unsigned short max_scan_pointsItem;
			is >> max_scan_pointsItem;
			setMax_scan_points(max_scan_pointsItem);
		}
	}
	
	/*
	void CommLaserScanCore::get(ACE_Message_Block *&msg) const
	{
		// start with a default internal buffer size(will automatically grow if needed)
		ACE_OutputCDR cdr(ACE_DEFAULT_CDR_BUFSIZE);
		
		CommBasicObjectsIDL::HashList hashes;
		getAllHashValues(hashes);
		cdr << static_cast<ACE_CDR::Long>(hashes.size());
		for(CommBasicObjectsIDL::HashList::const_iterator it=hashes.begin(); it!=hashes.end(); it++)
		{
			cdr << ACE_CString(it->c_str());
		}
		
		// Here the actual serialization takes place using the OutputCDR serialization operator<<
		// (see CommLaserScanACE.hh)
		cdr << idl_CommLaserScan;
		
	#ifdef ENABLE_HASH
		ACE_CDR::ULong data_hash = generateDataHash(idl_CommLaserScan);
		cdr << data_hash;
		// std::cout << "CommLaserScanCore: current data hash: " << data_hash << std::endl;
	#endif
		
		// return a shallow copy of the serialized message 
		// (no data is actually copied, only the internal reference counter is incremented)
		// in order to prevent memory leaks the caller of this get(msg) method must
		// manually free the memory by calling the release() method of the message block msg
		msg = cdr.begin()->duplicate();
	}
	
	void CommLaserScanCore::set(const ACE_Message_Block *msg)
	{
		ACE_InputCDR cdr(msg);
	
		CommBasicObjectsIDL::HashList hashes;
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
		// (see CommLaserScanACE.hh)
		cdr >> idl_CommLaserScan;
		
	#ifdef ENABLE_HASH
		ACE_CDR::Long data_hash;
		cdr >> data_hash;
		ACE_CDR::Long own_hash = generateDataHash(idl_CommLaserScan);
		assert(data_hash == own_hash);
		// std::cout << "CommLaserScanCore: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
	#endif
	}
	*/
} /* namespace CommBasicObjects */