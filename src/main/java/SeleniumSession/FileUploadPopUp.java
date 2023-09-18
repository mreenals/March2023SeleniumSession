package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type file (hack for file type only) 
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Mreenal Singh\\OneDrive\\Documents\\RAV\\CourseRequest\\CourseContent.jpg");
		
		
		//what id type=file is not available?
		//1. ask your dev team to add this attribute.
		//2. Robot class -- not recommended -- only work for Windows. won't work for Linux, mac, docker, cloud, jenkins, headless, grid
		//3. autoIt -- not recommended -- only work for Windows. won't work for Linux, mac, docker, cloud, jenkins, headless, grid
		//4. sikuli -- not recommended -- because it is image based
		
		//Advisement pop ups -- QA/STAGE/DEV/UAT -- no adv pop ups
		//only for PROD
		//no need to use switch to alert
		//random pop up -- should we automate this? -- never automate
		
		//browser window popup

	}

}
