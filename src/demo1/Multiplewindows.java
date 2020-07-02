package demo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='sites-canvas-main-content']/table/tbody/tr/td/div/h2/font/a")).click();
		// Store all window ids
		Set<String> ids = driver.getWindowHandles();
		// iterate one after another
		Iterator<String> it = ids.iterator();
		String Parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Parent);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());

	}

}
