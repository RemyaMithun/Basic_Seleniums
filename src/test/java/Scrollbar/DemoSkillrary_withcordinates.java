package Scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSkillrary_withcordinates {

	public static void main(String[] args) throws Throwable   {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
//address of career
		
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));

//get location method to fetch co-ordinates
		
		Point point = career.getLocation();
		int x=point.getX();
		int y=point.getY();
	
//down casting to java script executor interface		
		
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(5000);
	//career.click();
	js.executeScript("arguments[0].click();",career);
	
	
		
	}   

}
