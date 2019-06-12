package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantContactFactory;
import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.repository.Applicant.ApplicantContactRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantContactRepositoryImpl;
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
public class ApplicantContactRepositoryImplTest {
    @Autowired
    private static ApplicantContactRepository repository;
    private static ApplicantContact contact;
    private String cellphone;

    @Test
    public void create() throws IOException {

        repository = ApplicantContactRepositoryImpl.getRepository();

        contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
        ApplicantContact result = repository.create(contact);
        cellphone = result.getCellphone();
        Assert.assertEquals(contact.getCellphone(),result.getCellphone());
    }

    @Test
    public void update() throws IOException {
        create();
        ApplicantContact result = repository.read(cellphone);
        System.out.println("before update, name = "+result.getCellphone());

        String newCellphone = "0836543214";
        ApplicantContact updated = new ApplicantContact.Builder().copy(result).cellphone(newCellphone).build();
        System.out.println("After update(update), name = "+updated.getCellphone());
        this.repository.update(updated);
        Assert.assertSame(newCellphone,updated.getCellphone());
    }

    @Test
    public void delete() throws IOException {
        create();
        ApplicantContact result = repository.read(cellphone);
        repository.delete(cellphone);
        Assert.assertEquals(cellphone,repository.read("0821234568").getCellphone());

    }

    @Test
    public void read() throws IOException {
        create();
        ApplicantContact result = repository.read(cellphone);
        Assert.assertEquals(result.getCellphone(),cellphone);
    }
}