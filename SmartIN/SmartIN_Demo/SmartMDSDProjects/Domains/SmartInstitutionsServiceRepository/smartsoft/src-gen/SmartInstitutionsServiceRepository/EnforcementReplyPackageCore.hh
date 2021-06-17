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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_CORE_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_CORE_H_

#include "SmartInstitutionsServiceRepository/EnforcementReplyPackageData.hh"
#include "SmartInstitutionsServiceRepository/InstitutionStatus.hh"
#include "SmartInstitutionsServiceRepository/PackageIdentifier.hh"
#include "SmartInstitutionsServiceRepository/MemberIdentifier.hh"

#include <iostream>
#include <string>
#include <list>

namespace SmartInstitutionsServiceRepository {
	
class EnforcementReplyPackageCore {
protected:
	// data structure
	SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage idl_EnforcementReplyPackage;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef SmartInstitutionsServiceRepositoryIDL::EnforcementReplyPackage DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	EnforcementReplyPackageCore();
	EnforcementReplyPackageCore(const DATATYPE &data);
	// default destructor
	virtual ~EnforcementReplyPackageCore();
	
	const DATATYPE& get() const { return idl_EnforcementReplyPackage; }
	operator const DATATYPE&() const { return idl_EnforcementReplyPackage; }
	DATATYPE& set() { return idl_EnforcementReplyPackage; }

	static inline std::string identifier(void) { return "SmartInstitutionsServiceRepository::EnforcementReplyPackage"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Id
	inline SmartInstitutionsServiceRepository::PackageIdentifier getId() const { return SmartInstitutionsServiceRepository::PackageIdentifier(idl_EnforcementReplyPackage.id); }
	inline EnforcementReplyPackageCore& setId(const SmartInstitutionsServiceRepository::PackageIdentifier &id) { idl_EnforcementReplyPackage.id = id; return *this; }
	
	// getter and setter for element Replyingto
	inline SmartInstitutionsServiceRepository::PackageIdentifier getReplyingto() const { return SmartInstitutionsServiceRepository::PackageIdentifier(idl_EnforcementReplyPackage.replyingto); }
	inline EnforcementReplyPackageCore& setReplyingto(const SmartInstitutionsServiceRepository::PackageIdentifier &replyingto) { idl_EnforcementReplyPackage.replyingto = replyingto; return *this; }
	
	// getter and setter for element To
	inline SmartInstitutionsServiceRepository::MemberIdentifier getTo() const { return SmartInstitutionsServiceRepository::MemberIdentifier(idl_EnforcementReplyPackage.to); }
	inline EnforcementReplyPackageCore& setTo(const SmartInstitutionsServiceRepository::MemberIdentifier &to) { idl_EnforcementReplyPackage.to = to; return *this; }
	
	// getter and setter for element From
	inline SmartInstitutionsServiceRepository::MemberIdentifier getFrom() const { return SmartInstitutionsServiceRepository::MemberIdentifier(idl_EnforcementReplyPackage.from); }
	inline EnforcementReplyPackageCore& setFrom(const SmartInstitutionsServiceRepository::MemberIdentifier &from) { idl_EnforcementReplyPackage.from = from; return *this; }
	
	// getter and setter for element Context
	inline SmartInstitutionsServiceRepository::InstitutionStatus getContext() const { return SmartInstitutionsServiceRepository::InstitutionStatus(idl_EnforcementReplyPackage.context); }
	inline EnforcementReplyPackageCore& setContext(const SmartInstitutionsServiceRepository::InstitutionStatus &context) { idl_EnforcementReplyPackage.context = context; return *this; }
	
	// getter and setter for element Reply
	inline std::string getReply() const { return idl_EnforcementReplyPackage.reply; }
	inline EnforcementReplyPackageCore& setReply(const std::string &reply) { idl_EnforcementReplyPackage.reply = reply; return *this; }
};

} /* namespace SmartInstitutionsServiceRepository */
#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_CORE_H_ */