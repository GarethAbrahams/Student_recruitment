package com.garethabrahams.factory;

import com.garethabrahams.model.Outcome;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OutcomeFactoryTest {

    @Test
    public void createOutcome() {
        Outcome result = OutcomeFactory.createOutcome("Passed");
        String id = result.getId();

        Assert.assertEquals(id,result.getId());
    }
}