package SeleniumSession;

import org.openqa.selenium.By;

public class CustomCssSelectorConcept {

	public static void main(String[] args) {
		
		//id --> #id
		//tag#id
		//#input-email
		// input#input-email
		
		//class --> .class
		//tag.class
		//input.form-control
		//input.form-control.private-form__control.login-email
		
		By.cssSelector("input.form-control");
		
		//c1 c2 c3 ....cn
		//.c1.c2.c3..cn
		//.form-control.privated-form__control-login-email
		//tag.c1.c2.c3
		
		//#username.login-email
		//.login-email#username
		//input#username.form-control.private-form__control
		//input.login-email#username.form-control.private-form__control
		
		//other attr:
		//tagname[attr='value']
		//input[type='email']
		//input[placeholder='E-Mail Address']
		
		//more than 1 attr:
		//tagname[attr1='value'][attr2='value'][attr3='value']
		
		//input[type='text'][name='email'][placeholder]
		//[id] -- css
		// //*[@id] -- xpath
		//text in css: Not available
		
		//CSS3
		
		//contains in css:
		//tag[attr*='value']
		// input[placeholder*='Address'] -- css
		// //input[contains(@class,'Address')] -- xpath
		
		//starts with in css:
		// tagname[attr^='value']
		// input[placeholder^='E-Mail'] - css 
		// //input[starts-with(@placeholder,'E-Mail')] -- xpath
		
		//endwith in css:
		//tag[attr$='value']
		// input[placeholder$='Address']
		// //input[ends-with(@placeholder,'Address')] -- not available for xpath
		// input[][][]
		
		//parent to child:
		// select#From
		
		//label[for='input-email'] + input -- immediate following sibling
		//label[for='input-email'] ~ input -- all following sibling
		
		//select#From_getFrom_Country option:first-child
		//select#From_getFrom_Country option:last-child
		//select#From_getFrom_Country option:nth-child(5)
		//select#From_getFrom_Country option:nth-last-child(2) -- second last child
		//select#From_getFrom_Country option:nth-child(odd) -- traverse to odd number places
		//select#From_getFrom_Country option:nth-child(even) -- traverse to even number places
		//select#From_getFrom_Country option:nth-child(n+3) -- start after 3rd element
		//select#From_getFrom_Country option:nth-child(4n) -- traversing from 4th element then 8th then 12th and so on
		
		//not in css
		//input.form-control:not([id='input-email'])
		
		//comma in css
		//input#username,button#loginBtn,input#remember
		
		// div#content ul.list-unstyled li -- css selector for product meta data in opencart 

	}

}
