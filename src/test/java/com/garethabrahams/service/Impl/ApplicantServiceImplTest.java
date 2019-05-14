package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.*;
import com.garethabrahams.model.*;
import com.garethabrahams.repository.ApplicantRepository;
import com.garethabrahams.repository.Impl.ApplicantRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantServiceImplTest {

    private ApplicantRepositoryImpl repository;
    private Applicant applicant;

    private Applicant getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.repository = ApplicantRepositoryImpl.getRepository();
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
        ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        this.applicant = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980", address, contact, email);
    }

    @Test
    public void create() {
        Applicant created = this.repository.create(this.applicant);
        System.out.println("In create, create = "+created.getName()+" "+created.getSurname());
        Assert.assertNotNull(created);
        Assert.assertSame(created,this.applicant);
    }

    @Test
    public void read() {
        Applicant saved = getSaved();
        Applicant read = this.repository.read(saved.getId());
        System.out.println("In read, read = "+read.getName()+" "+read.getSurname());
        Assert.assertSame(read,saved);
    }

    @Test
    public void update() {
        Applicant saved = getSaved();
        String newApplicantName = "Tammy";
        System.out.println("before update, name = "+saved.getName()+" "+saved.getSurname());
        Applicant updated = new Applicant.Builder().copy(getSaved()).name(newApplicantName).build();
        System.out.println("After update, name = "+updated.getName()+" "+updated.getSurname());
        this.repository.update(updated);
        Assert.assertSame(newApplicantName,updated.getName());

    }

    @Test
    public void delete() {
        Applicant saved = getSaved();
        this.repository.delete(saved.getId());
        getAll();
    }

    @Test
    public void getAll(){
        Set<Applicant> applicants = this.repository.getAll();
        System.out.println("In getAll, all = "+applicants);
    }
}