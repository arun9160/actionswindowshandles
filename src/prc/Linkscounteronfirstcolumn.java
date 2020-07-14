package prc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscounteronfirstcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for(int i =0; i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		
		

	}

}
