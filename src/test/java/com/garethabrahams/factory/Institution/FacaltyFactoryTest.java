package com.garethabrahams.factory.Institution;

import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.model.Facalty;
import org.junit.Assert;
import org.junit.Test;

public class FacaltyFactoryTest {

    @Test
    public void createFacalty() {
        Facalty facalty = FacaltyFactory.createFacalty("ICT");
        Assert.assertEquals("ICT",facalty.getFacaltyName());
    }
}