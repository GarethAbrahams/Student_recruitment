package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.repository.General.DepartmentRepository;
import com.garethabrahams.repository.General.Impl.DepartmentRepositoryImpl;
import com.garethabrahams.service.General.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

    private static DepartmentService service = null;

    @Autowired
    @Qualifier("DepartmentRepository")
    private DepartmentRepository repository;

    private DepartmentServiceImpl(){

        repository = DepartmentRepositoryImpl.getRepository();
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
