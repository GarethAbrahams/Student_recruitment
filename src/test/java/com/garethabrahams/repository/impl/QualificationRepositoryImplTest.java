package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.QualificationFactory;
import com.garethabrahams.model.Qualification;
import com.garethabrahams.repository.QualificationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class QualificationRepositoryImplTest {

    private static QualificationRepository repository;
    private static Qualification qualification;
    private String id;

    @Before
    @Test
    public void create() {
        repository = QualificationRepositoryImpl.getRepository();

        qualification = QualificationFactory.createQualification("ICT","2015","CPUT");
        id = qualification.getQualificationID();
        Qualification result = repository.create(qualification);
        Assert.assertEquals(id,result.getQualificationID());
    }

    @Test
    public void getAll() {
        Set<Qualification> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Qualification result = repository.read(id);
        String newQual = "SQL";
        Qualification newQualification = new Qualification.Builder().copy(result).qualificationName(newQual).build();
        Qualification newRead = repository.update(newQualification);

        Assert.assertEquals(id,newRead.getQualificationID());
        Assert.assertEquals(newQual,newRead.getQualificationName());
    }

    @Test
    public void delete() {
        Qualification result = repository.read(id);
        repository.delete(id);
        Qualification newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Qualification result = repository.read(id);
        Assert.assertEquals(id,result.getQualificationID());
    }
}