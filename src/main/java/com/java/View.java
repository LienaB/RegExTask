package com.java;

import java.util.regex.Pattern;

/**
 * Created by Liena_Bondarenko on 9/27/2017.
 */
public class View {
    public static final String INPUT = "New contact adding";
    public static final String INPUT_FNAME = "Please input name: ";
    public static final String INPUT_LNAME = "Please input surname: ";
    public static final String INPUT_NICKNAME = "Please input nickname: ";
    public static final String INPUT_COMMENT = "Please input comment: ";

    //private static final String REGEX_NAME = "[A-Za-z]{2,20}";
    //private static final String REGEX_COMMENT = "[A-Za-z]{2,20}";
    //private static final String REGEX_PHONE_NUMBER_MOBILE = "";
    Pattern REGEX_NAME = Pattern.compile("^[A-Za-z0-9_-]{2,15}$");
    Pattern REGEX_COMMENT = Pattern.compile("^[A-Za-z0-9_-]{2,15}$");
    Pattern REGEX_PHONE_NUMBER_MOBILE = Pattern.compile("^[0-9]{10,15}$");

}
