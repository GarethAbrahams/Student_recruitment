package com.garethabrahams.factory.General;

import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.model.General.Facalty;
import org.junit.Assert;
import org.junit.Test;

public class FacaltyFactoryTest {

    @Test
    public void createFacalty() {
        Facalty facalty = FacaltyFactory.createFacalty("ICT");
        Assert.assertEquals("ICT",facalty.getFacaltyName());
    }
}