package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title,'Vehicle-Registration-Forms-and-Examples']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Mreenal");
		
		driver.switchTo().defaultContent();
		
		String info = driver.findElement(By.xpath("")).getText();
		System.out.println(info);

	}

}
