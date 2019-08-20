package org.sspart.testNGPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sspart.util.DriverUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstSelenium extends DriverUtil{
	
	
	@BeforeClass
	public void browserLaunch() {
	   launch();
	}
	
	@BeforeMethod
	public void urlNavigation() {
		driver.get("https://www.amazon.com");
	}
	
	@Test(dataProvider = "DataExcel")
	public void tc02(String[] data) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data[0]);
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		String res= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		
		String abc[] = res.split(" ");
		
		System.out.println(abc[2]);
		System.out.println(data[1]);
	}
	
	@Test(dataProvider = "DataExcel")
	public void tc03(String[] data) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data[0]);
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		String res= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		
		String abc[] = res.split(" ");
		
		System.out.println(abc[2]);
		System.out.println(data[1]);
	}
	
	@DataProvider(name = "Data")
	public String[][] data() {
		String res[][]= {{"IPhone", "Iphone entered"},{ "Samsung", "Samsung entered"},{ "RedMi", "RedMi entered"}};
		return res;
	}
	
	@DataProvider(name = "DataExcel")
	public String[][] data1() throws IOException {
		File  file = new File("C:\\Users\\U6072903\\Desktop\\SampleGitProject\\seleniumAus\\src\\test\\resources\\data\\Data.xlsx");
		
		FileInputStream f= new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(f);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        String res[][]= new String[rowCount] [2];
        for(int i=1; i<=rowCount; i++) {
        	Row r= sheet.getRow(i);
        	for(int j=0; j<r.getLastCellNum(); j++) {
        		res[i-1][j]=r.getCell(j).getStringCellValue();
        	}
        }
        
        return res;

	}
	
	@AfterClass()
	public void browserClose() {
		closeBrowser();
	}
	
	
}
