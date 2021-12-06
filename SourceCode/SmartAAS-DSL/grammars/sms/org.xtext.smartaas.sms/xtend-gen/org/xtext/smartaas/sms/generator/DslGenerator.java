package org.xtext.smartaas.sms.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import jarLauncher.jarLaunch;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization;
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;
import org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.internal.ComponentDefinitionActivator;
import org.eclipse.smartmdsd.xtext.system.componentArchitecture.ui.internal.ComponentArchitectureActivator;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.smartdbe.common.console.SmartCommonConsole;
import org.smartdbe.common.smartmdsdwrapper.BehaviorInfo;
import org.smartdbe.common.smartmdsdwrapper.GetSmartMDSDDefinitions;
import org.smartdbe.common.smartmdsdwrapper.IO;
import org.smartdbe.common.smartmdsdwrapper.resourcemanager.cutString;
import org.xtext.smartaas.sms.dsl.SMSINType;
import org.xtext.smartaas.sms.generator.AASNode;
import org.xtext.smartaas.sms.generator.SmartAASSMSDefaultContents;

@SuppressWarnings("all")
public class DslGenerator extends AbstractGenerator {
  public static final String JarPath = "${SMART_ROOT_ACE}/SmartAASbox/smartmdsd2aas.jar";
  
  public static final String OptionSMS2XML = "SMS2XML";
  
  private SmartCommonConsole SmartCommonout = new SmartCommonConsole();
  
  private IO io = new IO();
  
  private cutString cs = new cutString();
  
