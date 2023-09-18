package SeleniumSession;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		//EplicitWait:
			//1. WebDriverWait
			//2. FluentWait
		
		//WebDriverWait(c) --> FluentWait(C) --> Wait(I): until();
		//inherit from FW 	//until(){}
		//No individual methods 	//+other methods 
		
		//exp wait:
		//not a global wait
		//will be applied  for specific element
		//username - 10 --> 5 = 5
		//pwd
		//login
		//can be applied for non web elements: url, titles, alerts
		//expectedcontions --> various conditions

	}

}
