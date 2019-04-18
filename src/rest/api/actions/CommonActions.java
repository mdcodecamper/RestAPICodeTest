package rest.api.actions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.api.props.BaseProperties;
public class CommonActions {

		public String capital;
		public int statusCode;
		public static RequestSpecification httpRequest;
		
		
		public static int getStatus(String q) {
			RestAssured.baseURI = BaseProperties.URI;
			httpRequest = RestAssured.given();			
			Response response = httpRequest.request(Method.GET, q);	
			
			int statusCode = response.getStatusCode();
			
			return statusCode;
		}
		
		
	
		public static String getResponseByName(String name) throws JSONException {
			String capital="";
			RestAssured.baseURI = BaseProperties.URI;
			httpRequest = RestAssured.given();
			
			Response response = httpRequest.request(Method.GET, name);	
			
			if(response.getStatusCode() == 200) {
				JSONArray jsonResponse = new JSONArray(response.asString());			
				capital = jsonResponse.getJSONObject(0).getString("capital");
				
			}else {
				
				System.out.println("Server Not Responding... ");
				System.out.println("Status Code:  " + response.getStatusCode());			
			}			 
			 
			return capital;
		}
		
		
		
		public static String getResponseByCode(String code) throws JSONException {
			String capital="";	
			RestAssured.baseURI = BaseProperties.URI;
			httpRequest = RestAssured.given();
			
			Response response = httpRequest.request(Method.GET, code);		
			
			if(response.getStatusCode() == 200) {
				JSONObject jobj = new JSONObject(response.asString());
				capital = jobj.getString("capital");			
				
			}else {
				System.out.println("Server Not Responding... ");
				System.out.println("Status Code:  " + response.getStatusCode());
				
			}			 
			 
			return capital;
		}
}
