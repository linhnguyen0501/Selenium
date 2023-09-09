package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	
	public void beforeClass() {
		System.out.println(projectPath + "\\BrowserDriver\\msedgedriver.exe");
		System.setProperty("webdriver.edge.driver", projectPath + "\\BrowserDriver\\msedgedriver.exe");
	
	    
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://androidcoban.com/cac-khai-niem-ve-lap-trinh-huong-doi-tuong-oop.html");
	}

	@Test
	public void TC_01_() {

	}

	@Test
	public void TC_02_() {
		
	}

	@Test
	public void TC_03_() {
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}