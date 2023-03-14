package Testngpkg;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;
public class Test2Test {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
 
  
  @Test
  public void test2() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(697, 728));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("books for kids");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
}
