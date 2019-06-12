package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.General.PasswordFactory;
import com.garethabrahams.model.General.Password;
import com.garethabrahams.repository.General.Impl.PasswordRepositoryImpl;
import com.garethabrahams.repository.General.PasswordRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class PasswordRepositoryImplTest {
    @Autowired
    private static PasswordRepository repository;
    private static Password password;
    private String localPassword;

    @Test
    public void create() throws IOException {

        repository = PasswordRepositoryImpl.getRepository();

        password = PasswordFactory.createPassword("123456");
        Password result = repository.create(password);
        localPassword = result.getPassword();
        Assert.assertEquals(localPassword,result.getPassword());
    }

    @Test
    public void update() throws IOException {
        create();
        Password result = repository.read(localPassword);
        System.out.println("before update, name = " + result.getPassword());
        String newPassword = "654321";
        Password updated = new Password.Builder().copy(result).Password(newPassword).build();
        System.out.println("After update(update), name = "+updated.getPassword());
        this.repository.update(updated);

        Assert.assertSame(newPassword,updated.getPassword());
    }

    @Test
    public void delete() throws IOException {
        create();
        Password result = repository.read(localPassword);
        repository.delete(localPassword);
        Assert.assertEquals(result,repository.read(localPassword));
    }

    @Test
    public void read() throws IOException {
        create();
        Password result = repository.read(localPassword);
        Assert.assertEquals(localPassword,result.getPassword());
    }
}