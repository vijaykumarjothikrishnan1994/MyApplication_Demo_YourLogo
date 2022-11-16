package TestNGwithJenkins;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TakeScreenShot {
	
	public static WebDriver driver;
	
	@Test
	public static void takeScreenshot() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				  "E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_Project\\Drivers\\chromedriver_win32\\chromedriver.exe"
				  );
		driver=new ChromeDriver(); driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php");
			
			
			SoftAssert assert_soft=new SoftAssert();
			String page_title=driver.getTitle();
			
			
			assert_soft.assertEquals(page_title, "My Store3123123", "Unable to land the Base page");
			
			System.out.println(page_title);
			
			WebElement eleclick=driver.findElement(By.xpath("(//a[@title='Dresses'])[1]"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", eleclick);
			
		String Woment_page=	driver.getTitle();
			
			assert_soft.assertEquals(Woment_page, "Dresses - My Store", "Unable to land the Base page for Women");
		
			
			assert_soft.assertAll();
			
			
			
		 TakesScreenshot screenShot=(TakesScreenshot)driver;
		 File src_location=screenShot.getScreenshotAs(OutputType.FILE);
		 
		 File Destination_Location=new File("E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_All_Scenarios\\Store_Evidence\\myscreen.png");
		 
		 FileUtils.copyFile(src_location, Destination_Location);
		
	}

}
