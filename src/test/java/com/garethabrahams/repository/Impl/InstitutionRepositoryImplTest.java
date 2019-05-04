package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Institution;
import com.garethabrahams.repository.InstitutionRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class InstitutionRepositoryImplTest {
    private static InstitutionRepository institutionRepository;
    private static Institution institution;
    private static Set<Institution> institutionSet = new HashSet<>();

    @Test
    public void create() {
        institutionRepository = InstitutionRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        institution = InstitutionFactory.createInstitution("CPUT",city);

        institutionSet.add(institutionRepository.create(institution));

        Assert.assertEquals("CPUT",institutionRepository.read(institution.getInstitutionName()).getInstitutionName());
    }

    @Test
    public void update() {
        create();
        Institution inst = institutionRepository.update(institution);
        Assert.assertEquals(inst.getInstitutionName(),institution.getInstitutionName());
    }

    @Test
    public void delete() {
        create();
        Institution inst = institutionRepository.read(institution.getInstitutionName());
        institutionRepository.delete(inst.getInstitutionName());
        Assert.assertEquals(inst,institutionRepository.read(institution.getInstitutionName()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("CPUT",institutionRepository.read(institution.getInstitutionName()).getInstitutionName());
    }
}