package covidStepDefinitions;

import java.io.IOException;

import covidSteps.covidSteps;
import io.cucumber.java.en.*;

public class covidTrackerStepDefinition {
	covidSteps covidsteps = new covidSteps();
	@Given("The user is on Covid Tracker Page")
	public void the_user_is_on_covid_tracker_page() throws IOException {
		covidsteps.isSiteLoaded();
		covidsteps.isUserOnLandingPage();
	}

	@When("The user selects the state from the dropdown")
	public void the_user_selects_the_state_from_the_dropdown() {
		covidsteps.selectDropdown();
	}

	@Then("The corresponding results are displayed.")
	public void the_corresponding_results_are_displayed() {
		covidsteps.isTotalCaseDiplayed();
		covidsteps.isActiveCasesDisplayed();
		covidsteps.isRecoveredDisplayed();
		covidsteps.isDeathsDisplayed();
	}

	@Then("The covid distribution pie chart is dispayed.")
	public void the_covid_distribution_pie_chart_is_dispayed() {
		covidsteps.isPieDisplayed();
	}

	@Then("THe covid cases line chart representation is displayed.")
	public void t_he_covid_cases_line_chart_representation_is_displayed() {
		covidsteps.islineChartDisplayed();
	}

}
