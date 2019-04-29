package com.garethabrahams.factory.Institution;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Institution.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Institution.Institution;
import org.junit.Assert;
import org.junit.Test;

public class InstitutionFactoryTest {

    @Test
    public void createInstitution() {
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        Institution institution = InstitutionFactory.createInstitution("CPUT",city);
        Assert.assertEquals("CPUT",institution.getInstitutionName());
    }
}