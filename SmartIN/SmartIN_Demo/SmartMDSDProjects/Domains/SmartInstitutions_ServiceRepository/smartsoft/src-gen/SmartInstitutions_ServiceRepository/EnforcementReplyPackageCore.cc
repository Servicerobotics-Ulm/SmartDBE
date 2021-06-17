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
#include "SmartInstitutions_ServiceRepository/EnforcementReplyPackageCore.hh"

// serialization/deserialization operators
//#include "SmartInstitutions_ServiceRepository/EnforcementReplyPackageACE.hh"

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

namespace SmartInstitutions_ServiceRepository 
{
	const char* EnforcementReplyPackageCore::getCompiledHash()
	{
		return SmartInstitutions_ServiceRepositoryIDL::REPO_HASH;
	}
	
	void EnforcementReplyPackageCore::getAllHashValues(std::list<std::string> &hashes)
	{
		// get own hash value
		hashes.push_back(getCompiledHash());
		// get hash value(s) for SmartInstitutions_ServiceRepository::PackageIdentifier(idl_EnforcementReplyPackage.id)
		SmartInstitutions_ServiceRepository::PackageIdentifier::getAllHashValues(hashes);
		// get hash value(s) for SmartInstitutions_ServiceRepository::PackageIdentifier(idl_EnforcementReplyPackage.replyingto)
		SmartInstitutions_ServiceRepository::PackageIdentifier::getAllHashValues(hashes);
		// get hash value(s) for SmartInstitutions_ServiceRepository::MemberIdentifier(idl_EnforcementReplyPackage.to)
		SmartInstitutions_ServiceRepository::MemberIdentifier::getAllHashValues(hashes);
		// get hash value(s) for SmartInstitutions_ServiceRepository::MemberIdentifier(idl_EnforcementReplyPackage.from)
		SmartInstitutions_ServiceRepository::MemberIdentifier::getAllHashValues(hashes);
		// get hash value(s) for SmartInstitutions_ServiceRepository::InstitutionStatus(idl_EnforcementReplyPackage.context)
		SmartInstitutions_ServiceRepository::InstitutionStatus::getAllHashValues(hashes);
	}
	
	void EnforcementReplyPackageCore::checkAllHashValues(std::list<std::string> &hashes)
	{
		// check own hash value
		if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
		{
			std::cerr << "###################################################" << std::endl;
			std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
			std::cerr << "EnforcementReplyPackageCore hash" << std::endl;
			std::cerr << "Expected: " << getCompiledHash() << std::endl;
			std::cerr << "Received: " << hashes.front() << std::endl;
			std::cerr << "###################################################" << std::endl;
		}
		assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
		hashes.pop_front();
		
		// check hash value(s) for SmartInstitutions_ServiceRepository::PackageIdentifier(idl_EnforcementReplyPackage.id)
		SmartInstitutions_ServiceRepository::PackageIdentifier::checkAllHashValues(hashes);
		// check hash value(s) for SmartInstitutions_ServiceRepository::PackageIdentifier(idl_EnforcementReplyPackage.replyingto)
		SmartInstitutions_ServiceRepository::PackageIdentifier::checkAllHashValues(hashes);
		// check hash value(s) for SmartInstitutions_ServiceRepository::MemberIdentifier(idl_EnforcementReplyPackage.to)
		SmartInstitutions_ServiceRepository::MemberIdentifier::checkAllHashValues(hashes);
		// check hash value(s) for SmartInstitutions_ServiceRepository::MemberIdentifier(idl_EnforcementReplyPackage.from)
		SmartInstitutions_ServiceRepository::MemberIdentifier::checkAllHashValues(hashes);
		// check hash value(s) for SmartInstitutions_ServiceRepository::InstitutionStatus(idl_EnforcementReplyPackage.context)
		SmartInstitutions_ServiceRepository::InstitutionStatus::checkAllHashValues(hashes);
	}
	
	#ifdef ENABLE_HASH
	size_t EnforcementReplyPackageCore::generateDataHash(const DATATYPE &data)
	{
		size_t seed = 0;
		
		seed += SmartInstitutions_ServiceRepository::PackageIdentifier::generateDataHash(data.id);
		seed += SmartInstitutions_ServiceRepository::PackageIdentifier::generateDataHash(data.replyingto);
		seed += SmartInstitutions_ServiceRepository::MemberIdentifier::generateDataHash(data.to);
		seed += SmartInstitutions_ServiceRepository::MemberIdentifier::generateDataHash(data.from);
		seed += SmartInstitutions_ServiceRepository::InstitutionStatus::generateDataHash(data.context);
		boost::hash_combine(seed, std::string(data.reply.c_str()));
		
		return seed;
	}
	#endif
	
	// default constructor
	EnforcementReplyPackageCore::EnforcementReplyPackageCore()
	:	idl_EnforcementReplyPackage()
	{  
		setId(SmartInstitutions_ServiceRepository::PackageIdentifier());
		setReplyingto(SmartInstitutions_ServiceRepository::PackageIdentifier());
		setTo(SmartInstitutions_ServiceRepository::MemberIdentifier());
		setFrom(SmartInstitutions_ServiceRepository::MemberIdentifier());
		setContext(SmartInstitutions_ServiceRepository::InstitutionStatus());
		setReply("");
	}
	
