package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");
		// driver.close();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select s1 = new Select(driver.findElement(By.id("select-demo")));
		s1.selectByIndex(2);
		driver.close();
	}

}
