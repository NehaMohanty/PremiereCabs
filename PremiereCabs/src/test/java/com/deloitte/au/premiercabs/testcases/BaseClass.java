package com.deloitte.au.premiercabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public String baseUrl = "https://www.premiercabs.com.au/";
	public static JavascriptExecutor JSExec;
	static Actions keyBoard;

	@BeforeClass
	public void LaunchPremierCabs() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();

	}

	public static void moveToElement(By locator) {
		keyBoard = new Actions(driver);
		keyBoard.moveToElement(driver.findElement(locator)).build().perform();
	}

	public static void highlightElement(WebDriver driver, By locator) {
		// Creating JavaScriptExecuter Interface
		JSExec = (JavascriptExecutor) driver;
		JSExec.executeScript("arguments[0].style.border='6px groove yellow'", driver.findElement(locator));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JSExec.executeScript("arguments[0].style.border=''", driver.findElement(locator));
	}


	@AfterClass
	public void QuitPremierCabs() {

		System.out.println("Closing all browsers");
		driver.quit();

	}

}
