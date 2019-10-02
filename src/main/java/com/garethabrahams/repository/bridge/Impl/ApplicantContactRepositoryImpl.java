//package com.garethabrahams.repository.bridge.Impl;
//
//import com.garethabrahams.model.bridge.ApplicantAddress;
//import com.garethabrahams.model.bridge.ApplicantContact;
//import com.garethabrahams.repository.bridge.ApplicantAddressRepository;
//import com.garethabrahams.repository.bridge.ApplicantContactRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ApplicantContactRepositoryImpl implements ApplicantContactRepository {
//
//    private static ApplicantContactRepositoryImpl repository = null;
//    private Set<ApplicantContact> applicantContactSet;
//
//    private ApplicantContactRepositoryImpl(){
//        this.applicantContactSet = new HashSet<>();
//    }
//
//    public static ApplicantContactRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new ApplicantContactRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<ApplicantContact> getAll() {
//        return this.applicantContactSet;
//    }
//
//    @Override
//    public ApplicantContact create(ApplicantContact e) {
//        this.applicantContactSet.add(e);
//        return e;
//    }
//
//    @Override
//    public ApplicantContact update(ApplicantContact e) {
//        ApplicantContact oldAdd = read(e.getApplicantID());
//        if(oldAdd != null) {
//            delete(oldAdd.getApplicantID());
//            create(e);
//            return e;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String e) {
//        ApplicantContact result = read(e);
//        this.applicantContactSet.remove(result);
//    }
//
//    @Override
//    public ApplicantContact read(String e) {
//        for (ApplicantContact applicantContact : this.applicantContactSet){
//            if (applicantContact.getApplicantID().equals(e))
//                return applicantContact;
//        }
//        return null;
//    }
//}
