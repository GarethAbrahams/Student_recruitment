package com.garethabrahams.factory;

import com.garethabrahams.model.Qualification;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QualificationFactoryTest {

    @Test
    public void createQualification() {

        Qualification qual = QualificationFactory.createQualification("ICT","2015","CPUT");
        String id = qual.getQualificationID();

        Assert.assertEquals(id,qual.getQualificationID());
    }
}