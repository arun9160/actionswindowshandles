package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/");
			
			
			//Assert.assertTrue(driver.findElement(By.xpath("/html/body/footer/section/ul[2]/li[1]")).isEnabled());
			
	}

}
