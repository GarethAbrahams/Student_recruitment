package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import com.garethabrahams.repository.Applicant.ApplicantWorkExperienceRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantWorkExperienceRepositoryImpl;
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
public class ApplicantWorkExperienceRepositoryImplTest {
    @Autowired
    private static ApplicantWorkExperienceRepository repository;
    private static ApplicantWorkExperience workExperience;
    private String work;

    @Test
    public void create() throws IOException {
        repository = ApplicantWorkExperienceRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        workExperience = ApplicantWorkExperienceFactory.createWorkExperience("CPUT","CPT","5 years","developer",city);

        ApplicantWorkExperience result = repository.create(workExperience);
        work = result.getCompany();
        Assert.assertEquals(work,result.getCompany());

    }

    @Test
    public void update() throws IOException {
        create();
        ApplicantWorkExperience result = repository.read(work);
        System.out.println("before update, name = " + result.getCompany());

        String newCompany = "Sharp";
        ApplicantWorkExperience updated = new ApplicantWorkExperience.Builder().copy(result).company(newCompany).build();
        System.out.println("After update(update), name = "+updated.getCompany());
        this.repository.update(updated);
        Assert.assertSame(newCompany,updated.getCompany());
    }

    @Test
    public void delete() throws IOException {
        create();
        ApplicantWorkExperience result = repository.read(work);
        repository.delete(work);
        Assert.assertEquals(result,repository.read(work));
    }

    @Test
    public void read() throws IOException {
        create();
        ApplicantWorkExperience result = repository.read(work);
        Assert.assertEquals(work,result.getCompany());
    }
}