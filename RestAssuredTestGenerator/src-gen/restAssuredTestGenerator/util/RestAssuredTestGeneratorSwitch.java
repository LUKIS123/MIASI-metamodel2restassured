/**
 */
package restAssuredTestGenerator.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import restAssuredTestGenerator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorPackage
 * @generated
 */
public class RestAssuredTestGeneratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestAssuredTestGeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAssuredTestGeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = RestAssuredTestGeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RestAssuredTestGeneratorPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.CLASS_DEF: {
			ClassDef classDef = (ClassDef) theEObject;
			T result = caseClassDef(classDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.TEST: {
			Test test = (Test) theEObject;
			T result = caseTest(test);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.REQUEST: {
			Request request = (Request) theEObject;
			T result = caseRequest(request);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.METHOD: {
			Method method = (Method) theEObject;
			T result = caseMethod(method);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.REQUEST_ELEMENT: {
			RequestElement requestElement = (RequestElement) theEObject;
			T result = caseRequestElement(requestElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.URL: {
			Url url = (Url) theEObject;
			T result = caseUrl(url);
			if (result == null)
				result = caseRequestElement(url);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.HEADERS: {
			Headers headers = (Headers) theEObject;
			T result = caseHeaders(headers);
			if (result == null)
				result = caseRequestElement(headers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.HEADER: {
			Header header = (Header) theEObject;
			T result = caseHeader(header);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS: {
			QueryParams queryParams = (QueryParams) theEObject;
			T result = caseQueryParams(queryParams);
			if (result == null)
				result = caseRequestElement(queryParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.QUERY_PARAM: {
			QueryParam queryParam = (QueryParam) theEObject;
			T result = caseQueryParam(queryParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.BODY: {
			Body body = (Body) theEObject;
			T result = caseBody(body);
			if (result == null)
				result = caseRequestElement(body);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.VALIDATE: {
			Validate validate = (Validate) theEObject;
			T result = caseValidate(validate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.VALIDATE_ELEMENT: {
			ValidateElement validateElement = (ValidateElement) theEObject;
			T result = caseValidateElement(validateElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.STATUS_CODE: {
			StatusCode statusCode = (StatusCode) theEObject;
			T result = caseStatusCode(statusCode);
			if (result == null)
				result = caseValidateElement(statusCode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.RESPONSE_HEADERS: {
			ResponseHeaders responseHeaders = (ResponseHeaders) theEObject;
			T result = caseResponseHeaders(responseHeaders);
			if (result == null)
				result = caseValidateElement(responseHeaders);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.RESPONSE_BODY: {
			ResponseBody responseBody = (ResponseBody) theEObject;
			T result = caseResponseBody(responseBody);
			if (result == null)
				result = caseValidateElement(responseBody);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.RESPONSE_BODY_ELEMENT: {
			ResponseBodyElement responseBodyElement = (ResponseBodyElement) theEObject;
			T result = caseResponseBodyElement(responseBodyElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.BODY_CONTAINS: {
			BodyContains bodyContains = (BodyContains) theEObject;
			T result = caseBodyContains(bodyContains);
			if (result == null)
				result = caseResponseBodyElement(bodyContains);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.BODY_EXACT: {
			BodyExact bodyExact = (BodyExact) theEObject;
			T result = caseBodyExact(bodyExact);
			if (result == null)
				result = caseResponseBodyElement(bodyExact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RestAssuredTestGeneratorPackage.BODY_EXACT_PAIR: {
			BodyExactPair bodyExactPair = (BodyExactPair) theEObject;
			T result = caseBodyExactPair(bodyExactPair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDef(ClassDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestElement(RequestElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrl(Url object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaders(Headers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParams(QueryParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParam(QueryParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidate(Validate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidateElement(ValidateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusCode(StatusCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Headers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Headers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseHeaders(ResponseHeaders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseBody(ResponseBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Body Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Body Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseBodyElement(ResponseBodyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyContains(BodyContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Exact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Exact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyExact(BodyExact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Exact Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Exact Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyExactPair(BodyExactPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RestAssuredTestGeneratorSwitch
