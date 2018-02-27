package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

	public SettingsPage (WebDriver wd) {
		PageFactory.initElements(wd,this);
	}
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_3\"]")
	public WebElement timelineTrainersPerPage;
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_4\"]")
	public WebElement reportsOutgoingGrads;
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_5\"]")
	public WebElement reportsCandidatesIncoming;
	
	//drop-down list
		/* Locations [subject to change]:
		 * 	Revature HQ
		 * 	Test Location
		 * 	Tempe
		 * 	New York City
		 * 	Shenanigans
		 * 	Paul's Mansion
		 * 	Maryland Location
		 * 	Ribbit
		 * 	TestLocation
		 */
	@FindBy(xpath="//*[@id=\"select_value_label_1\"]")
	public WebElement defaultBatchLocation;
	
	//drop-down list
	//choices:
	//	Campus
	@FindBy(xpath="//*[@id=\"select_8\"]")
	public WebElement defaultBatchBuilding;
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_10\"]")
	public WebElement minimumBatchSize;
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_11\"]")
	public WebElement maximumBatchSize;
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_12\"]")
	public WebElement defaultBatchLengh;
	
	//text box integer
	@FindBy(xpath="//*[@id=\"input_13\"]")
	public WebElement minimumDayBetweenTrainerBatches;
	
	//button
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]")
	public WebElement saveBtn;
	
	//button
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content/md-list/section/button[2]")
	public WebElement resetBtn;
	
	
	
}
