package com.eclipsesource.makeithappen.javafx.app;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryListCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;

import com.eclipsesource.makeithappen.model.task.TaskFactory;
import com.eclipsesource.makeithappen.model.task.User;
import com.eclipsesource.makeithappen.model.task.UserGroup;

public class LeftPart {
	private AdapterFactory adapterFactory;
	private UserGroup userGroup;

	@Inject
	public LeftPart() {
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		userGroup=TaskFactory.eINSTANCE.createUserGroup();
	}

	@Inject
	private ESelectionService selectionService;
	

	@PostConstruct
	public void postConstruct(BorderPane parent) {
		// TODO Your code here
		Button addElementButton=new Button("Add Element");
		addElementButton.setMaxWidth(Double.MAX_VALUE);
		parent.setTop(addElementButton);
		addElementButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				User user=TaskFactory.eINSTANCE.createUser();
				user.getEMails().add("bla");
				userGroup.getUsers().add(user);
			}
		});

		parent.setMargin(addElementButton, new Insets(5));
		
		ListView<Object> list = new ListView<Object>();
		parent.setMargin(list, new Insets(5,5,5,5));
		

		list.setItems(new AdapterFactoryObservableList<Object>(adapterFactory,
				userGroup));

		AdapterFactoryListCellFactory listCellFactory;
		listCellFactory = new AdapterFactoryListCellFactory(adapterFactory);
		list.setCellFactory(listCellFactory);

		list.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<Object>() {
					public void changed(ObservableValue<? extends Object> ov,
							Object old_val, Object new_val) {
						selectionService.setSelection(new_val);
					}
				});
		parent.setCenter(list);
	}

	@Focus
	public void onFocus() {
		// TODO Your code here
	}

}