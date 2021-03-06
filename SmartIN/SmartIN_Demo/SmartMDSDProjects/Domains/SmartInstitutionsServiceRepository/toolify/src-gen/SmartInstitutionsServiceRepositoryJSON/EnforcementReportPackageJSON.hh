//-----------------------------------------------------------------------------------
// Code generated by the Toolify Robotics GmbH extension for the SmartMDSD Toolchain 
// 
// Toolify Robotics GmbH
// Weinbergweg 216
// 89075 Ulm 
//
// Information about the SmartSoft MDSD Toolchain is available at:
// www.servicerobotik-ulm.de
//
// Please do not modify this file. It will be re-generated
// running the code generator.
//-----------------------------------------------------------------------------------

#ifndef ENFORCEMENTREPORTPACKAGE_JSON_TRANSFORMATION_H_
#define ENFORCEMENTREPORTPACKAGE_JSON_TRANSFORMATION_H_

#include <nlohmann/json.hpp>

#include <SmartInstitutionsServiceRepository/EnforcementReportPackageData.hh>

namespace SmartInstitutionsServiceRepositoryIDL {

	void to_json(const SmartInstitutionsServiceRepositoryIDL::EnforcementReportPackage& obj, nlohmann::json& j);
	void from_json(const nlohmann::json& j, SmartInstitutionsServiceRepositoryIDL::EnforcementReportPackage& obj);
	
} // end namespace SmartInstitutionsServiceRepositoryIDL

#endif // ENFORCEMENTREPORTPACKAGE_JSON_TRANSFORMATION_H_
