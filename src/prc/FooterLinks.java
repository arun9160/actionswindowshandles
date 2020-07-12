package prc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://data-flair.training/blogs/iot-tutorial/");
	
	WebElement footerdriver = driver.findElement(By.id("footer"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	WebElement childlinks = driver.findElement(By.xpath("//*[@id=\"dfaboutfooter\"]/p[2]"));
	System.out.println(childlinks.findElements(By.tagName("a")).size());
	//for loop starts from zero or 1 when we give i= eithr 0 or 1
	for(int i = 0; i<childlinks.findElements(By.tagName("a")).size();i++) {
		
		System.out.println(childlinks.findElements(By.tagName("a")).get(i).getText());
		System.out.println(childlinks.findElements(By.tagName("a")).get(i));
	}
	driver.close();

	}
}