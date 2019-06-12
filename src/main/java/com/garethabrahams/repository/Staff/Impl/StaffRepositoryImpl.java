package com.garethabrahams.repository.Staff.Impl;

import com.garethabrahams.model.Staff.Staff;
import com.garethabrahams.repository.Staff.StaffRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("StaffRepository")
public class StaffRepositoryImpl implements StaffRepository {

    private static StaffRepositoryImpl repository = null;
    private Set<Staff> employees;

    //HashSet - Store in memory
    private StaffRepositoryImpl() {

        this.employees = new HashSet<>();
    }

    public static StaffRepositoryImpl getRepository(){
        if(repository==null)
            repository = new StaffRepositoryImpl();

        return repository;
    }

    public Staff employeeSearch(final String empID){
        for (Staff staff: this.employees){
            if (staff.getEmployeeID().equals(empID))
                return staff;
        }
        return null;
    }

    @Override
    public Set<Staff> getAll() {
        return this.employees;
    }

    @Override
    public Staff create(Staff emp) {
        this.employees.add(emp);
        return emp;
    }

    @Override
    public Staff update(Staff e) {
        Staff staffOld = employeeSearch(e.getEmployeeID());
        if (staffOld != null){
            Staff staffNew = new Staff.Builder()
                    .copy(e)
                    .build();
            return create(staffNew);
        }
        return null;      }

    @Override
    public void delete(String s) {
        this.employees.remove(s);
    }

    @Override
    public Staff read(String s) {
        return employeeSearch(s);
    }
}
