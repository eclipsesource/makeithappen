package com.eclipsesource.makeithappen.ui.emailcontrol;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecp.view.internal.core.swt.renderer.TextControlSWTRenderer;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
public class EmailControlRenderer extends TextControlSWTRenderer {

	@Override
	protected Control createSWTControl(Composite parent, final Setting setting) {
		final Composite main = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		GridDataFactory.fillDefaults().grab(true, false)
				.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
		Control control = super.createSWTControl(main, setting);
		Button button = new Button(main, SWT.PUSH);
		button.setText("Send Mail");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Desktop.getDesktop().mail(
							URI.create("mailto:"
									+ getModelValue(setting).getValue()));
				} catch (IOException e1) {
					// ignore failure to open mailto
				}
			}
		});
		return control;
	}

}
