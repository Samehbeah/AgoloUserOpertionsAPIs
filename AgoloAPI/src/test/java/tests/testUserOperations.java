package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import APIs.AddNewUser;
import APIs.DeleteUserInfo;
import APIs.GetUserData;
import APIs.UpdateUserInfo;

public class testUserOperations {


	String userName = "test1";

	@Test(priority = 1)
	public void addNewUser() {

		int statusCode    = new AddNewUser().creatNewUser(userName, "test1", "test1", "test1@gmail.com", "test1", "0101010100", "0");

		Assert.assertEquals(statusCode, 200);


	}

	@Test(priority = 2)
	public void getUser() {
		int statusCode= new GetUserData().fetchUserInfo(userName);
		Assert.assertEquals(statusCode, 200);

	}
	@Test(priority = 3)
	public void UpdateUser() {

		int statusCode = new UpdateUserInfo().UpdateInfo(0,userName,"testtest", "test1", "test1", "test1@gmail.com", "test1", "0101010100", 0);
		Assert.assertEquals(statusCode, 200);	 

	}

	@Test(priority = 4)
	public void deleteUser() {

		int statusCode =  new DeleteUserInfo().DeleteInfo(userName);
		Assert.assertEquals(statusCode, 200);	

	}

}
