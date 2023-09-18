package mytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	//AAA rule: Arrange-Act-Assert - 1 test - 1 Assert

	@Test(priority = 1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority = 2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	@Test(priority = 3)
	public void googleSearchTest() {
		driver.findElement(By.id("W0wltc")).click();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		Assert.assertTrue(wait.until(ExpectedConditions.titleContains("Selenium")));
	}
}
