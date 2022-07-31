package org.pompagefactory;

import org.naresh.BaseUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	@FindBy (id = "username")
	private WebElement login_username;
	
	@FindBy (id = "password")
	private WebElement pwd;
	
	@FindBy (id = "re_password")
	private WebElement repwd;
	
	@FindBy (id = "full_name")
	private WebElement fname;
	
	@FindBy (id = "email_add")
	private WebElement mail;
	
	public WebElement getLogin_username() {
		return login_username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getrepwd() {
		return repwd;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getMail() {
		return mail;
	}

	public Register(){
		PageFactory.initElements(BaseUtils1.driver, this);
	}
}
