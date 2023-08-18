package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("remya");
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("xxxx");
	    driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
	    
	}

}
