package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GPPLoginPage {

	public WebDriver driver;
	
	public GPPLoginPage(WebDriver driver1) // constructor
	{
			this.driver=driver1;
	}
	
	//WebElement elem = driver.findElement(By.xpath("//input[@id='signin-username-field']"));
	
	By username = By.xpath("//input[@id='signin-username-field']");
	By password = By.xpath("//input[@id='signin-password-field']");

	By loginbutton = By.xpath("//span[text()='LOGIN']");
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Loginbutton()
	{
		return driver.findElement(loginbutton);
	}
}
