package testngsessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGBasic {
	
	//global pre condition
	//pre condition
	//test steps + exp vs act --> assertion --> P/F (TestGH follow pre-defined sequence) (test methods are picked based on alphabetic order)
	//post steps
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- CpnnectWithDB");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- CreateUser");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}
	
	//4 7 10 -- But run before every test method
	@BeforeMethod
	public void longToApp() {
		System.out.println("BM -- longToApp");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google");
	}
	
	//5 (Alphabetic order)
	@Test
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("mackBook", "mackBook");
	}
	
	//8
	@Test
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000, 1000);
	}
	
	//6 9 12 - But run after every test method
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	//15
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS -- closeDBConnection");
	}
	
}
