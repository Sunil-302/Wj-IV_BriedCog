package automation.wj4_briefcog_test.stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dummy_Steps {
	@Given("^i will invoke he browser$")
	public void i_will_invoke_he_browser() throws Throwable {
		System.out.println("I WILL INVOKE THE BROWSER");
	}

	@Given("^I will be inside the car$")
	public void i_will_be_inside_the_car() throws Throwable {
		System.out.println("I WILL BE INSIDE THE CAR");
	}

	@Given("^i willbe on the road$")
	public void i_willbe_on_the_road() throws Throwable {
		System.out.println("I WILL BE ON THE ROAD");
	}

	@When("^I start the car$")
	public void i_start_the_car() throws Throwable {
		System.out.println("I START THE CAR");
	}

	@When("^I check for the (.+) of the$")
	public void i_check_for_the_of_the(String gear) throws Throwable {
		System.out.println("I WILL CHECK FOR THE GEAR = " + gear + "");
	}

	@Then("^i will login$")
	public void i_will_login() throws Throwable {
		System.out.println("I WILL PROVIDE LOGIN CREDS");
	}

	@Then("^i will see the fuel gage$")
	public void i_will_see_the_fuel_gage() throws Throwable {
		System.out.println("I WILL CHECK THE FUEL");
	}

	@Then("^I will change to (.+) gear$")
	public void i_will_change_to_gear(String number) throws Throwable {
		System.out.println("I WILL CHANGE THE gear NUMBER = " + number + "");
	}
	
	@Given("I will be inside the car Xuv300")
	public void i_will_be_inside_the_car_xuv300() {
		System.out.println("I WILL BE INSIDE THE CAR XUV300");
	
	}

}
