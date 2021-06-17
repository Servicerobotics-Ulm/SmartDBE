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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_H_

#include "SmartInstitutionsServiceRepository/InstitutionStatusCore.hh"

namespace SmartInstitutionsServiceRepository {
		
class InstitutionStatus : public InstitutionStatusCore {
	public:
		// default constructors
		InstitutionStatus();
		
		/**
		 * Constructor to set all values.
		 * NOTE that you have to keep this constructor consistent with the model!
		 * Use  at your own choice.
		 *
		 * The preferred way to set values for initialization is:
		 *      CommRepository::MyCommObject obj;
		 *      obj.setX(1).setY(2).setZ(3)...;
		 */
		// InstitutionStatus(const SmartInstitutionsServiceRepository::InstitutionIdentifier &institute, const SmartInstitutionsServiceRepository::InstitutionCategory &category, const SmartInstitutionsServiceRepository::InstitutionType &type, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &institutionMembers, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &institutionEnforcers, const SmartInstitutionsServiceRepository::InstitutionPhase &phase, const CommBasicObjects::CommTimeStamp &signed_at, const SmartInstitutionsServiceRepository::MemberIdentifier &signed_by);
		
		InstitutionStatus(const InstitutionStatusCore &institutionStatus);
		InstitutionStatus(const DATATYPE &institutionStatus);
		virtual ~InstitutionStatus();
		
		// use framework specific getter and setter methods from core (base) class
		using InstitutionStatusCore::get;
		using InstitutionStatusCore::set;
		
		//
		// feel free to add customized methods here
		//
};

inline std::ostream &operator<<(std::ostream &os, const InstitutionStatus &co)
{
	co.to_ostream(os);
	return os;
}
	
} /* namespace SmartInstitutionsServiceRepository */
#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_H_ */
