package completeproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllInclude {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());

		// Icon visibility
		WebElement ele = driver.findElement(By.xpath("//*[@class='logoClass']"));

		if (ele.isDisplayed()) {

			System.out.println("The logo is visible");
		} else {

			System.out.println("The logo is not visible");
		}

		// Main Menu titles
		System.out.println(driver.findElement(By.xpath("//button[contains(text(), 'Home')]")).getText());
		System.out.println(driver.findElement(By.xpath("//button[contains(text(), 'Practice')]")).getText());
		System.out.println(driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).getText());
		System.out.println(driver.findElement(By.xpath("//button[contains(text(), 'Signup')]")).getText());

		// Radio buttons
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]")).click();

		// Auto complete input
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");

		// Autosuggest
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		ele1.clear();
		ele1.sendKeys("Ind");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.ENTER);

		Select sel = new Select(driver.findElement(By.id("dropdown-class-example")));

		sel.selectByValue("option1");

		// Check box
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();

		// get window handles
		driver.findElement(By.cssSelector("button[id='openwindow']")).click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

		// switching tab
		driver.findElement(By.cssSelector("a[id='opentab']")).click();
		Set<String> id = driver.getWindowHandles();

		Iterator<String> ite = id.iterator();

		String parentid1 = ite.next();
		String childid1 = ite.next();
		driver.switchTo().window(childid1);
		System.out.println("The page title after switching the window is " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentid1);

		System.out.println("The parent page title after switching from child is " + driver.getTitle());

		// Alert
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// Tabledata
		System.out.println(driver.findElement(By.xpath("//table[@id='product']")).getText());
		// hide and displayed
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='displayed-text']"));

		if (ele2.isDisplayed()) {	

			System.out.println("The elements is  visible");

		} else {

			System.out.println("The element is not visible ");
		}

		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();

		WebElement ele3 = driver.findElement(By.xpath("//input[@id='displayed-text']"));

		if (ele3.isDisplayed()) {

			System.out.println("The elements is  visible");

		} else {

			System.out.println("The element is not visible ");
		}
		
		//Mouse hover
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
		driver.quit();
	}
		
}
