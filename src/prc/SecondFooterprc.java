package prc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondFooterprc extends ScreenShot{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		// limiting webdriver 
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		for(int i=0;i<footer.findElements(By.tagName("a")).size();i++) {
			
			
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(7000);
		}
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			while(it.hasNext()) {
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			
			
		}
			
		
		
	}

}
	