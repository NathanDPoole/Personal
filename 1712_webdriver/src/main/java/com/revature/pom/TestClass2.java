package com.revature.pom;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	static WebDriver wd = null;
	
	@BeforeSuite
	private static void openApplication() {

		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		wd = new ChromeDriver();
		
	}

	@BeforeTest
	private static void login() {
		wd.get("http://newtours.demoaut.com");
		LoginPage.user(wd).sendKeys("yuvi1");
		LoginPage.password(wd).sendKeys("yuvi1");
		LoginPage.signin(wd).submit();
	}
	
	@Test(priority=0)
	private static void verifyLogin() {
		String s1 = wd.findElement(By.xpath("//a[@href=\"mercurysignoff.php\"]")).getText();
		assertEquals(s1, "SIGN_OFF");
	}
	
	
	@Test(enabled = true, priority=1)
	private static void navigateToFlightFinderPage() {
		
		
		FlightFinder.tripType(wd).click();
		FlightFinder.departFrom(wd).sendKeys("Paris");
		FlightFinder.arriveTo(wd).sendKeys("Frankfurt");
		FlightFinder.airline(wd).sendKeys("No Preference");
		FlightFinder.findFlightsButton(wd).click();
		
	}
	
	@Test(enabled = false)
	private static void testMethod2() {
		
		FlightFinder.tripType(wd).click();
		FlightFinder.departFrom(wd).sendKeys("Paris");
		FlightFinder.arriveTo(wd).sendKeys("Frankfurt");
		FlightFinder.airline(wd).sendKeys("No Preference");
		FlightFinder.findFlightsButton(wd).click();
		
	}
	
	@Test(enabled = false)
	private static void testMethod3() {
		
		FlightFinder.tripType(wd).click();
		FlightFinder.departFrom(wd).sendKeys("Paris");
		FlightFinder.arriveTo(wd).sendKeys("Frankfurt");
		FlightFinder.airline(wd).sendKeys("No Preference");
		FlightFinder.findFlightsButton(wd).click();
		
	}
	
	@AfterTest
	private static void logout() {
		
		Logout.signoff(wd).click();

	}
	
	@AfterSuite
	private static void closeApp(){
		wd.quit();
	}
}
