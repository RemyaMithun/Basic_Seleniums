package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_locators {

	public static void main(String[] args) throws Throwable {
  //manages the driver
		
		 WebDriverManager.chromedriver().setup();
		 
	//upcasting	
		 
	      WebDriver driver=new ChromeDriver();
	 //maximize the window      
	       driver.manage().window().maximize();
	   //enter the URL
	       driver.get("https://www.facebook.com");
	   //fetching the address of email text field
			driver.findElement(By.id("email")).sendKeys("remya");
			Thread.sleep(5000);
	   //fetching the address of password text field
			driver.findElement(By.name("pass")).sendKeys("password");
			Thread.sleep(5000);
		//address of link by using linktext method	
			//driver.findElement(By.linkText("Forgotten password?")).click();
		// address of the link by using partial link text	
			driver.findElement(By.partialLinkText("Forgotten")).click();
			Thread.sleep(5000);
			driver.close();
			
			
	}

}
