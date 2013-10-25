/**
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 */
package com.eclipsesource.makeithappen.view.tabs.swt;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ui.view.swt.internal.CustomSWTRenderer;
import org.eclipse.emf.ecp.ui.view.swt.internal.SWTRenderer;
import org.eclipse.emf.ecp.view.model.VElement;
import org.eclipse.emf.ecp.view.model.VView;

/**
 * The Class SWTRendererGroup.
 */
public class SWTRendererGroup implements CustomSWTRenderer {

	/**
	 * Instantiates a new SWT renderer group.
	 */
	public SWTRendererGroup() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.ui.view.swt.internal.CustomSWTRenderer#getCustomRenderers()
	 */
	public Map<Class<? extends VElement>, SWTRenderer<?>> getCustomRenderers() {
		final Map<Class<? extends VElement>, SWTRenderer<?>> map = new HashMap<Class<? extends VElement>, SWTRenderer<?>>();
		map.put(VView.class, SWTViewRenderer.INSTANCE);
		return map;
	}

}
