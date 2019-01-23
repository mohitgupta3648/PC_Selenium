package pkg1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
	public static void main(String[] args ) throws Exception
	    {
	    	System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.rediff.com/");
	        WebElement sign = driver.findElement(By.xpath("//html/body/div[3]/div[3]/span[4]/span/a"));
	        sign.click();

	        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
	        Iterator<String> itererator = windowId.iterator();   

	        String mainWinID = itererator.next();
	        String  newAdwinID = itererator.next();

	        driver.switchTo().window(newAdwinID);
	        System.out.println(driver.getTitle());
	        Thread.sleep(3000);
	        driver.close();

	        driver.switchTo().window(mainWinID);
	        System.out.println(driver.getTitle());
	        Thread.sleep(2000);

	        WebElement email_id= driver.findElement(By.xpath("//*[@id='c_uname']"));
	        email_id.sendKeys("hi");
	        Thread.sleep(5000);

	        driver.close();
	        driver.quit();
	    }  
}
	
