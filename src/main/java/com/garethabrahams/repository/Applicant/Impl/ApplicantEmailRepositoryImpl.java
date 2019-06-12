package com.garethabrahams.repository.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.repository.Applicant.ApplicantEmailRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("ApplicantEmailRepository")
public class ApplicantEmailRepositoryImpl implements ApplicantEmailRepository {

    private static ApplicantEmailRepositoryImpl repository = null;
    private Set<ApplicantEmail> applicantsEmail;

    //HashSet - Store in memory
    private ApplicantEmailRepositoryImpl(){
        this.applicantsEmail = new HashSet<>();
    }

    public static ApplicantEmailRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantEmailRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantEmail> getAll() {
        return this.applicantsEmail;
    }

    @Override
    public ApplicantEmail create(ApplicantEmail e) {
        this.applicantsEmail.add(e);
        return e;
    }

    @Override
    public ApplicantEmail update(ApplicantEmail e) {
        ApplicantEmail applicantEmailOld = ApplicantEmailSearch(e.getEmail());
        if (applicantEmailOld != null){
            ApplicantEmail EmailNew = new ApplicantEmail.Builder()
                    .copy(applicantEmailOld)
                    .build();
            return create(EmailNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.applicantsEmail.remove(s);
    }

    @Override
    public ApplicantEmail read(String s) {
        return ApplicantEmailSearch(s);
    }

    public ApplicantEmail ApplicantEmailSearch(final String applicantEmail){
        for (ApplicantEmail Email: this.applicantsEmail){
            if (Email.getEmail().equals(applicantEmail))
                return Email;
        }
        return null;
    }
}
