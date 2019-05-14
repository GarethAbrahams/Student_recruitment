package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Department;
import com.garethabrahams.repository.DepartmentRepository;
import com.garethabrahams.repository.Impl.DepartmentRepositoryImpl;
import com.garethabrahams.service.DepartmentService;

import java.util.Set;

public class DepartmentServiceImpl implements DepartmentService {

    private static DepartmentService service = null;
    private DepartmentRepository repository;

    private DepartmentServiceImpl(){

        this.repository = DepartmentRepositoryImpl.getRepository();
    }

    public static DepartmentService getDepartmentService(){
        if (service==null)
            service = new DepartmentServiceImpl();
        return service;
    }

    @Override
    public Set<Department> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Department create(Department e) {
        return this.repository.create(e);
    }

    @Override
    public Department read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Department update(Department e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
