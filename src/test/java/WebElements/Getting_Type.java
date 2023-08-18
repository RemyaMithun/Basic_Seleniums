package WebElements;

import org.openqa.selenium.Point; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_Type {

	public static void main(String[] args) {
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		Point coordinate= email.getLocation();
		System.out.println("X and Y coordinates of email textfield are displayed");
		System.out.println(coordinate.getX());
		System.out.println(coordinate.getY());
	Dimension size=email.getSize();
	System.out.println("height and width of email text field are displayed");
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	
	
		
	}

}
