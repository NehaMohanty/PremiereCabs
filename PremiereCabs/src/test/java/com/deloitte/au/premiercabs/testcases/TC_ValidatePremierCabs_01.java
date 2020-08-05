package com.deloitte.au.premiercabs.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.deloitte.au.premiercabs.pageobjects.homePage;



public class TC_ValidatePremierCabs_01 extends BaseClass {
	

	@Test
	public void validatePremierCabs() throws InterruptedException {
		homePage hp= new homePage(driver);
		
		//verifying the categories of all the cabs
		Assert.assertTrue(hp.getStandardTaxiTitle());
		System.out.println("Title verified for standard taxi ");
		Assert.assertTrue(hp.getprestigeServiceTitle());
		System.out.println("Title verified for prestigeService ");
		Assert.assertTrue(hp.getsilverTopTitle());
		System.out.println("Title verified for silverTop ");
		Assert.assertTrue(hp.getmaxiTopTitle());
		System.out.println("Title verified for maxiTop ");
		Assert.assertTrue(hp.getstationWagonTitle());
		System.out.println("Title verified for stationWagon ");
		System.out.println("verified all categories of taxis");
		
		//validating the tabs
		Assert.assertTrue(hp.HomeTab());
		System.out.println("Home tab is validated ");
		Assert.assertTrue(hp.servicesTab());
		System.out.println("Services tab is validated ");
		Assert.assertTrue(hp.fareEstimator());
		System.out.println("fareEstimator tab is validated ");
		Assert.assertTrue(hp.news());
		System.out.println("news tab is validated ");
		Assert.assertTrue(hp.contactUs());
		System.out.println("contactUs tab is validated ");
	}
	
	
}