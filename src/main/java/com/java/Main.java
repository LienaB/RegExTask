package com.java;

/**
 * Created by Liena_Bondarenko on 9/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        //controller.guessingSecretNumber();
    }
}
