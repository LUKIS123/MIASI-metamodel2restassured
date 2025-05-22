/**
 */
package restAssuredTestGenerator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import restAssuredTestGenerator.Method;
import restAssuredTestGenerator.Request;
import restAssuredTestGenerator.RequestElement;
import restAssuredTestGenerator.RestAssuredTestGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.impl.RequestImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link restAssuredTestGenerator.impl.RequestImpl#getRequestElements <em>Request Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

	/**
	 * The cached value of the '{@link #getRequestElements() <em>Request Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestElement> requestElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestAssuredTestGeneratorPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RestAssuredTestGeneratorPackage.REQUEST__METHOD, oldMethod, newMethod);
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
	public void setMethod(Method newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RestAssuredTestGeneratorPackage.REQUEST__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RestAssuredTestGeneratorPackage.REQUEST__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestAssuredTestGeneratorPackage.REQUEST__METHOD,
					newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequestElement> getRequestElements() {
		if (requestElements == null) {
			requestElements = new EObjectContainmentEList<RequestElement>(RequestElement.class, this,
					RestAssuredTestGeneratorPackage.REQUEST__REQUEST_ELEMENTS);
		}
		return requestElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RestAssuredTestGeneratorPackage.REQUEST__METHOD:
			return basicSetMethod(null, msgs);
		case RestAssuredTestGeneratorPackage.REQUEST__REQUEST_ELEMENTS:
			return ((InternalEList<?>) getRequestElements()).basicRemove(otherEnd, msgs);
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
		case RestAssuredTestGeneratorPackage.REQUEST__METHOD:
			return getMethod();
		case RestAssuredTestGeneratorPackage.REQUEST__REQUEST_ELEMENTS:
			return getRequestElements();
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
		case RestAssuredTestGeneratorPackage.REQUEST__METHOD:
			setMethod((Method) newValue);
			return;
		case RestAssuredTestGeneratorPackage.REQUEST__REQUEST_ELEMENTS:
			getRequestElements().clear();
			getRequestElements().addAll((Collection<? extends RequestElement>) newValue);
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
		case RestAssuredTestGeneratorPackage.REQUEST__METHOD:
			setMethod((Method) null);
			return;
		case RestAssuredTestGeneratorPackage.REQUEST__REQUEST_ELEMENTS:
			getRequestElements().clear();
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
		case RestAssuredTestGeneratorPackage.REQUEST__METHOD:
			return method != null;
		case RestAssuredTestGeneratorPackage.REQUEST__REQUEST_ELEMENTS:
			return requestElements != null && !requestElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestImpl
