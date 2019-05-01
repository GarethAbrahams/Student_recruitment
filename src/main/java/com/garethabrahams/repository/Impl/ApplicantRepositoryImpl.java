package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.repository.ApplicantRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantRepositoryImpl implements ApplicantRepository {

    private static ApplicantRepositoryImpl repository = null;
    private Set<Applicant> applicants;

    //HashSet - Store in memory
    private ApplicantRepositoryImpl() {

        this.applicants = new HashSet<>();
    }

    public static ApplicantRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantRepositoryImpl();

        return repository;
    }

    @Override
    public Set<Applicant> getAll()
    {
        return this.applicants;
    }

    @Override
    public Applicant create(Applicant applicant) {
        this.applicants.add(applicant);
        return applicant;
    }

    @Override
    public Applicant update(Applicant applicant) {
        Applicant applicantOld = ApplicantSearch(applicant.getId());
        if (applicantOld != null){
            Applicant ApplicantNew = new Applicant.Builder()
                    .copy(applicantOld)
                    .build();
            return create(ApplicantNew);
        }
        return null;
    }

    @Override
    public void delete(String a) {
        this.applicants.remove(a);
    }

    @Override
    public Applicant read(final String a) {
        return ApplicantSearch(a);
    }

    public Applicant ApplicantSearch(final String applicantID){
        for (Applicant applicant: this.applicants){
            if (applicant.getId().equals(applicantID))
                return applicant;
        }
        return null;
    }
}
