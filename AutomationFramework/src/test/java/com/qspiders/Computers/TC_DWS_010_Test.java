package com.qspiders.Computers;

import static org.testng.Assert.assertEquals;

import java.lang.ProcessHandle.Info;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qspiders.genericutility.Baseclass;
import com.qspiders.objectrepository.HomePage;

public class TC_DWS_010_Test extends Baseclass {

	private static final String INFO = null;

	@Test
	public void clickOncomputers() {
		ExtentTest test=extReport.createTest("clickOnComputers");
		test.log(Status,INFO,"user logged in sucessfull");
		HomePage hp = new HomePage(driver);
		hp.getBookLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo web shop computers","computers page is not displayed");
	    test.log(pass, null)
	}

}
