package com.breidgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration user;

    @Before
    public void format() {
        user = new UserRegistration();
    }

    //Test case for first name
    @Test
    public void WhenFirstName_IsTrue() throws UserRegistrationException{
        boolean output=user.userFirstName("Ritika");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenFirstName_IsFalse() {
        try {
            boolean output = user.userFirstName("ritika");
            Assert.assertFalse(output);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("INVALID FIRST NAME", e.getMessage());
        }
    }

    //Test case for last name
    @Test
    public void WhenLastName_IsTrue() throws UserRegistrationException{
        boolean output = user.userLastName("Tiwari");
        Assert.assertTrue( output);
    }

    @Test
    public void WhenLastName_IsFalse() {
        try {
            boolean output = user.userLastName("tiwari");
            Assert.assertFalse(output);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("INVALID LAST NAME",e.getMessage());
        }
    }

    //Test case for email
    @Test
    public void WhenEmail_IsTrue() throws UserRegistrationException{
        boolean output=user.userEmail("riti_123@gmail.com");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenEmail_IsFalse(){
        try {
            boolean output = user.userEmail("ritika123.com");
            Assert.assertFalse(output);
        }catch(UserRegistrationException e){
            Assert.assertEquals("INVALID EMAIL",e.getMessage());
        }
    }

    //Test case for phone number
    @Test
    public void WhenPhoneNumber_IsTrue() throws UserRegistrationException{
        boolean output = user.userPhoneNumber("91 1234567890");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenPhoneNumber_IsFalse() {
        try {
            boolean output = user.userPhoneNumber("911234567890");
            Assert.assertFalse(output);
        }catch(UserRegistrationException e){
            Assert.assertEquals("INVALID PHONE NUMBER",e.getMessage());
        }
    }

    //Test case for password
    @Test
    public void WhenPassword_IsTrue() throws UserRegistrationException {
        boolean output = user.userPassword("Password@123");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenPassword_IsFalse() {
        try {
            boolean output = user.userPassword("password");
            Assert.assertFalse(output);
        }catch(UserRegistrationException e){
            Assert.assertEquals("INVALID PASSWORD",e.getMessage());
        }
    }
}

