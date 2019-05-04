package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.factory.PasswordFactory;
import com.garethabrahams.model.Password;
import org.junit.Assert;
import org.junit.Test;

public class PasswordFactoryTest {

    @Test
    public void createPassword() {
        Password password = PasswordFactory.createPassword("123456");
        Assert.assertEquals("123456",password.getPassword());
    }
}