# SmartDBE
Eclipse features and plugins pertaining to Digital Business Ecosystem (SmartDBE)
extension to SmartMDSD Toolchain.

## Installation and Download
### [1] Installation of the SmartSoft World
* Option A: [Download a Ready-to-Go Virtual Appliance of the SmartSoft World](https://wiki.servicerobotik-ulm.de/virtual-machine)
* Option B: [Direct Installation of the SmartSoft World onto your Computer](https://wiki.servicerobotik-ulm.de/installer:start)

### [2] Clone or Download the SmartDBE repository on your system.
```sh
~/Downloads$ git clone https://github.com/Servicerobotics-Ulm/SmartDBE
~/Downloads$ cd SmartDBE
```
OR
```sh
~/Downloads$ wget https://github.com/Servicerobotics-Ulm/SmartDBE/archive/refs/heads/main.zip
~/Downloads$ unzip main.zip 
~/Downloads$ mv SmartDBE-main SmartDBE
~/Downloads$ cd SmartDBE
```
 
### [3a] SmartAAS
:information_source: In case you have chosen Option A in step [1] above, SmartAAS comes pre-installed.

* Copy Folder "SmartAASbox" to "$HOME/SOFTWARE/smartsoft"
```sh
~/Downloads/SmartDBE$ cp -r SmartAASbox $SMART_ROOT_ACE
```
* Extract SmartAAS Feature and Plugins
```sh
~/Downloads/SmartDBE$ cd SmartAAS
~/Downloads/SmartDBE/SmartAAS$ tar -xf SmartAAS-DSL-v2.tar.gz
```
* Install dependencies on Eclipse
  [:movie_camera: Watch: Install dependencies](https://github.com/Servicerobotics-Ulm/SmartDG-Tutorials/blob/main/02_01_Installing_SmartDG_DSLs_On_Eclipse/Installing_SmartDG_DSLs_On_Eclipse_D11Speedy.mp4)
  
* Install SmartAAS Feature and Plugins on Eclipse
  [:movie_camera: Watch: Install Eclipse plugins from local repository (representational)](https://github.com/Servicerobotics-Ulm/SmartDG-Tutorials/blob/main/02_01_Installing_SmartDG_DSLs_On_Eclipse/Installing_SmartDG_DSLs_On_Eclipse_C16Speedy.mp4)
  
### [3b] SmartTS

* Copy Folder "SmartTSbox" to "$HOME/SOFTWARE/smartsoft"
```sh
~/Downloads/SmartDBE$ cp -r SmartTSbox $SMART_ROOT_ACE
```
* Extract SmartTS Feature and Plugins
```sh
~/Downloads/SmartDBE$ cd SmartTS
~/Downloads/SmartDBE/SmartTS$ tar -xf SmartTS-DSL-v1.tar.gz
```
* Install dependencies on Eclipse
  [:movie_camera: Watch: Install dependencies](https://github.com/Servicerobotics-Ulm/SmartDG-Tutorials/blob/main/02_01_Installing_SmartDG_DSLs_On_Eclipse/Installing_SmartDG_DSLs_On_Eclipse_D11Speedy.mp4)
  
* Install SmartTS Feature and Plugins on Eclipse
  [:movie_camera: Watch: Install Eclipse plugins from local repository (representational)](https://github.com/Servicerobotics-Ulm/SmartDG-Tutorials/blob/main/02_01_Installing_SmartDG_DSLs_On_Eclipse/Installing_SmartDG_DSLs_On_Eclipse_C16Speedy.mp4)
  
### [3c] SmartDG
[See Tutorials](https://github.com/Servicerobotics-Ulm/SmartDG-Tutorials)
