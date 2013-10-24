/**
 */
package com.eclipsesource.makeithappen.model.task.impl;

import com.eclipsesource.makeithappen.model.task.Gender;
import com.eclipsesource.makeithappen.model.task.Nationality;
import com.eclipsesource.makeithappen.model.task.Task;
import com.eclipsesource.makeithappen.model.task.TaskPackage;
import com.eclipsesource.makeithappen.model.task.User;
import java.util.Collection;
import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#isActive <em>Active</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getTimeOfRegistration <em>Time Of Registration</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getHeigth <em>Heigth</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getEMails <em>EMails</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.UserImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfRegistration() <em>Time Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_OF_REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfRegistration() <em>Time Of Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfRegistration()
	 * @generated
	 * @ordered
	 */
	protected Date timeOfRegistration = TIME_OF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeigth() <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigth()
	 * @generated
	 * @ordered
	 */
	protected int heigth = HEIGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNationality() <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected static final Nationality NATIONALITY_EDEFAULT = Nationality.GERMAN;

	/**
	 * The cached value of the '{@link #getNationality() <em>Nationality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationality()
	 * @generated
	 * @ordered
	 */
	protected Nationality nationality = NATIONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEMails() <em>EMails</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eMails;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeOfRegistration() {
		return timeOfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOfRegistration(Date newTimeOfRegistration) {
		Date oldTimeOfRegistration = timeOfRegistration;
		timeOfRegistration = newTimeOfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__TIME_OF_REGISTRATION, oldTimeOfRegistration, timeOfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(XMLGregorianCalendar newDateOfBirth) {
		XMLGregorianCalendar oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeigth() {
		return heigth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigth(int newHeigth) {
		int oldHeigth = heigth;
		heigth = newHeigth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__HEIGTH, oldHeigth, heigth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nationality getNationality() {
		return nationality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationality(Nationality newNationality) {
		Nationality oldNationality = nationality;
		nationality = newNationality == null ? NATIONALITY_EDEFAULT : newNationality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.USER__NATIONALITY, oldNationality, nationality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEMails() {
		if (eMails == null) {
			eMails = new EDataTypeUniqueEList<String>(String.class, this, TaskPackage.USER__EMAILS);
		}
		return eMails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, TaskPackage.USER__TASKS, TaskPackage.TASK__ASSIGNEE);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.USER__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.USER__FIRST_NAME:
				return getFirstName();
			case TaskPackage.USER__LAST_NAME:
				return getLastName();
			case TaskPackage.USER__GENDER:
				return getGender();
			case TaskPackage.USER__ACTIVE:
				return isActive();
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				return getTimeOfRegistration();
			case TaskPackage.USER__WEIGHT:
				return getWeight();
			case TaskPackage.USER__HEIGTH:
				return getHeigth();
			case TaskPackage.USER__NATIONALITY:
				return getNationality();
			case TaskPackage.USER__DATE_OF_BIRTH:
				return getDateOfBirth();
			case TaskPackage.USER__EMAILS:
				return getEMails();
			case TaskPackage.USER__TASKS:
				return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskPackage.USER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case TaskPackage.USER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case TaskPackage.USER__GENDER:
				setGender((Gender)newValue);
				return;
			case TaskPackage.USER__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				setTimeOfRegistration((Date)newValue);
				return;
			case TaskPackage.USER__WEIGHT:
				setWeight((Double)newValue);
				return;
			case TaskPackage.USER__HEIGTH:
				setHeigth((Integer)newValue);
				return;
			case TaskPackage.USER__NATIONALITY:
				setNationality((Nationality)newValue);
				return;
			case TaskPackage.USER__DATE_OF_BIRTH:
				setDateOfBirth((XMLGregorianCalendar)newValue);
				return;
			case TaskPackage.USER__EMAILS:
				getEMails().clear();
				getEMails().addAll((Collection<? extends String>)newValue);
				return;
			case TaskPackage.USER__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskPackage.USER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case TaskPackage.USER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case TaskPackage.USER__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case TaskPackage.USER__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				setTimeOfRegistration(TIME_OF_REGISTRATION_EDEFAULT);
				return;
			case TaskPackage.USER__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case TaskPackage.USER__HEIGTH:
				setHeigth(HEIGTH_EDEFAULT);
				return;
			case TaskPackage.USER__NATIONALITY:
				setNationality(NATIONALITY_EDEFAULT);
				return;
			case TaskPackage.USER__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case TaskPackage.USER__EMAILS:
				getEMails().clear();
				return;
			case TaskPackage.USER__TASKS:
				getTasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskPackage.USER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case TaskPackage.USER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case TaskPackage.USER__GENDER:
				return gender != GENDER_EDEFAULT;
			case TaskPackage.USER__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case TaskPackage.USER__TIME_OF_REGISTRATION:
				return TIME_OF_REGISTRATION_EDEFAULT == null ? timeOfRegistration != null : !TIME_OF_REGISTRATION_EDEFAULT.equals(timeOfRegistration);
			case TaskPackage.USER__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case TaskPackage.USER__HEIGTH:
				return heigth != HEIGTH_EDEFAULT;
			case TaskPackage.USER__NATIONALITY:
				return nationality != NATIONALITY_EDEFAULT;
			case TaskPackage.USER__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case TaskPackage.USER__EMAILS:
				return eMails != null && !eMails.isEmpty();
			case TaskPackage.USER__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", gender: ");
		result.append(gender);
		result.append(", active: ");
		result.append(active);
		result.append(", timeOfRegistration: ");
		result.append(timeOfRegistration);
		result.append(", weight: ");
		result.append(weight);
		result.append(", heigth: ");
		result.append(heigth);
		result.append(", nationality: ");
		result.append(nationality);
		result.append(", dateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", eMails: ");
		result.append(eMails);
		result.append(')');
		return result.toString();
	}

} //UserImpl
