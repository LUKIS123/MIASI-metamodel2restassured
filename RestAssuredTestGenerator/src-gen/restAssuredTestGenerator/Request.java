/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.Request#getMethod <em>Method</em>}</li>
 *   <li>{@link restAssuredTestGenerator.Request#getRequestElements <em>Request Elements</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Method)
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getRequest_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link restAssuredTestGenerator.Request#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Request Elements</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.RequestElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Elements</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getRequest_RequestElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestElement> getRequestElements();

} // Request
