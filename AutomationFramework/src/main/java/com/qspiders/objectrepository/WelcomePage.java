package com.qspiders.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LoginLink;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement RegisterLink;

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLoginLink(WebElement loginLink) {
		LoginLink = loginLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		RegisterLink = registerLink;
	}
}
