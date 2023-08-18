package PomUsage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.Naukri_loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri_login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
		
		// create an object for pom class
		
		Naukri_loginpage naukrilogin= new Naukri_loginpage(driver);
		naukrilogin.emailtextfield("aaby");
		naukrilogin.passwordtextfield("aajk");
		naukrilogin.loginbutton();
		
		

	}

}
