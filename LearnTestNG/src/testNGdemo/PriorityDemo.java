package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
	WebDriver driver;
	@Test(description="Testcase to start the app")
	public void startapp() {
		System.out.println("Start spplication");
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumSoftware\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
	}
	
	@Test (priority=1, description = "Testcase to verify sign in functionality" )
	public void signin() {
		System.out.println("Successfully logged in");
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Test (priority = 2, description = "Testcase to verify signout functionality")
	public void signout() {
		System.out.println("signoff successfully");
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
