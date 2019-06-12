package com.garethabrahams.service.Impl.General;

import com.garethabrahams.factory.General.PasswordFactory;
import com.garethabrahams.model.General.Password;
import com.garethabrahams.service.General.Impl.PasswordServiceImpl;
import com.garethabrahams.service.General.PasswordService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PasswordServiceImplTest {

    private static PasswordService service;
    private static Password password;
    private static Set<Password> passwordSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        passwordSet = service.getAll();
        Assert.assertNotNull(passwordSet);
    }

    @Test
    public void create() {
        service = PasswordServiceImpl.getPasswordService();

        password = PasswordFactory.createPassword("123456");

        passwordSet.add(service.create(password));
        Assert.assertEquals("123456",service.read(password.getPassword()).getPassword());
    }

    @Test
    public void read() {
        Assert.assertEquals("123456",service.read(password.getPassword()).getPassword());
    }

    @Test
    public void update() {
        String newPassword = "654321";
        System.out.println("before update, name = "+password.getPassword());
        Password updated = new Password.Builder().copy(password).Password(newPassword).build();
        System.out.println("After update(update), name = "+updated.getPassword());
        this.service.update(updated);
        Assert.assertSame(newPassword,updated.getPassword());
    }


    @Test
    public void delete() {
        service.delete(password.getPassword());
        Assert.assertNotNull(passwordSet);
    }
}