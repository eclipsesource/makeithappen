package com.eclipsesource.makeithappen.view.group.swt.expand;

import java.util.List;

import org.eclipse.emf.ecp.internal.ui.view.renderer.NoPropertyDescriptorFoundExeption;
import org.eclipse.emf.ecp.internal.ui.view.renderer.NoRendererFoundException;
import org.eclipse.emf.ecp.internal.ui.view.renderer.Node;
import org.eclipse.emf.ecp.internal.ui.view.renderer.RenderingResultRow;
import org.eclipse.emf.ecp.ui.view.swt.internal.AbstractSWTRenderer;
import org.eclipse.emf.ecp.ui.view.swt.internal.SWTRenderers;
import org.eclipse.emf.ecp.view.group.model.VGroup;
import org.eclipse.emf.ecp.view.model.VElement;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.nebula.widgets.pgroup.PGroup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
// TODO no api
public class ExpandBarGroupRenderer extends AbstractSWTRenderer<VGroup> {

	public static final ExpandBarGroupRenderer INSTANCE = new ExpandBarGroupRenderer();

	@Override
	protected List<RenderingResultRow<Control>> renderSWT(Node<VGroup> node,
		AdapterFactoryItemDelegator adapterFactoryItemDelegator, Object... initData) throws NoRendererFoundException,
		NoPropertyDescriptorFoundExeption {

		final Composite parent = getParentFromInitData(initData);
		final VGroup modelGroup = node.getRenderable();

		PGroup group = new PGroup(parent, SWT.SMOOTH);

		// Optionally, change strategy and toggle
		// group.setStrategy(new FormGroupStrategy());
		// group.setToggleRenderer(new TwisteToggleRenderer());
		if (modelGroup.getName() != null) {
			group.setText(modelGroup.getName());
		}
		group.setLayout(getLayoutHelper().getColumnLayout(2, false));

		node.addRenderingResultDelegator(withSWT(group));

		for (final Node<? extends VElement> child : node.getChildren()) {

			List<RenderingResultRow<Control>> resultRows;
			try {
				resultRows = SWTRenderers.INSTANCE.render(group, child, adapterFactoryItemDelegator);
			} catch (final NoPropertyDescriptorFoundExeption e) {
				continue;
			}
			// TODO when does this case apply?
			if (resultRows == null) {
				continue;
			}

			setLayoutDataForResultRows(resultRows);
		}

		return createResult(group);
	}

}
