package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Institution;
import com.garethabrahams.service.InstitutionService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class InstitutionServiceImplTest {
    private static InstitutionService service;
    private static Institution institution;
    private static Set<Institution> institutionSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        institutionSet = service.getAll();
        Assert.assertNotNull(institutionSet);
    }

    @Test
    public void create() {
        service = InstitutionServiceImpl.getInstitutionService();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        institution = InstitutionFactory.createInstitution("CPUT",city);

        institutionSet.add(service.create(institution));

        Assert.assertEquals("CPUT",service.read(institution.getInstitutionName()).getInstitutionName());
    }

    @Test
    public void read() {
        Assert.assertEquals("CPUT",service.read(institution.getInstitutionName()).getInstitutionName());
    }

    @Test
    public void update() {
        String newInstitution = "DevOps";
        System.out.println("before update, name = "+institution.getInstitutionName());
        Institution updated = new Institution.Builder().copy(institution).institutionName(newInstitution).build();
        System.out.println("After update(update), name = "+updated.getInstitutionName());
        this.service.update(updated);
        Assert.assertSame(newInstitution,updated.getInstitutionName());
    }

    @Test
    public void delete() {
        service.delete(institution.getInstitutionName());
        Assert.assertNotNull(institutionSet);
    }
}