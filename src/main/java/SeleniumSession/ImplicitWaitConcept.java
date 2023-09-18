package SeleniumSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x -- applicable for all elements by default -- sometime it cause performance issue
		//in case of implicit wait it put extra burden on driver to check implicit wait all the time although element is available so it cause performance issue
		//implicit wait: global wait:
		//applicable for all elements
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.name("username")).sendKeys("admin"); //10
		//e2 -- 10
		//e3 -- 10
		//e4 -- 10
		//e100 -- 10
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //sel 4.x -- overriding wait
		//homepage: 20
		//he1 -- 20
		//he2 --20
		//logout
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x -- overriding wait again
		//login page: 10 secs
		//e2 -- 10
		//e3 -- 10
		//e4 -- 10
		
		//reg page: 0 ecs: nullififcation of implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //sel 4.x -- overriding wait again
		
		// what can't be done
		//username - 10
		//pwd -- 5
		//submit -- 2
		// cant be used for title, url and alerts

	}

}
