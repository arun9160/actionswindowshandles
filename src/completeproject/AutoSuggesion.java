package completeproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggesion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement ele1 = driver.findElement(By.cssSelector("input[id='autocomplete']"));
		ele1.sendKeys("ind");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.click();
		System.out.println(ele1.getText());
		
		
		
		//get the text in inputfield
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String str = "return document.getElementById(\"autocomplete\").value";
		
		String str1 = (String) js.executeScript(str);
		System.out.println(str1);
	}

}
