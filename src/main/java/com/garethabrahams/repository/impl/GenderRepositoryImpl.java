//package com.garethabrahams.repository.impl;
//
//import com.garethabrahams.model.Email;
//import com.garethabrahams.model.Gender;
//import com.garethabrahams.repository.EmailRepository;
//import com.garethabrahams.repository.GenderRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class GenderRepositoryImpl implements GenderRepository {
//
//    private static GenderRepositoryImpl repository = null;
//    private Set<Gender> genderSet;
//
//    private GenderRepositoryImpl(){
//        this.genderSet = new HashSet<>();
//    }
//
//    public static GenderRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new GenderRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<Gender> getAll() {
//        return this.genderSet;
//    }
//
//    @Override
//    public Gender create(Gender e) {
//        this.genderSet.add(e);
//        return e;
//    }
//
//    @Override
//    public Gender update(Gender e) {
//        Gender oldResult = read(e.getId());
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
//        Gender result = read(e);
//        this.genderSet.remove(result);
//    }
//
//    @Override
//    public Gender read(String e) {
//        for (Gender gender : this.genderSet){
//            if (gender.getId().equals(e))
//                return gender;
//        }
//        return null;
//    }
//}
