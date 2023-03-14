package seleniumpkg;

import org.junit.Before;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asdf");
		driver.findElement(By.name("login")).click();
	}
	
   
}
