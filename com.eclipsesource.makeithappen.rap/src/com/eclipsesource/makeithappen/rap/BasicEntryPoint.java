package com.eclipsesource.makeithappen.rap;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.eclipsesource.makeithappen.model.task.TaskFactory;
import com.eclipsesource.makeithappen.model.task.User;
import com.eclipsesource.makeithappen.model.task.util.TaskAdapterFactory;

public class BasicEntryPoint extends AbstractEntryPoint {

	@Override
	protected void createContents(final Composite parent) {
		Realm realm = SWTObservables.getRealm(Display.getCurrent());
		Realm.runWithDefault(realm, new Runnable() {

			@Override
			public void run() {
				User user = createUser();

				try {
					ECPSWTViewRenderer.INSTANCE.render(parent, user);
				} catch (ECPRendererException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
	}

	private User createUser() {
		AdapterFactoryEditingDomain factoryEditingDomain = new AdapterFactoryEditingDomain(
				new TaskAdapterFactory(), new BasicCommandStack());
		Resource resource = factoryEditingDomain.createResource("test.xmi");
		User user = TaskFactory.eINSTANCE.createUser();
		resource.getContents().add(user);
		return user;
	}
}
