//package com.garethabrahams.repository.bridge.Impl;
//
//import com.garethabrahams.model.bridge.ApplicantUserDetails;
//import com.garethabrahams.model.bridge.ApplicantWorkExperience;
//import com.garethabrahams.repository.bridge.ApplicantUserDetailsRepository;
//import com.garethabrahams.repository.bridge.ApplicantWorkExperienceRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ApplicantWorkExperienceRepositoryImpl implements ApplicantWorkExperienceRepository {
//
//    private static ApplicantWorkExperienceRepositoryImpl repository = null;
//    private Set<ApplicantWorkExperience> applicantWorkExperienceSet;
//
//    private ApplicantWorkExperienceRepositoryImpl(){
//        this.applicantWorkExperienceSet = new HashSet<>();
//    }
//
//    public static ApplicantWorkExperienceRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new ApplicantWorkExperienceRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<ApplicantWorkExperience> getAll() {
//        return this.applicantWorkExperienceSet;
//    }
//
//    @Override
//    public ApplicantWorkExperience create(ApplicantWorkExperience e) {
//        this.applicantWorkExperienceSet.add(e);
//        return e;
//    }
//
//    @Override
//    public ApplicantWorkExperience update(ApplicantWorkExperience e) {
//        ApplicantWorkExperience oldAdd = read(e.getApplicantID());
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
//        ApplicantWorkExperience result = read(e);
//        this.applicantWorkExperienceSet.remove(result);
//    }
//
//    @Override
//    public ApplicantWorkExperience read(String e) {
//        for (ApplicantWorkExperience applicantWorkExperience : this.applicantWorkExperienceSet){
//            if (applicantWorkExperience.getApplicantID().equals(e))
//                return applicantWorkExperience;
//        }
//        return null;
//    }
//}
