package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//using xpath by attribute
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("remya");
		//using xpath by contains
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("rhjjk");
		//using xpath by contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		

	}

}
