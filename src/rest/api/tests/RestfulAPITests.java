package rest.api.tests;

import org.json.JSONException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import rest.api.actions.CommonActions;
import rest.api.props.BaseProperties;
import rest.api.props.TestProperties;

public class RestfulAPITests {
	public String actual_capital;
	public int actual_status_Code;

	@Before
	void setUp() throws Exception {
		
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	void VerifyGetCapitalByValidNameInJsonResponse() throws JSONException {
		
		String name = BaseProperties.NAME_END_POINT + TestProperties.VALID_NAME;	
		
		actual_capital = CommonActions.getResponseByName(name);
		
		// Validate the response
		 Assert.assertEquals(actual_capital, TestProperties.EXPECTED_CAPITAL_SWEDEN);
				
	}
	
	
	@Test
	void VerifyGetCapitalByValidCode1InJsonResponse() throws JSONException {
		String code = BaseProperties.CODE_END_POINT + TestProperties.VALID_CODE_1;	
		
		actual_capital = CommonActions.getResponseByCode(code);
		
		// Validate the response
		 Assert.assertEquals(actual_capital, TestProperties.EXPECTED_CAPITAL_COL);
		
	}
	
	
	@Test
	void VerifyGetCapitalByValidCode2InJsonResponse() throws JSONException {
		String code = BaseProperties.CODE_END_POINT + TestProperties.VALID_CODE_2;	
		
		actual_capital = CommonActions.getResponseByCode(code);
		
		// Validate the response
		 Assert.assertEquals(actual_capital, TestProperties.EXPECTED_CAPITAL_COL);
		
	}
	
	
	// Negative Scenarios
	@Test
	void VerifyGetCapitalByEmptyNameInJsonResponse() throws JSONException {
		
		String name = BaseProperties.NAME_END_POINT + TestProperties.EMPTY_NAME;	
		
		actual_status_Code = CommonActions.getStatus(name);
		
		// Validate the response
		 Assert.assertEquals(actual_status_Code, TestProperties.EXPECTED_NOT_FOUND_CODE);
				
	}
	
	
	@Test
	void VerifyGetCapitalByNullNameInJsonResponse() throws JSONException {
		
		String name = BaseProperties.NAME_END_POINT + TestProperties.NULL_NAME;	
		
		actual_status_Code = CommonActions.getStatus(name);
		
		// Validate the response
		 Assert.assertEquals(actual_status_Code, TestProperties.EXPECTED_NOT_FOUND_CODE);
				
	}
	
	
	@Test
	void VerifyGetCapitalByInValidCode1InJsonResponse() throws JSONException {
		String code = BaseProperties.CODE_END_POINT + TestProperties.INVALID_CODE_1;	
		
		actual_status_Code = CommonActions.getStatus(code);
		
		// Validate the response
		 Assert.assertEquals(actual_status_Code, TestProperties.EXPECTED_BAD_REQ_CODE);
		
	}
	
	
	@Test
	void VerifyGetCapitalByInValidCode2InJsonResponse() throws JSONException {
		String code = BaseProperties.CODE_END_POINT + TestProperties.INVALID_CODE_2;	
		
		actual_status_Code = CommonActions.getStatus(code);
		
		// Validate the response
		 Assert.assertEquals(actual_status_Code, TestProperties.EXPECTED_BAD_REQ_CODE);
		
	}
	

}
