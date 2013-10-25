/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Edagr Mueller - initial API and implementation
 * Eugen Neufeld - Refactoring
 * Johannes Falterimeier - Refactoring
 ******************************************************************************/
package com.eclipsesource.makeithappen.view.tabs.swt;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.internal.ui.view.renderer.NoPropertyDescriptorFoundExeption;
import org.eclipse.emf.ecp.internal.ui.view.renderer.NoRendererFoundException;
import org.eclipse.emf.ecp.internal.ui.view.renderer.Node;
import org.eclipse.emf.ecp.internal.ui.view.renderer.RenderingResultRow;
import org.eclipse.emf.ecp.ui.view.swt.internal.AbstractSWTRenderer;
import org.eclipse.emf.ecp.ui.view.swt.internal.SWTRenderers;
import org.eclipse.emf.ecp.view.model.VAbstractCategorization;
import org.eclipse.emf.ecp.view.model.VCategorization;
import org.eclipse.emf.ecp.view.model.VCategory;
import org.eclipse.emf.ecp.view.model.VElement;
import org.eclipse.emf.ecp.view.model.VView;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

// TODO: Auto-generated Javadoc
/**
 * The Class SWTViewRenderer.
 */
@SuppressWarnings("restriction")
//no api
public class SWTViewRenderer extends AbstractSWTRenderer<VView> {

	/** The Constant INSTANCE. */
	public static final SWTViewRenderer INSTANCE = new SWTViewRenderer();

	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.ui.view.swt.internal.AbstractSWTRenderer#renderSWT(org.eclipse.emf.ecp.internal.ui.view.renderer.Node,
	 *      org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator, java.lang.Object[])
	 */
	@Override
	public List<RenderingResultRow<Control>> renderSWT(final Node<VView> viewNode,
		final AdapterFactoryItemDelegator adapterFactoryItemDelegator,

		Object... initData) throws NoRendererFoundException, NoPropertyDescriptorFoundExeption {
		final Composite parent = getParentFromInitData(initData);
		final VView view = viewNode.getRenderable();
		

		final EList<VAbstractCategorization> categorizations = view.getCategorizations();

		if (categorizations.size() == 0) {
			return renderChildren(parent, viewNode, adapterFactoryItemDelegator);
		}
		else if (categorizations.size() == 1 && categorizations.get(0) instanceof VCategory) {
			final List<RenderingResultRow<Control>> resultRows = SWTRenderers.INSTANCE.render(parent, viewNode
				.getChildren().get(0),
				adapterFactoryItemDelegator);
			viewNode.addRenderingResultDelegator(withSWT(resultRows.get(0).getMainControl()));
			return resultRows;
		} else {
			final Composite composite = createComposite(parent);
			createTabs(composite,viewNode,adapterFactoryItemDelegator);

			viewNode.addRenderingResultDelegator(withSWT(composite));

			return createResult(composite);
		}
	}

	private void createTabs(Composite composite, Node<VView> viewNode, AdapterFactoryItemDelegator adapterFactoryItemDelegator) {
		final TabFolder tabFolder = new TabFolder (composite, SWT.NONE);
		tabFolder.setBackground(composite.getBackground());
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(tabFolder);
		for (final Node<? extends VElement> child : viewNode.getChildren()) {
			if(VCategorization.class.isInstance(child.getRenderable()))
				continue;
			List<RenderingResultRow<Control>> resultRows;
			try {
				resultRows = SWTRenderers.INSTANCE.render(
					tabFolder, child, adapterFactoryItemDelegator);
				// TOOD; when does this case apply?
				if (resultRows == null) {
					continue;
				}
			} catch (final NoPropertyDescriptorFoundExeption e) {
				continue;
			} catch (NoRendererFoundException e) {
				continue;
			}

			TabItem item = new TabItem (tabFolder, SWT.NONE);
			if(child.getRenderable().getName()!=null)
				item.setText (child.getRenderable().getName());
			
			item.setControl (resultRows.get(0).getMainControl());
			
			setLayoutDataForResultRows(resultRows);
		}
		
	}

	/**
	 * Render children.
	 * 
	 * @param parent the parent
	 * @param node the node
	 * @param adapterFactoryItemDelegator the adapter factory item delegator
	 * @return the composite
	 * @throws NoRendererFoundException the no renderer found exception
	 */
	private List<RenderingResultRow<Control>> renderChildren(Composite parent, Node<VView> node,
		AdapterFactoryItemDelegator adapterFactoryItemDelegator)
		throws NoRendererFoundException {
		final Composite columnComposite = new Composite(parent, SWT.NONE);
		columnComposite.setBackground(parent.getBackground());

		columnComposite.setLayout(getLayoutHelper().getColumnLayout(2, false));

		node.addRenderingResultDelegator(withSWT(columnComposite));

		for (final Node<? extends VElement> child : node.getChildren()) {

			List<RenderingResultRow<Control>> resultRows;
			try {
				resultRows = SWTRenderers.INSTANCE.render(
					columnComposite, child, adapterFactoryItemDelegator);
			} catch (final NoPropertyDescriptorFoundExeption e) {
				continue;
			}

			// TOOD; when does this case apply?
			if (resultRows == null) {
				continue;
			}

			setLayoutDataForResultRows(resultRows);
		}

		return createResult(columnComposite);
	}

	/**
	 * Created editor pane.
	 * 
	 * @param composite the composite
	 * @return the created editor composite
	 */
	protected ScrolledComposite createdEditorPane(Composite composite) {
		final ScrolledComposite editorComposite = createScrolledComposite(composite);
		editorComposite.setExpandHorizontal(true);
		editorComposite.setExpandVertical(true);
		editorComposite.setShowFocusedControl(true);

		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(editorComposite);

		return editorComposite;
	}

	/**
	 * Creates the scrolled composite.
	 * 
	 * @param parent the parent
	 * @return the scrolled composite
	 */
	private ScrolledComposite createScrolledComposite(Composite parent) {
		final ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL
			| SWT.BORDER);
		scrolledComposite.setShowFocusedControl(true);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setBackground(parent.getBackground());

		final Composite childComposite = new Composite(scrolledComposite, SWT.NONE);
		childComposite.setBackground(parent.getBackground());

		return scrolledComposite;
	}

	

	

	/**
	 * Creates the composite.
	 * 
	 * @param parent the parent
	 * @return the composite
	 */
	private Composite createComposite(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());

		GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(composite);
		return composite;
	}

	

	

}
