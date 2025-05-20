/**
 */
package restAssuredTestGenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see restAssuredTestGenerator.RestAssuredTestGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface RestAssuredTestGeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restAssuredTestGenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/restAssuredTestGenerator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restAssuredTestGenerator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestAssuredTestGeneratorPackage eINSTANCE = restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ProgramImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Class Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CLASS_DEFS = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ClassDefImpl <em>Class Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ClassDefImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getClassDef()
	 * @generated
	 */
	int CLASS_DEF = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEF__CLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEF__BASE_URL = 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEF__TESTS = 2;

	/**
	 * The number of structural features of the '<em>Class Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.TestImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__VALIDATE = 2;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.RequestImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Request Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUEST_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.MethodImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HTTP_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Optional Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OPTIONAL_PATH = 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.RequestElementImpl <em>Request Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.RequestElementImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getRequestElement()
	 * @generated
	 */
	int REQUEST_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Request Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Request Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.UrlImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__VALUE = REQUEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = REQUEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = REQUEST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.HeadersImpl <em>Headers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.HeadersImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getHeaders()
	 * @generated
	 */
	int HEADERS = 7;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS__HEADERS = REQUEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS_FEATURE_COUNT = REQUEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS_OPERATION_COUNT = REQUEST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.HeaderImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.QueryParamsImpl <em>Query Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.QueryParamsImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getQueryParams()
	 * @generated
	 */
	int QUERY_PARAMS = 9;

	/**
	 * The feature id for the '<em><b>Query Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMS__QUERY_PARAMS = REQUEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMS_FEATURE_COUNT = REQUEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAMS_OPERATION_COUNT = REQUEST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.QueryParamImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.BodyImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 11;

	/**
	 * The feature id for the '<em><b>Raw Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RAW_VALUE = REQUEST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = REQUEST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = REQUEST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ValidateImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 12;

	/**
	 * The feature id for the '<em><b>Validate Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__VALIDATE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ValidateElementImpl <em>Validate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ValidateElementImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getValidateElement()
	 * @generated
	 */
	int VALIDATE_ELEMENT = 13;

	/**
	 * The number of structural features of the '<em>Validate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Validate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.StatusCodeImpl <em>Status Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.StatusCodeImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getStatusCode()
	 * @generated
	 */
	int STATUS_CODE = 14;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CODE__STATUS_CODE = VALIDATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CODE_FEATURE_COUNT = VALIDATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Status Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CODE_OPERATION_COUNT = VALIDATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ResponseHeadersImpl <em>Response Headers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ResponseHeadersImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getResponseHeaders()
	 * @generated
	 */
	int RESPONSE_HEADERS = 15;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADERS__HEADERS = VALIDATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADERS_FEATURE_COUNT = VALIDATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response Headers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADERS_OPERATION_COUNT = VALIDATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ResponseBodyImpl <em>Response Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ResponseBodyImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getResponseBody()
	 * @generated
	 */
	int RESPONSE_BODY = 16;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BODY__ELEMENTS = VALIDATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BODY_FEATURE_COUNT = VALIDATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BODY_OPERATION_COUNT = VALIDATE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.ResponseBodyElementImpl <em>Response Body Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.ResponseBodyElementImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getResponseBodyElement()
	 * @generated
	 */
	int RESPONSE_BODY_ELEMENT = 17;

	/**
	 * The number of structural features of the '<em>Response Body Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BODY_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Response Body Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BODY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.BodyContainsImpl <em>Body Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.BodyContainsImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBodyContains()
	 * @generated
	 */
	int BODY_CONTAINS = 18;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CONTAINS__FIELDS = RESPONSE_BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CONTAINS_FEATURE_COUNT = RESPONSE_BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_CONTAINS_OPERATION_COUNT = RESPONSE_BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.BodyExactImpl <em>Body Exact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.BodyExactImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBodyExact()
	 * @generated
	 */
	int BODY_EXACT = 19;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT__PAIRS = RESPONSE_BODY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Body Exact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT_FEATURE_COUNT = RESPONSE_BODY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Body Exact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT_OPERATION_COUNT = RESPONSE_BODY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.impl.BodyExactPairImpl <em>Body Exact Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.impl.BodyExactPairImpl
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBodyExactPair()
	 * @generated
	 */
	int BODY_EXACT_PAIR = 20;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Body Exact Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Body Exact Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_EXACT_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restAssuredTestGenerator.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restAssuredTestGenerator.HttpMethod
	 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 21;

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see restAssuredTestGenerator.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.Program#getClassDefs <em>Class Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Defs</em>'.
	 * @see restAssuredTestGenerator.Program#getClassDefs()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ClassDefs();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.ClassDef <em>Class Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Def</em>'.
	 * @see restAssuredTestGenerator.ClassDef
	 * @generated
	 */
	EClass getClassDef();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.ClassDef#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see restAssuredTestGenerator.ClassDef#getClassName()
	 * @see #getClassDef()
	 * @generated
	 */
	EAttribute getClassDef_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.ClassDef#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see restAssuredTestGenerator.ClassDef#getBaseUrl()
	 * @see #getClassDef()
	 * @generated
	 */
	EAttribute getClassDef_BaseUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.ClassDef#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see restAssuredTestGenerator.ClassDef#getTests()
	 * @see #getClassDef()
	 * @generated
	 */
	EReference getClassDef_Tests();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see restAssuredTestGenerator.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see restAssuredTestGenerator.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the containment reference '{@link restAssuredTestGenerator.Test#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see restAssuredTestGenerator.Test#getRequest()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Request();

	/**
	 * Returns the meta object for the containment reference '{@link restAssuredTestGenerator.Test#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see restAssuredTestGenerator.Test#getValidate()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Validate();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see restAssuredTestGenerator.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the containment reference '{@link restAssuredTestGenerator.Request#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see restAssuredTestGenerator.Request#getMethod()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.Request#getRequestElements <em>Request Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Elements</em>'.
	 * @see restAssuredTestGenerator.Request#getRequestElements()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_RequestElements();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see restAssuredTestGenerator.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Method#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see restAssuredTestGenerator.Method#getHttpMethod()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Method#getOptionalPath <em>Optional Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Path</em>'.
	 * @see restAssuredTestGenerator.Method#getOptionalPath()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_OptionalPath();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.RequestElement <em>Request Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Element</em>'.
	 * @see restAssuredTestGenerator.RequestElement
	 * @generated
	 */
	EClass getRequestElement();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see restAssuredTestGenerator.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Url#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see restAssuredTestGenerator.Url#getValue()
	 * @see #getUrl()
	 * @generated
	 */
	EAttribute getUrl_Value();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Headers <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headers</em>'.
	 * @see restAssuredTestGenerator.Headers
	 * @generated
	 */
	EClass getHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.Headers#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see restAssuredTestGenerator.Headers#getHeaders()
	 * @see #getHeaders()
	 * @generated
	 */
	EReference getHeaders_Headers();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see restAssuredTestGenerator.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Header#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see restAssuredTestGenerator.Header#getKey()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Key();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Header#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see restAssuredTestGenerator.Header#getValue()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Value();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.QueryParams <em>Query Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Params</em>'.
	 * @see restAssuredTestGenerator.QueryParams
	 * @generated
	 */
	EClass getQueryParams();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.QueryParams#getQueryParams <em>Query Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Params</em>'.
	 * @see restAssuredTestGenerator.QueryParams#getQueryParams()
	 * @see #getQueryParams()
	 * @generated
	 */
	EReference getQueryParams_QueryParams();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see restAssuredTestGenerator.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.QueryParam#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see restAssuredTestGenerator.QueryParam#getKey()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Key();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.QueryParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see restAssuredTestGenerator.QueryParam#getValue()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Value();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see restAssuredTestGenerator.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.Body#getRawValue <em>Raw Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Value</em>'.
	 * @see restAssuredTestGenerator.Body#getRawValue()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_RawValue();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see restAssuredTestGenerator.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.Validate#getValidateElements <em>Validate Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate Elements</em>'.
	 * @see restAssuredTestGenerator.Validate#getValidateElements()
	 * @see #getValidate()
	 * @generated
	 */
	EReference getValidate_ValidateElements();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.ValidateElement <em>Validate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Element</em>'.
	 * @see restAssuredTestGenerator.ValidateElement
	 * @generated
	 */
	EClass getValidateElement();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.StatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Code</em>'.
	 * @see restAssuredTestGenerator.StatusCode
	 * @generated
	 */
	EClass getStatusCode();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.StatusCode#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see restAssuredTestGenerator.StatusCode#getStatusCode()
	 * @see #getStatusCode()
	 * @generated
	 */
	EAttribute getStatusCode_StatusCode();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.ResponseHeaders <em>Response Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Headers</em>'.
	 * @see restAssuredTestGenerator.ResponseHeaders
	 * @generated
	 */
	EClass getResponseHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.ResponseHeaders#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see restAssuredTestGenerator.ResponseHeaders#getHeaders()
	 * @see #getResponseHeaders()
	 * @generated
	 */
	EReference getResponseHeaders_Headers();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.ResponseBody <em>Response Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Body</em>'.
	 * @see restAssuredTestGenerator.ResponseBody
	 * @generated
	 */
	EClass getResponseBody();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.ResponseBody#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see restAssuredTestGenerator.ResponseBody#getElements()
	 * @see #getResponseBody()
	 * @generated
	 */
	EReference getResponseBody_Elements();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.ResponseBodyElement <em>Response Body Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Body Element</em>'.
	 * @see restAssuredTestGenerator.ResponseBodyElement
	 * @generated
	 */
	EClass getResponseBodyElement();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.BodyContains <em>Body Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Contains</em>'.
	 * @see restAssuredTestGenerator.BodyContains
	 * @generated
	 */
	EClass getBodyContains();

	/**
	 * Returns the meta object for the attribute list '{@link restAssuredTestGenerator.BodyContains#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fields</em>'.
	 * @see restAssuredTestGenerator.BodyContains#getFields()
	 * @see #getBodyContains()
	 * @generated
	 */
	EAttribute getBodyContains_Fields();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.BodyExact <em>Body Exact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Exact</em>'.
	 * @see restAssuredTestGenerator.BodyExact
	 * @generated
	 */
	EClass getBodyExact();

	/**
	 * Returns the meta object for the containment reference list '{@link restAssuredTestGenerator.BodyExact#getPairs <em>Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pairs</em>'.
	 * @see restAssuredTestGenerator.BodyExact#getPairs()
	 * @see #getBodyExact()
	 * @generated
	 */
	EReference getBodyExact_Pairs();

	/**
	 * Returns the meta object for class '{@link restAssuredTestGenerator.BodyExactPair <em>Body Exact Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Exact Pair</em>'.
	 * @see restAssuredTestGenerator.BodyExactPair
	 * @generated
	 */
	EClass getBodyExactPair();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.BodyExactPair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see restAssuredTestGenerator.BodyExactPair#getKey()
	 * @see #getBodyExactPair()
	 * @generated
	 */
	EAttribute getBodyExactPair_Key();

	/**
	 * Returns the meta object for the attribute '{@link restAssuredTestGenerator.BodyExactPair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see restAssuredTestGenerator.BodyExactPair#getValue()
	 * @see #getBodyExactPair()
	 * @generated
	 */
	EAttribute getBodyExactPair_Value();

	/**
	 * Returns the meta object for enum '{@link restAssuredTestGenerator.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see restAssuredTestGenerator.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestAssuredTestGeneratorFactory getRestAssuredTestGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ProgramImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Class Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CLASS_DEFS = eINSTANCE.getProgram_ClassDefs();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ClassDefImpl <em>Class Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ClassDefImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getClassDef()
		 * @generated
		 */
		EClass CLASS_DEF = eINSTANCE.getClassDef();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DEF__CLASS_NAME = eINSTANCE.getClassDef_ClassName();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_DEF__BASE_URL = eINSTANCE.getClassDef_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DEF__TESTS = eINSTANCE.getClassDef_Tests();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.TestImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__REQUEST = eINSTANCE.getTest_Request();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__VALIDATE = eINSTANCE.getTest_Validate();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.RequestImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__METHOD = eINSTANCE.getRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Request Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__REQUEST_ELEMENTS = eINSTANCE.getRequest_RequestElements();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.MethodImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__HTTP_METHOD = eINSTANCE.getMethod_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Optional Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__OPTIONAL_PATH = eINSTANCE.getMethod_OptionalPath();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.RequestElementImpl <em>Request Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.RequestElementImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getRequestElement()
		 * @generated
		 */
		EClass REQUEST_ELEMENT = eINSTANCE.getRequestElement();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.UrlImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__VALUE = eINSTANCE.getUrl_Value();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.HeadersImpl <em>Headers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.HeadersImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getHeaders()
		 * @generated
		 */
		EClass HEADERS = eINSTANCE.getHeaders();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADERS__HEADERS = eINSTANCE.getHeaders_Headers();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.HeaderImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__KEY = eINSTANCE.getHeader_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__VALUE = eINSTANCE.getHeader_Value();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.QueryParamsImpl <em>Query Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.QueryParamsImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getQueryParams()
		 * @generated
		 */
		EClass QUERY_PARAMS = eINSTANCE.getQueryParams();

		/**
		 * The meta object literal for the '<em><b>Query Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PARAMS__QUERY_PARAMS = eINSTANCE.getQueryParams_QueryParams();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.QueryParamImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getQueryParam()
		 * @generated
		 */
		EClass QUERY_PARAM = eINSTANCE.getQueryParam();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__KEY = eINSTANCE.getQueryParam_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__VALUE = eINSTANCE.getQueryParam_Value();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.BodyImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Raw Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__RAW_VALUE = eINSTANCE.getBody_RawValue();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ValidateImpl <em>Validate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ValidateImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getValidate()
		 * @generated
		 */
		EClass VALIDATE = eINSTANCE.getValidate();

		/**
		 * The meta object literal for the '<em><b>Validate Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATE__VALIDATE_ELEMENTS = eINSTANCE.getValidate_ValidateElements();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ValidateElementImpl <em>Validate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ValidateElementImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getValidateElement()
		 * @generated
		 */
		EClass VALIDATE_ELEMENT = eINSTANCE.getValidateElement();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.StatusCodeImpl <em>Status Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.StatusCodeImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getStatusCode()
		 * @generated
		 */
		EClass STATUS_CODE = eINSTANCE.getStatusCode();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_CODE__STATUS_CODE = eINSTANCE.getStatusCode_StatusCode();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ResponseHeadersImpl <em>Response Headers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ResponseHeadersImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getResponseHeaders()
		 * @generated
		 */
		EClass RESPONSE_HEADERS = eINSTANCE.getResponseHeaders();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_HEADERS__HEADERS = eINSTANCE.getResponseHeaders_Headers();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ResponseBodyImpl <em>Response Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ResponseBodyImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getResponseBody()
		 * @generated
		 */
		EClass RESPONSE_BODY = eINSTANCE.getResponseBody();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_BODY__ELEMENTS = eINSTANCE.getResponseBody_Elements();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.ResponseBodyElementImpl <em>Response Body Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.ResponseBodyElementImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getResponseBodyElement()
		 * @generated
		 */
		EClass RESPONSE_BODY_ELEMENT = eINSTANCE.getResponseBodyElement();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.BodyContainsImpl <em>Body Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.BodyContainsImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBodyContains()
		 * @generated
		 */
		EClass BODY_CONTAINS = eINSTANCE.getBodyContains();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_CONTAINS__FIELDS = eINSTANCE.getBodyContains_Fields();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.BodyExactImpl <em>Body Exact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.BodyExactImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBodyExact()
		 * @generated
		 */
		EClass BODY_EXACT = eINSTANCE.getBodyExact();

		/**
		 * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_EXACT__PAIRS = eINSTANCE.getBodyExact_Pairs();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.impl.BodyExactPairImpl <em>Body Exact Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.impl.BodyExactPairImpl
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getBodyExactPair()
		 * @generated
		 */
		EClass BODY_EXACT_PAIR = eINSTANCE.getBodyExactPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_EXACT_PAIR__KEY = eINSTANCE.getBodyExactPair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_EXACT_PAIR__VALUE = eINSTANCE.getBodyExactPair_Value();

		/**
		 * The meta object literal for the '{@link restAssuredTestGenerator.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restAssuredTestGenerator.HttpMethod
		 * @see restAssuredTestGenerator.impl.RestAssuredTestGeneratorPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //RestAssuredTestGeneratorPackage
