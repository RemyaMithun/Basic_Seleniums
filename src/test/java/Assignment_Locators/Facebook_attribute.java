package Assignment_Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_attribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		   WebElement page = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		//page.click();
		Point cordinate = page.getLocation();
		System.out.println("X and Y cordinates values are displayed");
		System.out.println(cordinate.getX());
		System.out.println(cordinate.getY());
		System.out.println("Attribute:"+page.getAttribute("href"));
		System.out.println("Tagname:"+page.getTagName());

	}

	
}
