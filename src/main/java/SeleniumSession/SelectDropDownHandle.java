package SeleniumSession;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {
	
	static WebDriver driver= new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		
		Thread.sleep(4000);
		
		By country=By.id("Form_getForm_Country");
		
		//WebElement country_ele = driver.findElement(country);
		
		//Select select=new Select(country_ele);
		//select.selectByIndex(5);
		//select.selectByVisibleText("India");
		//select.selectByValue("India");
		
		SelectDropDownByIndex(country, 5);
	}
	
	public static WebElement getElemnt(By locator) {
		return driver.findElement(locator);
	}
	
	public static void SelectDropDownByIndex(By locator, int index){
		
		if(index<0) {
			System.out.println("please pass the right (+ve) index");
			return;
		}
		
		Select select=new Select(getElemnt(locator));
		select.selectByIndex(index);
		
	}
}
