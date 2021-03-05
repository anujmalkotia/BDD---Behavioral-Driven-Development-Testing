package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.ss.usermodel.DataFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableComponents {
	public static Properties prop;
	DataFormatter formatter = new DataFormatter();
	FileInputStream fis;
	
	public String getProperty(String key) throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("D:\\BDD_CUCUMBER_SELENIUM\\Gillette\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
	}
	
	public String getpagetitle(WebDriver Driver)
	{
		String title=Driver.getTitle();
		return title;
	}
	
	public void dropdownbyvisible(WebElement option,String value)
	{
		Select sel=new Select(option);
		sel.selectByVisibleText(value);
	}

	
	
	public FileInputStream getFis(String path) throws IOException {
		fis= new FileInputStream(path);
		return fis;
	}
	
	
	public void monthandyrselcombine(WebDriver Driver,WebElement mndy,WebElement z,String mmyy)
    {
       
        while(true)
        {
            if(mndy.getText().equalsIgnoreCase(mmyy))
            break;
            else
            z.click();
        }
    }
   

}
