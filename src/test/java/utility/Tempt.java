package utility;
	import java.awt.Desktop.Action;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Tempt
	{
		public static void main(String[]args) throws InterruptedException
		{
			//flipkart login
			
			System.setProperty("webdriver.chrome.driver","H:\\automation support\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			//Manage addresses
			//cancel initial login page
			driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
			//mouse over login
			Actions act=new Actions(driver);
			WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
			act.moveToElement(abc).build().perform();
			Thread.sleep(2000);
			//click on my profile
			driver.findElement(By.xpath("(//*[text()='My Profile'])")).click(); 
			Thread.sleep(2000);
			//enter username
			driver.findElementByXPath("//*[class='_2IX_2- VJZDxU']").sendKeys("9168313434");
			//enter password
			driver.findElementByXPath("//[@type='password']").sendKeys("abcd@1234");
			driver.findElementByXPath("//*[text()='Login'])[3]").click();
					
		}
	}


