package com.garethabrahams.factory;

import com.garethabrahams.model.WorkExperience;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkExperienceFactoryTest {

    @Test
    public void createWorkExperience() {
        WorkExperience work = WorkExperienceFactory.createWorkExperience("CPUT","Cape Town","2000","ICT technician",10);
        String id = work.getWorkID();
        Assert.assertEquals(id,work.getWorkID());
    }
}