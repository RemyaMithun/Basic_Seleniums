package Assignment_Locators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertyfile_facebookdatadriven {

	public static void main(String[] args) throws Throwable {
		
    Properties p = new Properties();
    FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
    p.load(fis);
   String Url = p.getProperty("url1");
  String name = p.getProperty("username");
  String pswd = p.getProperty("password");
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get(Url);
   Thread.sleep(3000);
   driver.findElement(By.id("email")).sendKeys(name );
   Thread.sleep(3000);
   driver.findElement(By.name("pass")).sendKeys(pswd);
   Thread.sleep(3000);
   driver.close();
    
    
	}

}
