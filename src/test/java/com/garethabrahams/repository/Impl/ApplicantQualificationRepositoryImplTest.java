package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantQualificationFactory;
import com.garethabrahams.factory.CourseFactory;
import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantQualification;
import com.garethabrahams.model.Course;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.model.Institution;
import com.garethabrahams.repository.ApplicantQualificationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
        ApplicantQualification qual = applicantQualificationRepository.update(qualification);
        Assert.assertEquals(qual.getCourse().getCourseName(),qualification.getCourse().getCourseName());
    }

    @Test
    public void delete() {
        ApplicantQualification qual = applicantQualificationRepository.read(qualification.getQualificationName());
        applicantQualificationRepository.delete(qual.getQualificationName());
        Assert.assertEquals(qual.getQualificationName(),applicantQualificationRepository.read("AppDev").getQualificationName());
    }

    @Test
    public void read() {
        Assert.assertEquals(qualification.getCourse().getCourseName(),applicantQualificationRepository.read(qualification.getQualificationName()).getCourse().getCourseName());

    }
}