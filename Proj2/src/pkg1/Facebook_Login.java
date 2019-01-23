package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Login {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath(".//*[@id='email']"));
		user.sendKeys("panchal53rahul@gmail.com");
		WebElement password=driver.findElement(By.xpath(".//*[@id='pass']"));
		password.sendKeys("rahul258");
		
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath(".//*[@value='Log In']"));
		Login.click();
		Thread.sleep(3000);
		
		/* 
		from selenium.webdriver.chrome.options import Options
		chrome_options = webdriver.ChromeOptions()
		prefs = {"profile.default_content_setting_values.notifications" : 2}
		chrome_options.add_experimental_option("prefs",prefs)
		driver = webdriver.Chrome(chrome_options=chrome_options) 
		CODE FOR HIDING POP-UP 				
		*/ 
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).build().perform(); 
		
		
	//	WebElement Message = driver.findElement(By.xpath(".//*[@class='_2n_9 f_click']"));
//		Message.click();
		// driver.findElements(By.id("xyz")).isEmpty();
		
		Thread.sleep(2000);
		WebElement Message = driver.findElement(By.xpath(".//*[@class='jewelCount']"));
		Message.click();
		Thread.sleep(2000);

		
		WebElement Drpopdown = driver.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
		Drpopdown.click();
		Thread.sleep(2000);
		
		WebElement Create_Page = driver.findElement(By.xpath(".//*[@class='_54nh']"));
		Create_Page.click();
		
		WebElement Category_Entertainment = driver.findElement(By.xpath(".//*[@class='Entertainment']"));
		Category_Entertainment.click();
		
		Actions ac1= new Actions(driver);
		ac1.sendKeys(Keys.ESCAPE).build().perform(); 
		
		
		
		driver.get("");
		System.out.println();
		driver.quit();
	}
}
