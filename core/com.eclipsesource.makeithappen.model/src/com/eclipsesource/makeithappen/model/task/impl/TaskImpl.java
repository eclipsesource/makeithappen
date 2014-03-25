/**
 */
package com.eclipsesource.makeithappen.model.task.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import com.eclipsesource.makeithappen.model.task.Task;
import com.eclipsesource.makeithappen.model.task.TaskPackage;
import com.eclipsesource.makeithappen.model.task.User;
import com.eclipsesource.makeithappen.model.task.util.TaskValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.TaskImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.TaskImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.TaskImpl#getSubTasks <em>Sub Tasks</em>}</li>
 *   <li>{@link com.eclipsesource.makeithappen.model.task.impl.TaskImpl#isDone <em>Done</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected User assignee;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubTasks() <em>Sub Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> subTasks;

	/**
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected boolean done = DONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAssignee() {
		if (assignee != null && assignee.eIsProxy()) {
			InternalEObject oldAssignee = (InternalEObject)assignee;
			assignee = (User)eResolveProxy(oldAssignee);
			if (assignee != oldAssignee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__ASSIGNEE, oldAssignee, assignee));
			}
		}
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignee(User newAssignee, NotificationChain msgs) {
		User oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__ASSIGNEE, oldAssignee, newAssignee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignee(User newAssignee) {
		if (newAssignee != assignee) {
			NotificationChain msgs = null;
			if (assignee != null)
				msgs = ((InternalEObject)assignee).eInverseRemove(this, TaskPackage.USER__TASKS, User.class, msgs);
			if (newAssignee != null)
				msgs = ((InternalEObject)newAssignee).eInverseAdd(this, TaskPackage.USER__TASKS, User.class, msgs);
			msgs = basicSetAssignee(newAssignee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__ASSIGNEE, newAssignee, newAssignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getSubTasks() {
		if (subTasks == null) {
			subTasks = new EObjectContainmentEList<Task>(Task.class, this, TaskPackage.TASK__SUB_TASKS);
		}
		return subTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDone(boolean newDone) {
		boolean oldDone = done;
		done = newDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DONE, oldDone, done));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasName(DiagnosticChain chain, Map<?, ?> context) {
		if (getName()==null||getName().equals("")) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TaskValidator.DIAGNOSTIC_SOURCE,
						 TaskValidator.TASK__HAS_NAME,
						 "Task needs to have a name",
						 new Object [] { this, TaskPackage.eINSTANCE.getTask_Name() }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.TASK__ASSIGNEE:
				if (assignee != null)
					msgs = ((InternalEObject)assignee).eInverseRemove(this, TaskPackage.USER__TASKS, User.class, msgs);
				return basicSetAssignee((User)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.TASK__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case TaskPackage.TASK__SUB_TASKS:
				return ((InternalEList<?>)getSubTasks()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.TASK__NAME:
				return getName();
			case TaskPackage.TASK__DESCRIPTION:
				return getDescription();
			case TaskPackage.TASK__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case TaskPackage.TASK__DUE_DATE:
				return getDueDate();
			case TaskPackage.TASK__SUB_TASKS:
				return getSubTasks();
			case TaskPackage.TASK__DONE:
				return isDone();
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
			case TaskPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.TASK__ASSIGNEE:
				setAssignee((User)newValue);
				return;
			case TaskPackage.TASK__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case TaskPackage.TASK__SUB_TASKS:
				getSubTasks().clear();
				getSubTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case TaskPackage.TASK__DONE:
				setDone((Boolean)newValue);
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
			case TaskPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.TASK__ASSIGNEE:
				setAssignee((User)null);
				return;
			case TaskPackage.TASK__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case TaskPackage.TASK__SUB_TASKS:
				getSubTasks().clear();
				return;
			case TaskPackage.TASK__DONE:
				setDone(DONE_EDEFAULT);
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
			case TaskPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.TASK__ASSIGNEE:
				return assignee != null;
			case TaskPackage.TASK__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case TaskPackage.TASK__SUB_TASKS:
				return subTasks != null && !subTasks.isEmpty();
			case TaskPackage.TASK__DONE:
				return done != DONE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TaskPackage.TASK___HAS_NAME__DIAGNOSTICCHAIN_MAP:
				return hasName((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", done: ");
		result.append(done);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
