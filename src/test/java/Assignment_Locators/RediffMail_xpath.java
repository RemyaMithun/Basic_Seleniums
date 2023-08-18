package Assignment_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffMail_xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("remya");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("wwwdd");
        driver.findElement(By.xpath("//u[contains(text(),'Forgot Password?')]")).click();
	}

}
