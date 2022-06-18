import browserFactory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GmailRegistration {
    private static String chromeDriver = "Chrome";

    private static String gmailRegistrationPage = "https://www.google.com/intl/en/gmail/about/";

    private static WebDriver driver = BrowserFactory.getBrowser(chromeDriver);

    private static By createAccBtn = By.xpath("(//span[text() = 'Create an account'])[1]");

    private static By firstName = By.xpath("//input[@id = 'firstName']");
    private static By lastName = By.xpath("//input[@id = 'lastName']");
    private static By username = By.xpath("//input[@id = 'username']");
    private static By password = By.xpath("//input[@type = 'password']");

    private static List<WebElement> passwordsList = new ArrayList<>();

    public static void gmailReg() {
        driver.get(gmailRegistrationPage);
        driver.findElement(createAccBtn).click();
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Snow");

        passwordsList = driver.findElements(password);

        for (int i = 0; i < passwordsList.size(); i++) {
            passwordsList.get(i).sendKeys("paroli");
        }

        BrowserFactory.closeAllDriver();
    }
}
