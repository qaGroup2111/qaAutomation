package pages.paraBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBankHomePage {
    private static final String paraBankHomePageUrl = "https://parabank.parasoft.com";

    public static String getParaBankHomePageUrl() {
        return paraBankHomePageUrl;
    }

    @FindBy(xpath = "//*[@id='loginPanel']//a[text() = 'Register']")
    private WebElement register;

    @FindBy(xpath = "//li[@class = 'home']//a[text() = 'home']")
    private WebElement homeBtn;

    @FindBy(xpath = "//li[@class = 'aboutus']//a[text() = 'about']")
    private WebElement aboutUsBtn;

    @FindBy(xpath = "//li[@class = 'contact']//a[text() = 'contact']")
    private WebElement contactBtn;

    @FindBy(xpath = "//div[@id = 'loginPanel']//input[@name = 'username']")
    private WebElement usernameInp;

    @FindBy(xpath = "//div[@id = 'loginPanel']//input[@name = 'password']")
    private WebElement passwordInp;

    public ParaBankHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void logInToParaBank(String username, String password) {
//        driver.get(paraBankRegistrationPage);
    }

    public void checkIfUserCreatedSuccessfullly() {
//        Assert:
//        elem.sendKeys("safasf");
//        Your account was created successfully. You are now logged in.
    }

    public void clickRegistrationButton() {
        register.click();
    }
}
