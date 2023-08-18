package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_loginpage {

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTf;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTf;
	
	@FindBy (xpath = "//button[@type='submit']")
	private  WebElement loginBtn;
	
	//initialization
	 
 public Fb_loginpage (WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }

//getter and setter method
 
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

public void emailTextField(String data) {
	emailTf.sendKeys(data);
}
 
public void passwordTextField(String data) {
	passwordTf.sendKeys(data);
}

public void loginbutton() {
	loginBtn.click();
}
	
	
	
}
