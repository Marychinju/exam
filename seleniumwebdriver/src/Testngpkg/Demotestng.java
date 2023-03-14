package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demotestng {
	ChromeDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setup()
	{
	driver=new ChromeDriver();	
	
	}
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}
	@Test(priority=1,invocationCount=1)
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\'input\']")).sendKeys("mobiles",Keys.ENTER);
	}
	@Test(groups={"smoke","sanity"})
	public void test2()
	{
		driver.findElement(By.xpath("//*[@id=\'hdtb-msb\']/div[1]/div/div[2]/a")).click();
	}
	@AfterMethod
	public void methodclose()
	{
	driver.navigate().back();
	
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
}
