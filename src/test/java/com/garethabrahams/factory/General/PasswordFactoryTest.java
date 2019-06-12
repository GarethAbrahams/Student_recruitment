package com.garethabrahams.factory.General;

import com.garethabrahams.factory.General.PasswordFactory;
import com.garethabrahams.model.General.Password;
import org.junit.Assert;
import org.junit.Test;

public class PasswordFactoryTest {

    @Test
    public void createPassword() {
        Password password = PasswordFactory.createPassword("123456");
        Assert.assertEquals("123456",password.getPassword());
    }
}