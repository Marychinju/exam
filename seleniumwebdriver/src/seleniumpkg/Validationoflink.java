package seleniumpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validationoflink {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";


	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}


	@Test
	public void test()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("count of link"+l.size());
		for(WebElement element:l)
		{
			String linkdetails=element.getAttribute("href");
			verify(linkdetails);
			
	}
		
	}
	
	private void verify(String linkdetails) 
	{
		try
		{
			URL u =new URL(linkdetails);//network connection enable
			HttpURLConnection con=(HttpURLConnection)u.openConnection();//casting means cnnection return to httpurlconnection
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("status is 200--"+linkdetails);
			}
			else if (con.getResponseCode()==404)
			{
				System.out.println("status is 404--"+linkdetails);	
			}
			else
			{
				System.out.println("other statuscode"+linkdetails);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
		}
}
