package com.garethabrahams.factory.General;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.General.Institution;
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