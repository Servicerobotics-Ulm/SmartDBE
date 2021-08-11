#!/bin/bash

# this is the name of the Toolchain folder where the toolchain is downloaded and installed into
TOOLCHAIN_NAME=SmartMDSD316

# this is the used Eclipse base version
ECLIPSE_BASE_VERSION=2020-09

#SMARTMDSD_REPO_URL="https://download.eclipse.org/smartmdsd/updates/nightly/v3.x/${ECLIPSE_BASE_VERSION}"
SMARTMDSD_REPO_URL="https://download.eclipse.org/smartmdsd/updates/releases/v3.16/${ECLIPSE_BASE_VERSION}"

SMARTMDSD_FEATURE_NAME="org.eclipse.smartmdsd.toolchain.source.feature.group"

echo "download Eclipse Modeling Tools ${ECLIPSE_BASE_VERSION}"
wget http://ftp-stud.fht-esslingen.de/pub/Mirrors/eclipse/technology/epp/downloads/release/${ECLIPSE_BASE_VERSION}/R/eclipse-modeling-${ECLIPSE_BASE_VERSION}-R-linux-gtk-x86_64.tar.gz

echo "extract eclipse modeling tools archive"
tar -xzf eclipse-modeling-${ECLIPSE_BASE_VERSION}-R-linux-gtk-x86_64.tar.gz
rm eclipse-modeling-${ECLIPSE_BASE_VERSION}-R-linux-gtk-x86_64.tar.gz
mv eclipse $TOOLCHAIN_NAME

echo "install SmartMDSD Plugins"
cd $TOOLCHAIN_NAME
./eclipse -noSplash -application org.eclipse.equinox.p2.director -repository https://download.eclipse.org/releases/${ECLIPSE_BASE_VERSION} -repository ${SMARTMDSD_REPO_URL} -installIU ${SMARTMDSD_FEATURE_NAME}

echo "ALL FINISHED! SmartMDSD Toolchain is installed into the folder: $TOOLCHAIN_NAME"
