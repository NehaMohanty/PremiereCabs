package com.deloitte.au.premiercabs.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class portalLoginPage {

	WebDriver driver;
	
	public portalLoginPage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	//MTData Login No
	private static final By MTDLogin_xpath = By.xpath("//input[@id='u_username']");
	
	//Pin
	private static final By Pin_xpath = By.xpath("//input[@id='u_password']");
	
	//loginButton
	private static final By Login_btn_xpath = By.xpath("//input[@id='loginButton']");
	
	//Error
	private static final By Err_msg_xpath = By.xpath("//label[text()='The MTData Login No. or Pin was incorrectly entered']");
	
	public void Login() {
		
		driver.findElement(MTDLogin_xpath).sendKeys("1234");
		driver.findElement(Pin_xpath).sendKeys("2324");
		driver.findElement(Login_btn_xpath).click();
		}
	
	public boolean ErrorIsDisplayed() {
		boolean flg=false;
		if(driver.findElement(Err_msg_xpath).isDisplayed())
		{
			System.out.println("Unable to Login");
		
		}
		return flg;
	
	
	
	}
	
	
}
