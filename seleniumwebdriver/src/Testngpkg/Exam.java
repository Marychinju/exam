package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exam {
	WebDriver driver;
	@BeforeTest
	public void setup()
	
	{
	driver= new ChromeDriver();	
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://www.wappalyzer.com");

}
@Test
public void test1()
{
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button/div[2]/span/svg")).click();
	driver.findElement(By.xpath("//*[@id=\"input-370\"]")).sendKeys("java");
}


}
