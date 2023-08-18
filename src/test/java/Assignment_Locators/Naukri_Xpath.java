package Assignment_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri_Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("ash");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Password')]")).sendKeys("ammu");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.tagName("//small[contains(text(),'Forgot Password?')]")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.xpath("//button[@type='submit'][1]")).submit();
		driver.findElement(By.xpath("//small[text()='Forgot Password?']")).click();
		
				}

}
