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

    public boolean checkWithRegExp(String userString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userString);
        System.out.println(View.INPUT);

//        do {
//            in = new Scanner(System.in);
//        }
//        while ();

        return m.matches();
    }




}
