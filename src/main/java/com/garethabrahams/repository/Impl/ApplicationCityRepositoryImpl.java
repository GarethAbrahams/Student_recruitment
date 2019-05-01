package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.ApplicantCityRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicationCityRepositoryImpl implements ApplicantCityRepository {

    private static ApplicationCityRepositoryImpl repository = null;
    private Set<ApplicantCity> applicantCity;

    //HashSet - Store in memory
    private ApplicationCityRepositoryImpl(){
        this.applicantCity = new HashSet<>();
    }

    public static ApplicationCityRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicationCityRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantCity> getAll() {
        return this.applicantCity;
    }

    @Override
    public ApplicantCity create(ApplicantCity e) {
        this.applicantCity.add(e);
        return e;
    }

    @Override
    public ApplicantCity update(ApplicantCity e) {

        ApplicantCity cityOld = ApplicantCitySearch(e.getCity());
        if (cityOld != null){
            ApplicantCity CityNew = new ApplicantCity.Builder()
                    .copy(cityOld)
                    .build();
            return create(CityNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.applicantCity.remove(s);

    }

    @Override
    public ApplicantCity read(String s) {
        return null;
    }

    public ApplicantCity ApplicantCitySearch(final String value){
        for (ApplicantCity City: this.applicantCity){
            if (City.getCity().equals(value))
                return City;
        }
        return null;
    }
}
