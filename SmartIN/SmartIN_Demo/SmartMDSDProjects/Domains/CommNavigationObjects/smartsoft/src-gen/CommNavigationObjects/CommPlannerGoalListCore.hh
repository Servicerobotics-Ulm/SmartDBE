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
#ifndef COMMNAVIGATIONOBJECTS_COMMPLANNERGOALLIST_CORE_H_
#define COMMNAVIGATIONOBJECTS_COMMPLANNERGOALLIST_CORE_H_

#include "CommNavigationObjects/CommPlannerGoalListData.hh"

#include <iostream>
#include <string>
#include <list>

namespace CommNavigationObjects {
	
class CommPlannerGoalListCore {
protected:
	// data structure
	CommNavigationObjectsIDL::CommPlannerGoalList idl_CommPlannerGoalList;
	
public:
	// give a publicly accessible type-name for the template parameter IDL
	typedef CommNavigationObjectsIDL::CommPlannerGoalList DATATYPE;
	
	#ifdef ENABLE_HASH
		static size_t generateDataHash(const DATATYPE &);
	#endif
	
	static const char* getCompiledHash();
	static void getAllHashValues(std::list<std::string> &hashes);
	static void checkAllHashValues(std::list<std::string> &hashes);
	
	// default constructors
	CommPlannerGoalListCore();
	CommPlannerGoalListCore(const DATATYPE &data);
	// default destructor
	virtual ~CommPlannerGoalListCore();
	
	const DATATYPE& get() const { return idl_CommPlannerGoalList; }
	operator const DATATYPE&() const { return idl_CommPlannerGoalList; }
	DATATYPE& set() { return idl_CommPlannerGoalList; }

	static inline std::string identifier(void) { return "CommNavigationObjects::CommPlannerGoalList"; }
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const;
	
	// convert to xml stream
	void to_xml(std::ostream &os, const std::string &indent = "") const;
	
	// restore from xml stream
	void from_xml(std::istream &is);
	
	// User Interface
	
	// getter and setter for element Id
	inline int getId() const { return idl_CommPlannerGoalList.id; }
	inline CommPlannerGoalListCore& setId(const int &id) { idl_CommPlannerGoalList.id = id; return *this; }
	
	// getter and setter for element Flag
	inline int getFlag() const { return idl_CommPlannerGoalList.flag; }
	inline CommPlannerGoalListCore& setFlag(const int &flag) { idl_CommPlannerGoalList.flag = flag; return *this; }
	
