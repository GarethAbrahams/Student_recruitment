package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.*;
import com.garethabrahams.model.Applicant.*;
import com.garethabrahams.repository.Applicant.ApplicantRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantRepositoryImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class ApplicantRepositoryImplTest {
        @Autowired
        private static ApplicantRepository repository;
        private static Applicant gareth;
        private String applicantID;

        @Test
        public void create() throws IOException{

            repository = ApplicantRepositoryImpl.getRepository();

            ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
            ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
            ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
            ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");

            gareth = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980", address, contact, email);
            Applicant result = repository.create(gareth);
            applicantID = result.getId();

            Assert.assertEquals(applicantID,result.getId());

        }

        @Test
        public void update() throws IOException {
            create();
            Applicant applicant = repository.read(applicantID);
            System.out.println("before update, name = "+applicant.getName()+" "+applicant.getSurname());

            String newSurname = "Gates";
            Applicant updated = new Applicant.Builder().copy(applicant).surname(newSurname).build();
            System.out.println("After update(update), name = "+applicant.getName()+" "+applicant.getSurname());
            this.repository.update(updated);
            Assert.assertSame(newSurname,updated.getSurname());
        }

        @Test
        public void delete() throws IOException {
            create();
            Applicant result = repository.read(applicantID);
            repository.delete(applicantID);
            Assert.assertEquals(result,repository.read(applicantID));
        }

        @Test
        public void read() throws IOException {
                create();
                Applicant result = repository.read(applicantID);
                Assert.assertEquals(applicantID,result.getId());

        }
}