package prc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TestNG {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  driver.findElement(By.id("googlells")).click();
	  driver.get("htpps://www.google.com");
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  
  }

  @AfterClass
  public void afterClass(ITestResult results) {
	  
	 /* if(ITestResult.FAILURE == results.getStatus()) {
		  
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.getFile(src, "E:\\WorkSpace\\SeleniumDemos\\Screenshots"+ results.getName());
	  }
	  */
	  driver.close();
  }

}
