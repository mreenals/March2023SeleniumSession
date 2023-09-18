package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	//if the dependendOnMethod of test failed then dependent test method skipped  
	
	public String login() {
		String loginTitle = "success";
		return loginTitle;
	}
	
	@Test
	public void loginTest() {
		Assert.assertEquals(login(), "success");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void appSearchTest() {
		System.out.println("searchTest");
	}
	
	@Test(dependsOnMethods = "appSearchTest")
	public void selectProductTest() {
		System.out.println("selectProductTest");
	}

}
