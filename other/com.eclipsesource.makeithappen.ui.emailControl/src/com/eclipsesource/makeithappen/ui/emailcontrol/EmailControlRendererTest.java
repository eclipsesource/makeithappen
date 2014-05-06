package com.eclipsesource.makeithappen.ui.emailcontrol;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emf.ecp.view.spi.swt.ECPRendererTester;

import com.eclipsesource.makeithappen.model.task.TaskPackage;

public class EmailControlRendererTest implements ECPRendererTester {
	
	public int isApplicableForFeature(EStructuralFeature feature, VElement vElement, ViewModelContext context) {
		if (feature.equals(TaskPackage.eINSTANCE.getUser_Email())) {
			return 10;
		}
		return NOT_APPLICABLE;
	}
	
	@Override
	public int isApplicable(VElement vElement, ViewModelContext context) {
		if (!VControl.class.isInstance(vElement)) {
			return NOT_APPLICABLE;
		}
		EStructuralFeature feature = VControl.class.cast(vElement).getDomainModelReference().getEStructuralFeatureIterator().next();
		return isApplicableForFeature(feature, vElement, context);
	}

}
