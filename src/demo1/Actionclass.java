package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		Actions a = new Actions(driver);
		// Double click
		WebElement ele = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		// Mouse right click
		WebElement el2 = driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
		a.moveToElement(el2).contextClick().build().perform();

	}

}
