package com.garethabrahams.repository.General.Impl;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.repository.General.DepartmentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("DepartmentRepository")
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private static DepartmentRepositoryImpl repository = null;
    private Set<Department> departments;

    //HashSet - Store in memory
    private DepartmentRepositoryImpl() {

        this.departments = new HashSet<>();
    }

    public static DepartmentRepositoryImpl getRepository(){
        if(repository==null)
            repository = new DepartmentRepositoryImpl();

        return repository;
    }

    public Department departmentSearch(final String d){
        for (Department dept: this.departments){
            if (dept.getDepartment().equals(d))
                return dept;
        }
        return null;
    }

    @Override
    public Set<Department> getAll() {
        return this.departments;
    }

    @Override
    public Department create(Department e) {
        this.departments.add(e);
        return e;
    }

    @Override
    public Department update(Department e) {
        Department deptOld = departmentSearch(e.getDepartment());
        if (deptOld != null){
            Department deptNew = new Department.Builder()
                    .copy(e)
                    .build();
            return create(deptNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.departments.remove(s);
    }

    @Override
    public Department read(String s) {
        return departmentSearch(s);
    }
}
