package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("panchal53rahul@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("rahul258");
		
		driver.get("");
		System.out.println();
		
	}
}
