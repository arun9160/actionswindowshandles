package prc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Ejsdfsjgh {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			Reporter.log("The browser instance is matched and opening chrome browser");
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			
			
			
			System.setProperty("webdriver.gecko.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			}else {
				
				System.out.println("The browser isnstance doe snot match");
			}
	}

	
	@Test(priority=0)
	@Parameters("url")
	public void google(String url) throws InterruptedException {
		
		driver.get(url);
		/*WebElement ele = driver.findElement(By.xpath("jdfhkjsdfh"));
		if(ele.isDisplayed()) {
			
			ele.click();
		}else {
			
			System.out.println("Element is not visible");
		}*/
		Thread.sleep(2000);
		
	}
	@Test(priority=1)
	public void data() {
		
		driver.navigate().to("https://sqa.stackexchange.com/questions/18749/if-a-test-case-fails-how-to-close-the-browser-and-move-to-the-next-one");
		WebElement ele = driver.findElement(By.xpath("jdfhkjsdfh"));
		if(ele.isDisplayed()) {
			
			ele.click();
		}else {
			
			System.out.println("Element is not visible");
		}
	}
	
	@AfterMethod
	
	public void teardown(ITestResult results) {
		
		if(ITestResult.FAILURE == results.getStatus())
		Screenshot2.takesc(driver, results.getName());
		
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
		
	}
}
