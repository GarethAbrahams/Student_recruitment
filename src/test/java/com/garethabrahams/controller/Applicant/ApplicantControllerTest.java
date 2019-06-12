package com.garethabrahams.controller.Applicant;

import com.garethabrahams.factory.Applicant.*;
import com.garethabrahams.model.Applicant.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class ApplicantControllerTest {

    @Autowired
    private TestRestTemplate restTemple;
    private String baseURL="http://localhost:8080/applicant";
    private Applicant applicant;

    @Before
    public void applicantCreation(){
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
        ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        applicant = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980", address, contact, email);
    }

    @Test
    public void create() {
        applicantCreation();

        HttpHeaders header = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,header);
        ResponseEntity<Applicant> postResponse = restTemple.postForEntity(baseURL+"/create",applicant,Applicant.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.print(applicant.getId()+" - ");
        System.out.print(postResponse.getBody());

    }

    @Test
    public void read() {
        applicantCreation();
        Applicant applicant = restTemple.getForObject(baseURL+"/applicant/1",Applicant.class);
        System.out.println(applicant.getId());
        assertNotNull(applicant);

    }
    //@Ignore
    @Test
    public void update() {
        int id = 1;
        Applicant applicant = restTemple.getForObject(baseURL+"/applicant/"+id,Applicant.class);

        restTemple.put(baseURL+"/applicants/"+id,applicant);

        Applicant updateApplicant = restTemple.getForObject(baseURL+"/Applicant/"+id, Applicant.class);
        assertNotNull(updateApplicant);
    }

    @Test
    public void delete() {
        int id = 2;
        Applicant applicant = restTemple.getForObject(baseURL+"/applicants/"+id,Applicant.class);
        assertNotNull(applicant);
        restTemple.delete(baseURL+"/applicants/"+id);

        try{
            applicant = restTemple.getForObject(baseURL+"/applicants/"+id, Applicant.class);
        } catch (final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void getAll() {
        HttpHeaders header = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null,header);
        ResponseEntity<String> response = restTemple.exchange(baseURL + "/read/all", HttpMethod.GET,entity,String.class);

        assertNotNull(response.getBody());
    }
}