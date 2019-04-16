package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.Facalty;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FacaltyFactoryTest {

    @Test
    public void createFacalty() {
        Facalty facalty = FacaltyFactory.createFacalty("ICT");
        Assert.assertEquals("ICT",facalty.getFacaltyName());
    }
}