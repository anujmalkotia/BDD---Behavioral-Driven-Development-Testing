package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;


import PageObjects.ibibo_homepage;
import PageObjects.ibibo_searchpage;
import Resources.base;
import Utility.ReusableComponents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OneWay_testcase extends base {
	
	public WebDriver driver;
	
	ReusableComponents rc = new ReusableComponents();
	
	@Given("Launching Site_oneway")
	public void launching_site_oneway() throws IOException {
		driver = driverSetup();
		driver.get(rc.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@When("Selecting {string} {string} {string} {string} {string} {string} _oneway")
	public void selecting__oneway(String from, String destination, String mon_yr, String mon, String year, String day) throws InterruptedException {
		System.out.println(driver.getTitle());
		
		ibibo_homepage ihp = new ibibo_homepage(driver);
		
		ihp.getOne_way_opt().click();
		
		
		ihp.getFROM().sendKeys(from);
		Thread.sleep(2000);
		ihp.getFROM().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ihp.getFROM().sendKeys(Keys.ENTER);
		
		ihp.getDESTINATION().sendKeys(destination);
		Thread.sleep(2000);
		ihp.getDESTINATION().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ihp.getDESTINATION().sendKeys(Keys.ENTER);
		
		ihp.getDESTINATION().click();
		
		ihp.getDep_cal().click();
		
		while(true)
		{
			
			if(ihp.getCal_mon_yr().getText().equals(mon_yr))
			{
				break;
			}
			else
			{
				ihp.getCal_nav_btn().click();
			}
			
		}
		
		WebElement day1 = driver.findElement(By.xpath("//*[@id=\"fare_"+ year + mon + day +"\"]"));
		day1.click();
	}
	
	@When("Selecting {string} {string} {string} {string} _oneway")
	public void selecting__oneway(String adult, String children , String infant , String travel_class) {
		ibibo_homepage ihp = new ibibo_homepage(driver);
		
		ihp.getTrav_details().click();
		ihp.getAdult().clear();
		ihp.getAdult().sendKeys(adult);
		ihp.getChildren().sendKeys(children);
		ihp.getInfant().sendKeys(infant);
		
		Select dropdown = new Select(ihp.getTravel_class_drpdwn());
		dropdown.selectByVisibleText(travel_class);
		
		ihp.getUser_det_close_btn().click();
		
		ihp.getSearch_btn().click();
	}
	
	@When("Searching Cheapest Price")
	public void searching_cheapest_price() throws InterruptedException {
		ibibo_searchpage isp = new ibibo_searchpage(driver);
		
		Thread.sleep(5000);
		
		try
		{
			isp.getView_fare().click();
			Thread.sleep(2000);
			isp.getVf_book_btn().click();
		}
		
		catch(Exception e)
		{
			Thread.sleep(2000);
			isp.getBook_ow().click();
		}
		
		
		
	}
	
	@Then("Closing Window")
	public void closing_window() throws IOException {
		String img1 = driver.getTitle();
		rc.getss(img1, driver);
		
		driver.close();
	}

}
