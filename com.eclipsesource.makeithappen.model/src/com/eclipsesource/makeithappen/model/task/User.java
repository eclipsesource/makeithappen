/**
 */
package com.eclipsesource.makeithappen.model.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getEMails <em>EMails</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link com.eclipsesource.makeithappen.model.task.Task}.
	 * It is bidirectional and its opposite is '{@link com.eclipsesource.makeithappen.model.task.Task#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Tasks()
	 * @see com.eclipsesource.makeithappen.model.task.Task#getAssignee
	 * @model opposite="assignee"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>EMails</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMails</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMails</em>' attribute list.
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_EMails()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getEMails();

} // User
