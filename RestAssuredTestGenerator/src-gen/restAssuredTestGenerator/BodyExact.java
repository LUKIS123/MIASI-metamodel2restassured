/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Exact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.BodyExact#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getBodyExact()
 * @model
 * @generated
 */
public interface BodyExact extends ResponseBodyElement {
	/**
	 * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.BodyExactPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairs</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getBodyExact_Pairs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BodyExactPair> getPairs();

} // BodyExact
