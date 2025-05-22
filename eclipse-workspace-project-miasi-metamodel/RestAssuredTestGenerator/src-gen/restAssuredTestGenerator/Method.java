/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.Method#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link restAssuredTestGenerator.Method#getOptionalPath <em>Optional Path</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link restAssuredTestGenerator.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see restAssuredTestGenerator.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getMethod_HttpMethod()
	 * @model
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link restAssuredTestGenerator.Method#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see restAssuredTestGenerator.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Optional Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Path</em>' attribute.
	 * @see #setOptionalPath(String)
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getMethod_OptionalPath()
	 * @model
	 * @generated
	 */
	String getOptionalPath();

	/**
	 * Sets the value of the '{@link restAssuredTestGenerator.Method#getOptionalPath <em>Optional Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Path</em>' attribute.
	 * @see #getOptionalPath()
	 * @generated
	 */
	void setOptionalPath(String value);

} // Method
