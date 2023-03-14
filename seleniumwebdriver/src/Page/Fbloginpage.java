package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Fbloginpage {
	
	WebDriver driver;


	By fbmail=By.name("email");
	By fbpassword=By.name("pass");
	By fblogin=By.name("login");
			
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String mail,String password)
	{
		driver.findElement(fbmail).sendKeys(mail);
		driver.findElement(fbpassword).sendKeys(password);

	}
	public void loginbutton()
	{
		driver.findElement(fblogin).click();
	}


}
