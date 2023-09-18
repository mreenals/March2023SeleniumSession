package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

//test case should be independent to each other

public class CRUDTest {
	
	public int addUser() {
		System.out.println("adding a user");
		int userId = 123;
		return userId;
	}
	
	@Test
	public void addUserTest() {
		int userId=addUser();
		Assert.assertEquals(userId,  123);
	}
	
	@Test
	public void getUserTest() {
		int userId = addUser();
		System.out.println("get the user for user id: " + userId);
	}
	
	@Test
	public void updateUserTest(){
		int userId = addUser();
		System.out.println("Update the user for user id: " + userId);
	}

}
