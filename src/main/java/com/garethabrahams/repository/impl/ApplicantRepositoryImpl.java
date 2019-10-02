//package com.garethabrahams.repository.impl;
//
//import com.garethabrahams.model.Address;
//import com.garethabrahams.model.Applicant;
//import com.garethabrahams.repository.AddressRepository;
//import com.garethabrahams.repository.ApplicantRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ApplicantRepositoryImpl implements ApplicantRepository {
//
//    private static ApplicantRepositoryImpl repository = null;
//    private Set<Applicant> applicantSet;
//
//    private ApplicantRepositoryImpl(){
//        this.applicantSet = new HashSet<>();
//    }
//
//    public static ApplicantRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new ApplicantRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<Applicant> getAll() {
//        return this.applicantSet;
//    }
//
//    @Override
//    public Applicant create(Applicant e) {
//        this.applicantSet.add(e);
//        return e;
//    }
//
//    @Override
//    public Applicant update(Applicant e) {
//        Applicant oldResult = read(e.getApplicantID());
//        if(oldResult != null) {
//            delete(oldResult.getApplicantID());
//            Applicant newResult = create(e);
//            return newResult;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String e) {
//        Applicant result = read(e);
//        this.applicantSet.remove(result);
//    }
//
//    @Override
//    public Applicant read(String e) {
//        for (Applicant applicant : this.applicantSet){
//            if (applicant.getApplicantID().equals(e))
//                return applicant;
//        }
//        return null;
//    }
//}
