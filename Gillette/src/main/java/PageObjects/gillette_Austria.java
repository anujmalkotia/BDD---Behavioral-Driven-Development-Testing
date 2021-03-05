package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class gillette_Austria 
{
	WebDriver Driver;	
	
	@FindBy(className="responsiveAccountHeader_openAccountPanelText")
	WebElement de_click1;
	
	@FindBy(id="username")
	WebElement de_email;
	
	@FindBy(id="password")
	WebElement de_pass;
	
	@FindBy(id="login-submit")
	WebElement de_submit;
	
	@FindBy(css=".myAccount_logOutButton.js-tag-sign-out")
	WebElement logout;
	
	@FindBy(className="forgottenPasswordModal_trigger")
	WebElement reset;
	
	@FindBy(id="forgotten-password-email-field")
	WebElement resetemail;
	
	@FindBy(className="forgottenPasswordModal_dialog_form_submit")
	WebElement resetsubmit;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/section[2]/p")
	WebElement resettext;
		
	public gillette_Austria(WebDriver driver) 
	{
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDe_click1() {
		return de_click1;
	}

	public WebElement getDe_email() {
		return de_email;
	}

	public WebElement getDe_pass() {
		return de_pass;
	}

	public WebElement getDe_submit() {
		return de_submit;
	}
	public WebElement getLogout() {
		return logout;
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
