package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_sign_Up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement first_name=driver.findElement(By.name("firstname"));
		first_name.sendKeys("Dummy");
		
		WebElement last_name=driver.findElement(By.xpath("lastname"));
		last_name.sendKeys("Gupta");
		
		WebElement email=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		email.sendKeys("dymmygupta99@gmail.com");
		
		WebElement passs=driver.findElement(By.xpath("//input[@type='password']"));
		passs.sendKeys("qwertyuiop");
		
		WebElement drop1=driver.findElement(By.id("day"));
		 Select s=new Select(drop1);
		 s.selectByIndex(5);

			WebElement month=driver.findElement(By.id("month"));
			 Select s1=new Select(month);
			 s1.selectByValue("6");

				WebElement Year=driver.findElement(By.id("Year"));
				 Select s2=new Select(Year);
				 s2.selectByIndex(5);

		
		
		
		driver.get("");
		System.out.println();
		
	}

}
