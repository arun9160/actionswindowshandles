package prc2;

import org.testng.annotations.Test;

import prc.ScreenShot;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TableDataCount {
	WebDriver driver;
	int sum=0;
	
	 @BeforeClass
	  public void beforeClass() {
		 
		 System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		
	  }
  @Test
  public void tabledata() throws Exception{
	  
	  
	  driver.get("https://datatables.net/examples/styling/bootstrap");
	  WebElement table = driver.findElement(By.cssSelector("table[id='example']"));
	  int count = table.findElements(By.cssSelector("tr[class='odd'] td:nth-child(4)")).size();
	  for(int i = 0 ; i<count ; i++) {
		  
		  System.out.println(table.findElements(By.cssSelector("tr[class='odd'] td:nth-child(4)")).get(i).getText() );
		  String All = table.findElements(By.cssSelector("tr[class='odd'] td:nth-child(4)")).get(i).getText();
		  
		  int total = Integer.parseInt(All);
		  sum = sum+total;
	  }
	  
	  System.out.print("The total group age is :"+ sum);
  }
 

  @AfterMethod
  public void afterClass(ITestResult results) {
	  
	  if(ITestResult.FAILURE==results.getStatus()) {
		  
		  //clasNameofscreenshotcode.cpaturescreenshot(driver, results.getname() here getname means methodname
		  ScreenShot.capturescreenshot(driver, results.getName());
		  
	  }
	  
  }

}
