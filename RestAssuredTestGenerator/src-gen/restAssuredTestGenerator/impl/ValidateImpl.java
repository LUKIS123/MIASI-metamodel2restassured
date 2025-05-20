/**
 */
package restAssuredTestGenerator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import restAssuredTestGenerator.RestAssuredTestGeneratorPackage;
import restAssuredTestGenerator.Validate;
import restAssuredTestGenerator.ValidateElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.impl.ValidateImpl#getValidateElements <em>Validate Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidateImpl extends MinimalEObjectImpl.Container implements Validate {
	/**
	 * The cached value of the '{@link #getValidateElements() <em>Validate Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidateElement> validateElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestAssuredTestGeneratorPackage.Literals.VALIDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValidateElement> getValidateElements() {
		if (validateElements == null) {
			validateElements = new EObjectContainmentEList<ValidateElement>(ValidateElement.class, this,
					RestAssuredTestGeneratorPackage.VALIDATE__VALIDATE_ELEMENTS);
		}
		return validateElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RestAssuredTestGeneratorPackage.VALIDATE__VALIDATE_ELEMENTS:
			return ((InternalEList<?>) getValidateElements()).basicRemove(otherEnd, msgs);
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
		case RestAssuredTestGeneratorPackage.VALIDATE__VALIDATE_ELEMENTS:
			return getValidateElements();
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
		case RestAssuredTestGeneratorPackage.VALIDATE__VALIDATE_ELEMENTS:
			getValidateElements().clear();
			getValidateElements().addAll((Collection<? extends ValidateElement>) newValue);
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
		case RestAssuredTestGeneratorPackage.VALIDATE__VALIDATE_ELEMENTS:
			getValidateElements().clear();
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
		case RestAssuredTestGeneratorPackage.VALIDATE__VALIDATE_ELEMENTS:
			return validateElements != null && !validateElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValidateImpl
