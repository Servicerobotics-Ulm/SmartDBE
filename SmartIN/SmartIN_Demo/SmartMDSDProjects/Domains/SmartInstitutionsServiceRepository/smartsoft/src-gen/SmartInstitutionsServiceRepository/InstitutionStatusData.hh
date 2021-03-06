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
#ifndef SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_DATA_H_
#define SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_DATA_H_

#include "SmartInstitutionsServiceRepository/enumInstitutionCategoryData.hh"
#include "SmartInstitutionsServiceRepository/MemberIdentifierData.hh"
#include "SmartInstitutionsServiceRepository/InstitutionIdentifierData.hh"
#include "SmartInstitutionsServiceRepository/enumInstitutionTypeData.hh"
#include "SmartInstitutionsServiceRepository/enumInstitutionPhaseData.hh"
#include "CommBasicObjects/CommTimeStampData.hh"

#include <vector>

namespace SmartInstitutionsServiceRepositoryIDL 
{
	typedef std::vector<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier> InstitutionStatus_institutionMembers_type;
	typedef std::vector<SmartInstitutionsServiceRepositoryIDL::MemberIdentifier> InstitutionStatus_institutionEnforcers_type;
	struct InstitutionStatus
	{
		SmartInstitutionsServiceRepositoryIDL::InstitutionIdentifier institute;
		SmartInstitutionsServiceRepositoryIDL::InstitutionCategory category;
		SmartInstitutionsServiceRepositoryIDL::InstitutionType type;
		InstitutionStatus_institutionMembers_type institutionMembers;
		InstitutionStatus_institutionEnforcers_type institutionEnforcers;
		SmartInstitutionsServiceRepositoryIDL::InstitutionPhase phase;
		CommBasicObjectsIDL::CommTimeStamp signed_at;
		SmartInstitutionsServiceRepositoryIDL::MemberIdentifier signed_by;
  	};
};

#endif /* SMARTINSTITUTIONSSERVICEREPOSITORY_INSTITUTIONSTATUS_DATA_H_ */
