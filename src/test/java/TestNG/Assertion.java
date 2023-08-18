package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
    
	WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
	@Test
	 public void login() {
	
		driver.findElement(By.id("email"));
		driver.findElement(By.name("pass"));
		String title = driver.getTitle();
		//Hard assert
		//Assert.assertEquals(title ,"hjkkl");
		// soft assert
		SoftAssert s=new SoftAssert();
		s.assertEquals(title ,"hjkkl");
		
		
	}
	@Test
	public void close() {
		 driver.close();
	}
	
	
	
}
