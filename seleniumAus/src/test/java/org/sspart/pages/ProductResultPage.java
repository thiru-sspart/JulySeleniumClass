package org.sspart.pages;

import org.openqa.selenium.By;
import org.sspart.util.DriverUtil;

public class ProductResultPage extends DriverUtil {
	
	public boolean checkProduct() {
		try {
		return driver.findElement(By.xpath(props.getProperty("amazon.product.text"))).isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void clickProduct() {
		driver.findElement(By.xpath(props.getProperty("amazon.product.text"))).click();
	}
	
}
