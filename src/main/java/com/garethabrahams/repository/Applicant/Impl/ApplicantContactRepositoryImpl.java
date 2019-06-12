package com.garethabrahams.repository.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.repository.Applicant.ApplicantContactRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("ApplicantContactRepository")
public class ApplicantContactRepositoryImpl implements ApplicantContactRepository {

    private static ApplicantContactRepositoryImpl repository = null;
    private Set<ApplicantContact> applicantContact;

    //HashSet - Store in memory
    private ApplicantContactRepositoryImpl(){
        this.applicantContact = new HashSet<>();
    }

    public static ApplicantContactRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantContactRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantContact> getAll() {
        return this.applicantContact;
    }

    @Override
    public ApplicantContact create(ApplicantContact e) {
        this.applicantContact.add(e);
        return e;
    }

    @Override
    public ApplicantContact update(ApplicantContact e) {

        ApplicantContact addressOld = ApplicantContactSearch(e.getCellphone());
        if (addressOld != null){
            ApplicantContact ContactNew = new ApplicantContact.Builder()
                    .copy(addressOld)
                    .build();
            return create(ContactNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
            this.applicantContact.remove(s);
    }

    @Override
    public ApplicantContact read(String s) {

        return ApplicantContactSearch(s);
    }

    public ApplicantContact ApplicantContactSearch(final String value){
        for (ApplicantContact contact: this.applicantContact){
            if (contact.getCellphone().equals(value))
                return contact;
        }
        return null;
    }
}
