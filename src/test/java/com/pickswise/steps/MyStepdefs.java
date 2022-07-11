package com.pickswise.steps;

import com.pickswise.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on home page of pickswise$")
    public void iAmOnHomePageOfPickswise() {

    }

    @When("^I click on accpet cookies$")
    public void iClickOnAccpetCookies() {
        new HomePage().clickOnCookies();
    }

    @And("^I click on All Sports button$")
    public void iClickOnAllSportsButton() throws InterruptedException {
        Thread.sleep(5000);
        new HomePage().clickOnSportsButton();
    }

    @Then("^I  can see an available list of valid Sports to filter by$")
    public void iCanSeeAnAvailableListOfValidSportsToFilterBy() throws InterruptedException {
        Thread.sleep(4000);
        new HomePage().selectkbofromdroppdown("KBO");
    }

    @And("^I can click KBO sport from droppdown$")
    public void iCanClickKBOSportFromDroppdown() {
        new HomePage().selectkbofromdroppdown("KBO");
    }

    @Then("^I should see all KBO sports list$")
    public void iShouldSeeAllKBOSportsList() {
        new HomePage().selectsport();
        Assert.assertEquals("Not navigate to kbo list", "KIA @ LG", new HomePage().selectsport());
    }



    @And("^I click on to close Wise N shine pop up$")
    public void iClickOnToCloseWiseNShinePopUp() {
        new HomePage().clickOnCloseWhiteShinePopUp();
    }
}
