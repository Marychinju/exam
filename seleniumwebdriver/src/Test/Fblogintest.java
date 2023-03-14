package Test;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fbloginpage;
import Page.Fbpassworderrorpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
	}
	@BeforeMethod
	public void bfmethod()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc96");
		ob.loginbutton();
		
	}
	@Test
	public void test2()
	{
		Fbpassworderrorpage ob= new Fbpassworderrorpage(driver);
		ob.linkclick();
		ob.setvalues("12345678");
		ob.searchclick();
	}

}
