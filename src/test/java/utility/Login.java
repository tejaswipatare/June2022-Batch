package utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login 
{
	
	@Given ("^User provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
	public void bLaunch(String name,String location)
	{
		Object[] input=new Object[2];
        input[0]="name" ;
        input[1]="location";
        SeleniumOperations.browserLaunch(input);
		}
	@Given ("^User enter url as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		   input1[0]=url;
		 SeleniumOperations.openApplication(input1);     
	}
	@Given ("^User cancel initial window$")
	public void openApp()
	{
		 Object[] input2=new Object[1];
 		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
 		SeleniumOperations.clickOnElement(input2);     
	}

	@When ("^user navigate on Login tab$")
	public void clickone()
	{
		 Object[] input3=new Object[1];
         input3[0]="//*[@class='_1_3w1N']";
         SeleniumOperations.mouseOverAction(input3);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
