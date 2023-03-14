package Testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guruquestion {
	
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void method()
	{
		driver.get("https://demo.guru99.com/popup.php");
		String parentlink=driver.getWindowHandle();
	driver.findElement(By.xpath("/html/body/p/a")).click();
	Set<String> allwindowshandle=driver.getWindowHandles();
	for(String handle:allwindowshandle)
	{
		System.out.println(handle);
		if(!handle.equalsIgnoreCase(parentlink))
		{
			driver.switchTo().window(handle);
		}
	}
	WebElement s= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
			s.sendKeys("abc@gmail.com");
			WebElement button=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input"));
			button.click();
	System.out.println(s);
	driver.close();
	
	driver.switchTo().window(parentlink);
	

			
	
}

}
