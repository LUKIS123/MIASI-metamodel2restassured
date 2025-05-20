/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Headers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.ResponseHeaders#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getResponseHeaders()
 * @model
 * @generated
 */
public interface ResponseHeaders extends ValidateElement {
	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getResponseHeaders_Headers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Header> getHeaders();

} // ResponseHeaders
