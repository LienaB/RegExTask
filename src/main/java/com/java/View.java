package com.java;

import java.util.regex.Pattern;

public class View {
    public static final String INPUT = "New contact adding";
    public static final String INPUT_CORRECT_NAME = "Name must be in range 2 - 50 symbols.";
    public static final String INPUT_CORRECT_PHONE_NUMBER = "Number may contain only '+', spaces and digits. Min length 3, max length 25.";
    public static final String INPUT_FNAME = "Please input name: ";
    public static final String INPUT_LNAME = "Please input surname: ";
    public static final String INPUT_ANSWER = "Do you want to create another contact? Please input 'y' or 'n'";
    public static final String INPUT_NICKNAME = "Please input nickname or press enter to leave it empty: ";
//    public static final String INPUT_COMMENT = "Please input comment: ";
    public static final String INPUT_MOBILE_NUMBER = "Please input mobile phone number: ";
    public static final String INPUT_PHONE_NUMBER = "Please input home phone number or press enter to leave it empty: ";
    public static final String INPUT_BIRTHDAY = "Please input date of birth or press enter to leave it empty: ";
    public static final String INPUT_CORRECT_BIRTHDAY = "Birthday can be in dd/mm/yyyy,dd-mm-yyyy or dd.mm.yyyy formats";

    //private static final String REGEX_NAME = "[A-Za-z]{2,20}";
    //private static final String REGEX_COMMENT = "[A-Za-z]{2,20}";
    //private static final String REGEX_PHONE_NUMBER_MOBILE = "";

    String NAME = "^[A-Za-z0-9_-]{2,15}$";
//    String COMMENT = "^[A-Za-z0-9_-]{2,15}$";
    String PHONE_NUMBER = "^[0-9]{3,15}$";
    String NICKNAME = "^[A-Za-z0-9_-]{2,10}$";
    String BIRTHDAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    Pattern REGEX_NAME = Pattern.compile(NAME);
//    Pattern REGEX_COMMENT = Pattern.compile(COMMENT);
    Pattern REGEX_PHONE_NUMBER = Pattern.compile(PHONE_NUMBER);
    Pattern REGEX_NICKNAME = Pattern.compile(NICKNAME);
    Pattern REGEX_BIRTHDAY = Pattern.compile(BIRTHDAY);


}
