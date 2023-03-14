package seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://google.com");
		String src=ob.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
		

	}

}
