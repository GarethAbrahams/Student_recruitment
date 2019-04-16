package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Accounts;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountsFactoryTest {

    @Test
    public void createAccounts() {
        Accounts acc = AccountsFactory.createAccounts("Gareth","123456");
        Assert.assertEquals("Gareth",acc.getUsername());
    }
}