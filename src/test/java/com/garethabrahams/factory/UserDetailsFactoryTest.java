package com.garethabrahams.factory;

import com.garethabrahams.model.UserDetails;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDetailsFactoryTest {

    @Test
    public void createUserDetails() {

        UserDetails user = UserDetailsFactory.createUserDetails("gareth","password");
        Assert.assertEquals("gareth",user.getUsername());
    }
}