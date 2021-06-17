#include "SLAMCoordinationServiceCore.hh"
#include "runTimeInterface.hh"

typedef ACE_Singleton<SLAMCoordinationServiceCore, ACE_Thread_Mutex> SLAMCOORDINATIONSERVICE_MODULE;

//INIT FUNCTION

extern "C" int initSLAMCoordinationService(SmartACE::SmartComponent * component, const std::string& ciInstanceName, const std::map< std::string,  CiConnection, ciLessLibC > &ciConnectionsMap){
	SLAMCOORDINATIONSERVICE_MODULE::instance()->addNewModuleInstance(ciInstanceName);

	return SLAMCOORDINATIONSERVICE_MODULE::instance()->initCiInstance(component,ciInstanceName,ciConnectionsMap);
}



//FINI FUNCTION

extern "C" int finiSLAMCoordinationService(const std::string& ciInstanceName){
	return SLAMCOORDINATIONSERVICE_MODULE::instance()->finiCiInstance(ciInstanceName);
}


//SWITCH FUNCTION

extern "C" std::string switchSLAMCoordinationService(const std::string& ciInstanceName, const std::string& componentName, const std::string& componentInstanceName, const std::string& service, const std::string& inString)
{
	return SLAMCOORDINATIONSERVICE_MODULE::instance()->switchCi(ciInstanceName,componentName,componentInstanceName,service,inString);
}
