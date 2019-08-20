package org.sspart.seleniumAus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			driver.findElement(By.name("submit")).click();
			
			Alert a = driver.switchTo().alert();
			
			System.out.println(a.getText());
		//	a.accept();
			a.dismiss();

	}

}
