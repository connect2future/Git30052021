package TestSandipDummyMaven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class ExtentReport extends Driver
{
	public WebDriver driver;
	
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir"+"\\reports\\index.html");
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent= new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sandip Datta");
		return extent;
	}
	@Test
	public void invokebrowser() throws IOException 
	{
		
		driver = initiatedriver();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Practice Page page page");
		driver.close();
		System.out.println("Pushed now 1");
		
		
		
	}
	
}


