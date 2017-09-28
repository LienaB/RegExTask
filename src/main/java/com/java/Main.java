package com.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.phoneBook();

        System.out.println(model.contactsList.size());
    }
}