package com.garethabrahams.repository.Impl.Staff;

import com.garethabrahams.factory.Staff.StaffContactFactory;
import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.repository.Staff.Impl.StaffContactRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffContactRepository;
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
public class StaffContactRepositoryImplTest {
    @Autowired
    private static StaffContactRepository repository;
    private static StaffContact contact;
    private String localContact;

    @Test
    public void create() throws IOException {

        repository = StaffContactRepositoryImpl.getRepository();
        contact = StaffContactFactory.createStaffContact("0211234568","0824567895");
        StaffContact result = repository.create(contact);
        localContact = result.getCellphone();
        Assert.assertEquals(localContact,result.getCellphone());
    }

    @Test
    public void update() throws IOException {
        create();
        StaffContact result = repository.read(localContact);
        System.out.println("before update, name = " + result.getCellphone());
        String newCell = "0865213365";
        StaffContact updated = new StaffContact.Builder().copy(result).cellphone(newCell).build();
        System.out.println("After update(update), name = "+updated.getCellphone());
        this.repository.update(updated);

        Assert.assertSame(newCell,updated.getCellphone());
    }

    @Test
    public void delete() throws IOException {
        create();
        StaffContact result = repository.read(localContact);
        repository.delete(localContact);
        Assert.assertEquals(result,repository.read(localContact));
    }

    @Test
    public void read() throws IOException {
        create();
        StaffContact result = repository.read(localContact);
        Assert.assertEquals(localContact,result.getCellphone());
    }
}