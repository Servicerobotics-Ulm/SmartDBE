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
package org.smartts.dsl.testsuite.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.smartdbe.common.define.DBEDefine;
import org.smartdbe.common.define.TSDefine;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.SmartResourceManager;
import org.smartts.dsl.console.SmartTSConsole;
import org.smartts.dsl.testsuite.metamodel.DataSetReference;
import org.smartts.dsl.testsuite.metamodel.EUT_TS;
import org.smartts.dsl.testsuite.metamodel.ObjDocReferences;
import org.smartts.dsl.testsuite.metamodel.Postcondition;
import org.smartts.dsl.testsuite.metamodel.Precondition;
import org.smartts.dsl.testsuite.metamodel.Rule;
import org.smartts.dsl.testsuite.metamodel.TestCase;
import org.smartts.dsl.testsuite.metamodel.TestResult;
import org.smartts.dsl.testsuite.metamodel.TestRun;
import org.smartts.dsl.testsuite.metamodel.TestVariable;
import org.smartts.dsl.testsuite.metamodel.Threshold;
import org.smartts.dsl.testsuite.metamodel.Truecondition;

/*#JFramePart
ADD THESE TO IMPORTS
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.TabFolder;*/

public class TestSuiteMainHandler extends AbstractHandler implements ActionListener {
	public SmartResourceManager SRMan = new SmartResourceManager();
	public DBEDefine DBEDef = new DBEDefine();
	public TSDefine TSDef = new TSDefine();
	IWorkbenchWindow window;

	/*
	 * #JFramePart static GraphicsConfiguration gc; JFrame JFSmartTS; JButton
	 * CreateNewSmartTSModel, EditExistingSmartTSModel; JTextField FileName;
	 * FileDialog FilePicker; File LatestFileSelection;
	 */

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		createSmartTSModelTemplate();