	EnforcementReplyPackageCore::EnforcementReplyPackageCore(const DATATYPE &data)
	:	idl_EnforcementReplyPackage(data)
	{  }

	EnforcementReplyPackageCore::~EnforcementReplyPackageCore()
	{  }
	
	void EnforcementReplyPackageCore::to_ostream(std::ostream &os) const
	{
	  os << "EnforcementReplyPackage(";
	  getId().to_ostream(os);
	  getReplyingto().to_ostream(os);
	  getTo().to_ostream(os);
	  getFrom().to_ostream(os);
	  getContext().to_ostream(os);
	  os << getReply() << " ";
	  os << ") ";
	}
	
	// convert to xml stream
	void EnforcementReplyPackageCore::to_xml(std::ostream &os, const std::string &indent) const {
		os << indent << "<id>";
		getId().to_xml(os, indent);
		os << indent << "</id>";
		os << indent << "<replyingto>";
		getReplyingto().to_xml(os, indent);
		os << indent << "</replyingto>";
		os << indent << "<to>";
		getTo().to_xml(os, indent);
		os << indent << "</to>";
		os << indent << "<from>";
		getFrom().to_xml(os, indent);
		os << indent << "</from>";
		os << indent << "<context>";
		getContext().to_xml(os, indent);
		os << indent << "</context>";
		os << indent << "<reply>" << getReply() << "</reply>";
	}
	
	// restore from xml stream
	void EnforcementReplyPackageCore::from_xml(std::istream &is) {
		static const Smart::KnuthMorrisPratt kmp_id("<id>");
		static const Smart::KnuthMorrisPratt kmp_replyingto("<replyingto>");
		static const Smart::KnuthMorrisPratt kmp_to("<to>");
		static const Smart::KnuthMorrisPratt kmp_from("<from>");
		static const Smart::KnuthMorrisPratt kmp_context("<context>");
		static const Smart::KnuthMorrisPratt kmp_reply("<reply>");
		
		if(kmp_id.search(is)) {
			SmartInstitutions_ServiceRepository::PackageIdentifier idItem;
			idItem.from_xml(is);
			setId(idItem);
		}
		if(kmp_replyingto.search(is)) {
			SmartInstitutions_ServiceRepository::PackageIdentifier replyingtoItem;
			replyingtoItem.from_xml(is);
			setReplyingto(replyingtoItem);
		}
		if(kmp_to.search(is)) {
			SmartInstitutions_ServiceRepository::MemberIdentifier toItem;
			toItem.from_xml(is);
			setTo(toItem);
		}
		if(kmp_from.search(is)) {
			SmartInstitutions_ServiceRepository::MemberIdentifier fromItem;
			fromItem.from_xml(is);
			setFrom(fromItem);
		}
		if(kmp_context.search(is)) {
			SmartInstitutions_ServiceRepository::InstitutionStatus contextItem;
			contextItem.from_xml(is);
			setContext(contextItem);
		}
		if(kmp_reply.search(is)) {
			std::string replyItem;
			is >> replyItem;
			setReply(replyItem);
		}
	}
	
	/*
	void EnforcementReplyPackageCore::get(ACE_Message_Block *&msg) const
	{
		// start with a default internal buffer size(will automatically grow if needed)
		ACE_OutputCDR cdr(ACE_DEFAULT_CDR_BUFSIZE);
		
		SmartInstitutions_ServiceRepositoryIDL::HashList hashes;
		getAllHashValues(hashes);
		cdr << static_cast<ACE_CDR::Long>(hashes.size());
		for(SmartInstitutions_ServiceRepositoryIDL::HashList::const_iterator it=hashes.begin(); it!=hashes.end(); it++)
		{
			cdr << ACE_CString(it->c_str());
		}
		
		// Here the actual serialization takes place using the OutputCDR serialization operator<<
		// (see EnforcementReplyPackageACE.hh)
		cdr << idl_EnforcementReplyPackage;
		
	#ifdef ENABLE_HASH
		ACE_CDR::ULong data_hash = generateDataHash(idl_EnforcementReplyPackage);
		cdr << data_hash;
		// std::cout << "EnforcementReplyPackageCore: current data hash: " << data_hash << std::endl;
	#endif
		
		// return a shallow copy of the serialized message 
		// (no data is actually copied, only the internal reference counter is incremented)
		// in order to prevent memory leaks the caller of this get(msg) method must
		// manually free the memory by calling the release() method of the message block msg
		msg = cdr.begin()->duplicate();
	}
	
	void EnforcementReplyPackageCore::set(const ACE_Message_Block *msg)
	{
		ACE_InputCDR cdr(msg);
	
		SmartInstitutions_ServiceRepositoryIDL::HashList hashes;
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
		// (see EnforcementReplyPackageACE.hh)
		cdr >> idl_EnforcementReplyPackage;
		
	#ifdef ENABLE_HASH
		ACE_CDR::Long data_hash;
		cdr >> data_hash;
		ACE_CDR::Long own_hash = generateDataHash(idl_EnforcementReplyPackage);
		assert(data_hash == own_hash);
		// std::cout << "EnforcementReplyPackageCore: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
	#endif
	}
	*/
} /* namespace SmartInstitutions_ServiceRepository */
