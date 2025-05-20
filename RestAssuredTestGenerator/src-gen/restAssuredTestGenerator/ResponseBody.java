/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.ResponseBody#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getResponseBody()
 * @model
 * @generated
 */
public interface ResponseBody extends ValidateElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.ResponseBodyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getResponseBody_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResponseBodyElement> getElements();

} // ResponseBody
