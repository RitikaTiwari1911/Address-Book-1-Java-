package com.breidgelabz;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.breidgelabz.UserRegistration.userEmail;

@RunWith(Parameterized.class)
    public class EmailTest {
        //private String email;
        private boolean expected;
        private String emailAddress;
        private com.breidgelabz.EmailTest email;

        public EmailTest(boolean expected, String emailAddress) {
            super();
            this.expected = expected;
            this.emailAddress = emailAddress;
        }

        @Parameterized.Parameters
        public Collection input() {
            return Arrays.asList(new Object[][]{
                    {true, "abc@yahoo.com"}, {true, "abc-100@yahoo.com"}, {true, "abc.100@yahoo.com"},
                    {true, "abc111@abc.com"}, {true, "abc-100@abc.net"}, {true, "abc.100@abc.com.au"},
                    {true, "abc@1.com"}, {true, "abc@gmail.com.com"}, {true, "abc+100@gmail.com"},{false,"abc-"},
                    {false,"abc@.com.my"},{false,"abc123@gmail.a"},{false,"abc123@.com"},
                    {false,"abc213@.com.com"},{false,".abc@abc.com"},{false,"abc()*@gmail.com"},{false,"abc@%*.com"},
                    {false,"abc..2002@gmail.com"},{false,"abc.@gmail.com"},{false,"abc@abc@gmail.com"},
                    {false,"abc@gmail.com.1a"},{false,"spk2ritika1911@gmail.com"}});

        }

        @Test
        public void validateEmail() {
            boolean output = userEmail(emailAddress);
            Assert.assertEquals(expected, emailAddress);
        }
    }
