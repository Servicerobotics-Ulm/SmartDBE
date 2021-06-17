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
#ifndef SMARTINSTITUTIONS_SERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_DATA_H_
#define SMARTINSTITUTIONS_SERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_DATA_H_

#include "SmartInstitutions_ServiceRepository/PackageIdentifierData.hh"
#include "SmartInstitutions_ServiceRepository/MemberIdentifierData.hh"
#include "SmartInstitutions_ServiceRepository/InstitutionStatusData.hh"

#include <string>

namespace SmartInstitutions_ServiceRepositoryIDL 
{
	struct EnforcementReplyPackage
	{
		SmartInstitutions_ServiceRepositoryIDL::PackageIdentifier id;
		SmartInstitutions_ServiceRepositoryIDL::PackageIdentifier replyingto;
		SmartInstitutions_ServiceRepositoryIDL::MemberIdentifier to;
		SmartInstitutions_ServiceRepositoryIDL::MemberIdentifier from;
		SmartInstitutions_ServiceRepositoryIDL::InstitutionStatus context;
		std::string reply;
  	};
};

#endif /* SMARTINSTITUTIONS_SERVICEREPOSITORY_ENFORCEMENTREPLYPACKAGE_DATA_H_ */
