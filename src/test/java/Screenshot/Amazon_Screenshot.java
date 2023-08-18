package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Screenshot {
	
	public static void main(String[] args) throws Throwable {

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");

//down casting	
		 
	   TakesScreenshot ts = (TakesScreenshot)driver;
		
//we access the method		
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		
//creating an object for physical file		
		
		File dest= new File("./ScreenShot/amazon.png");
		
//copy paste from Ram to required location		
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
