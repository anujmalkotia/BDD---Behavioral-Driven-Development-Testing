package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class goibiboresult 
{
		public WebDriver Driver;
		
		@FindBy(xpath = "//*[@id=\"onRet\"]/div/div/div[2]/a/button")
		WebElement notfound;
		
		@FindBy(css="#PRICE > span > span")
		WebElement price;
		
		@FindBy(xpath = "//*[@id=\"PRICE\"]/span/i")
		WebElement pricetype;
		
		@FindBy(id = "gi_oneway_label_srp")
		WebElement checkoneway;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/span/span/button")
		WebElement book;
		
		@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/span/span/button")
		WebElement viewfare;
		
		@FindBy(xpath = "//*[@id='content']/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div[1]/div/div[1]/div[2]/span[2]/span/button")
		WebElement viewfare_book;

		public goibiboresult(WebDriver driver) 
		{
			this.Driver = driver;
			PageFactory.initElements(driver, this);
		}

		public WebElement getPrice() {
			return price;
		}

		public WebElement getBook() {
			return book;
		}

		public WebElement getPricetype() {
			return pricetype;
		}

		public WebElement getCheckoneway() {
			return checkoneway;
		}

		public WebElement getViewfare() {
			return viewfare;
		}

		public WebElement getViewfare_book() {
			return viewfare_book;
		}

		public WebElement getNotfound() {
			return notfound;
		}
		
		
		
}
