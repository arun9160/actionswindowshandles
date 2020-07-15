package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
		

	public static void main(String[] args) {
		
		int sum =0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// System.out.println(driver.findElement(By.xpath("//table[@id='product']")).getText());

		WebElement ele = driver.findElement(By.cssSelector("table[id='product']"));

		int count = ele.findElements(By.cssSelector("tr td:nth-child(3)")).size();
		for (int i = 0; i < count; i++) {

			String str = ele.findElements(By.cssSelector("tr td:nth-child(3)")).get(i).getText();
			System.out.println(str);
			
			int total = Integer.parseInt(str);
			sum = sum+total;
			
			
		}
		System.out.println(sum);
		driver.close();
	}

}
