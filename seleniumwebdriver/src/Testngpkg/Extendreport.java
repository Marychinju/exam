package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class Extendreport {
	WebDriver driver;
	ExtentHtmlReporter report;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void bftest()
	
	{
		report =new ExtentHtmlReporter("./Report/myreport1.html");
		report.config().setDocumentTitle("Automationreport");
		report.config().setReportName("functional test report");
		report.config().setTheme(Theme.DARK);
		extent.attachReporter(report);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("browser name", "chrome");
		
driver= new ChromeDriver();
	}
@BeforeTest
public void bfmethod()
{
	driver.get("https://www.facebook.com/");
}
@Test
public void fbtitleverification()
{
	test=extent.createTest("fbtitleverification");
	String Exp="facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(Exp,actual );
}

@Test
public void buttontest()
{
	test=extent.createTest("buttontest");
	String buttontest=driver.findElement(By.xpath("//*[@id=\"u_0_5_v4\"]")).getText();
	Assert.assertEquals(buttontest, "log in");
}
@AfterTest
public void aftest()
{
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "test case failed is"+result.getName());
		
	}
	else
	{
		if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		else
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, "test case passed is "+result.getName());
				
		}
	}
		
}
}
