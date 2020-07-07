package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement ele4 = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		if(ele4.isDisplayed()) {
		Actions act = new Actions(driver);
		act.moveToElement(ele4).build().perform();
		System.out.println("The element is visible and hoveed");
		
		}else {
			
			System.out.println("The element is nbot visible");
		}
		WebElement ele5 = driver.findElement(By.xpath("//a[contains(text(), 'Reload')]"));
		if(ele5.isDisplayed()) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Reload')]"))).click().build().perform();
		System.out.println("The page is refreshed");
		}else {
			
			System.out.println("The page is not refreshed ");
		}
		
	}

}
