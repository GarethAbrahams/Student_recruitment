package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.bridge.ApplicantQualification;
import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.repository.bridge.ApplicantQualificationRepository;
import com.garethabrahams.repository.bridge.ApplicantRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantRaceRepositoryImpl implements ApplicantRaceRepository {

    private static ApplicantRaceRepositoryImpl repository = null;
    private Set<ApplicantRace> applicantRaceSet;

    private ApplicantRaceRepositoryImpl(){
        this.applicantRaceSet = new HashSet<>();
    }

    public static ApplicantRaceRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantRaceRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantRace> getAll() {
        return this.applicantRaceSet;
    }

    @Override
    public ApplicantRace create(ApplicantRace e) {
        this.applicantRaceSet.add(e);
        return e;
    }

    @Override
    public ApplicantRace update(ApplicantRace e) {
        ApplicantRace oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantRace result = read(e);
        this.applicantRaceSet.remove(result);
    }

    @Override
    public ApplicantRace read(String e) {
        for (ApplicantRace applicantRace : this.applicantRaceSet){
            if (applicantRace.getApplicantID().equals(e))
                return applicantRace;
        }
        return null;
    }
}
