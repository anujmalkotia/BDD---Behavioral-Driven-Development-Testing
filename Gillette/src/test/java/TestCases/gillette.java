package TestCases;
import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.gillette_Austria;
import PageObjects.gillette_France;
import PageObjects.gillette_India;
import Resources.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utility.ReusableComponents;

public class gillette extends base
{
	public WebDriver Driver;
	
	ReusableComponents re=new ReusableComponents();
	gillette_India india;
	gillette_Austria austria;
	gillette_France france;
	
	String title;
	String Country;
	
	
	@Given("^Launches appropriate website as per input$")
	public void launches_appropriate_website_as_per_input() throws IOException
	{
		Driver=driverSetup();
		india=new gillette_India(Driver);
		austria=new gillette_Austria(Driver);	
		france=new gillette_France(Driver);
		
		if(re.getProperty("url").equals("https://www.gillette.co.in/en-in"))
			 Country="India";
		if(re.getProperty("url").equals("https://www.gillette.de/")) 
			 Country="Austria";
		if(re.getProperty("url").equals("https://www.gillette.fr/")) 
			 Country="France";
		
		
		 if(Country.equals("India"))
			{
				title="Gillette India - Men's Razors, Trimmers, Shaving Gel & Foam";
				Driver.get(re.getProperty("url"));
				
				Assert.assertEquals(title, re.getpagetitle(Driver)); 
			}
		 
		 else if(Country.equals("Austria")) 
			{		

				title="Rasierer, Rasierklingen & Gesichtspflege für Männer | Gillette DE";
				Driver.get(re.getProperty("url"));
				
				Assert.assertEquals(title, re.getpagetitle(Driver));
			}
		 
		 else if(Country.equals("France")) 
			{		

				title="Produits de Rasage & Soin pour Homme | Rasage Parfait | Gillette FR";
				Driver.get(re.getProperty("url"));

				Assert.assertEquals(title, re.getpagetitle(Driver));
			}
		 
	}

	@When("^user provide (.+) and (.+) then login$")
	public void user_provide_and_then_login(String email,String pass) throws IOException 
	{
		 if(Country.equals("India"))
			{
			 	india.getClick1().click();
				
				title="Login Page";
		
				Assert.assertEquals(title, re.getpagetitle(Driver));
				
				india.getEmail().sendKeys(email);
				india.getPass().sendKeys(pass);
				india.getSubmit().click();
				
			}
		 
		 else if(Country.equals("Austria")) 
			{
			 	austria.getDe_click1().click();
				
				title="Konto Login | Gillette Deutschland";
			
				Assert.assertEquals(title, re.getpagetitle(Driver));
				
				austria.getDe_email().sendKeys(email);
				austria.getDe_pass().sendKeys(pass);
				austria.getDe_submit().click();			
				
				
			}
		 
		 else if(Country.equals("France")) 
			{
			 	france.getLoginpage().click();
			 	france.getLogin().click();
				
				title="Connexion";
				
				Assert.assertEquals(title, re.getpagetitle(Driver));
				
				france.getEmail().sendKeys(email);
				france.getPassword().sendKeys(pass);
				france.getSubmit().click();
				
			
			 
			}
	}

	@Then("^logout or reset password using email (.+)$")
	public void logout_or_reset_password_using_email(String email) throws IOException 
	{
		if(Country.equals("India"))
		{
			title="View Profile";
			if(title.equalsIgnoreCase(re.getpagetitle(Driver)))
			{
				
				india.getLogout().click();
				india.getConfirmlogout().click();
			}
			else
			{
				india.getReset().click();
				india.getResetemail().clear();
				india.getResetemail().sendKeys(email);
				india.getResetsubmit().click();
				Assert.assertEquals("You will receive an e-mail very shortly containing a link to reset your password.",india.getResettext().getText());
			}
		}
	 
		else if(Country.equals("Austria")) 
		{
			title="Mein Konto | Gillette Deutschland";
			if(title.equalsIgnoreCase(re.getpagetitle(Driver)))
			{
				
				austria.getLogout().click();
			}
			else
			{
				austria.getReset().click();
				austria.getResetemail().clear();
				austria.getResetemail().sendKeys(email);
				austria.getResetsubmit().click();
				//Assert.assertEquals("You will receive an e-mail very shortly containing a link to reset your password.",austria.getResettext().getText());
			}
		} 
		
		else if(Country.equals("France")) 
		{
			title="Identité";
			if(title.equalsIgnoreCase(re.getpagetitle(Driver)))
			{
				
				france.getLogout().click();
			}
			else
			{
				france.getLogin().click();
				
				france.getResetpass().click();
				france.getResetemail().clear();
				france.getResetemail().sendKeys(email);
				france.getResetsubmit().click();
				Assert.assertEquals("Si le compte d'utilisateur existe, un email de confirmation a été envoyé à cette adresse e-mail.",france.getGettext().getText());
			}
		} 
	
		
	}
}