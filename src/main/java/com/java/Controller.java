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

        System.out.println(view.INPUT_ANSWER);
        userAnswer = model.input.nextLine().trim().toLowerCase();
        while (userAnswer.equals(yesAnswer)) {
            checkValues();
            System.out.println(view.INPUT_ANSWER);
            userAnswer = model.input.nextLine().trim().toLowerCase();
        }
        if (!userAnswer.equals(yesAnswer)) {
            System.out.println("There are " + model.contactsList.size() + " contacts in your Contact Book:");
            for (int i = 0; i < model.contactsList.size(); i++) {
                System.out.println(model.contactsList.get(i).getName() + " " + model.contactsList.get(i).getSurname().charAt(0) + ". " + model.contactsList.get(i).getPhoneNumber());
            }
        }
    }


    public void checkValues() {
        String number;
        String homeNumber;
        String name;
        String surname;
        String nickname;
        String birthday;
        System.out.println(view.INPUT);

        while (true) {
            System.out.println(view.INPUT_FNAME);
            name = model.input.nextLine().trim();
            if (name.matches(String.valueOf(view.REGEX_NAME))) {
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_NAME);
            }
        }

        while (true) {
            System.out.println(view.INPUT_LNAME);
            surname = model.input.nextLine().trim();
            if (surname.matches(String.valueOf(view.REGEX_NAME))) {
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_NAME);
            }
        }

        while (true) {
            System.out.println(view.INPUT_NICKNAME);
            nickname = model.input.nextLine().trim();
            if (nickname.matches(String.valueOf(view.REGEX_NICKNAME)) || nickname.isEmpty()) { // є необов'язковим полем
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_NAME);
            }
        }

        while (true) {
            System.out.println(view.INPUT_MOBILE_NUMBER);
            number = model.input.nextLine().trim();
            if (number.matches(String.valueOf(view.REGEX_PHONE_NUMBER))) {
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_PHONE_NUMBER);
            }
        }

        while (true) {
            System.out.println(view.INPUT_PHONE_NUMBER);
            homeNumber = model.input.nextLine();
            if (homeNumber.matches(String.valueOf(view.REGEX_PHONE_NUMBER)) || homeNumber.isEmpty()) { // є необов'язковим полем
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_PHONE_NUMBER);
            }
        }

        while (true) {
            System.out.println(view.INPUT_BIRTHDAY);
            birthday = model.input.nextLine();
            if (birthday.matches(String.valueOf(view.REGEX_BIRTHDAY)) || birthday.isEmpty()) { // є необов'язковим полем
                break;
            } else {
                System.out.println(view.INPUT_CORRECT_BIRTHDAY);
            }
        }

        Model.Contacts person1 = new Model.Contacts();
        person1.setName(name);
        person1.setSurname(surname);
        person1.setNickname(nickname);
        person1.setPhoneNumber(number);
        person1.setPhoneHome(homeNumber);
        person1.setBDay(birthday);
        model.contactsList.add(person1);
    }
}
