package org.sspart.seleniumAus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		
//		WebElement ele= driver.findElement(By.className("btn"));
//	 
//		ele.click();
	//	driver.findElement(By.name("fts")).sendKeys("Selenium");
		
	
		
		driver.findElement(By.xpath("//input[@name='fts']")).sendKeys("Selenium");
	
		//driver.findElement(By.className("btn")).click();
		
		driver.findElement(By.cssSelector(".btn")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
