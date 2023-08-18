package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		//Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		driver.close();
		
		
		
		
	}

}
