package pkg1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Links
{
	System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
driver.get(baseUrl + "https://www.google.co.in");
List<WebElement> all_links_webpage = driver.findElements(By.tagName("a")); 
System.out.println("Total no of links Available: " + all_links_webpage.size());
int k = all_links_webpage.size();
System.out.println("List of links Available: ");
for(int i=0;i<k;i++)
	{
if(all_links_webpage.get(i).getAttribute("href").contains("google"))
		{
String link = all_links_webpage.get(i).getAttribute("href");
System.out.println(link);
		}   
	}	
}
