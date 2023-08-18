package Pom;

import java.lang.reflect.Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Naukri_loginpage {

	//declaration
	
	@FindBy(xpath = "//input[@id='usernameField']")
	private WebElement emailTf;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTf;
	
	@FindBy (xpath = "//button[@type='submit'][1]")
	private WebElement loginBtn;
	
	//initialization
	
	public Naukri_loginpage (WebDriver driver) {
		
	PageFactory.initElements(driver,this);	
	
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	//utilisation
	
	public void emailtextfield(String data) {
		emailTf.sendKeys(data);
	}
	
	public void passwordtextfield (String data) {
		
		passwordTf.sendKeys(data);
		
	}
	
	public void loginbutton() {
		loginBtn.click();
	}
	
	
	
}
