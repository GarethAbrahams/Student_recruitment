package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.General.Institution;
import com.garethabrahams.repository.General.Impl.InstitutionRepositoryImpl;
import com.garethabrahams.repository.General.InstitutionRepository;
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
public class InstitutionRepositoryImplTest {
    @Autowired
    private static InstitutionRepository repository;
    private static Institution institution;
    private String localInst;

    @Test
    public void create() throws IOException {
        repository = InstitutionRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        institution = InstitutionFactory.createInstitution("CPUT",city);
        Institution result = repository.create(institution);
        localInst = result.getInstitutionName();

        Assert.assertEquals(localInst,result.getInstitutionName());
    }

    @Test
    public void update() throws IOException {
        create();
        Institution result = repository.read(localInst);
        System.out.println("before update, name = " + result.getInstitutionName());
        String newInstName = "UWC";
        Institution updated = new Institution.Builder().copy(result).institutionName(newInstName).build();
        System.out.println("After update(update), name = "+updated.getInstitutionName());
        this.repository.update(updated);

        Assert.assertSame(newInstName,updated.getInstitutionName());
    }

    @Test
    public void delete() throws IOException {
        create();
        Institution result = repository.read(localInst);
        repository.delete(localInst);
        Assert.assertEquals(result,repository.read(localInst));

    }

    @Test
    public void read() throws IOException {
        create();
        Institution result = repository.read(localInst);
        Assert.assertEquals(localInst,result.getInstitutionName());
    }
}