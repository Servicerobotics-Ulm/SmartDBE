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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_CORE_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_CORE_H_

#include "SmartInstitutionsServiceRepository/InstitutionStatusData.hh"
#include "CommBasicObjects/CommTimeStamp.hh"
#include "SmartInstitutionsServiceRepository/enumInstitutionCategory.hh"
#include "SmartInstitutionsServiceRepository/InstitutionIdentifier.hh"
#include "SmartInstitutionsServiceRepository/MemberIdentifier.hh"
#include "SmartInstitutionsServiceRepository/enumInstitutionType.hh"
#include "SmartInstitutionsServiceRepository/enumInstitutionPhase.hh"

#include <iostream>
#include <string>
#include <list>

namespace SmartInstitutionsServiceRepository {
	
class InstitutionStatusCore {
protected:
	// data structure
	SmartInstitutionsServiceRepositoryIDL::InstitutionStatus idl_InstitutionStatus;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef SmartInstitutionsServiceRepositoryIDL::InstitutionStatus DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	InstitutionStatusCore();
	InstitutionStatusCore(const DATATYPE &data);
	// default destructor
	virtual ~InstitutionStatusCore();
	
	const DATATYPE& get() const { return idl_InstitutionStatus; }
	operator const DATATYPE&() const { return idl_InstitutionStatus; }
	DATATYPE& set() { return idl_InstitutionStatus; }

