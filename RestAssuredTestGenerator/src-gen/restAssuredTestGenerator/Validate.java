/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.Validate#getValidateElements <em>Validate Elements</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getValidate()
 * @model
 * @generated
 */
public interface Validate extends EObject {
	/**
	 * Returns the value of the '<em><b>Validate Elements</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.ValidateElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Elements</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getValidate_ValidateElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ValidateElement> getValidateElements();

} // Validate
