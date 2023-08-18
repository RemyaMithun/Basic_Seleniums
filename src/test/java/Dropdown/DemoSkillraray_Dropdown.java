package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSkillraray_Dropdown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
//fetching the address of drop down
    	WebElement opt = driver.findElement(By.id("cars"));
    	
//handling the dopdown by using index,value, visible text
    	
       Select s =new Select(opt);
       s.selectByIndex(1);
       Thread.sleep(3000);
       s.selectByValue("199");
       Thread.sleep(3000);
       
       //bug in the skillrary app so visible text not working
       
       //s.selectByVisibleText("INR 300 - INR 399");
     //  Thread.sleep(3000);
       
//de selecting options from the drop down   
       
       /* s.deselectByIndex(1);
       Thread.sleep(3000);
       s.deselectByValue("199");
       Thread.sleep(3000);*/
      // s.deselectByVisibleText("INR 300 - INR 399");
 
       //fetching the option in to console
       
       List<WebElement> value = s.getAllSelectedOptions();
       for(WebElement b:value) {
    	   System.out.println(b.getText());
       }
       
      Thread.sleep(3000);
      driver.close();
      
	
	}

	
}
