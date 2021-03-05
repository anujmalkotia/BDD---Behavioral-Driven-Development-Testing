package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ibibo_homepage {
public WebDriver driver;
	
	public ibibo_homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By one_way_opt = By.cssSelector(".curPointFlt.switchAct");
	By rnd_trip_opt = By.cssSelector("#roundTrip");
	By mlt_cty = By.cssSelector("#multiCity");
	
	By FROM = By.cssSelector("#gosuggest_inputSrc");
	By DESTINATION = By.cssSelector("#gosuggest_inputDest");
	By DESTINATION2 = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/input");
	
	By dep_cal = By.cssSelector("#departureCalendar");
	By ret_cal = By.cssSelector("#returnCalendar");
	By ret_cal_multicity = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/input");
	
	By cal_mon_yr = By.cssSelector(".DayPicker-Caption");
	By cal_nav_btn = By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next");
	By days = By.cssSelector(".DayPicker-Day .calDate");
	
	By trav_details = By.cssSelector(".dF.alignItemsCenter.ico14.textOverflow.blueGrey");
	By user_det = By.cssSelector("#pax_link_common");
	By adult = By.id("adultPaxBox");
	By children = By.id("childPaxBox");
	By infant = By.id("infantPaxBox");
	By travel_class_drpdwn = By.id("gi_class");
	By user_det_close_btn = By.id("pax_close");
	
	By search_btn = By.id("gi_search_btn");

	public WebElement getOne_way_opt() {
		return driver.findElement(one_way_opt);
	}
	public WebElement getRnd_trip_opt() {
		return driver.findElement(rnd_trip_opt);
	}
	public WebElement getMlt_cty() {
		return driver.findElement(mlt_cty);
	}
	public WebElement getFROM() {
		return driver.findElement(FROM);
	}
	public WebElement getDESTINATION() {
		return driver.findElement(DESTINATION);
	}
	public WebElement getDep_cal() {
		return driver.findElement(dep_cal);
	}
	public WebElement getRet_cal() {
		return driver.findElement(ret_cal);
	}
	public WebElement getCal_mon_yr() {
		return driver.findElement(cal_mon_yr);
	}
	public WebElement getCal_nav_btn() {
		return driver.findElement(cal_nav_btn);
	}
	public WebElement getDays() {
		return driver.findElement(days);
	}
	public WebElement getSearch_btn() {
		return driver.findElement(search_btn);
	}
	public WebElement getUser_det() {
		return driver.findElement(user_det);
	}
	public WebElement getAdult() {
		return driver.findElement(adult);
	}
	public WebElement getChildren() {
		return driver.findElement(children);
	}
	public WebElement getInfant() {
		return driver.findElement(infant);
	}
	public WebElement getTravel_class_drpdwn() {
		return driver.findElement(travel_class_drpdwn);
	}
	public WebElement getUser_det_close_btn() {
		return driver.findElement(user_det_close_btn);
	}
	public WebElement getTrav_details() {
		return driver.findElement(trav_details);
	}
	public WebElement getDESTINATION2() {
		return driver.findElement(DESTINATION2);
	}
	public WebElement getRet_cal_multicity() {
		return driver.findElement(ret_cal_multicity);
	}

}
