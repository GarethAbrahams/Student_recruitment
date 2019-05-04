package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.StaffCity;
import com.garethabrahams.repository.StaffCityRepository;

import java.util.HashSet;
import java.util.Set;

public class StaffCityRepositoryImpl implements StaffCityRepository {

    private static StaffCityRepositoryImpl repository = null;
    private Set<StaffCity> citySet;

    //HashSet - Store in memory
    private StaffCityRepositoryImpl() {

        this.citySet = new HashSet<>();
    }

    public static StaffCityRepositoryImpl getRepository(){
        if(repository==null)
            repository = new StaffCityRepositoryImpl();

        return repository;
    }

    public StaffCity citySearch(final String c){
        for (StaffCity city: this.citySet){
            if (city.getCity().equals(c))
                return city;
        }
        return null;
    }


    @Override
    public Set<StaffCity> getAll() {
        return this.citySet;
    }

    @Override
    public StaffCity create(StaffCity e) {
        this.citySet.add(e);
        return e;
    }

    @Override
    public StaffCity update(StaffCity e) {
        StaffCity cityOld = citySearch(e.getCity());
        if (cityOld != null){
            StaffCity cityNew = new StaffCity.Builder()
                    .copy(e)
                    .build();
            return create(cityNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.citySet.remove(s);
    }

    @Override
    public StaffCity read(String s) {
        return citySearch(s);
    }
}
