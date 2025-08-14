package com.BookFlight.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BookFlight.pom.HomePage;

public class TestCases {
	
	WebDriver driver;

	@BeforeTest
	public void launchChromeBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void searchFlightTickets() throws InterruptedException 
	{
		HomePage homepage= new HomePage(driver);
		homepage.closePopUp();
		homepage.animationPopUp();
		homepage.clickRoundTripBtn();
		homepage.enterSourceCity("Pune");
		homepage.enterDestinationCity("Mumbai");
		homepage.selectDepartureDate();
		homepage.selectReturnDate();
		homepage.clickSearchBtn();
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
	}
}
