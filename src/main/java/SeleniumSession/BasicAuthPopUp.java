package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {
		
		String username ="admin";
		String password ="admin";

		WebDriver driver = new ChromeDriver();
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		//basic auth??
		//combine username:password --> encoded string
		//btoa("username:password") ---> 'YWRtaW46YWRtaW4=

	}

}
