package org.sspart.seleniumAus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//		driver.findElement(By.xpath("//a[text()='Register with us']")).click();
//		driver.findElement(By.xpath("(//div[@class='icon mb20'])[2]")).click();
//		driver.findElement(By.xpath("(//div[@class='multiselect__select modal-ref-class'])[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='4 Years']")).click();
		
		
		driver.findElement(By.name("q")).sendKeys("SSPART");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		

}}
