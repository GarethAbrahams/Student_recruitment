package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Username;
import org.junit.Assert;
import org.junit.Test;

public class UsernameFactoryTest {

    @Test
    public void createAccounts() {
        Username acc = UsernameFactory.createAccounts("Gareth");
        Assert.assertEquals("Gareth",acc.getUsername());
    }
}