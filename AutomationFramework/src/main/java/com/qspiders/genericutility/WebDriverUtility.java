package com.qspiders.genericutility;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.logging.FileHandler;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;
import javax.xml.transform.Source;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;

import lombok.Value;

/**
 * @author Chetan
 */
public class WebDriverUtility {
	/**
	 * this method will perform mouse hover action
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();

	}

	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	public void selectbyIndex(WebElement dropdown, int index) {
		Select sel = new Select(dropdown);
		sel.selectByIndex(index);
	}

	public void selectByvalue(WebElement dropdown, String value) {
		Select sel = new Select(dropdown);
		sel.selectByValue(value);

	}

	public void selectByVisibleText(WebElement element, String visibletext) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibletext);
	}

	public void switchToFrameindex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	public void switchToFrame(WebDriver driver, WebElement framele) {
		driver.switchTo().frame(framele);
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertAndCancle(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public Timeouts implicitwait(WebDriver driver) {
		return driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public WebDriverWait explicitWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait;
	}

	public void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allwindowid = driver.getWindowHandles();
		for (String id : allwindowid) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(expUrl)) {
				break;
			}
		}

	}
	public void takeScreenshot(WebDriver driver) throws IOException {
		JavaUtility jutil = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/" + jutil.getSystemTime() + ".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}

	public void getPhoto(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
}
