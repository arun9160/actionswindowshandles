package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		 ele.clear();
		 ele.sendKeys("Ind");
		 Thread.sleep(2000);
		 ele.sendKeys(Keys.ARROW_DOWN);
		 ele.sendKeys(Keys.ARROW_DOWN);
		 ele.sendKeys(Keys.ENTER);
	}

}
