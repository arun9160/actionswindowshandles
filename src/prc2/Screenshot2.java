package prc2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot2 {
	
	public static void takesc(WebDriver driver, String Scname) {
		
		try {
			
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("E:\\WorkSpace\\SeleniumDemos\\Screenshots\\" + Scname + ".png"));
			
			
			
		}catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		
	}

}
