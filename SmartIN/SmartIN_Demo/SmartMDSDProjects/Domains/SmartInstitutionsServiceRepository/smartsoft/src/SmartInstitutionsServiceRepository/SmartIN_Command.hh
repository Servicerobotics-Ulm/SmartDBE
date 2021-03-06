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
// This file is generated once. Modify this file to your needs. 
// If you want the toolchain to re-generate this file, please 
// delete it before running the code generator.
//--------------------------------------------------------------------------
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_SMARTIN_COMMAND_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_SMARTIN_COMMAND_H_

#include "SmartInstitutionsServiceRepository/SmartIN_CommandCore.hh"

namespace SmartInstitutionsServiceRepository {
		
class SmartIN_Command : public SmartIN_CommandCore {
	public:
		// default constructors
		SmartIN_Command();
		
		/**
		 * Constructor to set all values.
		 * NOTE that you have to keep this constructor consistent with the model!
		 * Use  at your own choice.
		 *
		 * The preferred way to set values for initialization is:
		 *      CommRepository::MyCommObject obj;
		 *      obj.setX(1).setY(2).setZ(3)...;
		 */
		// SmartIN_Command(const CommBasicObjects::CommTaskMessage &msg, const unsigned long int &commandID, const std::string &command);
		
		SmartIN_Command(const SmartIN_CommandCore &smartIN_Command);
		SmartIN_Command(const DATATYPE &smartIN_Command);
		virtual ~SmartIN_Command();
		
		// use framework specific getter and setter methods from core (base) class
		using SmartIN_CommandCore::get;
		using SmartIN_CommandCore::set;
		
		//
		// feel free to add customized methods here
		//
};

inline std::ostream &operator<<(std::ostream &os, const SmartIN_Command &co)
{
	co.to_ostream(os);
	return os;
}
	
} /* namespace SmartInstitutionsServiceRepository */
#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_SMARTIN_COMMAND_H_ */
