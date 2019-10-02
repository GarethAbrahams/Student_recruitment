//package com.garethabrahams.repository.impl;
//
//import com.garethabrahams.model.Outcome;
//import com.garethabrahams.model.Qualification;
//import com.garethabrahams.repository.OutcomeRepository;
//import com.garethabrahams.repository.QualificationRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class QualificationRepositoryImpl implements QualificationRepository {
//
//    private static QualificationRepositoryImpl repository = null;
//    private Set<Qualification> qualificationSet;
//
//    private QualificationRepositoryImpl(){
//        this.qualificationSet = new HashSet<>();
//    }
//
//    public static QualificationRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new QualificationRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<Qualification> getAll() {
//        return this.qualificationSet;
//    }
//
//    @Override
//    public Qualification create(Qualification e) {
//        this.qualificationSet.add(e);
//        return e;
//    }
//
//    @Override
//    public Qualification update(Qualification e) {
//        Qualification oldResult = read(e.getQualificationID());
//        if(oldResult != null) {
//            delete(oldResult.getQualificationID());
//            create(e);
//            return e;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String e) {
//        Qualification result = read(e);
//        this.qualificationSet.remove(result);
//    }
//
//    @Override
//    public Qualification read(String e) {
//        for (Qualification result : this.qualificationSet){
//            if (result.getQualificationID().equals(e))
//                return result;
//        }
//        return null;
//    }
//}
