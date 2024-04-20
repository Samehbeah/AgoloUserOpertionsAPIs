package APIs;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateUserInfo {

	public UpdateUserInfo() {

		super();
	}

	public int UpdateInfo(int id, String username ,String NewUserName ,String firstName, String lastName, String email, String password , String phone, int userStatus) {

		String requestBody = "{\r\n"
				+ "  \"id\": "+id+",\r\n"
				+ "  \"username\": \""+NewUserName+"\",\r\n"
				+ "  \"firstName\": \""+firstName+"\",\r\n"
				+ "  \"lastName\": \""+lastName+"\",\r\n"
				+ "  \"email\": \""+email+"\",\r\n"
				+ "  \"password\": \""+password+"\",\r\n"
				+ "  \"phone\": \""+phone+"\",\r\n"
				+ "  \"userStatus\": "+userStatus+"\r\n"
				+ "}";

		Response response = RestAssured.given()
				.header("Content-type", "application/json").header("accept", "application/json")
				.and()
				.body(requestBody)
				.when()
				.put("/"+ username)
				.then()
				.extract().response();
		System.out.println(response.asString());
		return response.statusCode(); 






	}

}
