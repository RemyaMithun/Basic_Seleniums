package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_locator {

	public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
      // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
       driver.findElement(By.name("field-keywords")).sendKeys("laptops");
       driver.findElement(By.id("nav-search-submit-button")).click();
       
       
       

	}

}
