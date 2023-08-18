package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Getting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute:" +mobile.getAttribute("tabindex"));
		System.out.println("X and Y cordinates are displayed");
	    Point cordinate = mobile.getLocation();
	    System.out.println(cordinate.getX());
	    System.out.println(cordinate.getY());
	    System.out.println("height and width are displayed");
	    Dimension size = mobile.getSize();
	    System.out.println(size.getHeight());
	    System.out.println(size.getWidth());
	    System.out.println("Tagname:"+ mobile.getTagName());
	    
		
		

	}

}
