package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locations {

static WebElement e =null;

static int i = 0;

//high level locations class='md-no-style md-button md-ink-ripple'

//div class="md-list-item-inner"

//List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-condensed table-hover event-list']/tbody/tr"));
//System.out.println(rows.size());
public static int count(WebDriver d) {
	int iCount = 0;
iCount = d.findElements(By.xpath("//div[class=\"md-list-item-inner\"]")).size();
return iCount;
}

	public static WebElement hq(WebDriver d) {
		e = d.findElement(By.xpath("//button[class=\"md-no-style md-button md-ink-ripple\"]"));
		return e;
	}
	
	public static WebElement reston(WebDriver d) {
		e = d.findElement(By.xpath("//button[starts-with(@aria-label,'Reston 11730')]"));
		return e;
	}
	
	public static WebElement ny(WebDriver d) {
		e = d.findElement(By.xpath("//button[starts-with(@aria-label,'New York')]"));
		return e;
	}
	
	
}
