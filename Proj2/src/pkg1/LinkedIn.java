package pkg1;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	@Test
	public void testlinkedin() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");  //Use your web URL
	driver.findElement(By.linkText("Sign Up")).click();
	driver.findElement(By.cssSelector("button.fb-btn")).click();
	Thread.sleep(3000);

	Set <String>handles = driver.getWindowHandles();//To handle multiple windows
	/*
	 * firstWinHandle = driver.getWindowHandle();
	 
	handles.remove(firstWinHandle);
	String winHandle=handles.iterator().next();
	if (winHandle!=firstWinHandle){
	     secondWinHandle=winHandle;

	driver.switchTo().window(secondWinHandle);   //Switch to popup window
	Thread.sleep(2000);
*/
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("Username");
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys("Password");
	driver.findElement(By.id("u_0_2")).click();
	driver.findElement(By.name("__CONFIRM__")).click();
	/*
	  String handle = driver.getWindowHandles().toArray()[1].toString();
    driver.switchTo().window(handle);
   -> fill [0] to navigate on parent window
   
   driver.switchTo().alert().sendKeys("some text to enter");
   -> 
	 */
	
	}	
  }

