package testNGdemo;
//Assertion demo
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitle {
	WebDriver driver;
	
	@BeforeMethod
	public void open() {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle() 
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "google");
	}
	
	@Test(priority=1)
	public void checklogo() 
	{
		boolean view = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed();
		Assert.assertTrue(view);
	}

	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}

