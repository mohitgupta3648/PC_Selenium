package pkg1;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Driver;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.util.Output;

public class ScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Work_Java_TW\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	/*	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, “png”, new File(“E:\\Eclipse_Oxygen_Workspace\\Proj2\\Screenshots\\img1.png”));
		*/
		
		File ScrFile=Driver.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(ScrFile, new File("D://img.jpg"));

		File f=Driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Eclipse_Oxygen_Workspace\\Proj2\\Screenshots"));
	}

}
