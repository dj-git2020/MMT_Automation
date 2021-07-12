package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import constants.Constants;
import pageObjects.HomePageObjects;
import testUtils.Base;
import testUtils.ReExecute;

public class HomePageTest extends Base{

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void setUp()
	{
		driver = initializeDriver();
		log.info("HomePageTest: Driver initialized...");
	}
	static int count = 0;
	@Test
	public void homePageValidation()
	{
	
		HomePageObjects hpo = new HomePageObjects(driver);
		if(count != 0)
		Assert.assertEquals(hpo.getFeatureLogo().getText(), Constants.FEATURED_COURSES);
		
	
		Assert.assertTrue(hpo.getHomeLink().isDisplayed());
	
		System.out.println("Execution Seq: " +count++);
		
		log.info("HomePageTest: Home page menu validation completed....");
		//hpo.getLogin().click();
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();;
		log.info("Driver closed...");
	}

}
