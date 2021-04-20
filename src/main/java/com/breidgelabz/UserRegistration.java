package com.breidgelabz;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration extends Throwable {


    //method for first name
        public boolean userFirstName(String firstName) throws UserRegistrationException {
        //regex expression for first name
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches() == true) {
            return true;
        }
        else {
            throw new UserRegistrationException("INVALID FIRST NAME");
        }
    }


    //method for last name
    public boolean userLastName(String lastName) throws UserRegistrationException {
        //regex expression for last name
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
           throw new UserRegistrationException("INVALID LAST NAME");
        }
    }

    //method for email
   public static boolean userEmail(String email) throws UserRegistrationException {
       //regex expression for email
       Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
       Matcher matcher = pattern.matcher(email);
       if (matcher.matches() == true) {
           System.out.println();
           return true;
       } else {
           throw new UserRegistrationException("INVALID EMAIL");
       }
   }

    //method for phone number
    public boolean userPhoneNumber(String phoneNumber) throws UserRegistrationException{
        //regex expression for phone number
        Pattern pattern = Pattern.compile("^[0-9]{2}[: :][0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
            throw new UserRegistrationException("INVALID PHONE NUMBER");
        }
    }

    //method for password
    public boolean userPassword(String password) throws UserRegistrationException {
        //regex expression for password
        Pattern pattern=Pattern.compile("((?=.*[a-zA-Z0-9!@#$%&])(?=.*[@#$%&%!])(?=.*[0-9])(?=.*[A-Z])).{8,}");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches() == true) {
            System.out.println();
            return true;
        }
        else {
            throw new UserRegistrationException("INVALID PASSWORD");
        }
    }
 }




