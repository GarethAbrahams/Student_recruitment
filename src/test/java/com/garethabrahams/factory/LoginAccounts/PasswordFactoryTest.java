package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Password;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;

import static org.junit.Assert.*;

public class PasswordFactoryTest {

    @Test
    public void createPassword() {
        Password password = PasswordFactory.createPassword("123456");
        Assert.assertEquals("123456",password.getPassword());
    }
}