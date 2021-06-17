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
#ifndef COMMBASICOBJECTS_COMMDIGITALINPUTEVENTRESULT_CORE_H_
#define COMMBASICOBJECTS_COMMDIGITALINPUTEVENTRESULT_CORE_H_

#include "CommBasicObjects/CommDigitalInputEventResultData.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommBasicObjects {
	
class CommDigitalInputEventResultCore {
protected:
	// data structure
	CommBasicObjectsIDL::CommDigitalInputEventResult idl_CommDigitalInputEventResult;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommBasicObjectsIDL::CommDigitalInputEventResult DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	CommDigitalInputEventResultCore();
	CommDigitalInputEventResultCore(const DATATYPE &data);
	// default destructor
	virtual ~CommDigitalInputEventResultCore();
	
	const DATATYPE& get() const { return idl_CommDigitalInputEventResult; }
	operator const DATATYPE&() const { return idl_CommDigitalInputEventResult; }
	DATATYPE& set() { return idl_CommDigitalInputEventResult; }

	static inline std::string identifier(void) { return "CommBasicObjects::CommDigitalInputEventResult"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element DigitalInputValues
	/**
	 * Getter methods for idl_CommDigitalInputEventResult.digitalInputValues of type vector<bool>
	 */
	inline std::vector<bool>& getDigitalInputValuesRef() { return idl_CommDigitalInputEventResult.digitalInputValues; }
	inline std::vector<bool> getDigitalInputValuesCopy() const {
		return std::vector<bool>(idl_CommDigitalInputEventResult.digitalInputValues.begin(), idl_CommDigitalInputEventResult.digitalInputValues.end());
	}
	inline bool getDigitalInputValuesElemAtPos(const size_t &pos) const { return idl_CommDigitalInputEventResult.digitalInputValues[pos]; }
	inline size_t getDigitalInputValuesSize() const { return idl_CommDigitalInputEventResult.digitalInputValues.size(); }
	inline bool isDigitalInputValuesEmpty() const { return idl_CommDigitalInputEventResult.digitalInputValues.empty(); }
	/**
	 * Setter methods for idl_CommDigitalInputEventResult.digitalInputValues of type vector<bool>
	 */
	inline CommDigitalInputEventResultCore& setDigitalInputValues(const std::vector<bool> &digitalInputValues) { idl_CommDigitalInputEventResult.digitalInputValues = digitalInputValues; return *this; }
	inline bool setDigitalInputValuesElemAtPos(const size_t &pos, const bool &elem) {
		if(pos < idl_CommDigitalInputEventResult.digitalInputValues.size()) {
			idl_CommDigitalInputEventResult.digitalInputValues[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertDigitalInputValuesVectorAtPos(const size_t &pos, const std::vector<bool> &data) {
		if(pos < idl_CommDigitalInputEventResult.digitalInputValues.size()) {
			idl_CommDigitalInputEventResult.digitalInputValues.insert(idl_CommDigitalInputEventResult.digitalInputValues.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeDigitalInputValues(const size_t &size) { idl_CommDigitalInputEventResult.digitalInputValues.resize(size); }
	inline bool eraseDigitalInputValuesElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_CommDigitalInputEventResult.digitalInputValues.size() ) {
			idl_CommDigitalInputEventResult.digitalInputValues.erase(idl_CommDigitalInputEventResult.digitalInputValues.begin()+pos, idl_CommDigitalInputEventResult.digitalInputValues.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearDigitalInputValues() { idl_CommDigitalInputEventResult.digitalInputValues.clear(); }
};

} /* namespace CommBasicObjects */
#endif /* COMMBASICOBJECTS_COMMDIGITALINPUTEVENTRESULT_CORE_H_ */
