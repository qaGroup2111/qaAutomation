package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    private static Map<String, WebDriver> drivers = new HashMap<>();

    /*
     * Factory method for getting browsers
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
            case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            case "IE":
                driver = drivers.get("IE");
                if (driver == null) {
                    System.setProperty("webdriver.ie.driver",
                            "C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    drivers.put("IE", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");

                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver",
                            "D:\\stepit\\qaAutomation\\chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                }
                break;
        }
        return driver;
    }

    public static void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}

