package prc2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/en-in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		WebElement footerdriver = driver.findElement(By.id("uhf-footer"));
		
		WebElement child = footerdriver.findElement(By.xpath("//nav/div[1]/div[1]/ul"));
		System.out.println(child.findElements(By.tagName("a")).size());
		
		for(int i=0; i<child.findElements(By.tagName("a")).size();i++) {
			
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			
			child.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
