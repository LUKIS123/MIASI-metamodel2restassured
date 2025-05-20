/**
 */
package restAssuredTestGenerator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restAssuredTestGenerator.Request;
import restAssuredTestGenerator.RestAssuredTestGeneratorPackage;
import restAssuredTestGenerator.Test;
import restAssuredTestGenerator.Validate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.impl.TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link restAssuredTestGenerator.impl.TestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link restAssuredTestGenerator.impl.TestImpl#getValidate <em>Validate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected Validate validate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestAssuredTestGeneratorPackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestAssuredTestGeneratorPackage.TEST__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RestAssuredTestGeneratorPackage.TEST__REQUEST, oldRequest, newRequest);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject) request).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RestAssuredTestGeneratorPackage.TEST__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject) newRequest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RestAssuredTestGeneratorPackage.TEST__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestAssuredTestGeneratorPackage.TEST__REQUEST,
					newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Validate getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidate(Validate newValidate, NotificationChain msgs) {
		Validate oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RestAssuredTestGeneratorPackage.TEST__VALIDATE, oldValidate, newValidate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidate(Validate newValidate) {
		if (newValidate != validate) {
			NotificationChain msgs = null;
			if (validate != null)
				msgs = ((InternalEObject) validate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RestAssuredTestGeneratorPackage.TEST__VALIDATE, null, msgs);
			if (newValidate != null)
				msgs = ((InternalEObject) newValidate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RestAssuredTestGeneratorPackage.TEST__VALIDATE, null, msgs);
			msgs = basicSetValidate(newValidate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestAssuredTestGeneratorPackage.TEST__VALIDATE,
					newValidate, newValidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RestAssuredTestGeneratorPackage.TEST__REQUEST:
			return basicSetRequest(null, msgs);
		case RestAssuredTestGeneratorPackage.TEST__VALIDATE:
			return basicSetValidate(null, msgs);
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
		case RestAssuredTestGeneratorPackage.TEST__NAME:
			return getName();
		case RestAssuredTestGeneratorPackage.TEST__REQUEST:
			return getRequest();
		case RestAssuredTestGeneratorPackage.TEST__VALIDATE:
			return getValidate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RestAssuredTestGeneratorPackage.TEST__NAME:
			setName((String) newValue);
			return;
		case RestAssuredTestGeneratorPackage.TEST__REQUEST:
			setRequest((Request) newValue);
			return;
		case RestAssuredTestGeneratorPackage.TEST__VALIDATE:
			setValidate((Validate) newValue);
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
		case RestAssuredTestGeneratorPackage.TEST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RestAssuredTestGeneratorPackage.TEST__REQUEST:
			setRequest((Request) null);
			return;
		case RestAssuredTestGeneratorPackage.TEST__VALIDATE:
			setValidate((Validate) null);
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
		case RestAssuredTestGeneratorPackage.TEST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RestAssuredTestGeneratorPackage.TEST__REQUEST:
			return request != null;
		case RestAssuredTestGeneratorPackage.TEST__VALIDATE:
			return validate != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestImpl
