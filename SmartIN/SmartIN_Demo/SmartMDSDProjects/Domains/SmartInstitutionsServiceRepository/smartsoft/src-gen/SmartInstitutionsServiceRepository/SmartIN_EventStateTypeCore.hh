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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_SMARTIN_EVENTSTATETYPE_CORE_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_SMARTIN_EVENTSTATETYPE_CORE_H_

#include "SmartInstitutionsServiceRepository/SmartIN_EventStateTypeData.hh"
#include "SmartInstitutionsServiceRepository/SmartIN_EventMessage.hh"
#include "SmartInstitutionsServiceRepository/MemberIdentifier.hh"

#include <iostream>
#include <string>
#include <list>

namespace SmartInstitutionsServiceRepository {
	
class SmartIN_EventStateTypeCore {
protected:
	// data structure
	SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType idl_SmartIN_EventStateType;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef SmartInstitutionsServiceRepositoryIDL::SmartIN_EventStateType DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	SmartIN_EventStateTypeCore();
	SmartIN_EventStateTypeCore(const DATATYPE &data);
	// default destructor
	virtual ~SmartIN_EventStateTypeCore();
	
	const DATATYPE& get() const { return idl_SmartIN_EventStateType; }
	operator const DATATYPE&() const { return idl_SmartIN_EventStateType; }
	DATATYPE& set() { return idl_SmartIN_EventStateType; }

	static inline std::string identifier(void) { return "SmartInstitutionsServiceRepository::SmartIN_EventStateType"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Targets
	/**
	 * Getter methods for element idl_SmartIN_EventStateType.targets of type vector<SmartInstitutionsServiceRepository::MemberIdentifier>
	 */
	inline std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> getTargetsCopy() const { 
		return std::vector<SmartInstitutionsServiceRepository::MemberIdentifier>(idl_SmartIN_EventStateType.targets.begin(), idl_SmartIN_EventStateType.targets.end());
	}
	inline SmartInstitutionsServiceRepository::MemberIdentifier getTargetsElemAtPos(const size_t &pos) const {
		return SmartInstitutionsServiceRepository::MemberIdentifier(idl_SmartIN_EventStateType.targets[pos]);
	}
	inline size_t getTargetsSize() const { return idl_SmartIN_EventStateType.targets.size(); }
	inline bool isTargetsEmpty() const { return idl_SmartIN_EventStateType.targets.empty(); }
	/**
	 * Setter methods for idl_SmartIN_EventStateType.targets of type vector<SmartInstitutionsServiceRepository::MemberIdentifier>
	 */
	inline SmartIN_EventStateTypeCore& setTargets(const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &targets) { 
		idl_SmartIN_EventStateType.targets.assign(targets.begin(), targets.end());
		return *this;
	}
	inline bool setTargetsElemAtPos(const size_t &pos, const SmartInstitutionsServiceRepository::MemberIdentifier &elem) {
		if(pos < idl_SmartIN_EventStateType.targets.size()) {
			idl_SmartIN_EventStateType.targets[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertTargetsVectorAtPos(const size_t &pos, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &data) {
		if(pos < idl_SmartIN_EventStateType.targets.size()) {
			idl_SmartIN_EventStateType.targets.insert(idl_SmartIN_EventStateType.targets.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeTargets(const size_t &size) { idl_SmartIN_EventStateType.targets.resize(size); }
	inline bool eraseTargetsElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_SmartIN_EventStateType.targets.size() ) {
			idl_SmartIN_EventStateType.targets.erase(idl_SmartIN_EventStateType.targets.begin()+pos, idl_SmartIN_EventStateType.targets.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearTargets() { idl_SmartIN_EventStateType.targets.clear(); }
	
	// getter and setter for element Message
	inline SmartInstitutionsServiceRepository::SmartIN_EventMessage getMessage() const { return SmartInstitutionsServiceRepository::SmartIN_EventMessage(idl_SmartIN_EventStateType.message); }
	inline SmartIN_EventStateTypeCore& setMessage(const SmartInstitutionsServiceRepository::SmartIN_EventMessage &message) { idl_SmartIN_EventStateType.message = message; return *this; }
};

} /* namespace SmartInstitutionsServiceRepository */
#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_SMARTIN_EVENTSTATETYPE_CORE_H_ */
