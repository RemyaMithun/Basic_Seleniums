package WebElements;

import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_actiontype {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches");
		WebElement value= driver.findElement(By.xpath("//input[@type='submit']"));
		value.submit();
		WebElement text= driver.findElement(By.xpath("//input[@type='submit']"));
	Point cordinate=text.getLocation();
	System.out.println(cordinate.getX());
	System.out.println(cordinate.getY());
   Dimension size=text.getSize();
   System.out.println(size.getHeight());
   System.out.println(size.getWidth());

	
		
	}

}
