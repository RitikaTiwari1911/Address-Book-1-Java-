package com.breidgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration user;

    @Before
    public void format(){
        user= new UserRegistration();
    }

    //Test case for first name
    @Test
    public void WhenFirstName_IsTrue(){
        boolean output=user.userFirstName("Ritika");
        Assert.assertTrue("The input is correct",output);
    }

    @Test
    public void WhenFirstName_IsFalse(){
       boolean output=user.userFirstName("ritika");
        Assert.assertFalse("The message is incorrect",output);
    }

    //Test case for last name
    @Test
    public void WhenLastName_IsTrue(){
        boolean output=user.userLastName("Tiwari");
        Assert.assertTrue("The input is correct",output);
    }

    @Test
    public void WhenLastName_IsFalse(){
        boolean output=user.userLastName("tiwari");
        Assert.assertFalse("The message is incorrect",output);
    }

    //Test case for email
    @Test
    public void WhenEmail_IsTrue(){
        boolean output=user.userEmail("riti_123@gmail.com");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenEmail_IsFalse(){
        boolean output=user.userEmail("ritika123.com");
        Assert.assertFalse(output);
    }

    //Test case for phone number
    @Test
    public void WhenPhoneNumber_IsTrue(){
        boolean output=user.userPhoneNumber("91 1234567890");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenPhoneNumber_IsFalse(){
        boolean output=user.userPhoneNumber("911234567890");
        Assert.assertFalse(output);
    }

    //Test case for password
    @Test
    public void WhenPassword_IsTrue(){
        boolean output=user.userPassword("Password@123");
        Assert.assertTrue(output);
    }

    @Test
    public void WhenPassword_IsFalse() {
        boolean output = user.userPassword("password");
        Assert.assertFalse(output);
    }


}

