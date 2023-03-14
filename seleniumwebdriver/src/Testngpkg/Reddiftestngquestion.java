package Testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reddiftestngquestion {
	WebDriver driver;
	@BeforeTest
	public void setup()
	
	{
	driver= new ChromeDriver();	
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		WebElement i=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		if(i.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	
		@Test
		public void test2()
		{
			String Text = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));

			if(Text.getAttribute(Text).contains("Check availabile")){

			System.out.println("Found it");

			}
			else
			{

			System.out.println("Not found");

		}
		}
		@Test
		public void test3()		
		{
		WebElement checkbox=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		
		boolean b =checkbox.isSelected();
		if(b)
		{
			System.out.println("is selected");
		}
		else {
			System.out.println("not selected");
			
		}
					
		}	
		@Test
		public void test4()
		{
			WebElement count=driver.findElement(By.xpath("//*[@id=\"country\"]"));
			Select s=new Select(count);
			
			List<WebElement> l=s.getOptions();
			if(l.size()==50)
			{
				System.out.println("count of countries is 50");
				
			}else if(l.size()>=50)
			{
				System.out.println("count of countries i more than 50");
			}else
			{
			
			System.out.println("count of countires="+(l.size()));
					
		}
	}
		
		@Test
		public void test5()
		{
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("maya");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Maya@123");
			driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Maya@123");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9544469316");
			WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select s=new Select(day);
			s.selectByVisibleText("01");
			WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
			Select s1=new Select(month);
			s1.selectByVisibleText("JAN");
			WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			Select s2=new Select(Year);
			s2.selectByVisibleText("2000");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).clear();
			WebElement Country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
			Select s3=new Select(Country);
			s3.selectByVisibleText("India");
			WebElement City=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
			Select s4=new Select(City);
			s4.selectByVisibleText("Delhi");
			WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
				if(button.isDisplayed())
				{
					System.out.println("button is present");
				}
				else
				{
					System.out.println("button is not present");
				}
		}
		
		
}


