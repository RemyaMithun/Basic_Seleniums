package Autosuggetion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("phone");
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		System.out.println(list.size());
		for(WebElement b: list) {
			System.out.println(b.getText());
			
		}
		
	}

}
