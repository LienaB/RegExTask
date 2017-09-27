package com.java;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Liena_Bondarenko on 9/27/2017.
 */
public class Controller {
    private Scanner in;
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


}
