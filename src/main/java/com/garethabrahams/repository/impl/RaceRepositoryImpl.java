//package com.garethabrahams.repository.impl;
//
//import com.garethabrahams.model.Qualification;
//import com.garethabrahams.model.Race;
//import com.garethabrahams.repository.QualificationRepository;
//import com.garethabrahams.repository.RaceRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class RaceRepositoryImpl implements RaceRepository {
//
//    private static RaceRepositoryImpl repository = null;
//    private Set<Race> raceSet;
//
//    private RaceRepositoryImpl(){
//        this.raceSet = new HashSet<>();
//    }
//
//    public static RaceRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new RaceRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<Race> getAll() {
//        return this.raceSet;
//    }
//
//    @Override
//    public Race create(Race e) {
//        this.raceSet.add(e);
//        return e;
//    }
//
//    @Override
//    public Race update(Race e) {
//        Race oldResult = read(e.getId());
//        if(oldResult != null) {
//            delete(oldResult.getId());
//            create(e);
//            return e;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String e) {
//        Race result = read(e);
//        this.raceSet.remove(result);
//    }
//
//    @Override
//    public Race read(String e) {
//        for (Race result : this.raceSet){
//            if (result.getId().equals(e))
//                return result;
//        }
//        return null;
//    }
//}
