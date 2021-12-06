//================================================================
//
//  Copyright (c) 2021 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
//
//        Servicerobotik Ulm 
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//	  http://www.servicerobotik-ulm.de/
//
//  This file is part of the Smart Test Suite (SmartTS) extension 
//  for SmartMDSD Toolchain.
//
//  Author:
//		Vineet Nagrath
//
//  Licence:
//
//  BSD 3-Clause License
//  
//  Copyright (c) 2021, Servicerobotics Ulm
//  All rights reserved.
//  
//  Redistribution and use in source and binary forms, with or without
//  modification, are permitted provided that the following conditions are met:
//  
//  * Redistributions of source code must retain the above copyright notice, this
//    list of conditions and the following disclaimer.
//  
//  * Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
//  
//  * Neither the name of the copyright holder nor the names of its
//    contributors may be used to endorse or promote products derived from
//    this software without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
//  FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
//  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
//  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
//  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
//  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
//  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//  https://opensource.org/licenses/BSD-3-Clause
//
//================================================================
package org.smartts.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.SmartResourceManager;
import org.smartts.dsl.console.SmartTSConsole;

public class CreateNewTSModelHandler extends AbstractHandler {

	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();
	public TSDefine TSDef = new TSDefine();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		SmartTSConsole SmartTSout = new SmartTSConsole();
		SmartTSout.clear();
		SmartTSout.println("Create New TSModel Handler | IN");

		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = SRMan.getSelectedResource(window);
		IProject project = null;
		try {
			project = resource.getProject();
		} catch (Exception e1) {
			SmartTSout.println("Create New TSModel Handler | XXXX Error Accessing Project Resources !!");
			SmartTSout.println(
					"Create New TSModel Handler | XXXX Pop and use this menu on Project root folder or on one of the model files.");
			SmartTSout.println("Create New TSModel Handler | OUT");
			return null;
		}
		if (project.getRawLocation() != null) {
			NewDomainTSModelHandler newDomainTSModelHandler = new NewDomainTSModelHandler();
			newDomainTSModelHandler.Run(window, project);
			String returnedNewDomainTSModelHandler = newDomainTSModelHandler.ReturnString; 
			if(returnedNewDomainTSModelHandler.equals(newDomainTSModelHandler.NotServiceProject))	{
				NewComponentTSModelHandler newComponentTSModelHandler = new NewComponentTSModelHandler();
				newComponentTSModelHandler.Run(window, project);
				String returnedNewComponentTSModelHandler = newComponentTSModelHandler.ReturnString;
				if(returnedNewComponentTSModelHandler.equals(newComponentTSModelHandler.NotComponentProject))	{
					SmartTSout.println("Create New TSModel Handler | XXXX Error No Domain/Component Project Found !!");
				}else	{
					SmartTSout.println("Create New TSModel Handler | Component TSModel Processed: " + returnedNewComponentTSModelHandler);
				}				
			}	else	{
				SmartTSout.println("Create New TSModel Handler | Service TSModel Processed: " + returnedNewDomainTSModelHandler);
			}
		} else
		{
			SmartTSout.println(
					"Create New TSModel Handler | WORKSPACE ERROR !! project.getRawLocation() is found to be null.");
		}
		SmartTSout.println("Create New TSModel Handler | OUT");
		SmartTSout.line("ll");
		return null;
	}
}
