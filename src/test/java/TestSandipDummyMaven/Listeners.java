package TestSandipDummyMaven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import TestSandipDummyMaven.Driver;
//import TestSandipDummyMaven.ExtentReporterNG;

public class Listeners extends Driver implements ITestListener 
{   
//	ExtentTest Test;
//	//method extent as object so that we can call extent from ExtentReporterNG class and ExtentReports getReportObject from method 
//	ExtentReports extent = ExtentReport.getReportObject();
	
	public void onTestStart(ITestResult result) 
	{
		
//		Test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
//		Test.log(Status.PASS, "Test Passed");
		
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("The name of the testcase failed is :"+result.getName());
//		Test.fail(result.getThrowable());
//		
//		WebDriver driver = null;
//		//Capture testcase which got failed
//		String MethodName = result.getMethod().getMethodName();
//		
//		//you need to add the below step when we want to capture the instance of driver called upon other main classes........
//		try {
//			
//			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (Exception e) {
//			
//			
//		}
//		
//		try {
//			//Capture Screenshot whenever test is failed
//			getScreenShotPath(MethodName, driver);
//			
//		} catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context) 
	{
		
	}

	public void onFinish(ITestContext context) 
	{
//		extent.flush();
	}

}
	