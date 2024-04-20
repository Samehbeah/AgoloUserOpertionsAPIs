package APIs;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class AddNewUser extends APIsBase {


	public AddNewUser(){

		super();

	}
	public int creatNewUser(String userName, String firstName, String lastName, String email, String password, String phone, String userStatus ) {

		String requestBody = "[\r\n"
				+ "  {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"username\": \""+userName+"\",\r\n"
				+ "    \"firstName\": \""+firstName+"\",\r\n"
				+ "    \"lastName\": \""+lastName+"\",\r\n"
				+ "    \"email\": \"" +email+"\",\r\n"
				+ "    \"password\": \""+password+"\",\r\n"
				+ "    \"phone\": \""+phone+"\",\r\n"
				+ "    \"userStatus\":"+ userStatus+"\r\n"
				+ "  }\r\n"
				+ "]";

		Response response = RestAssured.given()
				.header("Content-type", "application/json").header("accept", "application/json")
				.and()
				.body(requestBody)
				.when()
				.post("/createWithList")
				.then()
				.extract().response();

		return response.statusCode();




	}


}
