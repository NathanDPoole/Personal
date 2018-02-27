package com.revature.pom;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	static WebDriver wd = null;
	static NavBar nav =null;
	
	/****Configuration variables****/ 
	
	static int d=1500;					//global delay modifier
	static String driver="firefox";		//legal inputs = firefox, chrome
	static String user="vp";			//legal inputs = vp, trainer
	
	public static void main(String[] args) {
		loadDriver(driver);
		testMethod(user);
	}

	private static void loadDriver(String s) {
		if(s.equals("firefox")) {
			File f1 = new File("src/main/resources/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", f1.getAbsolutePath());
			wd = new FirefoxDriver();
		}
		if(s.equals("chrome")) {
			File f1 = new File("src/main/resources/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
			wd = new ChromeDriver();
		}
		
		wd.get("https://dev.assignforce.revaturelabs.com");
		
	}
	

	private static void testMethod(String user) {
		
		loginTest(user);
		nav=new NavBar(wd);
		
		//The longest delay is after login. 8 seconds should be enough
		delay(8000);
		
		overviewTest();
		//locationsTest();
		
		
		/*
		nav.batches.click();delay(d);
		nav.locations.click();delay(d);
		nav.curriculum.click();delay(d);
		nav.trainers.click();delay(d);
		nav.reports.click();delay(d);
		nav.settings.click();delay(d);
		nav.logout.click();delay(d);
		*/
	}
	
	private static void loginTest(String user) {
		LoginPage login = new LoginPage(wd);
		
		if(user.equals("vp")) {
			login.username.sendKeys("test.vpoftech@revature.com.int1");
			login.password.sendKeys("p@$$w0rd1");
		}
		if(user.equals("trainer")) {
			login.username.sendKeys("test.trainer@revature.com.int1");
			login.password.sendKeys("p@$$w0rd2");
		}
		
		login.Login.submit();
	}
	
	private static void locationsTest() {
		
		nav.locations.click();delay(d);
		
		//Locations.hq(wd).click();delay(d);
		
		Locations.reston(wd).click();delay(d);
		
		Locations.ny(wd).click();delay(d);
		
	}
	
	private static void overviewTest() {
		
		nav.home.click();delay(d);
		
		//Overview.export(wd).click();delay(d);
		
		//Iterates through the 3 filters: in progress, beginning in 2 weeks, all
		//For each filter - iterate through each of the ordering titles
		for(int n=1; n<4;n++) {
			Overview.filter(wd).click();delay(d);
			switch(n) {
			case 1: Overview.filter1(wd).click();delay(d);break;
			case 2: Overview.filter2(wd).click();delay(d);break;
			default:Overview.filter3(wd).click();delay(d);break;
			}
			Overview.nameOrder(wd).click();delay(d);
			Overview.curriculumOrder(wd).click();delay(d);
			Overview.trainerOrder(wd).click();delay(d);
			Overview.locationOrder(wd).click();delay(d);
			Overview.buildingOrder(wd).click();delay(d);
			Overview.roomOrder(wd).click();delay(d);
			Overview.startDateOrder(wd).click();delay(d);
			Overview.endDateOrder(wd).click();delay(d);	
		}
	}
	
	static void closeApp(){
		delay(3000);
		wd.quit();		
	}
	
	static void delay(int x) {
	try {
		Thread.sleep(x);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}	
}

