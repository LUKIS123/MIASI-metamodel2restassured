/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restAssuredTestGenerator.Program#getClassDefs <em>Class Defs</em>}</li>
 * </ul>
 *
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Defs</b></em>' containment reference list.
	 * The list contents are of type {@link restAssuredTestGenerator.ClassDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Defs</em>' containment reference list.
	 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage#getProgram_ClassDefs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassDef> getClassDefs();

} // Program
