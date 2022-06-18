package utils;

import java.util.HashMap;

import static org.apache.commons.lang3.RandomStringUtils.*;
import static utils.UserDataEnum.*;

public class Utils {
    /**
     * CHANGE TO BUILDER
     */

    private static String firstName = randomAlphabetic(6);
    private static String lastName = randomAlphabetic(6);
    private static String address = randomAlphanumeric(6);
    private static String city = randomAlphabetic(6);
    private static String state = randomAlphabetic(6);
    private static String zipCode = randomNumeric(5);
    private static String phone = randomNumeric(9);
    private static String ssn = randomNumeric(6);
    private static String username = randomAlphabetic(6);
    private static String password = randomAlphanumeric(4).toLowerCase()
            + randomAlphanumeric(4).toUpperCase();

    public static HashMap<UserDataEnum, String> generateUserWithRandomData() {
        HashMap<UserDataEnum, String> userData = new HashMap<>();

        userData.put(FIRSTNAME, firstName);
        userData.put(LASTNAME, lastName);
        userData.put(ADDRESS, address);
        userData.put(CITY, city);
        userData.put(STATE, state);
        userData.put(ZIPCODE, zipCode);
        userData.put(PHONE, phone);
        userData.put(SSN, ssn);
        userData.put(USERNAME, username);
        userData.put(PASSWORD, password);

        return userData;
    }
}
