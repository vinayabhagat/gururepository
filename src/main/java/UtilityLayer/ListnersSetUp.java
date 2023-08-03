package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class ListnersSetUp extends BaseClass implements ITestListener {
	ExtentTest extenttest;
	ExtentReports extentreports;

	@Override
	public void onStart(ITestContext context) {
		extentreports = ExtendReportSetUp.setUp("Suite is Started" + context.getSuite().getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		extenttest = extentreports.createTest("Test is Started" + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, "Test case is Passed" + result.getMethod().getMethodName());
		try {
			extenttest.addScreenCaptureFromPath(
					ExtendReportSetUp.takesScreenshot("PassScreenshot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, "Test case is Failed" + result.getMethod().getMethodName());
		try {
			extenttest.addScreenCaptureFromPath(
					ExtendReportSetUp.takesScreenshot("FailScreenshot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, "Test case is Skipped" + result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite is Ended" + context.getSuite().getName());
		extentreports.flush();
	}

	// implement the ITestListner with ExtendReport

}
