package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on Net Banking landing Page$")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("One");

	}

	@When("^User log into Application with Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_log_into_application_with_username_something_and_password_something(String strArg1,
			String strArg2) {
		// write login code
		System.out.println("Two");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("Three");

	}

	@And("^cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) {
		System.out.println("Four");
	}

}
