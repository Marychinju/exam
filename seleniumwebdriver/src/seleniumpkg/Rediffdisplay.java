package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffdisplay {
	ChromeDriver drive1;

	@Before
	public void start()
	{
		drive1=new ChromeDriver();
		drive1.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test2()
	{
	boolean logo = drive1.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		
	
if(logo)
{
	System.out.println("logo is present");
	
}
else
{
	System.out.println("logo is not present");
}
boolean radio=drive1.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
if (radio)
{
	System.out.println("radio is selected");
}
else
{
	System.out.println("radio is not selected");
}
}
}

