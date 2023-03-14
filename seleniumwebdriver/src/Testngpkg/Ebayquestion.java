package Testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebayquestion {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		{
			driver= new ChromeDriver();	
			}
	}
			@BeforeMethod
			public void method()
			{
				driver.get("https://www.ebay.com/");
			}
			@Test
			public void test1()
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
				Actions a=new Actions(driver);
				WebElement samsung=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"));
				a.moveToElement(samsung);
				
				samsung.click();
				a.perform();
						
			}

}
