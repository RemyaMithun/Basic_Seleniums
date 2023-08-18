package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_popup {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://skillrary.com/");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()=' ENGRANAJES ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()=' Ensayo SkillRary'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child){
			driver.switchTo().window(b);
					
		}
		driver.findElement(By.id("mytext")).sendKeys("remya");
		Thread.sleep(4000);
		driver.switchTo().window(parent);	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
		//driver.close();
		
		

	}

}
