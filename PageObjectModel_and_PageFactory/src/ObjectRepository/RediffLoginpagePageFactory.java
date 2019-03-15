package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePageFactory {

	public WebDriver driver;
	
	public RediffLoginpagePageFactory(WebDriver driver1) // constructor
	{
			this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	//WebElement elem = driver.findElement(By.xpath("//input[@id='signin-username-field']"));
	
	@FindBy(xpath="//input[@id='signin-username-field']")
	@CacheLookup
	WebElement username;
	
	
	/*@FindBy(how = How.NAME , using = "Firstname")
	WebElement username1;*///another method
	
	@FindBy(xpath="//input[@id='signin-password-field']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@id='signin-password-field']")
	WebElement Loginbutton;
	
	
	public WebElement Username()
	{
		return username;
	}
	
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Loginbutton()
	{
		return Loginbutton;
	}
}
