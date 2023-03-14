package seleniumpkg;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	}
@Test
public void testing()
{
	

driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();	
driver.findElement(By.xpath("//*//*[@id=\"nav-cart\"]")).click();
driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//*[@id='continue']")).click();
driver.navigate().back();
driver.navigate().back();
driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
}
}
