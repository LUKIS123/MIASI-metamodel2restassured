/**
 */
package restAssuredTestGenerator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import restAssuredTestGenerator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestAssuredTestGeneratorFactoryImpl extends EFactoryImpl implements RestAssuredTestGeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestAssuredTestGeneratorFactory init() {
		try {
			RestAssuredTestGeneratorFactory theRestAssuredTestGeneratorFactory = (RestAssuredTestGeneratorFactory) EPackage.Registry.INSTANCE
					.getEFactory(RestAssuredTestGeneratorPackage.eNS_URI);
			if (theRestAssuredTestGeneratorFactory != null) {
				return theRestAssuredTestGeneratorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestAssuredTestGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestAssuredTestGeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RestAssuredTestGeneratorPackage.PROGRAM:
			return createProgram();
		case RestAssuredTestGeneratorPackage.CLASS_DEF:
			return createClassDef();
		case RestAssuredTestGeneratorPackage.TEST:
			return createTest();
		case RestAssuredTestGeneratorPackage.REQUEST:
			return createRequest();
		case RestAssuredTestGeneratorPackage.METHOD:
			return createMethod();
		case RestAssuredTestGeneratorPackage.URL:
			return createUrl();
		case RestAssuredTestGeneratorPackage.HEADERS:
			return createHeaders();
		case RestAssuredTestGeneratorPackage.HEADER:
			return createHeader();
		case RestAssuredTestGeneratorPackage.QUERY_PARAMS:
			return createQueryParams();
		case RestAssuredTestGeneratorPackage.QUERY_PARAM:
			return createQueryParam();
		case RestAssuredTestGeneratorPackage.BODY:
			return createBody();
		case RestAssuredTestGeneratorPackage.VALIDATE:
			return createValidate();
		case RestAssuredTestGeneratorPackage.STATUS_CODE:
			return createStatusCode();
		case RestAssuredTestGeneratorPackage.RESPONSE_HEADERS:
			return createResponseHeaders();
		case RestAssuredTestGeneratorPackage.RESPONSE_BODY:
			return createResponseBody();
		case RestAssuredTestGeneratorPackage.BODY_CONTAINS:
			return createBodyContains();
		case RestAssuredTestGeneratorPackage.BODY_EXACT:
			return createBodyExact();
		case RestAssuredTestGeneratorPackage.BODY_EXACT_PAIR:
			return createBodyExactPair();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RestAssuredTestGeneratorPackage.HTTP_METHOD:
			return createHttpMethodFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RestAssuredTestGeneratorPackage.HTTP_METHOD:
			return convertHttpMethodToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDef createClassDef() {
		ClassDefImpl classDef = new ClassDefImpl();
		return classDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Headers createHeaders() {
		HeadersImpl headers = new HeadersImpl();
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryParams createQueryParams() {
		QueryParamsImpl queryParams = new QueryParamsImpl();
		return queryParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryParam createQueryParam() {
		QueryParamImpl queryParam = new QueryParamImpl();
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Validate createValidate() {
		ValidateImpl validate = new ValidateImpl();
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusCode createStatusCode() {
		StatusCodeImpl statusCode = new StatusCodeImpl();
		return statusCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseHeaders createResponseHeaders() {
		ResponseHeadersImpl responseHeaders = new ResponseHeadersImpl();
		return responseHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseBody createResponseBody() {
		ResponseBodyImpl responseBody = new ResponseBodyImpl();
		return responseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyContains createBodyContains() {
		BodyContainsImpl bodyContains = new BodyContainsImpl();
		return bodyContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyExact createBodyExact() {
		BodyExactImpl bodyExact = new BodyExactImpl();
		return bodyExact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyExactPair createBodyExactPair() {
		BodyExactPairImpl bodyExactPair = new BodyExactPairImpl();
		return bodyExactPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestAssuredTestGeneratorPackage getRestAssuredTestGeneratorPackage() {
		return (RestAssuredTestGeneratorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestAssuredTestGeneratorPackage getPackage() {
		return RestAssuredTestGeneratorPackage.eINSTANCE;
	}

} //RestAssuredTestGeneratorFactoryImpl
