package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurriculaPageVP {

	static WebElement e = null;
	static List<WebElement> l = null;

	public CurriculaPageVP (WebDriver wd) {
		PageFactory.initElements(wd,this);
	}
//---------------------------------Core Curricula Section-------------------------------------
	// ADD NEW CURRICULUM BUTTON
	public static WebElement addNewCurriculum(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/" + "md-toolbar/div/button[1]"));
		return e;
	}

	// CORE CURRICULA TOGGLE CONTENTS BUTTON
	public static WebElement coreCurriculaToggleContent(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button[2]"));
		return e;
	}

//	// CORE CURRICULA LIST
//	public static List<WebElement> coreCurriculList(WebDriver d) {
//		l = d.findElements(By.xpath("//*[@id=\"core\"]/md-list/md-list-item/"));
//		return l;
//	}
//
//	// CORE CURRICULA EDIT CURRICULA BUTTON LIST
//	public static List<WebElement> editCurriculaBtnList(WebDriver d) {
//		l = d.findElements(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[*]/button[1]"));
//		return l;
//	}

	// CORE CURRICULA EDIT CURRICULA BUTTON SINGLE
	public static WebElement editCurriculaBtn(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[1]/button[1]"));
		return e;
	}

//	// CORE CURRICULA REMOVE CURRICULA BUTTON LIST
//	public static List<WebElement> removeCoreBtnList(WebDriver d) {
//		l = d.findElements(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[*]/button[2]"));
//		return l;
//	}

	// CORE CURRICULA REMOVE CURRICULA BUTTON SINGLE
	public static WebElement removeCoreBtn(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item[]/button[2]"));
		return e;
	}
	
	
	
	@FindBy(css="h4 + input[id^=\"input_\"]")
	public WebElement nameTextPopup;
	
	@FindBy(xpath="//*[@id=\"select_value_label_2\"]")
	public WebElement skillsDropdown;
	
	@FindBy(xpath="/html/body/div[3]/md-dialog/md-dialog-actions/button[1]")
	public WebElement addCurriculumCancelBtn;
	
	@FindBy(xpath="/html/body/div[3]/md-dialog/md-dialog-actions/button[2]")
	public WebElement addCurriculumSaveBtn;
//-------------------------Focuses Section------------------------------------------------------
	public static WebElement addNewFocus(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[2]/md-toolbar/div/button[1]"));
		return e;
	}

	public static WebElement focusesToggleContent(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[2]/md-toolbar/div/button[2]"));
		return e;
	}

//	// FOCUS LIST
//	public static List<WebElement> focusesList(WebDriver d) {
//		l = d.findElements(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item/"));
//		return l;
//	}
//
//	// FOCUS EDIT FOCUS BUTTON LIST
//	public static List<WebElement> editFocusBtnList(WebDriver d) {
//		l = d.findElements(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[*]/button[1]"));
//		return l;
//	}

	// FOCUS EDIT FOCUS BUTTON SINGLE
	public static WebElement editFocusBtn(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/button[1]"));
		return e;
	}

//	// FOCUS REMOVE FOCUS BUTTON LIST
//	public static List<WebElement> removeFocusBtnList(WebDriver d) {
//		l = d.findElements(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[*]/button[2]"));
//		return l;
//	}

	// FOCUS REMOVE FOCUS BUTTON SINGLE
	public static WebElement removeFocusBtn(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item[1]/button[2]"));
		return e;
	}

//-------------------------------------Skills Section------------------------------------------------------
	public static WebElement skillsToggleContent(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[3]/md-toolbar/div/button"));
		return e;
	}

	public static WebElement skillNameText(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"input_1\"]"));
		return e;
	}

	public static WebElement createBtn(WebDriver d) {
		e = d.findElement(By.xpath("//*[@id=\"skill\"]/form/div/div/div"));
		return e;
	}
}