		/*
		 * #JFramePart JFSmartTS = new JFrame(gc); JFSmartTS.setTitle("SmartTS");
		 * JFSmartTS.setSize(600, 400); JFSmartTS.setVisible(true);
		 * 
		 * CreateNewSmartTSModel = new JButton("Create New SmartTS Model");
		 * EditExistingSmartTSModel = new JButton("Edit Existing SmartTS Model");
		 * FileName = new JTextField("File"); FileName.setEditable(false);
		 * 
		 * CreateNewSmartTSModel.setBounds(10, 20, 250, 19);
		 * EditExistingSmartTSModel.setBounds(10, 40, 250, 19); FileName.setBounds(10,
		 * 60, 590, 19); FilePicker = new FileDialog(window.getShell(), SWT.OPEN);
		 * FilePicker.setFilterExtensions(new String[] { "*.txt" });
		 * 
		 * CreateNewSmartTSModel.addActionListener(this);
		 * EditExistingSmartTSModel.addActionListener(this);
		 * 
		 * JFSmartTS.add(CreateNewSmartTSModel);
		 * JFSmartTS.add(EditExistingSmartTSModel); JFSmartTS.add(FileName);
		 * 
		 * JFSmartTS.setLayout(null); JFSmartTS.setFont(new Font("Serif", Font.PLAIN,
		 * 14));
		 * 
		 * SwingUtilities.updateComponentTreeUI(JFSmartTS);
		 */
		// MessageDialog.openInformation(window.getShell(), "Smart Test Suite", "Hello,
		// from TestSuiteMainHandler");
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * #JFramePart if (e.getSource() == EditExistingSmartTSModel) { JFileChooser
		 * fileChooser = new JFileChooser(); int option =
		 * fileChooser.showOpenDialog(JFSmartTS); if (option ==
		 * JFileChooser.APPROVE_OPTION) { LatestFileSelection =
		 * fileChooser.getSelectedFile();
		 * FileName.setText(LatestFileSelection.getAbsolutePath()); } else {
		 * FileName.setText("File Not Selected !"); } }
		 */
	}

	public void createSmartTSModelTemplate() {
		SmartTSConsole SmartTSout = new SmartTSConsole();
		SmartTSout.clear();
		SmartTSout.println("Test Suite Main Handler | IN");

		IResource resource = SRMan.getSelectedResource(window);
		IProject project = null;
		try {
			project = resource.getProject();
		} catch (Exception e1) {
			SmartTSout.println("Test Suite Main Handler | XXXX Error Accessing Project Resources !!");
			SmartTSout.println(
					"Test Suite Main Handler | XXXX Pop and use this menu on Project root folder or on one of the model files.");
			SmartTSout.println("Test Suite Main Handler | OUT");
			return;
		}
		if (project.getRawLocation() != null) {
			String ProjectName = project.getName();
			String[] options = { "Template_Project", "SmartMDSD_Domain_Model", "SmartMDSD_Component_Model",
					"SmartMDSD_System_Model", "SmartMDSD_Behavior_Model" };
			String iconfilePath = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/SmartTS.png";
			ImageIcon icon = new ImageIcon(iconfilePath);
			String ModelPackageType = "NA";
			ModelPackageType = (String) JOptionPane.showInputDialog(null, "Select Model Package:", "Model Package",
					JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);

			if (ModelPackageType == null) {
				SmartTSout.println("Test Suite Main Handler | OUT");
				SmartTSout.line("ll");
				return;
			}

			String EUTName = "NA";
			if (ModelPackageType.equals(options[0])) {
				String iconfilePath2 = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/SmartTS.png";
				ImageIcon icon2 = new ImageIcon(iconfilePath2);
				String[] options2 = { "Parameter_Definitions", "Skill_Definitions", "Task_Definitions",
						"Communication_Objects", "Modes", "Data_sheet", "Dependency_Environments", "Dependency_Objects",
						"Dependency_Connectors", "Services_Definitions", "Component_Parameters", "Skill_Realization",
						"Component_Data_sheet", "Dependency_Object_Model", "Component_Definition", "System_Parameters",
						"Activity_Architecture", "Deployment_Model", "Target_Platform_Model", "System_Data_sheet",
						"Dependency_Graph_Model", "Cause_Effect_Chain_Model", "System_Architecture",
						"Task_Realization_Model" };
				EUTName = (String) JOptionPane.showInputDialog(null, "Select Entity Under Test:",
						ModelPackageType + "Entity Under Test", JOptionPane.QUESTION_MESSAGE, icon2, options2,
						options2[0]);
			}
			if (ModelPackageType.equals(options[1])) {
				String iconfilePath2 = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/Domain.png";
				ImageIcon icon2 = new ImageIcon(iconfilePath2);
				String[] options2 = { "Parameter_Definitions", "Skill_Definitions", "Task_Definitions",
						"Communication_Objects", "Modes", "Data_sheet", "Dependency_Environments", "Dependency_Objects",
						"Dependency_Connectors", "Services_Definitions" };
				EUTName = (String) JOptionPane.showInputDialog(null, "Select Entity Under Test:",
						ModelPackageType + "Entity Under Test", JOptionPane.QUESTION_MESSAGE, icon2, options2,
						options2[0]);
			}
			if (ModelPackageType.equals(options[2])) {
				String iconfilePath2 = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/Component.png";
				ImageIcon icon2 = new ImageIcon(iconfilePath2);
				String[] options2 = { "Component_Parameters", "Skill_Realization", "Component_Data_sheet",
						"Dependency_Object_Model", "Component_Definition" };
				EUTName = (String) JOptionPane.showInputDialog(null, "Select Entity Under Test:",
						ModelPackageType + "Entity Under Test", JOptionPane.QUESTION_MESSAGE, icon2, options2,
						options2[0]);
			}
			if (ModelPackageType.equals(options[3])) {
				String iconfilePath2 = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/System.png";
				ImageIcon icon2 = new ImageIcon(iconfilePath2);
				String[] options2 = { "System_Parameters", "Activity_Architecture", "Deployment_Model",
						"Target_Platform_Model", "System_Data_sheet", "Dependency_Graph_Model",
						"Cause_Effect_Chain_Model", "System_Architecture" };
				EUTName = (String) JOptionPane.showInputDialog(null, "Select Entity Under Test:",
						ModelPackageType + "Entity Under Test", JOptionPane.QUESTION_MESSAGE, icon2, options2,
						options2[0]);
			}
			if (ModelPackageType.equals(options[4])) {
				String iconfilePath2 = System.getenv("SMART_ROOT_ACE") + "/SmartTSbox/Behaviour.png";
				ImageIcon icon2 = new ImageIcon(iconfilePath2);
				String[] options2 = { "Task_Realization_Model" };
				EUTName = (String) JOptionPane.showInputDialog(null, "Select Entity Under Test:",
						ModelPackageType + "Entity Under Test", JOptionPane.QUESTION_MESSAGE, icon2, options2,
						options2[0]);
			}

			if (EUTName == null) {
				SmartTSout.println("Test Suite Main Handler | OUT");
				SmartTSout.line("ll");
				return;
			}

			boolean yescreateservice = MessageDialog.openConfirm(window.getShell(), "SmartTS",
					"Do you want to Create a new SmartTS Model for\n" + "EntityUnderTest : " + EUTName + "\n"
							+ "@ Model Package : " + ProjectName + "::" + ModelPackageType);
			if (!yescreateservice) {
				SmartTSout.println("Test Suite Main Handler | OUT");
				SmartTSout.line("ll");
				return;
			}
			SmartTSout.println("Test Suite Main Handler | Create SmartTS Test Model | IN");
			SmartTSout.println("Test Suite Main Handler | Create SmartTS Test Model | " + ProjectName);
			List<String> serviceNewFileNames = new ArrayList<>();
			List<String> serviceNewFileContentss = new ArrayList<>();

			serviceNewFileNames.add(TSDef.tsmodelFolderName + ProjectName + "_" + EUTName + "_TS.xml");

			EUT_TS TSModelTemplate = new EUT_TS();
			TSModelTemplate.Name = EUTName + "_TS";
			TSModelTemplate.EntityUnderTest.Name = EUTName;
			TSModelTemplate.EntityUnderTest.Context.Name = ProjectName + "::" + ModelPackageType + "::" + EUTName;
			for (int i = 0; i < 10; i++) {
				TestCase NewTestCase = new TestCase();
				NewTestCase.ID.StringID = TSModelTemplate.EntityUnderTest.Context.Name;
				NewTestCase.ID.NumID = i;
				ObjDocReferences NewObjDocReferences = new ObjDocReferences();
				NewObjDocReferences.DocumentName = "ENTER_DocumentName";
				NewObjDocReferences.Location = "ENTER_Location";
				NewObjDocReferences.Item = "ENTER_Item";
				NewTestCase.ObjDocReferences.add(NewObjDocReferences);
				NewTestCase.ObjDocReferences.add(NewObjDocReferences);

				TestVariable X = new TestVariable();
				X.Name = "ENTER_NAME";
				X.Wiki = "ENTER_WIKI";
				Threshold t = new Threshold();
				t.Value = "42";
				Rule r = new Rule();
				X.SelectionRules.put(t, r);
				t.Value = "84";
				X.SelectionRules.put(t, r);
				DataSetReference dsr = new DataSetReference();
				dsr.fromDataSet = "SimpleInt";
				dsr.startIndex = 80;
				dsr.endIndex = 120;
				X.DataSetReferences.add(dsr);
				DataSetReference dsr2 = new DataSetReference();
				dsr2.fromDataSet = "ImageSetAlpha";
				dsr2.uselist = true;
				dsr2.listIndex.add(12349);
				dsr2.listIndex.add(12399);
				X.DataSetReferences.add(dsr2);

				Precondition Pre = new Precondition();
				Pre.TestVariables.add(X);

				DataSetReference dsr3 = new DataSetReference();
				dsr3.fromDataSet = "SimpleBoolean";
				dsr3.startIndex = 0;
				dsr3.endIndex = 1;
				TestVariable Y = new TestVariable();
				Y = X;
				Y.DataSetReferences.add(dsr3);
				Postcondition Pos = new Postcondition();
				Pos.TestVariables.add(Y);

				DataSetReference dsr4 = new DataSetReference();
				dsr4.fromDataSet = "SimpleBoolean";
				dsr4.startIndex = 1;
				dsr3.endIndex = 1;
				TestVariable Z = new TestVariable();
				Z = X;
				Z.DataSetReferences.add(dsr4);
				Truecondition Tru = new Truecondition();
				Tru.TestVariables.add(Z);

				TestRun TR = new TestRun();
				TR.Preconditions.add(Pre);
				TR.Postconditions.add(Pos);
				TR.Trueconditions.add(Tru);

				NewTestCase.TestRuns.add(TR);

				TestResult TRes = new TestResult();
				TRes.Trueconditions.add(Tru);
				NewTestCase.TestResults.add(TRes);

				TSModelTemplate.EntityUnderTest.Context.TestCases.add(NewTestCase);
			}
			String ServiceRepoTSXML = EUT_TS2XMLString(TSModelTemplate);
			if (null == ServiceRepoTSXML) {
				SmartTSout.println(
						"Test Suite Main Handler | Create SmartTS Test Model | " + ProjectName + " JAXB Error !!");
				SmartTSout.println("Test Suite Main Handler | OUT");
				SmartTSout.line("ll");
				return;
			} else {
				serviceNewFileContentss.add(ServiceRepoTSXML);
			}

			try {
				IFolder modelTSfolder = project.getFolder(TSDef.tsmodelFolderName);
				if (!modelTSfolder.exists()) {
					modelTSfolder.create(true, true, null);
					SmartTSout.println("Test Suite Main Handler | Create SmartTS Test Model | " + ProjectName
							+ TSDef.Created + " FOLDER " + TSDef.tsmodelFolderName);
				}

				for (int i = 0; i < serviceNewFileNames.size(); i++) {
					String NewFileName = serviceNewFileNames.get(i);
					String NewFileContents = serviceNewFileContentss.get(i);
					String NewDisplay = ProjectName + TSDef.Created + NewFileName;
					IFile Newfile = project.getFile(NewFileName);
					if (Newfile.exists()) {
						Newfile.delete(true, null);
					}
					Newfile.create(new ByteArrayInputStream((NewFileContents).getBytes()), true, null);
					SmartTSout.println("Test Suite Main Handler | Create SmartTS Test Model | " + NewDisplay);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			SmartTSout.println(
					"Create New TSModel Handler | WORKSPACE ERROR !! project.getRawLocation() is found to be null.");
		}
		SmartTSout.println("Test Suite Main Handler | OUT");
		SmartTSout.line("ll");
		return;
	}

	public String EUT_TS2XMLString(EUT_TS EUTTS) {
		// NOT INCLUDED IN IO CLASS due to Cyclic Call Error
		java.io.StringWriter stringWriter = new StringWriter();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(EUT_TS.class.getPackageName(),
					EUT_TS.class.getClassLoader());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(EUTTS, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			SmartTSConsole SmartTSout = new SmartTSConsole();
			SmartTSout.println("ERROR @ EUT_TS2XMLString:" + EUTTS.Name);
			e.printStackTrace();
			return null;
		}
	}
}
