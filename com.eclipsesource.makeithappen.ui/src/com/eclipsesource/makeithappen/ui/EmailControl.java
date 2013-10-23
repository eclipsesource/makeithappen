package com.eclipsesource.makeithappen.ui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.ecp.edit.internal.swt.controls.StringControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class EmailControl extends StringControl {

	@Override
	protected void fillControlComposite(Composite composite) {
		super.fillControlComposite(composite);
		((GridLayout) composite.getLayout()).numColumns = 2;
		Button button = new Button(composite, SWT.PUSH);
		button.setText("Send Mail");
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Desktop.getDesktop().mail(
							URI.create("mailto:" + getModelValue().getValue()));
				} catch (IOException e1) {
					//TODO: Handle Exception
				}
			}

		});
	}

}
