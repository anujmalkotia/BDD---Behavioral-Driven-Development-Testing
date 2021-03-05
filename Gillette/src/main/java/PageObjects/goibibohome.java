package PageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class goibibohome 
{	
	public WebDriver Driver;
	
	@FindBy(css = "#oneway")
	WebElement oneway;
	
	@FindBy(css = "#roundTrip")
	WebElement roundtrip;
	
	@FindBy(css = "#multiCity")
	WebElement multiCity;
	
	@FindBy(id="gosuggest_inputSrc")
	WebElement from;
			
	@FindBy(id="gosuggest_inputDest")
	WebElement to;
	
	@FindBy(xpath = ".//div[@class=\"col-md-12 pad0 dF flexWrap brdrRd5 marginB10  multiShdw\"]//div[@class=\"dF whiteBg col-md-3 col-sm-5 alignItemsCenter \"]/input\r\n")
	WebElement to2;
	
	@FindBy(id="departureCalendar")
	WebElement depcal;
	
	@FindBy(id="returnCalendar")
	WebElement returncal;
	
	@FindBy(className="DayPicker-Caption")
	WebElement monthndyr;
	
	@FindBy(css = ".DayPicker-NavButton.DayPicker-NavButton--next")
	WebElement next;
	
	@FindBy(css = ".DayPicker-Month .DayPicker-Day .calDate")
	List <WebElement> day;
	
	@FindBy(id="pax_link_common")
	WebElement travelclassndnoofpassengers;
	
	@FindBy(id="adultPaxPlus")
	WebElement adultplusone;
	
	@FindBy(id="childPaxPlus")
	WebElement childplusone;
	
	@FindBy(id="infantPaxPlus")
	WebElement infantplusone;
	
	@FindBy(id="gi_class")
	WebElement classtype;
	
	@FindBy(id="gi_search_btn")
	WebElement search;

	public goibibohome(WebDriver driver) 
	{
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFrom() 
	{
		return from;
	}
	public WebElement getTo() 
	{
		return to;
	}
	public WebElement getDepcal() 
	{
		return depcal;
	}
	public WebElement getReturncal() 
	{
		return returncal;
	}
	public WebElement getMonthndyr() 
	{
		return monthndyr;
	}
	public WebElement getNext() 
	{
		return next;
	}
	public List<WebElement> getDay() 
	{
		return day;
	}
	public WebElement getTravelclassndnoofpassengers() 
	{
		return travelclassndnoofpassengers;
	}
	public WebElement getAdultplusone() 
	{
		return adultplusone;
	}
	public WebElement getChildplusone() 
	{
		return childplusone;
	}
	public WebElement getInfantplusone() 
	{
		return infantplusone;
	}
	public WebElement getClasstype() 
	{
		return classtype;
	}
	public WebElement getSearch() 
	{
		return search;
	}
	public WebElement getOneway() {
		return oneway;
	}
	public WebElement getRoundtrip() {
		return roundtrip;
	}
	public WebElement getMultiCity() {
		return multiCity;
	}
	public WebElement getTo2() {
		return to2;
	}	
	
}
