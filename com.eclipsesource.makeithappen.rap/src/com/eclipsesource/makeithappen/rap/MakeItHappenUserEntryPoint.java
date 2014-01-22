package com.eclipsesource.makeithappen.rap;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.rap.rwt.service.UISession;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.eclipsesource.makeithappen.model.task.TaskFactory;
import com.eclipsesource.makeithappen.model.task.User;

public class MakeItHappenUserEntryPoint extends AbstractEntryPoint {

	@Override
	protected void createContents(Composite parent) {
		setupRealm(Display.getCurrent());
		
		ResourceSet resourceSet=createResourceSet();
		Resource resource = resourceSet.createResource(URI.createURI("VIRTUAL"));
		User user=TaskFactory.eINSTANCE.createUser();
		resource.getContents().add(user);
		try {
			ECPSWTViewRenderer.INSTANCE.render(parent,user );
		} catch (ECPRendererException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void setupRealm(Display display) {
        UISession uiSession = RWT.getUISession();
        if (uiSession.getAttribute("realm") == null) {
            Realm realm = SWTObservables.getRealm(display);
            RealmSetter.setRealm(realm);
            RWT.getUISession().setAttribute("realm", realm);
        }
    }

	
	private static ResourceSet createResourceSet() {
        ResourceSet resourceSet = new ResourceSetImpl();

        AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
                new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE),
                new BasicCommandStack(), resourceSet);
        resourceSet.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(domain));
        return resourceSet;
    }
	

}
