package org.sspart.testNGPractice;

import org.sspart.pages.HomePage;
import org.sspart.pages.ProductPage;
import org.sspart.pages.ProductResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonProduct {

	HomePage homePage = new HomePage();
	ProductResultPage productResult = new ProductResultPage();
	ProductPage productPage = new ProductPage();
	
	@Test
	public void tc01() throws InterruptedException {
		homePage.urlNavigation();
		homePage.enterText();
		Thread.sleep(5000);
		homePage.clickSearch();
		//Assert.assertTrue(productResult.checkProduct());
		productResult.clickProduct();
		productPage.switchingWindows();
		productPage.getPrice();
		productPage.switchBack();
	}
}
