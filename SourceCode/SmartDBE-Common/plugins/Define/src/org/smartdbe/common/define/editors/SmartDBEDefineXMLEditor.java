package org.smartdbe.common.define.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class SmartDBEDefineXMLEditor extends TextEditor {

	private ColorManager colorManager;

	public SmartDBEDefineXMLEditor() {
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
