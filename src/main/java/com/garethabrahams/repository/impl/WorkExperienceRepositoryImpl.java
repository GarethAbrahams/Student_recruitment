//package com.garethabrahams.repository.impl;
//
//import com.garethabrahams.model.UserDetails;
//import com.garethabrahams.model.WorkExperience;
//import com.garethabrahams.repository.UserDetailsRepository;
//import com.garethabrahams.repository.WorkExperienceRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class WorkExperienceRepositoryImpl implements WorkExperienceRepository {
//
//    private static WorkExperienceRepositoryImpl repository = null;
//    private Set<WorkExperience> workExperienceSet;
//
//    private WorkExperienceRepositoryImpl(){
//        this.workExperienceSet = new HashSet<>();
//    }
//
//    public static WorkExperienceRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new WorkExperienceRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<WorkExperience> getAll() {
//        return this.workExperienceSet;
//    }
//
//    @Override
//    public WorkExperience create(WorkExperience e) {
//        this.workExperienceSet.add(e);
//        return e;
//    }
//
//    @Override
//    public WorkExperience update(WorkExperience e) {
//        WorkExperience oldResult = read(e.getWorkID());
//        if(oldResult != null) {
//            delete(oldResult.getWorkID());
//            create(e);
//            return e;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String e) {
//        WorkExperience result = read(e);
//        this.workExperienceSet.remove(result);
//    }
//
//    @Override
//    public WorkExperience read(String e) {
//        for (WorkExperience result : this.workExperienceSet){
//            if (result.getWorkID().equals(e))
//                return result;
//        }
//        return null;
//    }
//}
