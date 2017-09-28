package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    Scanner input = new Scanner(System.in);
    //String line = input.nextLine().trim();

    public ArrayList<Persons> contactsList = new ArrayList();

    public static class Persons{
        public String name;
        public String surname;
        public String nickname;
        public String phoneNumber;
        public String phoneNumber2;
        public String phoneHome;
        public String bDay;
        public String email;
        public String skype;
        public String comment;


        String getName(){ return name; }
        void setName(String name){ this.name = name; }

        String getSurname(){ return surname; }
        void setSurname(String surname){ this.surname = surname; }

        String getNickname(){ return nickname; }
        void setNickname(String nickname){ this.nickname = nickname; }

        String getPhoneNumber(){ return phoneNumber; }
        void setPhoneNumber(String  phoneNumber){ this.phoneNumber = phoneNumber; }

        String getComment(){ return comment; }
        void setComment(String comment){ this.comment = comment; }

        String getBDay(){ return bDay; }
        void setBDay(String bDay){ this.bDay = bDay; }

        String getPhoneNumber2(){ return phoneNumber2; }
        void setPhoneNumber2(String phoneNumber2){ this.phoneNumber2 = phoneNumber2; }

        String getPhoneHome(){ return phoneHome; }
        void setPhoneHome(String phoneHome){ this.phoneHome = phoneHome; }

        String getEmail(){ return email; }
        void setEmail(String email){ this.email = email; }

        String getSkype(){ return skype; }
        void setSkype(String skype){ this.skype = skype; }
    }

    enum Groups {
        Family,
        Work,
        Friends
    }

}
