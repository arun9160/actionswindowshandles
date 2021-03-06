package prc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i = 0; i<=links.size();i++) {
			
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		
		/*WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());*/
		
		WebElement childlinks = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println(childlinks.findElements(By.tagName("a")).size());
		
		for(int i =0; i<childlinks.findElements(By.tagName("a")).size();i++) {
			
			childlinks.findElements(By.tagName("a")).get(i).click(); 
		}
		
	}	

}
