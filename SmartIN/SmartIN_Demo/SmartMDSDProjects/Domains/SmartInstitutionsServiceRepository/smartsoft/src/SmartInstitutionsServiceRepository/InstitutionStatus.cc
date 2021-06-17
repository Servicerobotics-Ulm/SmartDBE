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

#include "SmartInstitutionsServiceRepository/InstitutionStatus.hh"

using namespace SmartInstitutionsServiceRepository;

InstitutionStatus::InstitutionStatus()
:	InstitutionStatusCore()
{  }


/**
 * Constructor to set all values.
 * NOTE that you have to keep this constructor consistent with the model!
 * Use  at your own choice.
 *
 * The preferred way to set values for initialization is:
 *      CommRepository::MyCommObject obj;
 *      obj.setX(1).setY(2).setZ(3)...;
InstitutionStatus::InstitutionStatus(const SmartInstitutionsServiceRepository::InstitutionIdentifier &institute, const SmartInstitutionsServiceRepository::InstitutionCategory &category, const SmartInstitutionsServiceRepository::InstitutionType &type, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &institutionMembers, const std::vector<SmartInstitutionsServiceRepository::MemberIdentifier> &institutionEnforcers, const SmartInstitutionsServiceRepository::InstitutionPhase &phase, const CommBasicObjects::CommTimeStamp &signed_at, const SmartInstitutionsServiceRepository::MemberIdentifier &signed_by)
:	InstitutionStatusCore() // base constructor sets default values as defined in the model
{
	setInstitute(institute);
	setCategory(category);
	setType(type);
	setInstitutionMembers(institutionMembers);
	setInstitutionEnforcers(institutionEnforcers);
	setPhase(phase);
	setSigned_at(signed_at);
	setSigned_by(signed_by);
}
 */

InstitutionStatus::InstitutionStatus(const InstitutionStatusCore &institutionStatus)
:	InstitutionStatusCore(institutionStatus)
{  }

InstitutionStatus::InstitutionStatus(const DATATYPE &institutionStatus)
:	InstitutionStatusCore(institutionStatus)
{  }

InstitutionStatus::~InstitutionStatus()
{  }
