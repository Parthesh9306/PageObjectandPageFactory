package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GPPHomePage {

public WebDriver driver;
	
	public GPPHomePage(WebDriver driver1) // constructor
	{
			this.driver=driver1;
	}
	
	//WebElement elem = driver.findElement(By.xpath("//input[@id='signin-username-field']"));
	
	By Business_setup = By.xpath("//button[@id='system_navigation.MAINTAB_BUSINESS_CONFIGURATION']");
	//By password = By.xpath("//input[@id='signin-password-field']");

	//By loginbutton = By.xpath("//span[text()='LOGIN']");
	
	
	public WebElement Business_setup_link()
	{
		return driver.findElement(Business_setup);
	}
	
	
}
