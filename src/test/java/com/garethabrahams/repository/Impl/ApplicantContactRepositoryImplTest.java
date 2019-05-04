package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.ApplicantContactFactory;
import com.garethabrahams.model.ApplicantContact;
import com.garethabrahams.repository.ApplicantContactRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ApplicantContactRepositoryImplTest {

    private static ApplicantContactRepository applicantcontactRepository;
    private static ApplicantContact contact;
    private static Set<ApplicantContact> ContactSet = new HashSet<>();

    @Test
    public void create() {

        applicantcontactRepository = ApplicantContactRepositoryImpl.getRepository();

        contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");

        ContactSet.add(applicantcontactRepository.create(contact));

        Assert.assertEquals(contact.getCellphone(),applicantcontactRepository.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void update() {
        create();
        ApplicantContact con = applicantcontactRepository.update(contact);
        Assert.assertEquals(con.getCellphone(),contact.getCellphone());
    }

    @Test
    public void delete() {
        create();
        ApplicantContact con = applicantcontactRepository.read(contact.getCellphone());
        applicantcontactRepository.delete(contact.getCellphone());
        Assert.assertEquals(con,applicantcontactRepository.read("0821234568"));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(contact.getCellphone(),applicantcontactRepository.read("0821234568").getCellphone());
    }
}