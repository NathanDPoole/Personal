package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Overview {
	
	static WebElement e =null;
	
	public static WebElement settings(WebDriver d) {
		e = d.findElement(By.xpath("//a[@href=\"settings\"]"));
		return e;
	}
	
	public static WebElement filter(WebDriver d) {
		e = d.findElement(By.xpath("//button[@class=\"md-icon-button md-button md-ink-ripple\"]"));
		return e;
	}
	
	public static WebElement filter1(WebDriver d) {
		e = d.findElement(By.xpath("//button[@ng-click=\"hCtrl.batchFilter = \'Active\'\"]"));
		return e;
	}
	
	public static WebElement filter2(WebDriver d) {
		e = d.findElement(By.xpath("//button[@ng-click=\"hCtrl.batchFilter = \'Upcoming\'\"]"));
		return e;
	}
	
	public static WebElement filter3(WebDriver d) {
		e = d.findElement(By.xpath("//button[@ng-click=\"hCtrl.batchFilter = \'All\'\"]"));
		return e;
	}
	
	public static WebElement export(WebDriver d) {
		e = d.findElement(By.xpath("//button[@ng-click=\"hCtrl.exportTable()\"]"));
		return e;
	}
	
	public static WebElement nameOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"name\"]"));
		return e;
	}
	
	public static WebElement curriculumOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"curriculum.name\"]"));
		return e;
	}
	
	public static WebElement trainerOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"trainer.firstName\"]"));
		return e;
	}
	
	public static WebElement locationOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"batchLocation.locationName\"]"));
		return e;
	}
	
	public static WebElement buildingOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"batchLocation.buildingName\"]"));
		return e;
	}
	
	public static WebElement roomOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"batchLocation.roomName\"]"));
		return e;
	}
	
	public static WebElement startDateOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"startDate\"]"));
		return e;
	}
	
	public static WebElement endDateOrder(WebDriver d) {
		e = d.findElement(By.xpath("//th[@md-order-by=\"endDate\"]"));
		return e;
	}
	

}
