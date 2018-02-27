package com.revature.cukes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HelloWorld {
	
	@Given("^I have (\\d+) dollars in my account$")
	public void i_have_dollars_in_my_account(int arg1) {
		System.out.println("bank Given method");
	}

	@When("^I try to withdraw (\\d+) from my account$")
	public void i_try_to_withdraw_from_my_account(int arg1){
		System.out.println("bank When method");
	}

	@Then("^I should be able to see teh remaining balance of (\\d+) dollars$")
	public void i_should_be_able_to_see_teh_remaining_balance_of_dollars(int arg1){
		System.out.println("bank Then method");
	}
	
	@Given("^there are (\\d+) cucumbers$")
	public void there_are_cucumbers(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cucucmber given method");
	}

	@When("^I eat (\\d+) cucumbers$")
	public void i_eat_cucumbers(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cucucmber when method");

	}

	@Then("^I should have (\\d+) cucumbers left$")
	public void i_should_have_cucumbers_left(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cucucmber then method");

	}
	
	@Given("^I loged in as \"([^\"]*)\"$")
	public void i_loged_in_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("logend in as "+arg1);
	}

	@When("^I try to post a Question about \"([^\"]*)\"$")
	public void i_try_to_post_a_Question_about(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("posting qustion about "+arg1);
	}

	@Then("^I should see my question posted in the form with \"([^\"]*)\"$")
	public void i_should_see_my_question_posted_in_the_form_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("got "+arg1);
	}
	
	@Given("^they are in my fridge$")
	public void they_are_in_my_fridge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("looking in fridge");
	}

	@When("^nobody cleans my fridge in the meantime$")
	public void nobody_cleans_my_fridge_in_the_meantime() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("fridge check: full");
	}

	@Then("^if somebody cleans the fridge before dinner$")
	public void if_somebody_cleans_the_fridge_before_dinner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("fridge check: clean");
	}

	@Then("^I'm not sure how many ar left$")
	public void i_m_not_sure_how_many_ar_left() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("how many cukes?");
	}
}
