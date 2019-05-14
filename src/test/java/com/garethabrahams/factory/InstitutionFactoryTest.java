package com.garethabrahams.factory;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Institution;
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