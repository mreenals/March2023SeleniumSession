package mytest;


import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	@Test
	public void openCartTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}

}
