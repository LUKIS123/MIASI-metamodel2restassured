/**
 */
package restAssuredTestGenerator.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restAssuredTestGenerator.HttpMethod;
import restAssuredTestGenerator.Method;
import restAssuredTestGenerator.RestAssuredTestGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.impl.MethodImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link restAssuredTestGenerator.impl.MethodImpl#getOptionalPath <em>Optional Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod HTTP_METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionalPath() <em>Optional Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONAL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionalPath() <em>Optional Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalPath()
	 * @generated
	 * @ordered
	 */
	protected String optionalPath = OPTIONAL_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestAssuredTestGeneratorPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpMethod(HttpMethod newHttpMethod) {
		HttpMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestAssuredTestGeneratorPackage.METHOD__HTTP_METHOD,
					oldHttpMethod, httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptionalPath() {
		return optionalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionalPath(String newOptionalPath) {
		String oldOptionalPath = optionalPath;
		optionalPath = newOptionalPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestAssuredTestGeneratorPackage.METHOD__OPTIONAL_PATH,
					oldOptionalPath, optionalPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RestAssuredTestGeneratorPackage.METHOD__HTTP_METHOD:
			return getHttpMethod();
		case RestAssuredTestGeneratorPackage.METHOD__OPTIONAL_PATH:
			return getOptionalPath();
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
		case RestAssuredTestGeneratorPackage.METHOD__HTTP_METHOD:
			setHttpMethod((HttpMethod) newValue);
			return;
		case RestAssuredTestGeneratorPackage.METHOD__OPTIONAL_PATH:
			setOptionalPath((String) newValue);
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
		case RestAssuredTestGeneratorPackage.METHOD__HTTP_METHOD:
			setHttpMethod(HTTP_METHOD_EDEFAULT);
			return;
		case RestAssuredTestGeneratorPackage.METHOD__OPTIONAL_PATH:
			setOptionalPath(OPTIONAL_PATH_EDEFAULT);
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
		case RestAssuredTestGeneratorPackage.METHOD__HTTP_METHOD:
			return httpMethod != HTTP_METHOD_EDEFAULT;
		case RestAssuredTestGeneratorPackage.METHOD__OPTIONAL_PATH:
			return OPTIONAL_PATH_EDEFAULT == null ? optionalPath != null : !OPTIONAL_PATH_EDEFAULT.equals(optionalPath);
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
		result.append(" (httpMethod: ");
		result.append(httpMethod);
		result.append(", optionalPath: ");
		result.append(optionalPath);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
