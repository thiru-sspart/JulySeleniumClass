package org.sspart.stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sspart.util.DriverUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstCucumber extends DriverUtil {
	
	@Given("I am in given step")
	public void i_am_in_given_step() {
	    System.out.println("Given method");
	}

	@Then("I am in then step")
	public void i_am_in_then_step() {
	    System.out.println("Then method");
	}

	@When("i am in when step")
	public void i_am_in_when_step() {
	   System.out.println("when method");
	}

	@And("I am in and step")
	public void i_am_in_and_step() {
	   System.out.println("and method");
	}

	@But("i am in but step")
	public void i_am_in_but_step() {
	   System.out.println("but method"); 
	}
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		launch();
	}

	@Then("I navigate to amazon url")
	public void i_navigate_to_amazon_url() {
		driver.get("https://www.amazon.com");
	}

	@When("I enter {string} in search textbox")
	public void i_enter_in_search_textbox(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
	}

	@When("I click on Seach Button")
	public void i_click_on_Seach_Button() {
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
	}

	@Then("I get the totoal count")
	public void i_get_the_totoal_count() {
	String res= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		
		String abc[] = res.split(" ");
		
		System.out.println(abc[2]);

	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		closeBrowser();
	}
	
	@When("I select the {string} in dropdown")
	public void i_select_dropwown(String string) {
		driver.findElement(By.xpath("//select/option[text()='"+string+"']")).click();
	}
	
	@When("I print {int}")
	public void i_print(Integer int1) {
	    System.out.println(int1);
	}
	
	@When("I print {int} {int}")
	public void i_print(Integer int1, Integer int2) {
	    System.out.println(int1);
	    System.out.println(int2);
	}






}
