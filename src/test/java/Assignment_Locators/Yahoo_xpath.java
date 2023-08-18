package Assignment_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo_xpath {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/");
	driver.findElement(By.xpath("//input[contains(@class,'phone-no ')]")).sendKeys("maya");
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'recaptcha-checkbox-borderAnimation')]")).submit()
;
	}

}
