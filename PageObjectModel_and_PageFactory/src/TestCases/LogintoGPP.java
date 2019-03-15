package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.GPPHomePage;
import ObjectRepository.GPPLoginPage;

public class LogintoGPP {

	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\SmartBear\\SoapUI-5.4.0\\bin\\ext\\IEDriverServer.exe");
		
		WebDriver driver1 = new InternetExplorerDriver();
		
      //System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
        //WebDriver driver = new InternetExplorerDriver();
        
        driver1.get("http://splinux27.fundtech.isr:14015/gpp/#!/user/signin");
        
        GPPLoginPage lo = new GPPLoginPage(driver1);
        
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        lo.Username().sendKeys("AUTO01");
        lo.Password().sendKeys("abc1234");
        lo.Loginbutton().click();
        GPPHomePage hp = new GPPHomePage(driver1);
        WebDriverWait wait = new WebDriverWait(driver1, 30);
        wait.until(ExpectedConditions.elementToBeClickable(hp.Business_setup_link()));
        hp.Business_setup_link().click();
        
	}
	
}
