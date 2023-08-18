package PomUsage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.Fb_loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//creating an object for pom class
		Fb_loginpage fblogin =new Fb_loginpage(driver);
		fblogin.emailTextField("remya");
		fblogin.passwordTextField("remya****123");
		fblogin.loginbutton();
		
		
		
		
	}

}
