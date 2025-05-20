/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.QueryParams#getQueryParams <em>Query Params</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getQueryParams()
 * @model
 * @generated
 */
public interface QueryParams extends RequestElement {
	/**
	 * Returns the value of the '<em><b>Query Params</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.QueryParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Params</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getQueryParams_QueryParams()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QueryParam> getQueryParams();

} // QueryParams
