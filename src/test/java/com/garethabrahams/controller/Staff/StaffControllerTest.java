package com.garethabrahams.controller.Staff;

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
    private String baseURL="http://localhost:8080/Staff";
    private Staff staff;
    private String ID;

    @Before
    public void StaffCreate(){
        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);
        staff = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);
        ID = staff.getEmployeeID();
    }


    @Test
    public void create() {
        StaffCreate();
        ResponseEntity<Staff> result = restTemple.withBasicAuth("admin", "admin")
                .postForEntity(baseURL+"/create/",staff,Staff.class);
        assertNotNull(result);
        assertNotNull(result.getBody());
        System.out.print(staff.getEmployeeID()+" - ");
        System.out.print(result.getBody());
    }

    @Test
    public void read() {
        StaffCreate();
        Staff results = restTemple.getForObject(baseURL+"/read/"+ID,Staff.class);
        System.out.println(results.getId());
        assertNotNull(results);
    }

    @Test
    public void update() {
        Staff staff = restTemple.getForObject(baseURL+"/read/"+ID,Staff.class);
        Staff newStaff = new Staff.Builder()
                .copy(staff)
                .surname("Schippers")
                .build();
        System.out.println(newStaff.toString());

        assertNotNull(newStaff);
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