package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	WebDriver driver;
	// xpath elements

	By login = By.xpath("//span[text()='Login']");
	By lnkHome = By.xpath("//a[text()='Home']");
	By lnkCourses = By.xpath("//a[text()='Courses']");
	By lnkVideos = By.xpath("//a[text()='Videos']");
	By lnkInterviewGuide = By.xpath("//a[text()='Interview Guide']");
	By lnkPractice = By.xpath("//a[text()='Practice']");
	By lnkBlog = By.xpath("//a[text()='Blog']");
	By lnkAbout = By.xpath("//a[text()='About']");
	By lnkContact = By.xpath("//a[text()='Contact']");
	By imgLogo = By.xpath("//img[@class='img-responsive logo']");
	By lnkRegister = By.xpath("//span[text()='Register']");
	
	

	/*
	 * CSS elements
	 * 
	 * 
	 * 
	 */
	
	
	By featuredCourses = By.cssSelector("#content > div > div > h2");

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getLogo()
	{
		return driver.findElement(imgLogo);
	}
	
	public WebElement getRegister()
	{
		return driver.findElement(lnkRegister);
	}
	public WebElement getVideos() {
		return driver.findElement(lnkVideos);
	}

	public WebElement getPractice() {
		return driver.findElement(lnkInterviewGuide);
	}

	public WebElement getBlog() {
		return driver.findElement(lnkBlog);
	}

	public WebElement getAbout() {
		return driver.findElement(lnkAbout);
	}

	public WebElement getContact() {
		return driver.findElement(lnkContact);
	}

	public WebElement getHomeLink() {
		return driver.findElement(lnkHome);
	}

	public WebElement getLogin() {
		return driver.findElement(login);

	}

	public WebElement getFeatureLogo() {
		return driver.findElement(featuredCourses);
	}

}
