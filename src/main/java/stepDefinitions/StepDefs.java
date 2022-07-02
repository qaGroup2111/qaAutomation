package stepDefinitions;

import browserFactory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.paraBank.ParaBankHomePage;
import pages.paraBank.ParaBankRegistrationPage;

import static browserFactory.BrowserFactory.closeAllDriver;
import static pages.paraBank.ParaBankHomePage.getParaBankHomePageUrl;
import static utils.Utils.generateRandomDataForUser;

public class StepDefs {
    WebDriver driver = BrowserFactory.getBrowser("Chrome");

    ParaBankHomePage paraBankHomePage = new ParaBankHomePage(driver);
    ParaBankRegistrationPage paraBankRegistrationPage = new ParaBankRegistrationPage(driver);

    @Given("user opens Parabank page")
    public void userOpensParabankHomePage() {
        driver.get(getParaBankHomePageUrl());
    }

    @When("user fills the registration form")
    public void userFillsTheRegistrationForm() {
        paraBankRegistrationPage.fillParaBankRegistrationForm(generateRandomDataForUser());
    }

    @And("clicks on register button")
    public void clicksOnRegisterButton() {
        paraBankHomePage.clickRegistrationButton();
    }

    @And("user clicks to register a user")
    public void userClicksToRegisterAUser() {
        paraBankRegistrationPage.clickOnRegisterButton();
    }

    @Then("user is registered successfully")
    public void userIsRegisteredSuccessfully() {
        paraBankRegistrationPage.checkUserRegistration();
    }

    @After
    public void closeDriver(){
        closeAllDriver();
    }
}