package org.sspart.seleniumAus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/popup.php");
			
			String parent= driver.getWindowHandle();
			driver.findElement(By.xpath("//a[text()='Click Here']")).click();
      		Thread.sleep(5000);
			
			
			
			Set<String> windows = driver.getWindowHandles();
			for(String eachWindow : windows) {
				driver.switchTo().window(eachWindow);
				Thread.sleep(5000);
				boolean bool = false;
				
				try {
					bool= driver.findElement(By.name("emailid")).isDisplayed();
				}catch(Exception e) {}
				
				if(bool) {
					driver.findElement(By.name("emailid")).sendKeys("abc@ab.df");
					Thread.sleep(5000);
					driver.close();
				}
				
			}
			driver.switchTo().window(parent);
			
			Thread.sleep(5000);
			
			driver.quit();
			

	}

}
