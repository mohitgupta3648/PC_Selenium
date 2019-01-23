package pkg1;

public class Login_assertion {
	public static void main() {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
       @FindBy(id="userName")
       WebElement username;
       @FindBy(id="password")
       WebElement password;
       @FindBy(className="btn-info")
       WebElement button;
       public LoginPage(WebDriver driver)
       {
        //initialize elements
          PageFactory.initElements(driver, this);

       }
       public void set_username(String usern)
       {
        username.clear();
        username.sendKeys(usern);
       }
       public void set_password(String userp)
       {
        password.clear();
        password.sendKeys(userp);
       }
       public void click_button()
       {
        button.submit();
       }
	}
}





package Test;
import org.testng.annotations.Test;


import Pages.LoginPage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class LoginTest
{
WebDriver driver;
@BeforeTest
public void setup()
{
    System.setProperty("webdriver.firefox.marionette","pathToGeckodriver");
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://twhyderabad.github.io");
}
@Test(priority=5)
public void verify1()
{
    LoginPage login=new LoginPage(driver);
    login.set_username("admin");
    login.set_password("admin");
    login.click_button();
    Assert.assertTrue(driver.getPageSource().contains("Blog"));
}
@Test(priority=1)
public void verify2()
{
    LoginPage login=new LoginPage(driver);
    login.set_username("adm");
    login.set_password("admin");
    login.click_button();
    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")),"Wrong username or password!");
}
@Test(priority=2)
public void verify3()
{
    LoginPage login=new LoginPage(driver);
    login.set_username("admin");
    login.set_password("adm");
    login.click_button();
    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")),"Wrong username or password!");
}
