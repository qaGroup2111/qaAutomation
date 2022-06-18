package paraBank;

import browserFactory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pojos.User;
import utils.UserDataEnum;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.List;

import static utils.UserDataEnum.PASSWORD;

public class ParaBankHomePage {

    private static String chromeDriver = "Chrome";

    private static String paraBankRegistrationPage = "https://parabank.parasoft.com/parabank/register.htm";

    private static WebDriver driver = BrowserFactory.getBrowser(chromeDriver);

    private static By homeBtn = By.xpath("//li[@class = 'home']//a[text() = 'home']");
    private static By aboutUsBtn = By.xpath("//li[@class = 'aboutus']//a[text() = 'about']");
    private static By contactBtn = By.xpath("//li[@class = 'contact']//a[text() = 'contact']");
    private static By usernameInp = By.xpath("//div[@id = 'loginPanel']//input[@name = 'username']");
    private static By passwordInp = By.xpath("//div[@id = 'loginPanel']//input[@name = 'password']");

    // ATM Services


    // Online Services


    public static void logInToParaBank(String username, String password) {
        driver.get(paraBankRegistrationPage);
    }

    public static void registrationParaBank(HashMap<UserDataEnum, String> userData) {
        driver.get(paraBankRegistrationPage);

        driver.findElement(passwordInp).sendKeys(userData.get(PASSWORD));
//        driver.findElement(confirmInp).sendKeys(userData.get(PASSWORD));
//        driver.findElement(registerBtn).click();
        BrowserFactory.closeAllDriver();

    }

    public static void apiRegistration() {
        User user = given()
                .when()
                .contentType(ContentType.JSON)
                .get("https://reqres.in/api/users/3")
                .then().log().all()
                .extract().body().jsonPath().getObject("data", User.class);


        System.out.println("sf");
    }

}
