package completeproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//Vertical scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,250)");
		
		//visibility of element
		WebElement ele = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	//	js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		// to the end of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//horizontal
		
		
	}

}
