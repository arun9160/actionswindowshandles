package demo1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import prc2.Screenshot2;

public class TakingSc {

	static WebDriver driver;

	@Test(priority=0)
	
	//(expectedExceptions = NoSuchElementException.class)
	public  void google() throws Exception {

		DesiredCapabilities c = DesiredCapabilities.chrome();
		c.acceptInsecureCerts();
		c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions ch = new ChromeOptions();
		ch.merge(c);

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		driver = new ChromeDriver(ch);
		Thread.sleep(2000);
		driver.get("https://www.gogole.com");
		try{
			
			driver.findElement(By.xpath("dd")).click();
		}catch(NoSuchElementException e ){
			
			e.printStackTrace();
		}
		
		}
	@Test(priority = 1)
	public void datadriven() {
		
		//logs
		Reporter.log("Browsewr is oepning");
		driver.navigate().to("https://www.softwaretestinghelp.com/data-driven-framework-selenium-apache-poi/");
		WebElement ele = driver.findElement(By.id("jshjsh"));
		//Assert.assertTrue(isElementPresent(By.cssSelector("div.stqatools")));
		
	}

	@AfterMethod
	public void teardown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			Screenshot2.takesc(driver, result.getName());

		}
		driver.close();
		
	}
}
