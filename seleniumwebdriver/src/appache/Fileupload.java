package appache;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
WebDriver driver;
@BeforeTest
public void start()
{
	driver= new ChromeDriver();
}
@Test
public void test1() throws IOException

{
	/*driver.get("https://demo.guru99.com/test/upload/");
	WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	upload.sendKeys("C:\\Users\\HP\\Desktop\\image.jpg");*/
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\SELENIUM\\autofiles\\auto3.exe");
}
}
