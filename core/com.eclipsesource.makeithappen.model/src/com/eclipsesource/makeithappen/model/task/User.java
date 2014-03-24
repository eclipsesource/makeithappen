/**
 */
package com.eclipsesource.makeithappen.model.task;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getGender <em>Gender</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#isActive <em>Active</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getTimeOfRegistration <em>Time Of Registration</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getHeigth <em>Heigth</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getNationality <em>Nationality</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getEmail <em>Email</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.User#getTasks <em>Tasks</em>}</li>
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eclipsesource.makeithappen.model.task.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see com.eclipsesource.makeithappen.model.task.Gender
	 * @see #setGender(Gender)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see com.eclipsesource.makeithappen.model.task.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Of Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Registration</em>' attribute.
	 * @see #setTimeOfRegistration(Date)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_TimeOfRegistration()
	 * @model
	 * @generated
	 */
	Date getTimeOfRegistration();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getTimeOfRegistration <em>Time Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Registration</em>' attribute.
	 * @see #getTimeOfRegistration()
	 * @generated
	 */
	void setTimeOfRegistration(Date value);

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(XMLGregorianCalendar)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_DateOfBirth()
	 * @model dataType="com.eclipsesource.makeithappen.model.task.DateOfBirth"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfBirth();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heigth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heigth</em>' attribute.
	 * @see #setHeigth(int)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Heigth()
	 * @model
	 * @generated
	 */
	int getHeigth();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getHeigth <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heigth</em>' attribute.
	 * @see #getHeigth()
	 * @generated
	 */
	void setHeigth(int value);

	/**
	 * Returns the value of the '<em><b>Nationality</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eclipsesource.makeithappen.model.task.Nationality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationality</em>' attribute.
	 * @see com.eclipsesource.makeithappen.model.task.Nationality
	 * @see #setNationality(Nationality)
	 * @see com.eclipsesource.makeithappen.model.task.TaskPackage#getUser_Nationality()
	 * @model
	 * @generated
	 */
	Nationality getNationality();

	/**
	 * Sets the value of the '{@link com.eclipsesource.makeithappen.model.task.User#getNationality <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationality</em>' attribute.
	 * @see com.eclipsesource.makeithappen.model.task.Nationality
	 * @see #getNationality()
	 * @generated
	 */
	void setNationality(Nationality value);

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

} // User
