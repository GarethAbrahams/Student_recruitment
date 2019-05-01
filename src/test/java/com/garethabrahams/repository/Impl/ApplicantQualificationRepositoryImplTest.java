package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantQualificationFactory;
import com.garethabrahams.factory.Institution.CourseFactory;
import com.garethabrahams.factory.Institution.FacaltyFactory;
import com.garethabrahams.factory.Institution.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.model.Institution.Course;
import com.garethabrahams.model.Institution.Facalty;
import com.garethabrahams.model.Institution.Institution;
import com.garethabrahams.repository.ApplicantQualificationRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantQualificationRepositoryImplTest {
    private static ApplicantQualificationRepository applicantQualificationRepository;
    private static ApplicantQualification qualification;
    private static Set<ApplicantQualification> QualificationSet = new HashSet<>();

    @Test
    public void create() {
        applicantQualificationRepository = ApplicantQualificationRepositoryImpl.getRepository();

        Facalty Engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("Cape town");
        Institution CPUT = InstitutionFactory.createInstitution("CPUT",cpt);
        Course course = CourseFactory.createCourse("DIP Appdev", Engineering,CPUT);
        qualification = ApplicantQualificationFactory.createApplicantQualification("AppDev","2020",course);

        QualificationSet.add(applicantQualificationRepository.create(qualification));

        Assert.assertEquals(qualification.getCourse(),applicantQualificationRepository.read(qualification.getQualificationName()).getCourse());

    }

    @Test
    public void update() {
        create();
        ApplicantQualification qual = applicantQualificationRepository.update(qualification);
        Assert.assertEquals(qual.getCourse(),qualification.getCourse());
    }

    @Test
    public void delete() {
        create();
        ApplicantQualification qual = applicantQualificationRepository.read(qualification.getQualificationName());
        applicantQualificationRepository.delete(qual.getQualificationName());
        Assert.assertEquals(qual,applicantQualificationRepository.read("AppDev"));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(qualification,applicantQualificationRepository.read("AppDev"));

    }
}