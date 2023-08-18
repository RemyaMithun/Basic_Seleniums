package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefox_tagnamelocator {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("remya");
		//fetch the all link available in the web page
		List <WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement alllinks:links)
		{
			System.out.println(alllinks.getText());
		}
		
	}

}
