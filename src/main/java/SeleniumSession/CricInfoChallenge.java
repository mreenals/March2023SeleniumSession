package SeleniumSession;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import customexception.FrameWorkException;

public class CricInfoChallenge {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com");
		
		
		String popUpXpath= "//*[text()='I Accept']";
		String liveScoreEleLev1Xpath= "//*[text()='Live Scores']";
		String scoreMenuLev2Xpath= "//*[contains(@href,'www.espncricinfo.com') and contains(@class,'hover:ds-bg-ui-fill-hover')]/span";
		String playingTeamXpath= "//*[text()='Live']/ancestor::div/following-sibling::p";
		
		Thread.sleep(2000);
		
	
		try {
			getElement(getByLocator(popUpXpath)).click();
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new FrameWorkException("NOPOPUOFOUND");
		}
		
		Actions act= new Actions(driver);
		act.moveToElement(getElement(getByLocator(liveScoreEleLev1Xpath))).perform();
		
		List<WebElement> menuLevel2 = driver.findElements(getByLocator(scoreMenuLev2Xpath));
		
		for (WebElement menuOption : menuLevel2) {
			if(menuOption.getText().equals("Live Scores Home")) {
				Thread.sleep(1500);
				menuOption.click();
				Thread.sleep(1500);
				List<WebElement> playingTeams = driver.findElements(getByLocator(playingTeamXpath));
				
				for (WebElement teamVs : playingTeams) {
					System.out.println(teamVs.getAttribute("Title"));
				}
				break;
			}
		}
		
	}
	
	public static By getByLocator(String xpath) {
		return By.xpath(xpath);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
