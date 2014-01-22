package com.eclipsesource.makeithappen.ui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.ecp.edit.internal.swt.controls.StringControl;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class EmailControl extends StringControl {

	@Override
	protected void fillControlComposite(Composite composite) {
		final Composite main = new Composite(composite, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(main);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(main);
		super.fillControlComposite(main);
		Button button = new Button(main, SWT.PUSH);
		button.setText("Send Mail");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					Desktop.getDesktop().mail(
						URI.create("mailto:" + getModelValue().getValue()));
				} catch (IOException e1) {
					//ignore failure to open mailto
				}
			}
		});
	}

}
