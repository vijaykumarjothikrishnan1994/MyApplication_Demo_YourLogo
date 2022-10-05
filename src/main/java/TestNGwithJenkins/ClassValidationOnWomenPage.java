package TestNGwithJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ClassValidationOnWomenPage {
	public static WebDriver driver;

	@Test
	public static void WomenPage() {
	

	System.setProperty("webdriver.chrome.driver",
			  "E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_Project\\Drivers\\chromedriver_win32\\chromedriver.exe"
			  );
	driver=new ChromeDriver(); driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
WebElement eleclick=driver.findElement(By.xpath("(//a[@title='Dresses'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", eleclick);
	
}

}
