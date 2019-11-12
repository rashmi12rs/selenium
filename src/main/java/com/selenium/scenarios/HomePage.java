package com.selenium.scenarios;

import com.selenium.infrastructure.SetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage {
    @Given("Launch the application with Selenium web driver")
    public void launch_the_application_with_Selenium_web_driver() {
        SetUp.driver.get("https://www.amazon.com");
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
/*

    @Then("Search for products by department ‘Electronics, Computers and Office’ and the ‘Television & Video’")
    public void search_for_products_by_department_Electronics_Computers_and_Office_and_the_Television_Video() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Select television that are {string} in screen size")
    public void select_television_that_are_in_screen_size(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Sorting by {string}")
    public void sorting_by(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Return the first {int} item prices and the item names as a list")
    public void return_the_first_item_prices_and_the_item_names_as_a_list(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Return the products whose price is less than ${int} and whose Model Year is {int}")
    public void return_the_products_whose_price_is_less_than_$_and_whose_Model_Year_is(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Click on the product link for the {int} product in search result and go to the product page.")
    public void click_on_the_product_link_for_the_product_in_search_result_and_go_to_the_product_page(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Click on ‘Add to list’")
    public void click_on_Add_to_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Now, verify if the Sign in page is showing up. \\(Since user isn’t logged in yet)")
    public void now_verify_if_the_Sign_in_page_is_showing_up_Since_user_isn_t_logged_in_yet() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Enter username {string} and submit")
    public void enter_username_and_submit(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
*/
}
