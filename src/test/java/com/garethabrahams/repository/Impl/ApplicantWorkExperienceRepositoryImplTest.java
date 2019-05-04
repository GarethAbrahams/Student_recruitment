package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantWorkExperience;
import com.garethabrahams.repository.ApplicantWorkExperienceRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ApplicantWorkExperienceRepositoryImplTest {
    private static ApplicantWorkExperienceRepository applicantWorkExperienceRepository;
    private static ApplicantWorkExperience workExperience;
    private static Set<ApplicantWorkExperience> WorkSet = new HashSet<>();

    @Test
    public void create() {
        applicantWorkExperienceRepository = ApplicantWorkExperienceRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        workExperience = ApplicantWorkExperienceFactory.createWorkExperience("CPUT","CPT","5 years","developer",city);

        WorkSet.add(applicantWorkExperienceRepository.create(workExperience));

        Assert.assertEquals("CPUT",applicantWorkExperienceRepository.read(workExperience.getCompany()).getCompany());
    }

    @Test
    public void update() {
        create();
        ApplicantWorkExperience work = applicantWorkExperienceRepository.update(workExperience);
        Assert.assertEquals(work.getCompany(),workExperience.getCompany());
    }

    @Test
    public void delete() {
        create();
        ApplicantWorkExperience work = applicantWorkExperienceRepository.read(workExperience.getCompany());
        applicantWorkExperienceRepository.delete(work.getCompany());
        Assert.assertEquals(work,applicantWorkExperienceRepository.read(workExperience.getCompany()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("CPUT",applicantWorkExperienceRepository.read(workExperience.getCompany()).getCompany());
    }
}