package seleniumpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbutton {

	ChromeDriver driver;
	

@Before
public void start()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void test()
{
WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select s=new Select(day);
s.selectByVisibleText("01");
WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select s1=new Select(month);
s1.selectByVisibleText("JAN");
WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
Select s2=new Select(Year);
s2.selectByVisibleText("2000");
WebElement countdays= (WebElement) driver.findElements(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select se= new Select(countdays);
List<WebElement>l=se.getOptions();
l.size();

}
}