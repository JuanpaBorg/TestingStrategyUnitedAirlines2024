package stepdefs;

import ApplicationPages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.testng.asserts.SoftAssert;

public class SearchPageSteps {
    private SearchPage searchPage;

    public SearchPageSteps() {
        this.searchPage = new SearchPage();
    }

    @Given("^I am on the flight search page$")
    public void i_am_on_the_flight_search_page() {
        Assert.assertEquals("I am not on the flight search page","Chicago, IL, US (ORD)",searchPage.getOriginInputText());
    }

    @Then("^I should see the search box displayed prominently$")
    public void i_should_see_the_search_box_displayed_prominently() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(searchPage.isDestinationInputVisible(), "I am not able to see the search components (Destination)");
        softAssert.assertTrue(searchPage.isOriginInputVisible(), "I am not able to see the search components (Origin)");
        softAssert.assertAll();
    }

    @When("^I enter \"([^\"]*)\" into the destination input$")
    public void i_enter_into_the_destination_input(String destination) {
        searchPage.enterDestination(destination);
        Assert.assertEquals("Trouble writing Destination",destination,searchPage.getOriginInputText());
    }

    @Then("^the destination input should contain \"([^\"]*)\"$")
    public void the_destination_input_should_contain(String destination) {
        Assert.assertEquals("Trouble writing Destination",destination,searchPage.getOriginInputText());
    }

    @When("^I search for flights from \"([^\"]*)\" to \"([^\"]*)\" on \"([^\"]*)\"$")
    public void i_search_for_flights_from_to_on(String origin, String destination, String date) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(searchPage.isOriginInputVisible(), "I am not able to see the search components (Origin)");
        searchPage.enterOrigin(origin);
        softAssert.assertTrue(searchPage.isDestinationInputVisible(), "I am not able to see the search components (Destination)");
        searchPage.enterDestination(destination);
        softAssert.assertTrue(searchPage.isDepartureDateInputVisible(), "I am not able to see the search components (Date)");
        searchPage.enterDepartureDate(date);
        searchPage.clickSearchButton();
        softAssert.assertTrue(searchPage.areResultsDisplayed(), "I am not able to see the search results");
        softAssert.assertAll();
    }

    @Then("^I should see relevant and accurate search results$")
    public void i_should_see_relevant_and_accurate_search_results() {
        // TODO Generate Search assertions for the results to display the mentioned origin, destination, and departure and return date
    }

    @When("^I enter misspelled destination \"([^\"]*)\"$")
    public void i_enter_misspelled_destination(String misspelledDestination) {
        searchPage.enterDestination(misspelledDestination);
        Assert.assertEquals("Trouble writing Destination",misspelledDestination,searchPage.getOriginInputText());
    }

    @Then("^I should see suggestions for correcting the input$")
    public void i_should_see_suggestions_for_correcting_the_input() {
        // TODO Generate Search assertions for the Suggestions pane of the search components to represent accurate corrections for the misspelled destination
    }

    @Then("^I should see flight details, prices, and availability in the search results of flights from \"([^\"]*)\" to \"([^\"]*)\" on \"([^\"]*)\"$$")
    public void i_should_see_flight_details_prices_and_availability_in_the_search_results(String origin, String destination, String date) {
        // TODO Use the methods in the searchPage class such as getOriginInRow and similar to assert if the search results are displayed to the user
    }




}
