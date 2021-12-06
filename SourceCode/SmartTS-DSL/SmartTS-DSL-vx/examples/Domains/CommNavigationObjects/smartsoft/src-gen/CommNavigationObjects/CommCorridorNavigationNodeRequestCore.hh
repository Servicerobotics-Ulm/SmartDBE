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
#ifndef COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONNODEREQUEST_CORE_H_
#define COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONNODEREQUEST_CORE_H_

#include "CommNavigationObjects/CommCorridorNavigationNodeRequestData.hh"
#include "CommNavigationObjects/CommCorridorNode.hh"
#include "CommNavigationObjects/enumNavigationNodeRequestType.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommNavigationObjects {
	
class CommCorridorNavigationNodeRequestCore {
protected:
	// data structure
	CommNavigationObjectsIDL::CommCorridorNavigationNodeRequest idl_CommCorridorNavigationNodeRequest;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommNavigationObjectsIDL::CommCorridorNavigationNodeRequest DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	CommCorridorNavigationNodeRequestCore();
	CommCorridorNavigationNodeRequestCore(const DATATYPE &data);
	// default destructor
	virtual ~CommCorridorNavigationNodeRequestCore();
	
	const DATATYPE& get() const { return idl_CommCorridorNavigationNodeRequest; }
	operator const DATATYPE&() const { return idl_CommCorridorNavigationNodeRequest; }
	DATATYPE& set() { return idl_CommCorridorNavigationNodeRequest; }

	static inline std::string identifier(void) { return "CommNavigationObjects::CommCorridorNavigationNodeRequest"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element RequestType
	inline CommNavigationObjects::NavigationNodeRequestType getRequestType() const { return CommNavigationObjects::NavigationNodeRequestType(idl_CommCorridorNavigationNodeRequest.requestType); }
	inline CommCorridorNavigationNodeRequestCore& setRequestType(const CommNavigationObjects::NavigationNodeRequestType &requestType) { idl_CommCorridorNavigationNodeRequest.requestType = requestType; return *this; }
	
	// getter and setter for element NodesList
	/**
	 * Getter methods for element idl_CommCorridorNavigationNodeRequest.nodesList of type vector<CommNavigationObjects::CommCorridorNode>
	 */
	inline std::vector<CommNavigationObjects::CommCorridorNode> getNodesListCopy() const { 
		return std::vector<CommNavigationObjects::CommCorridorNode>(idl_CommCorridorNavigationNodeRequest.nodesList.begin(), idl_CommCorridorNavigationNodeRequest.nodesList.end());
	}
	inline CommNavigationObjects::CommCorridorNode getNodesListElemAtPos(const size_t &pos) const {
		return CommNavigationObjects::CommCorridorNode(idl_CommCorridorNavigationNodeRequest.nodesList[pos]);
	}
	inline size_t getNodesListSize() const { return idl_CommCorridorNavigationNodeRequest.nodesList.size(); }
	inline bool isNodesListEmpty() const { return idl_CommCorridorNavigationNodeRequest.nodesList.empty(); }
	/**
	 * Setter methods for idl_CommCorridorNavigationNodeRequest.nodesList of type vector<CommNavigationObjects::CommCorridorNode>
	 */
	inline CommCorridorNavigationNodeRequestCore& setNodesList(const std::vector<CommNavigationObjects::CommCorridorNode> &nodesList) { 
		idl_CommCorridorNavigationNodeRequest.nodesList.assign(nodesList.begin(), nodesList.end());
		return *this;
	}
	inline bool setNodesListElemAtPos(const size_t &pos, const CommNavigationObjects::CommCorridorNode &elem) {
		if(pos < idl_CommCorridorNavigationNodeRequest.nodesList.size()) {
			idl_CommCorridorNavigationNodeRequest.nodesList[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertNodesListVectorAtPos(const size_t &pos, const std::vector<CommNavigationObjects::CommCorridorNode> &data) {
		if(pos < idl_CommCorridorNavigationNodeRequest.nodesList.size()) {
			idl_CommCorridorNavigationNodeRequest.nodesList.insert(idl_CommCorridorNavigationNodeRequest.nodesList.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeNodesList(const size_t &size) { idl_CommCorridorNavigationNodeRequest.nodesList.resize(size); }
	inline bool eraseNodesListElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_CommCorridorNavigationNodeRequest.nodesList.size() ) {
			idl_CommCorridorNavigationNodeRequest.nodesList.erase(idl_CommCorridorNavigationNodeRequest.nodesList.begin()+pos, idl_CommCorridorNavigationNodeRequest.nodesList.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearNodesList() { idl_CommCorridorNavigationNodeRequest.nodesList.clear(); }
	
	// getter and setter for element RobotID
	inline std::string getRobotID() const { return idl_CommCorridorNavigationNodeRequest.robotID; }
	inline CommCorridorNavigationNodeRequestCore& setRobotID(const std::string &robotID) { idl_CommCorridorNavigationNodeRequest.robotID = robotID; return *this; }
};

} /* namespace CommNavigationObjects */
#endif /* COMMNAVIGATIONOBJECTS_COMMCORRIDORNAVIGATIONNODEREQUEST_CORE_H_ */