package org.sspart.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverUtil extends ResourceUtil{
	
	public static WebDriver driver= null;
	
	public void launch() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\U6072903\\Desktop\\internships\\Classes PPT\\chromedriver.exe");
		 driver = new ChromeDriver();
		 locatorRead();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
}
