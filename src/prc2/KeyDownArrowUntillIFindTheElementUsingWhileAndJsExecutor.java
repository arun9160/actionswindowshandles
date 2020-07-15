package prc2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class KeyDownArrowUntillIFindTheElementUsingWhileAndJsExecutor extends Base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Main();
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("fromPlaceName")).sendKeys("ban");
		Thread.sleep(3000);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		//String title = driver.findElement(By.id("fromPlaceName")).getText();
		//System.out.println(title);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(str);
		
	
		while(!text.equalsIgnoreCase("BANGALORE INTERNATION AIRPORT")) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			 text = (String) js.executeScript(str);// if we remove this the whie loop execute infinite
			System.out.println(text);
			
		} 
		driver.close();
		
		

	}

}
