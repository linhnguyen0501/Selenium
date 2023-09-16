package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.preventers.SecurityProviderLeakPreventer;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic5_TextboxTextarea {
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
	public void TC_02_() {
		driver.get("https://omayo.blogspot.com/?fbclid=IwAR1ddbuB3GqGA6QseTeiUOpwlJO_-BJ_oHdZMkZizyRxINHp-5Lz6f7T5W8");
		WebElement txbReadOnly = driver.findElement(By.id("rotb"));
		String sentence = txbReadOnly.getAttribute("value");
		System.out.println("text is " + sentence);

	}

//	@Test
	public void TC_01() {
		driver.get("http://omayo.blogspot.com/");
		WebElement txtArea = driver.findElement(By.id("ta1"));
		txtArea.sendKeys("Linh Nguyen\nManual Tester\nBlack box testing");
		Sleep(3);
		txtArea.clear();
		Sleep(2);

	}

	@Test
	public void TC_02() {
		driver.get("http://omayo.blogspot.com/");
		WebElement txtBox = driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
		txtBox.sendKeys("ntnlinh12345");
		Sleep(3);
		txtBox.clear();
		Sleep(2);

	}

//	@Test
	public void TC_03() {
		driver.get("http://omayo.blogspot.com/");
		WebElement Get_txtElement = driver
				.findElement(By.xpath("//h2[text()='Text Area Field Two']//parent::div[@id='HTML11']//textarea"));
		String Sentence = Get_txtElement.getText();
		System.out.println(Sentence);

		WebElement ReadOnly = driver.findElement(By.xpath("//input[@id='rotb']"));
		System.out.println(ReadOnly.getAttribute("value"));

	}

//	@Test
	public void TC_04 () {
		driver.get("https://demo.nopcommerce.com/");
		WebElement Register = driver.findElement(By.className("ico-register"));
		Register.click();
		
		WebElement DropDownDay = driver.findElement(By.name("DateOfBirthDay"));
		WebElement DropDownMonth = driver.findElement(By.name("DateOfBirthMonth"));
		WebElement DropDownYear = driver.findElement(By.name("DateOfBirthYear"));


		//		DropDownDay.click();
//		
//		WebElement SelectDay = driver.findElement(By.xpath("//option[text()='25']"));
//		SelectDay.click();
//		Sleep(5);
		
//		Use select
		Select selectDay = new Select (DropDownDay);
		Select selectMonth = new Select (DropDownMonth);
		Select selectYear = new Select (DropDownYear);


		
//		selectDay.selectByVisibleText("10");
		selectDay.selectByValue("5");
//		selectMonth.selectByVisibleText("February");	
		selectMonth.selectByValue("1");
		Sleep(2);
		WebElement item = selectMonth.getFirstSelectedOption();
//		System.out.println("thang thu " + item.getText());
		
		Assert.assertEquals(item.getText(), "January");
		
		
//		selectYear.selectByVisibleText("1999");
		selectYear.selectByIndex(1);
		
		Sleep(4);
		
	}

//	@Test
	public void TC_05() {
		driver.get("http://omayo.blogspot.com/");
		Select chooseCar = new Select(driver.findElement(By.id("multiselect1")));
		chooseCar.selectByVisibleText("Volvo");
		chooseCar.selectByVisibleText("Audi");
		Sleep(4);
		chooseCar.deselectByVisibleText("Volvo");
		Sleep(3);
	}

	public void Sleep(int timeout) {
		try {
			Thread.sleep(timeout * 1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
