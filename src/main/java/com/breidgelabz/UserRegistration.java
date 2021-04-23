package com.breidgelabz;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    // Using lambda to verify user entry
    @FunctionalInterface
    interface IUserRegistration {
        boolean validateUserEntry(String pattern, String input);
    }

    public class UserRegistration{

    IUserRegistration verifyInput=((pattern,input) ->Pattern.compile(pattern).matcher(input).matches());


    //method for first name
        public boolean userFirstName(String firstName) throws UserRegistrationException {
        //regex expression for first name
        String FIRST_NAME="^[A-Z]{1}[a-z]{2,}";
        if(verifyInput.validateUserEntry(FIRST_NAME,firstName)) {
            return true;
        }
        else {
            throw new UserRegistrationException("INVALID FIRST NAME");
        }
    }

    //method for last name
    public boolean userLastName(String lastName) throws UserRegistrationException {
        //regex expression for last name
        String LAST_NAME=("^[A-Z]{1}[a-z]{2,}");
        if(verifyInput.validateUserEntry(LAST_NAME,lastName)) {
            return true;
        }
        else {
           throw new UserRegistrationException("INVALID LAST NAME");
        }
    }

    //method for email
   public boolean userEmail(String email) throws UserRegistrationException {
       //regex expression for email
       String EMAIL=("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
       if(verifyInput.validateUserEntry(EMAIL,email)) {
           return true;
       } else {
           throw new UserRegistrationException("INVALID EMAIL");
       }
   }

    //method for phone number
    public boolean userPhoneNumber(String phoneNumber) throws UserRegistrationException{
        //regex expression for phone number
        String PHONE_NUMBER=("^[0-9]{2}[: :][0-9]{10}$");
       if( verifyInput.validateUserEntry(PHONE_NUMBER, phoneNumber)) {
            return true;
        }
        else {
            throw new UserRegistrationException("INVALID PHONE NUMBER");
        }
    }

    //method for password
    public boolean userPassword(String password) throws UserRegistrationException {
        //regex expression for password
        String PASSWORD=("((?=.*[a-zA-Z0-9!@#$%&])(?=.*[@#$%&%!])(?=.*[0-9])(?=.*[A-Z])).{8,}");
        if(verifyInput.validateUserEntry(PASSWORD,password)) {
            return true;
        }
        else {
            throw new UserRegistrationException("INVALID PASSWORD");
        }
    }
 }




