package com.qait.automation.Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	 
	 WebDriver  driver;
	  
	 
	 @Given("^I am on gmail login page$")
	 public void i_am_on_gmail_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	        driver = new ChromeDriver();
	      driver.get("http://www.gmail.com"); }

	 @When("^I enter username as \"([^\"]*)\"$")
	 public void i_enter_username_as(String arg1) throws Throwable {
	  driver.findElement(By.id("identifierId")).sendKeys("priyankaparmeshwari1614");
	  driver.findElement(By.id("identifierNext")).click();
	  Thread.sleep(3000);
	 }

	 @When("^I enter password as \"([^\"]*)\"$")
	 public void i_enter_password_as(String arg1) throws Throwable {
	     
	  driver.findElement(By.name("password")).sendKeys("PRIYANKA1234");
	  
	  
	 }


	 @Then("^i am nevigated to the login page$")
	 public void i_am_nevigated_to_the_login_page() throws Throwable {
	     
	  driver.findElement(By.id("passwordNext")).click();
	 }
}
