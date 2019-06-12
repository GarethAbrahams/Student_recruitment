package com.garethabrahams.controller;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.factory.Staff.*;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.Staff.*;
import org.junit.Before;
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
public class StaffControllerTest {

    @Autowired
    private TestRestTemplate restTemple;
    private String baseURL="http://localhost:8080/applicant";
    private Staff staff;

    @Before
    public void StaffCreate(){
        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);
        staff = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);
    }


    @Test
    public void create() {
        StaffCreate();
        HttpHeaders header = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,header);
        ResponseEntity<Staff> postResponse = restTemple.postForEntity(baseURL+"/create",staff,Staff.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.print(staff.getEmployeeID()+" - ");
        System.out.print(postResponse.getBody());
    }

    @Test
    public void read() {
        StaffCreate();
        Staff staff = restTemple.getForObject(baseURL+"/applicant/1",Staff.class);
        System.out.println(staff.getId());
        assertNotNull(staff);
    }

    @Test
    public void update() {
        int id = 1;
        Staff staff = restTemple.getForObject(baseURL+"/applicant/"+id,Staff.class);

        restTemple.put(baseURL+"/applicants/"+id,staff);

        Staff updateStaff = restTemple.getForObject(baseURL+"/Applicant/"+id, Staff.class);
        assertNotNull(updateStaff);
    }

    @Test
    public void delete() {
        int id = 2;
        Staff staff = restTemple.getForObject(baseURL+"/applicants/"+id,Staff.class);
        assertNotNull(staff);
        restTemple.delete(baseURL+"/applicants/"+id);

        try{
            staff = restTemple.getForObject(baseURL+"/applicants/"+id, Staff.class);
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