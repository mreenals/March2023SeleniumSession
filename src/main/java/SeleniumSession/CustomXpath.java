package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v111.input.Input;

public class CustomXpath {

	public static void main(String[] args) {
		
		//xpath: address of the element in HTM DOM
		//1. absolute xpath:/html/body/div/div[2]/ul/li[4]/a {/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[1]/i}
		//2. relative xpath/custom xpath: using attributes, using xpath functions
		
		//htmltag[@attr='value']
		//input[@id='input-firstname']
		
		//htmltag[@attr='value' and @attr2='value']
		//input[@name='email' and @placeholder='E-Mail Address']
		
		//input[@class='oxd-input oxd-input--active']
		
		//input[@class and @name] 1 of 2
		By.xpath("//input[@class='oxd-input oxd-input--active']");
		By.className("oxd-input--active");
		
		//contains() in xpath:
		//htmltag[contains(@attr,'value')]
		//input[contains(@class,'private-form__control')]
		
		//Dynamic attributes/ids:
		/* <input id=test_123>
		<input id=test_374>
		<input id=test_835> */
		
		//input[containst(@id,'test_')]
		
		//input[@type='email' and contains(@data-test-id,'email-input') and @id='username']
		
		//h1[text()='Register Account']
		
		//contains() with text()
		//htmltag[contains(text(),'value')]
		//i18n-string[contains(text(),'account')]
		
		//text() and attribute
		//htmltag[text()='value' and @attr='value']
		
		//text() with contains and attr with contains() and attr without contains:
		//htmltag[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']
		
		
		//index/position
		//(//input[@class='form-control'])[1] -- capture group
		// (//input[@class='form-control'])[5]
				
		// (//input[@class='form-control'])[position()=5]
		// (//input[@class='form-control'])[last()] -- go to last position
		//nevigate backward (//input[@class='form-control'])[last()-1]  -- second last 
		
		By.xpath("(//input[@class='form-control'])[1]");
		
		// Reach to sibling element
		// //label[text()='First Name']/following-sibling::div/input
		
		// Pseudo elements (like '*' superscript for mandatory field) 
		
				
		// (//div[@id='content']//ul[@class='list-unstyled'])[1]/li -- xpath for product meta data in opencart
		
		
	}

}
