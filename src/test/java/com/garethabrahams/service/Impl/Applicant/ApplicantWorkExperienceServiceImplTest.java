package com.garethabrahams.service.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import com.garethabrahams.service.Applicant.ApplicantWorkExperienceService;
import com.garethabrahams.service.Applicant.Impl.ApplicantWorkExperienceServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicantWorkExperienceServiceImplTest {

    private static ApplicantWorkExperienceService service;
    private static ApplicantWorkExperience workExperience;
    private static Set<ApplicantWorkExperience> workExperienceSet = new HashSet<>();

    @Test
    public void getAll() {
        workExperienceSet = service.getAll();
        Assert.assertNotNull(workExperienceSet);
    }

    @Test
    public void create() {
        service = ApplicantWorkExperienceServiceImpl.getApplicantWorkExperienceService();
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        workExperience = ApplicantWorkExperienceFactory.createWorkExperience("Korbitec","Newlands","2 years","developer",city);
        workExperienceSet.add(service.create(workExperience));
        Assert.assertEquals("Korbitec",service.read(workExperience.getCompany()).getCompany());
    }

    @Test
    public void read() {
        System.out.println(service.read(workExperience.getCompany()).getCompany());
        Assert.assertEquals("Korbitec",service.read(workExperience.getCompany()).getCompany());

    }

    @Test
    public void update() {
        String newWorkExperience = "LexisNexis";
        System.out.println("before update, name = "+workExperience.getCompany());
        ApplicantWorkExperience updated = new ApplicantWorkExperience.Builder().copy(workExperience).company(newWorkExperience).build();
        System.out.println("After update(update), name = "+updated.getCompany());
        this.service.update(updated);
        Assert.assertSame(newWorkExperience,updated.getCompany());
    }

    @Test
    public void delete() {
        service.delete(workExperience.getCompany());
        workExperienceSet = service.getAll();
        Assert.assertNotNull(workExperienceSet);
    }
}