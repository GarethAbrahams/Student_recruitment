package com.garethabrahams.service.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantContactFactory;
import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.service.Applicant.ApplicantContactService;
import com.garethabrahams.service.Applicant.Impl.ApplicantContactServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicantContactServiceImplTest {

    private static ApplicantContactService service;
    private static ApplicantContact contact;
    private static Set<ApplicantContact> contactSet = new HashSet<>();

    @Before
    public void createContacts(){
        service = ApplicantContactServiceImpl.getApplicantContactService();

        contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");

    }


    @Test
    public void getAll() {
        contactSet = service.getAll();
        Assert.assertNotNull(contactSet);
    }

    @Test
    public void create() {
        contactSet.add(service.create(contact));
        Assert.assertEquals("0821234568",service.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void read() {
        Assert.assertEquals("0821234568",service.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void update() {
        String newContact = "0836985214";
        System.out.println("before update, name = "+contact.getCellphone());
        ApplicantContact updated = new ApplicantContact.Builder().copy(contact).cellphone(newContact).build();
        System.out.println("After update(update), name = "+updated.getCellphone());
        this.service.update(updated);
        Assert.assertSame(newContact,updated.getCellphone());

    }

    @Test
    public void delete() {
        service.delete(contact.getCellphone());
        contactSet = service.getAll();
        Assert.assertNotNull(contactSet);
    }
}