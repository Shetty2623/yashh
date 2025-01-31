package com.qspiders.genericutility;

import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class ListenerUtility extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getName();
		test = extReport.createTest(methodName);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName() + "is failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64string(screenshot);

		try {
			wUtil.getPhoto(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}