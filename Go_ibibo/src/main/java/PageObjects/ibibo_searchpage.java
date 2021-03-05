package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ibibo_searchpage {
	public WebDriver driver;
	public ibibo_searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By view_fare = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/span/span/button");
	By vf_book_btn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[3]/div[2]/div[1]/div/div[1]/div[2]/span[2]/span/button");
	
	
	By book_ow = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/span/span/button");
	By book_round = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/span[2]/span/button");
	By book_multi = By.xpath("//*[@id=\"summaryDiv\"]/div[2]/div[2]/button");
	
	
	public WebElement getBook_ow() {
		return driver.findElement(book_ow);
	}
	public WebElement getBook_round() {
		return driver.findElement(book_round);
	}
	public WebElement getBook_multi() {
		return driver.findElement(book_multi);
	}
	public WebElement getView_fare() {
		return driver.findElement(view_fare);
	}
	public WebElement getVf_book_btn() {
		return driver.findElement(vf_book_btn);
	}

}
