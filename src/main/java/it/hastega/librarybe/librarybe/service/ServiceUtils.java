package it.hastega.librarybe.librarybe.service;

import org.apache.commons.lang3.StringUtils;

public class ServiceUtils {
    private ServiceUtils() {}

    public static boolean isValidEmail(String email) {
        return StringUtils.isNotBlank(email) && isEmailFormatVaild(email);
    }

    private static boolean isEmailFormatVaild(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.]+$";
        return email.matches(regex);
    }
}