	// getter and setter for element GoalXvector
	/**
	 * Getter methods for idl_CommPlannerGoalList.goalXvector of type vector<double>
	 */
	inline std::vector<double>& getGoalXvectorRef() { return idl_CommPlannerGoalList.goalXvector; }
	inline std::vector<double> getGoalXvectorCopy() const {
		return std::vector<double>(idl_CommPlannerGoalList.goalXvector.begin(), idl_CommPlannerGoalList.goalXvector.end());
	}
	inline double getGoalXvectorElemAtPos(const size_t &pos) const { return idl_CommPlannerGoalList.goalXvector[pos]; }
	inline size_t getGoalXvectorSize() const { return idl_CommPlannerGoalList.goalXvector.size(); }
	inline bool isGoalXvectorEmpty() const { return idl_CommPlannerGoalList.goalXvector.empty(); }
	/**
	 * Setter methods for idl_CommPlannerGoalList.goalXvector of type vector<double>
	 */
	inline CommPlannerGoalListCore& setGoalXvector(const std::vector<double> &goalXvector) { idl_CommPlannerGoalList.goalXvector = goalXvector; return *this; }
	inline bool setGoalXvectorElemAtPos(const size_t &pos, const double &elem) {
		if(pos < idl_CommPlannerGoalList.goalXvector.size()) {
			idl_CommPlannerGoalList.goalXvector[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertGoalXvectorVectorAtPos(const size_t &pos, const std::vector<double> &data) {
		if(pos < idl_CommPlannerGoalList.goalXvector.size()) {
			idl_CommPlannerGoalList.goalXvector.insert(idl_CommPlannerGoalList.goalXvector.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeGoalXvector(const size_t &size) { idl_CommPlannerGoalList.goalXvector.resize(size); }
	inline bool eraseGoalXvectorElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_CommPlannerGoalList.goalXvector.size() ) {
			idl_CommPlannerGoalList.goalXvector.erase(idl_CommPlannerGoalList.goalXvector.begin()+pos, idl_CommPlannerGoalList.goalXvector.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearGoalXvector() { idl_CommPlannerGoalList.goalXvector.clear(); }
	
	// getter and setter for element GoalYvector
	/**
	 * Getter methods for idl_CommPlannerGoalList.goalYvector of type vector<double>
	 */
	inline std::vector<double>& getGoalYvectorRef() { return idl_CommPlannerGoalList.goalYvector; }
	inline std::vector<double> getGoalYvectorCopy() const {
		return std::vector<double>(idl_CommPlannerGoalList.goalYvector.begin(), idl_CommPlannerGoalList.goalYvector.end());
	}
	inline double getGoalYvectorElemAtPos(const size_t &pos) const { return idl_CommPlannerGoalList.goalYvector[pos]; }
	inline size_t getGoalYvectorSize() const { return idl_CommPlannerGoalList.goalYvector.size(); }
	inline bool isGoalYvectorEmpty() const { return idl_CommPlannerGoalList.goalYvector.empty(); }
	/**
	 * Setter methods for idl_CommPlannerGoalList.goalYvector of type vector<double>
	 */
	inline CommPlannerGoalListCore& setGoalYvector(const std::vector<double> &goalYvector) { idl_CommPlannerGoalList.goalYvector = goalYvector; return *this; }
	inline bool setGoalYvectorElemAtPos(const size_t &pos, const double &elem) {
		if(pos < idl_CommPlannerGoalList.goalYvector.size()) {
			idl_CommPlannerGoalList.goalYvector[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertGoalYvectorVectorAtPos(const size_t &pos, const std::vector<double> &data) {
		if(pos < idl_CommPlannerGoalList.goalYvector.size()) {
			idl_CommPlannerGoalList.goalYvector.insert(idl_CommPlannerGoalList.goalYvector.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeGoalYvector(const size_t &size) { idl_CommPlannerGoalList.goalYvector.resize(size); }
	inline bool eraseGoalYvectorElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_CommPlannerGoalList.goalYvector.size() ) {
			idl_CommPlannerGoalList.goalYvector.erase(idl_CommPlannerGoalList.goalYvector.begin()+pos, idl_CommPlannerGoalList.goalYvector.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearGoalYvector() { idl_CommPlannerGoalList.goalYvector.clear(); }
	
	// getter and setter for element NodeObstacleVector
	/**
	 * Getter methods for idl_CommPlannerGoalList.nodeObstacleVector of type vector<double>
	 */
	inline std::vector<double>& getNodeObstacleVectorRef() { return idl_CommPlannerGoalList.nodeObstacleVector; }
	inline std::vector<double> getNodeObstacleVectorCopy() const {
		return std::vector<double>(idl_CommPlannerGoalList.nodeObstacleVector.begin(), idl_CommPlannerGoalList.nodeObstacleVector.end());
	}
	inline double getNodeObstacleVectorElemAtPos(const size_t &pos) const { return idl_CommPlannerGoalList.nodeObstacleVector[pos]; }
	inline size_t getNodeObstacleVectorSize() const { return idl_CommPlannerGoalList.nodeObstacleVector.size(); }
	inline bool isNodeObstacleVectorEmpty() const { return idl_CommPlannerGoalList.nodeObstacleVector.empty(); }
	/**
	 * Setter methods for idl_CommPlannerGoalList.nodeObstacleVector of type vector<double>
	 */
	inline CommPlannerGoalListCore& setNodeObstacleVector(const std::vector<double> &nodeObstacleVector) { idl_CommPlannerGoalList.nodeObstacleVector = nodeObstacleVector; return *this; }
	inline bool setNodeObstacleVectorElemAtPos(const size_t &pos, const double &elem) {
		if(pos < idl_CommPlannerGoalList.nodeObstacleVector.size()) {
			idl_CommPlannerGoalList.nodeObstacleVector[pos] = elem;
			return true;
		}
		return false;
	}
	inline bool insertNodeObstacleVectorVectorAtPos(const size_t &pos, const std::vector<double> &data) {
		if(pos < idl_CommPlannerGoalList.nodeObstacleVector.size()) {
			idl_CommPlannerGoalList.nodeObstacleVector.insert(idl_CommPlannerGoalList.nodeObstacleVector.begin()+pos, data.begin(), data.end());
			return true;
		}
		return false;
	}
	inline void resizeNodeObstacleVector(const size_t &size) { idl_CommPlannerGoalList.nodeObstacleVector.resize(size); }
	inline bool eraseNodeObstacleVectorElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
		if( (pos+nbr_elems) <= idl_CommPlannerGoalList.nodeObstacleVector.size() ) {
			idl_CommPlannerGoalList.nodeObstacleVector.erase(idl_CommPlannerGoalList.nodeObstacleVector.begin()+pos, idl_CommPlannerGoalList.nodeObstacleVector.begin()+pos+nbr_elems);
			return true;
		}
		return false;
	}
	inline void clearNodeObstacleVector() { idl_CommPlannerGoalList.nodeObstacleVector.clear(); }
	
	// getter and setter for element FinalGoalX
	inline double getFinalGoalX() const { return idl_CommPlannerGoalList.finalGoalX; }
	inline CommPlannerGoalListCore& setFinalGoalX(const double &finalGoalX) { idl_CommPlannerGoalList.finalGoalX = finalGoalX; return *this; }
	
	// getter and setter for element FinalGoalY
	inline double getFinalGoalY() const { return idl_CommPlannerGoalList.finalGoalY; }
	inline CommPlannerGoalListCore& setFinalGoalY(const double &finalGoalY) { idl_CommPlannerGoalList.finalGoalY = finalGoalY; return *this; }
};

} /* namespace CommNavigationObjects */
#endif /* COMMNAVIGATIONOBJECTS_COMMPLANNERGOALLIST_CORE_H_ */
