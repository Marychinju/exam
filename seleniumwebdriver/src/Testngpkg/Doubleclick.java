package Testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleclick {
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
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			}
			@Test
			public void test1()
			{
				WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
					Actions act=new Actions(driver);
			act.contextClick(rightclick);
			WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
			edit.click();
			Alert a = driver.switchTo().alert();
			String alerttext=a.getText();
			a.accept();
			act.perform();
			}
			@Test
			public void test2()
			{
			WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			Actions act1=new Actions(driver);
			act1.doubleClick(doubleclick);
			act1.perform();
			
			}
}
