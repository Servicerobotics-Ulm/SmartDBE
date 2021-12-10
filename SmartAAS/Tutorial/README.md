# SmartAAS-DSL

Asset Administration Shell (AAS) extensions for SmartMDSD Toolchain

## Asset Administration Shell
[What is the Asset Administration Shell](https://wiki.eclipse.org/BaSyx_/_Documentation_/_AssetAdministrationShell)

Asset Administration Shells (AAS) are one main concept of Industrie 4.0 for providing information hiding and higher levels of abstraction for assets.

[What is the Industry 4.0 Platform](https://www.plattform-i40.de/IP/Navigation/DE/Home/home.html)

The exchange of information between partners in the value chain of Industrie 4.0.

## Adding an AAS model to a SmartMDSD Component
![DiagramC](./Images/DiagramC.png)
In this tutorial, we will add an AAS model to an existing SmartMDSD component project. Here we have a component named "ComponentWebotsMobileRobot".
![C1](./Images/C1.png)

Right-click on the project, select the "Create new AAS Model" in the "New" menu.
![C2](./Images/C2.png)

Confirm the creation of SmartAAS model files with default contents. Existing SmartAAS model files, if any won't be changed. Delete existing SmartAAS model files in case you want them to be regenerated with the default contents.
![C3](./Images/C3.png)

SmartAAS model files are created with default contents.
![C4](./Images/C4.png)

SmartAAS command model for the component has the extension "aas_command".
![C5](./Images/C5.png)

SmartAAS sub-model structure model for the component has the extension "aas_sms".
![C6](./Images/C6.png)

AASX model (XML) for the component ends with "AAS.xml".
![C7](./Images/C7.png)

AASX model (XML) can be viewed in AASX explorer (Windows OS) as shown below.
![C8](./Images/C8.png)

You may Launch a SmartAAS Server for the given component taking the AASX model (XML) as input. This button (shown below) will launch the server (Detached from the Eclipse process) with the default configuration. Only one detached server can be launched at a time using this button. For more control over server configuration and to launch multiple servers, use Terminal (Explained later in "Populate an AAS Server from an existing AASXML model" tutorial).
![C9](./Images/C9.png)

Note: Detached SmartAAS Servers can be stopped by running the "StopAllRunningServers.sh" script.
```sh
~/SOFTWARE/smartsoft/SmartAASbox$ bash StopAllRunningServers.sh
```

## Adding an AAS model to a SmartMDSD System
![DiagramS](./Images/DiagramS.png)
In this tutorial, we will add an AAS model to an existing SmartMDSD system project. Here we have a system named "SystemWebotsLarryNavigation".
![S1](./Images/S1.png)

Right-click on the project, select the "Create new AAS Model" in the "New" menu.
![S2](./Images/S2.png)

Confirm the creation of SmartAAS model files with default contents. Existing SmartAAS model files, if any won't be changed. Delete existing SmartAAS model files in case you want them to be regenerated with the default contents.
![S3](./Images/S3.png)

SmartAAS model files are created with default contents.
![S4](./Images/S4.png)

SmartAAS command model for the component has the extension "aas_command".
![S5](./Images/S5.png)

SmartAAS sub-model structure model for the component has the extension "aas_sms".
![S6](./Images/S6.png)

AASX model (XML) for the component ends with "AAS.xml".
![S7](./Images/S7.png)

AASX model (XML) can be viewed in AASX explorer (Windows OS) as shown below.
![S8a](./Images/S8a.png)

![S8b](./Images/S8b.png)

You may Launch a SmartAAS Server for the given component taking the AASX model (XML) as input. This button (shown below) will launch the server (Detached from the Eclipse process) with the default configuration. Only one detached server can be launched at a time using this button. For more control over server configuration and to launch multiple servers, use Terminal (Explained later in "Populate an AAS Server from an existing AASXML model" tutorial).
![S9](./Images/S9.png)

Note: Detached SmartAAS Servers can be stopped by running the "StopAllRunningServers.sh" script.
```sh
~/SOFTWARE/smartsoft/SmartAASbox$ bash StopAllRunningServers.sh
```

## Populate an AAS Server from an existing AAS XML model
![DiagramX](./Images/DiagramX.png)
Find an executable jar named "smartmdsd2aas.jar" at "$HOME/SOFTWARE/smartsoft/SmartAASbox". In addition to Populating a AAS Server from an existing AASXML model (XML), this executable jar can also be used to Display sub-models of an given AASX model (XML), generate an AASX model (XML) with default contents, convert a component or system sub-model structure model (aas_sms) to equivalent AASX model (XML). Valid use cases for "smartmdsd2aas.jar" can be seen below.
![R0](./Images/R0.png)
To populate an AAS Server from an existing AASXML model, use the executable "smartmdsd2aas.jar" with the "RUN" option. You may set the Port Number for the AAS Server by setting the input variable "AASportnum". The AAS Server talks to a running "SmartMDSD system" via a Bridge component ["ComponentAASBridge"](https://github.com/Servicerobotics-Ulm/ComponentRepository/tree/master/ComponentAASBridge). The Bridge component and the AAS Server communicate with each other through web-sockets in the current implementation. You may set the socket number for this communication by setting the input variable "bridgesocket". Refresh rate and verbose for this communication channel can be set using the input variables "bridgetimer" and "bridgeverbos" respectively. Once launched, the "bridgesimulator.jar" executable will wait for a Bridge component connection before populating the AAS Server.
![R1](./Images/R1.png)
In case an actual Bridge component instance ["ComponentAASBridge"](https://github.com/Servicerobotics-Ulm/ComponentRepository/tree/master/ComponentAASBridge) is not running, The executable jar "bridgesimulator.jar" can be used to simulate a dummy Bridge component. The "smartmdsd2aas.jar" should already be waiting for a Bridge component connection before "bridgesimulator.jar" is launched.
![R2](./Images/R2.png)
Once the "bridgesimulator.jar" connects with an actual or simulated Bridge component, The SmartAAS Server is populated as configured.
![R3](./Images/R3.png)
URLs for "AAS Registry", "SmartAAS Server" and "SmartAAS Operations sub-model" can be read from the Terminal when the SmartAAS Server starts. 
![R4](./Images/R4.png)
URLs for "AAS Registry", "SmartAAS Server" and "SmartAAS Operations sub-model" can be used in a web browser to view the node-tree of a running AAS Server.
![R5](./Images/R5.png)
![R6](./Images/R6.png)


## Operation Invocation
![DiagramI](./Images/DiagramI.png)
A running SmartAAS Server populates "SmartAAS Operations sub-model", a collection of operations used to interact with a running "SmartMDSD system". This is true for any "SmartMDSD system" that includes the component ["ComponentAASBridge"](https://github.com/Servicerobotics-Ulm/ComponentRepository/tree/master/ComponentAASBridge) in its composition. Below, we can see a "SmartAAS Operations sub-model" attached to a "SmartAAS Server", which is connected to a running "SmartMDSD Server" via a Bridge component.
![R6](./Images/R6.png)
Operation in a "SmartAAS Operations sub-model" can be invoked using REST commands. A file with demo command calls to these operations can be found at "$HOME/SOFTWARE/smartsoft/SmartAASbox/SmartAASDemo.postman_collection.json". This file can be imported in ["Postman"](https://www.postman.com/) for running the demo command calls to the operations. The example below invokes the operation "PushCapability" attached to a running "SmartAAS Server".
![R7](./Images/R7.png)
The response of the operation "PushCapability" is received as shown below.
![R8](./Images/R8.png)
The "SmartAAS Server" receives and forwards the appropriate command to the running "SmartMDSD system".
![R9](./Images/R9.png)
Other operations can be invoked to start/stop the verbose, to clear server buffers and stop the server execution. Invoking "VERBOS_ON" operations below as an example.
![R10](./Images/R10.png)
Response for "VERBOS_ON" operations.
![R11](./Images/R11.png)
Effect of "VERBOS_ON" operations on "SmartAAS Server".
![R12](./Images/R12.png)
Invocation and response for "VERBOS_OFF" operations.
![R13](./Images/R13.png)
Effect of "VERBOS_OFF" operations on "SmartAAS Server".
![R14](./Images/R14.png)

