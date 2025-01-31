package com.qspiders.genericutility;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.qspiders.objectrepository.HomePage;
import com.qspiders.objectrepository.LoginPage;
import com.qspiders.objectrepository.WelcomePage;

public class Baseclass {

	public static ExtentReports extReport;
	public static WebDriver driver;
	public JavaUtility jUtil = new JavaUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public FileUtility fUtil = new FileUtility();

	@BeforeSuite
	public void configReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_reports/ExtentReport_" + jUtil.getSystemTime() + ".html");
		extReport = new ExtentReports();
		extReport.attachReporter(spark);
	}

	@org.testng.annotations.Parameters("Browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		wUtil.implicitwait(driver);
		driver.get(fUtil.getDataFromProperty("url"));
	}

	public static void setExtReport(ExtentReports extReport) {
		Baseclass.extReport = extReport;
	}

	public static void setDriver(WebDriver driver) {
		Baseclass.driver = driver;
	}

	public void setjUtil(JavaUtility jUtil) {
		this.jUtil = jUtil;
	}

	public void setwUtil(WebDriverUtility wUtil) {
		this.wUtil = wUtil;
	}

	public void setfUtil(FileUtility fUtil) {
		this.fUtil = fUtil;
	}

	@BeforeMethod
	public void login() {
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getloginButton().click();

	}

	@AfterMethod
	public void logout() {
		hp = new HomePage(driver);
		hp.getLogoutLink().click();
	}

	public static ExtentReports getExtReport() {
		return extReport;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public JavaUtility getjUtil() {
		return jUtil;
	}

	public WebDriverUtility getwUtil() {
		return wUtil;
	}

	public FileUtility getfUtil() {
		return fUtil;
	}

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBavckup() {
		extReport.flush();
	}

	public void ontestStart(ITestListener result) {
		// TODO Auto-generated method stub

	}
}
