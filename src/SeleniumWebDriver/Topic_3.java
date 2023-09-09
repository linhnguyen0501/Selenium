package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_3{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\BrowserDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

//	@Test
	public void TC_01_FB() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email"));
		driver.findElement(By.className("_sv4"));
		driver.findElement(By.name("pass"));
		driver.findElement(By.linkText("Tiếng Việt"));
		driver.findElement(By.partialLinkText("Việt"));
		driver.findElement(By.tagName("input"));
//		xpath
		System.out.println("before login");
		driver.findElement(By.xpath("//button[@name= 'login' ]"));
		System.out.println("after login");
		
//		CSS
		System.out.println("before id");
		driver.findElement(By.cssSelector("input[id = 'email']"));
		driver.findElement(By.cssSelector("input#email"));
		System.out.println("after id");
		
		
		driver.findElement(By.cssSelector("a[class = '_sv4']"));
		driver.findElement(By.cssSelector("a._sv4"));

	}

//	@Test
	public void TC_02_Demo() {
		driver.get("https://demo.nopcommerce.com/");
//		vao My Account
//		step 1: click to login
		WebElement linklogin = driver.findElement(By.xpath("//a[@class='ico-login']"));
		linklogin.click();
		
//		step 2:nhap email
		WebElement txbEmail = driver.findElement(By.xpath("//input[@id='Email']"));
		txbEmail.sendKeys("abc@gmail.com");
		
//		step 3: nhap password
		WebElement txbPassword = driver.findElement(By.xpath("//input[@class='password']"));
		txbPassword.sendKeys("123456789");
		
		
	}

	@Test
	public void TC_03_() {
		driver.get("https://demo.nopcommerce.com/");
		WebElement SearchField = driver.findElement(By.xpath("//input[starts-with(@id,'smal']"));
	
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}