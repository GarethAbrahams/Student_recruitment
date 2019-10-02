//package com.garethabrahams.repository.bridge.Impl;
//
//import com.garethabrahams.model.bridge.ApplicantRace;
//import com.garethabrahams.model.bridge.ApplicantRole;
//import com.garethabrahams.repository.bridge.ApplicantRaceRepository;
//import com.garethabrahams.repository.bridge.ApplicantRoleRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ApplicantRoleRepositoryImpl implements ApplicantRoleRepository {
//
//    private static ApplicantRoleRepositoryImpl repository = null;
//    private Set<ApplicantRole> applicantRoleSet;
//
//    private ApplicantRoleRepositoryImpl(){
//        this.applicantRoleSet = new HashSet<>();
//    }
//
//    public static ApplicantRoleRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new ApplicantRoleRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<ApplicantRole> getAll() {
//        return this.applicantRoleSet;
//    }
//
//    @Override
//    public ApplicantRole create(ApplicantRole e) {
//        this.applicantRoleSet.add(e);
//        return e;
//    }
//
//    @Override
//    public ApplicantRole update(ApplicantRole e) {
//        ApplicantRole oldAdd = read(e.getApplicantID());
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
//        ApplicantRole result = read(e);
//        this.applicantRoleSet.remove(result);
//    }
//
//    @Override
//    public ApplicantRole read(String e) {
//        for (ApplicantRole applicantRole : this.applicantRoleSet){
//            if (applicantRole.getApplicantID().equals(e))
//                return applicantRole;
//        }
//        return null;
//    }
//}
