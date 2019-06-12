package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.repository.General.FacaltyRepository;
import com.garethabrahams.repository.General.Impl.FacaltyRepositoryImpl;
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
public class FacaltyRepositoryImplTest {
    @Autowired
    private static FacaltyRepository repository;
    private static Facalty facalty;
    private String localFacalty;

    @Test
    public void create() throws IOException {
        repository = FacaltyRepositoryImpl.getRepository();

        facalty = FacaltyFactory.createFacalty("ICT");
        Facalty result = repository.create(facalty);
        localFacalty = result.getFacaltyName();
        Assert.assertEquals(localFacalty,result.getFacaltyName());
    }

    @Test
    public void update() throws IOException {
        create();
        Facalty dept = repository.read(localFacalty);
        System.out.println("before update, name = " + dept.getFacaltyName());
        String newFacaltyName = "BCom";
        Facalty updated = new Facalty.Builder().copy(dept).facaltyName(newFacaltyName).build();
        System.out.println("After update(update), name = "+updated.getFacaltyName());
        this.repository.update(updated);

        Assert.assertSame(newFacaltyName,updated.getFacaltyName());
    }

    @Test
    public void delete() throws IOException {
        create();
        Facalty dept = repository.read(localFacalty);
        repository.delete(localFacalty);
        Assert.assertEquals(localFacalty,dept.getFacaltyName());
    }

    @Test
    public void read() throws IOException {
        create();
        Facalty result = repository.read(localFacalty);
        Assert.assertEquals(localFacalty,result.getFacaltyName());
    }
}