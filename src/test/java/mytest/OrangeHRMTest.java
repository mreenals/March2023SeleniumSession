package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
	
	@Test
	public void adminFirstScreenTest() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

}
