package org.sspart.pages;

import org.openqa.selenium.By;
import org.sspart.util.DriverUtil;

public class ProductPage extends DriverUtil {
	
	public void switchingWindows() {
		
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().contains("Apple iPhone XR (256GB) - White")) {
				return;
			}
		}
		
	}
	
	public void getPrice() {
		String res= driver.findElement(By.id(props.getProperty("amazon.product.price.text"))).getText();
		System.out.println(res);
	}
	
    public void switchBack() {
		
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().contains("Apple iPhone XR (256GB) - White")) {
				driver.close();
			}
		}
		
		
		driver.close();
		
	}
	
	

}
