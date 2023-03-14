package seleniumpkg;

import java.util.List;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Countoflinks {
	
		ChromeDriver driver1;
		@Before
		public void setup1()
		{
		driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com");
		}
	@Test
	public void test1()
	{
		List<WebElement> li=driver1.findElements(By.tagName("a"));//TAGNAME IS USING FOR LOCATE LINKS
		int n=li.size();
		System.out.println("count of links"+n);
		for(WebElement element :li)
		{
			String link=element.getAttribute("href");//links are in href ,we have to fecth from that
			String text=element.getText();
			System.out.println(link +text);
		}
				
	}
		


	}
