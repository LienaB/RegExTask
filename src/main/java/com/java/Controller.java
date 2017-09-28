package com.java;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void phoneBook(){

        checkValues();

        String userAnswer;
        String yesAnswer = "y";

        System.out.println("Do you want to create another contact? Please input 'yes' or 'no'");
        userAnswer = model.input.nextLine().trim().toLowerCase();
        while (userAnswer == yesAnswer) {
            checkValues();
        }
        if (userAnswer != yesAnswer) {
            System.out.println("Cool");
        }
    }

    public void checkValues() {
        String number;
        String homeNumber;
        String name;
        System.out.println(view.INPUT);

        while (true) {
            System.out.println(view.INPUT_FNAME);
            name = model.input.nextLine().trim();
            if (name.matches("^.{2,50}$")) {
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_NAME);
            }
        }

        while (true) {
            System.out.println("Enter mobile phone number:");
            number = model.input.nextLine().trim();
            if (number.matches("^\\+?[0-9 ]{3,25}$")) {
                break;
            } else {
                System.out.println("Number may contain only '+', spaces and digits. Min length 3, max length 25.");
            }
        }

        while (true) {
            System.out.println("Enter home phone number:");
            homeNumber = model.input.nextLine().trim();
            if (homeNumber.matches("^\\+?[0-9 ]{3,25}$")) {
                break;
            } else {
                System.out.println("Number may contain only '+', spaces and digits. Min length 3, max length 25.");
            }
        }

        Model.Persons person1 = new Model.Persons();
        person1.setName(name);
        person1.setPhoneNumber(number);
        person1.setPhoneHome(homeNumber);
        model.contactsList.add(person1);
//        System.out.println(person1.getName());
//        System.out.println(person1.getPhoneNumber());
    }
}
