package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Validate
{

	
	/*  @Test		//Assertion
	  public void testCaseVerifyHomePage() {
		driver= new FirefoxDriver();
		public static void main()
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.navigate().to("http://google.com");
			Assert.assertEquals("Gooooogle", driver.getTitle());

		}
	 */
	 @Test
	 public void verifyTest(){  

	     /* buffer to hold your errors */
	     StringBuffer errorBuffer = new StringBuffer();      

	     /* verification 1 */
	     try{        
	         Assert.assertEquals("value1", "value!");            
	     }catch(AssertionError e){           
	         errorBuffer.append(e.getMessage() + "\n");      
	     }       

	     /* verification 2 */
	     try{            
	         Assert.assertEquals("value2", "value!");            
	     }catch(AssertionError e){           
	         errorBuffer.append(e.getMessage());     
	     }

	     if(errorBuffer.length() > 0){
	         throw new AssertionError(errorBuffer.toString()); 
	     }

	 }
	 
}
	
