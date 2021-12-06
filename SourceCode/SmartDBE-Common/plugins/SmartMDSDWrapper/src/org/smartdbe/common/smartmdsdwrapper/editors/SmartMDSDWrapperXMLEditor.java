package org.smartdbe.common.smartmdsdwrapper.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class SmartMDSDWrapperXMLEditor extends TextEditor {

	private ColorManager colorManager;

	public SmartMDSDWrapperXMLEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
