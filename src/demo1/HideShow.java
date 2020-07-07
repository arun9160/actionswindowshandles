package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
	if(ele.isDisplayed()) {
		
		System.out.println("The elements is  visible");
		
	}else {
		
		System.out.println("The element is not visible ");
	}
	
	driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	
	if(ele1.isDisplayed()) {
		
		System.out.println("The elements is  visible");
		
	}else {
		
		System.out.println("The element is not visible ");
	}
	}

}