	static inline std::string identifier(void) { return "SmartInstitutionsServiceRepository::InstitutionStatus"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Institute
	inline SmartInstitutionsServiceRepository::InstitutionIdentifier getInstitute() const { return SmartInstitutionsServiceRepository::InstitutionIdentifier(idl_InstitutionStatus.institute); }
	inline InstitutionStatusCore& setInstitute(const SmartInstitutionsServiceRepository::InstitutionIdentifier &institute) { idl_InstitutionStatus.institute = institute; return *this; }
	
	// getter and setter for element Category
	inline SmartInstitutionsServiceRepository::InstitutionCategory getCategory() const { return SmartInstitutionsServiceRepository::InstitutionCategory(idl_InstitutionStatus.category); }
	inline InstitutionStatusCore& setCategory(const SmartInstitutionsServiceRepository::InstitutionCategory &category) { idl_InstitutionStatus.category = category; return *this; }
	
	// getter and setter for element Type
	inline SmartInstitutionsServiceRepository::InstitutionType getType() const { return SmartInstitutionsServiceRepository::InstitutionType(idl_InstitutionStatus.type); }
	inline InstitutionStatusCore& setType(const SmartInstitutionsServiceRepository::InstitutionType &type) { idl_InstitutionStatus.type = type; return *this; }
	
	// getter and setter for element InstitutionMembers
	/**
	 * Getter methods for element idl_InstitutionStatus.institutionMembers of type vector<SmartInstitutionsServiceRepository::MemberIdentifier>
	 */
	inline std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> getInstitutionMembersCopy() const { 
		return std::vector<SmartInstitutionsServiceRepository::MemberIdentifier>(idl_InstitutionStatus.institutionMembers.begin(), idl_InstitutionStatus.institutionMembers.end());
	}
	inline SmartInstitutionsServiceRepository::MemberIdentifier getInstitutionMembersElemAtPos(const size_t &pos) const {
		return SmartInstitutionsServiceRepository::MemberIdentifier(idl_InstitutionStatus.institutionMembers[pos]);
	}
	inline size_t getInstitutionMembersSize() const { return idl_InstitutionStatus.institutionMembers.size(); }
	inline bool isInstitutionMembersEmpty() const { return idl_InstitutionStatus.institutionMembers.empty(); }
	/**
	 * Setter methods for idl_InstitutionStatus.institutionMembers of type vector<SmartInstitutionsServiceRepository::MemberIdentifier>
	 */
	inline InstitutionStatusCore& setInstitutionMembers(const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &institutionMembers) { 
		idl_InstitutionStatus.institutionMembers.assign(institutionMembers.begin(), institutionMembers.end());
		return *this;
	}
	inline bool setInstitutionMembersElemAtPos(const size_t &pos, const SmartInstitutionsServiceRepository::MemberIdentifier &elem) {
		if(pos < idl_InstitutionStatus.institutionMembers.size()) {
			idl_InstitutionStatus.institutionMembers[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertInstitutionMembersVectorAtPos(const size_t &pos, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &data) {
		if(pos < idl_InstitutionStatus.institutionMembers.size()) {
			idl_InstitutionStatus.institutionMembers.insert(idl_InstitutionStatus.institutionMembers.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeInstitutionMembers(const size_t &size) { idl_InstitutionStatus.institutionMembers.resize(size); }
	inline bool eraseInstitutionMembersElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_InstitutionStatus.institutionMembers.size() ) {
			idl_InstitutionStatus.institutionMembers.erase(idl_InstitutionStatus.institutionMembers.begin()+pos, idl_InstitutionStatus.institutionMembers.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearInstitutionMembers() { idl_InstitutionStatus.institutionMembers.clear(); }
	
	// getter and setter for element InstitutionEnforcers
	/**
	 * Getter methods for element idl_InstitutionStatus.institutionEnforcers of type vector<SmartInstitutionsServiceRepository::MemberIdentifier>
	 */
	inline std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> getInstitutionEnforcersCopy() const { 
		return std::vector<SmartInstitutionsServiceRepository::MemberIdentifier>(idl_InstitutionStatus.institutionEnforcers.begin(), idl_InstitutionStatus.institutionEnforcers.end());
	}
	inline SmartInstitutionsServiceRepository::MemberIdentifier getInstitutionEnforcersElemAtPos(const size_t &pos) const {
		return SmartInstitutionsServiceRepository::MemberIdentifier(idl_InstitutionStatus.institutionEnforcers[pos]);
	}
	inline size_t getInstitutionEnforcersSize() const { return idl_InstitutionStatus.institutionEnforcers.size(); }
	inline bool isInstitutionEnforcersEmpty() const { return idl_InstitutionStatus.institutionEnforcers.empty(); }
	/**
	 * Setter methods for idl_InstitutionStatus.institutionEnforcers of type vector<SmartInstitutionsServiceRepository::MemberIdentifier>
	 */
	inline InstitutionStatusCore& setInstitutionEnforcers(const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &institutionEnforcers) { 
		idl_InstitutionStatus.institutionEnforcers.assign(institutionEnforcers.begin(), institutionEnforcers.end());
		return *this;
	}
	inline bool setInstitutionEnforcersElemAtPos(const size_t &pos, const SmartInstitutionsServiceRepository::MemberIdentifier &elem) {
		if(pos < idl_InstitutionStatus.institutionEnforcers.size()) {
			idl_InstitutionStatus.institutionEnforcers[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertInstitutionEnforcersVectorAtPos(const size_t &pos, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &data) {
		if(pos < idl_InstitutionStatus.institutionEnforcers.size()) {
			idl_InstitutionStatus.institutionEnforcers.insert(idl_InstitutionStatus.institutionEnforcers.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeInstitutionEnforcers(const size_t &size) { idl_InstitutionStatus.institutionEnforcers.resize(size); }
	inline bool eraseInstitutionEnforcersElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_InstitutionStatus.institutionEnforcers.size() ) {
			idl_InstitutionStatus.institutionEnforcers.erase(idl_InstitutionStatus.institutionEnforcers.begin()+pos, idl_InstitutionStatus.institutionEnforcers.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearInstitutionEnforcers() { idl_InstitutionStatus.institutionEnforcers.clear(); }
	
	// getter and setter for element Phase
	inline SmartInstitutionsServiceRepository::InstitutionPhase getPhase() const { return SmartInstitutionsServiceRepository::InstitutionPhase(idl_InstitutionStatus.phase); }
	inline InstitutionStatusCore& setPhase(const SmartInstitutionsServiceRepository::InstitutionPhase &phase) { idl_InstitutionStatus.phase = phase; return *this; }
	
	// getter and setter for element Signed_at
	inline CommBasicObjects::CommTimeStamp getSigned_at() const { return CommBasicObjects::CommTimeStamp(idl_InstitutionStatus.signed_at); }
	inline InstitutionStatusCore& setSigned_at(const CommBasicObjects::CommTimeStamp &signed_at) { idl_InstitutionStatus.signed_at = signed_at; return *this; }
	
	// getter and setter for element Signed_by
	inline SmartInstitutionsServiceRepository::MemberIdentifier getSigned_by() const { return SmartInstitutionsServiceRepository::MemberIdentifier(idl_InstitutionStatus.signed_by); }
	inline InstitutionStatusCore& setSigned_by(const SmartInstitutionsServiceRepository::MemberIdentifier &signed_by) { idl_InstitutionStatus.signed_by = signed_by; return *this; }
};

} /* namespace SmartInstitutionsServiceRepository */
#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_CORE_H_ */