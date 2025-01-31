package com.qspiders.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "Email")
	private WebElement EmailTextfield;

	@FindBy(id = "Password")
	private WebElement PasswordTextfield;// encapsulation

	@FindBy(id = "//input[@value='Log in']")
	private WebElement LoginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);// ctl and space
	}

	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
