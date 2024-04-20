package APIs;

import io.restassured.RestAssured;

public class APIsBase {
	
	APIsBase(){
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2/user";
		
	}
	

}
