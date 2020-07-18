package prc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> firstList = driver.findElements(By.cssSelector("tr td:nth-child(3)"));
		try {
		//chnage to array list
		ArrayList<String> originalList  = new ArrayList<String>();
		for(int i =0; i < firstList.size();i++) {
			
			originalList.add(firstList.get(i).getText());
		}	
		
		//Collections.reverse(copiedList);
		for(String s1 : originalList) {
			
			System.out.println(s1);
		}
		
		// add to copied array
		ArrayList<String> copiedList  =new ArrayList<String>();
		for(int i=0;i<originalList.size();i++ ) {
			
			copiedList.add(originalList.get(i));
		}
		Collections.sort(copiedList);
		//Sort
		
		
		System.out.println("**********************");
		for(String s2 : copiedList) {
			
			System.out.println(s2);
		}
		Assert.assertTrue(originalList.equals(copiedList));
		driver.close();
		}catch (AssertionError e ) {
			
			System.out.println(e.getMessage());
			driver.close();
			
		
		}
		
		
	}

}
