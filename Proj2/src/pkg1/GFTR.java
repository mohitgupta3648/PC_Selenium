package pkg1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GFTR {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		try
		{
			  // Put your script here
		
		driver.get("https://facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollby(6000,0)");
		
		
		Alert a= driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys("Deepak");
		
		
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath(".//*[@id='email']"));
		user.sendKeys("panchal53rahul@gmail.com");
		WebElement password=driver.findElement(By.xpath(".//*[@id='pass']"));
		password.sendKeys("rahul257");
		
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath(".//*[@value='Log In']"));
		Login.click();
		Thread.sleep(3000);
		}
		catch(Exception ex)
		{
		            File scrn=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		            // extracting date for folder name.
		            SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy-MM-dd");//dd/MM/yyyy
		            Date now1 = new Date();
		            String strDate1 = sdfDate1.format(now1);

		            // extracting date and time for snapshot file
		            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//dd/MM/yyyy
		            Date now = new Date();
		            String strDate = sdfDate.format(now);

		            String filefolder="./Snap/"+strDate1+"/";  // create a folder as snap in  your project directory

		            // Creating folders and files
		            File f = new File(filefolder+strDate+".jpeg");

		            FileUtils.copyFile(scrn, new File(f.getPath()));
		}
		
}
}
