package APIs;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUserInfo {

	public DeleteUserInfo(){

		super();


	}


	public int DeleteInfo(String userName) {

		Response response = RestAssured.given()
				.header("accept", "application/json").when().delete("/" +userName).then().extract().response();	
	
		System.out.println(response.asString());
		return response.statusCode();


	}

}
