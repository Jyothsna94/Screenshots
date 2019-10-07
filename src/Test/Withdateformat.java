package Test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withdateformat {
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	 
		String timeStamp1;
		 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		//The below method will save the screen shot in d drive with name "screenshot.png"
		 
		timeStamp1 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());//&nbsp;&nbsp;
		 
		FileUtils.copyFile(scrFile, new File("F:\\jyothsna\\sample"+timeStamp1+".png"));
		 
		}
        	}
	


