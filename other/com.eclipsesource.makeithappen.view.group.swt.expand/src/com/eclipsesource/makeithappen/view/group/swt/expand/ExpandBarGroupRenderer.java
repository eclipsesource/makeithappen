package com.eclipsesource.makeithappen.view.group.swt.expand;

import java.util.Collection;

import org.eclipse.emf.ecp.view.spi.core.swt.ContainerSWTRenderer;
import org.eclipse.emf.ecp.view.spi.group.model.VGroup;
import org.eclipse.emf.ecp.view.spi.model.VContainedElement;
import org.eclipse.nebula.widgets.pgroup.PGroup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ExpandBarGroupRenderer extends ContainerSWTRenderer<VGroup> {

	@Override
	protected Collection<VContainedElement> getChildren() {
		return getVElement().getChildren();
	}

	@Override
	protected String getCustomVariant() {
		return "ExpandGroup";
	}

	@Override
	protected Composite getComposite(Composite parent) {
		PGroup group = new PGroup(parent, SWT.SMOOTH);
		if (getVElement().getName() != null) {
			group.setText(getVElement().getName());
		}
		return group;
	}

	
	
}
