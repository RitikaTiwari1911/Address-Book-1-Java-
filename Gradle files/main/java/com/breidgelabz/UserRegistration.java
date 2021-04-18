package com.breidgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    //method for first name
    public boolean userFirstName(String firstName) {
        //regex expression for first name
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches() == true) {
            return true;
                    }
        else {
            return false;
        }
    }

    //method for last name
    public boolean userLastName(String lastName) {
        //regex expression for last name
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
            return false;
        }
    }

    //method for email
    public boolean userEmail(String email){
        //regex expression for email
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        Matcher matcher=pattern.matcher(email);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
            return false;
        }
    }

    //method for phone number
    public boolean userPhoneNumber(String phoneNumber) {
        //regex expression for phone number
        Pattern pattern = Pattern.compile("^[0-9]{2}[: :][0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
            return false;
        }
    }

    //method for password
    public boolean userPassword(String password) {
        //regex expression for password
        Pattern pattern=Pattern.compile("((?=.*[a-zA-Z0-9!@#$%&])(?=.*[@#$%&%!])(?=.*[0-9])(?=.*[A-Z])).{8,}");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
            return false;
        }
    }


}





