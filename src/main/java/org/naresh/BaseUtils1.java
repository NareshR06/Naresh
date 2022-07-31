package org.naresh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseUtils1 {
	
	 public static WebDriver driver = null;
	 
	 public static void browserLaunch(String browser){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh\\eclipse-workspace\\MavenTest\\src\\main\\resources\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 }
	 
	 public void getUrl(String url){
		 driver.get(url);
		 }
	 
	 public void inputText(WebElement element, String input) {
		 element.sendKeys(input);
	 }
	 
	 public void clickButton(WebElement element) {
		 element.click();
	 }
	 
	 public void Takescreenshot(WebDriver driver, String Screenshot) throws IOException {
			TakesScreenshot s=(TakesScreenshot)driver;
			File source = s.getScreenshotAs(OutputType.FILE);
			File dest= new File("./src/test/resources/Screenshot/" + Screenshot);
			FileHandler.copy(source, dest);
	}
}
