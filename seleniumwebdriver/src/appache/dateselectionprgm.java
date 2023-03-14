package appache;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dateselectionprgm {
WebDriver driver;
@BeforeTest
public void start()
{
	driver= new ChromeDriver();
	
}

@Test
public void test()
{
	driver.get("https://www.expedia.co.in/?locale=en_GB&siteid=27&semcid=IN.B.GOOGLE.BT-c-EN.GT&SEMDTL=a118255096863.b1141");
	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]"));
	while(true)
		{
		WebElement month=driver.findElement(By.id("d1-btn"));
		month.click();
		String month1=month.getText();
		if (month1.equals("March 2023"))
		{
			System.out.println(month1);
			break;
		}
		else {
		
			driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[1]")).click();
		}
		}
	
	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[2]/button"));
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getAttribute("data-day");
		System.out.println(date);
		if(date.equals("18"))
		{
			dateelement.click();
			System.out.println("dateselected");
		}
	}
		}
}








		
		
		


