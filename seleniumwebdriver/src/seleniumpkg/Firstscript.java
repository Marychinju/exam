package seleniumpkg;


import org.openqa.selenium.edge.EdgeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		String exp="google";
		if(title.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
		
			System.out.println("fail");
		}
	}

}
