package org.sspart.seleniumAus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.amazon.com");
//			driver.findElement(By.xpath("//select/option[text()='Beauty & Personal Care']")).click();
//			
//			Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
//			s.selectByIndex(4);
//			
//			Thread.sleep(5000);
//			s.selectByValue("search-alias=computers-intl-ship");
//			Thread.sleep(5000);
//			s.selectByVisibleText("Beauty & Personal Care");
//			Thread.sleep(5000);
			
			
			driver.get("https://www.monsterindia.com/seeker/personal");
			driver.findElement(By.xpath("//span[text()='Year (s)']")).click();
			driver.findElement(By.xpath("//span[text()='3 Years']")).click();
			Thread.sleep(5000);
			driver.quit();

	}

}
