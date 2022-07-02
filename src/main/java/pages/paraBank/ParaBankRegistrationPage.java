package pages.paraBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UserDataEnum;

import java.util.HashMap;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.PageFactory.initElements;
import static utils.UserDataEnum.*;

public class ParaBankRegistrationPage {
    private static final String paraBankRegistrationPageUrl = "https://parabank.parasoft.com/parabank/register.htm";

    public static String getParaBankRegistrationPageUrl() {
        return paraBankRegistrationPageUrl;
    }

    @FindBy(xpath = "//*[@id='customer.firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id='customer.lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id='customer.address.street']")
    private WebElement address;

    @FindBy(xpath = "//*[@id='customer.address.city']")
    private WebElement city;

    @FindBy(xpath = "//*[@id='customer.address.state']")
    private WebElement state;

    @FindBy(xpath = "//*[@id='customer.address.zipCode']")
    private WebElement zipCode;

    @FindBy(xpath = "//*[@id='customer.phoneNumber']")
    private WebElement phone;

    @FindBy(xpath = "//*[@id='customer.ssn']")
    private WebElement ssn;

    @FindBy(xpath = "//*[@id='customer.username']")
    private WebElement username;

    @FindBy(xpath = "//*[@id='customer.password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='repeatedPassword']")
    private WebElement confirm;

    @FindBy(xpath = "//*[@id='customerForm']//input[@type = 'submit']")
    private WebElement register;

    @FindBy(xpath = "//*[@id='rightPanel']//p")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//*[@id='rightPanel']//h1")
    private WebElement welcomeMessage;

    private String createdUsername;

    public ParaBankRegistrationPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void fillParaBankRegistrationForm(HashMap<UserDataEnum, String> userData) {
        firstName.sendKeys(userData.get(FIRSTNAME));
        lastName.sendKeys(userData.get(LASTNAME));
        address.sendKeys(userData.get(ADDRESS));
        city.sendKeys(userData.get(CITY));
        state.sendKeys(userData.get(STATE));
        zipCode.sendKeys(userData.get(ZIPCODE));
        phone.sendKeys(userData.get(PHONE));
        ssn.sendKeys(userData.get(SSN));
        username.sendKeys(userData.get(USERNAME));
        password.sendKeys(userData.get(PASSWORD));
        confirm.sendKeys(userData.get(PASSWORD));

        createdUsername = userData.get(USERNAME);
    }

    public void clickOnRegisterButton() {
        assertTrue(register.isDisplayed());
        register.click();
    }

    public void checkUserRegistration() {
        assertEquals(confirmationMessage.getText(), "Your account was created successfully. You are now logged in.");
        assertEquals(welcomeMessage.getText(), format("Welcome %s", createdUsername));
    }
}