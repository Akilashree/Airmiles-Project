package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.BookingPage;
public class Booking extends DriverFactory{
@And("^user clicks on Redeem Airmiles link$")
public void user_clicks_on_Redeem_Airmiles_link() throws Throwable {
	new BookingPage(driver).user_clicks_on_Redeem_Airmiles_link();
}

@And("^user clicks on Travel category$")
public void user_clicks_on_Travel_category() throws Throwable {
	new BookingPage(driver).user_clicks_on_Travel_category();
}

@And("^user clicks on Evoucher catalog$")
public void user_clicks_on_Evoucher_catalog() throws Throwable {
	new BookingPage(driver).user_clicks_on_Evoucher_catalog();

}

@And("^user clicks on Book Now$")
public void user_clicks_on_Book_Now() throws Throwable {
	new BookingPage(driver).user_clicks_on_Book_Now();

}

@And("^user selects oneway round$")
public void user_selects_oneway_round() throws Throwable {
	new BookingPage(driver).user_selects_oneway_round();

}

@And("^user enters from departure city '(.*?)'$")
public void user_enters_from_departure_city(String FromCity) throws Throwable {
	new BookingPage(driver).user_enters_from_departure_city(FromCity);

}

@And("^user enters to departure city '(.*?)'$")
public void user_enters_to_departure_city(String ToCity) throws Throwable {
	new BookingPage(driver).user_enters_to_departure_city(ToCity);

}

@And("^user selects date from date picker$")
public void user_selects_date_from_date_picker() throws Throwable {
	new BookingPage(driver).user_selects_date_from_date_picker();
}

@When("^user clicks search flights$")
public void user_clicks_search_flights() throws Throwable {
	new BookingPage(driver).user_clicks_search_flights();

}

@When("user clicks on Select Departure$")
public void user_clicks_on_Select_departure() throws Throwable {
	new BookingPage(driver).user_clicks_on_Select_departure();

}

@Then("^user clicks on Add to Cart$")
public void user_clicks_on_Add_to_cart() throws Throwable {
	new BookingPage(driver).user_clicks_on_Add_to_cart();

}

@Then("^user selects proceed to checkout$")
public void user_selects_proceed_to_checkout() throws Throwable {
	new BookingPage(driver).user_selects_proceed_to_checkout();

}
@And("^user accepts the terms and conditions$")
public void user_accepts_terms_and_conditions() throws Throwable {
	new BookingPage(driver).user_accepts_terms_and_conditions();
}
@Then("^user clicks on proceed to checkout$")
public void user_clicks_on_proceed_to_checkout() throws Throwable {
	new BookingPage(driver).user_clicks_on_proceed_to_checkout();

}

}