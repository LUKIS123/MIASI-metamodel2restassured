/**
 */
package restAssuredTestGenerator.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import restAssuredTestGenerator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage
 * @generated
 */
public class RestAssuredTestGeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestAssuredTestGeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAssuredTestGeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestAssuredTestGeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestAssuredTestGeneratorSwitch<Adapter> modelSwitch = new RestAssuredTestGeneratorSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseClassDef(ClassDef object) {
			return createClassDefAdapter();
		}

		@Override
		public Adapter caseTest(Test object) {
			return createTestAdapter();
		}

		@Override
		public Adapter caseRequest(Request object) {
			return createRequestAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter caseRequestElement(RequestElement object) {
			return createRequestElementAdapter();
		}

		@Override
		public Adapter caseUrl(Url object) {
			return createUrlAdapter();
		}

		@Override
		public Adapter caseHeaders(Headers object) {
			return createHeadersAdapter();
		}

		@Override
		public Adapter caseHeader(Header object) {
			return createHeaderAdapter();
		}

		@Override
		public Adapter caseQueryParams(QueryParams object) {
			return createQueryParamsAdapter();
		}

		@Override
		public Adapter caseQueryParam(QueryParam object) {
			return createQueryParamAdapter();
		}

		@Override
		public Adapter caseBody(Body object) {
			return createBodyAdapter();
		}

		@Override
		public Adapter caseValidate(Validate object) {
			return createValidateAdapter();
		}

		@Override
		public Adapter caseValidateElement(ValidateElement object) {
			return createValidateElementAdapter();
		}

		@Override
		public Adapter caseStatusCode(StatusCode object) {
			return createStatusCodeAdapter();
		}

		@Override
		public Adapter caseResponseHeaders(ResponseHeaders object) {
			return createResponseHeadersAdapter();
		}

		@Override
		public Adapter caseResponseBody(ResponseBody object) {
			return createResponseBodyAdapter();
		}

		@Override
		public Adapter caseResponseBodyElement(ResponseBodyElement object) {
			return createResponseBodyElementAdapter();
		}

		@Override
		public Adapter caseBodyContains(BodyContains object) {
			return createBodyContainsAdapter();
		}

		@Override
		public Adapter caseBodyExact(BodyExact object) {
			return createBodyExactAdapter();
		}

		@Override
		public Adapter caseBodyExactPair(BodyExactPair object) {
			return createBodyExactPairAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.ClassDef <em>Class Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.ClassDef
	 * @generated
	 */
	public Adapter createClassDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.RequestElement <em>Request Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.RequestElement
	 * @generated
	 */
	public Adapter createRequestElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Headers <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Headers
	 * @generated
	 */
	public Adapter createHeadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.QueryParams <em>Query Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.QueryParams
	 * @generated
	 */
	public Adapter createQueryParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.QueryParam
	 * @generated
	 */
	public Adapter createQueryParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.Validate
	 * @generated
	 */
	public Adapter createValidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.ValidateElement <em>Validate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.ValidateElement
	 * @generated
	 */
	public Adapter createValidateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.StatusCode
	 * @generated
	 */
	public Adapter createStatusCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.ResponseHeaders <em>Response Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.ResponseHeaders
	 * @generated
	 */
	public Adapter createResponseHeadersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.ResponseBody <em>Response Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.ResponseBody
	 * @generated
	 */
	public Adapter createResponseBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.ResponseBodyElement <em>Response Body Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.ResponseBodyElement
	 * @generated
	 */
	public Adapter createResponseBodyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.BodyContains <em>Body Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.BodyContains
	 * @generated
	 */
	public Adapter createBodyContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.BodyExact <em>Body Exact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.BodyExact
	 * @generated
	 */
	public Adapter createBodyExactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restAssuredTestGenerator.BodyExactPair <em>Body Exact Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restAssuredTestGenerator.BodyExactPair
	 * @generated
	 */
	public Adapter createBodyExactPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestAssuredTestGeneratorAdapterFactory
