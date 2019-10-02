//package com.garethabrahams.repository.bridge.Impl;
//
//import com.garethabrahams.model.bridge.ApplicantOutcome;
//import com.garethabrahams.model.bridge.ApplicantQualification;
//import com.garethabrahams.repository.bridge.ApplicantOutcomeRepository;
//import com.garethabrahams.repository.bridge.ApplicantQualificationRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ApplicantQualificationRepositoryImpl implements ApplicantQualificationRepository {
//
//    private static ApplicantQualificationRepositoryImpl repository = null;
//    private Set<ApplicantQualification> applicantQualificationSet;
//
//    private ApplicantQualificationRepositoryImpl(){
//        this.applicantQualificationSet = new HashSet<>();
//    }
//
//    public static ApplicantQualificationRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new ApplicantQualificationRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<ApplicantQualification> getAll() {
//        return this.applicantQualificationSet;
//    }
//
//    @Override
//    public ApplicantQualification create(ApplicantQualification e) {
//        this.applicantQualificationSet.add(e);
//        return e;
//    }
//
//    @Override
//    public ApplicantQualification update(ApplicantQualification e) {
//        ApplicantQualification oldAdd = read(e.getApplicantID());
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
//        ApplicantQualification result = read(e);
//        this.applicantQualificationSet.remove(result);
//    }
//
//    @Override
//    public ApplicantQualification read(String e) {
//        for (ApplicantQualification applicantQualification : this.applicantQualificationSet){
//            if (applicantQualification.getApplicantID().equals(e))
//                return applicantQualification;
//        }
//        return null;
//    }
//}
