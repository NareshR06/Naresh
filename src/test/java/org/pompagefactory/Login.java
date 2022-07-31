package org.pompagefactory;

import org.naresh.BaseUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (id = "username")
	private WebElement login_username;
		
	@FindBy (id = "password")
	private WebElement pwd;
	
	@FindBy (linkText = "Forgot Password?")
	private WebElement fpwd;
	
	@FindBy (id = "login")
	private WebElement loginbtn;
	
	@FindBy (linkText = "New User Register Here")
	private WebElement regi;
	
	public Login(){
		PageFactory.initElements(BaseUtils1.driver, this);
	}

	public WebElement getLogin_username() {
		return login_username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getFpwd() {
		return fpwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getRegi() {
		return regi;
	}
}
