package com.BookFlight.pom;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage { 

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	By close= By.xpath("//span[@class=\"commonModal__close\"]");
	By aniClose= By.xpath("//span[@data-testid='travel-card-close']");
	By roundTripButton = By.xpath("//li[@data-cy='roundTrip']") ;
	By sourceCity = By.id("fromCity");
	By sourceSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
	By destinationCity = By.id("toCity");
	By destinationSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
	By searchButton = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
	 
	
	//Action methods:
	public void closePopUp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(close).click();
		Thread.sleep(2000);
	}
	
	public void animationPopUp() throws InterruptedException 
	{
		driver.findElement(aniClose).click();
		Thread.sleep(2000);
		
	}
	
	public void clickRoundTripBtn() throws InterruptedException
	{
		driver.findElement(roundTripButton).click();
		Thread.sleep(2000);
	}
	
	public void enterSourceCity(String fromCity) throws InterruptedException
	{
		driver.findElement(sourceCity).click();
		Thread.sleep(2000);
		driver.findElement(sourceSearchBox).sendKeys(fromCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+fromCity+"']")).click();
	}
	
	public void enterDestinationCity(String toCity) throws InterruptedException
	{
		driver.findElement(destinationCity).click();
		Thread.sleep(2000);
		driver.findElement(destinationSearchBox).sendKeys(toCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+toCity+"']")).click();
	}
	
	public void selectDepartureDate()throws InterruptedException {
	    // Open the date picker first
	    driver.findElement(By.xpath("//label[@for='departure']")).click();
	    Thread.sleep(2000);
	    
	    // Optional: navigate to correct month if needed
	    while (driver.findElements(By.xpath("//div[@aria-label='Tue Aug 12 2025']")).isEmpty()) {
	        driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	    }
	}

	
	public void selectReturnDate()throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@aria-label='Fri Aug 15 2025']")).click();
		//Thread.sleep(2000);
		
	}
	
	public void clickSearchBtn()throws InterruptedException
	{
//		 Thread.sleep(4000);
//		driver.findElement(searchButton).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    // Wait for calendar overlay to disappear
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("DayPicker-Day")));
		    // Wait for search button to become clickable
		    WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//a[contains(@class,'primaryBtn') and contains(@class,'widgetSearchBtn')]")
		    ));
		    searchBtn.click();
	}
	
}
