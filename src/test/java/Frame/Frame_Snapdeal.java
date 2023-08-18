package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Snapdeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(sign).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		//handling the frame through the index
		//driver.switchTo().frame(0);
		
		//handling the frame id
		driver.switchTo().frame("loginIframe");
		
		//handling the frame with name
		 
		//driver.switchTo().frame("iframeLogin");
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("remya");
		driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']")).click();
		
		// shifting our control to normal web page
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
