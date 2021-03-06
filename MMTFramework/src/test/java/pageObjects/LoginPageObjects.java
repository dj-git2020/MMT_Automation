package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;
	
	// XPATH locator
	/*
	 * By txtEmail = By.xpath("//input[@id='user_email']"); By txtPassword =
	 * By.xpath("//input[@id='user_password']"); By btnLogin =
	 * By.xpath("//input[@name='commit']");
	 */	
	
	//CSS Locator
	
	By txtEmail = By.cssSelector("input[type='email']");
	//By txtPassword = By.cssSelector("input[id='user_password']");
	By txtPassword = By.cssSelector("input#user_password");
	By btnLogin = By.cssSelector("input[name='commit']");
	
	//By btnLogin = By.cssSelector("input.form-control.input-hg");

	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(txtEmail);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(txtPassword);
		
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(btnLogin);
	}
	
	

}
