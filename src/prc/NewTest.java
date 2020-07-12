package prc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {

	 WebDriver driver;

	@Test
	public void capturescreensheet() throws Exception{

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@id='jshg']")).click();
	}

	
	@AfterMethod
	public void afterClass(ITestResult results) {

		if (ITestResult.FAILURE == results.getStatus()) {

			ScreenShot.capturescreenshot(driver, results.getName());
		}

		driver.close();
	}

}
