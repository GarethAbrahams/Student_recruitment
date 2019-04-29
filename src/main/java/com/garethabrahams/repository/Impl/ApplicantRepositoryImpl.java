package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.repository.ApplicantRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantRepositoryImpl implements ApplicantRepository {

    private static ApplicantRepositoryImpl repository = null;
    private Set<Applicant> applicants;

    public ApplicantRepositoryImpl() {
        this.applicants = new HashSet<>();
    }

    @Override
    public Set<Applicant> getAll() {
        return this.applicants;
    }

    @Override
    public Applicant create(Applicant applicant) {
        this.applicants.add(applicant);
        return applicant;
    }

    @Override
    public Applicant update(Applicant applicant) {
        return null;
    }

    @Override
    public void delete(String a) {

    }

    @Override
    public Applicant read(String a) {
        return null;
    }
}
