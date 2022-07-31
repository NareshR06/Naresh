package org.aiite;

import org.naresh.BaseUtils1;
import org.pompagefactory.Login;
import org.pompagefactory.Register;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest1 extends BaseUtils1{
	
	Login login;
	Register regi;
	
	@Given("Addatin homepage loaded successfully")
	public void addatin_homepage_loaded_successfully() {
		browserLaunch("chrome");
	    getUrl("https://adactinhotelapp.com/");
	}

	@Given("click on the new user registration link")
	public void click_on_the_new_user_registration_link() {
	   login = new Login();
	   clickButton(login.getRegi());
	}

	@When("input username with {string}")
	public void input_username_with(String string) {
	    regi = new Register();
	    inputText(regi.getLogin_username(), string);
	}

	@When("input password with {string}")
	public void input_password_with(String string) {
		 inputText(regi.getPwd(), string);
	}

	@When("input confimpassword with {string}")
	public void input_confimpassword_with(String string) {
		 inputText(regi.getrepwd(), string);
	}

	@When("input fullname with {string}")
	public void input_fullname_with(String string) {
		 inputText(regi.getFname(), string);
	}

	@When("input emailid with {string}")
	public void input_emailid_with(String string) {
		 inputText(regi.getMail(), string);
	}

	@Then("confirm user has been registered successfully")
	public void confirm_user_has_been_registered_successfully() {
	   System.out.println("User registered sucessfully");
	}

	@Then("confirm user")
	public void confirm_user() {
	   System.out.println("User Confirmed");
	}
	
}
