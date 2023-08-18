package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over_Actions {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a= new Actions(driver);
		a.moveToElement(signin).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
