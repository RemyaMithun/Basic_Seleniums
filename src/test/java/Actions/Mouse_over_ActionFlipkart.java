package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over_ActionFlipkart {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[text()='Sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='_3pKU-e'])[6]")).click();
		//Thread.sleep(3000);
		driver.close();

	}

}
