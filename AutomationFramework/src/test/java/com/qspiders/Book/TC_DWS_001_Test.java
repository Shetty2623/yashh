package com.qspiders.Book;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;
import com.qspiders.genericutility.Baseclass;
import com.qspiders.objectrepository.HomePage;

public class TC_DWS_001_Test extends Baseclass {

	@Test
	public void clickonBooks() throws IOException {
		ExtentTest test = extReport.createTest("clickOnbooks");
		HomePage hp = new HomePage(driver);
		hp.getBookLink().click();
		org.testng.Assert.assertEquals(driver.getTitle(), "Demo web shop", "Books Page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}
}
