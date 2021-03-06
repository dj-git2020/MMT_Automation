package tests;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import testUtils.Base;

public class LoginPageTest extends Base{
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeClass
	public void setUp()
	{
		driver = initializeDriver();
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.getLogin().click();
		log.info("LoginPageTest: Driver initialized..... and login link clicked");
	}
	
	@Test(dataProvider="getData")
	public void validateLoginPage(String userName, String password)
	{

		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.getEmail().sendKeys(userName);
		lpo.getPassword().sendKeys(password);
		lpo.getLogin().click();
		
		log.info("LoginPageTest: Page submitted with username: " + userName + " password: " + password);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "dhananjaypandey06@gmail.com";
		data[0][1] = "helloworld";
		
		data[1][0] = "asswhole@gmail.com";
		data[1][1] = "helloworld";
		
		return data;

	
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		log.info("LoginPageTest: Driver closed....");
	}


}
