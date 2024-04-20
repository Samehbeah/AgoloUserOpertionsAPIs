package APIs;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserData extends APIsBase {

	public GetUserData(){

		super();

	}


	public int fetchUserInfo(String userName) {


		 Response response = RestAssured.given()
		         .header("accept", "application/json").when().get("/" + userName ).then().extract().response();
		 
		 return response.statusCode();

	}	

}
