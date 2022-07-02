package utils;

import java.util.HashMap;

import static org.apache.commons.lang3.RandomStringUtils.*;
import static utils.UserDataEnum.*;

public class Utils {

    private static final String firstName = randomAlphabetic(6);
    private static final String lastName = randomAlphabetic(6);
    private static final String address = randomAlphanumeric(6);
    private static final String city = randomAlphabetic(6);
    private static final String state = randomAlphabetic(6);
    private static final String zipCode = randomNumeric(5);
    private static final String phone = randomNumeric(9);
    private static final String ssn = randomNumeric(6);
    private static final String username = randomAlphabetic(6);
    private static final String password = randomAlphanumeric(4).toLowerCase()
            + randomAlphanumeric(4).toUpperCase();

    public static HashMap<UserDataEnum, String> generateRandomDataForUser() {
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
