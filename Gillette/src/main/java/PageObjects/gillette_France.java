package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gillette_France 
{
	WebDriver Driver;	
	
	@FindBy(className = "event_profile_login")
	WebElement loginpage;
	
	@FindBy(css = "#viewLoginForm .white")
	WebElement login;
	
	@FindBy(css = "#email.is_required.validate.account_input.form-control")
	WebElement email;
	
	@FindBy(css = "#passwd.is_required.validate.account_input.form-control")
	WebElement password;
	
	@FindBy(id = "SubmitLogin")
	WebElement submit;
	
	@FindBy(id = "logout_link")
	WebElement logout;
	
	@FindBy(css =".lost_password.grey")
	WebElement resetpass;
	
	@FindBy(css = ".form-control#email")
	WebElement resetemail;
	
	@FindBy(css = ".password.button")
	WebElement resetsubmit;
	
	@FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/p")
	WebElement gettext;
	public gillette_France(WebDriver driver) 
	{
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLoginpage() {
		return loginpage;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getResetpass() {
		return resetpass;
	}
	public WebElement getResetemail() {
		return resetemail;
	}
	public WebElement getResetsubmit() {
		return resetsubmit;
	}
	public WebElement getGettext() {
		return gettext;
	}
	
}
