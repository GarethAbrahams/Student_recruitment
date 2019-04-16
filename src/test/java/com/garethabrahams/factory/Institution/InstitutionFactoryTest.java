package com.garethabrahams.factory.Institution;

import com.garethabrahams.factory.Institution.InstitutionFactory;
import com.garethabrahams.model.Institution.Institution;
import org.junit.Assert;
import org.junit.Test;

public class InstitutionFactoryTest {

    @Test
    public void createInstitution() {
        Institution institution = InstitutionFactory.createInstitution("CPUT", "Cape Town");
        Assert.assertEquals("CPUT",institution.getInstitutionName());
    }
}