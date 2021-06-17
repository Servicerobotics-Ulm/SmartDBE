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
#ifndef _PARAMETERSTATESTRUCTCORE_HH
#define _PARAMETERSTATESTRUCTCORE_HH

#include "aceSmartSoft.hh"

#include "nlohmann/json.hpp"

#include <iostream>

// forward declaration (in order to define validateCOMMIT(ParameterStateStruct) which is implemented in derived class)
class ParameterStateStruct;

class ParameterStateStructCore
{
	friend class ParamUpdateHandler;
public:
	
		///////////////////////////////////////////
		// Internal params
		///////////////////////////////////////////
		
		/**
		 * Definition of Parameter General
		 */
		class GeneralType 
		{
			friend class ParamUpdateHandler;
		protected:
			/**
			 * here are the member definitions
			 */
			std::string device;
			double interval_max;
			double interval_min;
			bool invert_x1_axis;
			bool invert_x2_axis;
			bool invert_y1_axis;
			bool invert_y2_axis;
			bool verbose;
		
		public:
			// default constructor
			GeneralType() {
				device = "/dev/input/js0";
				interval_max = 0.5;
				interval_min = 0.04;
				invert_x1_axis = false;
				invert_x2_axis = false;
				invert_y1_axis = false;
				invert_y2_axis = false;
				verbose = true;
			}
		
			/**
			 * here are the public getters
			 */
			inline std::string getDevice() const { return device; }
			inline double getInterval_max() const { return interval_max; }
			inline double getInterval_min() const { return interval_min; }
			inline bool getInvert_x1_axis() const { return invert_x1_axis; }
			inline bool getInvert_x2_axis() const { return invert_x2_axis; }
			inline bool getInvert_y1_axis() const { return invert_y1_axis; }
			inline bool getInvert_y2_axis() const { return invert_y2_axis; }
			inline bool getVerbose() const { return verbose; }
			
			void to_ostream(std::ostream &os = std::cout) const
			{
				os << "General(";
				os << "device = " << device << ", ";
				os << "interval_max = " << interval_max << ", ";
				os << "interval_min = " << interval_min << ", ";
				os << "invert_x1_axis = " << invert_x1_axis << ", ";
				os << "invert_x2_axis = " << invert_x2_axis << ", ";
				os << "invert_y1_axis = " << invert_y1_axis << ", ";
				os << "invert_y2_axis = " << invert_y2_axis << ", ";
				os << "verbose = " << verbose << ", ";
				os << ")\n";
			}
			
		}; // end class GeneralType
		
	
		///////////////////////////////////////////
		// External params
		///////////////////////////////////////////
		
	
		///////////////////////////////////////////
		// Instance params
		///////////////////////////////////////////
		
	
protected:

	// Internal params
	GeneralType General;
	
	// External params
	
	// Instance params (encapsulated in a wrapper class for each instantiated parameter repository)
	

	void setContent(const ParameterStateStructCore &commit) {
		// External params
	
	}

	// special trigger method (user upcall) called before updating parameter global state
	virtual SmartACE::ParamResponseType handleCOMMIT(const ParameterStateStruct &commitState) = 0;
public:
	ParameterStateStructCore() {  }
	virtual ~ParameterStateStructCore() {  }
	
	// internal param getters
	GeneralType getGeneral() const {
		return General;
	}
	
	// external param getters
	
	// repo wrapper class getter(s)
	
	// helper method to easily implement output stream in derived classes
	void to_ostream(std::ostream &os = std::cout) const
	{
		// Internal params
		General.to_ostream(os);
		
		// External params
		
		// Instance params (encapsulated in a wrapper class for each instantiated parameter repository)
	}
	
	std::string getAsJSONString() {
		nlohmann::json param;
	
		param["General"] = nlohmann::json {
			{"device" , getGeneral().getDevice()},
			{"interval_max" , getGeneral().getInterval_max()},
			{"interval_min" , getGeneral().getInterval_min()},
			{"invert_x1_axis" , getGeneral().getInvert_x1_axis()},
			{"invert_x2_axis" , getGeneral().getInvert_x2_axis()},
			{"invert_y1_axis" , getGeneral().getInvert_y1_axis()},
			{"invert_y2_axis" , getGeneral().getInvert_y2_axis()},
			{"verbose" , getGeneral().getVerbose()}
		};
	
		
		return param.dump();
	}
};

#endif
