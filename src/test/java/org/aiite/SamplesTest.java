package org.aiite;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SamplesTest {
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("Before Step");
	}
		
	@AfterStep
	public void afterStep() {
		System.out.println("After Step");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Given step");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		 System.out.println("And Given step");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("When step");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("And Given step1");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("And When step2");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Then step");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("And Then step");
	}

}
