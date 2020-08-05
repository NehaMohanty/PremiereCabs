package com.deloitte.au.premiercabs.testcases;

import org.testng.annotations.Test;

import com.deloitte.au.premiercabs.pageobjects.homePage;
import com.deloitte.au.premiercabs.pageobjects.portalLoginPage;

public class TC_ValidateDriverPortalLogin_02 extends BaseClass{
	
	@Test
	public void validateDriverPortalLogin() throws InterruptedException {
		
		homePage hp= new homePage(driver);
		hp.navigateToDriverServices();
		hp.Click_DriverPortal();
		
		portalLoginPage pl= new portalLoginPage(driver);
		pl.Login();
		pl.ErrorIsDisplayed();
		
		
		
	}

}
