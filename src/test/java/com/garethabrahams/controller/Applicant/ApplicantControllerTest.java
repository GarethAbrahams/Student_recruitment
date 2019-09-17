package com.garethabrahams.controller.Applicant;

import com.garethabrahams.factory.Applicant.*;
import com.garethabrahams.model.Applicant.*;
import javafx.scene.effect.Light;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
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
    private String ID;

    @Before
    public void applicantCreation(){
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
        ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        applicant = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980", address, contact, email);
        ID = applicant.getId();
    }

    @Test
    public void create() {
        applicantCreation();
        ResponseEntity<Applicant> result = restTemple.withBasicAuth("admin", "admin")
                .postForEntity(baseURL+"/create/",applicant,Applicant.class);
        assertNotNull(result);
        assertNotNull(result.getBody());
        System.out.print(applicant.getId()+" - ");
        System.out.print(result.getBody());
    }

    @Test
    public void read() {
        applicantCreation();
        Applicant applicant = restTemple.getForObject(baseURL+"/read/"+ID,Applicant.class);
        System.out.println(applicant.getId());
        assertNotNull(applicant);

    }
    //@Ignore
    @Test
    public void update() {
        Applicant applicant = restTemple.getForObject(baseURL+"/read/"+ID,Applicant.class);
        Applicant newApplicant = new Applicant.Builder()
                .copy(applicant)
                .surname("Schippers")
                .build();
        System.out.println(newApplicant.toString());

        //Applicant updateApplicant = restTemple.getForObject(baseURL+"/read/"+id, Applicant.class);
        assertNotNull(newApplicant);
    }

    @Test
    public void delete() {
        Applicant applicant = restTemple.getForObject(baseURL+"/read/"+ID,Applicant.class);
        assertNotNull(applicant);
        restTemple.delete(baseURL+"/delete/"+ID);

        try{
            applicant = restTemple.getForObject(baseURL+"/read/"+ID, Applicant.class);
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