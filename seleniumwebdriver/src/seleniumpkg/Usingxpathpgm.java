package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpathpgm {

	
		
	driver.findElement(By.name("//*[@id='nav-xshop']")).click();	
	driver.findElement(By.name("//*[id='nav-cart-text-container']")).click();
			driver.findElement(By.name("//span[@id='nav-link-accountList-nav-line-1']")).click();
			driver.findElement(By.name("//div[@id='authportal-main-section']")).click();
			driver.findElement(By.name("//input[@name='email']")).sendKeys("abc@gmail.com");
			driver.navigate().back();
			driver.navigate().back();