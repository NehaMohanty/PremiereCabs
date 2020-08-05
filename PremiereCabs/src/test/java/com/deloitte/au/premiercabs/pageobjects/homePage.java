package com.deloitte.au.premiercabs.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.deloitte.au.premiercabs.testcases.BaseClass;

import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver driver;

	public homePage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	// Standard Taxi
	private static final By standardTaxi_xpath = By.xpath("//h3[text()='Standard Taxi']");


	// Prestige Service
	private static final By prestigeService_xpath =By.xpath("//h3[text()='Prestige Service']");
	
	// Silver Top
	private static final By silverTop_xpath =By.xpath("//h3[text()='Silver Top']");
	
	// Maxi Taxi
	private static final By maxiTop_xpath =By.xpath("//h3[text()='Maxi Taxi']");
	
	// Station Wagon
	private static final By stationWagon_xpath =By.xpath("//h3[text()='Station Wagon']");
	
	// Home Tab
	private static final By homeTab_xpath =By.xpath("//ul[@id='menu-header_menu-1']/li/a[text()='Home']");
	
	// Services Tab
	private static final By servicesTab_xpath =By.xpath("//ul[@id='menu-header_menu-1']/li/a[text()='Services']");
	
	// Fare Estimator
	private static final By fareEstimator_xpath =By.xpath("//ul[@id='menu-header_menu-1']/li/a[text()='Fare Estimator']");
	
	// News
	private static final By news_xpath =By.xpath("//ul[@id='menu-header_menu-1']/li/a[text()='News']");
	
	// Contact Us
	private static final By contactUs_xpath =By.xpath("//ul[@id='menu-header_menu-1']/li/a[text()='Contact Us']");
	
	//Driver Services
	private static final By driverServices_xpath =By.xpath("//ul[@id='menu-header_menu-1']/li/a[text()='Driver Services']");
	
	//Driver Portal Login
	private static final By driverPortalLogin_xpath= By.xpath("(//*[text()='Driver Portal Login'])[2]");
	

	public boolean getStandardTaxiTitle() throws InterruptedException {
		boolean flg = false;
		if (driver.findElements(standardTaxi_xpath).size() == 1) {
			System.err.println("Text Captured :" + driver.findElement(standardTaxi_xpath).getText());
			flg = true;
			BaseClass.moveToElement(standardTaxi_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, standardTaxi_xpath);
		}
		return flg;

	}
	
	public boolean getprestigeServiceTitle() throws InterruptedException {
		boolean flg = false;
		if (driver.findElements(prestigeService_xpath).size() == 1) {
			System.err.println("Text Captured :" + driver.findElement(prestigeService_xpath).getText());
			flg = true;
			BaseClass.moveToElement(prestigeService_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, prestigeService_xpath);
		}
		return flg;

	}
	
	public boolean getsilverTopTitle() throws InterruptedException {
		boolean flg = false;
		if (driver.findElements(silverTop_xpath).size() == 1) {
			System.err.println("Text Captured :" + driver.findElement(silverTop_xpath).getText());
			flg = true;
			BaseClass.moveToElement(silverTop_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, silverTop_xpath);
		}
		return flg;

	}
	
	public boolean getmaxiTopTitle() throws InterruptedException {
		boolean flg = false;
		if (driver.findElements(maxiTop_xpath).size() == 1) {
			System.err.println("Text Captured :" + driver.findElement(maxiTop_xpath).getText());
			flg = true;
			BaseClass.moveToElement(maxiTop_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, maxiTop_xpath);
		}
		return flg;

	}	
	public boolean getstationWagonTitle() throws InterruptedException {
		boolean flg = false;
		if (driver.findElements(stationWagon_xpath).size() == 1) {
			System.err.println("Text Captured :" + driver.findElement(stationWagon_xpath).getText());
			flg = true;
			BaseClass.moveToElement(stationWagon_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, stationWagon_xpath);
		}
		return flg;

	}
	
	public boolean HomeTab() throws InterruptedException {
		boolean flg = false;
		if (driver.findElement(homeTab_xpath).isDisplayed()) {
			System.err.println("Home tab displayed is :" + driver.findElement(homeTab_xpath).isDisplayed());
			flg = true;
			BaseClass.moveToElement(homeTab_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, homeTab_xpath);
		}
		return flg;

	}
	
	public boolean servicesTab() throws InterruptedException {
		boolean flg = false;
		if (driver.findElement(servicesTab_xpath).isDisplayed()) {
			System.err.println("Services tab displayed is :" + driver.findElement(servicesTab_xpath).isDisplayed());
			flg = true;
			BaseClass.moveToElement(servicesTab_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, servicesTab_xpath);
		}
		return flg;

	}
	
	
	public boolean fareEstimator() throws InterruptedException {
		boolean flg = false;
		if (driver.findElement(fareEstimator_xpath).isDisplayed()) {
			System.err.println("fareEstimator tab displayed is :" + driver.findElement(fareEstimator_xpath).isDisplayed());
			flg = true;
			BaseClass.moveToElement(fareEstimator_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, fareEstimator_xpath);
		}
		return flg;

	}
	
	public boolean news() throws InterruptedException {
		boolean flg = false;
		if (driver.findElement(news_xpath).isDisplayed()) {
			System.err.println("news tab displayed is :" + driver.findElement(news_xpath).isDisplayed());
			flg = true;
			BaseClass.moveToElement(news_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, news_xpath);
		}
		return flg;

	}
	
	public boolean contactUs() throws InterruptedException {
		boolean flg = false;
		if (driver.findElement(contactUs_xpath).isDisplayed()) {
			System.err.println("ContactUs tab displayed is :" + driver.findElement(contactUs_xpath).isDisplayed());
			flg = true;
			BaseClass.moveToElement(contactUs_xpath);
			Thread.sleep(2000);
			BaseClass.highlightElement(driver, contactUs_xpath);
		}
		return flg;

	}
	
	public void navigateToDriverServices() throws InterruptedException {
		
		driver.findElement(driverServices_xpath).click();
		
		System.out.println("driver services tab clicked!!!");
		Thread.sleep(5000);
	}
	
	public void Click_DriverPortal() throws InterruptedException {
		BaseClass.moveToElement(driverPortalLogin_xpath);
		Thread.sleep(2000);
		BaseClass.highlightElement(driver, driverPortalLogin_xpath);
		
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		driver.findElement(driverPortalLogin_xpath).click(); // click some link that opens a new window

		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		Thread.sleep(2000);
		//code to do something on new window

//		driver.close(); // close newly opened window when done with it
//		driver.switchTo().window(parentHandle); // switch back to the original window
		
		
	}
	
	


}
