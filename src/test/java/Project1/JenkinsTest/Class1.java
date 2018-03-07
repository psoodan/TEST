package Project1.JenkinsTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Class1 {

	WebDriver driver;
	
	@Test
	
	public void Ajio() throws IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.ajio.com/");
	}
	
}