package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		
// address of dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
//handling the drop down
		
		Select s=new Select(dropdown);
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(3000);
		s.selectByVisibleText("Car & Motorbike");
		Thread.sleep(3000);
// displaying the drop down is single or multiple: if it is single print false, or it is multiple print true
		System.out.println(s.isMultiple());
		
//fetching the option in to console
		 List<WebElement> value = s.getOptions();

//display the no of options present in the dropdown
		System.out.println(value.size());
		for(WebElement b: value) {
			System.out.println(b.getText());
			
		}
			
	driver.close();
	}
		
		
		
	}


