package com.qspiders.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookLink;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerLink;

	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement ElectronicsLInk;

	@FindBy(xpath = "//a[text()='log out']")
	private WebElement LogOutButton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public void setBookLink(WebElement bookLink) {
		this.bookLink = bookLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public void setComputerLink(WebElement computerLink) {
		this.computerLink = computerLink;
	}

	public WebElement getElectronicsLInk() {
		return ElectronicsLInk;
	}

	public void setElectronicsLInk(WebElement electronicsLInk) {
		ElectronicsLInk = electronicsLInk;
	}

	public WebElement getLogOutButton() {
		return LogOutButton;
	}

	public void setLogOutButton(WebElement logOutButton) {
		LogOutButton = logOutButton;
	}
}
