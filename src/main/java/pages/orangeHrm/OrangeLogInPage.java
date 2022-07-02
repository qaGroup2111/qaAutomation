package pages.orangeHrm;

public class OrangeLogInPage {
    private static final String orangeLogInUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

    public static String getOrangeLogInUrl() {
        return orangeLogInUrl;
    }

    /**
     * impelent: 1) WebElements: email/username, password, loginButton
     *           2) log in method
     *           3) assert that user logged in
     */
}
