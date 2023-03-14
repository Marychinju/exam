package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbpassworderrorpage {
	WebDriver driver;
	By forgotlink=By.xpath("//a[contains(text(),'Forgotten password?')]");
	By forgotpasswordmobile=By.xpath("//input[@id='identify_email']");
			By forgotsearch=By.name("did_submit");
			public void linkclick()
			{
				driver.findElement(forgotlink).click();
			}
	
	public Fbpassworderrorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String mobile)
	{
		driver.findElement(forgotpasswordmobile).sendKeys(mobile);
	}
	public void searchclick()
	{
		driver.findElement(forgotsearch).click();
	}

}
