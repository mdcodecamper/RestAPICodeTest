package rest.api.props;

public interface TestProperties {
	public String VALID_NAME = "Sweden";
	public String VALID_CODE_1 = "COL";
	public String VALID_CODE_2 = "CO";
	
	public String INVALID_NAME = "Swed";
	public String NULL_NAME = null;
	public String EMPTY_NAME = "";	
	
	public String INVALID_CODE_1 = "C";
	public String INVALID_CODE_2 = "Cols";
	public String NULL_CODE = null;
	public String EMPTY_CODE = "";
	
	
	
	public String EXPECTED_CAPITAL_SWEDEN = "Stockholm";
	public String EXPECTED_CAPITAL_COL = "Bogotá";
	public int EXPECTED_NOT_FOUND_CODE = 404;
	public int EXPECTED_BAD_REQ_CODE = 400;
	
	
	
	
	
	
}
