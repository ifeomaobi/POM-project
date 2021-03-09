package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	Element Library - The WebElement or By class will not work with the Page Object module(POM)
/*	WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
	By USERNAME_FIELD_ELEMENT = By.xpath("//input[@id='username']");*/
	
//	This is the best method to use for the POM page
	@FindBy(how = How.XPATH, using = "//input[@id='username']") 
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") 
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@name='login']") 
	WebElement SIGNIN_BUTTON_FIELD;
	
//	Interactive Methods
//	In our Page Object Module, we are not allowed to pass our data like demo@techfios.com or abc123 in the login page
	public void enterUserName(String UserName) {
		USERNAME_FIELD.sendKeys(UserName);
		
	}
	public void enterPassword(String Password) {
		PASSWORD_FIELD.sendKeys(Password);
		
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_FIELD.click();
		
	}
	
//	OR YOU COULD USE THIS OTHER TECHNIQUE
	/*public void login(String UserName, String Password) {
		USERNAME_FIELD.sendKeys(UserName);
		PASSWORD_FIELD.sendKeys(Password);
		SIGNIN_BUTTON_FIELD.click();*/
		
	}
