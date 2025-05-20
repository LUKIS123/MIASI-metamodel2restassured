/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.ClassDef#getClassName <em>Class Name</em>}</li>
 *   <li>{@link restAssuredTestGenerator.ClassDef#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link restAssuredTestGenerator.ClassDef#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getClassDef()
 * @model
 * @generated
 */
public interface ClassDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getClassDef_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link restAssuredTestGenerator.ClassDef#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #isSetBaseUrl()
	 * @see #unsetBaseUrl()
	 * @see #setBaseUrl(String)
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getClassDef_BaseUrl()
	 * @model unsettable="true"
	 * @generated
	 */
	String getBaseUrl();

	/**
	 * Sets the value of the '{@link restAssuredTestGenerator.ClassDef#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #isSetBaseUrl()
	 * @see #unsetBaseUrl()
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(String value);

	/**
	 * Unsets the value of the '{@link restAssuredTestGenerator.ClassDef#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseUrl()
	 * @see #getBaseUrl()
	 * @see #setBaseUrl(String)
	 * @generated
	 */
	void unsetBaseUrl();

	/**
	 * Returns whether the value of the '{@link restAssuredTestGenerator.ClassDef#getBaseUrl <em>Base Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Url</em>' attribute is set.
	 * @see #unsetBaseUrl()
	 * @see #getBaseUrl()
	 * @see #setBaseUrl(String)
	 * @generated
	 */
	boolean isSetBaseUrl();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getClassDef_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

} // ClassDef
