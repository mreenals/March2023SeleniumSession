package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGSearchIcon {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
		 Thread.sleep(4000);
		 
		 //driver.findElement(By.name("q"));
		 
		 //driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']"));
		 
		 driver.findElement(By.xpath("//*[@name='q' and @title=\"Search for Products, Brands and More\"]")).sendKeys("MacBook Pro");
		 
		 Actions act=new Actions(driver);
		 
		 act.moveToElement(driver.findElement(By.xpath("//*[local-name()='svg']/*[name()='path' and @d='M16 16L21 21']")))
		 	.click()
		 		.build().perform();
		 		 
	}

}
