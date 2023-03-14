package seleniumpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alertpgm {
	EdgeDriver drive;
	
	@Before
	public void start()
	{
		drive=new EdgeDriver();
		drive.get("file:///C:/Users/HP/Desktop/alert.html");
		}
	@Test
	public void test() throws InterruptedException, IOException 
	{
		File src=((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("E://alertscreenshot.png"));//save to alertscreenshot file on E
		
		WebElement element=drive.findElement(By.xpath("/html/body/input[1]"));
		File sc=element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File ("./alertscreenshot/button.png"));
		
		
		
		drive.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=drive.switchTo().alert();
		
		String alerttext=a.getText();
	Thread.sleep(3000);
		
		a.accept();//press ok
		//a.dismiss();//in the cae of no
		drive.findElement(By.xpath("/html/body/input[2]")).sendKeys("chinju");
		drive.findElement(By.xpath("/html/body/input[3]")).sendKeys("mary");
		drive.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}