  public boolean DebugFlag = false;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      this.SmartCommonout.println("Create New SmartAAS SMS Handler | IN");
      String AASSMS_FullPath = "ERROR_AASSMS_FullPath";
      Iterable<SMSINType> _filter = Iterables.<SMSINType>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), SMSINType.class);
      for (final SMSINType smsdef : _filter) {
        {
          ArrayList<String> payload = new ArrayList<String>();
          String ProjectName = "";
          final ComponentDefinition component = this.getComponentDefinition(smsdef);
          Boolean skipsystem = Boolean.valueOf(false);
          if ((component != null)) {
            skipsystem = Boolean.valueOf(true);
            String _name = component.getName();
            String _plus = ("Create New SmartAAS SMS Handler | Found Component:" + _name);
            this.SmartCommonout.println(_plus);
            ProjectName = component.getName();
            payload = this.getComponentPayload(component);
          }
          if ((!(skipsystem).booleanValue())) {
            final SystemComponentArchitecture system = this.getSystemComponentArchitecture(smsdef);
            if ((system != null)) {
              String _name_1 = system.getName();
              String _plus_1 = ("Create New SmartAAS SMS Handler | Found System:" + _name_1);
              this.SmartCommonout.println(_plus_1);
              ProjectName = system.getName();
              payload = this.getSystemPayload(system);
            }
          }
          if (this.DebugFlag) {
            this.SmartCommonout.println("Create New SmartAAS SMS Handler | PAYLOAD:");
            for (final String payloadentry : payload) {
              this.SmartCommonout.println(payloadentry);
            }
          }
          String SMSFilePath = "";
          String SMSFileText = "";
          boolean _isPlatform = resource.getURI().isPlatform();
          if (_isPlatform) {
            IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
            String _platformString = resource.getURI().toPlatformString(true);
            Path _path = new Path(_platformString);
            final IFile file = _root.getFile(_path);
            SMSFilePath = file.getRawLocation().toOSString();
            AASSMS_FullPath = SMSFilePath;
            SMSFileText = this.io.FilePath2String(SMSFilePath);
          } else {
            this.SmartCommonout.println("Create New SmartAAS SMS Handler | ERROR: Resource URI is not Platform.");
            this.SmartCommonout.println("Create New SmartAAS SMS Handler | OUT");
            return;
          }
          SmartAASSMSDefaultContents smsdc = new SmartAASSMSDefaultContents();
          String newSMSFileText = smsdc.getContents(ProjectName, payload);
          boolean _equals = this.getAASEntriesLOG(newSMSFileText).equals(this.getAASEntriesLOG(SMSFileText));
          boolean _not = (!_equals);
          if (_not) {
            IPath path = new Path(SMSFilePath);
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IFile smsfile = root.getFileForLocation(path);
            this.io.String2File(this.replaceAASEntries(SMSFileText, newSMSFileText), smsfile, "Replace");
          }
        }
      }
      Thread.sleep(1200);
      this.LaunchSmartmdsd2aasJar(AASSMS_FullPath);
      this.SmartCommonout.println("Create New SmartAAS SMS Handler | OUT");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void LaunchSmartmdsd2aasJar(final String AASSMS_FullPath) {
    jarLaunch.Launch(((((DslGenerator.JarPath + " ") + DslGenerator.OptionSMS2XML) + " ") + AASSMS_FullPath), true);
  }
  
  public String replaceAASEntries(final String FileText, final String NewFileText) {
    return FileText.replace(this.getAASEntriesLOG(FileText), this.getAASEntriesLOG(NewFileText));
  }
  
  public String getAASEntriesLOG(final String FileText) {
    return this.cs.cutFromNextTo(FileText, "[[AASEntriesLOG_START[[", "]]AASEntriesLOG_FINISH]]", Boolean.valueOf(false));
  }
  
  public ArrayList<String> getSystemPayload(final SystemComponentArchitecture system) {
    ArrayList<String> payload = new ArrayList<String>();
    String SystemName = system.getName();
    String _ID = this.ID(SystemName);
    AASNode AAS = new AASNode(AASNode.AASNODETYPE.AAS, SystemName, "", AASNode.AASIDTYPE.IRI, _ID, 
      Boolean.valueOf(true));
    String runningid = SystemName;
    String _ID_1 = this.ID((runningid + "/BOM"));
    AASNode BOM = new AASNode(AASNode.AASNODETYPE.SM, "BillOfMaterials", "", AASNode.AASIDTYPE.IRI, _ID_1);
    String _ID_2 = this.ID((runningid + "/BOM/Components"));
    AASNode BOMComponents = new AASNode(AASNode.AASNODETYPE.SMC, "Components", "", AASNode.AASIDTYPE.IRI, _ID_2);
    String runningidCapabilities = (runningid + "/Capabilities");
    String _ID_3 = this.ID(runningidCapabilities);
    AASNode Capabilities = new AASNode(AASNode.AASNODETYPE.SM, "Capabilities", "", AASNode.AASIDTYPE.IRI, _ID_3);
    EList<ComponentInstance> _components = system.getComponents();
    for (final ComponentInstance comp : _components) {
      {
        String componentName = comp.getName();
        String runningidBOMComponents = ((runningid + "/BOM/Components/") + componentName);
        String _ID_4 = this.ID(runningidBOMComponents);
        AASNode BOMComponent = new AASNode(AASNode.AASNODETYPE.ENT, componentName, "", AASNode.AASIDTYPE.IRI, _ID_4);
        CoordinationModuleRealization cmr = null;
        Boolean skillsavailable = Boolean.valueOf(false);
        int _size = IterableExtensions.size(Iterables.<CoordinationSlavePort>filter(comp.getComponent().getElements(), CoordinationSlavePort.class));
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          CoordinationSlavePort csp = ((CoordinationSlavePort[])Conversions.unwrapArray((Iterables.<CoordinationSlavePort>filter(comp.getComponent().getElements(), CoordinationSlavePort.class)), CoordinationSlavePort.class))[0];
          if ((csp != null)) {
            int _size_1 = IterableExtensions.size(Iterables.<SkillRealizationsRef>filter(csp.getElements(), SkillRealizationsRef.class));
            boolean _greaterThan_1 = (_size_1 > 0);
            if (_greaterThan_1) {
              SkillRealizationsRef srr = ((SkillRealizationsRef[])Conversions.unwrapArray((Iterables.<SkillRealizationsRef>filter(csp.getElements(), SkillRealizationsRef.class)), SkillRealizationsRef.class))[0];
              if ((srr != null)) {
                CoordinationModuleRealization cmrcheck = srr.getSkillRealizationCoordModuleRef();
                if ((cmrcheck != null)) {
                  skillsavailable = Boolean.valueOf(true);
                }
              }
            }
          }
        }
        if ((skillsavailable).booleanValue()) {
          String runningidBOMComponentCapabilities = (runningidBOMComponents + "/Capabilities");
          String _ID_5 = this.ID(runningidBOMComponentCapabilities);
          AASNode BOMComponentCapabilities = new AASNode(AASNode.AASNODETYPE.ENT, "Capabilities", "", 
            AASNode.AASIDTYPE.IRI, _ID_5);
          cmr = (((SkillRealizationsRef[])Conversions.unwrapArray((Iterables.<SkillRealizationsRef>filter((((CoordinationSlavePort[])Conversions.unwrapArray((Iterables.<CoordinationSlavePort>filter(comp.getComponent().getElements(), CoordinationSlavePort.class)), CoordinationSlavePort.class))[0]).getElements(), 
            SkillRealizationsRef.class)), SkillRealizationsRef.class))[0]).getSkillRealizationCoordModuleRef();
          EList<SkillRealization> _skills = cmr.getSkills();
          for (final SkillRealization compskill : _skills) {
            {
              String componentSkillName = compskill.getSkillDef().getName();
              String _ID_6 = this.ID(((runningidBOMComponentCapabilities + "/") + componentSkillName));
              AASNode componentSkill = new AASNode(AASNode.AASNODETYPE.CAP, componentSkillName, "", 
                AASNode.AASIDTYPE.IRI, _ID_6);
              BOMComponentCapabilities.children.add(componentSkill);
            }
          }
          BOMComponent.children.add(BOMComponentCapabilities);
        }
        BOMComponents.children.add(BOMComponent);
      }
    }
    BOM.children.add(BOMComponents);
    AAS.children.add(BOM);
    TaskRealizationModel trm = null;
    Boolean tasksavailable = Boolean.valueOf(false);
    int _size = IterableExtensions.size(Iterables.<TaskRealizationModelRef>filter(system.getExtensions(), TaskRealizationModelRef.class));
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int _size_1 = IterableExtensions.size(Iterables.<TaskRealizationModelRef>filter(system.getExtensions(), TaskRealizationModelRef.class));
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        TaskRealizationModelRef trr = ((TaskRealizationModelRef[])Conversions.unwrapArray((Iterables.<TaskRealizationModelRef>filter(system.getExtensions(), TaskRealizationModelRef.class)), TaskRealizationModelRef.class))[0];
        if ((trr != null)) {
          TaskRealizationModel tmrcheck = trr.getTaskModelRef();
          if ((tmrcheck != null)) {
            tasksavailable = Boolean.valueOf(true);
          }
        }
      }
    }
    if ((tasksavailable).booleanValue()) {
      trm = (((TaskRealizationModelRef[])Conversions.unwrapArray((Iterables.<TaskRealizationModelRef>filter(system.getExtensions(), TaskRealizationModelRef.class)), TaskRealizationModelRef.class))[0]).getTaskModelRef();
      String BehaviorName = trm.getName();
      String runningidBehavior = ((runningidCapabilities + "/") + BehaviorName);
      String _ID_4 = this.ID(runningidBehavior);
      AASNode Behavior = new AASNode(AASNode.AASNODETYPE.SMC, BehaviorName, "", AASNode.AASIDTYPE.IRI, _ID_4);
      EList<TaskRealization> _tasks = trm.getTasks();
      for (final TaskRealization systemtask : _tasks) {
        {
          String systemTaskName = systemtask.getTaskDef().getName();
          String runningidSystemTask = ((runningid + "/Capabilities/") + systemTaskName);
          String _ID_5 = this.ID(runningidSystemTask);
          AASNode Capability = new AASNode(AASNode.AASNODETYPE.CAP, systemTaskName, "", AASNode.AASIDTYPE.IRI, _ID_5);
          String _ID_6 = this.ID((runningidSystemTask + "/In"));
          AASNode inAtt = new AASNode(AASNode.AASNODETYPE.SMC, "In", "", AASNode.AASIDTYPE.IRI, _ID_6);
          String _ID_7 = this.ID((runningidSystemTask + "/Out"));
          AASNode outAtt = new AASNode(AASNode.AASNODETYPE.SMC, "Out", "", AASNode.AASIDTYPE.IRI, _ID_7);
          String _ID_8 = this.ID((runningidSystemTask + "/Result"));
          AASNode res = new AASNode(AASNode.AASNODETYPE.SMC, "Result", "", AASNode.AASIDTYPE.IRI, _ID_8);
          int counter = 0;
          EList<AttributeDefinition> _inAttribute = systemtask.getTaskDef().getInAttribute();
          for (final AttributeDefinition j : _inAttribute) {
            {
              int _plusPlus = counter++;
              String c = ("i" + Integer.valueOf(_plusPlus));
              String cid = ((runningidSystemTask + "/") + c);
              String _ID_9 = this.ID(cid);
              AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, _ID_9);
              String _name = j.getName();
              String _ID_10 = this.ID((cid + "/Name"));
              AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", _name, AASNode.AASIDTYPE.IRI, _ID_10);
              String _cppType = this.cppType(j.getType());
              String _plus = ("" + _cppType);
              String _ID_11 = this.ID((cid + "/Type"));
              AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", _plus, 
                AASNode.AASIDTYPE.IRI, _ID_11);
              entry.children.add(name);
              entry.children.add(type);
              inAtt.children.add(entry);
            }
          }
          counter = 0;
          EList<AttributeDefinition> _outAttribute = systemtask.getTaskDef().getOutAttribute();
          for (final AttributeDefinition j_1 : _outAttribute) {
            {
              int _plusPlus = counter++;
              String c = ("o" + Integer.valueOf(_plusPlus));
              String cid = ((runningidSystemTask + "/") + c);
              String _ID_9 = this.ID(cid);
              AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, _ID_9);
              String _name = j_1.getName();
              String _ID_10 = this.ID((cid + "/Name"));
              AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", _name, AASNode.AASIDTYPE.IRI, _ID_10);
              String _cppType = this.cppType(j_1.getType());
              String _plus = ("" + _cppType);
              String _ID_11 = this.ID((cid + "/Type"));
              AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", _plus, 
                AASNode.AASIDTYPE.IRI, _ID_11);
              entry.children.add(name);
              entry.children.add(type);
              outAtt.children.add(entry);
            }
          }
          counter = 0;
          EList<TaskResult> _results = systemtask.getTaskDef().getResults();
          for (final TaskResult j_2 : _results) {
            {
              int _plusPlus = counter++;
              String c = ("r" + Integer.valueOf(_plusPlus));
              String cid = ((runningidSystemTask + "/") + c);
              String _ID_9 = this.ID(cid);
              AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, _ID_9);
              TASK_RESULT_TYPES _result = j_2.getResult();
              String _plus = ("" + _result);
              String _ID_10 = this.ID((cid + "/Result"));
              AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Result", _plus, 
                AASNode.AASIDTYPE.IRI, _ID_10);
              String _resultValue = j_2.getResultValue();
              String _plus_1 = ("" + _resultValue);
              String _ID_11 = this.ID((cid + "/ResultValue"));
              AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "ResultValue", _plus_1, 
                AASNode.AASIDTYPE.IRI, _ID_11);
              entry.children.add(name);
              entry.children.add(type);
              res.children.add(entry);
            }
          }
          Capability.children.add(inAtt);
          Capability.children.add(outAtt);
          Capability.children.add(res);
          Behavior.children.add(Capability);
        }
      }
      Capabilities.children.add(Behavior);
    }
    AAS.children.add(Capabilities);
    payload = AAS.getPayload();
    return payload;
  }
  
  public ArrayList<String> getComponentPayload(final ComponentDefinition component) {
    ArrayList<String> payload = new ArrayList<String>();
    String ComponentName = component.getName();
    String runningid = ComponentName;
    String _ID = this.ID(ComponentName);
    AASNode AAS = new AASNode(AASNode.AASNODETYPE.AAS, ComponentName, "", AASNode.AASIDTYPE.IRI, _ID, Boolean.valueOf(true));
    String runningidCompDef = (runningid + "/Def");
    String _ID_1 = this.ID(runningidCompDef);
    AASNode ComponentDefinition = new AASNode(AASNode.AASNODETYPE.SM, "ComponentDefinition", "", 
      AASNode.AASIDTYPE.IRI, _ID_1);
    String runningidCompDefIport = (runningidCompDef + "/In");
    String _ID_2 = this.ID(runningidCompDefIport);
    AASNode InputPorts = new AASNode(AASNode.AASNODETYPE.SMC, "InputPorts", "", AASNode.AASIDTYPE.IRI, _ID_2);
    int counter = 0;
    Iterable<InputPort> _filter = Iterables.<InputPort>filter(component.getElements(), InputPort.class);
    for (final InputPort port : _filter) {
      {
        int _plusPlus = counter++;
        String c = ("i" + Integer.valueOf(_plusPlus));
        String cid = ((runningidCompDefIport + "/") + c);
        final String PortName = port.getName();
        String _ID_3 = this.ID(cid);
        AASNode Port = new AASNode(AASNode.AASNODETYPE.ENT, c, "", AASNode.AASIDTYPE.IRI, _ID_3);
        String _ID_4 = this.ID((cid + "/Name"));
        AASNode Name = new AASNode(AASNode.AASNODETYPE.PROP, PortName, "", AASNode.AASIDTYPE.IRI, _ID_4);
        Port.children.add(Name);
        final String ServiceName = port.getService().getName();
        String _ID_5 = this.ID((cid + "/Service"));
        AASNode Service = new AASNode(AASNode.AASNODETYPE.SM, ServiceName, "", AASNode.AASIDTYPE.IRI, _ID_5);
        EObject _eContainer = port.getService().eContainer();
        final ServiceDefRepository ServiceRepository = ((ServiceDefRepository) _eContainer);
        final String ServiceRepositoryName = ServiceRepository.getName();
        String _ID_6 = this.ID((cid + "/ServiceRepository"));
        AASNode ServiceRep = new AASNode(AASNode.AASNODETYPE.PROP, ServiceRepositoryName, "", 
          AASNode.AASIDTYPE.IRI, _ID_6);
        Service.children.add(ServiceRep);
        Port.children.add(Service);
        InputPorts.children.add(Port);
      }
    }
    ComponentDefinition.children.add(InputPorts);
    String runningidCompDefOport = (runningidCompDef + "/Out");
    String _ID_3 = this.ID(runningidCompDefOport);
    AASNode OutputPorts = new AASNode(AASNode.AASNODETYPE.SMC, "OutputPorts", "", AASNode.AASIDTYPE.IRI, _ID_3);
    counter = 0;
    Iterable<OutputPort> _filter_1 = Iterables.<OutputPort>filter(component.getElements(), OutputPort.class);
    for (final OutputPort port_1 : _filter_1) {
      {
        int _plusPlus = counter++;
        String c = ("o" + Integer.valueOf(_plusPlus));
        String cid = ((runningidCompDefOport + "/") + c);
        final String PortName = port_1.getName();
        String _ID_4 = this.ID(cid);
        AASNode Port = new AASNode(AASNode.AASNODETYPE.ENT, c, "", AASNode.AASIDTYPE.IRI, _ID_4);
        String _ID_5 = this.ID((cid + "/Name"));
        AASNode Name = new AASNode(AASNode.AASNODETYPE.PROP, PortName, "", AASNode.AASIDTYPE.IRI, _ID_5);
        Port.children.add(Name);
        final String ServiceName = port_1.getService().getName();
        String _ID_6 = this.ID((cid + "/Service"));
        AASNode Service = new AASNode(AASNode.AASNODETYPE.SM, ServiceName, "", AASNode.AASIDTYPE.IRI, _ID_6);
        EObject _eContainer = port_1.getService().eContainer();
        final ServiceDefRepository ServiceRepository = ((ServiceDefRepository) _eContainer);
        final String ServiceRepositoryName = ServiceRepository.getName();
        String _ID_7 = this.ID((cid + "/ServiceRepository"));
        AASNode ServiceRep = new AASNode(AASNode.AASNODETYPE.PROP, ServiceRepositoryName, "", 
          AASNode.AASIDTYPE.IRI, _ID_7);
        Service.children.add(ServiceRep);
        Port.children.add(Service);
        OutputPorts.children.add(Port);
      }
    }
    ComponentDefinition.children.add(OutputPorts);
    AAS.children.add(ComponentDefinition);
    String _ID_4 = this.ID((runningid + "/Capabilities"));
    AASNode Capabilities = new AASNode(AASNode.AASNODETYPE.SM, "Capabilities", "", AASNode.AASIDTYPE.IRI, _ID_4);
    CoordinationModuleRealization cmr = null;
    Boolean skillsavailable = Boolean.valueOf(false);
    int _size = IterableExtensions.size(Iterables.<CoordinationSlavePort>filter(component.getElements(), CoordinationSlavePort.class));
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      CoordinationSlavePort csp = ((CoordinationSlavePort[])Conversions.unwrapArray((Iterables.<CoordinationSlavePort>filter(component.getElements(), CoordinationSlavePort.class)), CoordinationSlavePort.class))[0];
      if ((csp != null)) {
        int _size_1 = IterableExtensions.size(Iterables.<SkillRealizationsRef>filter(csp.getElements(), SkillRealizationsRef.class));
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          SkillRealizationsRef srr = ((SkillRealizationsRef[])Conversions.unwrapArray((Iterables.<SkillRealizationsRef>filter(csp.getElements(), SkillRealizationsRef.class)), SkillRealizationsRef.class))[0];
          if ((srr != null)) {
            CoordinationModuleRealization cmrcheck = srr.getSkillRealizationCoordModuleRef();
            if ((cmrcheck != null)) {
              skillsavailable = Boolean.valueOf(true);
            }
          }
        }
      }
    }
    if ((skillsavailable).booleanValue()) {
      cmr = (((SkillRealizationsRef[])Conversions.unwrapArray((Iterables.<SkillRealizationsRef>filter((((CoordinationSlavePort[])Conversions.unwrapArray((Iterables.<CoordinationSlavePort>filter(component.getElements(), CoordinationSlavePort.class)), CoordinationSlavePort.class))[0]).getElements(), SkillRealizationsRef.class)), SkillRealizationsRef.class))[0]).getSkillRealizationCoordModuleRef();
      EList<SkillRealization> _skills = cmr.getSkills();
      for (final SkillRealization compskill : _skills) {
        {
          String componentSkillName = compskill.getSkillDef().getName();
          String runningidComponentSkill = ((runningid + "/Capabilities/") + componentSkillName);
          String _ID_5 = this.ID(runningidComponentSkill);
          AASNode Capability = new AASNode(AASNode.AASNODETYPE.CAP, componentSkillName, "", 
            AASNode.AASIDTYPE.IRI, _ID_5);
          String _ID_6 = this.ID((runningidComponentSkill + "/In"));
          AASNode inAtt = new AASNode(AASNode.AASNODETYPE.SMC, "In", "", AASNode.AASIDTYPE.IRI, _ID_6);
          String _ID_7 = this.ID((runningidComponentSkill + "/Out"));
          AASNode outAtt = new AASNode(AASNode.AASNODETYPE.SMC, "Out", "", AASNode.AASIDTYPE.IRI, _ID_7);
          String _ID_8 = this.ID((runningidComponentSkill + "/Result"));
          AASNode res = new AASNode(AASNode.AASNODETYPE.SMC, "Result", "", AASNode.AASIDTYPE.IRI, _ID_8);
          counter = 0;
          EList<AttributeDefinition> _inAttribute = compskill.getSkillDef().getInAttribute();
          for (final AttributeDefinition j : _inAttribute) {
            {
              int _plusPlus = counter++;
              String c = ("i" + Integer.valueOf(_plusPlus));
              String cid = ((runningidComponentSkill + "/") + c);
              String _ID_9 = this.ID(cid);
              AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, _ID_9);
              String _name = j.getName();
              String _ID_10 = this.ID((cid + "/Name"));
              AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", _name, AASNode.AASIDTYPE.IRI, _ID_10);
              String _cppType = this.cppType(j.getType());
              String _ID_11 = this.ID((cid + "/Type"));
              AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", _cppType, 
                AASNode.AASIDTYPE.IRI, _ID_11);
              entry.children.add(name);
              entry.children.add(type);
              inAtt.children.add(entry);
            }
          }
          counter = 0;
          EList<AttributeDefinition> _outAttribute = compskill.getSkillDef().getOutAttribute();
          for (final AttributeDefinition j_1 : _outAttribute) {
            {
              int _plusPlus = counter++;
              String c = ("o" + Integer.valueOf(_plusPlus));
              String cid = ((runningidComponentSkill + "/") + c);
              String _ID_9 = this.ID(cid);
              AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, _ID_9);
              String _name = j_1.getName();
              String _ID_10 = this.ID((cid + "/Name"));
              AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Name", _name, AASNode.AASIDTYPE.IRI, _ID_10);
              String _cppType = this.cppType(j_1.getType());
              String _plus = ("" + _cppType);
              String _ID_11 = this.ID((cid + "/Type"));
              AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "Type", _plus, 
                AASNode.AASIDTYPE.IRI, _ID_11);
              entry.children.add(name);
              entry.children.add(type);
              outAtt.children.add(entry);
            }
          }
          counter = 0;
          EList<SkillResult> _results = compskill.getSkillDef().getResults();
          for (final SkillResult j_2 : _results) {
            {
              int _plusPlus = counter++;
              String c = ("r" + Integer.valueOf(_plusPlus));
              String cid = ((runningidComponentSkill + "/") + c);
              String _ID_9 = this.ID(cid);
              AASNode entry = new AASNode(AASNode.AASNODETYPE.SM, c, "", AASNode.AASIDTYPE.IRI, _ID_9);
              SKILL_RESULT_TYPES _result = j_2.getResult();
              String _plus = ("" + _result);
              String _ID_10 = this.ID((cid + "/Result"));
              AASNode name = new AASNode(AASNode.AASNODETYPE.PROP, "Result", _plus, 
                AASNode.AASIDTYPE.IRI, _ID_10);
              String _resultValue = j_2.getResultValue();
              String _plus_1 = ("" + _resultValue);
              String _ID_11 = this.ID((cid + "/ResultValue"));
              AASNode type = new AASNode(AASNode.AASNODETYPE.PROP, "ResultValue", _plus_1, 
                AASNode.AASIDTYPE.IRI, _ID_11);
              entry.children.add(name);
              entry.children.add(type);
              res.children.add(entry);
            }
          }
          Capability.children.add(inAtt);
          Capability.children.add(outAtt);
          Capability.children.add(res);
          Capabilities.children.add(Capability);
        }
      }
    }
    AAS.children.add(Capabilities);
    payload = AAS.getPayload();
    return payload;
  }
  
  public ComponentDefinition getComponentDefinition(final SMSINType user) {
    final Injector injector = ComponentDefinitionActivator.getInstance().getInjector(
      ComponentDefinitionActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_COMPONENT_COMPONENTDEFINITION_COMPONENTDEFINITION);
    final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    final URI baseUri = user.eResource().getURI().trimFileExtension();
    final FileExtensionProvider fileExtProvider = injector.<FileExtensionProvider>getInstance(FileExtensionProvider.class);
    final URI xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.getPrimaryFileExtension());
    final boolean resourceExists = resourceSet.getURIConverter().exists(xtextResourceUri, null);
    if ((resourceExists == true)) {
      final Resource resource = resourceSet.getResource(xtextResourceUri, true);
      boolean _isLoaded = resource.isLoaded();
      boolean _equals = (_isLoaded == true);
      if (_equals) {
        final EObject root_obj = resource.getContents().get(0);
        if ((root_obj instanceof ComponentDefModel)) {
          this.SmartCommonout.println((("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri) + " [✔]"));
          return ((ComponentDefModel)root_obj).getComponent();
        }
      }
    } else {
      this.SmartCommonout.println((("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri) + " [x]"));
    }
    return null;
  }
  
  public SystemComponentArchitecture getSystemComponentArchitecture(final SMSINType user) {
    final Injector injector = ComponentArchitectureActivator.getInstance().getInjector(
      ComponentArchitectureActivator.ORG_ECLIPSE_SMARTMDSD_XTEXT_SYSTEM_COMPONENTARCHITECTURE_COMPONENTARCHITECTURE);
    final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    final URI baseUri = user.eResource().getURI().trimFileExtension();
    final FileExtensionProvider fileExtProvider = injector.<FileExtensionProvider>getInstance(FileExtensionProvider.class);
    final URI xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.getPrimaryFileExtension());
    final boolean resourceExists = resourceSet.getURIConverter().exists(xtextResourceUri, null);
    if ((resourceExists == true)) {
      final Resource resourceIN = resourceSet.getResource(xtextResourceUri, true);
      boolean _isLoaded = resourceIN.isLoaded();
      boolean _equals = (_isLoaded == true);
      if (_equals) {
        final EObject root_obj = resourceIN.getContents().get(0);
        if ((root_obj instanceof SystemComponentArchitecture)) {
          this.SmartCommonout.println((("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri) + " [✔]"));
          return ((SystemComponentArchitecture)root_obj);
        }
      }
    } else {
      this.SmartCommonout.println((("Create New SmartAAS SMS Handler | resource: " + xtextResourceUri) + " [x]"));
    }
    return null;
  }
  
  public ArrayList<TaskRealization> getTaskRealizationModel(final String BehaviorName) {
    final ArrayList<TaskRealization> TR = new ArrayList<TaskRealization>();
    GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
    BehaviorInfo BI = getSmartMDSDDef.extractBehaviorInfo(BehaviorName);
    String _string = BI.toString();
    String _plus = ("Create New SmartAAS SMS Handler | BI Extraction: \n" + _string);
    String _plus_1 = (_plus + "\n [✔]");
    this.SmartCommonout.println(_plus_1);
    return TR;
  }
  
  public ArrayList<TaskRealization> getTaskRealizationModel(final TaskRealizationModel BehaviorModel) {
    final ArrayList<TaskRealization> TR = new ArrayList<TaskRealization>();
    GetSmartMDSDDefinitions getSmartMDSDDef = new GetSmartMDSDDefinitions();
    BehaviorInfo BI = getSmartMDSDDef.extractBehaviorInfo(BehaviorModel);
    String _string = BI.toString();
    String _plus = ("Create New SmartAAS SMS Handler | BI Extraction: \n" + _string);
    String _plus_1 = (_plus + "\n [✔]");
    this.SmartCommonout.println(_plus_1);
    return TR;
  }
  
  public String getURI(final SMSINType user) {
    final URI baseUri = user.eResource().getURI().trimFileExtension();
    return baseUri.toString();
  }
  
  public String ID(final String in) {
    return ("Smartaasid/" + in);
  }
  
  public String ID(final String type, final String runningid, final String in) {
    boolean _equals = type.equals(AASNode.AASIDTYPE.IRI.toString());
    if (_equals) {
      return (("Smartaasid/" + runningid) + in);
    } else {
      return in;
    }
  }
  
  public String encap(final String in) {
    return (("ENTRY {\"" + in) + "\"};");
  }
  
  public String getProjectName(final Resource resource) {
    String URIFile = this.getModelFileName(resource);
    String URIProjectName = URIFile.substring(0, URIFile.indexOf("."));
    return URIProjectName;
  }
  
  public String getModelFileName(final Resource resource) {
    String[] _segments = resource.getURI().segments();
    int _size = ((List<String>)Conversions.doWrapArray(resource.getURI().segments())).size();
    int _minus = (_size - 1);
    final String URIFile = _segments[_minus];
    return URIFile.toString();
  }
  
  public Boolean wrongAASIDTYPE(final String disproot, final String can) {
    Boolean _isValid = AASNode.AASIDTYPE.isValid(can);
    boolean _not = (!(_isValid).booleanValue());
    if (_not) {
      this.SmartCommonout.println(
        ((((("Create New SmartAAS " + disproot) + " Handler | Compiler Error: ") + "SemanticIdType: XX[") + can) + 
          "]XX"));
      this.SmartCommonout.println((("Create New SmartAAS " + disproot) + " Handler | Compiler Exiting!"));
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public AASNode getGenericEntryNode(final String runningid, final AASNode.AASNODETYPE nodetype, final String EntityName, final String EntitySIDType, final String EntitySIDVal) {
    String EntitySemanticIdType = EntitySIDType;
    Boolean _wrongAASIDTYPE = this.wrongAASIDTYPE("Command", EntitySemanticIdType);
    if ((_wrongAASIDTYPE).booleanValue()) {
      return null;
    }
    String EntityTextSemanticId = this.ID(EntitySemanticIdType, runningid, EntitySIDVal);
    AASNode.AASIDTYPE _valueOf = AASNode.AASIDTYPE.valueOf(EntitySemanticIdType);
    return new AASNode(nodetype, EntityName, "", _valueOf, EntityTextSemanticId);
  }
  
  public String cppType(final AbstractAttributeType type) {
    String _xifexpression = null;
    if ((type instanceof PrimitiveType)) {
      String _switchResult = null;
      boolean _matched = false;
      PRIMITIVE_TYPE_NAME _typeName = ((PrimitiveType)type).getTypeName();
      boolean _equals = Objects.equal(_typeName, PRIMITIVE_TYPE_NAME.INT8);
      if (_equals) {
        _matched=true;
        _switchResult = "char";
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_1 = ((PrimitiveType)type).getTypeName();
        boolean _equals_1 = Objects.equal(_typeName_1, PRIMITIVE_TYPE_NAME.INT16);
        if (_equals_1) {
          _matched=true;
          _switchResult = "short";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_2 = ((PrimitiveType)type).getTypeName();
        boolean _equals_2 = Objects.equal(_typeName_2, PRIMITIVE_TYPE_NAME.INT32);
        if (_equals_2) {
          _matched=true;
          _switchResult = "int";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_3 = ((PrimitiveType)type).getTypeName();
        boolean _equals_3 = Objects.equal(_typeName_3, PRIMITIVE_TYPE_NAME.INT64);
        if (_equals_3) {
          _matched=true;
          _switchResult = "long int";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_4 = ((PrimitiveType)type).getTypeName();
        boolean _equals_4 = Objects.equal(_typeName_4, PRIMITIVE_TYPE_NAME.UINT8);
        if (_equals_4) {
          _matched=true;
          _switchResult = "unsigned char";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_5 = ((PrimitiveType)type).getTypeName();
        boolean _equals_5 = Objects.equal(_typeName_5, PRIMITIVE_TYPE_NAME.UINT16);
        if (_equals_5) {
          _matched=true;
          _switchResult = "unsigned short";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_6 = ((PrimitiveType)type).getTypeName();
        boolean _equals_6 = Objects.equal(_typeName_6, PRIMITIVE_TYPE_NAME.UINT32);
        if (_equals_6) {
          _matched=true;
          _switchResult = "unsigned int";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_7 = ((PrimitiveType)type).getTypeName();
        boolean _equals_7 = Objects.equal(_typeName_7, PRIMITIVE_TYPE_NAME.UINT64);
        if (_equals_7) {
          _matched=true;
          _switchResult = "unsigned long int";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_8 = ((PrimitiveType)type).getTypeName();
        boolean _equals_8 = Objects.equal(_typeName_8, PRIMITIVE_TYPE_NAME.FLOAT);
        if (_equals_8) {
          _matched=true;
          _switchResult = "float";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_9 = ((PrimitiveType)type).getTypeName();
        boolean _equals_9 = Objects.equal(_typeName_9, PRIMITIVE_TYPE_NAME.DOUBLE);
        if (_equals_9) {
          _matched=true;
          _switchResult = "double";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_10 = ((PrimitiveType)type).getTypeName();
        boolean _equals_10 = Objects.equal(_typeName_10, PRIMITIVE_TYPE_NAME.STRING);
        if (_equals_10) {
          _matched=true;
          _switchResult = "std::string";
        }
      }
      if (!_matched) {
        PRIMITIVE_TYPE_NAME _typeName_11 = ((PrimitiveType)type).getTypeName();
        boolean _equals_11 = Objects.equal(_typeName_11, PRIMITIVE_TYPE_NAME.BOOLEAN);
        if (_equals_11) {
          _matched=true;
          _switchResult = "bool";
        }
      }
      _xifexpression = _switchResult;
    } else {
      _xifexpression = "NotPrimitiveType";
    }
    return _xifexpression;
  }
}
