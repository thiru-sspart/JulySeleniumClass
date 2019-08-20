package org.sspart.pages;

import org.openqa.selenium.By;
import org.sspart.util.DriverUtil;

public class HomePage extends DriverUtil{
	public void urlNavigation() {
		launch();
		driver.get("https://www.amazon.com");
	}
	
	public void enterText() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi a2");
	}
	
	public void clickSearch() {
		driver.findElement(By.xpath(props.getProperty("amazon.search.button"))).click();
	}

}
