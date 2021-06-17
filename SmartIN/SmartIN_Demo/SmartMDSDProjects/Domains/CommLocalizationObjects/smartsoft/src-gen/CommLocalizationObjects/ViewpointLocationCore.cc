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
#include "CommLocalizationObjects/ViewpointLocationCore.hh"

// serialization/deserialization operators
//#include "CommLocalizationObjects/ViewpointLocationACE.hh"

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
	const char* ViewpointLocationCore::getCompiledHash()
	{
		return CommLocalizationObjectsIDL::REPO_HASH;
	}
	
	void ViewpointLocationCore::getAllHashValues(std::list<std::string> &hashes)
	{
		// get own hash value
		hashes.push_back(getCompiledHash());
		// get hash value(s) for CommLocalizationObjects::CPose2D(idl_ViewpointLocation.mean)
		CommLocalizationObjects::CPose2D::getAllHashValues(hashes);
		// get hash value(s) for CommLocalizationObjects::CMatrixDouble22(idl_ViewpointLocation.cov)
		CommLocalizationObjects::CMatrixDouble22::getAllHashValues(hashes);
		// get hash value(s) for CommLocalizationObjects::CMatrixDouble22(idl_ViewpointLocation.invCov)
		CommLocalizationObjects::CMatrixDouble22::getAllHashValues(hashes);
	}
	
	void ViewpointLocationCore::checkAllHashValues(std::list<std::string> &hashes)
	{
		// check own hash value
		if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
		{
			std::cerr << "###################################################" << std::endl;
			std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
			std::cerr << "ViewpointLocationCore hash" << std::endl;
			std::cerr << "Expected: " << getCompiledHash() << std::endl;
			std::cerr << "Received: " << hashes.front() << std::endl;
			std::cerr << "###################################################" << std::endl;
		}
		assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
		hashes.pop_front();
		
		// check hash value(s) for CommLocalizationObjects::CPose2D(idl_ViewpointLocation.mean)
		CommLocalizationObjects::CPose2D::checkAllHashValues(hashes);
		// check hash value(s) for CommLocalizationObjects::CMatrixDouble22(idl_ViewpointLocation.cov)
		CommLocalizationObjects::CMatrixDouble22::checkAllHashValues(hashes);
		// check hash value(s) for CommLocalizationObjects::CMatrixDouble22(idl_ViewpointLocation.invCov)
		CommLocalizationObjects::CMatrixDouble22::checkAllHashValues(hashes);
	}
	
	#ifdef ENABLE_HASH
	size_t ViewpointLocationCore::generateDataHash(const DATATYPE &data)
	{
		size_t seed = 0;
		
		boost::hash_combine(seed, data.id);
		seed += CommLocalizationObjects::CPose2D::generateDataHash(data.mean);
		seed += CommLocalizationObjects::CMatrixDouble22::generateDataHash(data.cov);
		seed += CommLocalizationObjects::CMatrixDouble22::generateDataHash(data.invCov);
		boost::hash_combine(seed, data.observationCount);
		boost::hash_combine(seed, data.possibleObservations);
		
		return seed;
	}
	#endif
	
	// default constructor
	ViewpointLocationCore::ViewpointLocationCore()
	:	idl_ViewpointLocation()
	{  
		setId(0);
		setMean(CommLocalizationObjects::CPose2D());
		setCov(CommLocalizationObjects::CMatrixDouble22());
		setInvCov(CommLocalizationObjects::CMatrixDouble22());
		setObservationCount(0);
		setPossibleObservations(0);
	}
	
	ViewpointLocationCore::ViewpointLocationCore(const DATATYPE &data)
	:	idl_ViewpointLocation(data)
	{  }

	ViewpointLocationCore::~ViewpointLocationCore()
	{  }
	
	void ViewpointLocationCore::to_ostream(std::ostream &os) const
	{
	  os << "ViewpointLocation(";
	  os << getId() << " ";
	  getMean().to_ostream(os);
	  getCov().to_ostream(os);
	  getInvCov().to_ostream(os);
	  os << getObservationCount() << " ";
	  os << getPossibleObservations() << " ";
	  os << ") ";
	}
	
	// convert to xml stream
	void ViewpointLocationCore::to_xml(std::ostream &os, const std::string &indent) const {
		os << indent << "<id>" << getId() << "</id>";
		os << indent << "<mean>";
		getMean().to_xml(os, indent);
		os << indent << "</mean>";
		os << indent << "<cov>";
		getCov().to_xml(os, indent);
		os << indent << "</cov>";
		os << indent << "<invCov>";
		getInvCov().to_xml(os, indent);
		os << indent << "</invCov>";
		os << indent << "<observationCount>" << getObservationCount() << "</observationCount>";
		os << indent << "<possibleObservations>" << getPossibleObservations() << "</possibleObservations>";
	}
	
	// restore from xml stream
	void ViewpointLocationCore::from_xml(std::istream &is) {
		static const Smart::KnuthMorrisPratt kmp_id("<id>");
		static const Smart::KnuthMorrisPratt kmp_mean("<mean>");
		static const Smart::KnuthMorrisPratt kmp_cov("<cov>");
		static const Smart::KnuthMorrisPratt kmp_invCov("<invCov>");
		static const Smart::KnuthMorrisPratt kmp_observationCount("<observationCount>");
		static const Smart::KnuthMorrisPratt kmp_possibleObservations("<possibleObservations>");
		
		if(kmp_id.search(is)) {
			int idItem;
			is >> idItem;
			setId(idItem);
		}
		if(kmp_mean.search(is)) {
			CommLocalizationObjects::CPose2D meanItem;
			meanItem.from_xml(is);
			setMean(meanItem);
		}
		if(kmp_cov.search(is)) {
			CommLocalizationObjects::CMatrixDouble22 covItem;
			covItem.from_xml(is);
			setCov(covItem);
		}
		if(kmp_invCov.search(is)) {
			CommLocalizationObjects::CMatrixDouble22 invCovItem;
			invCovItem.from_xml(is);
			setInvCov(invCovItem);
		}
		if(kmp_observationCount.search(is)) {
			int observationCountItem;
			is >> observationCountItem;
			setObservationCount(observationCountItem);
		}
		if(kmp_possibleObservations.search(is)) {
			int possibleObservationsItem;
			is >> possibleObservationsItem;
			setPossibleObservations(possibleObservationsItem);
		}
	}
	
	/*
	void ViewpointLocationCore::get(ACE_Message_Block *&msg) const
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
		// (see ViewpointLocationACE.hh)
		cdr << idl_ViewpointLocation;
		
	#ifdef ENABLE_HASH
		ACE_CDR::ULong data_hash = generateDataHash(idl_ViewpointLocation);
		cdr << data_hash;
		// std::cout << "ViewpointLocationCore: current data hash: " << data_hash << std::endl;
	#endif
		
		// return a shallow copy of the serialized message 
		// (no data is actually copied, only the internal reference counter is incremented)
		// in order to prevent memory leaks the caller of this get(msg) method must
		// manually free the memory by calling the release() method of the message block msg
		msg = cdr.begin()->duplicate();
	}
	
	void ViewpointLocationCore::set(const ACE_Message_Block *msg)
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
		// (see ViewpointLocationACE.hh)
		cdr >> idl_ViewpointLocation;
		
	#ifdef ENABLE_HASH
		ACE_CDR::Long data_hash;
		cdr >> data_hash;
		ACE_CDR::Long own_hash = generateDataHash(idl_ViewpointLocation);
		assert(data_hash == own_hash);
		// std::cout << "ViewpointLocationCore: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
	#endif
	}
	*/
} /* namespace CommLocalizationObjects */