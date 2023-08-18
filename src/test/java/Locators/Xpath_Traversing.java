package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Traversing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/Samsung-Storage-MediaTek-Octa-core-Processor/dp/B0BMGB3CH9/ref=sr_1_5?crid=173WI5ATXYK7O&keywords=mobile&qid=1690480881&sprefix=mobile%2Caps%2C237&sr=8-5");
	   WebElement value= driver.findElement(By.xpath("//span[contains(text(),'        Samsung Galaxy M04 Dark Blue, 4GB RAM, 64GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 Octa-core Processor | 5000 mAh Battery | 13MP Dual Camera       ')]/../../../..//span[@class='a-price-whole']"));
		
	    System.out.println(value);
	}

}
