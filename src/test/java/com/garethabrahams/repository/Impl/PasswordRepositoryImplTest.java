package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.LoginAccounts.PasswordFactory;
import com.garethabrahams.model.LoginAccounts.Password;
import com.garethabrahams.repository.PasswordRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PasswordRepositoryImplTest {
    private static PasswordRepository passwordRepository;
    private static Password password;
    private static Set<Password> passwordSet = new HashSet<>();

    @Test
    public void create() {

        passwordRepository = PasswordRepositoryImpl.getRepository();

        password = PasswordFactory.createPassword("123456");

        passwordSet.add(passwordRepository.create(password));
        Assert.assertEquals("123456",passwordRepository.read(password.getPassword()).getPassword());


    }

    @Test
    public void update() {
        create();
        Password pass = passwordRepository.update(password);
        Assert.assertEquals(pass.getPassword(),password.getPassword());
    }

    @Test
    public void delete() {
        create();
        Password pass = passwordRepository.read(password.getPassword());
        passwordRepository.delete(pass.getPassword());
        Assert.assertEquals(pass,passwordRepository.read(password.getPassword()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("123456",passwordRepository.read(password.getPassword()).getPassword());
    }
}