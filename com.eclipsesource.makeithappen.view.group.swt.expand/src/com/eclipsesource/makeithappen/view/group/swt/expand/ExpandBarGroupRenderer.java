package com.eclipsesource.makeithappen.view.group.swt.expand;

import java.util.List;

import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.group.model.VGroup;
import org.eclipse.emf.ecp.view.spi.model.VContainedElement;
import org.eclipse.emf.ecp.view.spi.renderer.NoPropertyDescriptorFoundExeption;
import org.eclipse.emf.ecp.view.spi.renderer.NoRendererFoundException;
import org.eclipse.emf.ecp.view.spi.renderer.RenderingResultRow;
import org.eclipse.emf.ecp.view.spi.swt.AbstractSWTRenderer;
import org.eclipse.emf.ecp.view.spi.swt.SWTRendererFactory;
import org.eclipse.nebula.widgets.pgroup.PGroup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

// TODO no api
public class ExpandBarGroupRenderer extends AbstractSWTRenderer<VGroup> {

	public static final ExpandBarGroupRenderer INSTANCE = new ExpandBarGroupRenderer();

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.ui.view.swt.internal.AbstractSWTRenderer#renderModel(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.emf.ecp.view.model.VElement, org.eclipse.emf.ecp.view.context.ViewModelContext)
	 */
	@Override
	protected List<RenderingResultRow<Control>> renderModel(Composite parent, VGroup vGroup,
		ViewModelContext viewContext)
		throws NoRendererFoundException, NoPropertyDescriptorFoundExeption {

		PGroup group = new PGroup(parent, SWT.SMOOTH);

		// Optionally, change strategy and toggle
		// group.setStrategy(new FormGroupStrategy());
		// group.setToggleRenderer(new TwisteToggleRenderer());
		if (vGroup.getName() != null) {
			group.setText(vGroup.getName());
		}
		group.setLayout(getLayoutHelper().getColumnLayout(2, false));

		for (final VContainedElement child : vGroup.getChildren()) {

			List<RenderingResultRow<Control>> resultRows;
			try {
				resultRows = SWTRendererFactory.INSTANCE.render(group, child, viewContext);
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
