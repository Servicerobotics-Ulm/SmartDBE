package org.smartdbe.common.smartmdsdwrapper.resourcemanager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.smartmdsdwrapper.console.SmartMDSDWrapperConsole;

public class SmartResourceManager {
	private SmartMDSDWrapperConsole SmartMDSDWrapperout = new SmartMDSDWrapperConsole();
	DBEDefine DBEDef = new DBEDefine();	
	
	public SmartResourceManager()	{
		SmartMDSDWrapperout.setUserHeader("Smart Resource Manager"); 
	}
	
	public IResource getSelectedResource(IWorkbenchWindow window) {
		SmartMDSDWrapperout.println("getSelectedResource | IN");
		ISelection selection = window.getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IResource) {
				SmartMDSDWrapperout.println("getSelectedResource | OUT IResource");
				return (IResource) firstElement;
			} else if (firstElement instanceof IProjectNature) {
				IProjectNature projNature = (IProjectNature) firstElement;
				SmartMDSDWrapperout.println("getSelectedResource | OUT IProjectNature.IResource");
				return projNature.getProject();
			}
		}
		SmartMDSDWrapperout.println("getSelectedResource | OUT Null");
		return null;
	}
	
	public boolean isDomainProject(IProject project)	{
		SmartMDSDWrapperout.println("isDomainProject | IN");
		String DomainName = project.getName();
		String servicemodelfilename = DBEDef.modelFolderName + DomainName + DBEDef.DomainServicesFileExtension;
		IFile servicemodelfile = project.getFile(servicemodelfilename);
		if (servicemodelfile.exists()) {
			SmartMDSDWrapperout.println("isDomainProject | OUT " + DomainName + " is Domain Project");
			return true;
		}
		SmartMDSDWrapperout.println("isDomainProject | OUT " + DomainName + " is not Domain Project");
		return false;
	}
	
	public boolean isComponentProject(IProject project)	{
		SmartMDSDWrapperout.println("isComponentProject | IN");
		String ComponentName = project.getName();
		String componentmodelfilename = DBEDef.modelFolderName + ComponentName + DBEDef.ComponentFileExtension;
		IFile componentmodelfile = project.getFile(componentmodelfilename);
		if (componentmodelfile.exists()) {
			SmartMDSDWrapperout.println("isComponentProject | OUT " + ComponentName + " is Component Project");
			return true;
		}
		SmartMDSDWrapperout.println("isComponentProject | OUT " + ComponentName + " is not Component Project");
		return false;
	}
	
	public boolean isSystemProject(IProject project)	{
		SmartMDSDWrapperout.println("isSystemProject | IN");
		String SystemName = project.getName();
		String systemmodelfilename = DBEDef.modelFolderName + SystemName + DBEDef.componentArchFileExtension;
		IFile systemmodelfile = project.getFile(systemmodelfilename);
		if (systemmodelfile.exists()) {
			SmartMDSDWrapperout.println("isSystemProject | OUT " + SystemName + " is System Project");
			return true;
		}
		SmartMDSDWrapperout.println("isSystemProject | OUT " + SystemName + " is not System Project");
		return false;
	}
	
}
