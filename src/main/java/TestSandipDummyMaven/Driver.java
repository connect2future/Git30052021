package TestSandipDummyMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	//Define driver globally so that we don't need to specify driver every time
	public WebDriver driver;
	
	//Initialize prop in public so that we can access properties in other child classes as well
	public Properties prop;
	
	//Initiation of common drivers
	public WebDriver initiatedriver() throws IOException {
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\MavenProject\\src\\main\\java\\TestSandipDummyMaven\\datademo.properties");
	
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\LatestDriverChrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\Downloads\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot take = (TakesScreenshot) driver ;
		File source = take.getScreenshotAs(OutputType.FILE);
		String DestinationFile = System.getProperty("C:\\Users\\Hp\\eclipse-workspace\\MavenProject\\reports\\"+testCaseName+".png");
		FileUtils.copyFile(source, new File(DestinationFile));
		return DestinationFile;
	}
}


