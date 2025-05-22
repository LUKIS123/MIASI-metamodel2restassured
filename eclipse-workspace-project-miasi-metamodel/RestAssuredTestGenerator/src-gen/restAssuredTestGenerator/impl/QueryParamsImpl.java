/**
 */
package restAssuredTestGenerator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import restAssuredTestGenerator.QueryParam;
import restAssuredTestGenerator.QueryParams;
import restAssuredTestGenerator.RestAssuredTestGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.impl.QueryParamsImpl#getQueryParams <em>Query Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryParamsImpl extends RequestElementImpl implements QueryParams {
	/**
	 * The cached value of the '{@link #getQueryParams() <em>Query Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryParams()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParam> queryParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestAssuredTestGeneratorPackage.Literals.QUERY_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QueryParam> getQueryParams() {
		if (queryParams == null) {
			queryParams = new EObjectContainmentEList<QueryParam>(QueryParam.class, this,
					RestAssuredTestGeneratorPackage.QUERY_PARAMS__QUERY_PARAMS);
		}
		return queryParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS__QUERY_PARAMS:
			return ((InternalEList<?>) getQueryParams()).basicRemove(otherEnd, msgs);
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
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS__QUERY_PARAMS:
			return getQueryParams();
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
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS__QUERY_PARAMS:
			getQueryParams().clear();
			getQueryParams().addAll((Collection<? extends QueryParam>) newValue);
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
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS__QUERY_PARAMS:
			getQueryParams().clear();
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
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS__QUERY_PARAMS:
			return queryParams != null && !queryParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryParamsImpl
