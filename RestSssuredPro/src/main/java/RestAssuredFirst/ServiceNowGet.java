package RestAssuredFirst;

import com.github.fge.jsonschema.main.cli.Main;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ServiceNowGet {
	public static void main(String[] args) {
		// baseURI
		RestAssured.baseURI = "https://dev222561.service-now.com/api/now/table/incident";

		// authenticate
		RestAssured.authentication = RestAssured.basic("admin", "Muruga@3109");

		// Request declare(Create statement)
		RequestSpecification requestSpec = RestAssured.given();
	
		//RequestSpecification requestSpec=((Object) RestAssured.given()).parameters("number", "INC0007310", "short_description", "Created by RestAssured").when().post();
		
		//.then().body("result.n", equalTo("John"));
		Response responseSpec=requestSpec.given().queryParam("Content-Type", "application/json").post();

		// Actual request and reponse create and stored
	//	ResponseBody response=requestSpec.request("POST");

		// reponse print
		responseSpec.prettyPrint();

	}
}
