package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.StaffContact;
import com.garethabrahams.repository.StaffContactRepository;

import java.util.HashSet;
import java.util.Set;

public class StaffContactRepositoryImpl implements StaffContactRepository {
    private static StaffContactRepositoryImpl repository = null;
    private Set<StaffContact> contactSet;

    //HashSet - Store in memory
    private StaffContactRepositoryImpl() {

        this.contactSet = new HashSet<>();
    }

    public static StaffContactRepositoryImpl getRepository(){
        if(repository==null)
            repository = new StaffContactRepositoryImpl();

        return repository;
    }

    public StaffContact contactSearch(final String cell){
        for (StaffContact contact: this.contactSet){
            if (contact.getCellphone().equals(cell))
                return contact;
        }
        return null;
    }

    @Override
    public Set<StaffContact> getAll() {
        return this.contactSet;
    }

    @Override
    public StaffContact create(StaffContact e) {
        this.contactSet.add(e);
        return e;
    }

    @Override
    public StaffContact update(StaffContact e) {
        StaffContact contactOld = contactSearch(e.getCellphone());
        if (contactOld != null){
            StaffContact contactNew = new StaffContact.Builder()
                    .copy(e)
                    .build();
            return create(contactNew);
        }
        return null;    }

    @Override
    public void delete(String s) {
        this.contactSet.remove(s);
    }

    @Override
    public StaffContact read(String s) {
        return contactSearch(s);
    }
}
