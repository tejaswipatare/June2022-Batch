package utility;

public class Calling 
{   public static void main(String[] args) throws InterruptedException 
{
	  
	  //browserLaunch
	  Object[] input=new Object[2];
	           input[0]="chrome" ;
	           input[1]="H:\\automation support\\chromedriver.exe";
	           SeleniumOperations.browserLaunch(input);

	  //openApplication
	  Object[] input1=new Object[1];
      		   input1[0]="https://www.flipkart.com";
      		 SeleniumOperations.openApplication(input1);     
            
  
       //clickOnElement
       Object[] input2=new Object[1];
       		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
       		SeleniumOperations.clickOnElement(input2);     
 
   //mouseOverOnElement
	  Object[] input3=new Object[1];
               input3[0]="//*[@class='_1_3w1N']";
               SeleniumOperations.mouseOverAction(input3);
	
     //clickOnMyProfile
       Object[] input4=new Object[1];
             input4[0]="(//*[@class='_2NOVgj'])[1]";
             SeleniumOperations.clickOnElement(input4);  
             Thread.sleep(3000);
 
   //enterUsername      
	  Object[] input5=new Object[2];
	           input5[0]="//*[@class='_2IX_2- VJZDxU']";
	           input5[1]="asaraj.mhase@gmail.com";
	           SeleniumOperations.sendText(input5);
	  
	  //enterPassword
       Object[] input6=new Object[2];
       	     input6[0]="//*[@type='password']";
       	     input6[1]="Teju@1989";
       	  SeleniumOperations.sendText(input6);  
       	           
      //clickOnLoginButton
        Object[] input7=new Object[1];
              input7[0]="(//*[text()='Login'])[3]";
              SeleniumOperations.clickOnElement(input7);         	           
	  
}


}
          
	
	
	

