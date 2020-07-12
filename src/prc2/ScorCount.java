package prc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScorCount {

	public static void main(String[] args) {
		int sum = 0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\SeleniumDemos\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/2215/ind-vs-sl-final-icc-world-cup-2011");
		/*WebElement ele = driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));
		System.out.println(ele.findElements(By.xpath("//*[@id='innings_1']/div[1]/div/div[@class='cb-col cb-col-8 text-right text-bold']")).size());
		for(int i =0; i<ele.findElements(By.xpath("//*[@class='cb-col cb-col-8 text-right text-bold']")).size()-2;i++) {
			
			System.out.println(ele.findElements(By.xpath("//*[@id='innings_1']/div[1]/div/div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
			
		}*/
		
		WebElement ele = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count = ele.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i =0; i<count-2;i++) {
			
			//System.out.println(ele.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String score = ele.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int allscore = Integer.parseInt(score);
			sum = sum+allscore;
			
		}
		
		
		String  extra = driver.findElement(By.xpath("//div[contains(text(),'Extras')]/following-sibling::div[1]")).getText();
		int total = Integer.parseInt(extra);
		int totalscore = sum + total;
		System.out.println(totalscore);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Total')]/following-sibling::div[1]")).getText());
		
		driver.close();
	}

}
