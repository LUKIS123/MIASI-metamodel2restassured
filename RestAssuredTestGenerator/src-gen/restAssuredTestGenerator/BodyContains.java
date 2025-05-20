/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.BodyContains#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getBodyContains()
 * @model
 * @generated
 */
public interface BodyContains extends ResponseBodyElement {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getBodyContains_Fields()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getFields();

} // BodyContains
