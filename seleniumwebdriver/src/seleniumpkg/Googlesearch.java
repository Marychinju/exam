package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
ChromeDriver drive;

@Before
public void start()
{
	drive=new ChromeDriver();
	drive.get("https://www.google.co.in/");
	
}
@Test
public void test2()
{
	drive.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("mobiles");
	drive.findElement(By.className("btnK")).click();
	
}
}
