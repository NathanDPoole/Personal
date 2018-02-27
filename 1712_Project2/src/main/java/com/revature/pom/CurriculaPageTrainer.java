package com.revature.pom;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurriculaPageTrainer {

//	static WebElement e = null;
//	static List<WebElement> l = null;

//---------------------------------Core Curricula Section-------------------------------------

	// CORE CURRICULA TOGGLE CONTENTS BUTTON
//	public static WebElement CurriculaToggleContent(WebDriver d) {
//		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button"));
//		return e;
//	}

//-------------------------Focuses Section------------------------------------------------------

//	public static WebElement focusesToggleContent(WebDriver d) {
//		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[2]/md-toolbar/div/button"));
//		return e;
//	}
	
	public CurriculaPageTrainer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button")
	public WebElement curriculaTogleContent;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content/md-card[2]/md-toolbar/div/button")
	public WebElement focusesToggleContent;

}
