package pkg1;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Gmail_Login

	{
		ChromeDriver driver;

		@BeforeSuite
		public void Browserlaunch() 
		{

			System.out.println("First Launching browser");

			System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			driver.manage().window().maximize();

		}
	   	
		@Parameters({"email","pass"})
		@Test
		public void Entercredential(String S1, String S2) throws InterruptedException 
		
		{
			System.out.println("Running Script");
			WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
			email.sendKeys(S1);

			WebElement Next = driver.findElement(By.xpath("//input[@id='next']"));
			Next.click();

			Thread.sleep(2000);

			WebElement pass = driver.findElement(By.xpath("//input[@id='Passwd']"));
			pass.sendKeys(S2);

			WebElement Signin = driver.findElement(By.xpath("//input[@id='signIn']"));
			Signin.click();
		}

		@AfterTest
			public void Logoutuser() throws InterruptedException 
		{
			System.out.println("Loging out user");
			Thread.sleep(5000);
			WebElement profile = driver.findElement(By.xpath("//span[@class='gb_9a gbii']"));
			profile.click();

			WebElement Signout = driver.findElement(By.xpath("//a[@class='gb_Ha gb_6e gb_df gb_yb']"));
			Signout.click();
		}

		@AfterSuite
		public void CloseBrowser() 
		{
			System.out.println("Closing browser");
			driver.close();
		}
	}