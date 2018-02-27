package com.revature.cukes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryToursCukes {

	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String url){
		MercuryTours.openApp(url);
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String user, String pass){
		MercuryTours.login(user, pass);
	}

	@Then("^I should see the home page$")
	public void i_should_see_the_home_page(){
		MercuryTours.closeApp();
	}
	

}
