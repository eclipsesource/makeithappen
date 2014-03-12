/**
 */
package com.eclipsesource.makeithappen.model.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.UserGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.UserGroup#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUserGroup()
 * @model
 * @generated
 */
public interface UserGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUserGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.UserGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link com.eclipsesource.makeithappen.model.task.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUserGroup_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // UserGroup
