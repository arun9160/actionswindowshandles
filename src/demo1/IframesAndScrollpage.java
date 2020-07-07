package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesAndScrollpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		if(frm.isDisplayed()) {
		driver.switchTo().frame(frm);
		System.out.println("Swithced to frame");
		System.out.println(driver.getTitle());
		}else {
			
			System.out.println("The frame ios not visible");
		}
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Discount Coupons')]")).getText());
		driver.close();
	}

}
