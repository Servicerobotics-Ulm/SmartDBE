#ifndef MAPPERCOORDINATIONSERVICECORE_H_
#define MAPPERCOORDINATIONSERVICECORE_H_
#include "aceSmartSoft.hh"
#include "runTimeInterface.hh"

#include <string>
#include <map>
#include <iostream>

#include "MapperCoordinationService.hh"

 class MapperCoordinationServiceCore {
 	friend class ACE_Singleton<MapperCoordinationServiceCore, ACE_Thread_Mutex>;
private:
	MapperCoordinationServiceCore (){
		std::cout<<"Create MapperCoordinationService Module Singelton..."<<std::endl;
	}
	~MapperCoordinationServiceCore (){
		std::cout<<"Destroy MapperCoordinationService Module Singelton..."<<std::endl;
	}
	
	std::map<std::string, MapperCoordinationService, ciLessLibC> ciInstanceMap;
public:
	void addNewModuleInstance(const std::string& name);
	int initCiInstance(SmartACE::SmartComponent * component, const std::string& ciInstanceName, const std::map< std::string, CiConnection, ciLessLibC> &ciConnectionsMap);
	int finiCiInstance(const std::string& ciInstanceName);
	std::string switchCi(const std::string& ciInstanceName, const std::string& componentName, const std::string& componentInstanceName, const std::string& service, const std::string& inString);

 };
#endif /* MAPPERCOORDINATIONSERVICECORE_H_ */
