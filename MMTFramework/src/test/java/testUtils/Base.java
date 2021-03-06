package testUtils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import constants.Constants;

public class Base {

	Properties prop;
	String browserName = "";
	protected WebDriver driver = null;
	public  WebDriver initializeDriver()
	{

	

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + Constants.GLOBAL_PROPERTIES_FILE);
			prop.load(fis);
			browserName = prop.getProperty("browser");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(Constants.CHROME_DRIVER,
					System.getProperty("user.dir") + Constants.GLOBAL_DRIVERS_FOLDER + "chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.out.println(System.getProperty("user.dir") + Constants.GLOBAL_DRIVERS_FOLDER + "geckodriver.exe");
			System.setProperty(Constants.FIREFOX_DRIVER,
					System.getProperty("user.dir") + Constants.GLOBAL_DRIVERS_FOLDER + "geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			
			  System.setProperty(Constants.IE_DRIVER, System.getProperty("user.dir") +
			  Constants.GLOBAL_DRIVERS_FOLDER + "IEDriverServer.exe"); 
			  driver = new InternetExplorerDriver() ;
			 
		}else if (browserName.equalsIgnoreCase("edge")) {
			
			  System.setProperty(Constants.EDGE_DRIVER, System.getProperty("user.dir") +
			  Constants.GLOBAL_DRIVERS_FOLDER + "msedgedriver.exe"); 
			  driver = new EdgeDriver() ;
			 
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.GLOBAL_SYNCHRONISATION_TIMEOUT,TimeUnit.SECONDS);
		
		
	
		
		
		return driver;
		//driver.close();


	}
	
	public String getScreenShotPath(String tcName,WebDriver driver)
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	
		  String screenShotPath = System.getProperty("user.dir") +
		  Constants.GLOBAL_SCREENSHOTS_FLODER + tcName + ".png" ; 
		  
		  try{
		        org.apache.commons.io.FileUtils.copyFile(source, new File(screenShotPath)); 
		      //  return screenShotPath;
		  }
		  catch (IOException e) 
		  { // TODO Auto-generated catch block
		    e.printStackTrace(); 
		  
		  }
		return screenShotPath;
		 		
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializeDriver();	
	}

}
