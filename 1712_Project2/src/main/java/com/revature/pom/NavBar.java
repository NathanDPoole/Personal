package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBar {
	
	public NavBar (WebDriver wd) {
		PageFactory.initElements(wd,this);
	}
	
	@FindBy(xpath="//a[@href='home']")
	public WebElement home;
	
	@FindBy(xpath="//a[@href='batches']")
	public WebElement batches;
	
	@FindBy(xpath="//a[@href='locations']")
	public WebElement locations;
	
	@FindBy(xpath="//a[@href='curriculum']")
	public WebElement curriculum;
	
	@FindBy(xpath="//a[@href='trainers']")
	public WebElement trainers;
	
	@FindBy(xpath="//a[@href='reports']")
	public WebElement reports;
	
	///html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a
	@FindBy(xpath="//a[@href=\"settings\"]")
	public WebElement settings;
	
	@FindBy(xpath="//button[@class=\"_md-nav-button md-accent md-button ng-scope md-ink-ripple md-unselected\"]")
	public WebElement logout;

}
