package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class gillette_India 
{
	WebDriver Driver;	
	
	@FindBy(className="event_profile_login")
	WebElement click1;
	
	@FindBy(xpath=".//input[@id='phdesktopbody_0_username']")
	WebElement email;
	
	@FindBy(xpath=".//input[@name='phdesktopbody_0$ctl04']")
	WebElement pass;
	
	@FindBy(xpath=".//input[@name='phdesktopbody_0$Sign In']")
	WebElement submit;
	
	@FindBy(id = "phdesktopheader_0_phdesktopheadertop_2_LogOffLink")
	WebElement logout;
	
	@FindBy(id = "phdesktopheader_0_phdesktopheadertop_2_anchrContinue")
	WebElement confirmlogout;
	
	@FindBy(id="phdesktopbody_0_forgotpassword")
	WebElement reset;
	
	@FindBy(xpath = ".//input[@id='phdesktopbody_0_username']")
	WebElement resetemail;
	
	@FindBy(id="phdesktopbody_0_Create Your New Password")
	WebElement resetsubmit;
	
	@FindBy(xpath="//*[@id=\"phdesktopbody_0_afterSubmit\"]/div[2]/h2")
	WebElement resettext;
	

		
	public gillette_India(WebDriver driver) 
	{
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getConfirmlogout() {
		return confirmlogout;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getResetemail() {
		return resetemail;
	}

	public WebElement getResetsubmit() {
		return resetsubmit;
	}

	public WebElement getResettext() {
		return resettext;
	}	
	
	
}
